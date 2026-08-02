package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class ivm extends h7o implements Function2 {
    public lfm k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ long n;
    public final /* synthetic */ float o;
    public final /* synthetic */ aqi p;
    public final /* synthetic */ jap q;
    public final /* synthetic */ msd r;
    public final /* synthetic */ aqi s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivm(long j, float f, aqi aqiVar, jap japVar, msd msdVar, aqi aqiVar2, Continuation continuation) {
        super(2, continuation);
        this.n = j;
        this.o = f;
        this.p = aqiVar;
        this.q = japVar;
        this.r = msdVar;
        this.s = aqiVar2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        ivm ivmVar = new ivm(this.n, this.o, this.p, this.q, this.r, this.s, continuation);
        ivmVar.m = obj;
        return ivmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ivm) create((hur) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        if (r1 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
    
        if (r2 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003f, code lost:
    
        if (r2 == r0) goto L33;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        lfm lfmVar;
        Object m;
        Object i;
        Function0 function0;
        hur hurVar = (hur) this.m;
        nm6 nm6Var = nm6.a;
        int i2 = this.l;
        jap japVar = this.q;
        if (i2 == 0) {
            qgg.h0(obj);
            this.m = hurVar;
            this.l = 1;
            c = g6s.c(hurVar, true, this, 2);
        } else if (i2 == 1) {
            qgg.h0(obj);
            c = obj;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                i = obj;
                if (((Boolean) i).booleanValue()) {
                    Float f = (Float) japVar.b.getValue();
                    japVar.e.setValue(f);
                    japVar.c.setValue(null);
                    japVar.a.setValue(Boolean.FALSE);
                    if (f != null) {
                        ((Function1) this.s.getValue()).invoke(new Float(f.floatValue()));
                    }
                } else {
                    japVar.a.setValue(Boolean.FALSE);
                    japVar.c.setValue(null);
                    japVar.e.setValue(null);
                }
                return Unit.a;
            }
            lfm lfmVar2 = this.k;
            qgg.h0(obj);
            lfmVar = lfmVar2;
            m = obj;
            avg avgVar = (avg) m;
            if (avgVar != avg.c) {
                if (avgVar == avg.a && (function0 = (Function0) this.p.getValue()) != null) {
                    function0.invoke();
                }
                return Unit.a;
            }
            int i3 = (int) (hurVar.f.y >> 32);
            int i4 = i3 >= 1 ? i3 : 1;
            japVar.d.i(i4);
            japVar.e.setValue(null);
            japVar.a.setValue(Boolean.TRUE);
            japVar.c.setValue(new Float(enj.e(lfmVar.c) - (i4 / 2.0f)));
            this.r.a(0);
            long j = lfmVar.a;
            xum xumVar = new xum(1, hurVar, japVar);
            this.m = null;
            this.k = null;
            this.l = 3;
            i = wna.i(hurVar, j, xumVar, this);
        }
        lfmVar = (lfm) c;
        long j2 = lfmVar.a;
        long j3 = lfmVar.c;
        this.m = hurVar;
        this.k = lfmVar;
        this.l = 2;
        m = lsq.m(hurVar, j2, j3, this.n, this.o, this);
    }
}
