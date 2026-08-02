package defpackage;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;

/* loaded from: classes10.dex */
public final class t0j0 implements ehe {
    public final /* synthetic */ int a = 0;
    public final be2 b;
    public final be2 c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public t0j0(String str, be2 be2Var, be2 be2Var2, ge2 ge2Var, boolean z) {
        this.e = str;
        this.b = be2Var;
        this.c = be2Var2;
        this.f = ge2Var;
        this.d = z;
    }

    @Override // defpackage.ehe
    public final uee a(LottieDrawable lottieDrawable, nsz nszVar, l35 l35Var) {
        switch (this.a) {
            case 0:
                return new u0j0(lottieDrawable, l35Var, this);
            default:
                return new ff11(l35Var, this);
        }
    }

    public be2 b() {
        return this.c;
    }

    public be2 c() {
        return (be2) this.f;
    }

    public be2 d() {
        return this.b;
    }

    public ShapeTrimPath$Type e() {
        return (ShapeTrimPath$Type) this.e;
    }

    public boolean f() {
        return this.d;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + ((be2) this.f) + "}";
            default:
                return super.toString();
        }
    }

    public t0j0(String str, ShapeTrimPath$Type shapeTrimPath$Type, be2 be2Var, be2 be2Var2, be2 be2Var3, boolean z) {
        this.e = shapeTrimPath$Type;
        this.b = be2Var;
        this.c = be2Var2;
        this.f = be2Var3;
        this.d = z;
    }
}
