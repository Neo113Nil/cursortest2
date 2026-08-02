package defpackage;

import androidx.core.app.q;
import androidx.glance.appwidget.protobuf.b;

/* loaded from: classes.dex */
public final class kqf extends b {
    private static final kqf DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile l7k PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private mqf layout_;

    static {
        kqf kqfVar = new kqf();
        DEFAULT_INSTANCE = kqfVar;
        b.i(kqf.class, kqfVar);
    }

    public static void k(kqf kqfVar, mqf mqfVar) {
        kqfVar.getClass();
        mqfVar.getClass();
        kqfVar.layout_ = mqfVar;
        kqfVar.bitField0_ |= 1;
    }

    public static void l(kqf kqfVar, int i) {
        kqfVar.layoutIndex_ = i;
    }

    public static jqf o() {
        return (jqf) ((h3d) DEFAULT_INSTANCE.b(5));
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
                return new ejn(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new kqf();
            case 4:
                return new jqf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                l7k l7kVar2 = PARSER;
                if (l7kVar2 != null) {
                    return l7kVar2;
                }
                synchronized (kqf.class) {
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

    public final mqf m() {
        mqf mqfVar = this.layout_;
        return mqfVar == null ? mqf.v() : mqfVar;
    }

    public final int n() {
        return this.layoutIndex_;
    }
}
