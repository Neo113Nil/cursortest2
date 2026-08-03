package androidx.lifecycle;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements s {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f677g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final Object f678h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f679i;

    public h(f fVar, s sVar) {
        pc.j.e(fVar, "defaultLifecycleObserver");
        this.f678h = fVar;
        this.f679i = sVar;
    }

    @Override // androidx.lifecycle.s
    public final void b(u uVar, o oVar) {
        switch (this.f677g) {
            case 0:
                f fVar = (f) this.f678h;
                switch (g.f676a[oVar.ordinal()]) {
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        fVar.getClass();
                        break;
                    case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        fVar.f(uVar);
                        break;
                    case 3:
                        fVar.a(uVar);
                        break;
                    case 4:
                        fVar.d(uVar);
                        break;
                    case 5:
                        fVar.g(uVar);
                        break;
                    case 6:
                        fVar.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new ac.d();
                }
                s sVar = (s) this.f679i;
                if (sVar != null) {
                    sVar.b(uVar, oVar);
                    return;
                }
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                if (oVar == o.ON_START) {
                    ((w) this.f678h).f(this);
                    ((x4.l) this.f679i).n();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((b) this.f679i).f649a;
                List list = (List) hashMap.get(oVar);
                Object obj = this.f678h;
                b.a(list, uVar, oVar, obj);
                b.a((List) hashMap.get(o.ON_ANY), uVar, oVar, obj);
                return;
        }
    }

    public h(t tVar) {
        this.f678h = tVar;
        d dVar = d.f662c;
        Class<?> cls = tVar.getClass();
        b bVar = (b) dVar.f663a.get(cls);
        this.f679i = bVar == null ? dVar.a(cls, null) : bVar;
    }

    public h(w wVar, x4.l lVar) {
        this.f678h = wVar;
        this.f679i = lVar;
    }
}
