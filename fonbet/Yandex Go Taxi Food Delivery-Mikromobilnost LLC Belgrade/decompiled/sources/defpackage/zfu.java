package defpackage;

import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public class zfu {
    public final byte[] a = {48, 49, Alerts.alert_decode_error, Alerts.alert_decrypt_error, 52, 53, 54, 55, 56, 57, 97, 98, 99, Alerts.alert_no_renegotiation, 101, 102};
    public final byte[] b;

    public zfu() {
        byte[] bArr = new byte[128];
        this.b = bArr;
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            bArr[i2] = -1;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i >= bArr2.length) {
                bArr[65] = bArr[97];
                bArr[66] = bArr[98];
                bArr[67] = bArr[99];
                bArr[68] = bArr[100];
                bArr[69] = bArr[101];
                bArr[70] = bArr[102];
                return;
            }
            bArr[bArr2[i]] = (byte) i;
            i++;
        }
    }
}
