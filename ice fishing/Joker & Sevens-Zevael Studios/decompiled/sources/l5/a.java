package l5;

import bc.m;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d8.t;
import pc.k;
import w0.q;
import w0.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4157g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t f4158h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(t tVar, int i10) {
        super(0);
        this.f4157g = i10;
        this.f4158h = tVar;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f4157g) {
            case 0:
                return Boolean.valueOf(((q) this.f4158h.f1816a).size() > 1);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return Boolean.valueOf(((q) this.f4158h.f1816a).isEmpty());
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                q qVar = (q) this.f4158h.f1816a;
                qVar.getClass();
                return r.e(qVar).f7616c;
            case 3:
                return m.Y((q) this.f4158h.f1816a);
            default:
                return Integer.valueOf(((q) this.f4158h.f1816a).size());
        }
    }
}
