package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes12.dex */
public final class qyv implements pyv {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qyv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pyv
    public final Drawable a(String str, boolean z) {
        switch (this.a) {
            case 0:
                return vng.t(v2h0.ic_pin_dest, ((avj0) ((zuj0) this.b)).a);
            default:
                return vng.t(f1h0.ic_finish_flag, ((avj0) ((zuj0) ((e100) this.b).c)).a);
        }
    }

    @Override // defpackage.pyv
    public final Drawable b(String str, boolean z) {
        switch (this.a) {
            case 0:
                return vng.t(f1h0.ic_car, ((avj0) ((zuj0) this.b)).a);
            default:
                return vng.t(f1h0.ic_car, ((avj0) ((zuj0) ((e100) this.b).c)).a);
        }
    }
}
