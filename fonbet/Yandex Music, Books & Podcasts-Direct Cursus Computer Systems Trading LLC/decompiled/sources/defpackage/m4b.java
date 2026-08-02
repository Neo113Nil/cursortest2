package defpackage;

/* loaded from: classes3.dex */
public final class m4b extends o3d implements xzh {
    private static final m4b DEFAULT_INSTANCE;
    private static volatile n7k PARSER;

    static {
        m4b m4bVar = new m4b();
        DEFAULT_INSTANCE = m4bVar;
        o3d.registerDefaultInstance(m4b.class, m4bVar);
    }

    public static m4b f() {
        return DEFAULT_INSTANCE;
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        int ordinal = n3dVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", new Object[0]);
        }
        if (ordinal == 3) {
            return new m4b();
        }
        if (ordinal == 4) {
            return new g3d(DEFAULT_INSTANCE);
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
        synchronized (m4b.class) {
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
}
