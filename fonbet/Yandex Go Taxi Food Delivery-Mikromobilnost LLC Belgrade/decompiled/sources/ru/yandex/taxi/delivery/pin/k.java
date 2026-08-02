package ru.yandex.taxi.delivery.pin;

import android.graphics.drawable.BitmapDrawable;
import defpackage.a0c0;
import defpackage.ati;
import defpackage.b0c0;
import defpackage.c0c0;
import defpackage.f0c0;
import defpackage.fji;
import defpackage.iji;
import defpackage.jgv;
import defpackage.jji;
import defpackage.kji;
import defpackage.mji;
import defpackage.mth;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tpr;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.ybo;
import defpackage.zzb0;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.tariffs.model.DeliveryPinType;

/* loaded from: classes5.dex */
public final class k {
    public final wiq0 a;
    public final ru.yandex.taxi.widget.utils.e b;
    public final jgv c;

    public k(wiq0 wiq0Var, ru.yandex.taxi.widget.utils.e eVar, jgv jgvVar) {
        this.a = wiq0Var;
        this.b = eVar;
        this.c = jgvVar;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new j(((com.yandex.go.taxi.tariffs.internal.repository.k) this.a).j.b(), this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(n7v n7vVar, Integer num, Integer num2, ContinuationImpl continuationImpl) {
        DeliveryPinInteractor$mapIconToPinState$1 deliveryPinInteractor$mapIconToPinState$1;
        int i;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof DeliveryPinInteractor$mapIconToPinState$1) {
            deliveryPinInteractor$mapIconToPinState$1 = (DeliveryPinInteractor$mapIconToPinState$1) continuationImpl;
            int i2 = deliveryPinInteractor$mapIconToPinState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPinInteractor$mapIconToPinState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryPinInteractor$mapIconToPinState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPinInteractor$mapIconToPinState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a = this.c.a(n7vVar);
                    if (a == null) {
                        bitmapDrawable = null;
                        if (bitmapDrawable != null && num != null) {
                            bitmapDrawable.setTint(num.intValue());
                        }
                        if (bitmapDrawable == null && num2 != null) {
                            return new b0c0(bitmapDrawable, num2.intValue());
                        }
                        if (bitmapDrawable != null) {
                            return new c0c0(bitmapDrawable);
                        }
                        return null;
                    }
                    deliveryPinInteractor$mapIconToPinState$1.L$0 = null;
                    deliveryPinInteractor$mapIconToPinState$1.L$1 = num;
                    deliveryPinInteractor$mapIconToPinState$1.L$2 = num2;
                    deliveryPinInteractor$mapIconToPinState$1.L$3 = null;
                    deliveryPinInteractor$mapIconToPinState$1.L$4 = null;
                    deliveryPinInteractor$mapIconToPinState$1.label = 1;
                    obj = ru.yandex.taxi.widget.utils.e.k(this.b, a, null, deliveryPinInteractor$mapIconToPinState$1, 14);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num2 = (Integer) deliveryPinInteractor$mapIconToPinState$1.L$2;
                    num = (Integer) deliveryPinInteractor$mapIconToPinState$1.L$1;
                    kotlin.b.b(obj);
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setTint(num.intValue());
                }
                if (bitmapDrawable == null) {
                }
                if (bitmapDrawable != null) {
                }
            }
        }
        deliveryPinInteractor$mapIconToPinState$1 = new DeliveryPinInteractor$mapIconToPinState$1(this, continuationImpl);
        Object obj2 = deliveryPinInteractor$mapIconToPinState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPinInteractor$mapIconToPinState$1.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable != null) {
        }
        if (bitmapDrawable == null) {
        }
        if (bitmapDrawable != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mji mjiVar, ybo yboVar, Integer num, ContinuationImpl continuationImpl) {
        DeliveryPinInteractor$mapToPinState$1 deliveryPinInteractor$mapToPinState$1;
        int i;
        Integer num2;
        Integer c;
        Object obj;
        Integer num3;
        Integer num4;
        Integer num5;
        f0c0 f0c0Var;
        Object obj2;
        f0c0 f0c0Var2;
        mji mjiVar2 = mjiVar;
        if (continuationImpl instanceof DeliveryPinInteractor$mapToPinState$1) {
            deliveryPinInteractor$mapToPinState$1 = (DeliveryPinInteractor$mapToPinState$1) continuationImpl;
            int i2 = deliveryPinInteractor$mapToPinState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPinInteractor$mapToPinState$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = deliveryPinInteractor$mapToPinState$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPinInteractor$mapToPinState$1.label;
                a0c0 a0c0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    String str = mjiVar2.f;
                    ru.yandex.taxi.widget.utils.e eVar = this.b;
                    if (str == null || (num2 = eVar.p(str)) == null) {
                        num2 = num;
                    }
                    String str2 = mjiVar2.e;
                    c = str2 != null ? eVar.c(str2) : null;
                    kji kjiVar = mjiVar2.c;
                    if (kjiVar instanceof jji) {
                        n7v n7vVar = ((jji) kjiVar).a;
                        deliveryPinInteractor$mapToPinState$1.L$0 = mjiVar2;
                        deliveryPinInteractor$mapToPinState$1.L$1 = null;
                        deliveryPinInteractor$mapToPinState$1.L$2 = null;
                        deliveryPinInteractor$mapToPinState$1.L$3 = num2;
                        deliveryPinInteractor$mapToPinState$1.L$4 = c;
                        deliveryPinInteractor$mapToPinState$1.L$5 = null;
                        deliveryPinInteractor$mapToPinState$1.label = 1;
                        Object b = b(n7vVar, num2, c, deliveryPinInteractor$mapToPinState$1);
                        if (b != obj4) {
                            obj2 = b;
                            num3 = c;
                            f0c0Var2 = (f0c0) obj2;
                            num5 = num3;
                            f0c0Var = f0c0Var2;
                            num4 = num2;
                        }
                    } else if (kjiVar instanceof iji) {
                        if (!yboVar.c) {
                            int i3 = yboVar.a;
                            a0c0Var = i3 <= 0 ? a0c0.c : new a0c0(String.valueOf(i3), Integer.valueOf(i3));
                        }
                        num4 = num2;
                        num5 = c;
                        f0c0Var = a0c0Var;
                    } else {
                        if (kjiVar != null) {
                            w511.b();
                            return null;
                        }
                        n7v n7vVar2 = mjiVar2.d;
                        if (n7vVar2 != null) {
                            deliveryPinInteractor$mapToPinState$1.L$0 = mjiVar2;
                            deliveryPinInteractor$mapToPinState$1.L$1 = null;
                            deliveryPinInteractor$mapToPinState$1.L$2 = null;
                            deliveryPinInteractor$mapToPinState$1.L$3 = num2;
                            deliveryPinInteractor$mapToPinState$1.L$4 = c;
                            deliveryPinInteractor$mapToPinState$1.L$5 = null;
                            deliveryPinInteractor$mapToPinState$1.L$6 = null;
                            deliveryPinInteractor$mapToPinState$1.label = 2;
                            Object b2 = b(n7vVar2, num2, c, deliveryPinInteractor$mapToPinState$1);
                            if (b2 != obj4) {
                                obj = b2;
                                num3 = c;
                                f0c0Var2 = (f0c0) obj;
                                if (f0c0Var2 == null) {
                                }
                                num5 = num3;
                                f0c0Var = f0c0Var2;
                                num4 = num2;
                            }
                        }
                        f0c0Var = zzb0.a;
                        num4 = num2;
                        num5 = c;
                    }
                    return obj4;
                }
                if (i == 1) {
                    num3 = (Integer) deliveryPinInteractor$mapToPinState$1.L$4;
                    Integer num6 = (Integer) deliveryPinInteractor$mapToPinState$1.L$3;
                    mji mjiVar3 = (mji) deliveryPinInteractor$mapToPinState$1.L$0;
                    kotlin.b.b(obj3);
                    num2 = num6;
                    mjiVar2 = mjiVar3;
                    obj2 = obj3;
                    f0c0Var2 = (f0c0) obj2;
                    num5 = num3;
                    f0c0Var = f0c0Var2;
                    num4 = num2;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num3 = (Integer) deliveryPinInteractor$mapToPinState$1.L$4;
                    Integer num7 = (Integer) deliveryPinInteractor$mapToPinState$1.L$3;
                    mji mjiVar4 = (mji) deliveryPinInteractor$mapToPinState$1.L$0;
                    kotlin.b.b(obj3);
                    num2 = num7;
                    mjiVar2 = mjiVar4;
                    obj = obj3;
                    f0c0Var2 = (f0c0) obj;
                    if (f0c0Var2 == null) {
                        c = num3;
                        f0c0Var = zzb0.a;
                        num4 = num2;
                        num5 = c;
                    }
                    num5 = num3;
                    f0c0Var = f0c0Var2;
                    num4 = num2;
                }
                String str3 = mjiVar2.g;
                String str4 = str3 != null ? "" : str3;
                String str5 = mjiVar2.h;
                String str6 = str5 != null ? "" : str5;
                Boolean bool = mjiVar2.j;
                boolean booleanValue = bool == null ? bool.booleanValue() : false;
                Boolean bool2 = mjiVar2.i;
                return new fji(f0c0Var, str4, str6, booleanValue, bool2 == null && !bool2.booleanValue(), num4, num5);
            }
        }
        deliveryPinInteractor$mapToPinState$1 = new DeliveryPinInteractor$mapToPinState$1(this, continuationImpl);
        Object obj32 = deliveryPinInteractor$mapToPinState$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPinInteractor$mapToPinState$1.label;
        a0c0 a0c0Var2 = null;
        if (i != 0) {
        }
        String str32 = mjiVar2.g;
        if (str32 != null) {
        }
        String str52 = mjiVar2.h;
        if (str52 != null) {
        }
        Boolean bool3 = mjiVar2.j;
        if (bool3 == null) {
        }
        Boolean bool22 = mjiVar2.i;
        return new fji(f0c0Var, str4, str6, booleanValue, bool22 == null && !bool22.booleanValue(), num4, num5);
    }

    public final Object d(pex0 pex0Var, DeliveryPinType deliveryPinType, ContinuationImpl continuationImpl) {
        Object obj;
        ati atiVar = pex0Var.Z;
        if (atiVar != null) {
            Iterator it = atiVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((mji) obj).a == deliveryPinType) {
                    break;
                }
            }
            mji mjiVar = (mji) obj;
            if (mjiVar != null) {
                Object c = c(mjiVar, pex0Var.h, null, continuationImpl);
                return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : (fji) c;
            }
        }
        return null;
    }

    public final mth e(boolean z) {
        wiq0 wiq0Var = this.a;
        return z ? ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).f() : ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).j.b();
    }
}
