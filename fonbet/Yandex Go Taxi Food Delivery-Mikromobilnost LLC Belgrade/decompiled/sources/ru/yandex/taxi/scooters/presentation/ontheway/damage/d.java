package ru.yandex.taxi.scooters.presentation.ontheway.damage;

import defpackage.ad5;
import defpackage.ney;
import defpackage.ny61;
import defpackage.p8k0;
import defpackage.pzt0;
import defpackage.ukn0;
import defpackage.y50;
import defpackage.ybn0;
import defpackage.z8n0;
import defpackage.zjo0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.o;
import ru.yandex.taxi.scooters.experiments.g0;

/* loaded from: classes6.dex */
public final class d extends ad5 {
    public final o A;
    public final String B;
    public pzt0 C;
    public boolean D;
    public final zjo0 E;
    public final y50 x;
    public final ney y;
    public final ukn0 z;

    public d(p8k0 p8k0Var, z8n0 z8n0Var, y50 y50Var, ney neyVar, ukn0 ukn0Var, o oVar, boolean z, String str) {
        super(ybn0.class);
        this.x = y50Var;
        this.y = neyVar;
        this.z = ukn0Var;
        this.A = oVar;
        this.B = str;
        this.E = z ? (zjo0) z8n0Var.get() : (zjo0) p8k0Var.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(d dVar, ContinuationImpl continuationImpl) {
        ScootersDamagePresenter$getMaxPhotoCount$1 scootersDamagePresenter$getMaxPhotoCount$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof ScootersDamagePresenter$getMaxPhotoCount$1) {
            scootersDamagePresenter$getMaxPhotoCount$1 = (ScootersDamagePresenter$getMaxPhotoCount$1) continuationImpl;
            int i2 = scootersDamagePresenter$getMaxPhotoCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDamagePresenter$getMaxPhotoCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDamagePresenter$getMaxPhotoCount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDamagePresenter$getMaxPhotoCount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ukn0 ukn0Var = dVar.z;
                    scootersDamagePresenter$getMaxPhotoCount$1.label = 1;
                    obj = ukn0Var.a.b(scootersDamagePresenter$getMaxPhotoCount$1);
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
                Integer num = ((g0) obj).f;
                return new Integer(num == null ? num.intValue() : 8);
            }
        }
        scootersDamagePresenter$getMaxPhotoCount$1 = new ScootersDamagePresenter$getMaxPhotoCount$1(dVar, continuationImpl);
        Object obj2 = scootersDamagePresenter$getMaxPhotoCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDamagePresenter$getMaxPhotoCount$1.label;
        if (i != 0) {
        }
        Integer num2 = ((g0) obj2).f;
        return new Integer(num2 == null ? num2.intValue() : 8);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        ((ybn0) Dg()).releaseCamera();
        this.D = false;
        super.Cg();
        this.y.d(this);
    }

    public final void dismiss() {
        if (this.E.e(this.B) > 0) {
            ((ybn0) Dg()).Y0();
        } else {
            ((ybn0) Dg()).dismissView();
        }
    }
}
