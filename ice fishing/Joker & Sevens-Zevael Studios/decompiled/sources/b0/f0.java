package b0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.i1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f819g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f820h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(i0 i0Var, int i10) {
        super(0);
        this.f819g = i10;
        this.f820h = i0Var;
    }

    @Override // oc.a
    public final Object invoke() {
        long e10;
        switch (this.f819g) {
            case 0:
                i0 i0Var = this.f820h;
                a0.b0 b0Var = i0Var.f834v.f40a;
                if (b0Var.g().f116n == x.e0.f7769g) {
                    v1.f0 f0Var = b0Var.g().f119q;
                    e10 = i7.b.e(f0Var.e(), f0Var.c()) & 4294967295L;
                } else {
                    v1.f0 f0Var2 = b0Var.g().f119q;
                    e10 = i7.b.e(f0Var2.e(), f0Var2.c()) >> 32;
                }
                int i10 = (int) e10;
                a0.b0 b0Var2 = i0Var.f834v.f40a;
                return Float.valueOf(i10 - ((-b0Var2.g().f113k) + b0Var2.g().f117o));
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                a0.b0 b0Var3 = this.f820h.f834v.f40a;
                return Float.valueOf((((i1) b0Var3.f19d.f136b).g() * PermissionsActivity.DELAY_TIME_CALLBACK_CALL) + ((i1) b0Var3.f19d.f137c).g());
            default:
                a0.b0 b0Var4 = this.f820h.f834v.f40a;
                int g8 = ((i1) b0Var4.f19d.f136b).g();
                int g10 = ((i1) b0Var4.f19d.f137c).g();
                return Float.valueOf(b0Var4.c() ? (g8 * PermissionsActivity.DELAY_TIME_CALLBACK_CALL) + g10 + 100 : (g8 * PermissionsActivity.DELAY_TIME_CALLBACK_CALL) + g10);
        }
    }
}
