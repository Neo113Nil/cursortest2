package kotlin.text;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes.dex */
public final class CatchingFishHiltJUnitMockk {
    public static final byte CatchingFishParcelableFAB = Byte.parseByte("01110000", 2);
    public static final byte CatchingFishSnackbar = Byte.parseByte("00001111", 2);

    public static String CatchingFishParcelableFAB() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b = array[0];
        array[16] = b;
        array[0] = (byte) ((b & CatchingFishSnackbar) | CatchingFishParcelableFAB);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
