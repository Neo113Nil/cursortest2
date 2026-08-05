package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class mf {
    public vs MdtA4re8;
    public final vs NCTxEWno;
    public int P7K7Inc8;
    public int VgvYg0wo;
    public int qoPGr6Ce = 1;
    public vs wxUZMvaN;

    public mf(vs vsVar) {
        this.NCTxEWno = vsVar;
        this.MdtA4re8 = vsVar;
    }

    public final boolean NCTxEWno() {
        ts NCTxEWno = this.MdtA4re8.NCTxEWno.NCTxEWno();
        int qoPGr6Ce = NCTxEWno.qoPGr6Ce(6);
        return !(qoPGr6Ce == 0 || ((ByteBuffer) NCTxEWno.VgvYg0wo).get(qoPGr6Ce + NCTxEWno.NCTxEWno) == 0) || this.VgvYg0wo == 65039;
    }

    public final void qoPGr6Ce() {
        this.qoPGr6Ce = 1;
        this.MdtA4re8 = this.NCTxEWno;
        this.P7K7Inc8 = 0;
    }
}
