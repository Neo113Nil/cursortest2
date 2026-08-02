package defpackage;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class pj3 implements vj6 {
    public static final pj3 b = new pj3(0);
    public static final pj3 c = new pj3(1);
    public static final pj3 d = new pj3(2);
    public static final pj3 e = new pj3(3);
    public static final pj3 f = new pj3(4);
    public static final pj3 g = new pj3(5);
    public static final pj3 h = new pj3(6);
    public static final pj3 i = new pj3(7);
    public static final pj3 j = new pj3(8);
    public static final pj3 k = new pj3(9);
    public static final pj3 l = new pj3(10);
    public static final pj3 m = new pj3(11);
    public static final pj3 n = new pj3(12);
    public static final pj3 o = new pj3(13);
    public static final pj3 p = new pj3(14);
    public final /* synthetic */ int a;

    public /* synthetic */ pj3(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.vj6
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return obj.toString();
            case 1:
                o3o o3oVar = (o3o) obj;
                try {
                    hi3 hi3Var = new hi3();
                    o3oVar.z().q0(hi3Var);
                    wkn wknVar = new wkn(o3oVar.o(), o3oVar.g(), hi3Var, 1);
                    o3oVar.close();
                    return wknVar;
                } catch (Throwable th) {
                    o3oVar.close();
                    throw th;
                }
            case 2:
                return (h0o) obj;
            case 3:
                return (o3o) obj;
            case 4:
                ((o3o) obj).close();
                return Unit.a;
            case 5:
                ((o3o) obj).close();
                return null;
            case 6:
                return Boolean.valueOf(((o3o) obj).D());
            case 7:
                return Byte.valueOf(((o3o) obj).D());
            case 8:
                String D = ((o3o) obj).D();
                if (D.length() == 1) {
                    return Character.valueOf(D.charAt(0));
                }
                kac.i(D.length(), "Expected body of length 1 for Character conversion but was ");
                return null;
            case 9:
                return Double.valueOf(((o3o) obj).D());
            case 10:
                return Float.valueOf(((o3o) obj).D());
            case 11:
                return Integer.valueOf(((o3o) obj).D());
            case 12:
                return Long.valueOf(((o3o) obj).D());
            case 13:
                return Short.valueOf(((o3o) obj).D());
            default:
                return ((o3o) obj).D();
        }
    }
}
