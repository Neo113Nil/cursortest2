package m0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z0 implements fc.h, r2 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ z0 f4840h = new z0(0);

    /* renamed from: i, reason: collision with root package name */
    public static final z0 f4841i = new z0(1);

    /* renamed from: j, reason: collision with root package name */
    public static final z0 f4842j = new z0(2);

    /* renamed from: k, reason: collision with root package name */
    public static final z0 f4843k = new z0(3);

    /* renamed from: l, reason: collision with root package name */
    public static final z0 f4844l = new z0(4);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4845g;

    public /* synthetic */ z0(int i10) {
        this.f4845g = i10;
    }

    public static final void b(z0 z0Var) {
        bd.e0 e0Var;
        Object obj;
        s0.b bVar;
        bd.e0 e0Var2 = d2.f4547x;
        do {
            e0Var = d2.f4547x;
            obj = (p0.b) e0Var.getValue();
            bVar = (s0.b) obj;
            r0.c cVar = bVar.f6373i;
            s0.a aVar = (s0.a) cVar.get(z0Var);
            if (aVar != null) {
                Object obj2 = aVar.f6368a;
                Object obj3 = aVar.f6369b;
                r0.k kVar = cVar.f5902g;
                r0.k v10 = kVar.v(z0Var != null ? z0Var.hashCode() : 0, 0, z0Var);
                if (kVar != v10) {
                    cVar = v10 == null ? r0.c.f5901i : new r0.c(v10, cVar.f5903h - 1);
                }
                t0.b bVar2 = t0.b.f6511a;
                if (obj2 != bVar2) {
                    Object obj4 = cVar.get(obj2);
                    pc.j.b(obj4);
                    cVar = cVar.a(obj2, new s0.a(((s0.a) obj4).f6368a, obj3));
                }
                if (obj3 != bVar2) {
                    Object obj5 = cVar.get(obj3);
                    pc.j.b(obj5);
                    cVar = cVar.a(obj3, new s0.a(obj2, ((s0.a) obj5).f6369b));
                }
                Object obj6 = obj2 != bVar2 ? bVar.f6371g : obj3;
                if (obj3 != bVar2) {
                    obj2 = bVar.f6372h;
                }
                bVar = new s0.b(obj6, obj2, cVar);
            }
            if (obj == bVar) {
                return;
            }
            Object obj7 = cd.c.f1342b;
            if (obj == null) {
                obj = obj7;
            }
        } while (!e0Var.h(obj, bVar));
    }

    @Override // m0.r2
    public boolean a(Object obj, Object obj2) {
        switch (this.f4845g) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return false;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return obj == obj2;
            default:
                return pc.j.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f4845g) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "NeverEqualPolicy";
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return "ReferentialEqualityPolicy";
            case 3:
            case 5:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
