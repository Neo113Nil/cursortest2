package defpackage;

import com.google.common.collect.ImmutableMultimap;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* loaded from: classes11.dex */
public abstract class riv {
    public static final ndl0 a;
    public static final ndl0 b;

    static {
        try {
            a = new ndl0(ImmutableMultimap.class.getDeclaredField(PolicyMappingsExtension.MAP));
            try {
                b = new ndl0(ImmutableMultimap.class.getDeclaredField("size"));
            } catch (NoSuchFieldException e) {
                ny61.f(e);
            }
        } catch (NoSuchFieldException e2) {
            ny61.f(e2);
        }
    }
}
