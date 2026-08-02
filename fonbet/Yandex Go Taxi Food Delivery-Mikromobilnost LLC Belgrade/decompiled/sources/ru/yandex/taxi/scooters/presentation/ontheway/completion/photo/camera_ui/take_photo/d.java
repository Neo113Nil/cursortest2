package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo;

import defpackage.a6o0;
import defpackage.ad5;
import defpackage.ico0;
import defpackage.j9n0;
import defpackage.jco0;
import defpackage.kco0;
import defpackage.nqm0;
import defpackage.ny61;
import defpackage.pan0;
import defpackage.tje;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.m;

/* loaded from: classes6.dex */
public final class d extends ad5 {
    public final ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.c A;
    public final jco0 B;
    public final a6o0 C;
    public final ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a D;
    public final j9n0 E;
    public boolean F;
    public final m x;
    public final nqm0 y;
    public final kco0 z;

    public d(m mVar, nqm0 nqm0Var, kco0 kco0Var, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.c cVar, jco0 jco0Var, a6o0 a6o0Var, ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar, j9n0 j9n0Var) {
        super(pan0.class);
        this.x = mVar;
        this.y = nqm0Var;
        this.z = kco0Var;
        this.A = cVar;
        this.B = jco0Var;
        this.C = a6o0Var;
        this.D = aVar;
        this.E = j9n0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|30|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if ((r0 instanceof ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        r11 = r0;
        defpackage.xby.l(defpackage.jst.e, "Scooters.Evolve: try finish " + r11.getErrorCode(), null, r11, "Error occurred when checking possibility to complete order with code " + r11.getErrorCode(), 2);
        ((defpackage.o9n0) r14.E).b(r0, new ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.ScootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$3$1(0, r14, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.d.class, "close", "close()V", 0), new ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.ScootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$3$2(0, r14, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.d.class, "realTakePicture", "realTakePicture()V", 0));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(d dVar, zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1 scootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof ScootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1) {
            scootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1 = (ScootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1) continuationImpl;
            int i2 = scootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    nqm0 nqm0Var = dVar.y;
                    scootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1.L$0 = null;
                    scootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1.label = 1;
                    if (nqm0Var.a.a(zuo0Var, scootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                dVar.Mg();
                return zy11.a;
            }
        }
        scootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1 = new ScootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1(dVar, continuationImpl);
        Object obj2 = scootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionTakePhotoPresenter$checkWhetherItIsPossibleToCompleteOrder$1.label;
        if (i != 0) {
        }
        dVar.Mg();
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Lg(d dVar, ContinuationImpl continuationImpl) {
        ScootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1 scootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1;
        int i;
        ico0 ico0Var;
        dVar.getClass();
        if (continuationImpl instanceof ScootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1) {
            scootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1 = (ScootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1) continuationImpl;
            int i2 = scootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jco0 jco0Var = dVar.B;
                    scootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1.label = 1;
                    obj = jco0Var.a.b(scootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ico0Var = (ico0) obj;
                if (ico0Var.b) {
                    kco0 kco0Var = dVar.z;
                    long j = ico0Var.c;
                    kco0Var.a = Long.valueOf(System.currentTimeMillis());
                    kco0Var.b = j;
                }
                return zy11.a;
            }
        }
        scootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1 = new ScootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1(dVar, continuationImpl);
        Object obj2 = scootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionTakePhotoPresenter$tryStartParkingValidationTimer$1.label;
        if (i != 0) {
        }
        ico0Var = (ico0) obj2;
        if (ico0Var.b) {
        }
        return zy11.a;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.F = false;
    }

    public final void Mg() {
        ((pan0) Dg()).o7();
        tje.N(Jg(), null, null, new ScootersCompletionTakePhotoPresenter$realTakePicture$1(this, null), 3);
    }
}
