package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xu {
    public final int MdtA4re8;
    public final boolean NCTxEWno;
    public final int P7K7Inc8;
    public final int Qr9iLBAD;
    public final boolean VgvYg0wo;
    public final int b2ZJblxo;
    public final int jb9XjC4I;
    public final boolean qoPGr6Ce;
    public final boolean wxUZMvaN;

    public xu(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.qoPGr6Ce = z;
        this.NCTxEWno = z2;
        this.MdtA4re8 = i;
        this.wxUZMvaN = z3;
        this.VgvYg0wo = z4;
        this.P7K7Inc8 = i2;
        this.b2ZJblxo = i3;
        this.Qr9iLBAD = i4;
        this.jb9XjC4I = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xu)) {
            return false;
        }
        xu xuVar = (xu) obj;
        return this.qoPGr6Ce == xuVar.qoPGr6Ce && this.NCTxEWno == xuVar.NCTxEWno && this.MdtA4re8 == xuVar.MdtA4re8 && this.wxUZMvaN == xuVar.wxUZMvaN && this.VgvYg0wo == xuVar.VgvYg0wo && this.P7K7Inc8 == xuVar.P7K7Inc8 && this.b2ZJblxo == xuVar.b2ZJblxo && this.Qr9iLBAD == xuVar.Qr9iLBAD && this.jb9XjC4I == xuVar.jb9XjC4I;
    }

    public final int hashCode() {
        return ((((((((((((((((this.qoPGr6Ce ? 1 : 0) * 31) + (this.NCTxEWno ? 1 : 0)) * 31) + this.MdtA4re8) * 923521) + (this.wxUZMvaN ? 1 : 0)) * 31) + (this.VgvYg0wo ? 1 : 0)) * 31) + this.P7K7Inc8) * 31) + this.b2ZJblxo) * 31) + this.Qr9iLBAD) * 31) + this.jb9XjC4I;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(xu.class.getSimpleName());
        sb.append("(");
        if (this.qoPGr6Ce) {
            sb.append("launchSingleTop ");
        }
        if (this.NCTxEWno) {
            sb.append("restoreState ");
        }
        int i = this.jb9XjC4I;
        int i2 = this.Qr9iLBAD;
        int i3 = this.b2ZJblxo;
        int i4 = this.P7K7Inc8;
        if (i4 != -1 || i3 != -1 || i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(")");
        }
        return sb.toString();
    }
}
