package com.gamericefishpro.space.o4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.q4.o0;
import com.gamericefishpro.space.q4.q;
import com.gamericefishpro.space.q4.r;
import com.gamericefishpro.space.q4.s;
import com.gamericefishpro.space.q4.s0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends s {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile o0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        s.j(i.class, iVar);
    }

    public static h D() {
        return (h) ((q) DEFAULT_INSTANCE.c(5));
    }

    public static void l(i iVar, long j) {
        iVar.valueCase_ = 4;
        iVar.value_ = Long.valueOf(j);
    }

    public static void m(i iVar, String str) {
        iVar.getClass();
        iVar.valueCase_ = 5;
        iVar.value_ = str;
    }

    public static void n(i iVar, g gVar) {
        iVar.getClass();
        iVar.value_ = gVar;
        iVar.valueCase_ = 6;
    }

    public static void o(i iVar, double d) {
        iVar.valueCase_ = 7;
        iVar.value_ = Double.valueOf(d);
    }

    public static void p(i iVar, com.gamericefishpro.space.q4.f fVar) {
        iVar.getClass();
        iVar.valueCase_ = 8;
        iVar.value_ = fVar;
    }

    public static void q(i iVar, boolean z) {
        iVar.valueCase_ = 1;
        iVar.value_ = Boolean.valueOf(z);
    }

    public static void r(i iVar, float f) {
        iVar.valueCase_ = 2;
        iVar.value_ = Float.valueOf(f);
    }

    public static void s(i iVar, int i) {
        iVar.valueCase_ = 3;
        iVar.value_ = Integer.valueOf(i);
    }

    public static i v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final g B() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    @Override // com.gamericefishpro.space.q4.s
    public final Object c(int i) {
        o0 rVar;
        switch (com.gamericefishpro.space.i3.e.b(i)) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new s0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 3:
                return new i();
            case 4:
                return new h(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                o0 o0Var = PARSER;
                if (o0Var != null) {
                    return o0Var;
                }
                synchronized (i.class) {
                    try {
                        rVar = PARSER;
                        if (rVar == null) {
                            rVar = new r();
                            PARSER = rVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return rVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final com.gamericefishpro.space.q4.f u() {
        return this.valueCase_ == 8 ? (com.gamericefishpro.space.q4.f) this.value_ : com.gamericefishpro.space.q4.f.i;
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
