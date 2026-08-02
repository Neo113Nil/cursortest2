package defpackage;

import java.nio.charset.Charset;
import java.util.BitSet;

/* loaded from: classes5.dex */
public abstract class wue {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final yq2 b = s2i.e;

    public static q2i a(String str, vue vueVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        BitSet bitSet = o2i.d;
        return new q2i(str, z, vueVar);
    }
}
