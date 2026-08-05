package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class te0 {
    public static final ThreadLocal wxUZMvaN = new ThreadLocal();
    public volatile int MdtA4re8 = 0;
    public final VZZbw3BB NCTxEWno;
    public final int qoPGr6Ce;

    public te0(VZZbw3BB vZZbw3BB, int i) {
        this.NCTxEWno = vZZbw3BB;
        this.qoPGr6Ce = i;
    }

    public final ts NCTxEWno() {
        ThreadLocal threadLocal = wxUZMvaN;
        ts tsVar = (ts) threadLocal.get();
        if (tsVar == null) {
            tsVar = new ts();
            threadLocal.set(tsVar);
        }
        us usVar = (us) this.NCTxEWno.qoPGr6Ce;
        int qoPGr6Ce = usVar.qoPGr6Ce(6);
        if (qoPGr6Ce != 0) {
            int i = qoPGr6Ce + usVar.NCTxEWno;
            int i2 = (this.qoPGr6Ce * 4) + ((ByteBuffer) usVar.VgvYg0wo).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) usVar.VgvYg0wo).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) usVar.VgvYg0wo;
            tsVar.VgvYg0wo = byteBuffer;
            if (byteBuffer != null) {
                tsVar.NCTxEWno = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                tsVar.MdtA4re8 = i4;
                tsVar.wxUZMvaN = ((ByteBuffer) tsVar.VgvYg0wo).getShort(i4);
                return tsVar;
            }
            tsVar.NCTxEWno = 0;
            tsVar.MdtA4re8 = 0;
            tsVar.wxUZMvaN = 0;
        }
        return tsVar;
    }

    public final int qoPGr6Ce(int i) {
        ts NCTxEWno = NCTxEWno();
        int qoPGr6Ce = NCTxEWno.qoPGr6Ce(16);
        if (qoPGr6Ce == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) NCTxEWno.VgvYg0wo;
        int i2 = qoPGr6Ce + NCTxEWno.NCTxEWno;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        ts NCTxEWno = NCTxEWno();
        int qoPGr6Ce = NCTxEWno.qoPGr6Ce(4);
        sb.append(Integer.toHexString(qoPGr6Ce != 0 ? ((ByteBuffer) NCTxEWno.VgvYg0wo).getInt(qoPGr6Ce + NCTxEWno.NCTxEWno) : 0));
        sb.append(", codepoints:");
        ts NCTxEWno2 = NCTxEWno();
        int qoPGr6Ce2 = NCTxEWno2.qoPGr6Ce(16);
        if (qoPGr6Ce2 != 0) {
            int i2 = qoPGr6Ce2 + NCTxEWno2.NCTxEWno;
            i = ((ByteBuffer) NCTxEWno2.VgvYg0wo).getInt(((ByteBuffer) NCTxEWno2.VgvYg0wo).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(qoPGr6Ce(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
