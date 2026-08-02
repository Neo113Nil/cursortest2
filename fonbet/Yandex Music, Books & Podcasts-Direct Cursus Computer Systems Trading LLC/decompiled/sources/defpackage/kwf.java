package defpackage;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class kwf implements d2k {
    public final /* synthetic */ int a;
    public final int b;
    public final float c;

    public kwf() {
        this.a = 2;
        this.c = -1.0f;
        this.b = 0;
    }

    @Override // defpackage.d2k
    public int i(utf utfVar, int i, int i2) {
        utfVar.getClass();
        dnr dnrVar = utfVar.b;
        float f = this.c;
        int d = yhn.d((int) ((i - dnrVar.L(f)) / dnrVar.n0(d3e.a)), 1, this.b);
        int L = i - dnrVar.L(f);
        if (d < 0) {
            d = 0;
        }
        return L / d;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                float f = this.c;
                return f == -1.0f ? "(not available)" : String.format(Locale.US, "%.4f [%d]", Float.valueOf(f), Integer.valueOf(this.b));
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kwf(int i, float f, int i2) {
        this.a = i2;
        this.b = i;
        this.c = f;
    }

    public kwf(int i, int i2) {
        this.a = 2;
        this.c = i;
        this.b = i2;
    }

    public kwf(float f) {
        this.a = 2;
        this.c = f;
        this.b = 0;
    }
}
