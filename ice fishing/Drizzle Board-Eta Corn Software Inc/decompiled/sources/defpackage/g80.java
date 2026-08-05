package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class g80 {
    public boolean MdtA4re8;
    public double NCTxEWno;
    public double P7K7Inc8;
    public double Qr9iLBAD;
    public double VgvYg0wo;
    public double b2ZJblxo;
    public final ke eVhOlqcC;
    public double jb9XjC4I;
    public double qoPGr6Ce;
    public double wxUZMvaN;

    public g80() {
        this.qoPGr6Ce = Math.sqrt(1500.0d);
        this.NCTxEWno = 0.5d;
        this.MdtA4re8 = false;
        this.jb9XjC4I = Double.MAX_VALUE;
        this.eVhOlqcC = new ke();
    }

    public final ke MdtA4re8(double d, double d2, long j) {
        double sin;
        double cos;
        if (!this.MdtA4re8) {
            if (this.jb9XjC4I == Double.MAX_VALUE) {
                m1.Ey6iv0m0("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
            double d3 = this.NCTxEWno;
            if (d3 > 1.0d) {
                double d4 = this.qoPGr6Ce;
                this.P7K7Inc8 = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.NCTxEWno;
                double d6 = this.qoPGr6Ce;
                this.b2ZJblxo = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.Qr9iLBAD = Math.sqrt(1.0d - (d3 * d3)) * this.qoPGr6Ce;
            }
            this.MdtA4re8 = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.jb9XjC4I;
        double d9 = this.NCTxEWno;
        if (d9 > 1.0d) {
            double d10 = this.b2ZJblxo;
            double d11 = ((d10 * d8) - d2) / (d10 - this.P7K7Inc8);
            double d12 = d8 - d11;
            sin = (Math.pow(2.718281828459045d, this.P7K7Inc8 * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.b2ZJblxo;
            double pow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.P7K7Inc8;
            cos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + pow;
        } else if (d9 == 1.0d) {
            double d15 = this.qoPGr6Ce;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double pow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double pow3 = Math.pow(2.718281828459045d, (-this.qoPGr6Ce) * d7) * d17;
            double d18 = -this.qoPGr6Ce;
            cos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (pow3 * d18);
            sin = pow2;
        } else {
            double d19 = 1.0d / this.Qr9iLBAD;
            double d20 = this.qoPGr6Ce;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            sin = ((Math.sin(this.Qr9iLBAD * d7) * d21) + (Math.cos(this.Qr9iLBAD * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.qoPGr6Ce;
            double d23 = this.NCTxEWno;
            double d24 = (-d22) * sin * d23;
            double pow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.Qr9iLBAD;
            double sin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.Qr9iLBAD;
            cos = (((Math.cos(d26 * d7) * d21 * d26) + sin2) * pow4) + d24;
        }
        float f = (float) (sin + this.jb9XjC4I);
        ke keVar = this.eVhOlqcC;
        keVar.qoPGr6Ce = f;
        keVar.NCTxEWno = (float) cos;
        return keVar;
    }

    public final void NCTxEWno(float f) {
        if (f <= 0.0f) {
            m1.sjUBp5pO("Spring stiffness constant must be positive.");
        } else {
            this.qoPGr6Ce = Math.sqrt(f);
            this.MdtA4re8 = false;
        }
    }

    public final void qoPGr6Ce(float f) {
        if (f < 0.0f) {
            m1.sjUBp5pO("Damping ratio must be non-negative");
        } else {
            this.NCTxEWno = f;
            this.MdtA4re8 = false;
        }
    }

    public g80(float f) {
        this.qoPGr6Ce = Math.sqrt(1500.0d);
        this.NCTxEWno = 0.5d;
        this.MdtA4re8 = false;
        this.eVhOlqcC = new ke();
        this.jb9XjC4I = f;
    }
}
