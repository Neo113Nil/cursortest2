package defpackage;

/* loaded from: classes.dex */
public final class rko implements Cloneable {
    public final float a;
    public final int b;

    public rko(float f) {
        this.a = f;
        this.b = 1;
    }

    public final float b(mmo mmoVar) {
        float sqrt;
        if (this.b != 9) {
            return e(mmoVar);
        }
        kmo kmoVar = (kmo) mmoVar.d;
        spi spiVar = kmoVar.g;
        if (spiVar == null) {
            spiVar = kmoVar.f;
        }
        float f = this.a;
        if (spiVar == null) {
            return f;
        }
        float f2 = spiVar.d;
        if (f2 == spiVar.e) {
            sqrt = f * f2;
        } else {
            sqrt = f * ((float) (Math.sqrt((r0 * r0) + (f2 * f2)) / 1.414213562373095d));
        }
        return sqrt / 100.0f;
    }

    public final float c(mmo mmoVar, float f) {
        return this.b == 9 ? (this.a * f) / 100.0f : e(mmoVar);
    }

    public final float d() {
        float f;
        float f2;
        int D = ouj.D(this.b);
        float f3 = this.a;
        if (D == 0) {
            return f3;
        }
        if (D == 3) {
            return f3 * 96.0f;
        }
        if (D == 4) {
            f = f3 * 96.0f;
            f2 = 2.54f;
        } else if (D == 5) {
            f = f3 * 96.0f;
            f2 = 25.4f;
        } else if (D == 6) {
            f = f3 * 96.0f;
            f2 = 72.0f;
        } else {
            if (D != 7) {
                return f3;
            }
            f = f3 * 96.0f;
            f2 = 6.0f;
        }
        return f / f2;
    }

    public final float e(mmo mmoVar) {
        float textSize;
        int D = ouj.D(this.b);
        float f = this.a;
        switch (D) {
            case 1:
                textSize = ((kmo) mmoVar.d).d.getTextSize();
                break;
            case 2:
                textSize = ((kmo) mmoVar.d).d.getTextSize() / 2.0f;
                break;
            case 3:
                mmoVar.getClass();
                return f * 96.0f;
            case 4:
                mmoVar.getClass();
                return (f * 96.0f) / 2.54f;
            case 5:
                mmoVar.getClass();
                return (f * 96.0f) / 25.4f;
            case 6:
                mmoVar.getClass();
                return (f * 96.0f) / 72.0f;
            case 7:
                mmoVar.getClass();
                return (f * 96.0f) / 6.0f;
            case 8:
                kmo kmoVar = (kmo) mmoVar.d;
                spi spiVar = kmoVar.g;
                if (spiVar == null) {
                    spiVar = kmoVar.f;
                }
                if (spiVar != null) {
                    return (f * spiVar.d) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    public final float f(mmo mmoVar) {
        if (this.b != 9) {
            return e(mmoVar);
        }
        kmo kmoVar = (kmo) mmoVar.d;
        spi spiVar = kmoVar.g;
        if (spiVar == null) {
            spiVar = kmoVar.f;
        }
        float f = this.a;
        return spiVar == null ? f : (f * spiVar.e) / 100.0f;
    }

    public final boolean g() {
        return this.a < 0.0f;
    }

    public final boolean h() {
        return this.a == 0.0f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.a));
        switch (this.b) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public rko(int i, float f) {
        this.a = f;
        this.b = i;
    }
}
