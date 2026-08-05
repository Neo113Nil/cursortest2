package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class fi implements Comparable {
    public final int MdtA4re8;
    public final int NCTxEWno;
    public final String VgvYg0wo;
    public final String wxUZMvaN;

    public fi(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.NCTxEWno = i;
        this.MdtA4re8 = i2;
        this.wxUZMvaN = str;
        this.VgvYg0wo = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fi fiVar = (fi) obj;
        fiVar.getClass();
        int i = this.NCTxEWno - fiVar.NCTxEWno;
        return i == 0 ? this.MdtA4re8 - fiVar.MdtA4re8 : i;
    }
}
