package H;

import androidx.datastore.preferences.protobuf.AbstractC0102b;
import androidx.datastore.preferences.protobuf.AbstractC0120u;
import androidx.datastore.preferences.protobuf.AbstractC0122w;
import androidx.datastore.preferences.protobuf.AbstractC0124y;
import androidx.datastore.preferences.protobuf.C0121v;
import androidx.datastore.preferences.protobuf.InterfaceC0123x;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class h extends AbstractC0122w {
    private static final h DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0123x strings_ = U.f2348d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0122w.l(h.class, hVar);
    }

    public static void n(h hVar, Set set) {
        InterfaceC0123x interfaceC0123x = hVar.strings_;
        if (!((AbstractC0102b) interfaceC0123x).f2371a) {
            U u2 = (U) interfaceC0123x;
            int i2 = u2.f2350c;
            hVar.strings_ = u2.c(i2 == 0 ? 10 : i2 * 2);
        }
        RandomAccess randomAccess = hVar.strings_;
        Charset charset = AbstractC0124y.f2462a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((U) randomAccess).f2350c);
        }
        U u3 = (U) randomAccess;
        int i3 = u3.f2350c;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (u3.f2350c - i3) + " is null.";
                for (int i4 = u3.f2350c - 1; i4 >= i3; i4--) {
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
        return (g) ((AbstractC0120u) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0122w
    public final Object e(int i2) {
        switch (j.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S s2 = PARSER;
                if (s2 == null) {
                    synchronized (h.class) {
                        try {
                            s2 = PARSER;
                            if (s2 == null) {
                                s2 = new C0121v();
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

    public final InterfaceC0123x p() {
        return this.strings_;
    }
}
