package j0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3493h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3494i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3495j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i10, v1.j0 j0Var, int i11) {
        super(1);
        this.f3492g = 0;
        this.f3494i = i10;
        this.f3493h = j0Var;
        this.f3495j = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f3492g) {
            case 0:
                v1.i0.g((v1.i0) obj, (v1.j0) this.f3493h, bc.a0.I((this.f3494i - r0.f7085g) / 2.0f), bc.a0.I((this.f3495j - r0.f7086h) / 2.0f));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                v1.i0.j((v1.i0) obj, (v1.j0) this.f3493h, this.f3494i, this.f3495j);
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                v1.i0.g((v1.i0) obj, (v1.j0) this.f3493h, this.f3494i, this.f3495j);
                break;
            default:
                v1.i0 i0Var = (v1.i0) obj;
                for (v1.j0 j0Var : (v1.j0[]) this.f3493h) {
                    if (j0Var != null) {
                        long e10 = i7.b.e(j0Var.f7085g, j0Var.f7086h);
                        long e11 = i7.b.e(this.f3494i, this.f3495j);
                        float f10 = 1;
                        float f11 = (f10 - 1.0f) * ((((int) (e11 >> 32)) - ((int) (e10 >> 32))) / 2.0f);
                        float f12 = (f10 - 1.0f) * ((((int) (e11 & 4294967295L)) - ((int) (e10 & 4294967295L))) / 2.0f);
                        long round = (Math.round(f12) & 4294967295L) | (Math.round(f11) << 32);
                        v1.i0.g(i0Var, j0Var, (int) (round >> 32), (int) (round & 4294967295L));
                    }
                }
                break;
        }
        return ac.o.f277a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(v1.j0 j0Var, int i10, int i11, int i12) {
        super(1);
        this.f3492g = i12;
        this.f3493h = j0Var;
        this.f3494i = i10;
        this.f3495j = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v1.j0[] j0VarArr, u.h hVar, int i10, int i11) {
        super(1);
        this.f3492g = 3;
        this.f3493h = j0VarArr;
        this.f3494i = i10;
        this.f3495j = i11;
    }
}
