package ru.yandex.taxi.requirements.ui.selector.usual;

import defpackage.ejj0;
import defpackage.jmw0;
import defpackage.ny61;
import defpackage.pv21;
import defpackage.qv21;
import defpackage.tcc;
import defpackage.tf70;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ qv21 b;

    public a(vpr vprVar, qv21 qv21Var) {
        this.a = vprVar;
        this.b = qv21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UsualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        OptionViewType optionViewType;
        if (continuation instanceof UsualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1) {
            usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 = (UsualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    jmw0 jmw0Var = (jmw0) obj;
                    List c = this.b.z.c(jmw0Var);
                    HashMap hashMap = new HashMap();
                    Iterator it = c.iterator();
                    while (true) {
                        int i3 = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = ((ejj0) it.next()).a;
                        Integer num = (Integer) hashMap.get(str);
                        if (num != null) {
                            i3 = num.intValue();
                        }
                        hashMap.put(str, Integer.valueOf(i3 + 1));
                    }
                    ArrayList<ejj0> arrayList = jmw0Var.s().c;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    for (ejj0 ejj0Var : arrayList) {
                        Integer num2 = (Integer) hashMap.get(ejj0Var.a);
                        int intValue = num2 != null ? num2.intValue() : 0;
                        String str2 = ejj0Var.a;
                        String str3 = (String) ejj0Var.o.get(Integer.valueOf(intValue));
                        if (str3 == null) {
                            str3 = ejj0Var.b;
                        }
                        String str4 = str3;
                        String str5 = ejj0Var.c;
                        int i4 = pv21.a[ejj0Var.f.ordinal()];
                        if (i4 == 1) {
                            optionViewType = OptionViewType.SPINNER;
                        } else if (i4 == 2) {
                            optionViewType = OptionViewType.CHECKBOX;
                        } else {
                            if (i4 != 3) {
                                w511.b();
                                return null;
                            }
                            optionViewType = OptionViewType.RADIO;
                        }
                        arrayList2.add(new tf70(str2, str4, str5, optionViewType, intValue, ejj0Var.e));
                    }
                    usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList2, usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1 = new UsualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = usualOptionSelectorPresenter$attachView$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
