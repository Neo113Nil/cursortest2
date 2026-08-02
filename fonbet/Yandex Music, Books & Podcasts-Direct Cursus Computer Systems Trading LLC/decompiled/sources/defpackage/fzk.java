package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class fzk extends eat {
    public static final fzk a = new fzk();
    public static final x0q b = y0q.b(0, 0, null, 7);
    public static final jyr c = l18.b.b(hag.I(f7l.class), true);
    public static final xdr d;
    public static final xdr e;

    static {
        xdr a2 = ydr.a(Boolean.FALSE);
        d = a2;
        e = a2;
    }

    public static void e(ypt yptVar) {
        xdr xdrVar = d;
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        boolean h = ((ei7) ((byb) qdcVar.C(I)).b(ei7.class)).h();
        Continuation continuation = null;
        if (!h) {
            if (((Boolean) xdrVar.getValue()).booleanValue()) {
                Boolean bool = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                return;
            }
            return;
        }
        if (yptVar == null) {
            return;
        }
        if (yptVar.Q("play") == null && yptVar.Q("playTrack") == null) {
            Boolean bool2 = Boolean.FALSE;
            xdrVar.getClass();
            xdrVar.m(null, bool2);
        } else {
            if (((f7l) c.getValue()).c.getValue() instanceof d6l) {
                return;
            }
            Boolean bool3 = Boolean.TRUE;
            xdrVar.getClass();
            xdrVar.m(null, bool3);
            x97.y(cmd.a, null, null, new dt0(2, 9, continuation), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.f6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(xmo xmoVar, Continuation continuation) {
        dzk dzkVar;
        int i;
        if (continuation instanceof dzk) {
            dzkVar = (dzk) continuation;
            int i2 = dzkVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dzkVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dzkVar.j;
                nm6 nm6Var = nm6.a;
                i = dzkVar.l;
                if (i == 0) {
                    if (i == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                dzkVar.l = 1;
                b.collect(xmoVar, dzkVar);
                return nm6Var;
            }
        }
        dzkVar = new dzk(this, (cg6) continuation);
        Object obj2 = dzkVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dzkVar.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ypt yptVar, w90 w90Var, cg6 cg6Var) {
        ezk ezkVar;
        int i;
        try {
            if (cg6Var instanceof ezk) {
                ezkVar = (ezk) cg6Var;
                int i2 = ezkVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ezkVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = ezkVar.j;
                    Object obj2 = nm6.a;
                    i = ezkVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        e(yptVar);
                        ezkVar.l = 1;
                        if (w90Var.invoke(ezkVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            return Unit.a;
        } catch (Throwable th) {
            Boolean bool = Boolean.FALSE;
            xdr xdrVar = d;
            xdrVar.getClass();
            xdrVar.m(null, bool);
            throw th;
        }
        ezkVar = new ezk(this, cg6Var);
        Object obj3 = ezkVar.j;
        Object obj22 = nm6.a;
        i = ezkVar.l;
    }
}
