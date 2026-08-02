package ru.yandex.taxi.surge.repository;

import defpackage.aze0;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.gci0;
import defpackage.i3y;
import defpackage.jn40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.on2;
import defpackage.pex0;
import defpackage.r0d0;
import defpackage.sjh;
import defpackage.sye0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tye0;
import defpackage.uyj;
import defpackage.wt60;
import defpackage.zy11;
import defpackage.zye0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.surge.api.PriceComplainApi;
import ru.yandex.taxi.surge.models.dto.PriceComplainParam$Source;
import ru.yandex.taxi.surge.models.dto.w;

/* loaded from: classes6.dex */
public final class a {
    public final tt2 a;
    public final on2 b;
    public final i3y c = kotlin.a.a(new r0d0(19, this));
    public final r0 d;
    public final gci0 e;
    public final r0 f;
    public final gci0 g;
    public final r0 h;

    public a(on2 on2Var, tt2 tt2Var) {
        this.a = tt2Var;
        this.b = on2Var;
        r0 c = bvf0.c(kotlin.collections.b.f());
        this.d = c;
        this.e = e.d(c);
        r0 c2 = bvf0.c(tye0.a);
        this.f = c2;
        this.g = e.d(c2);
        this.h = bvf0.c(EmptySet.a);
    }

    public final aze0 a(wt60 wt60Var) {
        aze0 aze0Var;
        return (wt60Var == null || (aze0Var = (aze0) ((Map) this.d.getValue()).get(wt60Var)) == null) ? aze0.c : aze0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|67|6|7|8|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0149, code lost:
    
        if (r6 != r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x014c, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0079, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014e, code lost:
    
        defpackage.xby.l(defpackage.jst.e, "SurgePriceComplain", null, r0, "Send price complain request error", 2);
        r1 = new kotlin.Result(new kotlin.Result.Failure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0163, code lost:
    
        r2.L$0 = null;
        r2.L$1 = null;
        r2.L$2 = null;
        r2.L$3 = r1;
        r2.L$4 = null;
        r2.L$5 = null;
        r2.label = 5;
        r7.emit(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0175, code lost:
    
        if (r6 != r3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd A[Catch: all -> 0x0079, CancellationException -> 0x007d, TryCatch #3 {CancellationException -> 0x007d, all -> 0x0079, blocks: (B:19:0x0074, B:20:0x0132, B:31:0x0094, B:32:0x0119, B:37:0x00a5, B:39:0x00c7, B:42:0x00e5, B:45:0x00cd, B:47:0x00d1, B:49:0x00d5, B:54:0x00de, B:56:0x00ae), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wt60 wt60Var, pex0 pex0Var, PriceComplainParam$Source priceComplainParam$Source, ContinuationImpl continuationImpl) {
        PriceComplainRepository$sendPriceComplain$1 priceComplainRepository$sendPriceComplain$1;
        int i;
        wt60 wt60Var2;
        pex0 pex0Var2;
        PriceComplainParam$Source priceComplainParam$Source2;
        Set set;
        w wVar;
        if (continuationImpl instanceof PriceComplainRepository$sendPriceComplain$1) {
            priceComplainRepository$sendPriceComplain$1 = (PriceComplainRepository$sendPriceComplain$1) continuationImpl;
            int i2 = priceComplainRepository$sendPriceComplain$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                priceComplainRepository$sendPriceComplain$1.label = i2 - Integer.MIN_VALUE;
                Object obj = priceComplainRepository$sendPriceComplain$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = priceComplainRepository$sendPriceComplain$1.label;
                tye0 tye0Var = tye0.a;
                Object obj3 = zy11.a;
                r0 r0Var = this.f;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        sye0 sye0Var = sye0.a;
                        wt60Var2 = wt60Var;
                        priceComplainRepository$sendPriceComplain$1.L$0 = wt60Var2;
                        pex0Var2 = pex0Var;
                        priceComplainRepository$sendPriceComplain$1.L$1 = pex0Var2;
                        priceComplainRepository$sendPriceComplain$1.L$2 = priceComplainParam$Source;
                        priceComplainRepository$sendPriceComplain$1.label = 1;
                        r0Var.emit(sye0Var, priceComplainRepository$sendPriceComplain$1);
                        if (obj3 == obj2) {
                            return obj2;
                        }
                        priceComplainParam$Source2 = priceComplainParam$Source;
                        Set set2 = EmptySet.a;
                        if (pex0Var2 != null) {
                            if (pex0Var2.K0) {
                                jn40 jn40Var = pex0Var2.V;
                                Set set3 = jn40Var != null ? jn40Var.f : null;
                                if (set3 != null) {
                                    set = set3;
                                    aze0 a = a(wt60Var2);
                                    cmt<w> a2 = ((PriceComplainApi) this.c.getValue()).a(new zye0(wt60Var2.a.a(), priceComplainParam$Source2, set, a.a, a.b));
                                    priceComplainRepository$sendPriceComplain$1.L$0 = wt60Var2;
                                    priceComplainRepository$sendPriceComplain$1.L$1 = null;
                                    priceComplainRepository$sendPriceComplain$1.L$2 = null;
                                    priceComplainRepository$sendPriceComplain$1.L$3 = null;
                                    priceComplainRepository$sendPriceComplain$1.L$4 = null;
                                    priceComplainRepository$sendPriceComplain$1.label = 2;
                                    obj = ru.yandex.taxi.network.api.a.a(a2, null, priceComplainRepository$sendPriceComplain$1);
                                    if (obj == obj2) {
                                        return obj2;
                                    }
                                    w wVar2 = (w) obj;
                                    priceComplainRepository$sendPriceComplain$1.L$0 = null;
                                    priceComplainRepository$sendPriceComplain$1.L$1 = null;
                                    priceComplainRepository$sendPriceComplain$1.L$2 = null;
                                    priceComplainRepository$sendPriceComplain$1.L$3 = null;
                                    priceComplainRepository$sendPriceComplain$1.L$4 = null;
                                    priceComplainRepository$sendPriceComplain$1.L$5 = wVar2;
                                    priceComplainRepository$sendPriceComplain$1.label = 3;
                                    if (c(wt60Var2, priceComplainRepository$sendPriceComplain$1) == obj2) {
                                        wVar = wVar2;
                                        Result result = new Result(wVar);
                                        priceComplainRepository$sendPriceComplain$1.L$0 = null;
                                        priceComplainRepository$sendPriceComplain$1.L$1 = null;
                                        priceComplainRepository$sendPriceComplain$1.L$2 = null;
                                        priceComplainRepository$sendPriceComplain$1.L$3 = result;
                                        priceComplainRepository$sendPriceComplain$1.L$4 = null;
                                        priceComplainRepository$sendPriceComplain$1.L$5 = null;
                                        priceComplainRepository$sendPriceComplain$1.label = 4;
                                        r0Var.emit(tye0Var, priceComplainRepository$sendPriceComplain$1);
                                        break;
                                    } else {
                                        return obj2;
                                    }
                                }
                            } else {
                                set2 = Collections.singleton(pex0Var2.b);
                            }
                        }
                        set = set2;
                        aze0 a3 = a(wt60Var2);
                        cmt<w> a22 = ((PriceComplainApi) this.c.getValue()).a(new zye0(wt60Var2.a.a(), priceComplainParam$Source2, set, a3.a, a3.b));
                        priceComplainRepository$sendPriceComplain$1.L$0 = wt60Var2;
                        priceComplainRepository$sendPriceComplain$1.L$1 = null;
                        priceComplainRepository$sendPriceComplain$1.L$2 = null;
                        priceComplainRepository$sendPriceComplain$1.L$3 = null;
                        priceComplainRepository$sendPriceComplain$1.L$4 = null;
                        priceComplainRepository$sendPriceComplain$1.label = 2;
                        obj = ru.yandex.taxi.network.api.a.a(a22, null, priceComplainRepository$sendPriceComplain$1);
                        if (obj == obj2) {
                        }
                        w wVar22 = (w) obj;
                        priceComplainRepository$sendPriceComplain$1.L$0 = null;
                        priceComplainRepository$sendPriceComplain$1.L$1 = null;
                        priceComplainRepository$sendPriceComplain$1.L$2 = null;
                        priceComplainRepository$sendPriceComplain$1.L$3 = null;
                        priceComplainRepository$sendPriceComplain$1.L$4 = null;
                        priceComplainRepository$sendPriceComplain$1.L$5 = wVar22;
                        priceComplainRepository$sendPriceComplain$1.label = 3;
                        if (c(wt60Var2, priceComplainRepository$sendPriceComplain$1) == obj2) {
                        }
                    case 1:
                        PriceComplainParam$Source priceComplainParam$Source3 = (PriceComplainParam$Source) priceComplainRepository$sendPriceComplain$1.L$2;
                        pex0Var2 = (pex0) priceComplainRepository$sendPriceComplain$1.L$1;
                        wt60 wt60Var3 = (wt60) priceComplainRepository$sendPriceComplain$1.L$0;
                        kotlin.b.b(obj);
                        priceComplainParam$Source2 = priceComplainParam$Source3;
                        wt60Var2 = wt60Var3;
                        Set set22 = EmptySet.a;
                        if (pex0Var2 != null) {
                        }
                        set = set22;
                        aze0 a32 = a(wt60Var2);
                        cmt<w> a222 = ((PriceComplainApi) this.c.getValue()).a(new zye0(wt60Var2.a.a(), priceComplainParam$Source2, set, a32.a, a32.b));
                        priceComplainRepository$sendPriceComplain$1.L$0 = wt60Var2;
                        priceComplainRepository$sendPriceComplain$1.L$1 = null;
                        priceComplainRepository$sendPriceComplain$1.L$2 = null;
                        priceComplainRepository$sendPriceComplain$1.L$3 = null;
                        priceComplainRepository$sendPriceComplain$1.L$4 = null;
                        priceComplainRepository$sendPriceComplain$1.label = 2;
                        obj = ru.yandex.taxi.network.api.a.a(a222, null, priceComplainRepository$sendPriceComplain$1);
                        if (obj == obj2) {
                        }
                        w wVar222 = (w) obj;
                        priceComplainRepository$sendPriceComplain$1.L$0 = null;
                        priceComplainRepository$sendPriceComplain$1.L$1 = null;
                        priceComplainRepository$sendPriceComplain$1.L$2 = null;
                        priceComplainRepository$sendPriceComplain$1.L$3 = null;
                        priceComplainRepository$sendPriceComplain$1.L$4 = null;
                        priceComplainRepository$sendPriceComplain$1.L$5 = wVar222;
                        priceComplainRepository$sendPriceComplain$1.label = 3;
                        if (c(wt60Var2, priceComplainRepository$sendPriceComplain$1) == obj2) {
                        }
                        break;
                    case 2:
                        wt60Var2 = (wt60) priceComplainRepository$sendPriceComplain$1.L$0;
                        kotlin.b.b(obj);
                        w wVar2222 = (w) obj;
                        priceComplainRepository$sendPriceComplain$1.L$0 = null;
                        priceComplainRepository$sendPriceComplain$1.L$1 = null;
                        priceComplainRepository$sendPriceComplain$1.L$2 = null;
                        priceComplainRepository$sendPriceComplain$1.L$3 = null;
                        priceComplainRepository$sendPriceComplain$1.L$4 = null;
                        priceComplainRepository$sendPriceComplain$1.L$5 = wVar2222;
                        priceComplainRepository$sendPriceComplain$1.label = 3;
                        if (c(wt60Var2, priceComplainRepository$sendPriceComplain$1) == obj2) {
                        }
                        break;
                    case 3:
                        wVar = (w) priceComplainRepository$sendPriceComplain$1.L$5;
                        try {
                            kotlin.b.b(obj);
                            Result result2 = new Result(wVar);
                            priceComplainRepository$sendPriceComplain$1.L$0 = null;
                            priceComplainRepository$sendPriceComplain$1.L$1 = null;
                            priceComplainRepository$sendPriceComplain$1.L$2 = null;
                            priceComplainRepository$sendPriceComplain$1.L$3 = result2;
                            priceComplainRepository$sendPriceComplain$1.L$4 = null;
                            priceComplainRepository$sendPriceComplain$1.L$5 = null;
                            priceComplainRepository$sendPriceComplain$1.label = 4;
                            r0Var.emit(tye0Var, priceComplainRepository$sendPriceComplain$1);
                            break;
                        } catch (Throwable th) {
                            priceComplainRepository$sendPriceComplain$1.L$0 = null;
                            priceComplainRepository$sendPriceComplain$1.L$1 = null;
                            priceComplainRepository$sendPriceComplain$1.L$2 = null;
                            priceComplainRepository$sendPriceComplain$1.L$3 = th;
                            priceComplainRepository$sendPriceComplain$1.L$4 = null;
                            priceComplainRepository$sendPriceComplain$1.L$5 = null;
                            priceComplainRepository$sendPriceComplain$1.label = 6;
                            r0Var.emit(tye0Var, priceComplainRepository$sendPriceComplain$1);
                            if (obj3 != obj2) {
                                throw th;
                            }
                        }
                        break;
                    case 4:
                    case 5:
                        Result result3 = (Result) priceComplainRepository$sendPriceComplain$1.L$3;
                        kotlin.b.b(obj);
                        return result3.getValue();
                    case 6:
                        Throwable th2 = (Throwable) priceComplainRepository$sendPriceComplain$1.L$3;
                        kotlin.b.b(obj);
                        throw th2;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        priceComplainRepository$sendPriceComplain$1 = new PriceComplainRepository$sendPriceComplain$1(this, continuationImpl);
        Object obj4 = priceComplainRepository$sendPriceComplain$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = priceComplainRepository$sendPriceComplain$1.label;
        tye0 tye0Var2 = tye0.a;
        Object obj32 = zy11.a;
        r0 r0Var2 = this.f;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(wt60 wt60Var, ContinuationImpl continuationImpl) {
        PriceComplainRepository$setFeedbackSent$1 priceComplainRepository$setFeedbackSent$1;
        int i;
        if (continuationImpl instanceof PriceComplainRepository$setFeedbackSent$1) {
            priceComplainRepository$setFeedbackSent$1 = (PriceComplainRepository$setFeedbackSent$1) continuationImpl;
            int i2 = priceComplainRepository$setFeedbackSent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                priceComplainRepository$setFeedbackSent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = priceComplainRepository$setFeedbackSent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = priceComplainRepository$setFeedbackSent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    PriceComplainRepository$setFeedbackSent$2 priceComplainRepository$setFeedbackSent$2 = new PriceComplainRepository$setFeedbackSent$2(wt60Var, this, null);
                    priceComplainRepository$setFeedbackSent$1.L$0 = null;
                    priceComplainRepository$setFeedbackSent$1.label = 1;
                    if (tje.k0(mdhVar, priceComplainRepository$setFeedbackSent$2, priceComplainRepository$setFeedbackSent$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        priceComplainRepository$setFeedbackSent$1 = new PriceComplainRepository$setFeedbackSent$1(this, continuationImpl);
        Object obj2 = priceComplainRepository$setFeedbackSent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = priceComplainRepository$setFeedbackSent$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final Object d(wt60 wt60Var, String str, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new PriceComplainRepository$updateCommentText$2(this, wt60Var, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object e(wt60 wt60Var, String str, boolean z, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new PriceComplainRepository$updateSelectedIds$2(this, wt60Var, z, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
