package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes10.dex */
public final class rv60 {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, DerValue.tag_UniversalString, -43, -59, -9, 1, 19, 79, Alerts.alert_unrecognized_name, 117, 115, 72, 101, 97, Alerts.alert_no_renegotiation, 1, 2, 56, 1, DerValue.TAG_CONTEXT, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, PKIBody._KRP, -103, 87, 83, 1, PKIBody._CKUANN, 79, Alerts.alert_unrecognized_name, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public ByteBuffer a = og3.a;
    public int c = 0;
    public int b = 2;

    public static void b(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = i2;
        if ((j2 >> 8) == 0) {
            byteBuffer.put((byte) j2);
        } else {
            ny61.g(shb1.c("out of range: %s", Long.valueOf(j2)));
        }
    }

    public final void a(nyg nygVar, List list) {
        int i;
        nygVar.w.getClass();
        if (nygVar.w.limit() - nygVar.w.position() == 0) {
            return;
        }
        byte[] bArr = (this.b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null;
        ByteBuffer byteBuffer = nygVar.w;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = (i2 + 255) / 255;
        int i4 = i3 + 27 + i2;
        if (this.b == 2) {
            int length = bArr != null ? bArr.length + 28 : 47;
            i4 += length + 44;
            i = length;
        } else {
            i = 0;
        }
        if (this.a.capacity() < i4) {
            this.a = ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a.clear();
        }
        ByteBuffer byteBuffer2 = this.a;
        if (this.b == 2) {
            if (bArr != null) {
                b(byteBuffer2, 0L, 0, 1, true);
                long length2 = bArr.length;
                if (!((length2 >> 8) == 0)) {
                    ny61.g(shb1.c("out of range: %s", Long.valueOf(length2)));
                    return;
                }
                byteBuffer2.put((byte) length2);
                byteBuffer2.put(bArr);
                byteBuffer2.putInt(22, tw21.m(byteBuffer2.arrayOffset(), bArr.length + 28, 0, byteBuffer2.array()));
                byteBuffer2.position(bArr.length + 28);
            } else {
                byteBuffer2.put(d);
            }
            byteBuffer2.put(e);
        }
        int c = this.c + ((int) ((xub1.c(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000));
        this.c = c;
        b(byteBuffer2, c, this.b, i3, false);
        for (int i5 = 0; i5 < i3; i5++) {
            if (i2 >= 255) {
                byteBuffer2.put((byte) -1);
                i2 -= 255;
            } else {
                byteBuffer2.put((byte) i2);
                i2 = 0;
            }
        }
        while (position < limit) {
            byteBuffer2.put(byteBuffer.get(position));
            position++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
        if (this.b == 2) {
            byteBuffer2.putInt(i + 66, tw21.m(byteBuffer2.arrayOffset() + i + 44, byteBuffer2.limit() - byteBuffer2.position(), 0, byteBuffer2.array()));
        } else {
            byteBuffer2.putInt(22, tw21.m(byteBuffer2.arrayOffset(), byteBuffer2.limit() - byteBuffer2.position(), 0, byteBuffer2.array()));
        }
        this.b++;
        this.a = byteBuffer2;
        nygVar.d();
        nygVar.f(this.a.remaining());
        nygVar.w.put(this.a);
        nygVar.j();
    }
}
