package F;

import androidx.datastore.preferences.protobuf.AbstractC0072b;
import androidx.datastore.preferences.protobuf.AbstractC0090u;
import androidx.datastore.preferences.protobuf.AbstractC0092w;
import androidx.datastore.preferences.protobuf.AbstractC0094y;
import androidx.datastore.preferences.protobuf.C0091v;
import androidx.datastore.preferences.protobuf.InterfaceC0093x;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class h extends AbstractC0092w {
    private static final h DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0093x strings_ = U.f1388i;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0092w.l(h.class, hVar);
    }

    public static void n(h hVar, Set set) {
        InterfaceC0093x interfaceC0093x = hVar.strings_;
        if (!((AbstractC0072b) interfaceC0093x).f1411f) {
            U u2 = (U) interfaceC0093x;
            int i2 = u2.f1390h;
            hVar.strings_ = u2.c(i2 == 0 ? 10 : i2 * 2);
        }
        RandomAccess randomAccess = hVar.strings_;
        Charset charset = AbstractC0094y.f1502a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((U) randomAccess).f1390h);
        }
        U u3 = (U) randomAccess;
        int i3 = u3.f1390h;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (u3.f1390h - i3) + " is null.";
                for (int i4 = u3.f1390h - 1; i4 >= i3; i4--) {
                    u3.remove(i4);
                }
                throw new NullPointerException(str);
            }
            u3.add(obj);
        }
    }

    public static h o() {
        return DEFAULT_INSTANCE;
    }

    public static g q() {
        return (g) ((AbstractC0090u) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0092w
    public final Object e(int i2) {
        switch (j.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new h();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new g(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                S s2 = PARSER;
                if (s2 == null) {
                    synchronized (h.class) {
                        try {
                            s2 = PARSER;
                            if (s2 == null) {
                                s2 = new C0091v();
                                PARSER = s2;
                            }
                        } finally {
                        }
                    }
                }
                return s2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC0093x p() {
        return this.strings_;
    }
}
