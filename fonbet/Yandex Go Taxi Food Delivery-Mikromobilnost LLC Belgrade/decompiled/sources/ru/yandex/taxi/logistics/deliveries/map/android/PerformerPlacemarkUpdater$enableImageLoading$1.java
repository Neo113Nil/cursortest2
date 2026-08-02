package ru.yandex.taxi.logistics.deliveries.map.android;

import android.graphics.Bitmap;
import defpackage.dxa0;
import defpackage.exa0;
import defpackage.hdu;
import defpackage.hxa0;
import defpackage.j0c0;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pav;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj0c0;", "loadable", "Lfxa0;", "<anonymous>", "(Lj0c0;)Lfxa0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.deliveries.map.android.PerformerPlacemarkUpdater$enableImageLoading$1", f = "PerformerPlacemarkUpdater.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PerformerPlacemarkUpdater$enableImageLoading$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ hxa0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformerPlacemarkUpdater$enableImageLoading$1(hxa0 hxa0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hxa0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PerformerPlacemarkUpdater$enableImageLoading$1 performerPlacemarkUpdater$enableImageLoading$1 = new PerformerPlacemarkUpdater$enableImageLoading$1(this.this$0, continuation);
        performerPlacemarkUpdater$enableImageLoading$1.L$0 = obj;
        return performerPlacemarkUpdater$enableImageLoading$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PerformerPlacemarkUpdater$enableImageLoading$1) create((j0c0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j0c0 j0c0Var = (j0c0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                hdu hduVar = this.this$0.c;
                String str = j0c0Var.b;
                this.L$0 = j0c0Var;
                this.label = 1;
                obj = ((pav) hduVar.b).b().b(((m7x0) ((k7x0) hduVar.a)).a(str)).a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return new exa0(j0c0Var, (Bitmap) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new dxa0(j0c0Var, th);
        }
    }
}
