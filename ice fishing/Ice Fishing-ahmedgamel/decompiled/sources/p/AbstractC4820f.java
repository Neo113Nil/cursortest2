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
import b.C0512b;
import b.InterfaceC0514d;
import java.util.ArrayList;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4820f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0514d f39797a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f39798b;

    public AbstractC4820f(InterfaceC0514d interfaceC0514d, ComponentName componentName) {
        this.f39797a = interfaceC0514d;
        this.f39798b = componentName;
    }

    public static boolean a(Context context, String str, AbstractServiceConnectionC4825k abstractServiceConnectionC4825k) {
        abstractServiceConnectionC4825k.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC4825k, 33);
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

    public final S0.i c(AbstractC4815a abstractC4815a) {
        BinderC4819e binderC4819e = new BinderC4819e(abstractC4815a);
        InterfaceC0514d interfaceC0514d = this.f39797a;
        try {
            if (((C0512b) interfaceC0514d).e0(binderC4819e)) {
                return new S0.i(interfaceC0514d, binderC4819e, this.f39798b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
