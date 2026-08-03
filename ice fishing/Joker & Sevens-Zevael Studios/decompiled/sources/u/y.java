package u;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import v.z0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6659g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f0 f6660h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0 f6661i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(f0 f0Var, g0 g0Var, int i10) {
        super(1);
        this.f6659g = i10;
        this.f6660h = f0Var;
        this.f6661i = g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r3.f6661i.f6601a.f6626a != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        if (r3.f6660h.f6597a.f6626a != null) goto L37;
     */
    @Override // oc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        v.x xVar;
        v.x xVar2;
        switch (this.f6659g) {
            case 0:
                z0 z0Var = (z0) obj;
                v vVar = v.f6645g;
                v vVar2 = v.f6646h;
                if (z0Var.b(vVar, vVar2)) {
                    h0 h0Var = this.f6660h.f6597a.f6626a;
                    return (h0Var == null || (xVar2 = h0Var.f6603a) == null) ? b0.f6567b : xVar2;
                }
                if (!z0Var.b(vVar2, v.f6647i)) {
                    return b0.f6567b;
                }
                h0 h0Var2 = this.f6661i.f6601a.f6626a;
                return (h0Var2 == null || (xVar = h0Var2.f6603a) == null) ? b0.f6567b : xVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int ordinal = ((v) obj).ordinal();
                float f10 = 0.0f;
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new ac.d();
                        }
                        break;
                    }
                    f10 = 1.0f;
                }
                return Float.valueOf(f10);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                z0 z0Var2 = (z0) obj;
                v vVar3 = v.f6645g;
                v vVar4 = v.f6646h;
                if (z0Var2.b(vVar3, vVar4)) {
                    return b0.f6567b;
                }
                if (!z0Var2.b(vVar4, v.f6647i)) {
                    return b0.f6567b;
                }
                o0 o0Var = this.f6661i.f6601a;
                return b0.f6567b;
            default:
                int ordinal2 = ((v) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new ac.d();
                    }
                    o0 o0Var2 = this.f6661i.f6601a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
