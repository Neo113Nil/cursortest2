package H;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0120u;
import androidx.datastore.preferences.protobuf.AbstractC0122w;
import androidx.datastore.preferences.protobuf.C0109i;
import androidx.datastore.preferences.protobuf.C0111k;
import androidx.datastore.preferences.protobuf.C0115o;
import androidx.datastore.preferences.protobuf.C0121v;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.c0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends AbstractC0122w {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.f2320b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0122w.l(f.class, fVar);
    }

    public static I n(f fVar) {
        I i2 = fVar.preferences_;
        if (!i2.f2321a) {
            fVar.preferences_ = i2.b();
        }
        return fVar.preferences_;
    }

    public static d p() {
        return (d) ((AbstractC0120u) DEFAULT_INSTANCE.e(5));
    }

    public static f q(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0109i c0109i = new C0109i(fileInputStream);
        C0115o a2 = C0115o.a();
        AbstractC0122w k2 = fVar.k();
        try {
            T t = T.f2345c;
            t.getClass();
            W a3 = t.a(k2.getClass());
            C0111k c0111k = c0109i.f2409b;
            if (c0111k == null) {
                c0111k = new C0111k(c0109i);
            }
            a3.b(k2, c0111k, a2);
            a3.h(k2);
            if (AbstractC0122w.h(k2, true)) {
                return (f) k2;
            }
            throw new A(new c0().getMessage());
        } catch (A e2) {
            if (e2.f2299a) {
                throw new A(e2.getMessage(), e2);
            }
            throw e2;
        } catch (c0 e3) {
            throw new A(e3.getMessage());
        } catch (IOException e4) {
            if (e4.getCause() instanceof A) {
                throw ((A) e4.getCause());
            }
            throw new A(e4.getMessage(), e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof A) {
                throw ((A) e5.getCause());
            }
            throw e5;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0122w
    public final Object e(int i2) {
        switch (j.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f651a});
            case 3:
                return new f();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S s2 = PARSER;
                if (s2 == null) {
                    synchronized (f.class) {
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

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
