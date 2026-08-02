package ru.yandex.taxi.preorder.suggested.destinations;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.aqo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xpo;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lxpo;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.suggested.destinations.ExpectedDestinationsHelper$expectedDestinations$1", f = "ExpectedDestinationsHelper.kt", l = {175, SubsamplingScaleImageView.ORIENTATION_180, 185, 189, 190, 190}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ExpectedDestinationsHelper$expectedDestinations$1 extends SuspendLambda implements wls {
    final /* synthetic */ aqo $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpectedDestinationsHelper$expectedDestinations$1(c cVar, aqo aqoVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$params = aqoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ExpectedDestinationsHelper$expectedDestinations$1 expectedDestinationsHelper$expectedDestinations$1 = new ExpectedDestinationsHelper$expectedDestinations$1(this.this$0, this.$params, continuation);
        expectedDestinationsHelper$expectedDestinations$1.L$0 = obj;
        return expectedDestinationsHelper$expectedDestinations$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExpectedDestinationsHelper$expectedDestinations$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b9, code lost:
    
        if (r8 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xpo xpoVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            xpoVar = null;
        }
        switch (i) {
            case 0:
                kotlin.b.b(obj);
                xpo a = c.a(this.this$0, this.$params);
                if (a == null) {
                    c cVar = this.this$0;
                    aqo aqoVar = this.$params;
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.label = 2;
                    obj = c.b(cVar, aqoVar, true, this);
                    if (obj == coroutineSingletons) {
                    }
                    xpoVar = (xpo) obj;
                    if (xpoVar != null) {
                        xpo a2 = c.a(this.this$0, this.$params);
                        if (a2 == null) {
                            a2 = xpo.d;
                        }
                        this.L$0 = vprVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        break;
                    } else {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        if (vprVar.emit(xpoVar, this) == coroutineSingletons) {
                        }
                    }
                } else {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (vprVar.emit(a, this) != coroutineSingletons) {
                        return zy11Var;
                    }
                }
                return coroutineSingletons;
            case 1:
                kotlin.b.b(obj);
                return zy11Var;
            case 2:
                kotlin.b.b(obj);
                xpoVar = (xpo) obj;
                if (xpoVar != null) {
                }
                return coroutineSingletons;
            case 3:
            case 6:
                kotlin.b.b(obj);
                return zy11Var;
            case 4:
                kotlin.b.b(obj);
                c cVar2 = this.this$0;
                aqo aqoVar2 = this.$params;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = vprVar;
                this.label = 5;
                obj = c.b(cVar2, aqoVar2, false, this);
                break;
            case 5:
                vprVar = (vpr) this.L$3;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 6;
                if (vprVar.emit(obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                break;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
