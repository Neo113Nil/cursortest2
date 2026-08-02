package ru.yandex.taxi.logistics.sdk.promotions.impl.data;

import defpackage.ny61;
import defpackage.st2;
import defpackage.tje;
import defpackage.tpg;
import defpackage.u9s0;
import defpackage.vng;
import defpackage.zy11;
import java.util.Calendar;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class e {
    public final tpg a;
    public final st2 b;

    public e(tpg tpgVar, st2 st2Var) {
        this.a = tpgVar;
        this.b = st2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, String str, ContinuationImpl continuationImpl) {
        ShownCountRepository$dailyShowCount$1 shownCountRepository$dailyShowCount$1;
        Object obj;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof ShownCountRepository$dailyShowCount$1) {
            shownCountRepository$dailyShowCount$1 = (ShownCountRepository$dailyShowCount$1) continuationImpl;
            int i2 = shownCountRepository$dailyShowCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shownCountRepository$dailyShowCount$1.label = i2 - Integer.MIN_VALUE;
                obj = shownCountRepository$dailyShowCount$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shownCountRepository$dailyShowCount$1.label;
                int i3 = 0;
                if (i != 0) {
                    kotlin.b.b(obj);
                    shownCountRepository$dailyShowCount$1.L$0 = str;
                    shownCountRepository$dailyShowCount$1.label = 1;
                    obj = eVar.g(str, shownCountRepository$dailyShowCount$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        Integer num = (Integer) obj;
                        if (num != null) {
                            i3 = num.intValue();
                        }
                        return new Integer(i3);
                    }
                    str = (String) shownCountRepository$dailyShowCount$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    u9s0 u9s0Var = new u9s0(eVar.a.getData(), eVar, str, i3);
                    shownCountRepository$dailyShowCount$1.L$0 = null;
                    shownCountRepository$dailyShowCount$1.label = 2;
                    obj = kotlinx.coroutines.flow.e.A(u9s0Var, shownCountRepository$dailyShowCount$1);
                }
                return new Integer(i3);
            }
        }
        shownCountRepository$dailyShowCount$1 = new ShownCountRepository$dailyShowCount$1(eVar, continuationImpl);
        obj = shownCountRepository$dailyShowCount$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shownCountRepository$dailyShowCount$1.label;
        int i32 = 0;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return new Integer(i32);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, String str, ContinuationImpl continuationImpl) {
        ShownCountRepository$showCount$1 shownCountRepository$showCount$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof ShownCountRepository$showCount$1) {
            shownCountRepository$showCount$1 = (ShownCountRepository$showCount$1) continuationImpl;
            int i2 = shownCountRepository$showCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shownCountRepository$showCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shownCountRepository$showCount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shownCountRepository$showCount$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u9s0 u9s0Var = new u9s0(eVar.a.getData(), eVar, str, i3);
                    shownCountRepository$showCount$1.L$0 = null;
                    shownCountRepository$showCount$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.A(u9s0Var, shownCountRepository$showCount$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Integer num = (Integer) obj;
                return new Integer(num == null ? num.intValue() : 0);
            }
        }
        shownCountRepository$showCount$1 = new ShownCountRepository$showCount$1(eVar, continuationImpl);
        Object obj2 = shownCountRepository$showCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shownCountRepository$showCount$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        Integer num2 = (Integer) obj2;
        return new Integer(num2 == null ? num2.intValue() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(e eVar, String str, ContinuationImpl continuationImpl) {
        ShownCountRepository$usageCount$1 shownCountRepository$usageCount$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof ShownCountRepository$usageCount$1) {
            shownCountRepository$usageCount$1 = (ShownCountRepository$usageCount$1) continuationImpl;
            int i2 = shownCountRepository$usageCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shownCountRepository$usageCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shownCountRepository$usageCount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shownCountRepository$usageCount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u9s0 u9s0Var = new u9s0(eVar.a.getData(), eVar, str, 2);
                    shownCountRepository$usageCount$1.L$0 = null;
                    shownCountRepository$usageCount$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.A(u9s0Var, shownCountRepository$usageCount$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Integer num = (Integer) obj;
                return new Integer(num == null ? num.intValue() : 0);
            }
        }
        shownCountRepository$usageCount$1 = new ShownCountRepository$usageCount$1(eVar, continuationImpl);
        Object obj2 = shownCountRepository$usageCount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shownCountRepository$usageCount$1.label;
        if (i != 0) {
        }
        Integer num2 = (Integer) obj2;
        return new Integer(num2 == null ? num2.intValue() : 0);
    }

    public final Object d(String str, Continuation continuation) {
        return tje.k0(this.b.b, new ShownCountRepository$getShownCount$2(this, str, null), continuation);
    }

    public final Object e(String str, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(this.a, new ShownCountRepository$incrementShowCount$2(this, str, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    public final Object f(String str, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(this.a, new ShownCountRepository$incrementUsageCount$2(this, str, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, ContinuationImpl continuationImpl) {
        ShownCountRepository$wasShownToday$1 shownCountRepository$wasShownToday$1;
        int i;
        Long l;
        if (continuationImpl instanceof ShownCountRepository$wasShownToday$1) {
            shownCountRepository$wasShownToday$1 = (ShownCountRepository$wasShownToday$1) continuationImpl;
            int i2 = shownCountRepository$wasShownToday$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shownCountRepository$wasShownToday$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shownCountRepository$wasShownToday$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shownCountRepository$wasShownToday$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u9s0 u9s0Var = new u9s0(this.a.getData(), this, str, 3);
                    shownCountRepository$wasShownToday$1.L$0 = null;
                    shownCountRepository$wasShownToday$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.A(u9s0Var, shownCountRepository$wasShownToday$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                l = (Long) obj;
                if (l != null) {
                    return Boolean.FALSE;
                }
                long longValue = l.longValue();
                long I = vng.I();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(I);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(longValue);
                return Boolean.valueOf(calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1));
            }
        }
        shownCountRepository$wasShownToday$1 = new ShownCountRepository$wasShownToday$1(this, continuationImpl);
        Object obj2 = shownCountRepository$wasShownToday$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shownCountRepository$wasShownToday$1.label;
        if (i != 0) {
        }
        l = (Long) obj2;
        if (l != null) {
        }
    }
}
