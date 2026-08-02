package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class t6g extends b6 {
    public static final mb4 j = new mb4(Float.class, "animationFraction", 11);
    public ObjectAnimator d;
    public final k5c e;
    public final h7g f;
    public int g;
    public boolean h;
    public float i;

    public t6g(h7g h7gVar) {
        super(3);
        this.g = 1;
        this.f = h7gVar;
        this.e = new k5c(1);
    }

    @Override // defpackage.b6
    public final void L() {
        O();
        P();
        this.d.start();
    }

    public final void O() {
        if (this.d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, j, 0.0f, 1.0f);
            this.d = ofFloat;
            ofFloat.setDuration((long) (this.f.n * 333.0f));
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new le(9, this));
        }
    }

    public final void P() {
        this.h = true;
        this.g = 1;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            gqa gqaVar = (gqa) it.next();
            h7g h7gVar = this.f;
            gqaVar.c = h7gVar.e[0];
            gqaVar.d = h7gVar.i / 2;
        }
    }

    @Override // defpackage.b6
    public final void h() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.b6
    public final void x() {
        O();
        this.d.setDuration((long) (this.f.n * 333.0f));
        P();
    }

    @Override // defpackage.b6
    public final void I() {
    }

    @Override // defpackage.b6
    public final void N() {
    }

    @Override // defpackage.b6
    public final void H(ys2 ys2Var) {
    }
}
