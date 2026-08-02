package ru.yandex.taxi.altpins.source.modal;

import defpackage.ad5;
import defpackage.bvf0;
import defpackage.da0;
import defpackage.g191;
import defpackage.kr0;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.qu;
import defpackage.tg9;
import defpackage.xx1;
import defpackage.yfa;
import defpackage.zx1;
import defpackage.zy11;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class d extends ad5 {
    public final pwy0 A;
    public final e B;
    public final kr0 C;
    public final tg9 D;
    public final yfa E;
    public final r0 F;
    public final String G;
    public final g191 x;
    public final a y;
    public final xx1 z;

    public d(g191 g191Var, a aVar, xx1 xx1Var, pwy0 pwy0Var, e eVar, kr0 kr0Var, tg9 tg9Var, yfa yfaVar) {
        super(zx1.class);
        this.x = g191Var;
        this.y = aVar;
        this.z = xx1Var;
        this.A = pwy0Var;
        this.B = eVar;
        this.C = kr0Var;
        this.D = tg9Var;
        this.E = yfaVar;
        this.F = bvf0.c(Boolean.FALSE);
        this.G = UUID.randomUUID().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(d dVar, ContinuationImpl continuationImpl) {
        AlternativeSourceModalViewPresenter$finish$1 alternativeSourceModalViewPresenter$finish$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof AlternativeSourceModalViewPresenter$finish$1) {
            alternativeSourceModalViewPresenter$finish$1 = (AlternativeSourceModalViewPresenter$finish$1) continuationImpl;
            int i2 = alternativeSourceModalViewPresenter$finish$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alternativeSourceModalViewPresenter$finish$1.label = i2 - Integer.MIN_VALUE;
                Object obj = alternativeSourceModalViewPresenter$finish$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = alternativeSourceModalViewPresenter$finish$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = dVar.B;
                    xx1 xx1Var = dVar.z;
                    String str = xx1Var.a;
                    String str2 = xx1Var.b.a;
                    alternativeSourceModalViewPresenter$finish$1.label = 1;
                    if (eVar.a(str, str2, alternativeSourceModalViewPresenter$finish$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ((da0) dVar.x.a).r(new qu(9));
                return zy11.a;
            }
        }
        alternativeSourceModalViewPresenter$finish$1 = new AlternativeSourceModalViewPresenter$finish$1(dVar, continuationImpl);
        Object obj2 = alternativeSourceModalViewPresenter$finish$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = alternativeSourceModalViewPresenter$finish$1.label;
        if (i != 0) {
        }
        ((da0) dVar.x.a).r(new qu(9));
        return zy11.a;
    }
}
