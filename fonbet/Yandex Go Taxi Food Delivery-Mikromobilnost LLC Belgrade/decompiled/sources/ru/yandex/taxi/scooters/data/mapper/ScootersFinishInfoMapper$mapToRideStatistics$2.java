package ru.yandex.taxi.scooters.data.mapper;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.fef;
import defpackage.fmn0;
import defpackage.gmn0;
import defpackage.kmu;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgmn0;", "<anonymous>", "(Ltse;)Lgmn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.mapper.ScootersFinishInfoMapper$mapToRideStatistics$2", f = "ScootersFinishInfoMapper.kt", l = {177, 178, 179, SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoMapper$mapToRideStatistics$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ kmu.c $this_mapToRideStatistics;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoMapper$mapToRideStatistics$2(d dVar, kmu.c cVar, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$this_mapToRideStatistics = cVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersFinishInfoMapper$mapToRideStatistics$2 scootersFinishInfoMapper$mapToRideStatistics$2 = new ScootersFinishInfoMapper$mapToRideStatistics$2(this.this$0, this.$this_mapToRideStatistics, this.$currencyRules, continuation);
        scootersFinishInfoMapper$mapToRideStatistics$2.L$0 = obj;
        return scootersFinishInfoMapper$mapToRideStatistics$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoMapper$mapToRideStatistics$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0111  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh nohVar;
        noh nohVar2;
        fmn0 fmn0Var;
        noh nohVar3;
        noh nohVar4;
        Object k;
        fmn0 fmn0Var2;
        noh nohVar5;
        fmn0 fmn0Var3;
        Object k2;
        fmn0 fmn0Var4;
        fmn0 fmn0Var5;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new ScootersFinishInfoMapper$mapToRideStatistics$2$distanceAsync$1(this.this$0, this.$this_mapToRideStatistics, this.$currencyRules, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new ScootersFinishInfoMapper$mapToRideStatistics$2$speedAsync$1(this.this$0, this.$this_mapToRideStatistics, this.$currencyRules, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new ScootersFinishInfoMapper$mapToRideStatistics$2$durationAsync$1(this.this$0, this.$this_mapToRideStatistics, this.$currencyRules, null), 3);
            h = tje.h(tseVar, null, null, new ScootersFinishInfoMapper$mapToRideStatistics$2$priceAsync$1(this.this$0, this.$this_mapToRideStatistics, this.$currencyRules, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h3;
            this.L$3 = h4;
            this.L$4 = h;
            this.label = 1;
            obj = h2.s(this);
            if (obj != coroutineSingletons) {
                nohVar = h3;
                nohVar2 = h4;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                fmn0Var = (fmn0) this.L$5;
                nohVar4 = (noh) this.L$4;
                nohVar3 = (noh) this.L$3;
                kotlin.b.b(obj);
                fmn0 fmn0Var6 = (fmn0) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar4;
                this.L$5 = fmn0Var;
                this.L$6 = fmn0Var6;
                this.label = 3;
                k = nohVar3.k(this);
                if (k != coroutineSingletons) {
                    fmn0 fmn0Var7 = fmn0Var;
                    fmn0Var2 = fmn0Var6;
                    obj = k;
                    nohVar5 = nohVar4;
                    fmn0Var3 = fmn0Var7;
                    fmn0 fmn0Var8 = (fmn0) obj;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = fmn0Var3;
                    this.L$6 = fmn0Var2;
                    this.L$7 = fmn0Var8;
                    this.label = 4;
                    k2 = nohVar5.k(this);
                    if (k2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fmn0Var5 = (fmn0) this.L$7;
                fmn0Var4 = (fmn0) this.L$6;
                fmn0Var3 = (fmn0) this.L$5;
                kotlin.b.b(obj);
                return new gmn0(fmn0Var3, fmn0Var4, fmn0Var5, (fmn0) obj);
            }
            fmn0Var2 = (fmn0) this.L$6;
            fmn0Var3 = (fmn0) this.L$5;
            nohVar5 = (noh) this.L$4;
            kotlin.b.b(obj);
            fmn0 fmn0Var82 = (fmn0) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = fmn0Var3;
            this.L$6 = fmn0Var2;
            this.L$7 = fmn0Var82;
            this.label = 4;
            k2 = nohVar5.k(this);
            if (k2 != coroutineSingletons) {
                fmn0Var4 = fmn0Var2;
                fmn0Var5 = fmn0Var82;
                obj = k2;
                return new gmn0(fmn0Var3, fmn0Var4, fmn0Var5, (fmn0) obj);
            }
            return coroutineSingletons;
        }
        h = (noh) this.L$4;
        nohVar2 = (noh) this.L$3;
        nohVar = (noh) this.L$2;
        kotlin.b.b(obj);
        fmn0 fmn0Var9 = (fmn0) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar2;
        this.L$4 = h;
        this.L$5 = fmn0Var9;
        this.label = 2;
        Object k3 = nohVar.k(this);
        if (k3 != coroutineSingletons) {
            noh nohVar6 = h;
            fmn0Var = fmn0Var9;
            obj = k3;
            nohVar3 = nohVar2;
            nohVar4 = nohVar6;
            fmn0 fmn0Var62 = (fmn0) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = nohVar4;
            this.L$5 = fmn0Var;
            this.L$6 = fmn0Var62;
            this.label = 3;
            k = nohVar3.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
