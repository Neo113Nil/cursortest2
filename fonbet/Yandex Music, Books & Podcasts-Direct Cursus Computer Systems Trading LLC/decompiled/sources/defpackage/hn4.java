package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class hn4 implements rjc {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ xqn c;
    public final /* synthetic */ mm6 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ fk0 f;
    public final /* synthetic */ float g;

    public hn4(Function0 function0, Function0 function02, xqn xqnVar, mm6 mm6Var, Function0 function03, fk0 fk0Var, float f) {
        this.a = function0;
        this.b = function02;
        this.c = xqnVar;
        this.d = mm6Var;
        this.e = function03;
        this.f = fk0Var;
        this.g = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f2, code lost:
    
        if (defpackage.fk0.c(r16.f, r5, r6, null, r8, 12) != r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (defpackage.fk0.c(r16.f, r5, r1, null, r8, 12) == r3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011a, code lost:
    
        if (defpackage.fk0.c(r16.f, r1, r6, null, r8, 12) == r3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // defpackage.rjc
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(tre treVar, Continuation continuation) {
        gn4 gn4Var;
        int i;
        CancellationException cancellationException;
        r2f r2fVar;
        if (continuation instanceof gn4) {
            gn4Var = (gn4) continuation;
            int i2 = gn4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gn4Var.l = i2 - Integer.MIN_VALUE;
                gn4 gn4Var2 = gn4Var;
                Object obj = gn4Var2.j;
                nm6 nm6Var = nm6.a;
                i = gn4Var2.l;
                xqn xqnVar = this.c;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean z = treVar instanceof rqm;
                    Function0 function0 = this.b;
                    Function0 function02 = this.a;
                    if (!z) {
                        if (treVar instanceof sqm) {
                            if (((Boolean) function02.invoke()).booleanValue()) {
                                this.e.invoke();
                                if (xqnVar.a == null && ((Boolean) function0.invoke()).booleanValue()) {
                                    Float f = new Float(0.97f);
                                    act S = weo.S(30, 0, lya.c, 2);
                                    gn4Var2.l = 1;
                                    cancellationException = null;
                                }
                            }
                            cancellationException = null;
                        } else if (treVar instanceof qqm) {
                            r2f r2fVar2 = (r2f) xqnVar.a;
                            if (r2fVar2 != null) {
                                r2fVar2.g(null);
                            }
                            xqnVar.a = null;
                            Float f2 = new Float(1.0f);
                            b9r Q = weo.Q(0.0f, 200.0f, null, 5);
                            gn4Var2.l = 3;
                        }
                        return nm6Var;
                    }
                    if (((Boolean) function02.invoke()).booleanValue() && ((Boolean) function0.invoke()).booleanValue()) {
                        r2f r2fVar3 = (r2f) xqnVar.a;
                        if (r2fVar3 != null) {
                            r2fVar3.g(null);
                        }
                        xqnVar.a = x97.y(this.d, null, null, new fn4(this.f, this.g, continuation2, 0), 3);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                cancellationException = null;
                r2fVar = (r2f) xqnVar.a;
                if (r2fVar != null) {
                    r2fVar.g(cancellationException);
                }
                xqnVar.a = cancellationException;
                Float f3 = new Float(1.0f);
                b9r Q2 = weo.Q(0.0f, 200.0f, cancellationException, 5);
                gn4Var2.l = 2;
            }
        }
        gn4Var = new gn4(this, continuation);
        gn4 gn4Var22 = gn4Var;
        Object obj2 = gn4Var22.j;
        nm6 nm6Var2 = nm6.a;
        i = gn4Var22.l;
        xqn xqnVar2 = this.c;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        r2fVar = (r2f) xqnVar2.a;
        if (r2fVar != null) {
        }
        xqnVar2.a = cancellationException;
        Float f32 = new Float(1.0f);
        b9r Q22 = weo.Q(0.0f, 200.0f, cancellationException, 5);
        gn4Var22.l = 2;
    }
}
