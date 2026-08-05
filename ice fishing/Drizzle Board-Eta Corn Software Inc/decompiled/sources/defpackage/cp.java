package defpackage;

import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class cp {
    public int MdtA4re8;
    public int NCTxEWno;
    public boolean VgvYg0wo;
    public we qoPGr6Ce;
    public boolean wxUZMvaN;

    public cp() {
        MdtA4re8();
    }

    public final void MdtA4re8() {
        this.NCTxEWno = -1;
        this.MdtA4re8 = Integer.MIN_VALUE;
        this.wxUZMvaN = false;
        this.VgvYg0wo = false;
    }

    public final void NCTxEWno(View view, int i) {
        we weVar = this.qoPGr6Ce;
        int ygLcUYwZ = Integer.MIN_VALUE == weVar.qoPGr6Ce ? 0 : weVar.ygLcUYwZ() - weVar.qoPGr6Ce;
        if (ygLcUYwZ >= 0) {
            boolean z = this.wxUZMvaN;
            we weVar2 = this.qoPGr6Ce;
            if (z) {
                int wxUZMvaN = weVar2.wxUZMvaN(view);
                we weVar3 = this.qoPGr6Ce;
                this.MdtA4re8 = (Integer.MIN_VALUE != weVar3.qoPGr6Ce ? weVar3.ygLcUYwZ() - weVar3.qoPGr6Ce : 0) + wxUZMvaN;
            } else {
                this.MdtA4re8 = weVar2.b2ZJblxo(view);
            }
            this.NCTxEWno = i;
            return;
        }
        this.NCTxEWno = i;
        boolean z2 = this.wxUZMvaN;
        we weVar4 = this.qoPGr6Ce;
        if (!z2) {
            int b2ZJblxo = weVar4.b2ZJblxo(view);
            int OnDfzHZD = b2ZJblxo - this.qoPGr6Ce.OnDfzHZD();
            this.MdtA4re8 = b2ZJblxo;
            if (OnDfzHZD > 0) {
                int jb9XjC4I = (this.qoPGr6Ce.jb9XjC4I() - Math.min(0, (this.qoPGr6Ce.jb9XjC4I() - ygLcUYwZ) - this.qoPGr6Ce.wxUZMvaN(view))) - (this.qoPGr6Ce.VgvYg0wo(view) + b2ZJblxo);
                if (jb9XjC4I < 0) {
                    this.MdtA4re8 -= Math.min(OnDfzHZD, -jb9XjC4I);
                    return;
                }
                return;
            }
            return;
        }
        int jb9XjC4I2 = (weVar4.jb9XjC4I() - ygLcUYwZ) - this.qoPGr6Ce.wxUZMvaN(view);
        this.MdtA4re8 = this.qoPGr6Ce.jb9XjC4I() - jb9XjC4I2;
        if (jb9XjC4I2 > 0) {
            int VgvYg0wo = this.MdtA4re8 - this.qoPGr6Ce.VgvYg0wo(view);
            int OnDfzHZD2 = this.qoPGr6Ce.OnDfzHZD();
            int min = VgvYg0wo - (Math.min(this.qoPGr6Ce.b2ZJblxo(view) - OnDfzHZD2, 0) + OnDfzHZD2);
            if (min < 0) {
                this.MdtA4re8 = Math.min(jb9XjC4I2, -min) + this.MdtA4re8;
            }
        }
    }

    public final void qoPGr6Ce() {
        boolean z = this.wxUZMvaN;
        we weVar = this.qoPGr6Ce;
        this.MdtA4re8 = z ? weVar.jb9XjC4I() : weVar.OnDfzHZD();
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.NCTxEWno + ", mCoordinate=" + this.MdtA4re8 + ", mLayoutFromEnd=" + this.wxUZMvaN + ", mValid=" + this.VgvYg0wo + '}';
    }
}
