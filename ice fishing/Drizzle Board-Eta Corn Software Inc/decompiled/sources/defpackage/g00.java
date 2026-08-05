package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class g00 implements vo {
    public static final g00 eVhOlqcC = new g00();
    public int MdtA4re8;
    public int NCTxEWno;
    public Handler P7K7Inc8;
    public boolean wxUZMvaN = true;
    public boolean VgvYg0wo = true;
    public final xo b2ZJblxo = new xo(this);
    public final d3vfVszL Qr9iLBAD = new d3vfVszL(9, this);
    public final tg0 jb9XjC4I = new tg0(24, this);

    public final void NCTxEWno() {
        int i = this.MdtA4re8 + 1;
        this.MdtA4re8 = i;
        if (i == 1) {
            if (this.wxUZMvaN) {
                this.b2ZJblxo.wxUZMvaN(oo.ON_RESUME);
                this.wxUZMvaN = false;
            } else {
                Handler handler = this.P7K7Inc8;
                handler.getClass();
                handler.removeCallbacks(this.Qr9iLBAD);
            }
        }
    }

    @Override // defpackage.vo
    public final xo b2ZJblxo() {
        return this.b2ZJblxo;
    }
}
