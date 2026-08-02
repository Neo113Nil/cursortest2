package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.hsy0;
import defpackage.isy0;
import defpackage.j6s;
import defpackage.jsy0;
import defpackage.juy0;
import defpackage.ksy0;
import defpackage.kuy0;
import defpackage.l690;
import defpackage.luy0;
import defpackage.muy0;
import defpackage.ny61;
import defpackage.o690;
import defpackage.q8s;
import defpackage.r9x0;
import defpackage.w511;
import defpackage.x2s;
import defpackage.x9x0;
import defpackage.y7m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.TextAlignment;

/* loaded from: classes5.dex */
public final class b {
    public final q8s a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;

    public b(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = q8sVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ksy0 ksy0Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        TextWidgetMapper$map$1 textWidgetMapper$map$1;
        int i;
        ksy0 ksy0Var2 = ksy0Var;
        if (continuationImpl instanceof TextWidgetMapper$map$1) {
            textWidgetMapper$map$1 = (TextWidgetMapper$map$1) continuationImpl;
            int i2 = textWidgetMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textWidgetMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = textWidgetMapper$map$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = textWidgetMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jsy0 jsy0Var = ksy0Var2.b;
                    textWidgetMapper$map$1.L$0 = ksy0Var2;
                    textWidgetMapper$map$1.L$1 = null;
                    textWidgetMapper$map$1.label = 1;
                    obj = b(jsy0Var, j6sVar, textWidgetMapper$map$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ksy0Var2 = (ksy0) textWidgetMapper$map$1.L$0;
                    kotlin.b.b(obj);
                }
                luy0 luy0Var = (luy0) obj;
                Integer num = ksy0Var2.c;
                String str = ksy0Var2.h;
                y7m y7mVar = num == null ? new y7m(num.intValue()) : null;
                o690 o690Var = ksy0Var2.d;
                this.b.getClass();
                l690 i3 = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var);
                TextAlignment textAlignment = ksy0Var2.e;
                r9x0 r9x0Var = ksy0Var2.f;
                return new muy0(luy0Var, y7mVar, i3, textAlignment, r9x0Var == null ? new x9x0(r9x0Var, null, null, new x2s(str, null), 6) : null, ksy0Var2.g, new x2s(str, null), ksy0Var2.a);
            }
        }
        textWidgetMapper$map$1 = new TextWidgetMapper$map$1(this, continuationImpl);
        Object obj3 = textWidgetMapper$map$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = textWidgetMapper$map$1.label;
        if (i != 0) {
        }
        luy0 luy0Var2 = (luy0) obj3;
        Integer num2 = ksy0Var2.c;
        String str2 = ksy0Var2.h;
        if (num2 == null) {
        }
        o690 o690Var2 = ksy0Var2.d;
        this.b.getClass();
        l690 i32 = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var2);
        TextAlignment textAlignment2 = ksy0Var2.e;
        r9x0 r9x0Var2 = ksy0Var2.f;
        return new muy0(luy0Var2, y7mVar, i32, textAlignment2, r9x0Var2 == null ? new x9x0(r9x0Var2, null, null, new x2s(str2, null), 6) : null, ksy0Var2.g, new x2s(str2, null), ksy0Var2.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(jsy0 jsy0Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        TextWidgetMapper$mapText$1 textWidgetMapper$mapText$1;
        int i;
        if (continuationImpl instanceof TextWidgetMapper$mapText$1) {
            textWidgetMapper$mapText$1 = (TextWidgetMapper$mapText$1) continuationImpl;
            int i2 = textWidgetMapper$mapText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textWidgetMapper$mapText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = textWidgetMapper$mapText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = textWidgetMapper$mapText$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(jsy0Var instanceof isy0)) {
                        if (!(jsy0Var instanceof hsy0)) {
                            w511.b();
                            return null;
                        }
                        hsy0 hsy0Var = (hsy0) jsy0Var;
                        Object obj2 = j6sVar.a.get(hsy0Var.a);
                        String str = obj2 instanceof String ? (String) obj2 : null;
                        if (str == null) {
                            str = "";
                        }
                        return new kuy0(str, this.b.v(hsy0Var.b));
                    }
                    FormattedText formattedText = ((isy0) jsy0Var).a;
                    textWidgetMapper$mapText$1.L$0 = jsy0Var;
                    textWidgetMapper$mapText$1.L$1 = null;
                    textWidgetMapper$mapText$1.label = 1;
                    obj = this.a.a(formattedText, textWidgetMapper$mapText$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jsy0Var = (jsy0) textWidgetMapper$mapText$1.L$0;
                    kotlin.b.b(obj);
                }
                return new juy0((CharSequence) obj, ((isy0) jsy0Var).b);
            }
        }
        textWidgetMapper$mapText$1 = new TextWidgetMapper$mapText$1(this, continuationImpl);
        Object obj3 = textWidgetMapper$mapText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = textWidgetMapper$mapText$1.label;
        if (i != 0) {
        }
        return new juy0((CharSequence) obj3, ((isy0) jsy0Var).b);
    }
}
