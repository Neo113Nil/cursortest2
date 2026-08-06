package defpackage;

/* loaded from: classes.dex */
public final class vx0 implements defpackage.ud0 {
    public static final defpackage.vx0 DFo87pBq1E5 = new defpackage.vx0();
    public int adDC3e2L;
    public android.os.Handler riuEU0zW4;
    public int xiZrDbcSW0;
    public boolean AARZUJiTa = true;
    public boolean EXtogiMhuM = true;
    public final defpackage.xd0 SH1y5HwkJhh = new defpackage.xd0(this, true);
    public final defpackage.cnag84Bm ez2rX8ReCYw = new defpackage.cnag84Bm(7, this);
    public final defpackage.c1NqjJifC7 JlrlGoKF = new defpackage.c1NqjJifC7(23, this);

    @Override // defpackage.ud0
    public final defpackage.xd0 EXtogiMhuM() {
        return this.SH1y5HwkJhh;
    }

    public final void IHQe1A4L2xu() {
        int i = this.xiZrDbcSW0 + 1;
        this.xiZrDbcSW0 = i;
        if (i == 1) {
            if (this.AARZUJiTa) {
                this.SH1y5HwkJhh.F7NU4MC0GW(defpackage.md0.ON_RESUME);
                this.AARZUJiTa = false;
            } else {
                android.os.Handler handler = this.riuEU0zW4;
                handler.getClass();
                handler.removeCallbacks(this.ez2rX8ReCYw);
            }
        }
    }
}
