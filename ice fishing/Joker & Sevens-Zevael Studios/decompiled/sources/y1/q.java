package y1;

import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f8600h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i10) {
        super(0);
        this.f8599g = i10;
        this.f8600h = rVar;
    }

    @Override // oc.a
    public final Object invoke() {
        int actionMasked;
        m mVar;
        switch (this.f8599g) {
            case 0:
                r rVar = this.f8600h;
                MotionEvent motionEvent = rVar.f8639w0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    rVar.f8641x0 = SystemClock.uptimeMillis();
                    rVar.post(rVar.C0);
                }
                return ac.o.f277a;
            default:
                mVar = this.f8600h.get_viewTreeOwners();
                return mVar;
        }
    }
}
