package ru.yandex.taxi.scooters.presentation.share_location.data;

import android.location.Location;
import defpackage.cmt;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.nvo0;
import defpackage.ny61;
import defpackage.qvo0;
import defpackage.rvo0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/Object;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.share_location.data.ScootersShareLocationUpdateRepository$updateLocation$2", f = "ScootersShareLocationUpdateRepository.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersShareLocationUpdateRepository$updateLocation$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<Location> $locationsFromProviders;
    final /* synthetic */ mo21 $mostRelevant;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersShareLocationUpdateRepository$updateLocation$2(b bVar, mo21 mo21Var, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$mostRelevant = mo21Var;
        this.$locationsFromProviders = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersShareLocationUpdateRepository$updateLocation$2(this.this$0, this.$mostRelevant, this.$locationsFromProviders, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersShareLocationUpdateRepository$updateLocation$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
            List a = this.this$0.b.a();
            zzs a2 = this.$mostRelevant.a();
            float f = this.$mostRelevant.c;
            List<Location> list = this.$locationsFromProviders;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (Location location : list) {
                arrayList.add(new nvo0(location.getProvider(), new Float(location.getAccuracy()), new Long(location.getTime()), new zzs(location.getLatitude(), location.getLongitude(), 0, null, null, 28)));
            }
            cmt<zy11> a3 = this.this$0.c.a(new rvo0(new qvo0(a, arrayList, a2, f)));
            this.L$0 = null;
            this.label = 1;
            Object a4 = a3.a(this);
            return a4 == coroutineSingletons ? coroutineSingletons : a4;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            zgz.a(null, th);
            return th;
        }
    }
}
