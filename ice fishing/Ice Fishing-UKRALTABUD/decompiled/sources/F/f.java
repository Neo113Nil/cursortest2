package F;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0090u;
import androidx.datastore.preferences.protobuf.AbstractC0092w;
import androidx.datastore.preferences.protobuf.C0079i;
import androidx.datastore.preferences.protobuf.C0081k;
import androidx.datastore.preferences.protobuf.C0085o;
import androidx.datastore.preferences.protobuf.C0091v;
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
public final class f extends AbstractC0092w {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.f1360g;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0092w.l(f.class, fVar);
    }

    public static I n(f fVar) {
        I i2 = fVar.preferences_;
        if (!i2.f1361f) {
            fVar.preferences_ = i2.b();
        }
        return fVar.preferences_;
    }

    public static d p() {
        return (d) ((AbstractC0090u) DEFAULT_INSTANCE.e(5));
    }

    public static f q(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0079i c0079i = new C0079i(fileInputStream);
        C0085o a2 = C0085o.a();
        AbstractC0092w k2 = fVar.k();
        try {
            T t2 = T.f1385c;
            t2.getClass();
            W a3 = t2.a(k2.getClass());
            C0081k c0081k = c0079i.f1449b;
            if (c0081k == null) {
                c0081k = new C0081k(c0079i);
            }
            a3.b(k2, c0081k, a2);
            a3.g(k2);
            if (AbstractC0092w.h(k2, true)) {
                return (f) k2;
            }
            throw new A(new c0().getMessage());
        } catch (A e2) {
            if (e2.f1339f) {
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC0092w
    public final Object e(int i2) {
        switch (j.b(i2)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f322a});
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new f();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new d(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                S s2 = PARSER;
                if (s2 == null) {
                    synchronized (f.class) {
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

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
