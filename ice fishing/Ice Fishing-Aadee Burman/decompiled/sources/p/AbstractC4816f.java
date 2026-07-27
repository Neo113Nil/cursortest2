package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.C0508b;
import b.InterfaceC0510d;
import java.util.ArrayList;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4816f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0510d f39686a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f39687b;

    public AbstractC4816f(InterfaceC0510d interfaceC0510d, ComponentName componentName) {
        this.f39686a = interfaceC0510d;
        this.f39687b = componentName;
    }

    public static boolean a(Context context, String str, AbstractServiceConnectionC4821k abstractServiceConnectionC4821k) {
        abstractServiceConnectionC4821k.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC4821k, 33);
    }

    public static String b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList<String> arrayList = new ArrayList();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final S0.i c(AbstractC4811a abstractC4811a) {
        BinderC4815e binderC4815e = new BinderC4815e(abstractC4811a);
        InterfaceC0510d interfaceC0510d = this.f39686a;
        try {
            if (((C0508b) interfaceC0510d).e0(binderC4815e)) {
                return new S0.i(interfaceC0510d, binderC4815e, this.f39687b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
