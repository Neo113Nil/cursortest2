package defpackage;

import io.appmetrica.analytics.BuildConfig;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public class ur11 {
    public static final short[] a = new short[128];
    public static final byte[] b;

    static {
        byte[] bArr = new byte[112];
        b = bArr;
        byte[] bArr2 = new byte[128];
        a(0, (byte) 1, bArr2, 15);
        a(16, (byte) 2, bArr2, 31);
        a(32, (byte) 3, bArr2, 63);
        a(64, (byte) 0, bArr2, 65);
        a(66, (byte) 4, bArr2, 95);
        a(96, (byte) 5, bArr2, 96);
        a(97, (byte) 6, bArr2, 108);
        a(109, (byte) 7, bArr2, 109);
        a(110, (byte) 6, bArr2, 111);
        a(112, (byte) 8, bArr2, 112);
        a(113, (byte) 9, bArr2, HProv.PP_CACHE_SIZE);
        a(BuildConfig.API_LEVEL, (byte) 10, bArr2, BuildConfig.API_LEVEL);
        a(HProv.PP_NK_SYNC, (byte) 0, bArr2, HProv.PP_VERSION_TIMESTAMP);
        a(0, (byte) -2, bArr, bArr.length - 1);
        a(8, (byte) -1, bArr, 11);
        a(24, (byte) 0, bArr, 27);
        a(40, PKIBody._CKUANN, bArr, 43);
        a(58, (byte) 0, bArr, 59);
        a(72, (byte) 0, bArr, 73);
        a(89, PKIBody._CKUANN, bArr, 91);
        a(104, PKIBody._CKUANN, bArr, 104);
        byte[] bArr3 = {0, 0, 0, 0, 31, PKIBody._CCP, PKIBody._CCP, PKIBody._CCP, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, PKIBody._CKUANN, DerValue.TAG_APPLICATION, Alerts.alert_internal_error, BlobHeaderStructure.BLOB_VERSION, 96};
        for (int i = 0; i < 128; i++) {
            byte b2 = bArr2[i];
            a[i] = (short) (bArr4[b2] | ((bArr3[b2] & i) << 8));
        }
    }

    public static void a(int i, byte b2, byte[] bArr, int i2) {
        while (i <= i2) {
            bArr[i] = b2;
            i++;
        }
    }
}
