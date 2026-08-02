package defpackage;

import androidx.core.app.q;
import androidx.glance.appwidget.protobuf.b;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class iqf extends b {
    private static final iqf DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile l7k PARSER;
    private sse layout_ = czm.d;
    private int nextIndex_;

    static {
        iqf iqfVar = new iqf();
        DEFAULT_INSTANCE = iqfVar;
        b.i(iqf.class, iqfVar);
    }

    public static void k(iqf iqfVar, kqf kqfVar) {
        iqfVar.getClass();
        sse sseVar = iqfVar.layout_;
        if (!((v8) sseVar).a) {
            int size = sseVar.size();
            iqfVar.layout_ = ((czm) sseVar).m(size == 0 ? 10 : size * 2);
        }
        iqfVar.layout_.add(kqfVar);
    }

    public static void l(iqf iqfVar) {
        iqfVar.getClass();
        iqfVar.layout_ = czm.d;
    }

    public static void m(iqf iqfVar, int i) {
        iqfVar.nextIndex_ = i;
    }

    public static iqf n() {
        return DEFAULT_INSTANCE;
    }

    public static iqf q(FileInputStream fileInputStream) {
        iqf iqfVar = DEFAULT_INSTANCE;
        or4 or4Var = new or4(fileInputStream);
        x0c a = x0c.a();
        b h = iqfVar.h();
        try {
            zym zymVar = zym.c;
            zymVar.getClass();
            xto a2 = zymVar.a(h.getClass());
            n8n n8nVar = (n8n) or4Var.b;
            if (n8nVar == null) {
                n8nVar = new n8n(or4Var);
            }
            a2.e(h, n8nVar, a);
            a2.a(h);
            if (b.e(h, true)) {
                return (iqf) h;
            }
            throw new cye(new oit().getMessage());
        } catch (cye e) {
            if (e.a) {
                throw new cye(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof cye) {
                throw ((cye) e2.getCause());
            }
            throw new cye(e2.getMessage(), e2);
        } catch (oit e3) {
            throw new cye(e3.getMessage());
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof cye) {
                throw ((cye) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.b
    public final Object b(int i) {
        l7k l7kVar;
        switch (ouj.D(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ejn(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", kqf.class, "nextIndex_"});
            case 3:
                return new iqf();
            case 4:
                return new hqf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                l7k l7kVar2 = PARSER;
                if (l7kVar2 != null) {
                    return l7kVar2;
                }
                synchronized (iqf.class) {
                    try {
                        l7kVar = PARSER;
                        if (l7kVar == null) {
                            l7kVar = new k3d();
                            PARSER = l7kVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return l7kVar;
            default:
                q.i();
                return null;
        }
    }

    public final sse o() {
        return this.layout_;
    }

    public final int p() {
        return this.nextIndex_;
    }
}
