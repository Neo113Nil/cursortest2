package defpackage;

import android.net.Uri;
import android.os.Build;
import com.appsflyer.internal.k;
import com.connectsdk.device.ConnectableDevice;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class ew0 implements v7o {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ew0(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.v7o
    public final void onError(veb vebVar) {
        switch (this.a) {
            case 0:
                ew0 ew0Var = (ew0) this.c;
                gw0 gw0Var = (gw0) ew0Var.c;
                rn5 rn5Var = gw0Var.j;
                if (rn5Var != null && ((dt1) rn5Var.c).isOpen()) {
                    rn5Var.d(new jzi(gw0Var));
                    rn5Var.close();
                }
                ((v7o) ew0Var.b).onError(vebVar);
                break;
            case 1:
                ((v7o) this.b).onError(vebVar);
                break;
            case 2:
                ((ew0) ((ew0) this.c).c).onError(veb.a(r0.a, new zeb("ERROR_CONNECT_FAILED").a(), vebVar.toString()));
                break;
            case 3:
                vjp.e(tao.f.f(((gw0) this.b).a.a).f, 30000, new fw0(2, this));
                break;
            case 4:
                ((CopyOnWriteArrayList) this.b).add(vebVar);
                break;
            default:
                ew0 ew0Var2 = (ew0) this.c;
                if (!vjp.h) {
                    vjp.h = false;
                    ew0Var2.onError(vebVar);
                    break;
                } else {
                    Uri uri = (Uri) this.b;
                    vjp.e(uri, 30000, new ew0(uri, ew0Var2, false, 5));
                    break;
                }
        }
    }

    @Override // defpackage.v7o
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ew0 ew0Var = (ew0) this.c;
                ((v7o) ew0Var.b).onSuccess((un4) this.b);
                ((gw0) ew0Var.c).n = Boolean.FALSE;
                break;
            case 1:
                gw0 gw0Var = (gw0) this.c;
                ew0 ew0Var2 = new ew0(0, this, (un4) obj);
                String uri = gw0Var.b.toString();
                boolean z = gw0Var.o;
                HashMap r = k.r(z ? "url" : ConnectableDevice.KEY_ID, uri);
                r.put("os", Build.VERSION.RELEASE);
                r.put("library", "Android SDK");
                r.put("version", "2.5.1");
                r.put("modelNumber", Build.MODEL);
                gw0Var.k(z ? "ms.webapplication.start" : "ms.application.start", r, ew0Var2);
                break;
            case 2:
                ew0 ew0Var3 = (ew0) this.c;
                ((gw0) ew0Var3.b).a = (vjp) this.b;
                ((ew0) ew0Var3.c).onSuccess((un4) obj);
                break;
            case 3:
                gw0 gw0Var2 = (gw0) this.b;
                Uri g = gw0Var2.g();
                gw0.h(g);
                gw0Var2.c(g, new ew0(2, this, (vjp) obj));
                break;
            case 4:
                ((CopyOnWriteArrayList) this.b).add((vjp) obj);
                jjo.a(new yyo(2, this));
                break;
            default:
                vjp.h = false;
                ((ew0) this.c).onSuccess((vjp) obj);
                break;
        }
    }

    public /* synthetic */ ew0(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
