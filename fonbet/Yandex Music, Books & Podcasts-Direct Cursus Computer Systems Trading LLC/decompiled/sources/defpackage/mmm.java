package defpackage;

import androidx.core.app.q;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.s;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class mmm extends s<mmm, a> {
    private static final mmm DEFAULT_INSTANCE;
    private static volatile o7k<mmm> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private s9h<String, omm> preferences_ = s9h.b;

    public static final class a extends s.a<mmm, a> {
    }

    public static final class b {
        public static final a0 a = new a0(lrv.c, lrv.e, omm.v());
    }

    static {
        mmm mmmVar = new mmm();
        DEFAULT_INSTANCE = mmmVar;
        s.l(mmm.class, mmmVar);
    }

    public static s9h n(mmm mmmVar) {
        s9h<String, omm> s9hVar = mmmVar.preferences_;
        if (!s9hVar.a) {
            mmmVar.preferences_ = s9hVar.c();
        }
        return mmmVar.preferences_;
    }

    public static a p() {
        return (a) ((s.a) DEFAULT_INSTANCE.d(s.c.e));
    }

    public static mmm q(FileInputStream fileInputStream) {
        return (mmm) s.k(DEFAULT_INSTANCE, fileInputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.s
    public final Object d(s.c cVar) {
        o7k o7kVar;
        switch (cVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return s.j(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.a});
            case 3:
                return new mmm();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o7k<mmm> o7kVar2 = PARSER;
                if (o7kVar2 != null) {
                    return o7kVar2;
                }
                synchronized (mmm.class) {
                    try {
                        o7kVar = PARSER;
                        if (o7kVar == null) {
                            o7kVar = new s.b();
                            PARSER = o7kVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return o7kVar;
            default:
                q.i();
                return null;
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
