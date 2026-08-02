package defpackage;

import androidx.core.app.q;
import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class oaf extends c {
    private static final oaf DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile m7k PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private mn3 value_ = mn3.b;

    static {
        oaf oafVar = new oaf();
        DEFAULT_INSTANCE = oafVar;
        c.l(oaf.class, oafVar);
    }

    public static void m(oaf oafVar, String str) {
        oafVar.getClass();
        str.getClass();
        oafVar.typeUrl_ = str;
    }

    public static void n(oaf oafVar, jn3 jn3Var) {
        oafVar.getClass();
        oafVar.value_ = jn3Var;
    }

    public static void o(oaf oafVar, naf nafVar) {
        oafVar.getClass();
        if (nafVar != naf.UNRECOGNIZED) {
            oafVar.keyMaterialType_ = nafVar.a;
        } else {
            nafVar.getClass();
            xq0.x("Can't get the number of an unknown enum value.");
        }
    }

    public static oaf p() {
        return DEFAULT_INSTANCE;
    }

    public static maf t() {
        return (maf) DEFAULT_INSTANCE.e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c
    public final Object f(int i) {
        m7k m7kVar;
        switch (ouj.D(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new cjn(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new oaf();
            case 4:
                return new maf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                m7k m7kVar2 = PARSER;
                if (m7kVar2 != null) {
                    return m7kVar2;
                }
                synchronized (oaf.class) {
                    try {
                        m7kVar = PARSER;
                        if (m7kVar == null) {
                            m7kVar = new i3d();
                            PARSER = m7kVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return m7kVar;
            default:
                q.i();
                return null;
        }
    }

    public final naf q() {
        int i = this.keyMaterialType_;
        naf nafVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : naf.REMOTE : naf.ASYMMETRIC_PUBLIC : naf.ASYMMETRIC_PRIVATE : naf.SYMMETRIC : naf.UNKNOWN_KEYMATERIAL;
        return nafVar == null ? naf.UNRECOGNIZED : nafVar;
    }

    public final String r() {
        return this.typeUrl_;
    }

    public final mn3 s() {
        return this.value_;
    }
}
