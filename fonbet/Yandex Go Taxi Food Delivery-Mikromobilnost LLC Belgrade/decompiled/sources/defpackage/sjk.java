package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class sjk implements lml {
    public final Context b;

    public sjk(Context context) {
        this.b = context;
    }

    @Override // defpackage.lml
    public final Typeface a() {
        return wuj0.b(y4h0.ya_regular, this.b);
    }

    @Override // defpackage.lml
    public final Typeface b() {
        return wuj0.b(x4h0.ya_medium, this.b);
    }

    @Override // defpackage.lml
    public final Typeface c() {
        return wuj0.b(e5h0.ya_bold, this.b);
    }

    @Override // defpackage.lml
    public final Typeface d(int i) {
        if (i >= 0 && i < 350) {
            return getLight();
        }
        if (i >= 350 && i < 450) {
            return a();
        }
        if (i >= 450 && i < 600) {
            return b();
        }
        if (i >= 600 && i < 750) {
            return c();
        }
        Context context = this.b;
        return (i < 750 || i >= 850) ? wuj0.b(o5h0.ya_cond_black, context) : wuj0.b(q5h0.ya_cond_heavy, context);
    }

    @Override // defpackage.lml
    public final Typeface getLight() {
        return wuj0.b(v4h0.ya_light, this.b);
    }
}
