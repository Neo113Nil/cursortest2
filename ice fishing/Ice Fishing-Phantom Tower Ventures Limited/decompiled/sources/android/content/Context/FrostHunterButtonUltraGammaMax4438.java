package android.content.Context;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterButtonUltraGammaMax4438 {
    public static final byte FrostHunterAlphaAnimationNeoCosmos5761 = Byte.parseByte("01110000", 2);
    public static final byte FrostHunterConstraintSetCloneMasterUltraRogue2633 = Byte.parseByte("00001111", 2);

    public static String FrostHunterAlphaAnimationNeoCosmos5761() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b = array[0];
        array[16] = b;
        array[0] = (byte) ((b & FrostHunterConstraintSetCloneMasterUltraRogue2633) | FrostHunterAlphaAnimationNeoCosmos5761);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
