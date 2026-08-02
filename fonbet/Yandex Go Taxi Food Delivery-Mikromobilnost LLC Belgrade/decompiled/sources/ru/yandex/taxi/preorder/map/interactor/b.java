package ru.yandex.taxi.preorder.map.interactor;

import android.graphics.drawable.BitmapDrawable;
import defpackage.b0c0;
import defpackage.bdc;
import defpackage.c0c0;
import defpackage.e6l0;
import defpackage.f0c0;
import defpackage.ny61;
import defpackage.qj6;
import defpackage.s8o;
import defpackage.sq00;
import defpackage.ufu;
import defpackage.xng0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class b {
    public final e a;

    public b(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qj6 qj6Var, e6l0 e6l0Var, ContinuationImpl continuationImpl) {
        DestinationBrandingPinInteractor$mapToMapPinInfo$1 destinationBrandingPinInteractor$mapToMapPinInfo$1;
        int i;
        String str;
        String str2;
        Integer num;
        e6l0 e6l0Var2;
        int i2;
        BitmapDrawable bitmapDrawable;
        f0c0 f0c0Var;
        f0c0 c0c0Var;
        if (continuationImpl instanceof DestinationBrandingPinInteractor$mapToMapPinInfo$1) {
            destinationBrandingPinInteractor$mapToMapPinInfo$1 = (DestinationBrandingPinInteractor$mapToMapPinInfo$1) continuationImpl;
            int i3 = destinationBrandingPinInteractor$mapToMapPinInfo$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                destinationBrandingPinInteractor$mapToMapPinInfo$1.label = i3 - Integer.MIN_VALUE;
                Object obj = destinationBrandingPinInteractor$mapToMapPinInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = destinationBrandingPinInteractor$mapToMapPinInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    str = qj6Var.a;
                    String str3 = qj6Var.b;
                    String str4 = qj6Var.d;
                    int i4 = xng0.textMain;
                    e eVar = this.a;
                    int m = s8o.m(((ufu) eVar.c).f(new bdc(i4), str4), eVar.a);
                    Integer c = eVar.c(qj6Var.e);
                    String str5 = qj6Var.c;
                    destinationBrandingPinInteractor$mapToMapPinInfo$1.L$0 = null;
                    destinationBrandingPinInteractor$mapToMapPinInfo$1.L$1 = e6l0Var;
                    destinationBrandingPinInteractor$mapToMapPinInfo$1.L$2 = str;
                    destinationBrandingPinInteractor$mapToMapPinInfo$1.L$3 = str3;
                    destinationBrandingPinInteractor$mapToMapPinInfo$1.L$4 = c;
                    destinationBrandingPinInteractor$mapToMapPinInfo$1.I$0 = m;
                    destinationBrandingPinInteractor$mapToMapPinInfo$1.label = 1;
                    Object f = e.f(eVar, str5, null, destinationBrandingPinInteractor$mapToMapPinInfo$1, 6);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str3;
                    num = c;
                    e6l0Var2 = e6l0Var;
                    obj = f;
                    i2 = m;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = destinationBrandingPinInteractor$mapToMapPinInfo$1.I$0;
                    num = (Integer) destinationBrandingPinInteractor$mapToMapPinInfo$1.L$4;
                    String str6 = (String) destinationBrandingPinInteractor$mapToMapPinInfo$1.L$3;
                    str = (String) destinationBrandingPinInteractor$mapToMapPinInfo$1.L$2;
                    e6l0Var2 = (e6l0) destinationBrandingPinInteractor$mapToMapPinInfo$1.L$1;
                    kotlin.b.b(obj);
                    str2 = str6;
                }
                String str7 = str;
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable == null) {
                    bitmapDrawable.setTint(i2);
                } else {
                    bitmapDrawable = null;
                }
                if (bitmapDrawable == null && num != null) {
                    c0c0Var = new b0c0(bitmapDrawable, num.intValue());
                } else {
                    if (bitmapDrawable != null) {
                        f0c0Var = null;
                        return new sq00(e6l0Var2.a, f0c0Var, true, null, bitmapDrawable == null ? e6l0Var2.b : null, str7, str2, false, false, null, null, 0.0f, 8064);
                    }
                    c0c0Var = new c0c0(bitmapDrawable);
                }
                f0c0Var = c0c0Var;
                if (bitmapDrawable == null) {
                }
                return new sq00(e6l0Var2.a, f0c0Var, true, null, bitmapDrawable == null ? e6l0Var2.b : null, str7, str2, false, false, null, null, 0.0f, 8064);
            }
        }
        destinationBrandingPinInteractor$mapToMapPinInfo$1 = new DestinationBrandingPinInteractor$mapToMapPinInfo$1(this, continuationImpl);
        Object obj2 = destinationBrandingPinInteractor$mapToMapPinInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = destinationBrandingPinInteractor$mapToMapPinInfo$1.label;
        if (i != 0) {
        }
        String str72 = str;
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable == null) {
        }
        if (bitmapDrawable == null) {
        }
        if (bitmapDrawable != null) {
        }
    }
}
