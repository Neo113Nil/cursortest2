package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class qx8 {
    public static final ox8 a = new ox8(1);
    public static final ox8 b = new ox8(0);
    public static final px8 c = new px8(0);
    public static final vv8 d = vv8.x;
    public static final vv8 e = vv8.w;

    public static szb a(String str, String str2, uct uctVar, Function1 function1, y7k y7kVar) {
        if (StringsKt.M(str, "@{", false)) {
            return new pzb(str2, str, function1, bcx.h, y7kVar, uctVar, null);
        }
        if (uctVar.b(str)) {
            return new qzb(y7kVar, str);
        }
        throw a8k.j(str2, str, str, null);
    }

    public static szb b(String str, String str2, nx8 nx8Var, y7k y7kVar) {
        s3f s3fVar = bcx.i;
        switch (nx8Var) {
            case STRING:
                return a(str, str2, vct.c, s3fVar, y7kVar);
            case INTEGER:
                return a(str, str2, vct.b, kzj.F, y7kVar);
            case NUMBER:
                return a(str, str2, vct.d, kzj.E, y7kVar);
            case BOOLEAN:
                return a(str, str2, vct.a, kzj.B, y7kVar);
            case DATETIME:
                return a(str, str2, c, s3fVar, y7kVar);
            case COLOR:
                return a(str, str2, b, e, y7kVar);
            case URL:
                return a(str, str2, a, d, y7kVar);
            case DICT:
                return a(str, str2, vct.h, s3fVar, y7kVar);
            case ARRAY:
                return a(str, str2, vct.g, s3fVar, y7kVar);
            default:
                b6e.s();
                return null;
        }
    }
}
