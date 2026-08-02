package defpackage;

import java.io.IOException;
import java.util.Arrays;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes9.dex */
public abstract class r3 extends a3 implements llv {
    public final int a;
    public final int b;
    public final int c;
    public final z1 w;

    public r3(int i, int i2, int i3, z1 z1Var) {
        if (z1Var == null) {
            ny61.t("'obj' cannot be null");
            throw null;
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            ny61.g(oyr.i(i2, "invalid tag class: "));
            throw null;
        }
        this.a = z1Var instanceof x1 ? 1 : i;
        this.b = i2;
        this.c = i3;
        this.w = z1Var;
    }

    public static r3 p(int i, int i2, b2 b2Var) {
        int i3;
        td4 td4Var;
        if (b2Var.b == 1) {
            i3 = i;
            td4Var = new td4(3, i3, i2, b2Var.c(0), 2);
        } else {
            i3 = i;
            td4Var = new td4(4, i, i2, svf.a(b2Var), 2);
        }
        return i3 != 64 ? td4Var : new nvf(td4Var);
    }

    @Override // defpackage.llv
    public final a3 a() {
        return this;
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (!(a3Var instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) a3Var;
        if (this.c != r3Var.c || this.b != r3Var.b) {
            return false;
        }
        if (this.a != r3Var.a && q() != r3Var.q()) {
            return false;
        }
        a3 aSN1Primitive = this.w.toASN1Primitive();
        a3 aSN1Primitive2 = r3Var.w.toASN1Primitive();
        if (aSN1Primitive == aSN1Primitive2) {
            return true;
        }
        if (q()) {
            return aSN1Primitive.h(aSN1Primitive2);
        }
        try {
            return Arrays.equals(g(), r3Var.g());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return this.w.toASN1Primitive().hashCode() ^ (((this.b * 7919) ^ this.c) ^ (q() ? 15 : PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC));
    }

    @Override // defpackage.a3
    public a3 n() {
        return new td4(this.a, this.b, this.c, this.w, 1);
    }

    @Override // defpackage.a3
    public a3 o() {
        return new td4(this.a, this.b, this.c, this.w, 2);
    }

    public final boolean q() {
        int i = this.a;
        return i == 1 || i == 3;
    }

    public abstract h3 r(a3 a3Var);

    public final String toString() {
        return y3.a(this.b, this.c) + this.w;
    }

    public r3(boolean z, int i, z1 z1Var) {
        this(z ? 1 : 2, 128, i, z1Var);
    }
}
