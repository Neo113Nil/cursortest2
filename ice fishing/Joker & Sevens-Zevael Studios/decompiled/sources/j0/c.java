package j0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.List;
import y1.h1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements bd.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3295h;

    public /* synthetic */ c(int i10, Object obj) {
        this.f3294g = i10;
        this.f3295h = obj;
    }

    @Override // bd.f
    public final Object a(Object obj, fc.d dVar) {
        switch (this.f3294g) {
            case 0:
                y.h hVar = (y.h) obj;
                w0.q qVar = (w0.q) this.f3295h;
                if (hVar instanceof y.f) {
                    qVar.add(hVar);
                } else if (hVar instanceof y.g) {
                    qVar.remove(((y.g) hVar).f8411a);
                } else if (hVar instanceof y.d) {
                    qVar.add(hVar);
                } else if (hVar instanceof y.e) {
                    qVar.remove(((y.e) hVar).f8410a);
                } else if (hVar instanceof y.k) {
                    qVar.add(hVar);
                } else if (hVar instanceof y.l) {
                    qVar.remove(((y.l) hVar).f8415a);
                } else if (hVar instanceof y.j) {
                    qVar.remove(((y.j) hVar).f8413a);
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                bd.e0 e0Var = ((td.f) this.f3295h).f6559c;
                e0Var.h(null, td.d.a((td.d) e0Var.getValue(), (qd.j) obj, 0, 5));
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((h1) this.f3295h).f8553g.g(((Number) obj).floatValue());
                break;
            default:
                List<qd.i> list = (List) obj;
                bd.e0 e0Var2 = ((zd.f) this.f3295h).f9193c;
                zd.e eVar = (zd.e) e0Var2.getValue();
                ArrayList arrayList = new ArrayList(bc.o.O(list));
                for (qd.i iVar : list) {
                    arrayList.add(new zd.c(iVar.f5860b, iVar.f5861c, iVar.f5859a, iVar.f5862d));
                }
                eVar.getClass();
                e0Var2.h(null, new zd.e(arrayList));
                break;
        }
        return ac.o.f277a;
    }
}
