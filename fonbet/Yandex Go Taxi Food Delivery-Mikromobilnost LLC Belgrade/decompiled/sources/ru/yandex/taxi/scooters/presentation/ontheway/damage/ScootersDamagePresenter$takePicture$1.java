package ru.yandex.taxi.scooters.presentation.ontheway.damage;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w8v;
import defpackage.wls;
import defpackage.ybn0;
import defpackage.zjo0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.domain.model.ScootersPhotoShootingException;
import ru.yandex.taxi.scooters.domain.model.ScootersPhotosLimitException;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.damage.ScootersDamagePresenter$takePicture$1", f = "ScootersDamagePresenter.kt", l = {120, 122}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersDamagePresenter$takePicture$1 extends SuspendLambda implements wls {
    final /* synthetic */ w8v $imageCapture;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDamagePresenter$takePicture$1(d dVar, w8v w8vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$imageCapture = w8vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDamagePresenter$takePicture$1(this.this$0, this.$imageCapture, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDamagePresenter$takePicture$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r1.c(r4, r5, r8) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        w8v w8vVar;
        d dVar2;
        int size;
        Object Kg;
        d dVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar2 = (d) this.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable unused) {
                    }
                    return zy11.a;
                }
                size = this.I$0;
                d dVar4 = (d) this.L$2;
                w8vVar = (w8v) this.L$1;
                dVar3 = (d) this.L$0;
                try {
                    kotlin.b.b(obj);
                    Kg = obj;
                    dVar = dVar4;
                } catch (Throwable unused2) {
                    dVar2 = dVar4;
                }
                ((ybn0) dVar2.Dg()).enableShotButton();
                ((ybn0) dVar2.Dg()).s4(new ScootersPhotoShootingException());
                return zy11.a;
            }
            kotlin.b.b(obj);
            dVar = this.this$0;
            w8vVar = this.$imageCapture;
            try {
                size = dVar.E.f(dVar.B).size();
                this.L$0 = dVar;
                this.L$1 = w8vVar;
                this.L$2 = dVar;
                this.I$0 = size;
                this.label = 1;
                Kg = d.Kg(dVar, this);
                if (Kg == coroutineSingletons) {
                    return coroutineSingletons;
                }
                dVar3 = dVar;
            } catch (Throwable unused3) {
                dVar2 = dVar;
            }
            if (size < ((Number) Kg).intValue()) {
                ((ybn0) dVar3.Dg()).disableShotButton();
                zjo0 zjo0Var = dVar3.E;
                String str = dVar3.B;
                this.L$0 = dVar;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
            } else {
                ((ybn0) dVar3.Dg()).s4(new ScootersPhotosLimitException());
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
