package kotlin.text;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class CatchingFishFirebaseBundle {
    public static final Charset CatchingFishParcelableFAB;
    public static final byte[] CatchingFishSnackbar;

    static {
        Charset.forName("US-ASCII");
        CatchingFishParcelableFAB = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        CatchingFishSnackbar = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new CatchingFishFABBundle(bArr, 0, 0, false).CatchingFishLayout(0);
        } catch (CatchingFishKtorMVPAndroidX e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void CatchingFishParcelableFAB(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int CatchingFishSnackbar(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
