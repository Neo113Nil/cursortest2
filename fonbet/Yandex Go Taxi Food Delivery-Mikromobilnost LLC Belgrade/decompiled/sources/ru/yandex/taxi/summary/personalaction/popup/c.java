package ru.yandex.taxi.summary.personalaction.popup;

import defpackage.cu;
import defpackage.ju;
import defpackage.ny61;
import defpackage.q9e0;
import defpackage.t3b0;
import defpackage.u3b0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.personalstate.api.network.objects.DataType;
import ru.yandex.taxi.personalstate.api.network.objects.OptionType;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        r13 = defpackage.u3b0.f;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PersonalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1 personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1;
        int i;
        u3b0 u3b0Var;
        List list;
        OptionType optionType;
        if (continuation instanceof PersonalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1) {
            personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1 = (PersonalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1) continuation;
            int i2 = personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cu cuVar = (cu) obj;
                    DataType dataType = cuVar.a;
                    ju juVar = cuVar.b;
                    if (dataType != DataType.POPUP) {
                        u3b0Var = u3b0.f;
                    } else if (juVar == null || (list = juVar.c) == null) {
                        u3b0Var = u3b0.f;
                    } else if (list.isEmpty()) {
                        u3b0Var = u3b0.f;
                    } else {
                        String str = juVar.a;
                        String str2 = juVar.b;
                        if (str2 == null) {
                            u3b0Var = u3b0.f;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    q9e0 q9e0Var = (q9e0) it.next();
                                    String str3 = q9e0Var.a;
                                    if (str3 == null) {
                                        u3b0Var = u3b0.f;
                                        break;
                                    }
                                    q9e0.a aVar = q9e0Var.b;
                                    if (aVar == null || (optionType = aVar.a) == null) {
                                        break;
                                    }
                                    arrayList.add(new t3b0(str3, optionType, aVar.b, aVar.c));
                                } else {
                                    String str4 = juVar.e;
                                    u3b0Var = str4 == null ? u3b0.f : new u3b0(str, juVar.d, str2, str4, arrayList);
                                }
                            }
                        }
                    }
                    personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1.L$0 = null;
                    personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1.L$1 = null;
                    personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1.L$2 = null;
                    personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1.L$3 = null;
                    personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(u3b0Var, personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1 = new PersonalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalActionPopupInteractor$viewModelFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
