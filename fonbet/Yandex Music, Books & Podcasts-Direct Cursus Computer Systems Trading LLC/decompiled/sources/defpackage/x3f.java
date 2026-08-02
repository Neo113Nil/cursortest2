package defpackage;

/* loaded from: classes5.dex */
public abstract class x3f {
    public static final w3f d = new w3f(new j4f(false, false, false, false, true, "    ", false, "type", true, false, em4.b), pip.a);
    public final j4f a;
    public final uhp b;
    public final ozw c = new ozw(27, (byte) 0);

    public x3f(j4f j4fVar, uhp uhpVar) {
        this.a = j4fVar;
        this.b = uhpVar;
    }

    public final Object a(t9f t9fVar, w4f w4fVar) {
        eg7 w6fVar;
        t9fVar.getClass();
        w4fVar.getClass();
        String str = null;
        if (w4fVar instanceof q5f) {
            w6fVar = new f7f(this, (q5f) w4fVar, str, 12);
        } else if (w4fVar instanceof c4f) {
            w6fVar = new g7f(this, (c4f) w4fVar);
        } else {
            if (!(w4fVar instanceof j5f) && !w4fVar.equals(m5f.INSTANCE)) {
                b6e.s();
                return null;
            }
            w6fVar = new w6f(this, (v6f) w4fVar, null);
        }
        return w6fVar.e(t9fVar);
    }

    public final Object b(t9f t9fVar, String str) {
        t9fVar.getClass();
        str.getClass();
        kkr kkrVar = new kkr(str);
        Object e = new wjr(this, j6w.c, kkrVar, t9fVar.getDescriptor(), null).e(t9fVar);
        kkrVar.o();
        return e;
    }

    public final String c(t9f t9fVar, Object obj) {
        t9fVar.getClass();
        j4x j4xVar = new j4x(8, false);
        rd4 rd4Var = rd4.c;
        j4xVar.c = rd4Var.d(128);
        try {
            wdp.f0(this, j4xVar, t9fVar, obj);
            String j4xVar2 = j4xVar.toString();
            char[] cArr = (char[]) j4xVar.c;
            rd4Var.getClass();
            cArr.getClass();
            rd4Var.b(cArr);
            return j4xVar2;
        } catch (Throwable th) {
            rd4 rd4Var2 = rd4.c;
            char[] cArr2 = (char[]) j4xVar.c;
            rd4Var2.getClass();
            cArr2.getClass();
            rd4Var2.b(cArr2);
            throw th;
        }
    }
}
