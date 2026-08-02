package ru.yandex.taxi;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.dub0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/widget/map/SourceOnMapControl$a;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.PinAlertAnimationInteractorImpl$alertStateFlow$1", f = "PinAlertAnimationInteractorImpl.kt", l = {47, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 54, 56, 59}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PinAlertAnimationInteractorImpl$alertStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ SourceOnMapControl.a $originState;
    final /* synthetic */ dub0.a $pinData;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinAlertAnimationInteractorImpl$alertStateFlow$1(f fVar, SourceOnMapControl.a aVar, dub0.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$originState = aVar;
        this.$pinData = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PinAlertAnimationInteractorImpl$alertStateFlow$1 pinAlertAnimationInteractorImpl$alertStateFlow$1 = new PinAlertAnimationInteractorImpl$alertStateFlow$1(this.this$0, this.$originState, this.$pinData, continuation);
        pinAlertAnimationInteractorImpl$alertStateFlow$1.L$0 = obj;
        return pinAlertAnimationInteractorImpl$alertStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinAlertAnimationInteractorImpl$alertStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        if (r1.emit(r3, r21) == r2) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        SourceOnMapControl.a aVar;
        long j2;
        long j3;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            SourceOnMapControl.a aVar2 = this.$originState;
            dub0.a aVar3 = this.$pinData;
            fVar.getClass();
            String str = aVar3 != null ? aVar3.a : null;
            String str2 = str == null ? "" : str;
            String str3 = aVar3 != null ? aVar3.b : null;
            SourceOnMapControl.a a = SourceOnMapControl.a.a(aVar2, null, str3 != null ? str3 : "", str2, false, null, true, false, null, 1977);
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    j = this.J$0;
                    kotlin.b.b(obj);
                    aVar = this.$originState;
                    this.L$0 = vprVar;
                    this.J$0 = j;
                    this.label = 3;
                    if (vprVar.emit(aVar, this) != coroutineSingletons) {
                        j2 = j;
                        this.L$0 = vprVar;
                        this.J$0 = j2;
                        this.label = 4;
                        if (kotlinx.coroutines.a.i(500L, this) != coroutineSingletons) {
                        }
                    }
                }
                if (i == 3) {
                    j2 = this.J$0;
                    kotlin.b.b(obj);
                    this.L$0 = vprVar;
                    this.J$0 = j2;
                    this.label = 4;
                    if (kotlinx.coroutines.a.i(500L, this) != coroutineSingletons) {
                        j3 = j2;
                        this.L$0 = null;
                        this.J$0 = j3;
                        this.label = 5;
                        if (vprVar.emit(null, this) != coroutineSingletons) {
                        }
                    }
                }
                if (i != 4) {
                    if (i == 5) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = this.J$0;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.J$0 = j3;
                this.label = 5;
                return vprVar.emit(null, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            kotlin.b.b(obj);
        }
        Long l = this.$pinData.c;
        if (l != null) {
            long longValue = l.longValue();
            long millis = TimeUnit.SECONDS.toMillis(longValue);
            this.L$0 = vprVar;
            this.J$0 = longValue;
            this.label = 2;
            if (kotlinx.coroutines.a.i(millis, this) != coroutineSingletons) {
                j = longValue;
                aVar = this.$originState;
                this.L$0 = vprVar;
                this.J$0 = j;
                this.label = 3;
                if (vprVar.emit(aVar, this) != coroutineSingletons) {
                }
            }
        }
    }
}
