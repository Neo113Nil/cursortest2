package androidx.versionedparcelable;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlazePulseVariableInheritanceNQuLulr525AwteyRJy73923350553353 {
    public static final byte ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = Byte.parseByte("01110000", 2);
    public static final byte AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = Byte.parseByte("00001111", 2);

    public static String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b = array[0];
        array[16] = b;
        array[0] = (byte) ((b & AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) | ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
