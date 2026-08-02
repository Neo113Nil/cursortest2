package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class ysw {
    public static final String k = f1d.g("YnisonShared:", "TransitionController");
    public final qfw a;
    public final zzp b;
    public final ykw c;
    public final cew d;
    public final fmw e;
    public final amw f;
    public final jqw g;
    public final dew h;
    public final rjq i;
    public final um6 j;

    public ysw(qfw qfwVar, zzp zzpVar, ykw ykwVar, cew cewVar, fmw fmwVar, amw amwVar, jqw jqwVar, slw slwVar, dew dewVar, rgw rgwVar) {
        this.a = qfwVar;
        this.b = zzpVar;
        this.c = ykwVar;
        this.d = cewVar;
        this.e = fmwVar;
        this.f = amwVar;
        this.g = jqwVar;
        this.h = dewVar;
        rjq rjqVar = new rjq(false);
        this.i = rjqVar;
        this.j = hld.s(rjqVar, (a) few.e.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ysw yswVar, pqw pqwVar, cg6 cg6Var) {
        xsw xswVar;
        int i;
        fmw fmwVar;
        if (cg6Var instanceof xsw) {
            xswVar = (xsw) cg6Var;
            int i2 = xswVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xswVar.m = i2 - Integer.MIN_VALUE;
                Object obj = xswVar.k;
                nm6 nm6Var = nm6.a;
                i = xswVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    gfw c = yswVar.c();
                    gfw gfwVar = gfw.b;
                    String str = k;
                    Continuation continuation = null;
                    if (c == gfwVar) {
                        ssg.a(5, str, "can't switch to passive, already passive", null);
                        return Unit.a;
                    }
                    ssg.a(4, str, "switch to passive", null);
                    fmw fmwVar2 = yswVar.e;
                    clc clcVar = new clc(new vpw(yswVar.a.F, 11), new rhw(pqwVar, continuation, 7));
                    xswVar.j = fmwVar2;
                    xswVar.m = 1;
                    Object G0 = zsd.G0(clcVar, cmd.a, xswVar);
                    if (G0 == nm6Var) {
                        return nm6Var;
                    }
                    obj = G0;
                    fmwVar = fmwVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fmwVar = xswVar.j;
                    qgg.h0(obj);
                }
                ((hmw) fmwVar).f((vdr) obj, new cmw());
                return Unit.a;
            }
        }
        xswVar = new xsw(yswVar, cg6Var);
        Object obj2 = xswVar.k;
        nm6 nm6Var2 = nm6.a;
        i = xswVar.m;
        if (i != 0) {
        }
        ((hmw) fmwVar).f((vdr) obj2, new cmw());
        return Unit.a;
    }

    public static p6g b(pqw pqwVar) {
        return pqwVar.a.a ? new dmw(true) : new emw(true);
    }

    public final gfw c() {
        mwk mwkVar = (mwk) this.f.b().c.b;
        if (mwkVar != null) {
            gfw gfwVar = mwkVar.equals(h1b.e) ? gfw.d : (gfw) dag.p(mwkVar, o6c.t);
            if (gfwVar != null) {
                return gfwVar;
            }
        }
        return gfw.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(sqw sqwVar) {
        cyk cykVar;
        boolean a = ((eew) this.h).a();
        String str = k;
        if (!a) {
            ssg.a(4, str, "skip event until glagol connected", null);
            return;
        }
        if (c() != gfw.b) {
            return;
        }
        mwk mwkVar = (mwk) this.f.b().c.b;
        if (mwkVar != null) {
            cykVar = mwkVar.equals(h1b.e) ? cyk.a : (cyk) dag.p(mwkVar, x2i.l);
        }
        cykVar = cyk.a;
        if (cykVar != cyk.c) {
            ssg.a(2, str, "do not stop playback because it is not ynison queue", null);
            return;
        }
        fmw fmwVar = this.e;
        if (sqwVar == null) {
            ssg.a(2, str, "ynison is down, and there is no remote state to continue with", null);
            ((hmw) fmwVar).b.a();
            return;
        }
        if (!this.d.e.a.g()) {
            ssg.a(2, str, "ynison is down, and there is no network to launch remote queue", null);
            ((hmw) fmwVar).b.a();
        } else if (sqwVar instanceof rqw) {
            ssg.a(2, str, "ynison is down, but its state is raw", null);
            ((hmw) fmwVar).b.a();
        } else if (sqwVar instanceof pqw) {
            e((pqw) sqwVar, new ssw(new emw(true)));
        } else {
            b6e.s();
        }
    }

    public final void e(pqw pqwVar, ssw sswVar) {
        String simpleName = pqwVar.b.getClass().getSimpleName();
        p6g p6gVar = sswVar.a;
        String str = k;
        ssg.a(4, str, "switch to active: state=" + simpleName + " mode=" + p6gVar, null);
        rjp rjpVar = new rjp(this, sswVar);
        maq maqVar = pqwVar.b;
        boolean z = maqVar instanceof jbq;
        zzp zzpVar = this.b;
        fmw fmwVar = this.e;
        if (z) {
            jbq jbqVar = (jbq) maqVar;
            fpw c = pqwVar.c(zzpVar);
            if (p6gVar == null) {
                p6gVar = b(pqwVar);
            }
            ((hmw) fmwVar).h(jbqVar, c, p6gVar, rjpVar);
            return;
        }
        if (maqVar instanceof vaq) {
            vaq vaqVar = (vaq) maqVar;
            fpw c2 = pqwVar.c(zzpVar);
            if (p6gVar == null) {
                p6gVar = b(pqwVar);
            }
            ((hmw) fmwVar).g(vaqVar, c2, p6gVar, rjpVar);
            return;
        }
        if (maqVar instanceof eaq) {
            eaq eaqVar = (eaq) maqVar;
            fpw c3 = pqwVar.c(zzpVar);
            if (p6gVar == null) {
                p6gVar = b(pqwVar);
            }
            ((hmw) fmwVar).e(eaqVar, c3, p6gVar, rjpVar);
            return;
        }
        if (!(maqVar instanceof raq)) {
            b6e.s();
            return;
        }
        ssg.a(5, str, "unsupported ynison state transition: start fallback radio", null);
        if (p6gVar == null) {
            p6gVar = b(pqwVar);
        }
        ((hmw) fmwVar).d(p6gVar);
    }
}
