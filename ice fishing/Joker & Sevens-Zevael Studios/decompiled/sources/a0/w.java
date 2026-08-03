package a0;

import android.view.View;
import b0.u0;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f141g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f142h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i10, int i11) {
        super(1);
        this.f141g = i11;
        this.f142h = i10;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f141g) {
            case 0:
                b0.b0 b0Var = (b0.b0) obj;
                w0.g d10 = w0.r.d();
                w0.r.j(d10, w0.r.g(d10), d10 != null ? d10.e() : null);
                for (int i10 = 0; i10 < 2; i10++) {
                    int i11 = this.f142h + i10;
                    b0Var.getClass();
                    long j3 = b0.e0.f816a;
                    b0.d0 d0Var = b0Var.f806b;
                    a5.c cVar = d0Var.f815c;
                    if (cVar != null) {
                        b0Var.f805a.add(new u0(cVar, i11, j3, d0Var.f814b));
                    }
                }
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return Boolean.valueOf(((d1.r) obj).v0(this.f142h));
            default:
                return Boolean.valueOf(((View) obj).getId() == this.f142h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b0 b0Var, int i10) {
        super(1);
        this.f141g = 0;
        this.f142h = i10;
    }
}
