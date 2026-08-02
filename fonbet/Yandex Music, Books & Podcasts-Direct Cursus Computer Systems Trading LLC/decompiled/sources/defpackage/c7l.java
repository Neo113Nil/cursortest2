package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c7l implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7l b;
    public final /* synthetic */ x6l c;

    public /* synthetic */ c7l(f7l f7lVar, x6l x6lVar, int i) {
        this.a = i;
        this.b = f7lVar;
        this.c = x6lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        if (r12.getClass() == r11.getClass()) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        b7l b7lVar;
        nm6 nm6Var;
        int i;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        x6l x6lVar;
        n7q n7qVar;
        d7l d7lVar;
        int i4;
        Object obj4;
        int i5;
        long longValue;
        x6l x6lVar2;
        n7q n7qVar2;
        switch (this.a) {
            case 0:
                try {
                    if (continuation instanceof b7l) {
                        b7lVar = (b7l) continuation;
                        int i6 = b7lVar.k;
                        if ((i6 & Integer.MIN_VALUE) != 0) {
                            b7lVar.k = i6 - Integer.MIN_VALUE;
                            Object obj5 = b7lVar.j;
                            nm6Var = nm6.a;
                            i = b7lVar.k;
                            if (i != 0) {
                                qgg.h0(obj5);
                                Pair pair = (Pair) obj;
                                t7q t7qVar = (t7q) pair.a;
                                obj2 = (t7q) pair.b;
                                if (!Intrinsics.d(obj2, r7q.a)) {
                                    boolean z = obj2 instanceof q7q;
                                    i2 = 0;
                                    f7l f7lVar = this.b;
                                    if (z) {
                                        n7q n7qVar3 = ((q7q) obj2).a;
                                        if (t7qVar != null && (t7qVar instanceof q7q)) {
                                            n7q n7qVar4 = ((q7q) t7qVar).a;
                                            if (Intrinsics.d(n7qVar4.b(), n7qVar3.b())) {
                                                break;
                                            }
                                        }
                                        b7lVar.m = (q7q) obj2;
                                        b7lVar.n = 0;
                                        b7lVar.k = 1;
                                        if (p6g.C((e6l) f7lVar.d.getValue())) {
                                            obj3 = f7lVar.a(b7lVar);
                                            if (obj3 != nm6Var) {
                                                obj3 = Unit.a;
                                            }
                                        } else {
                                            obj3 = Unit.a;
                                        }
                                        if (obj3 == nm6Var) {
                                            return nm6Var;
                                        }
                                        i3 = 0;
                                        i2 = i3;
                                    } else if (obj2 instanceof s7q) {
                                        g4l g4lVar = f7lVar.a;
                                        g4q g4qVar = ((s7q) obj2).a;
                                        b7lVar.m = null;
                                        b7lVar.n = 0;
                                        b7lVar.k = 3;
                                        if (g4lVar.b(g4qVar, b7lVar) == nm6Var) {
                                            return nm6Var;
                                        }
                                    } else if (obj2 != null) {
                                        throw new x7j();
                                    }
                                }
                                return Unit.a;
                            }
                            if (i != 1) {
                                if (i == 2 || i == 3) {
                                    qgg.h0(obj5);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = b7lVar.n;
                            obj2 = b7lVar.m;
                            qgg.h0(obj5);
                            i2 = i3;
                            x6lVar = this.c;
                            n7qVar = ((q7q) obj2).a;
                            b7lVar.m = null;
                            b7lVar.n = i2;
                            b7lVar.k = 2;
                            if (x6lVar.i(n7qVar, b7lVar) == nm6Var) {
                                return nm6Var;
                            }
                            return Unit.a;
                        }
                    }
                    if (i != 0) {
                    }
                    x6lVar = this.c;
                    n7qVar = ((q7q) obj2).a;
                    b7lVar.m = null;
                    b7lVar.n = i2;
                    b7lVar.k = 2;
                    if (x6lVar.i(n7qVar, b7lVar) == nm6Var) {
                    }
                    return Unit.a;
                } catch (CancellationException e) {
                    CancellationException c = n7w.c("Unexpected cancellation exception in flow collector", e);
                    Assertions.throwOrSkip(f7l.f, new FailedAssertionException("Unexpected cancellation exception in flow collector", c));
                    throw c;
                }
                b7lVar = new b7l(this, continuation);
                Object obj52 = b7lVar.j;
                nm6Var = nm6.a;
                i = b7lVar.k;
                break;
            default:
                try {
                    if (continuation instanceof d7l) {
                        d7lVar = (d7l) continuation;
                        int i7 = d7lVar.k;
                        if ((i7 & Integer.MIN_VALUE) != 0) {
                            d7lVar.k = i7 - Integer.MIN_VALUE;
                            Object obj6 = d7lVar.j;
                            nm6 nm6Var2 = nm6.a;
                            i4 = d7lVar.k;
                            if (i4 != 0) {
                                qgg.h0(obj6);
                                obj4 = (t7q) obj;
                                if (!Intrinsics.d(obj4, r7q.a)) {
                                    boolean z2 = obj4 instanceof q7q;
                                    f7l f7lVar2 = this.b;
                                    if (z2) {
                                        uol uolVar = f7lVar2.b;
                                        d7lVar.m = (q7q) obj4;
                                        d7lVar.n = 0;
                                        d7lVar.k = 1;
                                        obj6 = uolVar.f(d7lVar);
                                        if (obj6 == nm6Var2) {
                                            return nm6Var2;
                                        }
                                        i5 = 0;
                                        longValue = ((Number) obj6).longValue();
                                        x6lVar2 = this.c;
                                        n7qVar2 = ((q7q) obj4).a;
                                        d7lVar.m = null;
                                        d7lVar.n = i5;
                                        d7lVar.k = 2;
                                        if (x6lVar2.k(n7qVar2, longValue, d7lVar) == nm6Var2) {
                                        }
                                    } else {
                                        if (!(obj4 instanceof s7q)) {
                                            throw new x7j();
                                        }
                                        g4l g4lVar2 = f7lVar2.a;
                                        g4q g4qVar2 = ((s7q) obj4).a;
                                        d7lVar.m = null;
                                        d7lVar.n = 0;
                                        d7lVar.k = 3;
                                        if (g4lVar2.b(g4qVar2, d7lVar) == nm6Var2) {
                                            return nm6Var2;
                                        }
                                    }
                                }
                            } else if (i4 == 1) {
                                i5 = d7lVar.n;
                                obj4 = d7lVar.m;
                                qgg.h0(obj6);
                                longValue = ((Number) obj6).longValue();
                                x6lVar2 = this.c;
                                n7qVar2 = ((q7q) obj4).a;
                                d7lVar.m = null;
                                d7lVar.n = i5;
                                d7lVar.k = 2;
                                if (x6lVar2.k(n7qVar2, longValue, d7lVar) == nm6Var2) {
                                    return nm6Var2;
                                }
                            } else {
                                if (i4 != 2 && i4 != 3) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qgg.h0(obj6);
                            }
                            return Unit.a;
                        }
                    }
                    if (i4 != 0) {
                    }
                    return Unit.a;
                } catch (CancellationException e2) {
                    CancellationException c2 = n7w.c("Unexpected cancellation exception in flow collector", e2);
                    Assertions.throwOrSkip(f7l.f, new FailedAssertionException("Unexpected cancellation exception in flow collector", c2));
                    throw c2;
                }
                d7lVar = new d7l(this, continuation);
                Object obj62 = d7lVar.j;
                nm6 nm6Var22 = nm6.a;
                i4 = d7lVar.k;
        }
    }
}
