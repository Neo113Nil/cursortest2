package kotlin.text;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class CatchingFishViewModelRedux {
    public static final String[] CatchingFishCoroutine;
    public static final CatchingFishWebSocketMockk CatchingFishParcelableFAB;
    public static final String[] CatchingFishReduxKtor;
    public static final String[] CatchingFishSnackbar;

    static {
        CatchingFishWebSocketMockk catchingFishWebSocketMockk = CatchingFishWebSocketMockk.CatchingFishViewModelScope;
        CatchingFishParcelableFAB = CatchingFishAdMobFAB.CatchingFishJetpackCompose("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        CatchingFishSnackbar = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        CatchingFishCoroutine = new String[64];
        CatchingFishReduxKtor = new String[256];
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = CatchingFishReduxKtor;
            if (i2 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i2)};
            byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
            strArr[i2] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = CatchingFishCoroutine;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder(), strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = CatchingFishCoroutine;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i6]);
            sb.append('|');
            strArr3[i7 | 8] = CatchingFishMVPLiveData.CatchingFishStateLiveData(sb, strArr3[i5], "|PADDED");
        }
        while (true) {
            String[] strArr4 = CatchingFishCoroutine;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = CatchingFishReduxKtor[i];
            }
            i++;
        }
    }

    public static void CatchingFishCoroutine(String str, Object... objArr) {
        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    public static String CatchingFishParcelableFAB(boolean z, int i, int i2, byte b, byte b2) {
        String format;
        String str;
        String[] strArr = CatchingFishSnackbar;
        if (b < strArr.length) {
            format = strArr[b];
        } else {
            Object[] objArr = {Byte.valueOf(b)};
            byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
            format = String.format(Locale.US, "0x%02x", objArr);
        }
        if (b2 == 0) {
            str = "";
        } else {
            String[] strArr2 = CatchingFishReduxKtor;
            if (b != 2 && b != 3) {
                if (b == 4 || b == 6) {
                    str = b2 == 1 ? "ACK" : strArr2[b2];
                } else if (b != 7 && b != 8) {
                    String[] strArr3 = CatchingFishCoroutine;
                    String str2 = b2 < strArr3.length ? strArr3[b2] : strArr2[b2];
                    str = (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[b2];
        }
        Object[] objArr2 = {z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), format, str};
        byte[] bArr2 = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", objArr2);
    }

    public static void CatchingFishSnackbar(String str, Object... objArr) {
        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }
}
