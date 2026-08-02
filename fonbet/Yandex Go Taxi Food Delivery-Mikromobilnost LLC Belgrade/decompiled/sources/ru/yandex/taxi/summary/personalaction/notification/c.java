package ru.yandex.taxi.summary.personalaction.notification;

import defpackage.cu;
import defpackage.gu;
import defpackage.jh60;
import defpackage.jl40;
import defpackage.l3b0;
import defpackage.m3b0;
import defpackage.ny61;
import defpackage.qfo;
import defpackage.ri60;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.personalstate.api.network.objects.DataType;
import ru.yandex.taxi.personalstate.api.network.objects.OptionType;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar, l3b0 l3b0Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PersonalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1 personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1;
        int i;
        m3b0 m3b0Var;
        Object obj2;
        String str;
        List list;
        boolean z;
        jh60 jh60Var;
        jh60 jh60Var2;
        if (continuation instanceof PersonalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1) {
            personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1 = (PersonalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1) continuation;
            int i2 = personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    cu cuVar = (cu) obj;
                    DataType dataType = cuVar.a;
                    gu guVar = cuVar.c;
                    if (dataType != DataType.NOTIFICATION) {
                        m3b0Var = m3b0.m;
                    } else {
                        if (guVar != null) {
                            List list2 = guVar.f;
                            List list3 = guVar.d;
                            String str2 = guVar.a;
                            if (str2 != null) {
                                String str3 = guVar.b;
                                String str4 = guVar.c;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                if (dataType == null) {
                                    m3b0Var = m3b0.m;
                                } else {
                                    qfo qfoVar = guVar.e;
                                    if (qfoVar == null || (str = qfoVar.b) == null) {
                                        m3b0Var = m3b0.m;
                                    } else if (list3 == null) {
                                        m3b0Var = m3b0.m;
                                    } else {
                                        String str5 = qfoVar.a;
                                        String str6 = qfoVar.c;
                                        long j = 0;
                                        if (list2 == null || (jh60Var2 = (jh60) kotlin.collections.a.R(list2)) == null || !jl40.l(jh60Var2.a, "days_period")) {
                                            list = list3;
                                        } else {
                                            list = list3;
                                            j = TimeUnit.DAYS.toMillis(jh60Var2.b);
                                        }
                                        long j2 = j;
                                        int i3 = (list2 == null || (jh60Var = (jh60) kotlin.collections.a.R(list2)) == null) ? 0 : jh60Var.c;
                                        List list4 = list;
                                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                            Iterator it = list4.iterator();
                                            while (it.hasNext()) {
                                                ri60.a aVar = ((ri60) it.next()).b;
                                                if ((aVar != null ? aVar.a : null) == OptionType.SELECT_PAYMENT_THEN_REDIRECT) {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z = false;
                                        m3b0Var = new m3b0(str2, str3, str4, dataType, 2, str, str5, str6, z, list, j2, i3);
                                    }
                                    obj2 = null;
                                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$0 = obj2;
                                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$1 = obj2;
                                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$2 = obj2;
                                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$3 = obj2;
                                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.label = 1;
                                    if (this.a.emit(m3b0Var, personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            }
                        }
                        m3b0Var = m3b0.m;
                        obj2 = null;
                        personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$0 = obj2;
                        personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$1 = obj2;
                        personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$2 = obj2;
                        personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$3 = obj2;
                        personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.label = 1;
                        if (this.a.emit(m3b0Var, personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        }
                    }
                    obj2 = null;
                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$0 = obj2;
                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$1 = obj2;
                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$2 = obj2;
                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$3 = obj2;
                    personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(m3b0Var, personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1 = new PersonalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalActionNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
