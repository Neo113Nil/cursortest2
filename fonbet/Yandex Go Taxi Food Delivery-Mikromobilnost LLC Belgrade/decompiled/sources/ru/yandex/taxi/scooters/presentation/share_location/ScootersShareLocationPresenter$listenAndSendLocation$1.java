package ru.yandex.taxi.scooters.presentation.share_location;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.share_location.ScootersShareLocationPresenter$listenAndSendLocation$1", f = "ScootersShareLocationPresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 60, 60, 60}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersShareLocationPresenter$listenAndSendLocation$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersShareLocationPresenter$listenAndSendLocation$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersShareLocationPresenter$listenAndSendLocation$1 scootersShareLocationPresenter$listenAndSendLocation$1 = new ScootersShareLocationPresenter$listenAndSendLocation$1(this.this$0, continuation);
        scootersShareLocationPresenter$listenAndSendLocation$1.L$0 = obj;
        return scootersShareLocationPresenter$listenAndSendLocation$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersShareLocationPresenter$listenAndSendLocation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ru.yandex.taxi.scooters.presentation.share_location.a, tse] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Throwable th;
        ?? r0 = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (Throwable th2) {
            this.L$0 = null;
            this.L$1 = th2;
            this.label = 4;
            if (a.a(r0, this) != coroutineSingletons) {
                throw th2;
            }
        }
        if (i == 0) {
            b.b(obj);
            a aVar2 = this.this$0;
            try {
                tje.N(r0, null, null, new ScootersShareLocationPresenter$listenAndSendLocation$1$1$1(aVar2, null), 3);
                n b = aVar2.f.b(true);
                ScootersShareLocationPresenter$listenAndSendLocation$1$1$2 scootersShareLocationPresenter$listenAndSendLocation$1$1$2 = new ScootersShareLocationPresenter$listenAndSendLocation$1$1$2(2, null);
                this.L$0 = null;
                this.L$1 = aVar2;
                this.label = 1;
                if (e.x(b, scootersShareLocationPresenter$listenAndSendLocation$1$1$2, this) != coroutineSingletons) {
                    aVar = aVar2;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th3) {
                aVar = aVar2;
                th = th3;
                zgz.a(null, th);
                this.L$0 = null;
                this.L$1 = zy11Var;
                this.label = 3;
                if (a.a(aVar, this) != coroutineSingletons) {
                }
            }
        }
        if (i != 1) {
            if (i == 2) {
                b.b(obj);
                return zy11Var;
            }
            if (i == 3) {
                b.b(obj);
            }
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th4 = (Throwable) this.L$1;
            b.b(obj);
            throw th4;
        }
        aVar = (a) this.L$1;
        try {
            b.b(obj);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th5) {
            th = th5;
            zgz.a(null, th);
            this.L$0 = null;
            this.L$1 = zy11Var;
            this.label = 3;
            if (a.a(aVar, this) != coroutineSingletons) {
            }
        }
        this.L$0 = null;
        this.L$1 = zy11Var;
        this.label = 2;
        return a.a(aVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
