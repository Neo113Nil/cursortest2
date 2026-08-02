package ru.yandex.taxi.linked_order.mapper;

import defpackage.b4a0;
import defpackage.dny;
import defpackage.eny;
import defpackage.ftv;
import defpackage.jl40;
import defpackage.nly;
import defpackage.ny61;
import defpackage.o8a0;
import defpackage.oly;
import defpackage.ply;
import defpackage.qi11;
import defpackage.qly;
import defpackage.rly;
import defpackage.sly;
import defpackage.t0a0;
import defpackage.tcc;
import defpackage.tly;
import defpackage.upy;
import defpackage.v8a0;
import defpackage.w511;
import java.util.ArrayList;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.linked_order.models.data.IconType;

/* loaded from: classes5.dex */
public final class a {
    public final o8a0 a;

    public a(o8a0 o8a0Var) {
        this.a = o8a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tly tlyVar, ContinuationImpl continuationImpl) {
        LinkedOrderInfoDataMapper$getPaymentOptionInfo$1 linkedOrderInfoDataMapper$getPaymentOptionInfo$1;
        int i;
        v8a0 v8a0Var;
        if (continuationImpl instanceof LinkedOrderInfoDataMapper$getPaymentOptionInfo$1) {
            linkedOrderInfoDataMapper$getPaymentOptionInfo$1 = (LinkedOrderInfoDataMapper$getPaymentOptionInfo$1) continuationImpl;
            int i2 = linkedOrderInfoDataMapper$getPaymentOptionInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderInfoDataMapper$getPaymentOptionInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkedOrderInfoDataMapper$getPaymentOptionInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderInfoDataMapper$getPaymentOptionInfo$1.label;
                if (i != 0) {
                    b.b(obj);
                    b4a0 b4a0Var = PaymentMethod$Type.Companion;
                    String str = tlyVar.K;
                    b4a0Var.getClass();
                    PaymentMethod$Type a = b4a0.a(str);
                    linkedOrderInfoDataMapper$getPaymentOptionInfo$1.L$0 = null;
                    linkedOrderInfoDataMapper$getPaymentOptionInfo$1.L$1 = null;
                    linkedOrderInfoDataMapper$getPaymentOptionInfo$1.label = 1;
                    obj = ((ru.yandex.taxi.order.view.b) this.a).d(a, null, null, null, linkedOrderInfoDataMapper$getPaymentOptionInfo$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                v8a0Var = (v8a0) obj;
                if (v8a0Var == null) {
                    return v8a0Var.b;
                }
                return null;
            }
        }
        linkedOrderInfoDataMapper$getPaymentOptionInfo$1 = new LinkedOrderInfoDataMapper$getPaymentOptionInfo$1(this, continuationImpl);
        Object obj2 = linkedOrderInfoDataMapper$getPaymentOptionInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderInfoDataMapper$getPaymentOptionInfo$1.label;
        if (i != 0) {
        }
        v8a0Var = (v8a0) obj2;
        if (v8a0Var == null) {
        }
    }

    public final Object b(sly slyVar, ContinuationImpl continuationImpl) {
        if (!jl40.l(slyVar, rly.a) && !jl40.l(slyVar, qly.a)) {
            if (slyVar instanceof nly) {
                Object c = c(((nly) slyVar).a, false, continuationImpl);
                return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : (dny) c;
            }
            if (slyVar instanceof ply) {
                Object c2 = c(((ply) slyVar).a, true, continuationImpl);
                return c2 == CoroutineSingletons.COROUTINE_SUSPENDED ? c2 : (dny) c2;
            }
            if (slyVar instanceof oly) {
                tly tlyVar = ((oly) slyVar).a;
                if (tlyVar != null) {
                    Object c3 = c(tlyVar, false, continuationImpl);
                    return c3 == CoroutineSingletons.COROUTINE_SUSPENDED ? c3 : (dny) c3;
                }
            } else {
                w511.b();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b A[LOOP:0: B:22:0x0095->B:24:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(tly tlyVar, boolean z, ContinuationImpl continuationImpl) {
        LinkedOrderInfoDataMapper$mapState$1 linkedOrderInfoDataMapper$mapState$1;
        int i;
        boolean z2;
        String str;
        upy upyVar;
        String str2;
        String str3;
        qi11 qi11Var;
        tly tlyVar2 = tlyVar;
        if (continuationImpl instanceof LinkedOrderInfoDataMapper$mapState$1) {
            linkedOrderInfoDataMapper$mapState$1 = (LinkedOrderInfoDataMapper$mapState$1) continuationImpl;
            int i2 = linkedOrderInfoDataMapper$mapState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderInfoDataMapper$mapState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkedOrderInfoDataMapper$mapState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderInfoDataMapper$mapState$1.label;
                if (i != 0) {
                    b.b(obj);
                    linkedOrderInfoDataMapper$mapState$1.L$0 = tlyVar2;
                    linkedOrderInfoDataMapper$mapState$1.Z$0 = z;
                    linkedOrderInfoDataMapper$mapState$1.label = 1;
                    Object a = a(tlyVar2, linkedOrderInfoDataMapper$mapState$1);
                    if (a == obj2) {
                        return obj2;
                    }
                    z2 = z;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = linkedOrderInfoDataMapper$mapState$1.Z$0;
                    tlyVar2 = (tly) linkedOrderInfoDataMapper$mapState$1.L$0;
                    b.b(obj);
                    z2 = z3;
                }
                t0a0 t0a0Var = (t0a0) obj;
                str = tlyVar2.G;
                upyVar = tlyVar2.P;
                if (str.length() == 0) {
                    str = tlyVar2.e;
                }
                String str4 = str;
                str2 = tlyVar2.H;
                if (str2.length() == 0) {
                    str2 = tlyVar2.f;
                }
                String str5 = str2;
                boolean z4 = tlyVar2.h.length() <= 0;
                boolean z5 = upyVar == null;
                boolean z6 = tlyVar2.w;
                String str6 = tlyVar2.g;
                IconType iconType = tlyVar2.n;
                String str7 = tlyVar2.h;
                ArrayList<eny> arrayList = tlyVar2.i;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                for (eny enyVar : arrayList) {
                    arrayList2.add(new ftv(enyVar.a, enyVar.b, enyVar.c));
                    iconType = iconType;
                }
                IconType iconType2 = iconType;
                String str8 = tlyVar2.j;
                String str9 = tlyVar2.l;
                String str10 = tlyVar2.o;
                String str11 = tlyVar2.r;
                String str12 = tlyVar2.x;
                String str13 = tlyVar2.B;
                String str14 = tlyVar2.y;
                String str15 = tlyVar2.C;
                String str16 = tlyVar2.z;
                String str17 = tlyVar2.D;
                String str18 = tlyVar2.A;
                String str19 = tlyVar2.E;
                String str20 = tlyVar2.F;
                String str21 = tlyVar2.I;
                String str22 = tlyVar2.J;
                String str23 = tlyVar2.L;
                String str24 = tlyVar2.M;
                String str25 = tlyVar2.N;
                String str26 = tlyVar2.p;
                String str27 = tlyVar2.q;
                boolean z7 = tlyVar2.O;
                if (upyVar == null) {
                    str3 = str7;
                    qi11Var = new qi11(upyVar.a, upyVar.b);
                } else {
                    str3 = str7;
                    qi11Var = null;
                }
                return new dny(z2, z4, z5, z6, str4, str5, str6, iconType2, str3, str12, str14, str16, str18, arrayList2, str8, str9, str13, str15, str17, str19, str20, str10, str11, str21, str22, t0a0Var, str23, str24, str25, str26, str27, z7, qi11Var, tlyVar2.Q);
            }
        }
        linkedOrderInfoDataMapper$mapState$1 = new LinkedOrderInfoDataMapper$mapState$1(this, continuationImpl);
        Object obj3 = linkedOrderInfoDataMapper$mapState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderInfoDataMapper$mapState$1.label;
        if (i != 0) {
        }
        t0a0 t0a0Var2 = (t0a0) obj3;
        str = tlyVar2.G;
        upyVar = tlyVar2.P;
        if (str.length() == 0) {
        }
        String str42 = str;
        str2 = tlyVar2.H;
        if (str2.length() == 0) {
        }
        String str52 = str2;
        if (tlyVar2.h.length() <= 0) {
        }
        if (upyVar == null) {
        }
        boolean z62 = tlyVar2.w;
        String str62 = tlyVar2.g;
        IconType iconType3 = tlyVar2.n;
        String str72 = tlyVar2.h;
        ArrayList<eny> arrayList3 = tlyVar2.i;
        ArrayList arrayList22 = new ArrayList(tcc.n(arrayList3, 10));
        while (r4.hasNext()) {
        }
        IconType iconType22 = iconType3;
        String str82 = tlyVar2.j;
        String str92 = tlyVar2.l;
        String str102 = tlyVar2.o;
        String str112 = tlyVar2.r;
        String str122 = tlyVar2.x;
        String str132 = tlyVar2.B;
        String str142 = tlyVar2.y;
        String str152 = tlyVar2.C;
        String str162 = tlyVar2.z;
        String str172 = tlyVar2.D;
        String str182 = tlyVar2.A;
        String str192 = tlyVar2.E;
        String str202 = tlyVar2.F;
        String str212 = tlyVar2.I;
        String str222 = tlyVar2.J;
        String str232 = tlyVar2.L;
        String str242 = tlyVar2.M;
        String str252 = tlyVar2.N;
        String str262 = tlyVar2.p;
        String str272 = tlyVar2.q;
        boolean z72 = tlyVar2.O;
        if (upyVar == null) {
        }
        return new dny(z2, z4, z5, z62, str42, str52, str62, iconType22, str3, str122, str142, str162, str182, arrayList22, str82, str92, str132, str152, str172, str192, str202, str102, str112, str212, str222, t0a0Var2, str232, str242, str252, str262, str272, z72, qi11Var, tlyVar2.Q);
    }
}
