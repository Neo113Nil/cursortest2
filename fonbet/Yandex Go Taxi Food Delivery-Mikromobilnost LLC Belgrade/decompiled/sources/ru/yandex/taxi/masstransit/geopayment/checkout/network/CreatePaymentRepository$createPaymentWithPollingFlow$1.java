package ru.yandex.taxi.masstransit.geopayment.checkout.network;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.cmt;
import defpackage.f6f;
import defpackage.fmt;
import defpackage.h6f;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.n6f;
import defpackage.ny61;
import defpackage.o6f;
import defpackage.oeu;
import defpackage.s8o;
import defpackage.sib1;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentDto$ErrorType;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentResponse;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Li6f;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.network.CreatePaymentRepository$createPaymentWithPollingFlow$1", f = "CreatePaymentRepository.kt", l = {49, 54, 58, 65, 70, CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CreatePaymentRepository$createPaymentWithPollingFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ n6f $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePaymentRepository$createPaymentWithPollingFlow$1(a aVar, n6f n6fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$params = n6fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreatePaymentRepository$createPaymentWithPollingFlow$1 createPaymentRepository$createPaymentWithPollingFlow$1 = new CreatePaymentRepository$createPaymentWithPollingFlow$1(this.this$0, this.$params, continuation);
        createPaymentRepository$createPaymentWithPollingFlow$1.L$0 = obj;
        return createPaymentRepository$createPaymentWithPollingFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreatePaymentRepository$createPaymentWithPollingFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x004b, code lost:
    
        if (r0.emit(defpackage.g6f.a, r10) == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce A[Catch: all -> 0x002b, CancellationException -> 0x00e8, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00e8, all -> 0x002b, blocks: (B:10:0x0026, B:11:0x00ac, B:13:0x005a, B:17:0x0074, B:22:0x008f, B:24:0x0097, B:25:0x009e, B:29:0x00af, B:30:0x00b4, B:31:0x00b5, B:35:0x00ce, B:38:0x0032, B:40:0x0036), top: B:2:0x000d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a9 -> B:11:0x00ac). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            hst hstVar = jst.e;
            String.format("Failed while request checkout", Arrays.copyOf(new Object[]{th}, 1));
            hstVar.getClass();
            f6f f6fVar = new f6f(th, CreatePaymentDto$ErrorType.REQUEST_PAY_ERROR, sib1.b(s8o.O(th)));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 6;
            if (vprVar.emit(f6fVar, this) == coroutineSingletons) {
            }
        }
        switch (i2) {
            case 0:
                kotlin.b.b(obj);
                this.L$0 = vprVar;
                this.label = 1;
                break;
            case 1:
                kotlin.b.b(obj);
                kotlinx.coroutines.a.k(get_context());
                cmt<CreatePaymentResponse> a = ((MtCreatePaymentApi) this.this$0.a.getValue()).a(this.$params);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.label = 2;
                obj = ru.yandex.taxi.network.api.a.b(a, null, this);
                if (obj == coroutineSingletons) {
                }
                fmt fmtVar = (fmt) obj;
                Object obj2 = fmtVar.a;
                oeu oeuVar = fmtVar.e;
                i = o6f.a[((CreatePaymentResponse) obj2).b.ordinal()];
                if (i == 1) {
                    h6f h6fVar = new h6f((CreatePaymentResponse) fmtVar.a, oeuVar.a("X-YaMasstransitRequestId"));
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.label = 3;
                    return vprVar.emit(h6fVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (i == 2) {
                    f6f f6fVar2 = new f6f(null, CreatePaymentDto$ErrorType.FAILURE_PAYMENT_ERROR, oeuVar.a("X-YaMasstransitRequestId"));
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.label = 4;
                    if (vprVar.emit(f6fVar2, this) == coroutineSingletons) {
                    }
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Long l = wwg.l(fmtVar).b;
                long longValue = l != null ? l.longValue() : 5000L;
                this.L$0 = vprVar;
                this.L$1 = null;
                this.label = 5;
                obj = kotlinx.coroutines.a.i(longValue, this);
                if (obj == coroutineSingletons) {
                }
                kotlinx.coroutines.a.k(get_context());
                cmt<CreatePaymentResponse> a2 = ((MtCreatePaymentApi) this.this$0.a.getValue()).a(this.$params);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.label = 2;
                obj = ru.yandex.taxi.network.api.a.b(a2, null, this);
                if (obj == coroutineSingletons) {
                }
                fmt fmtVar2 = (fmt) obj;
                Object obj22 = fmtVar2.a;
                oeu oeuVar2 = fmtVar2.e;
                i = o6f.a[((CreatePaymentResponse) obj22).b.ordinal()];
                if (i == 1) {
                }
            case 2:
                kotlin.b.b(obj);
                fmt fmtVar22 = (fmt) obj;
                Object obj222 = fmtVar22.a;
                oeu oeuVar22 = fmtVar22.e;
                i = o6f.a[((CreatePaymentResponse) obj222).b.ordinal()];
                if (i == 1) {
                }
                break;
            case 3:
            case 4:
                kotlin.b.b(obj);
                return zy11Var;
            case 5:
                kotlin.b.b(obj);
                kotlinx.coroutines.a.k(get_context());
                cmt<CreatePaymentResponse> a22 = ((MtCreatePaymentApi) this.this$0.a.getValue()).a(this.$params);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.label = 2;
                obj = ru.yandex.taxi.network.api.a.b(a22, null, this);
                if (obj == coroutineSingletons) {
                }
                fmt fmtVar222 = (fmt) obj;
                Object obj2222 = fmtVar222.a;
                oeu oeuVar222 = fmtVar222.e;
                i = o6f.a[((CreatePaymentResponse) obj2222).b.ordinal()];
                if (i == 1) {
                }
                break;
            case 6:
                kotlin.b.b(obj);
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
