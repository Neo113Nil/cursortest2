package defpackage;

import android.content.Context;

/* loaded from: classes13.dex */
public final class wyo0 extends h55 {
    public final /* synthetic */ int D;
    public final Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wyo0(int i, Object obj) {
        super(null);
        this.D = i;
        this.E = obj;
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        switch (this.D) {
            case 0:
                A((m950) ((k4) this.E).get(), (axo0) obj, new p4g0(this, 11));
                break;
        }
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        switch (this.D) {
            case 0:
                j(dpb.a);
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        int i = this.D;
        Object obj2 = this.E;
        switch (i) {
            case 1:
                A((z8i) obj2, (r8i) obj, new x8i(this));
                break;
            case 2:
                A((m950) ((cv5) obj2).get(), (hh40) obj, new fg40() { // from class: yf40
                    @Override // defpackage.sy60
                    public final void a() {
                        wyo0.this.r(new qu(9));
                    }
                });
                break;
            case 3:
                q5z.b0((Context) obj2, ((okr0) obj).a);
                i();
                break;
            case 4:
                A((m950) ((yvf0) obj2).get(), (oh11) obj, new wul0(1, new pv01(10, this)));
                break;
        }
    }
}
