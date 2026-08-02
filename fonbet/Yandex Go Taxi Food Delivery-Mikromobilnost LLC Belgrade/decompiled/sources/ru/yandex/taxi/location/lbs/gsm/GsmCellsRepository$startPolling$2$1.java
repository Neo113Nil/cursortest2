package ru.yandex.taxi.location.lbs.gsm;

import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import defpackage.d8;
import defpackage.mvg;
import defpackage.n3u;
import defpackage.ny61;
import defpackage.q7y;
import defpackage.qk0;
import defpackage.rk0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.location.lbs.gsm.GsmCellsRepository$startPolling$2$1", f = "GsmCellsRepository.kt", l = {HProv.ALG_SID_KECCAK_256, HProv.PP_CIPHEROID, HProv.PP_RESERVED1, HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class GsmCellsRepository$startPolling$2$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GsmCellsRepository$startPolling$2$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GsmCellsRepository$startPolling$2$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GsmCellsRepository$startPolling$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00eb, code lost:
    
        if (r12 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0106, code lost:
    
        if (r12 == r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0 A[LOOP:0: B:16:0x00ca->B:18:0x00d0, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0122 -> B:8:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        TimeUnit timeUnit;
        List<CellInfo> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            aVar = this.this$0;
        } else if (i == 1) {
            a aVar3 = (a) this.L$0;
            b.b(obj);
            aVar2 = aVar3;
            list = (List) obj;
            q7y q7yVar = aVar2.e;
            list.size();
            q7yVar.getClass();
            for (CellInfo cellInfo : list) {
                q7y q7yVar2 = aVar2.e;
                Objects.toString(cellInfo);
                q7yVar2.getClass();
            }
            rk0 rk0Var = aVar2.f;
            this.L$0 = aVar2;
            this.L$1 = list;
            this.label = 2;
            obj = rk0Var.a(this);
        } else if (i == 2) {
            list = (List) this.L$1;
            aVar2 = (a) this.L$0;
            b.b(obj);
            if (((qk0) obj).b) {
                aVar2.h = list;
            }
            ru.yandex.taxi.location.lbs.b bVar = aVar2.c;
            this.L$0 = aVar2;
            this.L$1 = null;
            timeUnit = TimeUnit.SECONDS;
            this.L$2 = timeUnit;
            this.label = 3;
            obj = bVar.a(this);
        } else {
            if (i == 3) {
                timeUnit = (TimeUnit) this.L$2;
                aVar2 = (a) this.L$0;
                b.b(obj);
                long millis = timeUnit.toMillis(((Number) obj).longValue());
                this.L$0 = aVar2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                if (kotlinx.coroutines.a.i(millis, this) != coroutineSingletons) {
                    aVar = aVar2;
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a aVar4 = (a) this.L$0;
            b.b(obj);
            aVar = aVar4;
        }
        if (!kotlinx.coroutines.a.p(get_context())) {
            return zy11.a;
        }
        n3u n3uVar = (n3u) aVar.k.getValue();
        this.L$0 = aVar;
        this.L$1 = null;
        this.label = 1;
        Object obj2 = EmptyList.a;
        q7y q7yVar3 = n3uVar.c;
        if (!n3uVar.b.g()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            q7yVar3.getClass();
            q7y.a(illegalArgumentException, "Gsm: Permission fine location not found for gsm");
        } else if (((TelephonyManager) n3uVar.d.getValue()) == null) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException();
            q7yVar3.getClass();
            q7y.a(illegalArgumentException2, "Gsm: Telephone Manager not found");
        } else {
            obj2 = e.y(e.g(new GsmCellsInteractorImpl$requestCellInfos$$inlined$simpleCallbackApiToFlow$1(new d8(28, n3uVar), null)), this);
        }
        if (obj2 != coroutineSingletons) {
            Object obj3 = obj2;
            aVar2 = aVar;
            obj = obj3;
            list = (List) obj;
            q7y q7yVar4 = aVar2.e;
            list.size();
            q7yVar4.getClass();
            while (r12.hasNext()) {
            }
            rk0 rk0Var2 = aVar2.f;
            this.L$0 = aVar2;
            this.L$1 = list;
            this.label = 2;
            obj = rk0Var2.a(this);
        }
        return coroutineSingletons;
    }
}
