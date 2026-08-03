package ae;

import ac.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.onesignal.inAppMessages.internal.display.impl.a;
import hc.j;
import java.util.ArrayList;
import m0.d1;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f341g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f342h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f343i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, fc.d dVar, int i10) {
        super(2, dVar);
        this.f341g = i10;
        this.f342h = obj;
        this.f343i = obj2;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f341g) {
            case 0:
                return new c((Context) this.f342h, (e) this.f343i, dVar, 0);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new c((Context) this.f342h, (m5.c) this.f343i, dVar, 1);
            default:
                return new c((m5.c) this.f342h, (d1) this.f343i, dVar, 2);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f341g) {
            case 0:
                c cVar = (c) create(yVar, dVar);
                o oVar = o.f277a;
                cVar.invokeSuspend(oVar);
                return oVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                c cVar2 = (c) create(yVar, dVar);
                o oVar2 = o.f277a;
                cVar2.invokeSuspend(oVar2);
                return oVar2;
            default:
                c cVar3 = (c) create(yVar, dVar);
                o oVar3 = o.f277a;
                cVar3.invokeSuspend(oVar3);
                return oVar3;
        }
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        String str;
        switch (this.f341g) {
            case 0:
                v6.a.W(obj);
                Context context = (Context) this.f342h;
                PackageManager packageManager = context.getPackageManager();
                ArrayList arrayList = new ArrayList();
                ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
                if (resolveActivity != null) {
                    String str2 = resolveActivity.activityInfo.packageName;
                    ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                    arrayList2.add(str2);
                    arrayList = arrayList2;
                }
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        str = (String) obj2;
                        intent.setPackage(str);
                        if (packageManager.resolveService(intent, 0) != null) {
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 30) {
                            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                        }
                        str = null;
                    }
                }
                if (str != null) {
                    e eVar = (e) this.f343i;
                    eVar.setApplicationContext(context.getApplicationContext());
                    Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                    if (!TextUtils.isEmpty(str)) {
                        intent2.setPackage(str);
                    }
                    context.bindService(intent2, eVar, 33);
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                v6.a.W(obj);
                Activity C = i7.b.C((Context) this.f342h);
                if (C != null) {
                    if (C.getRequestedOrientation() != 1) {
                        C.setRequestedOrientation(1);
                    }
                }
                break;
            default:
                v6.a.W(obj);
                ((m5.c) this.f342h).d(new sd.d(((rd.y) ((d1) this.f343i).getValue()).f6206b));
                break;
        }
        return o.f277a;
    }
}
