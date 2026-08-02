package defpackage;

import com.google.crypto.tink.shaded.protobuf.i;

/* loaded from: classes11.dex */
public abstract class vyo {
    public static final i a = new i();
    public static final ryo b;

    static {
        ryo ryoVar = null;
        try {
            ryoVar = (ryo) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = ryoVar;
    }

    public static ryo a() {
        ryo ryoVar = b;
        if (ryoVar != null) {
            return ryoVar;
        }
        ny61.r("Protobuf runtime is not correctly loaded.");
        return null;
    }
}
