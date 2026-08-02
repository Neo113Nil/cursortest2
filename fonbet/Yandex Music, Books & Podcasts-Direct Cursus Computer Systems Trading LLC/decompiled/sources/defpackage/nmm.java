package defpackage;

import androidx.core.app.q;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.u;

/* loaded from: classes.dex */
public final class nmm extends s<nmm, a> {
    private static final nmm DEFAULT_INSTANCE;
    private static volatile o7k<nmm> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private u.a<String> strings_ = s.e();

    public static final class a extends s.a<nmm, a> {
    }

    static {
        nmm nmmVar = new nmm();
        DEFAULT_INSTANCE = nmmVar;
        s.l(nmm.class, nmmVar);
    }

    public static void n(nmm nmmVar, Iterable iterable) {
        if (!nmmVar.strings_.p()) {
            u.a<String> aVar = nmmVar.strings_;
            int size = aVar.size();
            nmmVar.strings_ = aVar.b(size == 0 ? 10 : size * 2);
        }
        androidx.datastore.preferences.protobuf.a.a(iterable, nmmVar.strings_);
    }

    public static nmm o() {
        return DEFAULT_INSTANCE;
    }

    public static a q() {
        return (a) ((s.a) DEFAULT_INSTANCE.d(s.c.e));
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
                return s.j(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new nmm();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o7k<nmm> o7kVar2 = PARSER;
                if (o7kVar2 != null) {
                    return o7kVar2;
                }
                synchronized (nmm.class) {
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

    public final u.a p() {
        return this.strings_;
    }
}
