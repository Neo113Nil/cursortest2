package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.cost_detail;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.an91;
import defpackage.dty0;
import defpackage.ny61;
import defpackage.o690;
import defpackage.q8s;
import defpackage.xxe;
import defpackage.yxe;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final q8s a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;

    public b(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = q8sVar;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r14 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yxe yxeVar, ContinuationImpl continuationImpl) {
        CostDetailsMapper$map$1 costDetailsMapper$map$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        CharSequence charSequence;
        yxe yxeVar2;
        if (continuationImpl instanceof CostDetailsMapper$map$1) {
            costDetailsMapper$map$1 = (CostDetailsMapper$map$1) continuationImpl;
            int i2 = costDetailsMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                costDetailsMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = costDetailsMapper$map$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = costDetailsMapper$map$1.label;
                q8s q8sVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = yxeVar.b;
                    costDetailsMapper$map$1.L$0 = yxeVar;
                    costDetailsMapper$map$1.label = 1;
                    obj = q8sVar.a(formattedText, costDetailsMapper$map$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CharSequence charSequence2 = (CharSequence) costDetailsMapper$map$1.L$1;
                        yxeVar2 = (yxe) costDetailsMapper$map$1.L$0;
                        kotlin.b.b(obj);
                        charSequence = charSequence2;
                        CharSequence charSequence3 = (CharSequence) obj;
                        dty0 v = this.b.v(yxeVar2.d);
                        o690 o690Var = yxeVar2.e;
                        return new xxe(charSequence, charSequence3, v, o690Var == null ? ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var) : an91.b(24.0f, 0.0f, 2), yxeVar2.a);
                    }
                    yxeVar = (yxe) costDetailsMapper$map$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence4 = (CharSequence) obj;
                FormattedText formattedText2 = yxeVar.c;
                costDetailsMapper$map$1.L$0 = yxeVar;
                costDetailsMapper$map$1.L$1 = charSequence4;
                costDetailsMapper$map$1.label = 2;
                a = q8sVar.a(formattedText2, costDetailsMapper$map$1);
                if (a != coroutineSingletons) {
                    charSequence = charSequence4;
                    obj = a;
                    yxeVar2 = yxeVar;
                    CharSequence charSequence32 = (CharSequence) obj;
                    dty0 v2 = this.b.v(yxeVar2.d);
                    o690 o690Var2 = yxeVar2.e;
                    return new xxe(charSequence, charSequence32, v2, o690Var2 == null ? ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var2) : an91.b(24.0f, 0.0f, 2), yxeVar2.a);
                }
                return coroutineSingletons;
            }
        }
        costDetailsMapper$map$1 = new CostDetailsMapper$map$1(this, continuationImpl);
        Object obj2 = costDetailsMapper$map$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = costDetailsMapper$map$1.label;
        q8s q8sVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj2;
        FormattedText formattedText22 = yxeVar.c;
        costDetailsMapper$map$1.L$0 = yxeVar;
        costDetailsMapper$map$1.L$1 = charSequence42;
        costDetailsMapper$map$1.label = 2;
        a = q8sVar2.a(formattedText22, costDetailsMapper$map$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
