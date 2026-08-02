package defpackage;

/* loaded from: classes3.dex */
public final class dlr extends o3d implements xzh {
    private static final dlr DEFAULT_INSTANCE;
    private static volatile n7k PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    static {
        dlr dlrVar = new dlr();
        DEFAULT_INSTANCE = dlrVar;
        o3d.registerDefaultInstance(dlr.class, dlrVar);
    }

    public static dlr f() {
        return DEFAULT_INSTANCE;
    }

    public static dlr h(String str) {
        clr clrVar = (clr) DEFAULT_INSTANCE.createBuilder();
        clrVar.d();
        dlr dlrVar = (dlr) clrVar.b;
        dlrVar.getClass();
        str.getClass();
        dlrVar.value_ = str;
        return (dlr) clrVar.b();
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
        }
        if (ordinal == 3) {
            return new dlr();
        }
        if (ordinal == 4) {
            return new clr(DEFAULT_INSTANCE);
        }
        if (ordinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (ordinal != 6) {
            throw null;
        }
        n7k n7kVar2 = PARSER;
        if (n7kVar2 != null) {
            return n7kVar2;
        }
        synchronized (dlr.class) {
            try {
                n7kVar = PARSER;
                if (n7kVar == null) {
                    n7kVar = new j3d(DEFAULT_INSTANCE);
                    PARSER = n7kVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n7kVar;
    }

    public final String g() {
        return this.value_;
    }
}
