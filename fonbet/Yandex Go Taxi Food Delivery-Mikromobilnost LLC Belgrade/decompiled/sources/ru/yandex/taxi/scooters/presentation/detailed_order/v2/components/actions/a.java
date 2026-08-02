package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions;

import com.yandex.go.coroutines.h;
import com.yandex.go.scooters.api.domain.model.ScootersSessionType;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.a650;
import defpackage.afn0;
import defpackage.avj0;
import defpackage.bfn0;
import defpackage.bvf0;
import defpackage.cfn0;
import defpackage.dfn0;
import defpackage.ea90;
import defpackage.efn0;
import defpackage.f1h0;
import defpackage.ffn0;
import defpackage.fvo0;
import defpackage.gfn0;
import defpackage.hvo0;
import defpackage.ifn0;
import defpackage.j73;
import defpackage.j9p0;
import defpackage.jfn0;
import defpackage.jl40;
import defpackage.k5o0;
import defpackage.k7x0;
import defpackage.kfn0;
import defpackage.kyh0;
import defpackage.l5o0;
import defpackage.lrj0;
import defpackage.m5o0;
import defpackage.mfn0;
import defpackage.mgn0;
import defpackage.nrk0;
import defpackage.ny61;
import defpackage.nyn0;
import defpackage.o8p0;
import defpackage.odz;
import defpackage.p6p0;
import defpackage.p8p0;
import defpackage.pdz;
import defpackage.qdz;
import defpackage.r0h0;
import defpackage.ren0;
import defpackage.rgn0;
import defpackage.rqo;
import defpackage.se90;
import defpackage.sen0;
import defpackage.tcc;
import defpackage.uen0;
import defpackage.ukn0;
import defpackage.ven0;
import defpackage.vqg0;
import defpackage.w511;
import defpackage.wen0;
import defpackage.xen0;
import defpackage.xng0;
import defpackage.yen0;
import defpackage.z1b1;
import defpackage.zen0;
import defpackage.zuj0;
import defpackage.zuo0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.yandex.taxi.scooters.data.q;
import ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes6.dex */
public final class a {
    public final zuj0 a;
    public final k7x0 b;
    public final ru.yandex.taxi.widget.c c;
    public final rqo d;
    public final nyn0 e;
    public final ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.b f;
    public final h g = new h(new ScootersDetailedOrderActionListFactory$isOrderSelectorEnabled$1(this, null));
    public final h h;
    public final h i;
    public final h j;
    public final h k;
    public final h l;

    public a(ukn0 ukn0Var, q qVar, j9p0 j9p0Var, p8p0 p8p0Var, hvo0 hvo0Var, zuj0 zuj0Var, k7x0 k7x0Var, ru.yandex.taxi.widget.c cVar, rqo rqoVar, nyn0 nyn0Var, ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.b bVar) {
        this.a = zuj0Var;
        this.b = k7x0Var;
        this.c = cVar;
        this.d = rqoVar;
        this.e = nyn0Var;
        this.f = bVar;
        this.h = new h(new ScootersDetailedOrderActionListFactory$scootersMultiOrderExperiment$1(qVar, null));
        this.i = new h(new ScootersDetailedOrderActionListFactory$scootersVoluntarySlowdownExperiment$1(p8p0Var, null));
        this.j = new h(new ScootersDetailedOrderActionListFactory$scootersShareLocationOnRideExperiment$1(hvo0Var, null));
        this.k = new h(new ScootersDetailedOrderActionListFactory$scootersExperiment$1(ukn0Var, null));
        this.l = new h(new ScootersDetailedOrderActionListFactory$isZoneWithBikesEnabled$1(j9p0Var, null));
    }

    public final uen0 a() {
        return new uen0(new mfn0(r0h0.ic_scooters_cancel_riding), ((avj0) this.a).h(kyh0.scooters_ontheway_action_cancel), "cancel_riding", 0, null, null, null, ScootersOnTheWayAction.CANCEL, 248);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0e20  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0e02  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0db4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0d82  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0d4d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0cba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0beb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0bcc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0b57  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0a98  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v126 */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v130 */
    /* JADX WARN: Type inference failed for: r2v131 */
    /* JADX WARN: Type inference failed for: r2v132 */
    /* JADX WARN: Type inference failed for: r2v133 */
    /* JADX WARN: Type inference failed for: r2v134 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r3v134 */
    /* JADX WARN: Type inference failed for: r3v135 */
    /* JADX WARN: Type inference failed for: r3v136 */
    /* JADX WARN: Type inference failed for: r3v137 */
    /* JADX WARN: Type inference failed for: r3v138 */
    /* JADX WARN: Type inference failed for: r3v139 */
    /* JADX WARN: Type inference failed for: r3v140 */
    /* JADX WARN: Type inference failed for: r3v141 */
    /* JADX WARN: Type inference failed for: r3v142 */
    /* JADX WARN: Type inference failed for: r3v143 */
    /* JADX WARN: Type inference failed for: r3v144 */
    /* JADX WARN: Type inference failed for: r3v145 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v128, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v86, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, jfn0 jfn0Var, zuo0 zuo0Var, p6p0 p6p0Var, ScootersOnTheWayAction scootersOnTheWayAction, List list, ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState, ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState2, ContinuationImpl continuationImpl) {
        ScootersDetailedOrderActionListFactory$create$1 scootersDetailedOrderActionListFactory$create$1;
        int i2;
        zuo0 zuo0Var2;
        p6p0 p6p0Var2;
        Object obj;
        Object[] objArr;
        Object[] objArr2;
        int i3;
        ScootersOnTheWayAction scootersOnTheWayAction2;
        jfn0 jfn0Var2;
        zuo0 zuo0Var3;
        p6p0 p6p0Var3;
        kfn0[] kfn0VarArr;
        int i4;
        ScootersOnTheWayAction scootersOnTheWayAction3;
        jfn0 jfn0Var3;
        zuo0 zuo0Var4;
        p6p0 p6p0Var4;
        kfn0[] kfn0VarArr2;
        int i5;
        ScootersOnTheWayAction scootersOnTheWayAction4;
        zuo0 zuo0Var5;
        p6p0 p6p0Var5;
        kfn0[] kfn0VarArr3;
        int i6;
        ScootersOnTheWayAction scootersOnTheWayAction5;
        ?? r3;
        List list2;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState3;
        p6p0 p6p0Var6;
        zuo0 zuo0Var6;
        int i7;
        jfn0 jfn0Var4;
        kfn0[] kfn0VarArr4;
        ArrayList arrayList;
        ?? r32;
        List list3;
        ScootersOnTheWayAction scootersOnTheWayAction6;
        p6p0 p6p0Var7;
        zuo0 zuo0Var7;
        int i8;
        kfn0[] kfn0VarArr5;
        ?? r2;
        ?? r22;
        int i9;
        char c;
        int i10;
        List list4;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState4;
        int i11;
        ScootersOnTheWayAction scootersOnTheWayAction7;
        ?? r5;
        kfn0[] kfn0VarArr6;
        ScootersOnTheWayAction scootersOnTheWayAction8;
        int i12;
        ?? r0;
        ?? r33;
        List list5;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState5;
        kfn0[] kfn0VarArr7;
        int i13;
        ArrayList arrayList2;
        ?? r34;
        List list6;
        ScootersOnTheWayAction scootersOnTheWayAction9;
        p6p0 p6p0Var8;
        zuo0 zuo0Var8;
        int i14;
        kfn0[] kfn0VarArr8;
        ?? r23;
        ?? r24;
        int i15;
        int i16;
        List list7;
        ?? r35;
        List list8;
        p6p0 p6p0Var9;
        int i17;
        kfn0[] kfn0VarArr9;
        ScootersOnTheWayAction scootersOnTheWayAction10;
        int i18;
        ?? r02;
        ?? r36;
        List list9;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState6;
        kfn0[] kfn0VarArr10;
        int i19;
        ArrayList arrayList3;
        ?? r37;
        List list10;
        ScootersOnTheWayAction scootersOnTheWayAction11;
        p6p0 p6p0Var10;
        zuo0 zuo0Var9;
        int i20;
        kfn0[] kfn0VarArr11;
        ?? r25;
        ?? r26;
        int i21;
        int i22;
        List list11;
        ?? r38;
        List list12;
        p6p0 p6p0Var11;
        int i23;
        kfn0[] kfn0VarArr12;
        ScootersOnTheWayAction scootersOnTheWayAction12;
        int i24;
        ?? r03;
        Object[] objArr3;
        boolean z;
        Object k;
        a aVar;
        jfn0 jfn0Var5;
        Object obj2;
        int i25;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState7;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState8;
        int i26;
        List list13;
        ArrayList arrayList4;
        Object[] objArr4;
        boolean z2;
        Object e;
        List list14;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState9;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState10;
        zuo0 zuo0Var10;
        int i27;
        int i28;
        Object[] objArr5;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState11;
        List list15;
        zuo0 zuo0Var11;
        p6p0 p6p0Var12;
        int i29;
        Object[] objArr6;
        Object h;
        int i30;
        p6p0 p6p0Var13;
        int i31;
        List list16;
        Object[] objArr7;
        Object k2;
        int i32;
        Object[] objArr8;
        a aVar2 = this;
        int i33 = i;
        jfn0 jfn0Var6 = jfn0Var;
        ScootersOnTheWayAction scootersOnTheWayAction13 = scootersOnTheWayAction;
        List list17 = list;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState13 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState2;
        if (continuationImpl instanceof ScootersDetailedOrderActionListFactory$create$1) {
            scootersDetailedOrderActionListFactory$create$1 = (ScootersDetailedOrderActionListFactory$create$1) continuationImpl;
            int i34 = scootersDetailedOrderActionListFactory$create$1.label;
            if ((i34 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderActionListFactory$create$1.label = i34 - Integer.MIN_VALUE;
                Object obj3 = scootersDetailedOrderActionListFactory$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = scootersDetailedOrderActionListFactory$create$1.label;
                zuj0 zuj0Var = aVar2.a;
                switch (i2) {
                    case 0:
                        kotlin.b.b(obj3);
                        if (zuo0Var instanceof nrk0) {
                            kfn0[] kfn0VarArr13 = new kfn0[4];
                            kfn0VarArr13[0] = new yen0(new mfn0(r0h0.ic_scooters_action_pause), ((avj0) zuj0Var).h(kyh0.scooters_ontheway_action_waiting), "stop_riding", 0, null, null, null, ScootersOnTheWayAction.PAUSE, 248);
                            scootersDetailedOrderActionListFactory$create$1.L$0 = jfn0Var6;
                            scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var;
                            scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var;
                            scootersDetailedOrderActionListFactory$create$1.L$3 = scootersOnTheWayAction13;
                            scootersDetailedOrderActionListFactory$create$1.L$4 = list17;
                            scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                            scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                            scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                            scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction13;
                            scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr13;
                            scootersDetailedOrderActionListFactory$create$1.L$10 = kfn0VarArr13;
                            scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                            scootersDetailedOrderActionListFactory$create$1.I$1 = 1;
                            scootersDetailedOrderActionListFactory$create$1.label = 1;
                            obj3 = aVar2.g(zuo0Var, scootersDetailedOrderActionListFactory$create$1);
                            if (obj3 != coroutineSingletons) {
                                zuo0Var5 = zuo0Var;
                                p6p0Var5 = p6p0Var;
                                kfn0[] kfn0VarArr14 = kfn0VarArr13;
                                kfn0VarArr3 = kfn0VarArr14;
                                i6 = 1;
                                scootersOnTheWayAction5 = scootersOnTheWayAction13;
                                r3 = kfn0VarArr14;
                                r3[i6] = obj3;
                                kfn0VarArr3[2] = aVar2.f(zuo0Var5);
                                kfn0VarArr3[3] = new xen0(new mfn0(r0h0.ic_scooters_finish_riding), ((avj0) zuj0Var).h(kyh0.scooters_ontheway_action_finish), "finish_riding", 0, null, Integer.valueOf(vqg0.scooter_finish_action_color_pale), null, ScootersOnTheWayAction.FINISH, 216);
                                List<kfn0> A = j73.A(kfn0VarArr3);
                                ArrayList arrayList5 = new ArrayList(tcc.n(A, 10));
                                for (kfn0 kfn0Var : A) {
                                    arrayList5.add(new mgn0(kfn0Var, scootersOnTheWayAction13 != null && kfn0Var.a() == scootersOnTheWayAction13));
                                }
                                kfn0[] kfn0VarArr15 = new kfn0[8];
                                scootersDetailedOrderActionListFactory$create$1.L$0 = jfn0Var6;
                                scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var5;
                                scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var5;
                                scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                scootersDetailedOrderActionListFactory$create$1.L$4 = list17;
                                scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                                scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                                scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction5;
                                scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr15;
                                scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList5;
                                scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr15;
                                scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                scootersDetailedOrderActionListFactory$create$1.I$1 = 0;
                                scootersDetailedOrderActionListFactory$create$1.label = 2;
                                obj3 = k(true, p6p0Var5, list17, scootersDetailedOrderAction$ClickType$Toggle$ToggleState13, scootersDetailedOrderActionListFactory$create$1);
                                aVar2 = this;
                                if (obj3 != coroutineSingletons) {
                                    ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState14 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                                    list2 = list17;
                                    scootersDetailedOrderAction$ClickType$Toggle$ToggleState3 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState14;
                                    p6p0Var6 = p6p0Var5;
                                    zuo0Var6 = zuo0Var5;
                                    i7 = 0;
                                    jfn0Var4 = jfn0Var6;
                                    kfn0VarArr4 = kfn0VarArr15;
                                    r32 = kfn0VarArr15;
                                    arrayList = arrayList5;
                                    r32[i7] = obj3;
                                    kfn0VarArr4[1] = jfn0Var4;
                                    scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                    scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var6;
                                    scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var6;
                                    scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                    scootersDetailedOrderActionListFactory$create$1.L$4 = list2;
                                    scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                                    scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState3;
                                    scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                    scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction5;
                                    scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr4;
                                    scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList;
                                    scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr4;
                                    scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                    scootersDetailedOrderActionListFactory$create$1.I$1 = 2;
                                    scootersDetailedOrderActionListFactory$create$1.label = 3;
                                    obj3 = aVar2.e(i33, scootersDetailedOrderActionListFactory$create$1);
                                    if (obj3 != coroutineSingletons) {
                                        list3 = arrayList;
                                        scootersOnTheWayAction6 = scootersOnTheWayAction5;
                                        p6p0Var7 = p6p0Var6;
                                        zuo0Var7 = zuo0Var6;
                                        i8 = 2;
                                        kfn0VarArr5 = kfn0VarArr4;
                                        r2 = kfn0VarArr4;
                                        r2[i8] = obj3;
                                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var7;
                                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var7;
                                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$4 = list2;
                                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState3;
                                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction6;
                                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr5;
                                        scootersDetailedOrderActionListFactory$create$1.L$10 = list3;
                                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr5;
                                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                        scootersDetailedOrderActionListFactory$create$1.I$1 = 3;
                                        scootersDetailedOrderActionListFactory$create$1.label = 4;
                                        obj3 = aVar2.d(zuo0Var7, scootersDetailedOrderActionListFactory$create$1);
                                        if (obj3 != coroutineSingletons) {
                                            r22 = kfn0VarArr5;
                                            i9 = 3;
                                            r22[i9] = obj3;
                                            scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var7;
                                            scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var7;
                                            scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$4 = list2;
                                            scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState3;
                                            scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction6;
                                            scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr5;
                                            scootersDetailedOrderActionListFactory$create$1.L$10 = list3;
                                            scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr5;
                                            scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                            scootersDetailedOrderActionListFactory$create$1.I$1 = 4;
                                            c = 5;
                                            scootersDetailedOrderActionListFactory$create$1.label = 5;
                                            obj3 = aVar2.h(scootersDetailedOrderAction$ClickType$Toggle$ToggleState12, scootersDetailedOrderActionListFactory$create$1);
                                            if (obj3 != coroutineSingletons) {
                                                List list18 = list3;
                                                i10 = i33;
                                                list4 = list18;
                                                scootersDetailedOrderAction$ClickType$Toggle$ToggleState4 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState3;
                                                i11 = 4;
                                                scootersOnTheWayAction7 = scootersOnTheWayAction6;
                                                r5 = kfn0VarArr5;
                                                r5[i11] = obj3;
                                                kfn0VarArr5[c] = aVar2.c(zuo0Var7);
                                                kfn0VarArr5[6] = aVar2.j();
                                                scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$2 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$4 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$6 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction7;
                                                scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr5;
                                                scootersDetailedOrderActionListFactory$create$1.L$10 = list4;
                                                scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr5;
                                                scootersDetailedOrderActionListFactory$create$1.I$0 = i10;
                                                scootersDetailedOrderActionListFactory$create$1.I$1 = 7;
                                                scootersDetailedOrderActionListFactory$create$1.label = 6;
                                                obj3 = aVar2.k(false, p6p0Var7, list2, scootersDetailedOrderAction$ClickType$Toggle$ToggleState4, scootersDetailedOrderActionListFactory$create$1);
                                                if (obj3 != coroutineSingletons) {
                                                    kfn0[] kfn0VarArr16 = kfn0VarArr5;
                                                    kfn0VarArr6 = kfn0VarArr16;
                                                    scootersOnTheWayAction8 = scootersOnTheWayAction7;
                                                    i12 = 7;
                                                    r0 = kfn0VarArr16;
                                                    r0[i12] = obj3;
                                                    List<kfn0> A2 = j73.A(kfn0VarArr6);
                                                    ArrayList arrayList6 = new ArrayList(tcc.n(A2, 10));
                                                    for (kfn0 kfn0Var2 : A2) {
                                                        arrayList6.add(new mgn0(kfn0Var2, scootersOnTheWayAction8 != null && kfn0Var2.a() == scootersOnTheWayAction8));
                                                    }
                                                    return new rgn0(arrayList6, list4);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (zuo0Var instanceof lrj0) {
                            kfn0[] kfn0VarArr17 = new kfn0[4];
                            kfn0VarArr17[0] = aVar2.a();
                            scootersDetailedOrderActionListFactory$create$1.L$0 = jfn0Var6;
                            scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var;
                            scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var;
                            scootersDetailedOrderActionListFactory$create$1.L$3 = scootersOnTheWayAction13;
                            scootersDetailedOrderActionListFactory$create$1.L$4 = list17;
                            scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                            scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                            scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                            scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction13;
                            scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr17;
                            scootersDetailedOrderActionListFactory$create$1.L$10 = kfn0VarArr17;
                            scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                            scootersDetailedOrderActionListFactory$create$1.I$1 = 1;
                            scootersDetailedOrderActionListFactory$create$1.label = 7;
                            obj3 = aVar2.g(zuo0Var, scootersDetailedOrderActionListFactory$create$1);
                            if (obj3 != coroutineSingletons) {
                                jfn0Var3 = jfn0Var6;
                                zuo0Var4 = zuo0Var;
                                p6p0Var4 = p6p0Var;
                                kfn0[] kfn0VarArr18 = kfn0VarArr17;
                                kfn0VarArr2 = kfn0VarArr18;
                                i5 = 1;
                                scootersOnTheWayAction4 = scootersOnTheWayAction13;
                                r33 = kfn0VarArr18;
                                r33[i5] = obj3;
                                kfn0VarArr2[2] = aVar2.l();
                                kfn0VarArr2[3] = aVar2.i();
                                List<kfn0> A3 = j73.A(kfn0VarArr2);
                                ArrayList arrayList7 = new ArrayList(tcc.n(A3, 10));
                                for (kfn0 kfn0Var3 : A3) {
                                    arrayList7.add(new mgn0(kfn0Var3, scootersOnTheWayAction13 != null && kfn0Var3.a() == scootersOnTheWayAction13));
                                }
                                kfn0[] kfn0VarArr19 = new kfn0[7];
                                scootersDetailedOrderActionListFactory$create$1.L$0 = jfn0Var3;
                                scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var4;
                                scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var4;
                                scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                scootersDetailedOrderActionListFactory$create$1.L$4 = list17;
                                scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                                scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                                scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction4;
                                scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr19;
                                scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList7;
                                scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr19;
                                scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                scootersDetailedOrderActionListFactory$create$1.I$1 = 0;
                                scootersDetailedOrderActionListFactory$create$1.label = 8;
                                obj3 = k(true, p6p0Var4, list17, scootersDetailedOrderAction$ClickType$Toggle$ToggleState13, scootersDetailedOrderActionListFactory$create$1);
                                aVar2 = this;
                                if (obj3 != coroutineSingletons) {
                                    ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState15 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                                    list5 = list17;
                                    scootersDetailedOrderAction$ClickType$Toggle$ToggleState5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState15;
                                    kfn0VarArr7 = kfn0VarArr19;
                                    i13 = 0;
                                    r34 = kfn0VarArr19;
                                    arrayList2 = arrayList7;
                                    r34[i13] = obj3;
                                    kfn0VarArr7[1] = jfn0Var3;
                                    scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                    scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var4;
                                    scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var4;
                                    scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                    scootersDetailedOrderActionListFactory$create$1.L$4 = list5;
                                    scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                                    scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState5;
                                    scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                    scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction4;
                                    scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr7;
                                    scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList2;
                                    scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr7;
                                    scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                    scootersDetailedOrderActionListFactory$create$1.I$1 = 2;
                                    scootersDetailedOrderActionListFactory$create$1.label = 9;
                                    obj3 = aVar2.e(i33, scootersDetailedOrderActionListFactory$create$1);
                                    if (obj3 != coroutineSingletons) {
                                        list6 = arrayList2;
                                        scootersOnTheWayAction9 = scootersOnTheWayAction4;
                                        p6p0Var8 = p6p0Var4;
                                        zuo0Var8 = zuo0Var4;
                                        i14 = 2;
                                        kfn0VarArr8 = kfn0VarArr7;
                                        r23 = kfn0VarArr7;
                                        r23[i14] = obj3;
                                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var8;
                                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$4 = list5;
                                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState5;
                                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction9;
                                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr8;
                                        scootersDetailedOrderActionListFactory$create$1.L$10 = list6;
                                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr8;
                                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                        scootersDetailedOrderActionListFactory$create$1.I$1 = 3;
                                        scootersDetailedOrderActionListFactory$create$1.label = 10;
                                        obj3 = aVar2.d(zuo0Var8, scootersDetailedOrderActionListFactory$create$1);
                                        if (obj3 != coroutineSingletons) {
                                            r24 = kfn0VarArr8;
                                            i15 = 3;
                                            r24[i15] = obj3;
                                            scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var8;
                                            scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$4 = list5;
                                            scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState5;
                                            scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction9;
                                            scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr8;
                                            scootersDetailedOrderActionListFactory$create$1.L$10 = list6;
                                            scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr8;
                                            scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                            scootersDetailedOrderActionListFactory$create$1.I$1 = 4;
                                            scootersDetailedOrderActionListFactory$create$1.label = 11;
                                            obj3 = aVar2.h(scootersDetailedOrderAction$ClickType$Toggle$ToggleState12, scootersDetailedOrderActionListFactory$create$1);
                                            if (obj3 != coroutineSingletons) {
                                                i16 = i33;
                                                list7 = list6;
                                                r35 = kfn0VarArr8;
                                                list8 = list5;
                                                p6p0Var9 = p6p0Var8;
                                                i17 = 4;
                                                r35[i17] = obj3;
                                                kfn0VarArr8[5] = aVar2.j();
                                                scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$2 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$4 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$6 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction9;
                                                scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr8;
                                                scootersDetailedOrderActionListFactory$create$1.L$10 = list7;
                                                scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr8;
                                                scootersDetailedOrderActionListFactory$create$1.I$0 = i16;
                                                scootersDetailedOrderActionListFactory$create$1.I$1 = 6;
                                                scootersDetailedOrderActionListFactory$create$1.label = 12;
                                                obj3 = aVar2.k(false, p6p0Var9, list8, scootersDetailedOrderAction$ClickType$Toggle$ToggleState5, scootersDetailedOrderActionListFactory$create$1);
                                                if (obj3 != coroutineSingletons) {
                                                    kfn0[] kfn0VarArr20 = kfn0VarArr8;
                                                    kfn0VarArr9 = kfn0VarArr20;
                                                    scootersOnTheWayAction10 = scootersOnTheWayAction9;
                                                    i18 = 6;
                                                    r02 = kfn0VarArr20;
                                                    r02[i18] = obj3;
                                                    List<kfn0> A4 = j73.A(kfn0VarArr9);
                                                    ArrayList arrayList8 = new ArrayList(tcc.n(A4, 10));
                                                    for (kfn0 kfn0Var4 : A4) {
                                                        arrayList8.add(new mgn0(kfn0Var4, scootersOnTheWayAction10 != null && kfn0Var4.a() == scootersOnTheWayAction10));
                                                    }
                                                    return new rgn0(arrayList8, list7);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (zuo0Var instanceof ea90) {
                            kfn0[] kfn0VarArr21 = new kfn0[4];
                            kfn0VarArr21[0] = aVar2.a();
                            scootersDetailedOrderActionListFactory$create$1.L$0 = jfn0Var6;
                            scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var;
                            scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var;
                            scootersDetailedOrderActionListFactory$create$1.L$3 = scootersOnTheWayAction13;
                            scootersDetailedOrderActionListFactory$create$1.L$4 = list17;
                            scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                            scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                            scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                            scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction13;
                            scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr21;
                            scootersDetailedOrderActionListFactory$create$1.L$10 = kfn0VarArr21;
                            scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                            scootersDetailedOrderActionListFactory$create$1.I$1 = 1;
                            scootersDetailedOrderActionListFactory$create$1.label = 13;
                            obj3 = aVar2.g(zuo0Var, scootersDetailedOrderActionListFactory$create$1);
                            if (obj3 != coroutineSingletons) {
                                jfn0Var2 = jfn0Var6;
                                zuo0Var3 = zuo0Var;
                                p6p0Var3 = p6p0Var;
                                kfn0[] kfn0VarArr22 = kfn0VarArr21;
                                kfn0VarArr = kfn0VarArr22;
                                i4 = 1;
                                scootersOnTheWayAction3 = scootersOnTheWayAction13;
                                r36 = kfn0VarArr22;
                                r36[i4] = obj3;
                                kfn0VarArr[2] = aVar2.l();
                                kfn0VarArr[3] = aVar2.i();
                                List<kfn0> A5 = j73.A(kfn0VarArr);
                                ArrayList arrayList9 = new ArrayList(tcc.n(A5, 10));
                                for (kfn0 kfn0Var5 : A5) {
                                    arrayList9.add(new mgn0(kfn0Var5, scootersOnTheWayAction13 != null && kfn0Var5.a() == scootersOnTheWayAction13));
                                }
                                kfn0[] kfn0VarArr23 = new kfn0[7];
                                scootersDetailedOrderActionListFactory$create$1.L$0 = jfn0Var2;
                                scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var3;
                                scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var3;
                                scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                scootersDetailedOrderActionListFactory$create$1.L$4 = list17;
                                scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                                scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                                scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction3;
                                scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr23;
                                scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList9;
                                scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr23;
                                scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                scootersDetailedOrderActionListFactory$create$1.I$1 = 0;
                                scootersDetailedOrderActionListFactory$create$1.label = 14;
                                obj3 = k(true, p6p0Var3, list17, scootersDetailedOrderAction$ClickType$Toggle$ToggleState13, scootersDetailedOrderActionListFactory$create$1);
                                aVar2 = this;
                                if (obj3 != coroutineSingletons) {
                                    ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState16 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                                    list9 = list17;
                                    scootersDetailedOrderAction$ClickType$Toggle$ToggleState6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState16;
                                    kfn0VarArr10 = kfn0VarArr23;
                                    i19 = 0;
                                    r37 = kfn0VarArr23;
                                    arrayList3 = arrayList9;
                                    r37[i19] = obj3;
                                    kfn0VarArr10[1] = jfn0Var2;
                                    scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                    scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var3;
                                    scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var3;
                                    scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                    scootersDetailedOrderActionListFactory$create$1.L$4 = list9;
                                    scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                                    scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState6;
                                    scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                    scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction3;
                                    scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr10;
                                    scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList3;
                                    scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr10;
                                    scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                    scootersDetailedOrderActionListFactory$create$1.I$1 = 2;
                                    scootersDetailedOrderActionListFactory$create$1.label = 15;
                                    obj3 = aVar2.e(i33, scootersDetailedOrderActionListFactory$create$1);
                                    if (obj3 != coroutineSingletons) {
                                        list10 = arrayList3;
                                        scootersOnTheWayAction11 = scootersOnTheWayAction3;
                                        p6p0Var10 = p6p0Var3;
                                        zuo0Var9 = zuo0Var3;
                                        i20 = 2;
                                        kfn0VarArr11 = kfn0VarArr10;
                                        r25 = kfn0VarArr10;
                                        r25[i20] = obj3;
                                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var10;
                                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$4 = list9;
                                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState6;
                                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction11;
                                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr11;
                                        scootersDetailedOrderActionListFactory$create$1.L$10 = list10;
                                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr11;
                                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                        scootersDetailedOrderActionListFactory$create$1.I$1 = 3;
                                        scootersDetailedOrderActionListFactory$create$1.label = 16;
                                        obj3 = aVar2.d(zuo0Var9, scootersDetailedOrderActionListFactory$create$1);
                                        if (obj3 != coroutineSingletons) {
                                            r26 = kfn0VarArr11;
                                            i21 = 3;
                                            r26[i21] = obj3;
                                            scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var10;
                                            scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$4 = list9;
                                            scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState6;
                                            scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction11;
                                            scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr11;
                                            scootersDetailedOrderActionListFactory$create$1.L$10 = list10;
                                            scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr11;
                                            scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                            scootersDetailedOrderActionListFactory$create$1.I$1 = 4;
                                            scootersDetailedOrderActionListFactory$create$1.label = 17;
                                            obj3 = aVar2.h(scootersDetailedOrderAction$ClickType$Toggle$ToggleState12, scootersDetailedOrderActionListFactory$create$1);
                                            if (obj3 != coroutineSingletons) {
                                                i22 = i33;
                                                list11 = list10;
                                                r38 = kfn0VarArr11;
                                                list12 = list9;
                                                p6p0Var11 = p6p0Var10;
                                                i23 = 4;
                                                r38[i23] = obj3;
                                                kfn0VarArr11[5] = aVar2.j();
                                                scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$2 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$4 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$6 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction11;
                                                scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr11;
                                                scootersDetailedOrderActionListFactory$create$1.L$10 = list11;
                                                scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr11;
                                                scootersDetailedOrderActionListFactory$create$1.I$0 = i22;
                                                scootersDetailedOrderActionListFactory$create$1.I$1 = 6;
                                                scootersDetailedOrderActionListFactory$create$1.label = 18;
                                                obj3 = aVar2.k(false, p6p0Var11, list12, scootersDetailedOrderAction$ClickType$Toggle$ToggleState6, scootersDetailedOrderActionListFactory$create$1);
                                                if (obj3 != coroutineSingletons) {
                                                    kfn0[] kfn0VarArr24 = kfn0VarArr11;
                                                    kfn0VarArr12 = kfn0VarArr24;
                                                    scootersOnTheWayAction12 = scootersOnTheWayAction11;
                                                    i24 = 6;
                                                    r03 = kfn0VarArr24;
                                                    r03[i24] = obj3;
                                                    List<kfn0> A6 = j73.A(kfn0VarArr12);
                                                    ArrayList arrayList10 = new ArrayList(tcc.n(A6, 10));
                                                    for (kfn0 kfn0Var6 : A6) {
                                                        arrayList10.add(new mgn0(kfn0Var6, scootersOnTheWayAction12 != null && kfn0Var6.a() == scootersOnTheWayAction12));
                                                    }
                                                    return new rgn0(arrayList10, list11);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (!(zuo0Var instanceof se90)) {
                                w511.b();
                                return null;
                            }
                            kfn0[] kfn0VarArr25 = new kfn0[4];
                            kfn0VarArr25[0] = new ven0(new mfn0(r0h0.ic_scooters_start_riding_control), ((avj0) zuj0Var).h(kyh0.scooters_ontheway_action_continue), "start_riding", xng0.controlMinor, null, null, null, ScootersOnTheWayAction.CONTINUE, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
                            scootersDetailedOrderActionListFactory$create$1.L$0 = jfn0Var6;
                            scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var;
                            scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var;
                            scootersDetailedOrderActionListFactory$create$1.L$3 = scootersOnTheWayAction13;
                            scootersDetailedOrderActionListFactory$create$1.L$4 = list17;
                            scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                            scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                            scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                            scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction13;
                            scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr25;
                            scootersDetailedOrderActionListFactory$create$1.L$10 = kfn0VarArr25;
                            scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                            scootersDetailedOrderActionListFactory$create$1.I$1 = 1;
                            scootersDetailedOrderActionListFactory$create$1.label = 19;
                            Object g = aVar2.g(zuo0Var, scootersDetailedOrderActionListFactory$create$1);
                            if (g != coroutineSingletons) {
                                zuo0Var2 = zuo0Var;
                                p6p0Var2 = p6p0Var;
                                obj = g;
                                objArr = kfn0VarArr25;
                                objArr2 = objArr;
                                i3 = 1;
                                scootersOnTheWayAction2 = scootersOnTheWayAction13;
                                objArr[i3] = obj;
                                objArr2[2] = aVar2.f(zuo0Var2);
                                objArr2[3] = new wen0(new mfn0(r0h0.ic_scooters_cancel_riding), ((avj0) zuj0Var).h(kyh0.scooters_ontheway_action_finish), "finish_riding", 0, null, Integer.valueOf(vqg0.scooter_finish_action_color_pale), null, ScootersOnTheWayAction.FINISH, 88);
                                List<kfn0> A7 = j73.A(objArr2);
                                ArrayList arrayList11 = new ArrayList(tcc.n(A7, 10));
                                for (kfn0 kfn0Var7 : A7) {
                                    arrayList11.add(new mgn0(kfn0Var7, scootersOnTheWayAction13 != null && kfn0Var7.a() == scootersOnTheWayAction13));
                                }
                                objArr3 = new kfn0[8];
                                scootersDetailedOrderActionListFactory$create$1.L$0 = jfn0Var6;
                                scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var2;
                                scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var2;
                                scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                scootersDetailedOrderActionListFactory$create$1.L$4 = list17;
                                scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                                scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                                scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction2;
                                scootersDetailedOrderActionListFactory$create$1.L$9 = objArr3;
                                scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList11;
                                scootersDetailedOrderActionListFactory$create$1.L$11 = objArr3;
                                scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                                z = false;
                                scootersDetailedOrderActionListFactory$create$1.I$1 = 0;
                                scootersDetailedOrderActionListFactory$create$1.label = 20;
                                k = k(true, p6p0Var2, list17, scootersDetailedOrderAction$ClickType$Toggle$ToggleState13, scootersDetailedOrderActionListFactory$create$1);
                                aVar = this;
                                if (k != coroutineSingletons) {
                                    jfn0Var5 = jfn0Var6;
                                    obj2 = k;
                                    i25 = i33;
                                    scootersDetailedOrderAction$ClickType$Toggle$ToggleState7 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                                    scootersDetailedOrderAction$ClickType$Toggle$ToggleState8 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                                    i26 = 0;
                                    list13 = list17;
                                    arrayList4 = arrayList11;
                                    objArr4 = objArr3;
                                    objArr4[i26] = obj2;
                                    z2 = true;
                                    objArr3[1] = jfn0Var5;
                                    scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                    scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var2;
                                    scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var2;
                                    scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                    scootersDetailedOrderActionListFactory$create$1.L$4 = list13;
                                    scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState7;
                                    scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState8;
                                    scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                    scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction2;
                                    scootersDetailedOrderActionListFactory$create$1.L$9 = objArr3;
                                    scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList4;
                                    scootersDetailedOrderActionListFactory$create$1.L$11 = objArr3;
                                    scootersDetailedOrderActionListFactory$create$1.I$0 = i25;
                                    scootersDetailedOrderActionListFactory$create$1.I$1 = 2;
                                    scootersDetailedOrderActionListFactory$create$1.label = 21;
                                    e = aVar.e(i25, scootersDetailedOrderActionListFactory$create$1);
                                    if (e != coroutineSingletons) {
                                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState17 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState7;
                                        obj3 = e;
                                        list14 = arrayList4;
                                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState9 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState8;
                                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState10 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState17;
                                        zuo0Var10 = zuo0Var2;
                                        i27 = 2;
                                        i28 = i25;
                                        objArr5 = objArr3;
                                        objArr5[i27] = obj3;
                                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var10;
                                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var2;
                                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$4 = list13;
                                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState10;
                                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState9;
                                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction2;
                                        scootersDetailedOrderActionListFactory$create$1.L$9 = objArr3;
                                        scootersDetailedOrderActionListFactory$create$1.L$10 = list14;
                                        scootersDetailedOrderActionListFactory$create$1.L$11 = objArr3;
                                        scootersDetailedOrderActionListFactory$create$1.I$0 = i28;
                                        scootersDetailedOrderActionListFactory$create$1.I$1 = 3;
                                        scootersDetailedOrderActionListFactory$create$1.label = 22;
                                        obj3 = aVar.d(zuo0Var10, scootersDetailedOrderActionListFactory$create$1);
                                        if (obj3 != coroutineSingletons) {
                                            List list19 = list13;
                                            scootersDetailedOrderAction$ClickType$Toggle$ToggleState11 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState10;
                                            list15 = list19;
                                            zuo0Var11 = zuo0Var10;
                                            p6p0Var12 = p6p0Var2;
                                            i29 = 3;
                                            objArr6 = objArr3;
                                            objArr3[i29] = obj3;
                                            scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var11;
                                            scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var12;
                                            scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$4 = list15;
                                            scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState9;
                                            scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                            scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction2;
                                            scootersDetailedOrderActionListFactory$create$1.L$9 = objArr6;
                                            scootersDetailedOrderActionListFactory$create$1.L$10 = list14;
                                            scootersDetailedOrderActionListFactory$create$1.L$11 = objArr6;
                                            scootersDetailedOrderActionListFactory$create$1.I$0 = i28;
                                            scootersDetailedOrderActionListFactory$create$1.I$1 = 4;
                                            scootersDetailedOrderActionListFactory$create$1.label = 23;
                                            h = aVar.h(scootersDetailedOrderAction$ClickType$Toggle$ToggleState11, scootersDetailedOrderActionListFactory$create$1);
                                            if (h != coroutineSingletons) {
                                                i30 = 4;
                                                p6p0Var13 = p6p0Var12;
                                                obj3 = h;
                                                i31 = i28;
                                                list16 = list14;
                                                objArr7 = objArr6;
                                                objArr7[i30] = obj3;
                                                objArr6[5] = aVar.c(zuo0Var11);
                                                objArr6[6] = aVar.j();
                                                scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$2 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$4 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$6 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                                                scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction2;
                                                scootersDetailedOrderActionListFactory$create$1.L$9 = objArr6;
                                                scootersDetailedOrderActionListFactory$create$1.L$10 = list16;
                                                scootersDetailedOrderActionListFactory$create$1.L$11 = objArr6;
                                                scootersDetailedOrderActionListFactory$create$1.I$0 = i31;
                                                scootersDetailedOrderActionListFactory$create$1.I$1 = 7;
                                                scootersDetailedOrderActionListFactory$create$1.label = 24;
                                                k2 = aVar.k(false, p6p0Var13, list15, scootersDetailedOrderAction$ClickType$Toggle$ToggleState9, scootersDetailedOrderActionListFactory$create$1);
                                                if (k2 != coroutineSingletons) {
                                                    i32 = 7;
                                                    obj3 = k2;
                                                    objArr8 = objArr6;
                                                    objArr6[i32] = obj3;
                                                    List<kfn0> A8 = j73.A(objArr8);
                                                    ArrayList arrayList12 = new ArrayList(tcc.n(A8, 10));
                                                    for (kfn0 kfn0Var8 : A8) {
                                                        arrayList12.add(new mgn0(kfn0Var8, (scootersOnTheWayAction2 == null || kfn0Var8.a() != scootersOnTheWayAction2) ? z : z2));
                                                    }
                                                    return new rgn0(arrayList12, list16);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        int i35 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        int i36 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr26 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr3 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction13 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState18 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        List list20 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        scootersOnTheWayAction5 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$3;
                        p6p0Var5 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var5 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        jfn0 jfn0Var7 = (jfn0) scootersDetailedOrderActionListFactory$create$1.L$0;
                        kotlin.b.b(obj3);
                        jfn0Var6 = jfn0Var7;
                        i33 = i36;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState13 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState18;
                        list17 = list20;
                        i6 = i35;
                        r3 = kfn0VarArr26;
                        r3[i6] = obj3;
                        kfn0VarArr3[2] = aVar2.f(zuo0Var5);
                        kfn0VarArr3[3] = new xen0(new mfn0(r0h0.ic_scooters_finish_riding), ((avj0) zuj0Var).h(kyh0.scooters_ontheway_action_finish), "finish_riding", 0, null, Integer.valueOf(vqg0.scooter_finish_action_color_pale), null, ScootersOnTheWayAction.FINISH, 216);
                        List<kfn0> A9 = j73.A(kfn0VarArr3);
                        ArrayList arrayList52 = new ArrayList(tcc.n(A9, 10));
                        while (r3.hasNext()) {
                        }
                        kfn0[] kfn0VarArr152 = new kfn0[8];
                        scootersDetailedOrderActionListFactory$create$1.L$0 = jfn0Var6;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var5;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var5;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list17;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction5;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr152;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList52;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr152;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 0;
                        scootersDetailedOrderActionListFactory$create$1.label = 2;
                        obj3 = k(true, p6p0Var5, list17, scootersDetailedOrderAction$ClickType$Toggle$ToggleState13, scootersDetailedOrderActionListFactory$create$1);
                        aVar2 = this;
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        int i37 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        int i38 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr27 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        ?? r4 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0[] kfn0VarArr28 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        ScootersOnTheWayAction scootersOnTheWayAction14 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState19 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState20 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        List list21 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var6 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var6 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        jfn0Var4 = (jfn0) scootersDetailedOrderActionListFactory$create$1.L$0;
                        kotlin.b.b(obj3);
                        i7 = i37;
                        i33 = i38;
                        kfn0VarArr4 = kfn0VarArr28;
                        scootersOnTheWayAction5 = scootersOnTheWayAction14;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState3 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState19;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState20;
                        list2 = list21;
                        r32 = kfn0VarArr27;
                        arrayList = r4;
                        r32[i7] = obj3;
                        kfn0VarArr4[1] = jfn0Var4;
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var6;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var6;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list2;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState3;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction5;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr4;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr4;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 2;
                        scootersDetailedOrderActionListFactory$create$1.label = 3;
                        obj3 = aVar2.e(i33, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        i8 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        i33 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr29 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        list3 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr5 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction6 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState3 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        list2 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var7 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var7 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        kotlin.b.b(obj3);
                        r2 = kfn0VarArr29;
                        r2[i8] = obj3;
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var7;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var7;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list2;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState3;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction6;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr5;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = list3;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr5;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 3;
                        scootersDetailedOrderActionListFactory$create$1.label = 4;
                        obj3 = aVar2.d(zuo0Var7, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 4:
                        i9 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        i33 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr30 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        list3 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr5 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction6 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState3 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        list2 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var7 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var7 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        kotlin.b.b(obj3);
                        r22 = kfn0VarArr30;
                        r22[i9] = obj3;
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var7;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var7;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list2;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState3;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction6;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr5;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = list3;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr5;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 4;
                        c = 5;
                        scootersDetailedOrderActionListFactory$create$1.label = 5;
                        obj3 = aVar2.h(scootersDetailedOrderAction$ClickType$Toggle$ToggleState12, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        i11 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        int i39 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr31 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        List list22 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr5 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        ScootersOnTheWayAction scootersOnTheWayAction15 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState21 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        List list23 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0 p6p0Var14 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0 zuo0Var12 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        kotlin.b.b(obj3);
                        i10 = i39;
                        list4 = list22;
                        zuo0Var7 = zuo0Var12;
                        p6p0Var7 = p6p0Var14;
                        list2 = list23;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState4 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState21;
                        scootersOnTheWayAction7 = scootersOnTheWayAction15;
                        r5 = kfn0VarArr31;
                        c = 5;
                        r5[i11] = obj3;
                        kfn0VarArr5[c] = aVar2.c(zuo0Var7);
                        kfn0VarArr5[6] = aVar2.j();
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction7;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr5;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = list4;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr5;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i10;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 7;
                        scootersDetailedOrderActionListFactory$create$1.label = 6;
                        obj3 = aVar2.k(false, p6p0Var7, list2, scootersDetailedOrderAction$ClickType$Toggle$ToggleState4, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 6:
                        i12 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        kfn0[] kfn0VarArr32 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        list4 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr6 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction8 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        kotlin.b.b(obj3);
                        r0 = kfn0VarArr32;
                        r0[i12] = obj3;
                        List<kfn0> A22 = j73.A(kfn0VarArr6);
                        ArrayList arrayList62 = new ArrayList(tcc.n(A22, 10));
                        while (r0.hasNext()) {
                        }
                        return new rgn0(arrayList62, list4);
                    case 7:
                        int i40 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        int i41 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr33 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr2 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction13 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState22 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        List list24 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        scootersOnTheWayAction4 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$3;
                        p6p0Var4 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var4 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        jfn0Var3 = (jfn0) scootersDetailedOrderActionListFactory$create$1.L$0;
                        kotlin.b.b(obj3);
                        i5 = i40;
                        i33 = i41;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState13 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState22;
                        list17 = list24;
                        r33 = kfn0VarArr33;
                        r33[i5] = obj3;
                        kfn0VarArr2[2] = aVar2.l();
                        kfn0VarArr2[3] = aVar2.i();
                        List<kfn0> A32 = j73.A(kfn0VarArr2);
                        ArrayList arrayList72 = new ArrayList(tcc.n(A32, 10));
                        while (r2.hasNext()) {
                        }
                        kfn0[] kfn0VarArr192 = new kfn0[7];
                        scootersDetailedOrderActionListFactory$create$1.L$0 = jfn0Var3;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var4;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var4;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list17;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction4;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr192;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList72;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr192;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 0;
                        scootersDetailedOrderActionListFactory$create$1.label = 8;
                        obj3 = k(true, p6p0Var4, list17, scootersDetailedOrderAction$ClickType$Toggle$ToggleState13, scootersDetailedOrderActionListFactory$create$1);
                        aVar2 = this;
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 8:
                        int i42 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        int i43 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr34 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        ?? r42 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0[] kfn0VarArr35 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        ScootersOnTheWayAction scootersOnTheWayAction16 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState23 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState24 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        List list25 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var4 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var4 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        jfn0Var3 = (jfn0) scootersDetailedOrderActionListFactory$create$1.L$0;
                        kotlin.b.b(obj3);
                        i13 = i42;
                        i33 = i43;
                        kfn0VarArr7 = kfn0VarArr35;
                        scootersOnTheWayAction4 = scootersOnTheWayAction16;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState23;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState24;
                        list5 = list25;
                        r34 = kfn0VarArr34;
                        arrayList2 = r42;
                        r34[i13] = obj3;
                        kfn0VarArr7[1] = jfn0Var3;
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var4;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var4;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list5;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState5;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction4;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr7;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList2;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr7;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 2;
                        scootersDetailedOrderActionListFactory$create$1.label = 9;
                        obj3 = aVar2.e(i33, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 9:
                        i14 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        i33 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr36 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        list6 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr8 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction9 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState5 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        list5 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var8 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var8 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        kotlin.b.b(obj3);
                        r23 = kfn0VarArr36;
                        r23[i14] = obj3;
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var8;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list5;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState5;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction9;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr8;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = list6;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr8;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 3;
                        scootersDetailedOrderActionListFactory$create$1.label = 10;
                        obj3 = aVar2.d(zuo0Var8, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 10:
                        i15 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        i33 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr37 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        list6 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr8 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction9 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState5 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        list5 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var8 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        kotlin.b.b(obj3);
                        r24 = kfn0VarArr37;
                        r24[i15] = obj3;
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var8;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list5;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState5;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction9;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr8;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = list6;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr8;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 4;
                        scootersDetailedOrderActionListFactory$create$1.label = 11;
                        obj3 = aVar2.h(scootersDetailedOrderAction$ClickType$Toggle$ToggleState12, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 11:
                        i17 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        int i44 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr38 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        List list26 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr8 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction9 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState5 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        list8 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var9 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        kotlin.b.b(obj3);
                        i16 = i44;
                        list7 = list26;
                        r35 = kfn0VarArr38;
                        r35[i17] = obj3;
                        kfn0VarArr8[5] = aVar2.j();
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction9;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr8;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = list7;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr8;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i16;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 6;
                        scootersDetailedOrderActionListFactory$create$1.label = 12;
                        obj3 = aVar2.k(false, p6p0Var9, list8, scootersDetailedOrderAction$ClickType$Toggle$ToggleState5, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 12:
                        i18 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        kfn0[] kfn0VarArr39 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        list7 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr9 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction10 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        kotlin.b.b(obj3);
                        r02 = kfn0VarArr39;
                        r02[i18] = obj3;
                        List<kfn0> A42 = j73.A(kfn0VarArr9);
                        ArrayList arrayList82 = new ArrayList(tcc.n(A42, 10));
                        while (r0.hasNext()) {
                        }
                        return new rgn0(arrayList82, list7);
                    case 13:
                        int i45 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        int i46 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr40 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction13 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState25 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        List list27 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        scootersOnTheWayAction3 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$3;
                        p6p0Var3 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var3 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        jfn0Var2 = (jfn0) scootersDetailedOrderActionListFactory$create$1.L$0;
                        kotlin.b.b(obj3);
                        i4 = i45;
                        i33 = i46;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState13 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState25;
                        list17 = list27;
                        r36 = kfn0VarArr40;
                        r36[i4] = obj3;
                        kfn0VarArr[2] = aVar2.l();
                        kfn0VarArr[3] = aVar2.i();
                        List<kfn0> A52 = j73.A(kfn0VarArr);
                        ArrayList arrayList92 = new ArrayList(tcc.n(A52, 10));
                        while (r2.hasNext()) {
                        }
                        kfn0[] kfn0VarArr232 = new kfn0[7];
                        scootersDetailedOrderActionListFactory$create$1.L$0 = jfn0Var2;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var3;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var3;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list17;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction3;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr232;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList92;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr232;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 0;
                        scootersDetailedOrderActionListFactory$create$1.label = 14;
                        obj3 = k(true, p6p0Var3, list17, scootersDetailedOrderAction$ClickType$Toggle$ToggleState13, scootersDetailedOrderActionListFactory$create$1);
                        aVar2 = this;
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 14:
                        int i47 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        int i48 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr41 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        ?? r43 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0[] kfn0VarArr42 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        ScootersOnTheWayAction scootersOnTheWayAction17 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState26 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState27 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        List list28 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var3 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var3 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        jfn0Var2 = (jfn0) scootersDetailedOrderActionListFactory$create$1.L$0;
                        kotlin.b.b(obj3);
                        i19 = i47;
                        i33 = i48;
                        kfn0VarArr10 = kfn0VarArr42;
                        scootersOnTheWayAction3 = scootersOnTheWayAction17;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState26;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState27;
                        list9 = list28;
                        r37 = kfn0VarArr41;
                        arrayList3 = r43;
                        r37[i19] = obj3;
                        kfn0VarArr10[1] = jfn0Var2;
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var3;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var3;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list9;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState6;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction3;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr10;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList3;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr10;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 2;
                        scootersDetailedOrderActionListFactory$create$1.label = 15;
                        obj3 = aVar2.e(i33, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 15:
                        i20 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        i33 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr43 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        list10 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr11 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction11 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState6 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        list9 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var10 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var9 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        kotlin.b.b(obj3);
                        r25 = kfn0VarArr43;
                        r25[i20] = obj3;
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var10;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list9;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState6;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction11;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr11;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = list10;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr11;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 3;
                        scootersDetailedOrderActionListFactory$create$1.label = 16;
                        obj3 = aVar2.d(zuo0Var9, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 16:
                        i21 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        i33 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr44 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        list10 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr11 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction11 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState6 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        list9 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var10 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        kotlin.b.b(obj3);
                        r26 = kfn0VarArr44;
                        r26[i21] = obj3;
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var10;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list9;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState6;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction11;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr11;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = list10;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr11;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 4;
                        scootersDetailedOrderActionListFactory$create$1.label = 17;
                        obj3 = aVar2.h(scootersDetailedOrderAction$ClickType$Toggle$ToggleState12, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 17:
                        i23 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        int i49 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr45 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        List list29 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr11 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction11 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState6 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        list12 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var11 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        kotlin.b.b(obj3);
                        i22 = i49;
                        list11 = list29;
                        r38 = kfn0VarArr45;
                        r38[i23] = obj3;
                        kfn0VarArr11[5] = aVar2.j();
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction11;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = kfn0VarArr11;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = list11;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = kfn0VarArr11;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i22;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 6;
                        scootersDetailedOrderActionListFactory$create$1.label = 18;
                        obj3 = aVar2.k(false, p6p0Var11, list12, scootersDetailedOrderAction$ClickType$Toggle$ToggleState6, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 18:
                        i24 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        kfn0[] kfn0VarArr46 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        list11 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0VarArr12 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction12 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        kotlin.b.b(obj3);
                        r03 = kfn0VarArr46;
                        r03[i24] = obj3;
                        List<kfn0> A62 = j73.A(kfn0VarArr12);
                        ArrayList arrayList102 = new ArrayList(tcc.n(A62, 10));
                        while (r0.hasNext()) {
                        }
                        return new rgn0(arrayList102, list11);
                    case 19:
                        int i50 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        int i51 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr47 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0[] kfn0VarArr48 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        scootersOnTheWayAction13 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState28 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState12 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        List list30 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        scootersOnTheWayAction2 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$3;
                        p6p0Var2 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var2 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        jfn0 jfn0Var8 = (jfn0) scootersDetailedOrderActionListFactory$create$1.L$0;
                        kotlin.b.b(obj3);
                        jfn0Var6 = jfn0Var8;
                        i33 = i51;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState13 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState28;
                        list17 = list30;
                        obj = obj3;
                        objArr2 = kfn0VarArr48;
                        objArr = kfn0VarArr47;
                        i3 = i50;
                        objArr[i3] = obj;
                        objArr2[2] = aVar2.f(zuo0Var2);
                        objArr2[3] = new wen0(new mfn0(r0h0.ic_scooters_cancel_riding), ((avj0) zuj0Var).h(kyh0.scooters_ontheway_action_finish), "finish_riding", 0, null, Integer.valueOf(vqg0.scooter_finish_action_color_pale), null, ScootersOnTheWayAction.FINISH, 88);
                        List<kfn0> A72 = j73.A(objArr2);
                        ArrayList arrayList112 = new ArrayList(tcc.n(A72, 10));
                        while (r3.hasNext()) {
                        }
                        objArr3 = new kfn0[8];
                        scootersDetailedOrderActionListFactory$create$1.L$0 = jfn0Var6;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var2;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var2;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list17;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState12;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState13;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction2;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = objArr3;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList112;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = objArr3;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i33;
                        z = false;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 0;
                        scootersDetailedOrderActionListFactory$create$1.label = 20;
                        k = k(true, p6p0Var2, list17, scootersDetailedOrderAction$ClickType$Toggle$ToggleState13, scootersDetailedOrderActionListFactory$create$1);
                        aVar = this;
                        if (k != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 20:
                        i26 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        i25 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr49 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        ?? r44 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0[] kfn0VarArr50 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        ScootersOnTheWayAction scootersOnTheWayAction18 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState8 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState29 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        List list31 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0 p6p0Var15 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0 zuo0Var13 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        jfn0 jfn0Var9 = (jfn0) scootersDetailedOrderActionListFactory$create$1.L$0;
                        kotlin.b.b(obj3);
                        jfn0Var5 = jfn0Var9;
                        zuo0Var2 = zuo0Var13;
                        p6p0Var2 = p6p0Var15;
                        obj2 = obj3;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState7 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState29;
                        list13 = list31;
                        scootersOnTheWayAction2 = scootersOnTheWayAction18;
                        arrayList4 = r44;
                        objArr4 = kfn0VarArr49;
                        objArr3 = kfn0VarArr50;
                        aVar = aVar2;
                        z = false;
                        objArr4[i26] = obj2;
                        z2 = true;
                        objArr3[1] = jfn0Var5;
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var2;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var2;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list13;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState7;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState8;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction2;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = objArr3;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = arrayList4;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = objArr3;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i25;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 2;
                        scootersDetailedOrderActionListFactory$create$1.label = 21;
                        e = aVar.e(i25, scootersDetailedOrderActionListFactory$create$1);
                        if (e != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 21:
                        int i52 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        i28 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        objArr5 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        List list32 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0[] kfn0VarArr51 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        ScootersOnTheWayAction scootersOnTheWayAction19 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState9 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState10 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        list13 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0 p6p0Var16 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var10 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        kotlin.b.b(obj3);
                        list14 = list32;
                        objArr3 = kfn0VarArr51;
                        i27 = i52;
                        z2 = true;
                        p6p0Var2 = p6p0Var16;
                        scootersOnTheWayAction2 = scootersOnTheWayAction19;
                        aVar = aVar2;
                        z = false;
                        objArr5[i27] = obj3;
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var10;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var2;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list13;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState10;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState9;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction2;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = objArr3;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = list14;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = objArr3;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i28;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 3;
                        scootersDetailedOrderActionListFactory$create$1.label = 22;
                        obj3 = aVar.d(zuo0Var10, scootersDetailedOrderActionListFactory$create$1);
                        if (obj3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 22:
                        int i53 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        int i54 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        objArr3 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        list14 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0[] kfn0VarArr52 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        ScootersOnTheWayAction scootersOnTheWayAction20 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState30 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState11 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$5;
                        List list33 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var12 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0Var11 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        kotlin.b.b(obj3);
                        scootersOnTheWayAction2 = scootersOnTheWayAction20;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState9 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState30;
                        list15 = list33;
                        i29 = i53;
                        i28 = i54;
                        objArr6 = kfn0VarArr52;
                        z2 = true;
                        aVar = aVar2;
                        z = false;
                        objArr3[i29] = obj3;
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = zuo0Var11;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = p6p0Var12;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = list15;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState9;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction2;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = objArr6;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = list14;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = objArr6;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i28;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 4;
                        scootersDetailedOrderActionListFactory$create$1.label = 23;
                        h = aVar.h(scootersDetailedOrderAction$ClickType$Toggle$ToggleState11, scootersDetailedOrderActionListFactory$create$1);
                        if (h != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 23:
                        i30 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        int i55 = scootersDetailedOrderActionListFactory$create$1.I$0;
                        kfn0[] kfn0VarArr53 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        List list34 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0[] kfn0VarArr54 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        ScootersOnTheWayAction scootersOnTheWayAction21 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState9 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$create$1.L$6;
                        list15 = (List) scootersDetailedOrderActionListFactory$create$1.L$4;
                        p6p0Var13 = (p6p0) scootersDetailedOrderActionListFactory$create$1.L$2;
                        zuo0 zuo0Var14 = (zuo0) scootersDetailedOrderActionListFactory$create$1.L$1;
                        kotlin.b.b(obj3);
                        i31 = i55;
                        list16 = list34;
                        objArr7 = kfn0VarArr53;
                        objArr6 = kfn0VarArr54;
                        zuo0Var11 = zuo0Var14;
                        z2 = true;
                        scootersOnTheWayAction2 = scootersOnTheWayAction21;
                        aVar = aVar2;
                        z = false;
                        objArr7[i30] = obj3;
                        objArr6[5] = aVar.c(zuo0Var11);
                        objArr6[6] = aVar.j();
                        scootersDetailedOrderActionListFactory$create$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$1 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$2 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$3 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$4 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$5 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$6 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$7 = null;
                        scootersDetailedOrderActionListFactory$create$1.L$8 = scootersOnTheWayAction2;
                        scootersDetailedOrderActionListFactory$create$1.L$9 = objArr6;
                        scootersDetailedOrderActionListFactory$create$1.L$10 = list16;
                        scootersDetailedOrderActionListFactory$create$1.L$11 = objArr6;
                        scootersDetailedOrderActionListFactory$create$1.I$0 = i31;
                        scootersDetailedOrderActionListFactory$create$1.I$1 = 7;
                        scootersDetailedOrderActionListFactory$create$1.label = 24;
                        k2 = aVar.k(false, p6p0Var13, list15, scootersDetailedOrderAction$ClickType$Toggle$ToggleState9, scootersDetailedOrderActionListFactory$create$1);
                        if (k2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 24:
                        i32 = scootersDetailedOrderActionListFactory$create$1.I$1;
                        kfn0[] kfn0VarArr55 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$11;
                        list16 = (List) scootersDetailedOrderActionListFactory$create$1.L$10;
                        kfn0[] kfn0VarArr56 = (kfn0[]) scootersDetailedOrderActionListFactory$create$1.L$9;
                        ScootersOnTheWayAction scootersOnTheWayAction22 = (ScootersOnTheWayAction) scootersDetailedOrderActionListFactory$create$1.L$8;
                        kotlin.b.b(obj3);
                        scootersOnTheWayAction2 = scootersOnTheWayAction22;
                        z2 = true;
                        objArr8 = kfn0VarArr56;
                        objArr6 = kfn0VarArr55;
                        z = false;
                        objArr6[i32] = obj3;
                        List<kfn0> A82 = j73.A(objArr8);
                        ArrayList arrayList122 = new ArrayList(tcc.n(A82, 10));
                        while (r2.hasNext()) {
                        }
                        return new rgn0(arrayList122, list16);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        scootersDetailedOrderActionListFactory$create$1 = new ScootersDetailedOrderActionListFactory$create$1(aVar2, continuationImpl);
        Object obj32 = scootersDetailedOrderActionListFactory$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersDetailedOrderActionListFactory$create$1.label;
        zuj0 zuj0Var2 = aVar2.a;
        switch (i2) {
        }
    }

    public final zen0 c(zuo0 zuo0Var) {
        if (!(z1b1.a(zuo0Var) instanceof pdz)) {
            return null;
        }
        qdz a = z1b1.a(zuo0Var);
        pdz pdzVar = a instanceof pdz ? (pdz) a : null;
        String str = pdzVar != null ? pdzVar.a : null;
        if (str == null) {
            str = "";
        }
        return new zen0(new mfn0(r0h0.ic_scooters_open_lock), str, "manual_lock", 0, ren0.a, null, ((avj0) this.a).h(kyh0.scooters_manual_lock_subtitle), null, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersDetailedOrderActionListFactory$onboardingEntrypoint$1 scootersDetailedOrderActionListFactory$onboardingEntrypoint$1;
        int i;
        m5o0 m5o0Var;
        if (continuationImpl instanceof ScootersDetailedOrderActionListFactory$onboardingEntrypoint$1) {
            scootersDetailedOrderActionListFactory$onboardingEntrypoint$1 = (ScootersDetailedOrderActionListFactory$onboardingEntrypoint$1) continuationImpl;
            int i2 = scootersDetailedOrderActionListFactory$onboardingEntrypoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderActionListFactory$onboardingEntrypoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailedOrderActionListFactory$onboardingEntrypoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderActionListFactory$onboardingEntrypoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersDetailedOrderActionListFactory$onboardingEntrypoint$1.L$0 = null;
                    scootersDetailedOrderActionListFactory$onboardingEntrypoint$1.label = 1;
                    obj = this.f.a(zuo0Var, scootersDetailedOrderActionListFactory$onboardingEntrypoint$1);
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
                m5o0Var = (m5o0) obj;
                if (!(m5o0Var instanceof l5o0)) {
                    return null;
                }
                if (!(m5o0Var instanceof k5o0)) {
                    w511.b();
                    return null;
                }
                int i3 = kyh0.scooters_ontheway_action_show_onboarding_title;
                avj0 avj0Var = (avj0) this.a;
                return new afn0(avj0Var.h(i3), avj0Var.h(kyh0.scooters_ontheway_action_show_onboarding_subtitle), ((k5o0) m5o0Var).a);
            }
        }
        scootersDetailedOrderActionListFactory$onboardingEntrypoint$1 = new ScootersDetailedOrderActionListFactory$onboardingEntrypoint$1(this, continuationImpl);
        Object obj2 = scootersDetailedOrderActionListFactory$onboardingEntrypoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderActionListFactory$onboardingEntrypoint$1.label;
        if (i != 0) {
        }
        m5o0Var = (m5o0) obj2;
        if (!(m5o0Var instanceof l5o0)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006e, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005a, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, ContinuationImpl continuationImpl) {
        ScootersDetailedOrderActionListFactory$oneMore$1 scootersDetailedOrderActionListFactory$oneMore$1;
        Object obj;
        int i2;
        int i3;
        String h;
        if (continuationImpl instanceof ScootersDetailedOrderActionListFactory$oneMore$1) {
            scootersDetailedOrderActionListFactory$oneMore$1 = (ScootersDetailedOrderActionListFactory$oneMore$1) continuationImpl;
            int i4 = scootersDetailedOrderActionListFactory$oneMore$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderActionListFactory$oneMore$1.label = i4 - Integer.MIN_VALUE;
                obj = scootersDetailedOrderActionListFactory$oneMore$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = scootersDetailedOrderActionListFactory$oneMore$1.label;
                h hVar = this.h;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    scootersDetailedOrderActionListFactory$oneMore$1.I$0 = i;
                    scootersDetailedOrderActionListFactory$oneMore$1.label = 1;
                    obj = this.g.a(scootersDetailedOrderActionListFactory$oneMore$1);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i = scootersDetailedOrderActionListFactory$oneMore$1.I$0;
                            kotlin.b.b(obj);
                            if (((ScootersMultiOrderExperiment) obj).b) {
                                scootersDetailedOrderActionListFactory$oneMore$1.I$0 = i;
                                scootersDetailedOrderActionListFactory$oneMore$1.I$1 = i;
                                scootersDetailedOrderActionListFactory$oneMore$1.label = 3;
                                obj = hVar.a(scootersDetailedOrderActionListFactory$oneMore$1);
                                if (obj != coroutineSingletons) {
                                    i3 = i;
                                    if (i < ((ScootersMultiOrderExperiment) obj).d) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            return null;
                        }
                        if (i2 == 3) {
                            i = scootersDetailedOrderActionListFactory$oneMore$1.I$1;
                            i3 = scootersDetailedOrderActionListFactory$oneMore$1.I$0;
                            kotlin.b.b(obj);
                            if (i < ((ScootersMultiOrderExperiment) obj).d) {
                                scootersDetailedOrderActionListFactory$oneMore$1.I$0 = i3;
                                scootersDetailedOrderActionListFactory$oneMore$1.label = 4;
                                obj = this.l.a(scootersDetailedOrderActionListFactory$oneMore$1);
                            }
                            return null;
                        }
                        if (i2 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        zuj0 zuj0Var = this.a;
                        if (booleanValue) {
                            h = ((avj0) zuj0Var).h(kyh0.scooters_one_more_order_title_with_bikes);
                        } else {
                            h = ((avj0) zuj0Var).h(kyh0.scooters_one_more_order_title);
                        }
                        return new bfn0(new mfn0(r0h0.ic_scooters_action_one_more), h, "one_more_scooter", 0, null, null, null, null, 248);
                    }
                    i = scootersDetailedOrderActionListFactory$oneMore$1.I$0;
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    scootersDetailedOrderActionListFactory$oneMore$1.I$0 = i;
                    scootersDetailedOrderActionListFactory$oneMore$1.label = 2;
                    obj = hVar.a(scootersDetailedOrderActionListFactory$oneMore$1);
                }
                return null;
            }
        }
        scootersDetailedOrderActionListFactory$oneMore$1 = new ScootersDetailedOrderActionListFactory$oneMore$1(this, continuationImpl);
        obj = scootersDetailedOrderActionListFactory$oneMore$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersDetailedOrderActionListFactory$oneMore$1.label;
        h hVar2 = this.h;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return null;
    }

    public final cfn0 f(zuo0 zuo0Var) {
        if (!(z1b1.a(zuo0Var) instanceof odz)) {
            return null;
        }
        return new cfn0(new mfn0(r0h0.ic_scooters_open_lock), ((avj0) this.a).h(kyh0.scooters_ontheway_action_open), "open_lock", 0, null, null, null, null, 248);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersDetailedOrderActionListFactory$routeNavigation$1 scootersDetailedOrderActionListFactory$routeNavigation$1;
        int i;
        a650 a650Var;
        if (continuationImpl instanceof ScootersDetailedOrderActionListFactory$routeNavigation$1) {
            scootersDetailedOrderActionListFactory$routeNavigation$1 = (ScootersDetailedOrderActionListFactory$routeNavigation$1) continuationImpl;
            int i2 = scootersDetailedOrderActionListFactory$routeNavigation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderActionListFactory$routeNavigation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailedOrderActionListFactory$routeNavigation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderActionListFactory$routeNavigation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.e.b.b() == null && zuo0Var.i() != ScootersSessionType.FIX_POINT) {
                        scootersDetailedOrderActionListFactory$routeNavigation$1.L$0 = null;
                        scootersDetailedOrderActionListFactory$routeNavigation$1.label = 1;
                        obj = this.k.a(scootersDetailedOrderActionListFactory$routeNavigation$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a650Var = ((g0) obj).g;
                if (a650Var != null && jl40.l(a650Var.a, Boolean.TRUE)) {
                    return new dfn0(new mfn0(r0h0.ic_scooters_route_navigation), ((avj0) this.a).h(kyh0.scooters_ontheway_action_route), "scooters_route_navigation", 0, null, null, null, ScootersOnTheWayAction.ROUTE, 248);
                }
                return null;
            }
        }
        scootersDetailedOrderActionListFactory$routeNavigation$1 = new ScootersDetailedOrderActionListFactory$routeNavigation$1(this, continuationImpl);
        Object obj2 = scootersDetailedOrderActionListFactory$routeNavigation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderActionListFactory$routeNavigation$1.label;
        if (i != 0) {
        }
        a650Var = ((g0) obj2).g;
        if (a650Var != null) {
            return new dfn0(new mfn0(r0h0.ic_scooters_route_navigation), ((avj0) this.a).h(kyh0.scooters_ontheway_action_route), "scooters_route_navigation", 0, null, null, null, ScootersOnTheWayAction.ROUTE, 248);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState, ContinuationImpl continuationImpl) {
        ScootersDetailedOrderActionListFactory$shareLocation$1 scootersDetailedOrderActionListFactory$shareLocation$1;
        int i;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState2;
        Object a;
        if (continuationImpl instanceof ScootersDetailedOrderActionListFactory$shareLocation$1) {
            scootersDetailedOrderActionListFactory$shareLocation$1 = (ScootersDetailedOrderActionListFactory$shareLocation$1) continuationImpl;
            int i2 = scootersDetailedOrderActionListFactory$shareLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderActionListFactory$shareLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailedOrderActionListFactory$shareLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderActionListFactory$shareLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersDetailedOrderAction$ClickType$Toggle$ToggleState2 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState;
                    scootersDetailedOrderActionListFactory$shareLocation$1.L$0 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState2;
                    scootersDetailedOrderActionListFactory$shareLocation$1.label = 1;
                    a = this.j.a(scootersDetailedOrderActionListFactory$shareLocation$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState3 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$shareLocation$1.L$0;
                    kotlin.b.b(obj);
                    a = obj;
                    scootersDetailedOrderAction$ClickType$Toggle$ToggleState2 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState3;
                }
                if (((fvo0) a).b && scootersDetailedOrderAction$ClickType$Toggle$ToggleState2 != ScootersDetailedOrderAction$ClickType$Toggle$ToggleState.ON) {
                    return null;
                }
                return new efn0(new mfn0(f1h0.ic_order_card_live_location), ((avj0) this.a).h(kyh0.scooters_ontheway_action_share_location), "live_location", 0, new sen0(scootersDetailedOrderAction$ClickType$Toggle$ToggleState2, true), null, null, null, 232);
            }
        }
        scootersDetailedOrderActionListFactory$shareLocation$1 = new ScootersDetailedOrderActionListFactory$shareLocation$1(this, continuationImpl);
        Object obj2 = scootersDetailedOrderActionListFactory$shareLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderActionListFactory$shareLocation$1.label;
        if (i != 0) {
        }
        if (((fvo0) a).b) {
        }
        return new efn0(new mfn0(f1h0.ic_order_card_live_location), ((avj0) this.a).h(kyh0.scooters_ontheway_action_share_location), "live_location", 0, new sen0(scootersDetailedOrderAction$ClickType$Toggle$ToggleState2, true), null, null, null, 232);
    }

    public final ffn0 i() {
        return new ffn0(new mfn0(r0h0.ic_scooters_start_riding_control), ((avj0) this.a).h(kyh0.scooters_ontheway_action_start), "start_riding", xng0.controlMain, null, null, null, ScootersOnTheWayAction.START, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
    }

    public final gfn0 j() {
        return new gfn0(new mfn0(r0h0.ic_scooters_action_support), ((avj0) this.a).h(kyh0.scooters_ontheway_action_supprot), FoldersConfig.SUPPORT_FILTER_ID, 0, null, null, null, null, 248);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(boolean z, p6p0 p6p0Var, List list, ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState, ContinuationImpl continuationImpl) {
        ScootersDetailedOrderActionListFactory$voluntarySlowdown$1 scootersDetailedOrderActionListFactory$voluntarySlowdown$1;
        ScootersDetailedOrderActionListFactory$voluntarySlowdown$1 scootersDetailedOrderActionListFactory$voluntarySlowdown$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        boolean z2;
        p6p0 p6p0Var2;
        List list2;
        ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState2;
        o8p0 o8p0Var;
        if (continuationImpl instanceof ScootersDetailedOrderActionListFactory$voluntarySlowdown$1) {
            scootersDetailedOrderActionListFactory$voluntarySlowdown$1 = (ScootersDetailedOrderActionListFactory$voluntarySlowdown$1) continuationImpl;
            int i2 = scootersDetailedOrderActionListFactory$voluntarySlowdown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderActionListFactory$voluntarySlowdown$1.label = i2 - Integer.MIN_VALUE;
                scootersDetailedOrderActionListFactory$voluntarySlowdown$12 = scootersDetailedOrderActionListFactory$voluntarySlowdown$1;
                Object obj = scootersDetailedOrderActionListFactory$voluntarySlowdown$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderActionListFactory$voluntarySlowdown$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$0 = p6p0Var;
                    scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$1 = list;
                    scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$2 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState;
                    scootersDetailedOrderActionListFactory$voluntarySlowdown$12.Z$0 = z;
                    scootersDetailedOrderActionListFactory$voluntarySlowdown$12.label = 1;
                    a = this.i.a(scootersDetailedOrderActionListFactory$voluntarySlowdown$12);
                    if (a != coroutineSingletons) {
                        z2 = z;
                        p6p0Var2 = p6p0Var;
                        list2 = list;
                        scootersDetailedOrderAction$ClickType$Toggle$ToggleState2 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                boolean z3 = scootersDetailedOrderActionListFactory$voluntarySlowdown$12.Z$0;
                ScootersDetailedOrderAction$ClickType$Toggle$ToggleState scootersDetailedOrderAction$ClickType$Toggle$ToggleState3 = (ScootersDetailedOrderAction$ClickType$Toggle$ToggleState) scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$2;
                List list3 = (List) scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$1;
                p6p0 p6p0Var3 = (p6p0) scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$0;
                kotlin.b.b(obj);
                z2 = z3;
                list2 = list3;
                scootersDetailedOrderAction$ClickType$Toggle$ToggleState2 = scootersDetailedOrderAction$ClickType$Toggle$ToggleState3;
                a = obj;
                p6p0Var2 = p6p0Var3;
                o8p0Var = (o8p0) a;
                if (!o8p0Var.b || ((z2 && !p6p0Var2.d) || (!z2 && p6p0Var2.d))) {
                    return null;
                }
                ScootersDetailedOrderActionListFactory$voluntarySlowdown$2 scootersDetailedOrderActionListFactory$voluntarySlowdown$2 = new ScootersDetailedOrderActionListFactory$voluntarySlowdown$2(list2, o8p0Var, this, scootersDetailedOrderAction$ClickType$Toggle$ToggleState2, null);
                scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$0 = null;
                scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$1 = null;
                scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$2 = null;
                scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$3 = null;
                scootersDetailedOrderActionListFactory$voluntarySlowdown$12.Z$0 = z2;
                scootersDetailedOrderActionListFactory$voluntarySlowdown$12.label = 2;
                Object n = bvf0.n(scootersDetailedOrderActionListFactory$voluntarySlowdown$2, scootersDetailedOrderActionListFactory$voluntarySlowdown$12);
                return n != coroutineSingletons ? coroutineSingletons : n;
            }
        }
        scootersDetailedOrderActionListFactory$voluntarySlowdown$1 = new ScootersDetailedOrderActionListFactory$voluntarySlowdown$1(this, continuationImpl);
        scootersDetailedOrderActionListFactory$voluntarySlowdown$12 = scootersDetailedOrderActionListFactory$voluntarySlowdown$1;
        Object obj2 = scootersDetailedOrderActionListFactory$voluntarySlowdown$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderActionListFactory$voluntarySlowdown$12.label;
        if (i != 0) {
        }
        o8p0Var = (o8p0) a;
        if (!o8p0Var.b) {
            ScootersDetailedOrderActionListFactory$voluntarySlowdown$2 scootersDetailedOrderActionListFactory$voluntarySlowdown$22 = new ScootersDetailedOrderActionListFactory$voluntarySlowdown$2(list2, o8p0Var, this, scootersDetailedOrderAction$ClickType$Toggle$ToggleState2, null);
            scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$0 = null;
            scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$1 = null;
            scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$2 = null;
            scootersDetailedOrderActionListFactory$voluntarySlowdown$12.L$3 = null;
            scootersDetailedOrderActionListFactory$voluntarySlowdown$12.Z$0 = z2;
            scootersDetailedOrderActionListFactory$voluntarySlowdown$12.label = 2;
            Object n2 = bvf0.n(scootersDetailedOrderActionListFactory$voluntarySlowdown$22, scootersDetailedOrderActionListFactory$voluntarySlowdown$12);
            if (n2 != coroutineSingletons) {
            }
        }
        return null;
    }

    public final ifn0 l() {
        return new ifn0(new mfn0(r0h0.ic_scooters_where_is), ((avj0) this.a).h(kyh0.scooters_ontheway_action_whereis), "where_is_scooter", 0, null, null, null, ScootersOnTheWayAction.BEEP, 248);
    }
}
