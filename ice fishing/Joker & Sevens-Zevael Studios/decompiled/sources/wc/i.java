package wc;

import ac.o;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Map;
import m0.d1;
import m0.e0;
import pc.k;
import v1.p;
import x.s0;
import x.z0;
import x1.f1;
import x1.h0;
import y0.l;
import y1.e1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7723h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, Object obj) {
        super(1);
        this.f7722g = i10;
        this.f7723h = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [v1.j0, x1.a] */
    @Override // oc.c
    public final Object invoke(Object obj) {
        int i10 = this.f7722g;
        o oVar = o.f277a;
        Object obj2 = this.f7723h;
        switch (i10) {
            case 0:
                pc.j.e(obj, "it");
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((s0) obj2).L.f7811y = (p) obj;
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                z0 z0Var = (z0) obj2;
                break;
            case 3:
                x1.a aVar = (x1.a) obj;
                h0 h0Var = (h0) obj2;
                if (aVar.s()) {
                    if (aVar.a().f8068b) {
                        aVar.r();
                    }
                    for (Map.Entry entry : aVar.a().f8073g.entrySet()) {
                        h0.a(h0Var, (v1.k) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar.k());
                    }
                    f1 f1Var = aVar.k().f8035w;
                    pc.j.b(f1Var);
                    while (!f1Var.equals(h0Var.f8067a.k())) {
                        for (v1.k kVar : h0Var.b(f1Var).keySet()) {
                            h0.a(h0Var, kVar, h0Var.c(f1Var, kVar), f1Var);
                        }
                        f1Var = f1Var.f8035w;
                        pc.j.b(f1Var);
                    }
                    break;
                }
                break;
            case 4:
                ((o0.e) obj2).b((l) obj);
                break;
            case 5:
                uc.d dVar = (uc.d) obj;
                pc.j.e(dVar, "it");
                CharSequence charSequence = (CharSequence) obj2;
                pc.j.e(charSequence, "<this>");
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                Configuration configuration = new Configuration((Configuration) obj);
                e0 e0Var = AndroidCompositionLocals_androidKt.f602a;
                ((d1) obj2).setValue(configuration);
                break;
            case 9:
                break;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                if (e1.f8507b.compareAndSet(false, true)) {
                    ((ad.e) obj2).s(oVar);
                    break;
                }
                break;
            default:
                h1.d dVar2 = (h1.d) obj;
                f1.o t3 = dVar2.A().t();
                oc.e eVar = ((y1.f1) obj2).f8531j;
                if (eVar != null) {
                    eVar.invoke(t3, (i1.b) dVar2.A().f261g);
                    break;
                }
                break;
        }
        return oVar;
    }
}
