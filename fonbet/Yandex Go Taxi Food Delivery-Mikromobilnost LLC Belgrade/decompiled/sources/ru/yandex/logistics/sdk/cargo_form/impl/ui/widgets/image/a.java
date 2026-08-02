package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.image;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.an91;
import defpackage.l690;
import defpackage.ldc;
import defpackage.lvi0;
import defpackage.ny61;
import defpackage.o690;
import defpackage.q8s;
import defpackage.qhv;
import defpackage.tdv;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;
    public final q8s b;

    public a(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = aVar;
        this.b = q8sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tdv tdvVar, ContinuationImpl continuationImpl) {
        ImageWidgetMapper$map$1 imageWidgetMapper$map$1;
        int i;
        ldc f;
        float f2;
        CharSequence charSequence;
        Object obj;
        float f3;
        o690 o690Var;
        l690 b;
        tdv tdvVar2 = tdvVar;
        if (continuationImpl instanceof ImageWidgetMapper$map$1) {
            imageWidgetMapper$map$1 = (ImageWidgetMapper$map$1) continuationImpl;
            int i2 = imageWidgetMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imageWidgetMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = imageWidgetMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageWidgetMapper$map$1.label;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = tdvVar2.b;
                    f = str != null ? aVar.g.f(str) : null;
                    float f4 = tdvVar2.c;
                    FormattedText formattedText = tdvVar2.d;
                    if (formattedText.a.isEmpty()) {
                        formattedText = null;
                    }
                    if (formattedText == null) {
                        f2 = f4;
                        charSequence = null;
                        ldc ldcVar = f;
                        lvi0 g = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, tdvVar2.f, null, null, 6);
                        ContentAlignment contentAlignment = tdvVar2.e;
                        ContentAlignment contentAlignment2 = tdvVar2.g;
                        String str2 = tdvVar2.a;
                        o690Var = tdvVar2.h;
                        if (o690Var != null) {
                            aVar.getClass();
                            b = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var);
                        } else {
                            b = an91.b(16.0f, 0.0f, 2);
                        }
                        return new qhv(ldcVar, f2, charSequence, contentAlignment, g, contentAlignment2, b, str2);
                    }
                    imageWidgetMapper$map$1.L$0 = tdvVar2;
                    imageWidgetMapper$map$1.L$1 = f;
                    imageWidgetMapper$map$1.L$2 = null;
                    imageWidgetMapper$map$1.F$0 = f4;
                    imageWidgetMapper$map$1.I$0 = 0;
                    imageWidgetMapper$map$1.label = 1;
                    Object a = this.b.a(formattedText, imageWidgetMapper$map$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    f3 = f4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f3 = imageWidgetMapper$map$1.F$0;
                    ldc ldcVar2 = (ldc) imageWidgetMapper$map$1.L$1;
                    tdv tdvVar3 = (tdv) imageWidgetMapper$map$1.L$0;
                    kotlin.b.b(obj2);
                    f = ldcVar2;
                    tdvVar2 = tdvVar3;
                    obj = obj2;
                }
                f2 = f3;
                charSequence = (CharSequence) obj;
                ldc ldcVar3 = f;
                lvi0 g2 = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, tdvVar2.f, null, null, 6);
                ContentAlignment contentAlignment3 = tdvVar2.e;
                ContentAlignment contentAlignment22 = tdvVar2.g;
                String str22 = tdvVar2.a;
                o690Var = tdvVar2.h;
                if (o690Var != null) {
                }
                return new qhv(ldcVar3, f2, charSequence, contentAlignment3, g2, contentAlignment22, b, str22);
            }
        }
        imageWidgetMapper$map$1 = new ImageWidgetMapper$map$1(this, continuationImpl);
        Object obj22 = imageWidgetMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageWidgetMapper$map$1.label;
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.a;
        if (i != 0) {
        }
        f2 = f3;
        charSequence = (CharSequence) obj;
        ldc ldcVar32 = f;
        lvi0 g22 = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar2, tdvVar2.f, null, null, 6);
        ContentAlignment contentAlignment32 = tdvVar2.e;
        ContentAlignment contentAlignment222 = tdvVar2.g;
        String str222 = tdvVar2.a;
        o690Var = tdvVar2.h;
        if (o690Var != null) {
        }
        return new qhv(ldcVar32, f2, charSequence, contentAlignment32, g22, contentAlignment222, b, str222);
    }
}
