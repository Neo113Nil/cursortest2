package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.go.layers.api.model.params.AutoScale;
import com.yandex.runtime.image.ImageProvider;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.bxu0;
import defpackage.ec4;
import defpackage.f0k;
import defpackage.fc4;
import defpackage.fkp;
import defpackage.hxu0;
import defpackage.jmp;
import defpackage.lz2;
import defpackage.mvg;
import defpackage.mz2;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pt3;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.vm00;
import defpackage.w1b1;
import defpackage.wls;
import defpackage.y2b1;
import defpackage.zy11;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lym00;", "<anonymous>", "(Ltse;)Lym00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.BodyComponentFactory$createMapObjectComponent$2$mapObject$1", f = "BodyComponentFactory.kt", l = {HProv.PROV_GOST_2001_DH, CalendarDayView.DISABLED_DAY_ALPHA, HProv.ALG_SID_SHA3_224, HProv.ALG_SID_SHA3_256, MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BodyComponentFactory$createMapObjectComponent$2$mapObject$1 extends SuspendLambda implements wls {
    final /* synthetic */ vm00 $animation;
    final /* synthetic */ fkp $feature;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyComponentFactory$createMapObjectComponent$2$mapObject$1(m mVar, fkp fkpVar, vm00 vm00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$feature = fkpVar;
        this.$animation = vm00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BodyComponentFactory$createMapObjectComponent$2$mapObject$1 bodyComponentFactory$createMapObjectComponent$2$mapObject$1 = new BodyComponentFactory$createMapObjectComponent$2$mapObject$1(this.this$0, this.$feature, this.$animation, continuation);
        bodyComponentFactory$createMapObjectComponent$2$mapObject$1.L$0 = obj;
        return bodyComponentFactory$createMapObjectComponent$2$mapObject$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BodyComponentFactory$createMapObjectComponent$2$mapObject$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x010e, code lost:
    
        if (r3 == r2) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0188  */
    /* JADX WARN: Type inference failed for: r3v15, types: [noh] */
    /* JADX WARN: Type inference failed for: r7v27, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        qoh h2;
        noh h3;
        Object s;
        Object k;
        noh nohVar;
        ImageProvider imageProvider;
        Object k2;
        noh nohVar2;
        ImageProvider imageProvider2;
        Object k3;
        ImageProvider imageProvider3;
        f0k f0kVar;
        char c;
        Float[] fArr;
        Float[] fArr2;
        PointF pointF;
        Float[] fArr3;
        Float[] fArr4;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h4 = tje.h(tseVar, null, null, new BodyComponentFactory$createMapObjectComponent$2$mapObject$1$normalStateImageProviderDeferred$1(this.this$0, this.$feature, null), 3);
            h = tje.h(tseVar, null, null, new BodyComponentFactory$createMapObjectComponent$2$mapObject$1$selectedStateImageProviderDeferred$1(this.this$0, this.$feature, null), 3);
            h2 = tje.h(tseVar, null, null, new BodyComponentFactory$createMapObjectComponent$2$mapObject$1$simplifiedNormalStateImageProviderDeferred$1(this.this$0, this.$feature, null), 3);
            h3 = tje.h(tseVar, null, null, new BodyComponentFactory$createMapObjectComponent$2$mapObject$1$simplifiedSelectedStateImageProviderDeferred$1(this.this$0, this.$feature, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.L$4 = h3;
            this.label = 1;
            s = h4.s(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    imageProvider = (ImageProvider) this.L$5;
                    nohVar = (noh) this.L$4;
                    ?? r7 = (noh) this.L$3;
                    kotlin.b.b(obj);
                    h2 = r7;
                    k = obj;
                    ImageProvider imageProvider4 = (ImageProvider) k;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = nohVar;
                    this.L$5 = imageProvider;
                    this.L$6 = imageProvider4;
                    this.label = 3;
                    k2 = h2.k(this);
                    if (k2 != coroutineSingletons) {
                        nohVar2 = nohVar;
                        imageProvider2 = imageProvider4;
                        ImageProvider imageProvider5 = (ImageProvider) k2;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = imageProvider;
                        this.L$6 = imageProvider2;
                        this.L$7 = imageProvider5;
                        this.label = 4;
                        k3 = nohVar2.k(this);
                        if (k3 != coroutineSingletons) {
                        }
                    }
                }
                if (i == 3) {
                    ImageProvider imageProvider6 = (ImageProvider) this.L$6;
                    ImageProvider imageProvider7 = (ImageProvider) this.L$5;
                    noh nohVar3 = (noh) this.L$4;
                    kotlin.b.b(obj);
                    imageProvider2 = imageProvider6;
                    imageProvider = imageProvider7;
                    nohVar2 = nohVar3;
                    k2 = obj;
                    ImageProvider imageProvider52 = (ImageProvider) k2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = imageProvider;
                    this.L$6 = imageProvider2;
                    this.L$7 = imageProvider52;
                    this.label = 4;
                    k3 = nohVar2.k(this);
                    if (k3 != coroutineSingletons) {
                        imageProvider3 = imageProvider52;
                        ImageProvider imageProvider8 = imageProvider2;
                        ImageProvider imageProvider9 = (ImageProvider) k3;
                        m mVar = this.this$0;
                        fkp fkpVar = this.$feature;
                        Bitmap bitmap = m.j;
                        mVar.getClass();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        jmp jmpVar = fkpVar.b;
                        jmp jmpVar2 = fkpVar.b;
                        if (jmpVar == null) {
                        }
                        if (f0kVar != null) {
                        }
                    }
                }
                if (i != 4) {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                ImageProvider imageProvider10 = (ImageProvider) this.L$7;
                imageProvider2 = (ImageProvider) this.L$6;
                ImageProvider imageProvider11 = (ImageProvider) this.L$5;
                kotlin.b.b(obj);
                imageProvider3 = imageProvider10;
                imageProvider = imageProvider11;
                k3 = obj;
                ImageProvider imageProvider82 = imageProvider2;
                ImageProvider imageProvider92 = (ImageProvider) k3;
                m mVar2 = this.this$0;
                fkp fkpVar2 = this.$feature;
                Bitmap bitmap2 = m.j;
                mVar2.getClass();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                jmp jmpVar3 = fkpVar2.b;
                jmp jmpVar22 = fkpVar2.b;
                f0kVar = jmpVar3 == null ? jmpVar3.j : null;
                if (f0kVar != null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                Float f = f0kVar.b;
                y2b1 y2b1Var = fc4.a;
                if (f == null || imageProvider3 == null) {
                    c = 1;
                } else {
                    AppearanceType appearanceType = AppearanceType.SIMPLIFIED;
                    Float f2 = jmpVar3.j.a;
                    if (f2 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    float floatValue = f2.floatValue();
                    bxu0 bxu0Var = jmpVar22.c;
                    if (bxu0Var == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    y2b1 ec4Var = bxu0Var.a != null ? new ec4(r7.intValue()) : y2b1Var;
                    Float f3 = jmpVar22.c.c;
                    float floatValue2 = f3 != null ? f3.floatValue() : 1.0f;
                    AutoScale autoScale = jmpVar22.c.d;
                    pt3 b = autoScale != null ? w1b1.b(autoScale) : null;
                    float f4 = mVar2.i;
                    hxu0 hxu0Var = jmpVar22.c.b;
                    if (hxu0Var == null || (fArr4 = hxu0Var.e) == null) {
                        c = 1;
                        pointF = mz2.a;
                    } else {
                        c = 1;
                        pointF = new PointF(fArr4[0].floatValue(), fArr4[1].floatValue());
                    }
                    PointF pointF2 = pointF;
                    hxu0 hxu0Var2 = jmpVar22.c.e;
                    linkedHashSet2.add(new lz2(imageProvider3, floatValue, ec4Var, floatValue2, b, f4, appearanceType, pointF2, imageProvider92, (hxu0Var2 == null || (fArr3 = hxu0Var2.e) == null) ? mz2.a : new PointF(fArr3[0].floatValue(), fArr3[c].floatValue())));
                }
                AppearanceType appearanceType2 = AppearanceType.NORMAL;
                Float f5 = jmpVar22.j.a;
                if (f5 == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                float floatValue3 = f5.floatValue();
                bxu0 bxu0Var2 = jmpVar22.b;
                if (bxu0Var2 == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                y2b1 ec4Var2 = bxu0Var2.a != null ? new ec4(r4.intValue()) : y2b1Var;
                Float f6 = jmpVar22.b.c;
                float floatValue4 = f6 != null ? f6.floatValue() : 1.0f;
                AutoScale autoScale2 = jmpVar22.b.d;
                pt3 b2 = autoScale2 != null ? w1b1.b(autoScale2) : null;
                float f7 = mVar2.i;
                hxu0 hxu0Var3 = jmpVar22.b.b;
                PointF pointF3 = (hxu0Var3 == null || (fArr2 = hxu0Var3.e) == null) ? mz2.a : new PointF(fArr2[0].floatValue(), fArr2[c].floatValue());
                hxu0 hxu0Var4 = jmpVar22.b.e;
                linkedHashSet2.add(new lz2(imageProvider, floatValue3, ec4Var2, floatValue4, b2, f7, appearanceType2, pointF3, imageProvider82, (hxu0Var4 == null || (fArr = hxu0Var4.e) == null) ? mz2.a : new PointF(fArr[0].floatValue(), fArr[c].floatValue())));
                m mVar3 = this.this$0;
                fkp fkpVar3 = this.$feature;
                vm00 vm00Var = this.$animation;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.label = 5;
                Object d = m.d(mVar3, fkpVar3, linkedHashSet2, vm00Var, this);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
            h3 = (noh) this.L$4;
            ?? r3 = (noh) this.L$3;
            h = (noh) this.L$2;
            kotlin.b.b(obj);
            h2 = r3;
            s = obj;
        }
        ImageProvider imageProvider12 = (ImageProvider) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = h3;
        this.L$5 = imageProvider12;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            nohVar = h3;
            imageProvider = imageProvider12;
            ImageProvider imageProvider42 = (ImageProvider) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = nohVar;
            this.L$5 = imageProvider;
            this.L$6 = imageProvider42;
            this.label = 3;
            k2 = h2.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
    }
}
