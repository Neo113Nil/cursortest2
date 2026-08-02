package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result;

import android.content.Context;
import defpackage.a6o0;
import defpackage.ad5;
import defpackage.h6o0;
import defpackage.h8n0;
import defpackage.j9n0;
import defpackage.jco0;
import defpackage.kco0;
import defpackage.nqm0;
import defpackage.ny61;
import defpackage.pib0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.domain.m;

/* loaded from: classes6.dex */
public final class c extends ad5 {
    public final h8n0 A;
    public final m B;
    public final nqm0 C;
    public final ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.domain.a D;
    public final kco0 E;
    public final jco0 F;
    public final ScootersErrorCode G;
    public final a6o0 H;
    public final tls I;
    public final j9n0 J;
    public final Context x;
    public final tt2 y;
    public final h6o0 z;

    public c(Context context, tt2 tt2Var, h6o0 h6o0Var, h8n0 h8n0Var, m mVar, nqm0 nqm0Var, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.domain.a aVar, kco0 kco0Var, jco0 jco0Var, ScootersErrorCode scootersErrorCode, a6o0 a6o0Var, tls tlsVar, j9n0 j9n0Var) {
        super(pib0.class);
        this.x = context;
        this.y = tt2Var;
        this.z = h6o0Var;
        this.A = h8n0Var;
        this.B = mVar;
        this.C = nqm0Var;
        this.D = aVar;
        this.E = kco0Var;
        this.F = jco0Var;
        this.G = scootersErrorCode;
        this.H = a6o0Var;
        this.I = tlsVar;
        this.J = j9n0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|31|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if ((r0 instanceof ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        r3 = r0;
        defpackage.xby.l(defpackage.jst.e, "Scooters.Evolve: try finish " + r3.getErrorCode(), null, r3, "Error occurred when checking possibility to complete order with code " + r3.getErrorCode(), 2);
        ((defpackage.o9n0) r8.J).b(r0, new ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.ScootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$3$1(0, r8.J, defpackage.j9n0.class, "close", "close()V", 0), new ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.ScootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$3$2(0, r8, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.c.class, "realCompleteTrip", "realCompleteTrip()V", 0));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(c cVar, zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1 scootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof ScootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1) {
            scootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1 = (ScootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1) continuationImpl;
            int i2 = scootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    nqm0 nqm0Var = cVar.C;
                    scootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1.L$0 = null;
                    scootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1.label = 1;
                    if (nqm0Var.a.a(zuo0Var, scootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                cVar.Lg();
                return zy11.a;
            }
        }
        scootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1 = new ScootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1(cVar, continuationImpl);
        Object obj2 = scootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoResultPresenter$checkWhetherItIsPossibleToCompleteOrder$1.label;
        if (i != 0) {
        }
        cVar.Lg();
        return zy11.a;
    }

    public final void Lg() {
        ((pib0) Dg()).A8();
        tje.N(Jg(), null, null, new ScootersCompletionPhotoResultPresenter$realCompleteTrip$1(this, null), 3);
    }
}
