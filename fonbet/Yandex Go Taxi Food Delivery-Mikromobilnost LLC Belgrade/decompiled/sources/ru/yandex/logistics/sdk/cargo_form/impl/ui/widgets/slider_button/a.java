package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slider_button;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.aps0;
import defpackage.gps0;
import defpackage.ips0;
import defpackage.jps0;
import defpackage.lvi0;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.sbv;
import defpackage.vos0;
import defpackage.x2s;
import defpackage.x9x0;
import defpackage.zos0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;

/* loaded from: classes5.dex */
public final class a {
    public final q8s a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;

    public a(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = q8sVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zos0 zos0Var, FormLoadingStateRepository$State formLoadingStateRepository$State, boolean z, ContinuationImpl continuationImpl) {
        SliderButtonMapper$map$1 sliderButtonMapper$map$1;
        int i;
        int i2;
        x2s x2sVar;
        jps0 jps0Var;
        Object a;
        vos0 vos0Var;
        jps0 jps0Var2;
        zos0 zos0Var2;
        int i3;
        ips0 ips0Var;
        FormattedText formattedText;
        boolean z2;
        CharSequence charSequence;
        x2s x2sVar2;
        vos0 vos0Var2;
        CharSequence charSequence2;
        Object a2;
        CharSequence charSequence3;
        x2s x2sVar3;
        vos0 vos0Var3;
        boolean z3 = z;
        if (continuationImpl instanceof SliderButtonMapper$map$1) {
            sliderButtonMapper$map$1 = (SliderButtonMapper$map$1) continuationImpl;
            int i4 = sliderButtonMapper$map$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                sliderButtonMapper$map$1.label = i4 - Integer.MIN_VALUE;
                Object obj = sliderButtonMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sliderButtonMapper$map$1.label;
                q8s q8sVar = this.a;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i2 = (formLoadingStateRepository$State == FormLoadingStateRepository$State.LOADING || z3) ? 1 : 0;
                    vos0 vos0Var4 = zos0Var.d;
                    vos0 vos0Var5 = zos0Var.c;
                    int i5 = vos0Var4 != null ? 1 : 0;
                    if (i2 == 0 || vos0Var4 == null) {
                        vos0Var4 = vos0Var5;
                    }
                    x2sVar = new x2s(null, null);
                    if (vos0Var4.e || (ips0Var = vos0Var4.d) == null) {
                        jps0Var = null;
                    } else {
                        sbv sbvVar = ips0Var.a;
                        lvi0 g = sbvVar != null ? ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, sbvVar, null, null, 14) : null;
                        sbv sbvVar2 = ips0Var.b;
                        lvi0 g2 = sbvVar2 != null ? ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, sbvVar2, null, null, 14) : null;
                        String str = ips0Var.c;
                        jps0Var = new jps0(g, g2, str != null ? aVar.g.f(str) : null);
                    }
                    FormattedText formattedText2 = vos0Var4.a;
                    sliderButtonMapper$map$1.L$0 = zos0Var;
                    sliderButtonMapper$map$1.L$1 = null;
                    sliderButtonMapper$map$1.L$2 = vos0Var4;
                    sliderButtonMapper$map$1.L$3 = x2sVar;
                    sliderButtonMapper$map$1.L$4 = jps0Var;
                    sliderButtonMapper$map$1.Z$0 = z3;
                    sliderButtonMapper$map$1.I$0 = i2;
                    sliderButtonMapper$map$1.I$1 = i5;
                    sliderButtonMapper$map$1.label = 1;
                    a = q8sVar.a(formattedText2, sliderButtonMapper$map$1);
                    if (a != coroutineSingletons) {
                        jps0 jps0Var3 = jps0Var;
                        vos0Var = vos0Var4;
                        jps0Var2 = jps0Var3;
                        zos0Var2 = zos0Var;
                        i3 = i5;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = sliderButtonMapper$map$1.I$1;
                    int i6 = sliderButtonMapper$map$1.I$0;
                    charSequence3 = (CharSequence) sliderButtonMapper$map$1.L$6;
                    jps0Var2 = (jps0) sliderButtonMapper$map$1.L$4;
                    x2sVar3 = (x2s) sliderButtonMapper$map$1.L$3;
                    vos0Var3 = (vos0) sliderButtonMapper$map$1.L$2;
                    zos0 zos0Var3 = (zos0) sliderButtonMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    zos0Var2 = zos0Var3;
                    a2 = obj;
                    i2 = i6;
                    z2 = false;
                    charSequence2 = (CharSequence) a2;
                    charSequence = charSequence3;
                    vos0Var2 = vos0Var3;
                    x2sVar2 = x2sVar3;
                    jps0 jps0Var4 = jps0Var2;
                    zos0 zos0Var4 = zos0Var2;
                    String str2 = vos0Var2.c;
                    return new gps0(new aps0(charSequence, charSequence2, str2 != null ? aVar.g.f(str2) : null, jps0Var4, (zos0Var4.b || !(i3 == 0 || i2 == 0)) ? z2 : true, (i3 != 0 || i2 == 0) ? vos0Var2.e : true, new x9x0(zos0Var4.e, null, null, x2sVar2, 6)), x2sVar2, zos0Var4.a);
                }
                i3 = sliderButtonMapper$map$1.I$1;
                int i7 = sliderButtonMapper$map$1.I$0;
                boolean z4 = sliderButtonMapper$map$1.Z$0;
                jps0 jps0Var5 = (jps0) sliderButtonMapper$map$1.L$4;
                x2s x2sVar4 = (x2s) sliderButtonMapper$map$1.L$3;
                vos0Var = (vos0) sliderButtonMapper$map$1.L$2;
                zos0Var2 = (zos0) sliderButtonMapper$map$1.L$0;
                kotlin.b.b(obj);
                a = obj;
                i2 = i7;
                z3 = z4;
                jps0Var2 = jps0Var5;
                x2sVar = x2sVar4;
                CharSequence charSequence4 = (CharSequence) a;
                formattedText = vos0Var.b;
                if (formattedText != null) {
                    z2 = false;
                    charSequence = charSequence4;
                    x2sVar2 = x2sVar;
                    vos0Var2 = vos0Var;
                    charSequence2 = null;
                    jps0 jps0Var42 = jps0Var2;
                    zos0 zos0Var42 = zos0Var2;
                    String str22 = vos0Var2.c;
                    return new gps0(new aps0(charSequence, charSequence2, str22 != null ? aVar.g.f(str22) : null, jps0Var42, (zos0Var42.b || !(i3 == 0 || i2 == 0)) ? z2 : true, (i3 != 0 || i2 == 0) ? vos0Var2.e : true, new x9x0(zos0Var42.e, null, null, x2sVar2, 6)), x2sVar2, zos0Var42.a);
                }
                sliderButtonMapper$map$1.L$0 = zos0Var2;
                sliderButtonMapper$map$1.L$1 = null;
                sliderButtonMapper$map$1.L$2 = vos0Var;
                sliderButtonMapper$map$1.L$3 = x2sVar;
                sliderButtonMapper$map$1.L$4 = jps0Var2;
                sliderButtonMapper$map$1.L$5 = null;
                sliderButtonMapper$map$1.L$6 = charSequence4;
                sliderButtonMapper$map$1.Z$0 = z3;
                sliderButtonMapper$map$1.I$0 = i2;
                sliderButtonMapper$map$1.I$1 = i3;
                z2 = false;
                sliderButtonMapper$map$1.I$2 = 0;
                sliderButtonMapper$map$1.label = 2;
                a2 = q8sVar.a(formattedText, sliderButtonMapper$map$1);
                if (a2 != coroutineSingletons) {
                    charSequence3 = charSequence4;
                    x2sVar3 = x2sVar;
                    vos0Var3 = vos0Var;
                    charSequence2 = (CharSequence) a2;
                    charSequence = charSequence3;
                    vos0Var2 = vos0Var3;
                    x2sVar2 = x2sVar3;
                    jps0 jps0Var422 = jps0Var2;
                    zos0 zos0Var422 = zos0Var2;
                    String str222 = vos0Var2.c;
                    return new gps0(new aps0(charSequence, charSequence2, str222 != null ? aVar.g.f(str222) : null, jps0Var422, (zos0Var422.b || !(i3 == 0 || i2 == 0)) ? z2 : true, (i3 != 0 || i2 == 0) ? vos0Var2.e : true, new x9x0(zos0Var422.e, null, null, x2sVar2, 6)), x2sVar2, zos0Var422.a);
                }
                return coroutineSingletons;
            }
        }
        sliderButtonMapper$map$1 = new SliderButtonMapper$map$1(this, continuationImpl);
        Object obj2 = sliderButtonMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sliderButtonMapper$map$1.label;
        q8s q8sVar2 = this.a;
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.b;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) a;
        formattedText = vos0Var.b;
        if (formattedText != null) {
        }
    }
}
