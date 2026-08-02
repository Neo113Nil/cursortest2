package ru.yandex.taxi.superapp.orders.carnumber;

import android.text.SpannableStringBuilder;
import defpackage.bvc0;
import defpackage.jl40;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.q58;
import defpackage.s58;
import defpackage.t58;
import defpackage.vpr;
import defpackage.z280;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s58 b;

    public c(vpr vprVar, s58 s58Var) {
        this.a = vprVar;
        this.b = s58Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CarNumberBubbleOverlay$resume$$inlined$map$2$2$1 carNumberBubbleOverlay$resume$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof CarNumberBubbleOverlay$resume$$inlined$map$2$2$1) {
            carNumberBubbleOverlay$resume$$inlined$map$2$2$1 = (CarNumberBubbleOverlay$resume$$inlined$map$2$2$1) continuation;
            int i2 = carNumberBubbleOverlay$resume$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carNumberBubbleOverlay$resume$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = carNumberBubbleOverlay$resume$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carNumberBubbleOverlay$resume$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    z280 z280Var = (z280) obj;
                    s58 s58Var = this.b;
                    o2y0 o2y0Var = s58Var.a;
                    if (s58Var.o == null || !jl40.l(s58Var.p, o2y0Var.b().a)) {
                        bvc0 c = s58Var.h.a(o2y0Var.b(), false).c();
                        t58 t58Var = s58Var.i;
                        t58Var.c = s58Var.c.getResources().getDimensionPixelSize(mrg0.component_text_size_caption);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        CarPlateAppearanceExperiment.CarPlateUsage carPlateUsage = CarPlateAppearanceExperiment.CarPlateUsage.CAR_MAP_OBJECT;
                        List list = c.d;
                        t58Var.a(c, spannableStringBuilder, list != null ? list.contains(carPlateUsage) : false);
                        s58Var.o = spannableStringBuilder;
                        s58Var.p = o2y0Var.b().a;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = s58Var.o;
                    if (spannableStringBuilder2 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    q58 q58Var = new q58(z280Var.a, z280Var.b, z280Var.c, spannableStringBuilder2, z280Var.d + 1.0f);
                    carNumberBubbleOverlay$resume$$inlined$map$2$2$1.L$0 = null;
                    carNumberBubbleOverlay$resume$$inlined$map$2$2$1.L$1 = null;
                    carNumberBubbleOverlay$resume$$inlined$map$2$2$1.L$2 = null;
                    carNumberBubbleOverlay$resume$$inlined$map$2$2$1.L$3 = null;
                    carNumberBubbleOverlay$resume$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(q58Var, carNumberBubbleOverlay$resume$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        carNumberBubbleOverlay$resume$$inlined$map$2$2$1 = new CarNumberBubbleOverlay$resume$$inlined$map$2$2$1(this, continuation);
        Object obj22 = carNumberBubbleOverlay$resume$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carNumberBubbleOverlay$resume$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
