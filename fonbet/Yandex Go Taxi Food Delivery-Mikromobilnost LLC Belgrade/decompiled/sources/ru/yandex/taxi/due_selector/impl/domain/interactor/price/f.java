package ru.yandex.taxi.due_selector.impl.domain.interactor.price;

import defpackage.cwd;
import defpackage.hwm;
import defpackage.iwm;
import defpackage.jst;
import defpackage.kwm;
import defpackage.lwm;
import defpackage.ny61;
import defpackage.vwm;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class f {
    public final com.yandex.go.taxi.tariffs.repository.a a;
    public final lwm b;
    public final vwm c;

    public f(com.yandex.go.taxi.tariffs.repository.a aVar, lwm lwmVar, vwm vwmVar) {
        this.a = aVar;
        this.b = lwmVar;
        this.c = vwmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Calendar calendar, String str, boolean z, Integer num, ContinuationImpl continuationImpl) {
        DuePickerScheduledOrderPriceInteractor$getPriceState$1 duePickerScheduledOrderPriceInteractor$getPriceState$1;
        int i;
        String str2;
        try {
            if (continuationImpl instanceof DuePickerScheduledOrderPriceInteractor$getPriceState$1) {
                duePickerScheduledOrderPriceInteractor$getPriceState$1 = (DuePickerScheduledOrderPriceInteractor$getPriceState$1) continuationImpl;
                int i2 = duePickerScheduledOrderPriceInteractor$getPriceState$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    duePickerScheduledOrderPriceInteractor$getPriceState$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = duePickerScheduledOrderPriceInteractor$getPriceState$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = duePickerScheduledOrderPriceInteractor$getPriceState$1.label;
                    lwm lwmVar = this.b;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (calendar == null || str == null) {
                            return hwm.c;
                        }
                        if (z && (str2 = (String) lwmVar.a.get(new kwm(calendar.getTimeInMillis(), str))) != null && str2.length() != 0) {
                            return new iwm(str2);
                        }
                        com.yandex.go.taxi.tariffs.repository.a aVar = this.a;
                        duePickerScheduledOrderPriceInteractor$getPriceState$1.L$0 = calendar;
                        duePickerScheduledOrderPriceInteractor$getPriceState$1.L$1 = str;
                        duePickerScheduledOrderPriceInteractor$getPriceState$1.L$2 = null;
                        duePickerScheduledOrderPriceInteractor$getPriceState$1.Z$0 = z;
                        duePickerScheduledOrderPriceInteractor$getPriceState$1.label = 1;
                        obj = aVar.c(calendar, str, num, duePickerScheduledOrderPriceInteractor$getPriceState$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) duePickerScheduledOrderPriceInteractor$getPriceState$1.L$1;
                        calendar = (Calendar) duePickerScheduledOrderPriceInteractor$getPriceState$1.L$0;
                        kotlin.b.b(obj);
                    }
                    String a = this.c.a((cwd) obj);
                    lwmVar.a.put(new kwm(calendar.getTimeInMillis(), str), a);
                    return new iwm(a);
                }
            }
            if (i != 0) {
            }
            String a2 = this.c.a((cwd) obj);
            lwmVar.a.put(new kwm(calendar.getTimeInMillis(), str), a2);
            return new iwm(a2);
        } catch (Exception e) {
            jst.e.c(String.format("Can't load price state", Arrays.copyOf(new Object[]{e}, 1)));
            return hwm.a;
        }
        duePickerScheduledOrderPriceInteractor$getPriceState$1 = new DuePickerScheduledOrderPriceInteractor$getPriceState$1(this, continuationImpl);
        Object obj2 = duePickerScheduledOrderPriceInteractor$getPriceState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = duePickerScheduledOrderPriceInteractor$getPriceState$1.label;
        lwm lwmVar2 = this.b;
    }
}
