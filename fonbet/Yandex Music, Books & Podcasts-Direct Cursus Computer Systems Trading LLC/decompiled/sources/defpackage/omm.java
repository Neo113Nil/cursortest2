package defpackage;

import androidx.core.app.q;
import androidx.datastore.preferences.protobuf.s;
import defpackage.nmm;

/* loaded from: classes.dex */
public final class omm extends s<omm, a> {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final omm DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile o7k<omm> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends s.a<omm, a> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final /* synthetic */ b[] i;

        static {
            b bVar = new b("BOOLEAN", 0);
            a = bVar;
            b bVar2 = new b("FLOAT", 1);
            b = bVar2;
            b bVar3 = new b("INTEGER", 2);
            c = bVar3;
            b bVar4 = new b("LONG", 3);
            d = bVar4;
            b bVar5 = new b("STRING", 4);
            e = bVar5;
            b bVar6 = new b("STRING_SET", 5);
            f = bVar6;
            b bVar7 = new b("DOUBLE", 6);
            g = bVar7;
            b bVar8 = new b("VALUE_NOT_SET", 7);
            h = bVar8;
            i = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) i.clone();
        }
    }

    static {
        omm ommVar = new omm();
        DEFAULT_INSTANCE = ommVar;
        s.l(omm.class, ommVar);
    }

    public static a D() {
        return (a) ((s.a) DEFAULT_INSTANCE.d(s.c.e));
    }

    public static void n(omm ommVar, long j) {
        ommVar.valueCase_ = 4;
        ommVar.value_ = Long.valueOf(j);
    }

    public static void o(omm ommVar, String str) {
        ommVar.getClass();
        ommVar.valueCase_ = 5;
        ommVar.value_ = str;
    }

    public static void p(omm ommVar, nmm.a aVar) {
        ommVar.getClass();
        ommVar.value_ = aVar.b();
        ommVar.valueCase_ = 6;
    }

    public static void q(omm ommVar, double d) {
        ommVar.valueCase_ = 7;
        ommVar.value_ = Double.valueOf(d);
    }

    public static void r(omm ommVar, boolean z) {
        ommVar.valueCase_ = 1;
        ommVar.value_ = Boolean.valueOf(z);
    }

    public static void s(omm ommVar, float f) {
        ommVar.valueCase_ = 2;
        ommVar.value_ = Float.valueOf(f);
    }

    public static void t(omm ommVar, int i) {
        ommVar.valueCase_ = 3;
        ommVar.value_ = Integer.valueOf(i);
    }

    public static omm v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final nmm B() {
        return this.valueCase_ == 6 ? (nmm) this.value_ : nmm.o();
    }

    public final b C() {
        switch (this.valueCase_) {
            case 0:
                return b.h;
            case 1:
                return b.a;
            case 2:
                return b.b;
            case 3:
                return b.c;
            case 4:
                return b.d;
            case 5:
                return b.e;
            case 6:
                return b.f;
            case 7:
                return b.g;
            default:
                return null;
        }
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
                return s.j(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", nmm.class});
            case 3:
                return new omm();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                o7k<omm> o7kVar2 = PARSER;
                if (o7kVar2 != null) {
                    return o7kVar2;
                }
                synchronized (omm.class) {
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

    public final boolean u() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
