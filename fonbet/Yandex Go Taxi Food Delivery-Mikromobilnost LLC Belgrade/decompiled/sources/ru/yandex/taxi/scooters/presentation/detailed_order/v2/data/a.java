package ru.yandex.taxi.scooters.presentation.detailed_order.v2.data;

import com.yandex.go.coroutines.h;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.nyn0;
import defpackage.rqo;
import defpackage.scc;
import defpackage.sgn0;
import defpackage.sqm0;
import defpackage.tcc;
import defpackage.tgn0;
import defpackage.ugn0;
import defpackage.uh6;
import defpackage.vgn0;
import defpackage.zuo0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.q;
import ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment;

/* loaded from: classes6.dex */
public final class a {
    public final nyn0 a;
    public final h b;
    public final h c;

    public a(rqo rqoVar, q qVar, nyn0 nyn0Var) {
        this.a = nyn0Var;
        this.b = new h(new ScootersOrderSelectorFactory$multiOrderExperiment$1(qVar, null));
        this.c = new h(new ScootersOrderSelectorFactory$isOrderSelectorEnabled$1(rqoVar, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x006d, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sqm0 sqm0Var, String str, ContinuationImpl continuationImpl) {
        ScootersOrderSelectorFactory$create$1 scootersOrderSelectorFactory$create$1;
        Object obj;
        int i;
        sqm0 sqm0Var2;
        String str2;
        List C;
        String str3;
        int i2;
        if (continuationImpl instanceof ScootersOrderSelectorFactory$create$1) {
            scootersOrderSelectorFactory$create$1 = (ScootersOrderSelectorFactory$create$1) continuationImpl;
            int i3 = scootersOrderSelectorFactory$create$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersOrderSelectorFactory$create$1.label = i3 - Integer.MIN_VALUE;
                obj = scootersOrderSelectorFactory$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOrderSelectorFactory$create$1.label;
                h hVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersOrderSelectorFactory$create$1.L$0 = sqm0Var;
                    scootersOrderSelectorFactory$create$1.L$1 = str;
                    scootersOrderSelectorFactory$create$1.label = 1;
                    obj = this.c.a(scootersOrderSelectorFactory$create$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            str2 = (String) scootersOrderSelectorFactory$create$1.L$1;
                            sqm0Var2 = (sqm0) scootersOrderSelectorFactory$create$1.L$0;
                            kotlin.b.b(obj);
                            if (((ScootersMultiOrderExperiment) obj).b) {
                                C = uh6.C(sqm0Var2);
                                if (!C.isEmpty()) {
                                    int size = C.size();
                                    scootersOrderSelectorFactory$create$1.L$0 = null;
                                    scootersOrderSelectorFactory$create$1.L$1 = str2;
                                    scootersOrderSelectorFactory$create$1.L$2 = C;
                                    scootersOrderSelectorFactory$create$1.I$0 = size;
                                    scootersOrderSelectorFactory$create$1.label = 3;
                                    Object a = hVar.a(scootersOrderSelectorFactory$create$1);
                                    if (a != coroutineSingletons) {
                                        str3 = str2;
                                        i2 = size;
                                        obj = a;
                                        int i4 = 0;
                                        if (i2 >= ((ScootersMultiOrderExperiment) obj).d) {
                                        }
                                        if (C.size() > 1) {
                                        }
                                    }
                                    return coroutineSingletons;
                                }
                            }
                            return tgn0.a;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = scootersOrderSelectorFactory$create$1.I$0;
                        C = (List) scootersOrderSelectorFactory$create$1.L$2;
                        str3 = (String) scootersOrderSelectorFactory$create$1.L$1;
                        kotlin.b.b(obj);
                        int i42 = 0;
                        boolean z = i2 >= ((ScootersMultiOrderExperiment) obj).d && this.a.b.b() == null;
                        if (C.size() > 1) {
                            if (z) {
                                return sgn0.a;
                            }
                            return tgn0.a;
                        }
                        List list = C;
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        int i5 = 0;
                        for (Object obj2 : list) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                scc.m();
                                throw null;
                            }
                            zuo0 zuo0Var = (zuo0) obj2;
                            if (jl40.l(zuo0Var.getSessionId(), str3)) {
                                i42 = i5;
                            }
                            arrayList.add(new ugn0(zuo0Var.getSessionId(), String.valueOf(i6)));
                            i5 = i6;
                        }
                        return new vgn0(i42, arrayList, z);
                    }
                    str = (String) scootersOrderSelectorFactory$create$1.L$1;
                    sqm0Var = (sqm0) scootersOrderSelectorFactory$create$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    scootersOrderSelectorFactory$create$1.L$0 = sqm0Var;
                    scootersOrderSelectorFactory$create$1.L$1 = str;
                    scootersOrderSelectorFactory$create$1.label = 2;
                    obj = hVar.a(scootersOrderSelectorFactory$create$1);
                    if (obj != coroutineSingletons) {
                        String str4 = str;
                        sqm0Var2 = sqm0Var;
                        str2 = str4;
                        if (((ScootersMultiOrderExperiment) obj).b) {
                        }
                    }
                    return coroutineSingletons;
                }
                return tgn0.a;
            }
        }
        scootersOrderSelectorFactory$create$1 = new ScootersOrderSelectorFactory$create$1(this, continuationImpl);
        obj = scootersOrderSelectorFactory$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOrderSelectorFactory$create$1.label;
        h hVar2 = this.b;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return tgn0.a;
    }
}
