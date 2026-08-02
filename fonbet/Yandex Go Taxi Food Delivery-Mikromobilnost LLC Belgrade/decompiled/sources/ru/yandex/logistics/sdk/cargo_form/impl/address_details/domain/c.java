package ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.a0t;
import defpackage.a5v;
import defpackage.ace;
import defpackage.afz0;
import defpackage.aj00;
import defpackage.at0;
import defpackage.bu0;
import defpackage.byq;
import defpackage.cj00;
import defpackage.ct0;
import defpackage.cuj0;
import defpackage.cyq;
import defpackage.d41;
import defpackage.dj00;
import defpackage.dl51;
import defpackage.dlb0;
import defpackage.doe;
import defpackage.dyq;
import defpackage.e0l0;
import defpackage.ej00;
import defpackage.et;
import defpackage.eus0;
import defpackage.evu0;
import defpackage.eyq;
import defpackage.f5v;
import defpackage.fj00;
import defpackage.frl;
import defpackage.fs0;
import defpackage.fyq;
import defpackage.g2q0;
import defpackage.g3q0;
import defpackage.g8e;
import defpackage.g8l0;
import defpackage.gs0;
import defpackage.gts0;
import defpackage.gyq;
import defpackage.h3q0;
import defpackage.hj0;
import defpackage.hts0;
import defpackage.hyq;
import defpackage.ig00;
import defpackage.is00;
import defpackage.ita1;
import defpackage.j17;
import defpackage.j6s;
import defpackage.j7l0;
import defpackage.jg00;
import defpackage.jgz;
import defpackage.joa1;
import defpackage.jt0;
import defpackage.jts0;
import defpackage.ksy0;
import defpackage.kud0;
import defpackage.l7x0;
import defpackage.ldc;
import defpackage.lqe;
import defpackage.lt0;
import defpackage.lts0;
import defpackage.lvi0;
import defpackage.m8e;
import defpackage.mkb0;
import defpackage.mru;
import defpackage.mt0;
import defpackage.n351;
import defpackage.nae;
import defpackage.nxq;
import defpackage.ny61;
import defpackage.oo0;
import defpackage.ot0;
import defpackage.ow91;
import defpackage.ozg0;
import defpackage.pre;
import defpackage.q8q0;
import defpackage.q8s;
import defpackage.qg90;
import defpackage.qkb0;
import defpackage.qv0;
import defpackage.r5s;
import defpackage.ra90;
import defpackage.rgb0;
import defpackage.rj51;
import defpackage.s9e;
import defpackage.sbv;
import defpackage.scc;
import defpackage.sls;
import defpackage.su0;
import defpackage.t6u0;
import defpackage.tdv;
import defpackage.tj51;
import defpackage.tls;
import defpackage.txq;
import defpackage.u0z;
import defpackage.u1n;
import defpackage.u6u0;
import defpackage.uj51;
import defpackage.us0;
import defpackage.v7q0;
import defpackage.va31;
import defpackage.vs0;
import defpackage.vu0;
import defpackage.wa31;
import defpackage.x2s;
import defpackage.x7l0;
import defpackage.xaq0;
import defpackage.y4v;
import defpackage.y6x0;
import defpackage.y7m;
import defpackage.ybe;
import defpackage.yi00;
import defpackage.yj70;
import defpackage.zez0;
import defpackage.zi00;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.config.MapConfig$MapStyle$MapTheme;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain.c;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.ActionButtonMapper$Container;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.AddressDetailsState;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.FieldImeAction;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.FieldVisibility;

/* loaded from: classes5.dex */
public final class c {
    public final bu0 a;
    public final ct0 b;
    public final l7x0 c;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a d;
    public final ru.yandex.taxi.logistics.sdk.photocomments.domain.a e;
    public final u1n f;
    public final u6u0 g;
    public final yj70 h;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.section_promo.a i;
    public final q8s j;

    public c(bu0 bu0Var, ct0 ct0Var, l7x0 l7x0Var, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar, ru.yandex.taxi.logistics.sdk.photocomments.domain.a aVar2, u1n u1nVar, u6u0 u6u0Var, yj70 yj70Var, ru.yandex.logistics.sdk.cargo_form.impl.ui.section_promo.a aVar3, q8s q8sVar) {
        this.a = bu0Var;
        this.b = ct0Var;
        this.c = l7x0Var;
        this.d = aVar;
        this.e = aVar2;
        this.f = u1nVar;
        this.g = u6u0Var;
        this.h = yj70Var;
        this.i = aVar3;
        this.j = q8sVar;
    }

    public static String a(j7l0 j7l0Var, hyq hyqVar, Set set, int i) {
        List list;
        Object obj;
        if (!set.contains(new Pair(hyqVar, Integer.valueOf(i))) && j7l0Var != null && (list = j7l0Var.f) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((fs0) obj).b.equals(hyqVar)) {
                    break;
                }
            }
            fs0 fs0Var = (fs0) obj;
            if (fs0Var != null) {
                return fs0Var.a;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(e0l0 e0l0Var, at0 at0Var, List list, gs0 gs0Var, j6s j6sVar, FormLoadingStateRepository$State formLoadingStateRepository$State, Set set, Integer num, g8l0 g8l0Var, AddressDetailsState addressDetailsState, jg00 jg00Var, boolean z, Set set2, Map map, ContinuationImpl continuationImpl) {
        AddressDetailsScreenMapper$map$1 addressDetailsScreenMapper$map$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        gs0 gs0Var2;
        Set set3;
        AddressDetailsState addressDetailsState2;
        j6s j6sVar2;
        Object obj;
        at0 at0Var2;
        g8l0 g8l0Var2;
        e0l0 e0l0Var2;
        jg00 jg00Var2;
        Map map2;
        FormLoadingStateRepository$State formLoadingStateRepository$State2;
        boolean z2;
        Set set4;
        Object f;
        AddressDetailsScreenMapper$map$1 addressDetailsScreenMapper$map$12;
        at0 at0Var3;
        Map map3;
        g8l0 g8l0Var3;
        g2q0 g2q0Var;
        boolean z3;
        Object obj2;
        Set set5;
        Set set6;
        jg00 jg00Var3;
        FormLoadingStateRepository$State formLoadingStateRepository$State3;
        j6s j6sVar3;
        AddressDetailsState addressDetailsState3;
        Object e;
        c cVar;
        j6s j6sVar4;
        e0l0 e0l0Var3;
        gs0 gs0Var3;
        FormLoadingStateRepository$State formLoadingStateRepository$State4;
        boolean z4;
        Set set7;
        AddressDetailsState addressDetailsState4;
        at0 at0Var4;
        g2q0 g2q0Var2;
        g2q0 g2q0Var3;
        j17 j17Var;
        Object f2;
        c cVar2;
        AddressDetailsScreenMapper$map$1 addressDetailsScreenMapper$map$13;
        List list2;
        boolean z5;
        g2q0 g2q0Var4;
        e0l0 e0l0Var4;
        j17 j17Var2;
        AddressDetailsState addressDetailsState5;
        g2q0 g2q0Var5;
        vu0 vu0Var;
        String str;
        qv0 qv0Var;
        qv0 qv0Var2;
        LinkedHashMap l;
        y7m y7mVar;
        ldc f3;
        vs0 vs0Var;
        us0 us0Var;
        vu0 vu0Var2;
        ldc ldcVar;
        LinkedHashMap linkedHashMap;
        y7m y7mVar2;
        g2q0 g2q0Var6;
        if (continuationImpl instanceof AddressDetailsScreenMapper$map$1) {
            addressDetailsScreenMapper$map$1 = (AddressDetailsScreenMapper$map$1) continuationImpl;
            int i2 = addressDetailsScreenMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressDetailsScreenMapper$map$1.label = i2 - Integer.MIN_VALUE;
                AddressDetailsScreenMapper$map$1 addressDetailsScreenMapper$map$14 = addressDetailsScreenMapper$map$1;
                Object obj3 = addressDetailsScreenMapper$map$14.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressDetailsScreenMapper$map$14.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    this.h.getClass();
                    qg90 j = yj70.j(num, g8l0Var, list);
                    Pair pair = j != null ? new Pair(j.a, j.b) : new Pair(at0Var, null);
                    at0 at0Var5 = (at0) pair.getFirst();
                    g8l0 g8l0Var4 = (g8l0) pair.getSecond();
                    e0l0 e0l0Var5 = (at0Var5 != null ? at0Var5.f : null) instanceof su0 ? j6sVar.d : e0l0Var;
                    lqe lqeVar = at0Var5 != null ? at0Var5.a : null;
                    addressDetailsScreenMapper$map$14.L$0 = null;
                    addressDetailsScreenMapper$map$14.L$1 = null;
                    addressDetailsScreenMapper$map$14.L$2 = null;
                    gs0Var2 = gs0Var;
                    addressDetailsScreenMapper$map$14.L$3 = gs0Var2;
                    addressDetailsScreenMapper$map$14.L$4 = j6sVar;
                    addressDetailsScreenMapper$map$14.L$5 = formLoadingStateRepository$State;
                    set3 = set;
                    addressDetailsScreenMapper$map$14.L$6 = set3;
                    addressDetailsScreenMapper$map$14.L$7 = null;
                    addressDetailsScreenMapper$map$14.L$8 = null;
                    addressDetailsState2 = addressDetailsState;
                    addressDetailsScreenMapper$map$14.L$9 = addressDetailsState2;
                    addressDetailsScreenMapper$map$14.L$10 = jg00Var;
                    addressDetailsScreenMapper$map$14.L$11 = set2;
                    addressDetailsScreenMapper$map$14.L$12 = map;
                    addressDetailsScreenMapper$map$14.L$13 = null;
                    addressDetailsScreenMapper$map$14.L$14 = at0Var5;
                    addressDetailsScreenMapper$map$14.L$15 = g8l0Var4;
                    addressDetailsScreenMapper$map$14.L$16 = e0l0Var5;
                    addressDetailsScreenMapper$map$14.Z$0 = z;
                    addressDetailsScreenMapper$map$14.label = 1;
                    Object f4 = f(lqeVar, j6sVar, formLoadingStateRepository$State, set2, addressDetailsScreenMapper$map$14);
                    if (f4 != coroutineSingletons) {
                        j6sVar2 = j6sVar;
                        obj = f4;
                        at0Var2 = at0Var5;
                        g8l0Var2 = g8l0Var4;
                        e0l0Var2 = e0l0Var5;
                        jg00Var2 = jg00Var;
                        map2 = map;
                        formLoadingStateRepository$State2 = formLoadingStateRepository$State;
                        z2 = z;
                        set4 = set2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        z3 = addressDetailsScreenMapper$map$14.Z$0;
                        g2q0Var = (g2q0) addressDetailsScreenMapper$map$14.L$17;
                        e0l0Var2 = (e0l0) addressDetailsScreenMapper$map$14.L$16;
                        g8l0Var3 = (g8l0) addressDetailsScreenMapper$map$14.L$15;
                        at0Var3 = (at0) addressDetailsScreenMapper$map$14.L$14;
                        Map map4 = (Map) addressDetailsScreenMapper$map$14.L$12;
                        set6 = (Set) addressDetailsScreenMapper$map$14.L$11;
                        jg00Var3 = (jg00) addressDetailsScreenMapper$map$14.L$10;
                        addressDetailsState3 = (AddressDetailsState) addressDetailsScreenMapper$map$14.L$9;
                        Set set8 = (Set) addressDetailsScreenMapper$map$14.L$6;
                        formLoadingStateRepository$State3 = (FormLoadingStateRepository$State) addressDetailsScreenMapper$map$14.L$5;
                        j6sVar3 = (j6s) addressDetailsScreenMapper$map$14.L$4;
                        gs0 gs0Var4 = (gs0) addressDetailsScreenMapper$map$14.L$3;
                        kotlin.b.b(obj3);
                        addressDetailsScreenMapper$map$12 = addressDetailsScreenMapper$map$14;
                        set5 = set8;
                        map3 = map4;
                        obj2 = obj3;
                        gs0Var2 = gs0Var4;
                        g2q0 g2q0Var7 = (g2q0) obj2;
                        Map map5 = map3;
                        va31 va31Var = at0Var3 == null ? at0Var3.l : null;
                        addressDetailsScreenMapper$map$12.L$0 = null;
                        addressDetailsScreenMapper$map$12.L$1 = null;
                        addressDetailsScreenMapper$map$12.L$2 = null;
                        addressDetailsScreenMapper$map$12.L$3 = gs0Var2;
                        addressDetailsScreenMapper$map$12.L$4 = j6sVar3;
                        addressDetailsScreenMapper$map$12.L$5 = formLoadingStateRepository$State3;
                        addressDetailsScreenMapper$map$12.L$6 = null;
                        addressDetailsScreenMapper$map$12.L$7 = null;
                        addressDetailsScreenMapper$map$12.L$8 = null;
                        addressDetailsScreenMapper$map$12.L$9 = addressDetailsState3;
                        addressDetailsScreenMapper$map$12.L$10 = null;
                        addressDetailsScreenMapper$map$12.L$11 = set6;
                        addressDetailsScreenMapper$map$12.L$12 = null;
                        addressDetailsScreenMapper$map$12.L$13 = null;
                        addressDetailsScreenMapper$map$12.L$14 = at0Var3;
                        addressDetailsScreenMapper$map$12.L$15 = null;
                        addressDetailsScreenMapper$map$12.L$16 = e0l0Var2;
                        addressDetailsScreenMapper$map$12.L$17 = g2q0Var;
                        addressDetailsScreenMapper$map$12.L$18 = g2q0Var7;
                        addressDetailsScreenMapper$map$12.Z$0 = z3;
                        addressDetailsScreenMapper$map$12.label = 3;
                        boolean z6 = z3;
                        e0l0 e0l0Var6 = e0l0Var2;
                        at0 at0Var6 = at0Var3;
                        FormLoadingStateRepository$State formLoadingStateRepository$State5 = formLoadingStateRepository$State3;
                        gs0 gs0Var5 = gs0Var2;
                        Set set9 = set6;
                        j6s j6sVar5 = j6sVar3;
                        AddressDetailsScreenMapper$map$1 addressDetailsScreenMapper$map$15 = addressDetailsScreenMapper$map$12;
                        e = e(j6sVar5, e0l0Var6, at0Var6, g8l0Var3, gs0Var5, formLoadingStateRepository$State5, set5, jg00Var3, z6, va31Var, set9, map5, addressDetailsScreenMapper$map$15);
                        cVar = this;
                        j6sVar4 = j6sVar5;
                        e0l0Var3 = e0l0Var6;
                        gs0Var3 = gs0Var5;
                        formLoadingStateRepository$State4 = formLoadingStateRepository$State5;
                        z4 = z6;
                        set7 = set9;
                        addressDetailsScreenMapper$map$14 = addressDetailsScreenMapper$map$15;
                        if (e != coroutineSingletons) {
                            obj3 = e;
                            addressDetailsState4 = addressDetailsState3;
                            at0Var4 = at0Var6;
                            g2q0Var2 = g2q0Var;
                            g2q0Var3 = g2q0Var7;
                            List list3 = (List) obj3;
                            j17Var = new j17(gs0Var3 == null ? gs0Var3.e : cVar.b.c, false, true);
                            if (at0Var4 != null) {
                            }
                            j17Var = null;
                            if (at0Var4 == null) {
                            }
                            addressDetailsScreenMapper$map$14.L$0 = null;
                            addressDetailsScreenMapper$map$14.L$1 = null;
                            addressDetailsScreenMapper$map$14.L$2 = null;
                            addressDetailsScreenMapper$map$14.L$3 = null;
                            addressDetailsScreenMapper$map$14.L$4 = null;
                            addressDetailsScreenMapper$map$14.L$5 = null;
                            addressDetailsScreenMapper$map$14.L$6 = null;
                            addressDetailsScreenMapper$map$14.L$7 = null;
                            addressDetailsScreenMapper$map$14.L$8 = null;
                            addressDetailsScreenMapper$map$14.L$9 = addressDetailsState4;
                            addressDetailsScreenMapper$map$14.L$10 = null;
                            addressDetailsScreenMapper$map$14.L$11 = null;
                            addressDetailsScreenMapper$map$14.L$12 = null;
                            addressDetailsScreenMapper$map$14.L$13 = null;
                            addressDetailsScreenMapper$map$14.L$14 = at0Var4;
                            addressDetailsScreenMapper$map$14.L$15 = null;
                            addressDetailsScreenMapper$map$14.L$16 = e0l0Var3;
                            addressDetailsScreenMapper$map$14.L$17 = g2q0Var2;
                            addressDetailsScreenMapper$map$14.L$18 = g2q0Var3;
                            addressDetailsScreenMapper$map$14.L$19 = list3;
                            addressDetailsScreenMapper$map$14.L$20 = j17Var;
                            addressDetailsScreenMapper$map$14.Z$0 = z4;
                            addressDetailsScreenMapper$map$14.label = 4;
                            AddressDetailsScreenMapper$map$1 addressDetailsScreenMapper$map$16 = addressDetailsScreenMapper$map$14;
                            f2 = f(r2, j6sVar4, formLoadingStateRepository$State4, set7, addressDetailsScreenMapper$map$16);
                            cVar2 = this;
                            addressDetailsScreenMapper$map$13 = addressDetailsScreenMapper$map$16;
                            if (f2 != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 3) {
                        boolean z7 = addressDetailsScreenMapper$map$14.Z$0;
                        g2q0Var3 = (g2q0) addressDetailsScreenMapper$map$14.L$18;
                        g2q0Var2 = (g2q0) addressDetailsScreenMapper$map$14.L$17;
                        e0l0Var3 = (e0l0) addressDetailsScreenMapper$map$14.L$16;
                        at0 at0Var7 = (at0) addressDetailsScreenMapper$map$14.L$14;
                        set7 = (Set) addressDetailsScreenMapper$map$14.L$11;
                        AddressDetailsState addressDetailsState6 = (AddressDetailsState) addressDetailsScreenMapper$map$14.L$9;
                        formLoadingStateRepository$State4 = (FormLoadingStateRepository$State) addressDetailsScreenMapper$map$14.L$5;
                        j6sVar4 = (j6s) addressDetailsScreenMapper$map$14.L$4;
                        gs0Var3 = (gs0) addressDetailsScreenMapper$map$14.L$3;
                        kotlin.b.b(obj3);
                        cVar = this;
                        addressDetailsState4 = addressDetailsState6;
                        at0Var4 = at0Var7;
                        z4 = z7;
                        List list32 = (List) obj3;
                        j17Var = new j17(gs0Var3 == null ? gs0Var3.e : cVar.b.c, false, true);
                        if (at0Var4 != null || !at0Var4.h) {
                            j17Var = null;
                        }
                        lqe lqeVar2 = at0Var4 == null ? at0Var4.d : null;
                        addressDetailsScreenMapper$map$14.L$0 = null;
                        addressDetailsScreenMapper$map$14.L$1 = null;
                        addressDetailsScreenMapper$map$14.L$2 = null;
                        addressDetailsScreenMapper$map$14.L$3 = null;
                        addressDetailsScreenMapper$map$14.L$4 = null;
                        addressDetailsScreenMapper$map$14.L$5 = null;
                        addressDetailsScreenMapper$map$14.L$6 = null;
                        addressDetailsScreenMapper$map$14.L$7 = null;
                        addressDetailsScreenMapper$map$14.L$8 = null;
                        addressDetailsScreenMapper$map$14.L$9 = addressDetailsState4;
                        addressDetailsScreenMapper$map$14.L$10 = null;
                        addressDetailsScreenMapper$map$14.L$11 = null;
                        addressDetailsScreenMapper$map$14.L$12 = null;
                        addressDetailsScreenMapper$map$14.L$13 = null;
                        addressDetailsScreenMapper$map$14.L$14 = at0Var4;
                        addressDetailsScreenMapper$map$14.L$15 = null;
                        addressDetailsScreenMapper$map$14.L$16 = e0l0Var3;
                        addressDetailsScreenMapper$map$14.L$17 = g2q0Var2;
                        addressDetailsScreenMapper$map$14.L$18 = g2q0Var3;
                        addressDetailsScreenMapper$map$14.L$19 = list32;
                        addressDetailsScreenMapper$map$14.L$20 = j17Var;
                        addressDetailsScreenMapper$map$14.Z$0 = z4;
                        addressDetailsScreenMapper$map$14.label = 4;
                        AddressDetailsScreenMapper$map$1 addressDetailsScreenMapper$map$162 = addressDetailsScreenMapper$map$14;
                        f2 = f(lqeVar2, j6sVar4, formLoadingStateRepository$State4, set7, addressDetailsScreenMapper$map$162);
                        cVar2 = this;
                        addressDetailsScreenMapper$map$13 = addressDetailsScreenMapper$map$162;
                        if (f2 != coroutineSingletons) {
                            boolean z8 = z4;
                            list2 = list32;
                            obj3 = f2;
                            z5 = z8;
                            g2q0Var4 = g2q0Var2;
                            e0l0Var4 = e0l0Var3;
                            j17Var2 = j17Var;
                            addressDetailsState5 = addressDetailsState4;
                            g2q0Var5 = (g2q0) obj3;
                            if (at0Var4 == null) {
                            }
                            if (at0Var4 == null) {
                            }
                            qv0Var = (qv0) kotlin.collections.a.S(0, e0l0Var4.a);
                            qv0Var2 = (qv0) kotlin.collections.a.S(1, e0l0Var4.a);
                            l = kotlin.collections.b.l(new Pair("sender_info_filled", Boolean.valueOf((qv0Var == null ? qv0Var.g : null) == null)), new Pair("recipient_info_filled", Boolean.valueOf((qv0Var2 == null ? qv0Var2.g : null) == null)));
                            if (qv0Var != null) {
                            }
                            if (qv0Var2 != null) {
                            }
                            if (at0Var4 == null) {
                            }
                            f3 = cVar2.d.g.f(at0Var4 == null ? at0Var4.j : null);
                            if (at0Var4 != null) {
                            }
                            vs0Var = null;
                            return new ot0(g2q0Var4, g2q0Var3, g2q0Var5, list2, j17Var2, vu0Var, addressDetailsState5, str, l, y7mVar, f3, vs0Var);
                        }
                        return coroutineSingletons;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ldcVar = (ldc) addressDetailsScreenMapper$map$14.L$26;
                        y7mVar2 = (y7m) addressDetailsScreenMapper$map$14.L$25;
                        ?? r3 = (Map) addressDetailsScreenMapper$map$14.L$24;
                        str = (String) addressDetailsScreenMapper$map$14.L$23;
                        vu0Var2 = (vu0) addressDetailsScreenMapper$map$14.L$22;
                        g2q0Var5 = (g2q0) addressDetailsScreenMapper$map$14.L$21;
                        j17Var2 = (j17) addressDetailsScreenMapper$map$14.L$20;
                        list2 = (List) addressDetailsScreenMapper$map$14.L$19;
                        g2q0Var6 = (g2q0) addressDetailsScreenMapper$map$14.L$18;
                        g2q0Var4 = (g2q0) addressDetailsScreenMapper$map$14.L$17;
                        addressDetailsState5 = (AddressDetailsState) addressDetailsScreenMapper$map$14.L$9;
                        kotlin.b.b(obj3);
                        linkedHashMap = r3;
                        vs0Var = (vs0) obj3;
                        vu0 vu0Var3 = vu0Var2;
                        f3 = ldcVar;
                        vu0Var = vu0Var3;
                        l = linkedHashMap;
                        g2q0Var3 = g2q0Var6;
                        y7mVar = y7mVar2;
                        return new ot0(g2q0Var4, g2q0Var3, g2q0Var5, list2, j17Var2, vu0Var, addressDetailsState5, str, l, y7mVar, f3, vs0Var);
                    }
                    z5 = addressDetailsScreenMapper$map$14.Z$0;
                    j17 j17Var3 = (j17) addressDetailsScreenMapper$map$14.L$20;
                    List list4 = (List) addressDetailsScreenMapper$map$14.L$19;
                    g2q0 g2q0Var8 = (g2q0) addressDetailsScreenMapper$map$14.L$18;
                    g2q0 g2q0Var9 = (g2q0) addressDetailsScreenMapper$map$14.L$17;
                    e0l0Var4 = (e0l0) addressDetailsScreenMapper$map$14.L$16;
                    at0Var4 = (at0) addressDetailsScreenMapper$map$14.L$14;
                    AddressDetailsState addressDetailsState7 = (AddressDetailsState) addressDetailsScreenMapper$map$14.L$9;
                    kotlin.b.b(obj3);
                    j17Var2 = j17Var3;
                    g2q0Var3 = g2q0Var8;
                    g2q0Var4 = g2q0Var9;
                    addressDetailsState5 = addressDetailsState7;
                    list2 = list4;
                    addressDetailsScreenMapper$map$13 = addressDetailsScreenMapper$map$14;
                    cVar2 = this;
                    g2q0Var5 = (g2q0) obj3;
                    vu0Var = at0Var4 == null ? at0Var4.f : null;
                    str = at0Var4 == null ? at0Var4.e : null;
                    qv0Var = (qv0) kotlin.collections.a.S(0, e0l0Var4.a);
                    qv0Var2 = (qv0) kotlin.collections.a.S(1, e0l0Var4.a);
                    l = kotlin.collections.b.l(new Pair("sender_info_filled", Boolean.valueOf((qv0Var == null ? qv0Var.g : null) == null)), new Pair("recipient_info_filled", Boolean.valueOf((qv0Var2 == null ? qv0Var2.g : null) == null)));
                    if (qv0Var != null) {
                        l.put("sender_address", ita1.e(qv0Var));
                    }
                    if (qv0Var2 != null) {
                        l.put("recipient_address", ita1.e(qv0Var2));
                    }
                    y7mVar = at0Var4 == null ? new y7m(at0Var4.i) : null;
                    f3 = cVar2.d.g.f(at0Var4 == null ? at0Var4.j : null);
                    if (at0Var4 != null || (us0Var = at0Var4.k) == null) {
                        vs0Var = null;
                        return new ot0(g2q0Var4, g2q0Var3, g2q0Var5, list2, j17Var2, vu0Var, addressDetailsState5, str, l, y7mVar, f3, vs0Var);
                    }
                    addressDetailsScreenMapper$map$13.L$0 = null;
                    addressDetailsScreenMapper$map$13.L$1 = null;
                    addressDetailsScreenMapper$map$13.L$2 = null;
                    addressDetailsScreenMapper$map$13.L$3 = null;
                    addressDetailsScreenMapper$map$13.L$4 = null;
                    addressDetailsScreenMapper$map$13.L$5 = null;
                    addressDetailsScreenMapper$map$13.L$6 = null;
                    addressDetailsScreenMapper$map$13.L$7 = null;
                    addressDetailsScreenMapper$map$13.L$8 = null;
                    addressDetailsScreenMapper$map$13.L$9 = addressDetailsState5;
                    addressDetailsScreenMapper$map$13.L$10 = null;
                    addressDetailsScreenMapper$map$13.L$11 = null;
                    addressDetailsScreenMapper$map$13.L$12 = null;
                    addressDetailsScreenMapper$map$13.L$13 = null;
                    addressDetailsScreenMapper$map$13.L$14 = null;
                    addressDetailsScreenMapper$map$13.L$15 = null;
                    addressDetailsScreenMapper$map$13.L$16 = null;
                    addressDetailsScreenMapper$map$13.L$17 = g2q0Var4;
                    addressDetailsScreenMapper$map$13.L$18 = g2q0Var3;
                    addressDetailsScreenMapper$map$13.L$19 = list2;
                    addressDetailsScreenMapper$map$13.L$20 = j17Var2;
                    addressDetailsScreenMapper$map$13.L$21 = g2q0Var5;
                    addressDetailsScreenMapper$map$13.L$22 = vu0Var;
                    addressDetailsScreenMapper$map$13.L$23 = str;
                    addressDetailsScreenMapper$map$13.L$24 = l;
                    addressDetailsScreenMapper$map$13.L$25 = y7mVar;
                    addressDetailsScreenMapper$map$13.L$26 = f3;
                    addressDetailsScreenMapper$map$13.L$27 = null;
                    addressDetailsScreenMapper$map$13.Z$0 = z5;
                    addressDetailsScreenMapper$map$13.I$0 = 0;
                    addressDetailsScreenMapper$map$13.label = 5;
                    Object c = cVar2.c(us0Var, addressDetailsScreenMapper$map$13);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vu0Var2 = vu0Var;
                    ldcVar = f3;
                    g2q0 g2q0Var10 = g2q0Var3;
                    linkedHashMap = l;
                    obj3 = c;
                    y7mVar2 = y7mVar;
                    g2q0Var6 = g2q0Var10;
                    vs0Var = (vs0) obj3;
                    vu0 vu0Var32 = vu0Var2;
                    f3 = ldcVar;
                    vu0Var = vu0Var32;
                    l = linkedHashMap;
                    g2q0Var3 = g2q0Var6;
                    y7mVar = y7mVar2;
                    return new ot0(g2q0Var4, g2q0Var3, g2q0Var5, list2, j17Var2, vu0Var, addressDetailsState5, str, l, y7mVar, f3, vs0Var);
                }
                obj = obj3;
                z2 = addressDetailsScreenMapper$map$14.Z$0;
                e0l0 e0l0Var7 = (e0l0) addressDetailsScreenMapper$map$14.L$16;
                g8l0Var2 = (g8l0) addressDetailsScreenMapper$map$14.L$15;
                at0 at0Var8 = (at0) addressDetailsScreenMapper$map$14.L$14;
                map2 = (Map) addressDetailsScreenMapper$map$14.L$12;
                set4 = (Set) addressDetailsScreenMapper$map$14.L$11;
                jg00Var2 = (jg00) addressDetailsScreenMapper$map$14.L$10;
                AddressDetailsState addressDetailsState8 = (AddressDetailsState) addressDetailsScreenMapper$map$14.L$9;
                Set set10 = (Set) addressDetailsScreenMapper$map$14.L$6;
                formLoadingStateRepository$State2 = (FormLoadingStateRepository$State) addressDetailsScreenMapper$map$14.L$5;
                j6sVar2 = (j6s) addressDetailsScreenMapper$map$14.L$4;
                gs0 gs0Var6 = (gs0) addressDetailsScreenMapper$map$14.L$3;
                kotlin.b.b(obj);
                addressDetailsState2 = addressDetailsState8;
                set3 = set10;
                at0Var2 = at0Var8;
                gs0Var2 = gs0Var6;
                e0l0Var2 = e0l0Var7;
                g2q0 g2q0Var11 = (g2q0) obj;
                lqe lqeVar3 = at0Var2 == null ? at0Var2.b : null;
                addressDetailsScreenMapper$map$14.L$0 = null;
                addressDetailsScreenMapper$map$14.L$1 = null;
                addressDetailsScreenMapper$map$14.L$2 = null;
                addressDetailsScreenMapper$map$14.L$3 = gs0Var2;
                addressDetailsScreenMapper$map$14.L$4 = j6sVar2;
                addressDetailsScreenMapper$map$14.L$5 = formLoadingStateRepository$State2;
                addressDetailsScreenMapper$map$14.L$6 = set3;
                addressDetailsScreenMapper$map$14.L$7 = null;
                addressDetailsScreenMapper$map$14.L$8 = null;
                addressDetailsScreenMapper$map$14.L$9 = addressDetailsState2;
                addressDetailsScreenMapper$map$14.L$10 = jg00Var2;
                addressDetailsScreenMapper$map$14.L$11 = set4;
                addressDetailsScreenMapper$map$14.L$12 = map2;
                addressDetailsScreenMapper$map$14.L$13 = null;
                addressDetailsScreenMapper$map$14.L$14 = at0Var2;
                addressDetailsScreenMapper$map$14.L$15 = g8l0Var2;
                addressDetailsScreenMapper$map$14.L$16 = e0l0Var2;
                addressDetailsScreenMapper$map$14.L$17 = g2q0Var11;
                addressDetailsScreenMapper$map$14.Z$0 = z2;
                addressDetailsScreenMapper$map$14.label = 2;
                f = f(lqeVar3, j6sVar2, formLoadingStateRepository$State2, set4, addressDetailsScreenMapper$map$14);
                addressDetailsScreenMapper$map$12 = addressDetailsScreenMapper$map$14;
                if (f != coroutineSingletons) {
                    Set set11 = set4;
                    at0Var3 = at0Var2;
                    map3 = map2;
                    g8l0Var3 = g8l0Var2;
                    g2q0Var = g2q0Var11;
                    z3 = z2;
                    obj2 = f;
                    set5 = set3;
                    set6 = set11;
                    AddressDetailsState addressDetailsState9 = addressDetailsState2;
                    jg00Var3 = jg00Var2;
                    formLoadingStateRepository$State3 = formLoadingStateRepository$State2;
                    j6sVar3 = j6sVar2;
                    addressDetailsState3 = addressDetailsState9;
                    g2q0 g2q0Var72 = (g2q0) obj2;
                    Map map52 = map3;
                    if (at0Var3 == null) {
                    }
                    addressDetailsScreenMapper$map$12.L$0 = null;
                    addressDetailsScreenMapper$map$12.L$1 = null;
                    addressDetailsScreenMapper$map$12.L$2 = null;
                    addressDetailsScreenMapper$map$12.L$3 = gs0Var2;
                    addressDetailsScreenMapper$map$12.L$4 = j6sVar3;
                    addressDetailsScreenMapper$map$12.L$5 = formLoadingStateRepository$State3;
                    addressDetailsScreenMapper$map$12.L$6 = null;
                    addressDetailsScreenMapper$map$12.L$7 = null;
                    addressDetailsScreenMapper$map$12.L$8 = null;
                    addressDetailsScreenMapper$map$12.L$9 = addressDetailsState3;
                    addressDetailsScreenMapper$map$12.L$10 = null;
                    addressDetailsScreenMapper$map$12.L$11 = set6;
                    addressDetailsScreenMapper$map$12.L$12 = null;
                    addressDetailsScreenMapper$map$12.L$13 = null;
                    addressDetailsScreenMapper$map$12.L$14 = at0Var3;
                    addressDetailsScreenMapper$map$12.L$15 = null;
                    addressDetailsScreenMapper$map$12.L$16 = e0l0Var2;
                    addressDetailsScreenMapper$map$12.L$17 = g2q0Var;
                    addressDetailsScreenMapper$map$12.L$18 = g2q0Var72;
                    addressDetailsScreenMapper$map$12.Z$0 = z3;
                    addressDetailsScreenMapper$map$12.label = 3;
                    boolean z62 = z3;
                    e0l0 e0l0Var62 = e0l0Var2;
                    at0 at0Var62 = at0Var3;
                    FormLoadingStateRepository$State formLoadingStateRepository$State52 = formLoadingStateRepository$State3;
                    gs0 gs0Var52 = gs0Var2;
                    Set set92 = set6;
                    j6s j6sVar52 = j6sVar3;
                    AddressDetailsScreenMapper$map$1 addressDetailsScreenMapper$map$152 = addressDetailsScreenMapper$map$12;
                    e = e(j6sVar52, e0l0Var62, at0Var62, g8l0Var3, gs0Var52, formLoadingStateRepository$State52, set5, jg00Var3, z62, va31Var, set92, map52, addressDetailsScreenMapper$map$152);
                    cVar = this;
                    j6sVar4 = j6sVar52;
                    e0l0Var3 = e0l0Var62;
                    gs0Var3 = gs0Var52;
                    formLoadingStateRepository$State4 = formLoadingStateRepository$State52;
                    z4 = z62;
                    set7 = set92;
                    addressDetailsScreenMapper$map$14 = addressDetailsScreenMapper$map$152;
                    if (e != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        addressDetailsScreenMapper$map$1 = new AddressDetailsScreenMapper$map$1(this, continuationImpl);
        AddressDetailsScreenMapper$map$1 addressDetailsScreenMapper$map$142 = addressDetailsScreenMapper$map$1;
        Object obj32 = addressDetailsScreenMapper$map$142.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressDetailsScreenMapper$map$142.label;
        if (i != 0) {
        }
        g2q0 g2q0Var112 = (g2q0) obj;
        if (at0Var2 == null) {
        }
        addressDetailsScreenMapper$map$142.L$0 = null;
        addressDetailsScreenMapper$map$142.L$1 = null;
        addressDetailsScreenMapper$map$142.L$2 = null;
        addressDetailsScreenMapper$map$142.L$3 = gs0Var2;
        addressDetailsScreenMapper$map$142.L$4 = j6sVar2;
        addressDetailsScreenMapper$map$142.L$5 = formLoadingStateRepository$State2;
        addressDetailsScreenMapper$map$142.L$6 = set3;
        addressDetailsScreenMapper$map$142.L$7 = null;
        addressDetailsScreenMapper$map$142.L$8 = null;
        addressDetailsScreenMapper$map$142.L$9 = addressDetailsState2;
        addressDetailsScreenMapper$map$142.L$10 = jg00Var2;
        addressDetailsScreenMapper$map$142.L$11 = set4;
        addressDetailsScreenMapper$map$142.L$12 = map2;
        addressDetailsScreenMapper$map$142.L$13 = null;
        addressDetailsScreenMapper$map$142.L$14 = at0Var2;
        addressDetailsScreenMapper$map$142.L$15 = g8l0Var2;
        addressDetailsScreenMapper$map$142.L$16 = e0l0Var2;
        addressDetailsScreenMapper$map$142.L$17 = g2q0Var112;
        addressDetailsScreenMapper$map$142.Z$0 = z2;
        addressDetailsScreenMapper$map$142.label = 2;
        f = f(lqeVar3, j6sVar2, formLoadingStateRepository$State2, set4, addressDetailsScreenMapper$map$142);
        addressDetailsScreenMapper$map$12 = addressDetailsScreenMapper$map$142;
        if (f != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(us0 us0Var, ContinuationImpl continuationImpl) {
        AddressDetailsScreenMapper$mapHeader$1 addressDetailsScreenMapper$mapHeader$1;
        int i;
        FormattedText formattedText;
        CharSequence charSequence;
        CharSequence charSequence2;
        us0 us0Var2;
        CharSequence charSequence3;
        if (continuationImpl instanceof AddressDetailsScreenMapper$mapHeader$1) {
            addressDetailsScreenMapper$mapHeader$1 = (AddressDetailsScreenMapper$mapHeader$1) continuationImpl;
            int i2 = addressDetailsScreenMapper$mapHeader$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressDetailsScreenMapper$mapHeader$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressDetailsScreenMapper$mapHeader$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressDetailsScreenMapper$mapHeader$1.label;
                q8s q8sVar = this.j;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText2 = us0Var.a;
                    addressDetailsScreenMapper$mapHeader$1.L$0 = us0Var;
                    addressDetailsScreenMapper$mapHeader$1.label = 1;
                    obj = q8sVar.a(formattedText2, addressDetailsScreenMapper$mapHeader$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence3 = (CharSequence) addressDetailsScreenMapper$mapHeader$1.L$2;
                        us0Var2 = (us0) addressDetailsScreenMapper$mapHeader$1.L$0;
                        kotlin.b.b(obj);
                        charSequence2 = (CharSequence) obj;
                        us0 us0Var3 = us0Var2;
                        charSequence = charSequence3;
                        us0Var = us0Var3;
                        String str = us0Var.c;
                        return new vs0(charSequence, charSequence2, str != null ? this.d.g.f(str) : null);
                    }
                    us0Var = (us0) addressDetailsScreenMapper$mapHeader$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence4 = (CharSequence) obj;
                formattedText = us0Var.b;
                if (formattedText != null) {
                    charSequence = charSequence4;
                    charSequence2 = null;
                    String str2 = us0Var.c;
                    return new vs0(charSequence, charSequence2, str2 != null ? this.d.g.f(str2) : null);
                }
                addressDetailsScreenMapper$mapHeader$1.L$0 = us0Var;
                addressDetailsScreenMapper$mapHeader$1.L$1 = null;
                addressDetailsScreenMapper$mapHeader$1.L$2 = charSequence4;
                addressDetailsScreenMapper$mapHeader$1.I$0 = 0;
                addressDetailsScreenMapper$mapHeader$1.label = 2;
                Object a = q8sVar.a(formattedText, addressDetailsScreenMapper$mapHeader$1);
                if (a != coroutineSingletons) {
                    us0Var2 = us0Var;
                    charSequence3 = charSequence4;
                    obj = a;
                    charSequence2 = (CharSequence) obj;
                    us0 us0Var32 = us0Var2;
                    charSequence = charSequence3;
                    us0Var = us0Var32;
                    String str22 = us0Var.c;
                    return new vs0(charSequence, charSequence2, str22 != null ? this.d.g.f(str22) : null);
                }
                return coroutineSingletons;
            }
        }
        addressDetailsScreenMapper$mapHeader$1 = new AddressDetailsScreenMapper$mapHeader$1(this, continuationImpl);
        Object obj2 = addressDetailsScreenMapper$mapHeader$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressDetailsScreenMapper$mapHeader$1.label;
        q8s q8sVar2 = this.j;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj2;
        formattedText = us0Var.b;
        if (formattedText != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ce, code lost:
    
        if (r14 != null) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023f  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r46v0, types: [java.lang.Object, ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(j7l0 j7l0Var, j6s j6sVar, FormLoadingStateRepository$State formLoadingStateRepository$State, gs0 gs0Var, qv0 qv0Var, int i, int i2, boolean z, boolean z2, Set set, jg00 jg00Var, String str, Map map, boolean z3, wa31 wa31Var, Set set2, List list, ContinuationImpl continuationImpl) {
        AddressDetailsScreenMapper$mapRoutePoint$1 addressDetailsScreenMapper$mapRoutePoint$1;
        int i3;
        int i4;
        AddressDetailsScreenMapper$mapRoutePoint$1 addressDetailsScreenMapper$mapRoutePoint$12;
        String str2;
        afz0 afz0Var;
        ra90 lvi0Var;
        oo0 oo0Var;
        String str3;
        kud0 kud0Var;
        String str4;
        lts0 lts0Var;
        hts0 s;
        String str5;
        s9e s9eVar;
        String str6;
        jt0 jt0Var;
        hts0 hts0Var;
        d41 d41Var;
        oo0 oo0Var2;
        jts0 jts0Var;
        kud0 kud0Var2;
        Iterator it;
        Object obj;
        ig00 ig00Var;
        cj00 dj00Var;
        cj00 aj00Var;
        fj00 fj00Var;
        kud0 kud0Var3;
        String str7;
        txq txqVar;
        txq txqVar2;
        txq txqVar3;
        txq txqVar4;
        txq txqVar5;
        String str8;
        nae naeVar;
        txq txqVar6;
        nae naeVar2;
        rgb0 rgb0Var;
        wa31 wa31Var2;
        txq txqVar7;
        boolean z4;
        int i5;
        nae naeVar3;
        d41 d41Var2;
        txq txqVar8;
        fj00 fj00Var2;
        txq txqVar9;
        g2q0 g2q0Var;
        lqe lqeVar;
        Object obj2;
        nae naeVar4;
        txq txqVar10;
        d41 d41Var3;
        final qkb0 qkb0Var;
        boolean z5;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        s9e s9eVar2;
        oo0 oo0Var3;
        oo0 oo0Var4;
        j7l0 j7l0Var2 = j7l0Var;
        final int i6 = i;
        if (continuationImpl instanceof AddressDetailsScreenMapper$mapRoutePoint$1) {
            addressDetailsScreenMapper$mapRoutePoint$1 = (AddressDetailsScreenMapper$mapRoutePoint$1) continuationImpl;
            int i7 = addressDetailsScreenMapper$mapRoutePoint$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                addressDetailsScreenMapper$mapRoutePoint$1.label = i7 - Integer.MIN_VALUE;
                Object obj3 = addressDetailsScreenMapper$mapRoutePoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = addressDetailsScreenMapper$mapRoutePoint$1.label;
                if (i3 != 0) {
                    kotlin.b.b(obj3);
                    int i8 = i6 == 0 ? 1 : 0;
                    ct0 ct0Var = this.b;
                    String str14 = i8 != 0 ? ct0Var.a : ct0Var.b;
                    sbv sbvVar = j7l0Var2 != null ? j7l0Var2.a : null;
                    String str15 = str14;
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.d;
                    rj51 rj51Var = rj51.b;
                    if (sbvVar == null) {
                        int i9 = i6 == 0 ? ct0Var.j : ct0Var.k;
                        String str16 = (qv0Var == null || (oo0Var4 = qv0Var.a) == null) ? null : oo0Var4.a;
                        i4 = i8;
                        lvi0Var = new cuj0(i9, null, null, (str16 == null || str16.length() == 0) ? new afz0(rj51Var) : null, 22);
                        addressDetailsScreenMapper$mapRoutePoint$12 = addressDetailsScreenMapper$mapRoutePoint$1;
                    } else {
                        i4 = i8;
                        String str17 = sbvVar.a;
                        addressDetailsScreenMapper$mapRoutePoint$12 = addressDetailsScreenMapper$mapRoutePoint$1;
                        if (str17 == null || (str2 = this.c.a(str17)) == null) {
                            str2 = sbvVar.b;
                        }
                        String str18 = str2;
                        String str19 = (qv0Var == null || (oo0Var = qv0Var.a) == null) ? null : oo0Var.a;
                        if (str19 == null || str19.length() == 0) {
                            afz0Var = new afz0(rj51Var);
                        } else {
                            ldc f = aVar.g.f(sbvVar.c);
                            afz0Var = f != null ? new zez0(f.a) : null;
                        }
                        lvi0Var = new lvi0(str18, null, null, null, afz0Var, 46);
                    }
                    if (qv0Var == null || (oo0Var3 = qv0Var.a) == null || (str3 = oo0Var3.a) == null) {
                        str3 = "";
                    }
                    boolean z6 = (qv0Var != null ? qv0Var.a : null) != null;
                    if (i4 != 0) {
                        if (gs0Var != null) {
                            kud0Var = gs0Var.a;
                            str4 = str3;
                        }
                        str4 = str3;
                        kud0Var = null;
                    } else {
                        if (gs0Var != null) {
                            kud0Var = gs0Var.b;
                            str4 = str3;
                        }
                        str4 = str3;
                        kud0Var = null;
                    }
                    jt0 jt0Var2 = new jt0(this, j7l0Var2, z6, z2);
                    boolean z7 = z6;
                    if (!z6) {
                        if (j7l0Var2 != null) {
                            lts0Var = j7l0Var2.c;
                            s = lts0Var == null ? aVar.s(lts0Var) : null;
                            if (qv0Var != null) {
                            }
                            if (qv0Var == null) {
                            }
                            str5 = null;
                            if (str4.length() == 0) {
                            }
                            if (str4.length() != 0) {
                            }
                            ow91 ow91Var = str4.length() != 0 ? uj51.b : tj51.b;
                            if (s != null) {
                            }
                            d41Var = new d41(r29, r30, ow91Var, hts0Var, z, false, null, j7l0Var2 == null && j7l0Var2.j, 96);
                            if (j7l0Var2 == null) {
                            }
                            if (j7l0Var2 == null) {
                            }
                            a0t a0tVar = oo0Var2.f;
                            kud0Var2 = kud0Var;
                            doe doeVar = new doe(a0tVar.a, a0tVar.b);
                            int i10 = jg00Var.c;
                            it = jg00Var.b.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                            ig00Var = (ig00) obj;
                            if (ig00Var != null) {
                            }
                            String str20 = "";
                            yi00 yi00Var = new yi00(z3, this.g.a(doeVar, new t6u0(i10, new is00(z3, str20))));
                            if (jts0Var == null) {
                            }
                            fj00Var = new fj00(yi00Var, dj00Var);
                            if (kud0Var2 == null) {
                            }
                            String str21 = str7;
                            if (qv0Var != null) {
                            }
                            gyq gyqVar = gyq.a;
                            String a = a(j7l0Var2, gyqVar, set, i6);
                            tls tlsVar = jt0Var;
                            FieldVisibility fieldVisibility = (FieldVisibility) tlsVar.invoke(gyqVar);
                            FieldImeAction fieldImeAction = FieldImeAction.DONE;
                            txqVar = new txq(gyqVar, str21, r31, null, a, fieldVisibility, false, fieldImeAction, null, 328);
                            String str22 = kud0Var3 == null ? kud0Var3.b : ct0Var.f;
                            if (qv0Var != null) {
                            }
                            cyq cyqVar = cyq.a;
                            txqVar2 = new txq(cyqVar, str22, r38, null, a(j7l0Var2, cyqVar, set, i6), (FieldVisibility) tlsVar.invoke(cyqVar), false, fieldImeAction, null, 328);
                            String str23 = kud0Var3 == null ? kud0Var3.d : ct0Var.i;
                            if (qv0Var != null) {
                            }
                            eyq eyqVar = eyq.a;
                            txqVar3 = new txq(eyqVar, str23, r38, null, a(j7l0Var2, eyqVar, set, i6), (FieldVisibility) tlsVar.invoke(eyqVar), false, fieldImeAction, null, 328);
                            String str24 = kud0Var3 == null ? kud0Var3.c : ct0Var.e;
                            if (qv0Var != null) {
                            }
                            fyq fyqVar = fyq.a;
                            txq txqVar11 = new txq(fyqVar, str24, r38, null, a(j7l0Var2, fyqVar, set, i6), (FieldVisibility) tlsVar.invoke(fyqVar), false, fieldImeAction, null, 328);
                            if (kud0Var3 == null) {
                            }
                            String str25 = str8;
                            if (qv0Var != null) {
                            }
                            m8e m8eVar = new m8e(Integer.MAX_VALUE);
                            dyq dyqVar = dyq.a;
                            txqVar4 = new txq(dyqVar, str25, r38, m8eVar, a(j7l0Var2, dyqVar, set, i6), (FieldVisibility) tlsVar.invoke(dyqVar), false, fieldImeAction, null, 320);
                            String str26 = kud0Var3 == null ? kud0Var3.f : ct0Var.h;
                            FieldVisibility fieldVisibility2 = (FieldVisibility) tlsVar.invoke(byq.a);
                            if (kud0Var3 == null) {
                            }
                            if (r0 == null) {
                            }
                            naeVar = new nae(str26, str5, fieldVisibility2, null, ((str5 != null || evu0.J(str5)) && r0 != null) ? new ybe(r0) : ace.a, true);
                            if (gs0Var != null) {
                            }
                            txqVar6 = txqVar5;
                            naeVar2 = naeVar;
                            rgb0Var = null;
                            if (j7l0Var2 != null) {
                            }
                            wa31Var2 = wa31Var;
                            txqVar7 = txqVar4;
                            z4 = false;
                            i5 = i6;
                            naeVar3 = naeVar2;
                            d41Var2 = d41Var;
                            txqVar8 = txqVar6;
                            fj00Var2 = fj00Var;
                            txqVar9 = txqVar3;
                            g2q0Var = null;
                            if (j7l0Var2 == null) {
                            }
                            if (j7l0Var2 != null) {
                            }
                            return new x7l0(i5, null, d41Var2, fj00Var2, txqVar, txqVar9, txqVar2, txqVar7, txqVar8, naeVar3, rgb0Var, false, g2q0Var, r16, z4, wa31Var2, null, 67586);
                        }
                        lts0Var = null;
                        s = lts0Var == null ? aVar.s(lts0Var) : null;
                        if (qv0Var != null) {
                        }
                        if (qv0Var == null) {
                        }
                        str5 = null;
                        if (str4.length() == 0) {
                        }
                        if (str4.length() != 0) {
                        }
                        ow91 ow91Var2 = str4.length() != 0 ? uj51.b : tj51.b;
                        if (s != null) {
                        }
                        d41Var = new d41(r29, r30, ow91Var2, hts0Var, z, false, null, j7l0Var2 == null && j7l0Var2.j, 96);
                        if (j7l0Var2 == null) {
                        }
                        if (j7l0Var2 == null) {
                        }
                        a0t a0tVar2 = oo0Var2.f;
                        kud0Var2 = kud0Var;
                        doe doeVar2 = new doe(a0tVar2.a, a0tVar2.b);
                        int i102 = jg00Var.c;
                        it = jg00Var.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        ig00Var = (ig00) obj;
                        if (ig00Var != null) {
                        }
                        String str202 = "";
                        yi00 yi00Var2 = new yi00(z3, this.g.a(doeVar2, new t6u0(i102, new is00(z3, str202))));
                        if (jts0Var == null) {
                        }
                        fj00Var = new fj00(yi00Var2, dj00Var);
                        if (kud0Var2 == null) {
                        }
                        String str212 = str7;
                        if (qv0Var != null) {
                        }
                        gyq gyqVar2 = gyq.a;
                        String a2 = a(j7l0Var2, gyqVar2, set, i6);
                        tls tlsVar2 = jt0Var;
                        FieldVisibility fieldVisibility3 = (FieldVisibility) tlsVar2.invoke(gyqVar2);
                        FieldImeAction fieldImeAction2 = FieldImeAction.DONE;
                        txqVar = new txq(gyqVar2, str212, r31, null, a2, fieldVisibility3, false, fieldImeAction2, null, 328);
                        String str222 = kud0Var3 == null ? kud0Var3.b : ct0Var.f;
                        if (qv0Var != null) {
                        }
                        cyq cyqVar2 = cyq.a;
                        txqVar2 = new txq(cyqVar2, str222, r38, null, a(j7l0Var2, cyqVar2, set, i6), (FieldVisibility) tlsVar2.invoke(cyqVar2), false, fieldImeAction2, null, 328);
                        String str232 = kud0Var3 == null ? kud0Var3.d : ct0Var.i;
                        if (qv0Var != null) {
                        }
                        eyq eyqVar2 = eyq.a;
                        txqVar3 = new txq(eyqVar2, str232, r38, null, a(j7l0Var2, eyqVar2, set, i6), (FieldVisibility) tlsVar2.invoke(eyqVar2), false, fieldImeAction2, null, 328);
                        String str242 = kud0Var3 == null ? kud0Var3.c : ct0Var.e;
                        if (qv0Var != null) {
                        }
                        fyq fyqVar2 = fyq.a;
                        txq txqVar112 = new txq(fyqVar2, str242, r38, null, a(j7l0Var2, fyqVar2, set, i6), (FieldVisibility) tlsVar2.invoke(fyqVar2), false, fieldImeAction2, null, 328);
                        if (kud0Var3 == null) {
                        }
                        String str252 = str8;
                        if (qv0Var != null) {
                        }
                        m8e m8eVar2 = new m8e(Integer.MAX_VALUE);
                        dyq dyqVar2 = dyq.a;
                        txqVar4 = new txq(dyqVar2, str252, r38, m8eVar2, a(j7l0Var2, dyqVar2, set, i6), (FieldVisibility) tlsVar2.invoke(dyqVar2), false, fieldImeAction2, null, 320);
                        String str262 = kud0Var3 == null ? kud0Var3.f : ct0Var.h;
                        FieldVisibility fieldVisibility22 = (FieldVisibility) tlsVar2.invoke(byq.a);
                        if (kud0Var3 == null) {
                        }
                        if (r0 == null) {
                        }
                        naeVar = new nae(str262, str5, fieldVisibility22, null, ((str5 != null || evu0.J(str5)) && r0 != null) ? new ybe(r0) : ace.a, true);
                        if (gs0Var != null) {
                        }
                        txqVar6 = txqVar5;
                        naeVar2 = naeVar;
                        rgb0Var = null;
                        if (j7l0Var2 != null) {
                        }
                        wa31Var2 = wa31Var;
                        txqVar7 = txqVar4;
                        z4 = false;
                        i5 = i6;
                        naeVar3 = naeVar2;
                        d41Var2 = d41Var;
                        txqVar8 = txqVar6;
                        fj00Var2 = fj00Var;
                        txqVar9 = txqVar3;
                        g2q0Var = null;
                        if (j7l0Var2 == null) {
                        }
                        if (j7l0Var2 != null) {
                        }
                        return new x7l0(i5, null, d41Var2, fj00Var2, txqVar, txqVar9, txqVar2, txqVar7, txqVar8, naeVar3, rgb0Var, false, g2q0Var, r16, z4, wa31Var2, null, 67586);
                    }
                    if (j7l0Var2 != null) {
                        lts0Var = j7l0Var2.b;
                        s = lts0Var == null ? aVar.s(lts0Var) : null;
                        if (qv0Var != null && (s9eVar2 = qv0Var.g) != null && (str6 = s9eVar2.a) != null) {
                            if (str6.length() == 0) {
                                str6 = null;
                            }
                        }
                        if (qv0Var == null && (s9eVar = qv0Var.g) != null) {
                            str6 = s9eVar.b;
                            str5 = str6;
                            if (str4.length() == 0) {
                                if (str4.length() != 0) {
                                }
                                ow91 ow91Var22 = str4.length() != 0 ? uj51.b : tj51.b;
                                if (s != null) {
                                }
                                d41Var = new d41(r29, r30, ow91Var22, hts0Var, z, false, null, j7l0Var2 == null && j7l0Var2.j, 96);
                                if (j7l0Var2 == null) {
                                }
                                if (j7l0Var2 == null) {
                                }
                                a0t a0tVar22 = oo0Var2.f;
                                kud0Var2 = kud0Var;
                                doe doeVar22 = new doe(a0tVar22.a, a0tVar22.b);
                                int i1022 = jg00Var.c;
                                it = jg00Var.b.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                ig00Var = (ig00) obj;
                                if (ig00Var != null) {
                                }
                                String str2022 = "";
                                yi00 yi00Var22 = new yi00(z3, this.g.a(doeVar22, new t6u0(i1022, new is00(z3, str2022))));
                                if (jts0Var == null) {
                                }
                                fj00Var = new fj00(yi00Var22, dj00Var);
                                if (kud0Var2 == null) {
                                }
                                String str2122 = str7;
                                if (qv0Var != null) {
                                }
                                gyq gyqVar22 = gyq.a;
                                String a22 = a(j7l0Var2, gyqVar22, set, i6);
                                tls tlsVar22 = jt0Var;
                                FieldVisibility fieldVisibility32 = (FieldVisibility) tlsVar22.invoke(gyqVar22);
                                FieldImeAction fieldImeAction22 = FieldImeAction.DONE;
                                txqVar = new txq(gyqVar22, str2122, r31, null, a22, fieldVisibility32, false, fieldImeAction22, null, 328);
                                String str2222 = kud0Var3 == null ? kud0Var3.b : ct0Var.f;
                                if (qv0Var != null) {
                                }
                                cyq cyqVar22 = cyq.a;
                                txqVar2 = new txq(cyqVar22, str2222, r38, null, a(j7l0Var2, cyqVar22, set, i6), (FieldVisibility) tlsVar22.invoke(cyqVar22), false, fieldImeAction22, null, 328);
                                String str2322 = kud0Var3 == null ? kud0Var3.d : ct0Var.i;
                                if (qv0Var != null) {
                                }
                                eyq eyqVar22 = eyq.a;
                                txqVar3 = new txq(eyqVar22, str2322, r38, null, a(j7l0Var2, eyqVar22, set, i6), (FieldVisibility) tlsVar22.invoke(eyqVar22), false, fieldImeAction22, null, 328);
                                String str2422 = kud0Var3 == null ? kud0Var3.c : ct0Var.e;
                                if (qv0Var != null) {
                                }
                                fyq fyqVar22 = fyq.a;
                                txq txqVar1122 = new txq(fyqVar22, str2422, r38, null, a(j7l0Var2, fyqVar22, set, i6), (FieldVisibility) tlsVar22.invoke(fyqVar22), false, fieldImeAction22, null, 328);
                                if (kud0Var3 == null) {
                                }
                                String str2522 = str8;
                                if (qv0Var != null) {
                                }
                                m8e m8eVar22 = new m8e(Integer.MAX_VALUE);
                                dyq dyqVar22 = dyq.a;
                                txqVar4 = new txq(dyqVar22, str2522, r38, m8eVar22, a(j7l0Var2, dyqVar22, set, i6), (FieldVisibility) tlsVar22.invoke(dyqVar22), false, fieldImeAction22, null, 320);
                                String str2622 = kud0Var3 == null ? kud0Var3.f : ct0Var.h;
                                FieldVisibility fieldVisibility222 = (FieldVisibility) tlsVar22.invoke(byq.a);
                                if (kud0Var3 == null) {
                                }
                                if (r0 == null) {
                                }
                                naeVar = new nae(str2622, str5, fieldVisibility222, null, ((str5 != null || evu0.J(str5)) && r0 != null) ? new ybe(r0) : ace.a, true);
                                if (gs0Var != null) {
                                }
                                txqVar6 = txqVar5;
                                naeVar2 = naeVar;
                                rgb0Var = null;
                                if (j7l0Var2 != null) {
                                }
                                wa31Var2 = wa31Var;
                                txqVar7 = txqVar4;
                                z4 = false;
                                i5 = i6;
                                naeVar3 = naeVar2;
                                d41Var2 = d41Var;
                                txqVar8 = txqVar6;
                                fj00Var2 = fj00Var;
                                txqVar9 = txqVar3;
                                g2q0Var = null;
                                if (j7l0Var2 == null) {
                                }
                                if (j7l0Var2 != null) {
                                    z4 = true;
                                }
                                return new x7l0(i5, null, d41Var2, fj00Var2, txqVar, txqVar9, txqVar2, txqVar7, txqVar8, naeVar3, rgb0Var, false, g2q0Var, r16, z4, wa31Var2, null, 67586);
                            }
                            if (str4.length() != 0) {
                            }
                            ow91 ow91Var222 = str4.length() != 0 ? uj51.b : tj51.b;
                            if (s != null) {
                            }
                            d41Var = new d41(r29, r30, ow91Var222, hts0Var, z, false, null, j7l0Var2 == null && j7l0Var2.j, 96);
                            if (j7l0Var2 == null) {
                            }
                            if (j7l0Var2 == null) {
                            }
                            a0t a0tVar222 = oo0Var2.f;
                            kud0Var2 = kud0Var;
                            doe doeVar222 = new doe(a0tVar222.a, a0tVar222.b);
                            int i10222 = jg00Var.c;
                            it = jg00Var.b.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                            ig00Var = (ig00) obj;
                            if (ig00Var != null) {
                            }
                            String str20222 = "";
                            yi00 yi00Var222 = new yi00(z3, this.g.a(doeVar222, new t6u0(i10222, new is00(z3, str20222))));
                            if (jts0Var == null) {
                            }
                            fj00Var = new fj00(yi00Var222, dj00Var);
                            if (kud0Var2 == null) {
                            }
                            String str21222 = str7;
                            if (qv0Var != null) {
                            }
                            gyq gyqVar222 = gyq.a;
                            String a222 = a(j7l0Var2, gyqVar222, set, i6);
                            tls tlsVar222 = jt0Var;
                            FieldVisibility fieldVisibility322 = (FieldVisibility) tlsVar222.invoke(gyqVar222);
                            FieldImeAction fieldImeAction222 = FieldImeAction.DONE;
                            txqVar = new txq(gyqVar222, str21222, r31, null, a222, fieldVisibility322, false, fieldImeAction222, null, 328);
                            String str22222 = kud0Var3 == null ? kud0Var3.b : ct0Var.f;
                            if (qv0Var != null) {
                            }
                            cyq cyqVar222 = cyq.a;
                            txqVar2 = new txq(cyqVar222, str22222, r38, null, a(j7l0Var2, cyqVar222, set, i6), (FieldVisibility) tlsVar222.invoke(cyqVar222), false, fieldImeAction222, null, 328);
                            String str23222 = kud0Var3 == null ? kud0Var3.d : ct0Var.i;
                            if (qv0Var != null) {
                            }
                            eyq eyqVar222 = eyq.a;
                            txqVar3 = new txq(eyqVar222, str23222, r38, null, a(j7l0Var2, eyqVar222, set, i6), (FieldVisibility) tlsVar222.invoke(eyqVar222), false, fieldImeAction222, null, 328);
                            String str24222 = kud0Var3 == null ? kud0Var3.c : ct0Var.e;
                            if (qv0Var != null) {
                            }
                            fyq fyqVar222 = fyq.a;
                            txq txqVar11222 = new txq(fyqVar222, str24222, r38, null, a(j7l0Var2, fyqVar222, set, i6), (FieldVisibility) tlsVar222.invoke(fyqVar222), false, fieldImeAction222, null, 328);
                            if (kud0Var3 == null) {
                            }
                            String str25222 = str8;
                            if (qv0Var != null) {
                            }
                            m8e m8eVar222 = new m8e(Integer.MAX_VALUE);
                            dyq dyqVar222 = dyq.a;
                            txqVar4 = new txq(dyqVar222, str25222, r38, m8eVar222, a(j7l0Var2, dyqVar222, set, i6), (FieldVisibility) tlsVar222.invoke(dyqVar222), false, fieldImeAction222, null, 320);
                            String str26222 = kud0Var3 == null ? kud0Var3.f : ct0Var.h;
                            FieldVisibility fieldVisibility2222 = (FieldVisibility) tlsVar222.invoke(byq.a);
                            if (kud0Var3 == null) {
                            }
                            if (r0 == null) {
                            }
                            naeVar = new nae(str26222, str5, fieldVisibility2222, null, ((str5 != null || evu0.J(str5)) && r0 != null) ? new ybe(r0) : ace.a, true);
                            if (gs0Var != null) {
                            }
                            txqVar6 = txqVar5;
                            naeVar2 = naeVar;
                            rgb0Var = null;
                            if (j7l0Var2 != null) {
                            }
                            wa31Var2 = wa31Var;
                            txqVar7 = txqVar4;
                            z4 = false;
                            i5 = i6;
                            naeVar3 = naeVar2;
                            d41Var2 = d41Var;
                            txqVar8 = txqVar6;
                            fj00Var2 = fj00Var;
                            txqVar9 = txqVar3;
                            g2q0Var = null;
                            if (j7l0Var2 == null) {
                            }
                            if (j7l0Var2 != null) {
                            }
                            return new x7l0(i5, null, d41Var2, fj00Var2, txqVar, txqVar9, txqVar2, txqVar7, txqVar8, naeVar3, rgb0Var, false, g2q0Var, r16, z4, wa31Var2, null, 67586);
                        }
                        str5 = null;
                        String str27 = (str4.length() == 0 || j7l0Var2 == null) ? null : j7l0Var2.e;
                        String str28 = str4.length() != 0 ? str15 : str4;
                        ow91 ow91Var2222 = str4.length() != 0 ? uj51.b : tj51.b;
                        if (s != null) {
                            jt0Var = jt0Var2;
                            hts0Var = new gts0(new y4v(lvi0Var, new a5v(), null));
                        } else {
                            jt0Var = jt0Var2;
                            hts0Var = s;
                        }
                        d41Var = new d41(str28, str27, ow91Var2222, hts0Var, z, false, null, j7l0Var2 == null && j7l0Var2.j, 96);
                        if ((j7l0Var2 == null && !j7l0Var2.l) || jg00Var == null || qv0Var == null || (oo0Var2 = qv0Var.a) == null) {
                            kud0Var2 = kud0Var;
                            fj00Var = null;
                        } else {
                            jts0Var = j7l0Var2 == null ? j7l0Var2.d : null;
                            a0t a0tVar2222 = oo0Var2.f;
                            kud0Var2 = kud0Var;
                            doe doeVar2222 = new doe(a0tVar2222.a, a0tVar2222.b);
                            int i102222 = jg00Var.c;
                            it = jg00Var.b.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((ig00) obj).a == (z3 ? MapConfig$MapStyle$MapTheme.DARK : MapConfig$MapStyle$MapTheme.LIGHT)) {
                                    break;
                                }
                            }
                            ig00Var = (ig00) obj;
                            if (ig00Var != null || (str20222 = ig00Var.b) == null) {
                                String str202222 = "";
                            }
                            yi00 yi00Var2222 = new yi00(z3, this.g.a(doeVar2222, new t6u0(i102222, new is00(z3, str202222))));
                            if (jts0Var == null) {
                                f5v f5vVar = jts0Var.a;
                                lvi0 g = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, f5vVar.a, null, null, 14);
                                String str29 = f5vVar.b;
                                dj00Var = new zi00(g, str29 != null ? aVar.g.f(str29) : null);
                            } else {
                                boolean z8 = i6 == 0;
                                boolean z9 = i6 == 1 && i6 == i2;
                                if (z8) {
                                    aj00Var = new ej00(new cuj0(ozg0.ic_boxfill, null, Boolean.TRUE, new zez0(z3 ? dl51.m : dl51.g), 16));
                                } else if (z9) {
                                    aj00Var = new aj00(new cuj0(ozg0.ic_finish, null, Boolean.TRUE, new zez0(z3 ? dl51.g : dl51.m), 16));
                                } else {
                                    dj00Var = new dj00(i6);
                                }
                                dj00Var = aj00Var;
                            }
                            fj00Var = new fj00(yi00Var2222, dj00Var);
                        }
                        if (kud0Var2 == null) {
                            kud0Var3 = kud0Var2;
                            str7 = kud0Var3.a;
                        } else {
                            kud0Var3 = kud0Var2;
                            str7 = ct0Var.d;
                        }
                        String str212222 = str7;
                        String str30 = (qv0Var != null || (str13 = qv0Var.b) == null) ? "" : str13;
                        gyq gyqVar2222 = gyq.a;
                        String a2222 = a(j7l0Var2, gyqVar2222, set, i6);
                        tls tlsVar2222 = jt0Var;
                        FieldVisibility fieldVisibility3222 = (FieldVisibility) tlsVar2222.invoke(gyqVar2222);
                        FieldImeAction fieldImeAction2222 = FieldImeAction.DONE;
                        txqVar = new txq(gyqVar2222, str212222, str30, null, a2222, fieldVisibility3222, false, fieldImeAction2222, null, 328);
                        String str222222 = kud0Var3 == null ? kud0Var3.b : ct0Var.f;
                        String str31 = (qv0Var != null || (str12 = qv0Var.c) == null) ? "" : str12;
                        cyq cyqVar2222 = cyq.a;
                        txqVar2 = new txq(cyqVar2222, str222222, str31, null, a(j7l0Var2, cyqVar2222, set, i6), (FieldVisibility) tlsVar2222.invoke(cyqVar2222), false, fieldImeAction2222, null, 328);
                        String str232222 = kud0Var3 == null ? kud0Var3.d : ct0Var.i;
                        String str32 = (qv0Var != null || (str11 = qv0Var.f) == null) ? "" : str11;
                        eyq eyqVar2222 = eyq.a;
                        txqVar3 = new txq(eyqVar2222, str232222, str32, null, a(j7l0Var2, eyqVar2222, set, i6), (FieldVisibility) tlsVar2222.invoke(eyqVar2222), false, fieldImeAction2222, null, 328);
                        String str242222 = kud0Var3 == null ? kud0Var3.c : ct0Var.e;
                        String str33 = (qv0Var != null || (str10 = qv0Var.d) == null) ? "" : str10;
                        fyq fyqVar2222 = fyq.a;
                        txq txqVar112222 = new txq(fyqVar2222, str242222, str33, null, a(j7l0Var2, fyqVar2222, set, i6), (FieldVisibility) tlsVar2222.invoke(fyqVar2222), false, fieldImeAction2222, null, 328);
                        if (kud0Var3 == null) {
                            txqVar5 = txqVar112222;
                            str8 = kud0Var3.e;
                        } else {
                            txqVar5 = txqVar112222;
                            str8 = ct0Var.g;
                        }
                        String str252222 = str8;
                        String str34 = (qv0Var != null || (str9 = qv0Var.e) == null) ? "" : str9;
                        m8e m8eVar2222 = new m8e(Integer.MAX_VALUE);
                        dyq dyqVar2222 = dyq.a;
                        txqVar4 = new txq(dyqVar2222, str252222, str34, m8eVar2222, a(j7l0Var2, dyqVar2222, set, i6), (FieldVisibility) tlsVar2222.invoke(dyqVar2222), false, fieldImeAction2222, null, 320);
                        String str262222 = kud0Var3 == null ? kud0Var3.f : ct0Var.h;
                        FieldVisibility fieldVisibility22222 = (FieldVisibility) tlsVar2222.invoke(byq.a);
                        xaq0 xaq0Var = kud0Var3 == null ? kud0Var3.k : null;
                        String str35 = xaq0Var == null ? xaq0Var.a : null;
                        naeVar = new nae(str262222, str5, fieldVisibility22222, null, ((str5 != null || evu0.J(str5)) && str35 != null) ? new ybe(str35) : ace.a, true);
                        if (gs0Var != null || (qkb0Var = gs0Var.c) == null) {
                            txqVar6 = txqVar5;
                            naeVar2 = naeVar;
                            rgb0Var = null;
                        } else {
                            if (list != null) {
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList = new ArrayList();
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = it2;
                                    if (hashSet.add(((mkb0) next).getId())) {
                                        arrayList.add(next);
                                    }
                                    it2 = it3;
                                }
                                if (arrayList.size() != list.size()) {
                                    z5 = false;
                                    if (!z5) {
                                        jgz jgzVar = jgz.a;
                                        jgz.c(new IllegalStateException("Photocomments don't have unique ids"));
                                    }
                                    dlb0 dlb0Var = new dlb0(list != null ? EmptyList.a : list, z5);
                                    final int i11 = 0;
                                    final int i12 = 1;
                                    txqVar6 = txqVar5;
                                    naeVar2 = naeVar;
                                    hj0 hj0Var = new hj0(qkb0Var.c <= (list == null ? list.size() : 0), new sls(this) { // from class: kt0
                                        public final /* synthetic */ c b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // defpackage.sls
                                        public final Object invoke() {
                                            int i13 = i11;
                                            zy11 zy11Var = zy11.a;
                                            qkb0 qkb0Var2 = qkb0Var;
                                            int i14 = i6;
                                            c cVar = this.b;
                                            switch (i13) {
                                                case 0:
                                                    cVar.e.f(new r5s(joa1.d(i14)), qkb0Var2.b, qkb0Var2.a);
                                                    break;
                                                default:
                                                    cVar.e.g(new r5s(joa1.d(i14)), qkb0Var2.b, qkb0Var2.a);
                                                    break;
                                            }
                                            return zy11Var;
                                        }
                                    }, new sls(this) { // from class: kt0
                                        public final /* synthetic */ c b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // defpackage.sls
                                        public final Object invoke() {
                                            int i13 = i12;
                                            zy11 zy11Var = zy11.a;
                                            qkb0 qkb0Var2 = qkb0Var;
                                            int i14 = i6;
                                            c cVar = this.b;
                                            switch (i13) {
                                                case 0:
                                                    cVar.e.f(new r5s(joa1.d(i14)), qkb0Var2.b, qkb0Var2.a);
                                                    break;
                                                default:
                                                    cVar.e.g(new r5s(joa1.d(i14)), qkb0Var2.b, qkb0Var2.a);
                                                    break;
                                            }
                                            return zy11Var;
                                        }
                                    }, new AddressDetailsScreenMapper$mapPhotocomments$3(0, this.e, ru.yandex.taxi.logistics.sdk.photocomments.domain.a.class, "showMaxPhotosDialog", "showMaxPhotosDialog()V", 0), new lt0(this, str, map, i6, 0));
                                    i6 = i;
                                    rgb0Var = new rgb0(dlb0Var, hj0Var, new mt0((Object) this, str, map, i6, 0));
                                }
                            }
                            z5 = true;
                            if (!z5) {
                            }
                            dlb0 dlb0Var2 = new dlb0(list != null ? EmptyList.a : list, z5);
                            final int i112 = 0;
                            final int i122 = 1;
                            txqVar6 = txqVar5;
                            naeVar2 = naeVar;
                            hj0 hj0Var2 = new hj0(qkb0Var.c <= (list == null ? list.size() : 0), new sls(this) { // from class: kt0
                                public final /* synthetic */ c b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i13 = i112;
                                    zy11 zy11Var = zy11.a;
                                    qkb0 qkb0Var2 = qkb0Var;
                                    int i14 = i6;
                                    c cVar = this.b;
                                    switch (i13) {
                                        case 0:
                                            cVar.e.f(new r5s(joa1.d(i14)), qkb0Var2.b, qkb0Var2.a);
                                            break;
                                        default:
                                            cVar.e.g(new r5s(joa1.d(i14)), qkb0Var2.b, qkb0Var2.a);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            }, new sls(this) { // from class: kt0
                                public final /* synthetic */ c b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i13 = i122;
                                    zy11 zy11Var = zy11.a;
                                    qkb0 qkb0Var2 = qkb0Var;
                                    int i14 = i6;
                                    c cVar = this.b;
                                    switch (i13) {
                                        case 0:
                                            cVar.e.f(new r5s(joa1.d(i14)), qkb0Var2.b, qkb0Var2.a);
                                            break;
                                        default:
                                            cVar.e.g(new r5s(joa1.d(i14)), qkb0Var2.b, qkb0Var2.a);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            }, new AddressDetailsScreenMapper$mapPhotocomments$3(0, this.e, ru.yandex.taxi.logistics.sdk.photocomments.domain.a.class, "showMaxPhotosDialog", "showMaxPhotosDialog()V", 0), new lt0(this, str, map, i6, 0));
                            i6 = i;
                            rgb0Var = new rgb0(dlb0Var2, hj0Var2, new mt0((Object) this, str, map, i6, 0));
                        }
                        if (j7l0Var2 != null || (lqeVar = j7l0Var2.h) == null) {
                            wa31Var2 = wa31Var;
                            txqVar7 = txqVar4;
                            z4 = false;
                            i5 = i6;
                            naeVar3 = naeVar2;
                            d41Var2 = d41Var;
                            txqVar8 = txqVar6;
                            fj00Var2 = fj00Var;
                            txqVar9 = txqVar3;
                            g2q0Var = null;
                            vu0 vu0Var = j7l0Var2 == null ? j7l0Var2.i : null;
                            if (j7l0Var2 != null && j7l0Var2.k) {
                                z4 = true;
                            }
                            return new x7l0(i5, null, d41Var2, fj00Var2, txqVar, txqVar9, txqVar2, txqVar7, txqVar8, naeVar3, rgb0Var, false, g2q0Var, vu0Var, z4, wa31Var2, null, 67586);
                        }
                        AddressDetailsScreenMapper$mapRoutePoint$1 addressDetailsScreenMapper$mapRoutePoint$13 = addressDetailsScreenMapper$mapRoutePoint$12;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$0 = j7l0Var2;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$1 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$2 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$3 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$4 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$5 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$6 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$7 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$8 = null;
                        wa31Var2 = wa31Var;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$9 = wa31Var2;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$10 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$11 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$12 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$13 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$14 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$15 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$16 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$17 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$18 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$19 = d41Var;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$20 = fj00Var;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$21 = txqVar;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$22 = txqVar2;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$23 = txqVar3;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$24 = txqVar6;
                        txqVar7 = txqVar4;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$25 = txqVar7;
                        nae naeVar5 = naeVar2;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$26 = naeVar5;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$27 = rgb0Var;
                        addressDetailsScreenMapper$mapRoutePoint$13.L$28 = null;
                        addressDetailsScreenMapper$mapRoutePoint$13.I$0 = i6;
                        addressDetailsScreenMapper$mapRoutePoint$13.I$1 = i2;
                        addressDetailsScreenMapper$mapRoutePoint$13.Z$0 = z;
                        addressDetailsScreenMapper$mapRoutePoint$13.Z$1 = z2;
                        addressDetailsScreenMapper$mapRoutePoint$13.Z$2 = z3;
                        addressDetailsScreenMapper$mapRoutePoint$13.I$2 = i4;
                        addressDetailsScreenMapper$mapRoutePoint$13.I$3 = z7 ? 1 : 0;
                        z4 = false;
                        addressDetailsScreenMapper$mapRoutePoint$13.I$4 = 0;
                        addressDetailsScreenMapper$mapRoutePoint$13.label = 1;
                        Object f2 = f(lqeVar, j6sVar, formLoadingStateRepository$State, set2, addressDetailsScreenMapper$mapRoutePoint$13);
                        if (f2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj2 = f2;
                        i5 = i6;
                        naeVar4 = naeVar5;
                        txqVar8 = txqVar6;
                        txqVar10 = txqVar3;
                        d41Var3 = d41Var;
                        fj00Var2 = fj00Var;
                    }
                    lts0Var = null;
                    s = lts0Var == null ? aVar.s(lts0Var) : null;
                    if (qv0Var != null) {
                        if (str6.length() == 0) {
                        }
                    }
                    if (qv0Var == null) {
                    }
                    str5 = null;
                    if (str4.length() == 0) {
                    }
                    if (str4.length() != 0) {
                    }
                    ow91 ow91Var22222 = str4.length() != 0 ? uj51.b : tj51.b;
                    if (s != null) {
                    }
                    d41Var = new d41(str28, str27, ow91Var22222, hts0Var, z, false, null, j7l0Var2 == null && j7l0Var2.j, 96);
                    if (j7l0Var2 == null) {
                    }
                    if (j7l0Var2 == null) {
                    }
                    a0t a0tVar22222 = oo0Var2.f;
                    kud0Var2 = kud0Var;
                    doe doeVar22222 = new doe(a0tVar22222.a, a0tVar22222.b);
                    int i1022222 = jg00Var.c;
                    it = jg00Var.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    ig00Var = (ig00) obj;
                    if (ig00Var != null) {
                    }
                    String str2022222 = "";
                    yi00 yi00Var22222 = new yi00(z3, this.g.a(doeVar22222, new t6u0(i1022222, new is00(z3, str2022222))));
                    if (jts0Var == null) {
                    }
                    fj00Var = new fj00(yi00Var22222, dj00Var);
                    if (kud0Var2 == null) {
                    }
                    String str2122222 = str7;
                    if (qv0Var != null) {
                    }
                    gyq gyqVar22222 = gyq.a;
                    String a22222 = a(j7l0Var2, gyqVar22222, set, i6);
                    tls tlsVar22222 = jt0Var;
                    FieldVisibility fieldVisibility32222 = (FieldVisibility) tlsVar22222.invoke(gyqVar22222);
                    FieldImeAction fieldImeAction22222 = FieldImeAction.DONE;
                    txqVar = new txq(gyqVar22222, str2122222, str30, null, a22222, fieldVisibility32222, false, fieldImeAction22222, null, 328);
                    String str2222222 = kud0Var3 == null ? kud0Var3.b : ct0Var.f;
                    if (qv0Var != null) {
                    }
                    cyq cyqVar22222 = cyq.a;
                    txqVar2 = new txq(cyqVar22222, str2222222, str31, null, a(j7l0Var2, cyqVar22222, set, i6), (FieldVisibility) tlsVar22222.invoke(cyqVar22222), false, fieldImeAction22222, null, 328);
                    String str2322222 = kud0Var3 == null ? kud0Var3.d : ct0Var.i;
                    if (qv0Var != null) {
                    }
                    eyq eyqVar22222 = eyq.a;
                    txqVar3 = new txq(eyqVar22222, str2322222, str32, null, a(j7l0Var2, eyqVar22222, set, i6), (FieldVisibility) tlsVar22222.invoke(eyqVar22222), false, fieldImeAction22222, null, 328);
                    String str2422222 = kud0Var3 == null ? kud0Var3.c : ct0Var.e;
                    if (qv0Var != null) {
                    }
                    fyq fyqVar22222 = fyq.a;
                    txq txqVar1122222 = new txq(fyqVar22222, str2422222, str33, null, a(j7l0Var2, fyqVar22222, set, i6), (FieldVisibility) tlsVar22222.invoke(fyqVar22222), false, fieldImeAction22222, null, 328);
                    if (kud0Var3 == null) {
                    }
                    String str2522222 = str8;
                    if (qv0Var != null) {
                    }
                    m8e m8eVar22222 = new m8e(Integer.MAX_VALUE);
                    dyq dyqVar22222 = dyq.a;
                    txqVar4 = new txq(dyqVar22222, str2522222, str34, m8eVar22222, a(j7l0Var2, dyqVar22222, set, i6), (FieldVisibility) tlsVar22222.invoke(dyqVar22222), false, fieldImeAction22222, null, 320);
                    String str2622222 = kud0Var3 == null ? kud0Var3.f : ct0Var.h;
                    FieldVisibility fieldVisibility222222 = (FieldVisibility) tlsVar22222.invoke(byq.a);
                    if (kud0Var3 == null) {
                    }
                    if (xaq0Var == null) {
                    }
                    naeVar = new nae(str2622222, str5, fieldVisibility222222, null, ((str5 != null || evu0.J(str5)) && str35 != null) ? new ybe(str35) : ace.a, true);
                    if (gs0Var != null) {
                    }
                    txqVar6 = txqVar5;
                    naeVar2 = naeVar;
                    rgb0Var = null;
                    if (j7l0Var2 != null) {
                    }
                    wa31Var2 = wa31Var;
                    txqVar7 = txqVar4;
                    z4 = false;
                    i5 = i6;
                    naeVar3 = naeVar2;
                    d41Var2 = d41Var;
                    txqVar8 = txqVar6;
                    fj00Var2 = fj00Var;
                    txqVar9 = txqVar3;
                    g2q0Var = null;
                    if (j7l0Var2 == null) {
                    }
                    if (j7l0Var2 != null) {
                    }
                    return new x7l0(i5, null, d41Var2, fj00Var2, txqVar, txqVar9, txqVar2, txqVar7, txqVar8, naeVar3, rgb0Var, false, g2q0Var, vu0Var, z4, wa31Var2, null, 67586);
                }
                if (i3 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i5 = addressDetailsScreenMapper$mapRoutePoint$1.I$0;
                rgb0Var = (rgb0) addressDetailsScreenMapper$mapRoutePoint$1.L$27;
                naeVar4 = (nae) addressDetailsScreenMapper$mapRoutePoint$1.L$26;
                txq txqVar12 = (txq) addressDetailsScreenMapper$mapRoutePoint$1.L$25;
                txqVar8 = (txq) addressDetailsScreenMapper$mapRoutePoint$1.L$24;
                txqVar10 = (txq) addressDetailsScreenMapper$mapRoutePoint$1.L$23;
                txq txqVar13 = (txq) addressDetailsScreenMapper$mapRoutePoint$1.L$22;
                txq txqVar14 = (txq) addressDetailsScreenMapper$mapRoutePoint$1.L$21;
                fj00Var2 = (fj00) addressDetailsScreenMapper$mapRoutePoint$1.L$20;
                d41Var3 = (d41) addressDetailsScreenMapper$mapRoutePoint$1.L$19;
                wa31 wa31Var3 = (wa31) addressDetailsScreenMapper$mapRoutePoint$1.L$9;
                j7l0 j7l0Var3 = (j7l0) addressDetailsScreenMapper$mapRoutePoint$1.L$0;
                kotlin.b.b(obj3);
                txqVar2 = txqVar13;
                j7l0Var2 = j7l0Var3;
                z4 = false;
                obj2 = obj3;
                txqVar = txqVar14;
                txqVar7 = txqVar12;
                wa31Var2 = wa31Var3;
                g2q0Var = (g2q0) obj2;
                naeVar3 = naeVar4;
                txqVar9 = txqVar10;
                d41Var2 = d41Var3;
                if (j7l0Var2 == null) {
                }
                if (j7l0Var2 != null) {
                }
                return new x7l0(i5, null, d41Var2, fj00Var2, txqVar, txqVar9, txqVar2, txqVar7, txqVar8, naeVar3, rgb0Var, false, g2q0Var, vu0Var, z4, wa31Var2, null, 67586);
            }
        }
        addressDetailsScreenMapper$mapRoutePoint$1 = new AddressDetailsScreenMapper$mapRoutePoint$1(this, continuationImpl);
        Object obj32 = addressDetailsScreenMapper$mapRoutePoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = addressDetailsScreenMapper$mapRoutePoint$1.label;
        if (i3 != 0) {
        }
        g2q0Var = (g2q0) obj2;
        naeVar3 = naeVar4;
        txqVar9 = txqVar10;
        d41Var2 = d41Var3;
        if (j7l0Var2 == null) {
        }
        if (j7l0Var2 != null) {
        }
        return new x7l0(i5, null, d41Var2, fj00Var2, txqVar, txqVar9, txqVar2, txqVar7, txqVar8, naeVar3, rgb0Var, false, g2q0Var, vu0Var, z4, wa31Var2, null, 67586);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0283, code lost:
    
        r1 = r31;
        r3 = r0;
        r23 = r4;
        r13 = r9;
        r0 = r18;
        r9 = r29;
        r4 = r30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v0, types: [ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0257 -> B:17:0x026c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(j6s j6sVar, e0l0 e0l0Var, at0 at0Var, g8l0 g8l0Var, gs0 gs0Var, FormLoadingStateRepository$State formLoadingStateRepository$State, Set set, jg00 jg00Var, boolean z, va31 va31Var, Set set2, Map map, ContinuationImpl continuationImpl) {
        AddressDetailsScreenMapper$mapRoutePoints$1 addressDetailsScreenMapper$mapRoutePoints$1;
        int i;
        j6s j6sVar2;
        int i2;
        Set set3;
        jg00 jg00Var2;
        boolean z2;
        va31 va31Var2;
        Set set4;
        Map map2;
        AddressDetailsScreenMapper$mapRoutePoints$1 addressDetailsScreenMapper$mapRoutePoints$12;
        CoroutineSingletons coroutineSingletons;
        ArrayList arrayList;
        e0l0 e0l0Var2;
        int size;
        int i3;
        g8l0 g8l0Var2;
        gs0 gs0Var2;
        FormLoadingStateRepository$State formLoadingStateRepository$State2;
        at0 at0Var2;
        List list;
        List list2;
        List list3;
        ArrayList arrayList2;
        j7l0 j7l0Var;
        kud0 kud0Var;
        int i4;
        boolean z3;
        int i5;
        wa31 wa31Var;
        List list4;
        c cVar = this;
        if (continuationImpl instanceof AddressDetailsScreenMapper$mapRoutePoints$1) {
            addressDetailsScreenMapper$mapRoutePoints$1 = (AddressDetailsScreenMapper$mapRoutePoints$1) continuationImpl;
            int i6 = addressDetailsScreenMapper$mapRoutePoints$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                addressDetailsScreenMapper$mapRoutePoints$1.label = i6 - Integer.MIN_VALUE;
                Object obj = addressDetailsScreenMapper$mapRoutePoints$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressDetailsScreenMapper$mapRoutePoints$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j6sVar2 = j6sVar;
                    i2 = formLoadingStateRepository$State == FormLoadingStateRepository$State.LOADING ? 1 : 0;
                    set3 = set;
                    jg00Var2 = jg00Var;
                    z2 = z;
                    va31Var2 = va31Var;
                    set4 = set2;
                    map2 = map;
                    addressDetailsScreenMapper$mapRoutePoints$12 = addressDetailsScreenMapper$mapRoutePoints$1;
                    coroutineSingletons = coroutineSingletons2;
                    arrayList = new ArrayList();
                    e0l0Var2 = e0l0Var;
                    size = e0l0Var.a.size();
                    i3 = 0;
                    g8l0Var2 = g8l0Var;
                    gs0Var2 = gs0Var;
                    formLoadingStateRepository$State2 = formLoadingStateRepository$State;
                    at0Var2 = at0Var;
                    if (i3 >= size) {
                    }
                    return r0;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) addressDetailsScreenMapper$mapRoutePoints$1.L$12;
                    list2 = (List) addressDetailsScreenMapper$mapRoutePoints$1.L$11;
                    kotlin.b.b(obj);
                    list.add(obj);
                    return list2;
                }
                int i7 = addressDetailsScreenMapper$mapRoutePoints$1.I$2;
                int i8 = addressDetailsScreenMapper$mapRoutePoints$1.I$1;
                int i9 = addressDetailsScreenMapper$mapRoutePoints$1.I$0;
                boolean z4 = addressDetailsScreenMapper$mapRoutePoints$1.Z$0;
                ?? r11 = (List) addressDetailsScreenMapper$mapRoutePoints$1.L$11;
                Map map3 = (Map) addressDetailsScreenMapper$mapRoutePoints$1.L$10;
                Set set5 = (Set) addressDetailsScreenMapper$mapRoutePoints$1.L$9;
                va31 va31Var3 = (va31) addressDetailsScreenMapper$mapRoutePoints$1.L$8;
                jg00 jg00Var3 = (jg00) addressDetailsScreenMapper$mapRoutePoints$1.L$7;
                Set set6 = (Set) addressDetailsScreenMapper$mapRoutePoints$1.L$6;
                FormLoadingStateRepository$State formLoadingStateRepository$State3 = (FormLoadingStateRepository$State) addressDetailsScreenMapper$mapRoutePoints$1.L$5;
                gs0 gs0Var3 = (gs0) addressDetailsScreenMapper$mapRoutePoints$1.L$4;
                Object obj2 = obj;
                g8l0 g8l0Var3 = (g8l0) addressDetailsScreenMapper$mapRoutePoints$1.L$3;
                at0 at0Var3 = (at0) addressDetailsScreenMapper$mapRoutePoints$1.L$2;
                e0l0 e0l0Var3 = (e0l0) addressDetailsScreenMapper$mapRoutePoints$1.L$1;
                j6s j6sVar3 = (j6s) addressDetailsScreenMapper$mapRoutePoints$1.L$0;
                kotlin.b.b(obj2);
                j6s j6sVar4 = j6sVar3;
                CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                g8l0 g8l0Var4 = g8l0Var3;
                at0 at0Var4 = at0Var3;
                e0l0 e0l0Var4 = e0l0Var3;
                ArrayList arrayList3 = r11;
                arrayList3.add((x7l0) obj2);
                gs0 gs0Var4 = gs0Var3;
                formLoadingStateRepository$State2 = formLoadingStateRepository$State3;
                gs0Var2 = gs0Var4;
                z2 = z4;
                ArrayList arrayList4 = arrayList3;
                map2 = map3;
                jg00Var2 = jg00Var3;
                set3 = set6;
                i3 = i8;
                va31Var2 = va31Var3;
                g8l0Var2 = g8l0Var4;
                addressDetailsScreenMapper$mapRoutePoints$12 = addressDetailsScreenMapper$mapRoutePoints$1;
                e0l0Var2 = e0l0Var4;
                i3++;
                coroutineSingletons = coroutineSingletons3;
                j6sVar2 = j6sVar4;
                size = i7;
                i2 = i9;
                set4 = set5;
                at0Var2 = at0Var4;
                arrayList = arrayList4;
                cVar = this;
                if (i3 >= size) {
                    int i10 = size;
                    if (g8l0Var2 != null) {
                        int i11 = g8l0Var2.a;
                        arrayList2 = arrayList;
                        if (i3 > g8l0Var2.b || i11 > i3) {
                            arrayList4 = arrayList2;
                            j6sVar4 = j6sVar2;
                            at0Var4 = at0Var2;
                            set5 = set4;
                            coroutineSingletons3 = coroutineSingletons;
                            i9 = i2;
                            i7 = i10;
                            i3++;
                            coroutineSingletons = coroutineSingletons3;
                            j6sVar2 = j6sVar4;
                            size = i7;
                            i2 = i9;
                            set4 = set5;
                            at0Var2 = at0Var4;
                            arrayList = arrayList4;
                            cVar = this;
                            if (i3 >= size) {
                                int i12 = i2;
                                j6s j6sVar5 = j6sVar2;
                                at0 at0Var5 = at0Var2;
                                g8l0 g8l0Var5 = g8l0Var2;
                                gs0 gs0Var5 = gs0Var2;
                                FormLoadingStateRepository$State formLoadingStateRepository$State4 = formLoadingStateRepository$State2;
                                Set set7 = set4;
                                ArrayList arrayList5 = arrayList;
                                AddressDetailsScreenMapper$mapRoutePoints$1 addressDetailsScreenMapper$mapRoutePoints$13 = addressDetailsScreenMapper$mapRoutePoints$12;
                                coroutineSingletons3 = coroutineSingletons;
                                boolean z5 = z2;
                                boolean z6 = true;
                                if (arrayList5.size() != 1 || g8l0Var5 != null) {
                                    return arrayList5;
                                }
                                j7l0 j7l0Var2 = (at0Var5 == null || (list3 = at0Var5.c) == null) ? null : (j7l0) kotlin.collections.a.S(1, list3);
                                if (i12 == 0) {
                                    z6 = false;
                                }
                                boolean z7 = gs0Var5 != null ? gs0Var5.a.g : false;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$0 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$1 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$2 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$3 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$4 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$5 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$6 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$7 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$8 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$9 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$10 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$11 = arrayList5;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$12 = arrayList5;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$13 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$14 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.L$15 = null;
                                addressDetailsScreenMapper$mapRoutePoints$13.Z$0 = z5;
                                addressDetailsScreenMapper$mapRoutePoints$13.I$0 = i12;
                                addressDetailsScreenMapper$mapRoutePoints$13.label = 2;
                                Object d = d(j7l0Var2, j6sVar5, formLoadingStateRepository$State4, null, null, 1, 1, z6, z7, EmptySet.a, null, null, null, z5, null, set7, null, addressDetailsScreenMapper$mapRoutePoints$13);
                                if (d != coroutineSingletons3) {
                                    obj = d;
                                    list = arrayList5;
                                    list2 = list;
                                    list.add(obj);
                                    return list2;
                                }
                            }
                        }
                    } else {
                        arrayList2 = arrayList;
                    }
                    List list5 = e0l0Var2.a;
                    qv0 qv0Var = (qv0) list5.get(i3);
                    int i13 = g8l0Var2 != null ? i3 - g8l0Var2.a : i3;
                    j7l0 j7l0Var3 = (at0Var2 == null || (list4 = at0Var2.c) == null) ? null : (j7l0) kotlin.collections.a.S(i13, list4);
                    if (i3 == 0) {
                        j7l0Var = j7l0Var3;
                        if (gs0Var2 != null) {
                            kud0Var = gs0Var2.a;
                            i4 = i13;
                        }
                        i4 = i13;
                        kud0Var = null;
                    } else {
                        j7l0Var = j7l0Var3;
                        if (gs0Var2 != null) {
                            kud0Var = gs0Var2.b;
                            i4 = i13;
                        }
                        i4 = i13;
                        kud0Var = null;
                    }
                    Set set8 = set4;
                    jg00 jg00Var4 = jg00Var2;
                    Set set9 = set3;
                    Map i14 = kotlin.collections.b.i(new Pair("current_destination_point_num", new Integer(i3)), new Pair("total_destination_points_num", new Integer(list5.size())));
                    int f = scc.f(list5);
                    boolean z8 = i2 != 0;
                    boolean z9 = kud0Var != null ? kud0Var.g : false;
                    String str = at0Var2 != null ? at0Var2.e : null;
                    if (i3 >= scc.f(list5) || va31Var2 == null) {
                        z3 = z8;
                        i5 = f;
                        wa31Var = null;
                    } else {
                        z3 = z8;
                        i5 = f;
                        wa31Var = new wa31(cVar.d.g.f(va31Var2.a), va31Var2.b);
                    }
                    List list6 = (List) map2.get(new r5s(joa1.d(i3)));
                    addressDetailsScreenMapper$mapRoutePoints$12.L$0 = j6sVar2;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$1 = e0l0Var2;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$2 = at0Var2;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$3 = g8l0Var2;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$4 = gs0Var2;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$5 = formLoadingStateRepository$State2;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$6 = set9;
                    j6s j6sVar6 = j6sVar2;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$7 = jg00Var4;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$8 = va31Var2;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$9 = set8;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$10 = map2;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$11 = arrayList2;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$12 = null;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$13 = null;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$14 = null;
                    addressDetailsScreenMapper$mapRoutePoints$12.L$15 = null;
                    addressDetailsScreenMapper$mapRoutePoints$12.Z$0 = z2;
                    addressDetailsScreenMapper$mapRoutePoints$12.I$0 = i2;
                    addressDetailsScreenMapper$mapRoutePoints$12.I$1 = i3;
                    addressDetailsScreenMapper$mapRoutePoints$12.I$2 = i10;
                    addressDetailsScreenMapper$mapRoutePoints$12.I$3 = i4;
                    addressDetailsScreenMapper$mapRoutePoints$12.label = 1;
                    int i15 = i2;
                    e0l0Var4 = e0l0Var2;
                    wa31 wa31Var2 = wa31Var;
                    at0Var4 = at0Var2;
                    g8l0Var4 = g8l0Var2;
                    gs0 gs0Var6 = gs0Var2;
                    FormLoadingStateRepository$State formLoadingStateRepository$State5 = formLoadingStateRepository$State2;
                    va31 va31Var4 = va31Var2;
                    Map map4 = map2;
                    int i16 = i3;
                    coroutineSingletons3 = coroutineSingletons;
                    boolean z10 = z2;
                    j6sVar4 = j6sVar6;
                    AddressDetailsScreenMapper$mapRoutePoints$1 addressDetailsScreenMapper$mapRoutePoints$14 = addressDetailsScreenMapper$mapRoutePoints$12;
                    Object d2 = cVar.d(j7l0Var, j6sVar4, formLoadingStateRepository$State5, gs0Var6, qv0Var, i16, i5, z3, z9, set9, jg00Var4, str, i14, z10, wa31Var2, set8, list6, addressDetailsScreenMapper$mapRoutePoints$14);
                    if (d2 != coroutineSingletons3) {
                        obj2 = d2;
                        formLoadingStateRepository$State3 = formLoadingStateRepository$State5;
                        i8 = i16;
                        z4 = z10;
                        set5 = set8;
                        i7 = i10;
                        i9 = i15;
                        va31Var3 = va31Var4;
                        addressDetailsScreenMapper$mapRoutePoints$1 = addressDetailsScreenMapper$mapRoutePoints$14;
                        gs0Var3 = gs0Var6;
                        set6 = set9;
                        jg00Var3 = jg00Var4;
                        map3 = map4;
                        arrayList3 = arrayList2;
                        arrayList3.add((x7l0) obj2);
                        gs0 gs0Var42 = gs0Var3;
                        formLoadingStateRepository$State2 = formLoadingStateRepository$State3;
                        gs0Var2 = gs0Var42;
                        z2 = z4;
                        ArrayList arrayList42 = arrayList3;
                        map2 = map3;
                        jg00Var2 = jg00Var3;
                        set3 = set6;
                        i3 = i8;
                        va31Var2 = va31Var3;
                        g8l0Var2 = g8l0Var4;
                        addressDetailsScreenMapper$mapRoutePoints$12 = addressDetailsScreenMapper$mapRoutePoints$1;
                        e0l0Var2 = e0l0Var4;
                        i3++;
                        coroutineSingletons = coroutineSingletons3;
                        j6sVar2 = j6sVar4;
                        size = i7;
                        i2 = i9;
                        set4 = set5;
                        at0Var2 = at0Var4;
                        arrayList = arrayList42;
                        cVar = this;
                        if (i3 >= size) {
                        }
                    }
                }
                return coroutineSingletons3;
            }
        }
        addressDetailsScreenMapper$mapRoutePoints$1 = new AddressDetailsScreenMapper$mapRoutePoints$1(cVar, continuationImpl);
        Object obj3 = addressDetailsScreenMapper$mapRoutePoints$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressDetailsScreenMapper$mapRoutePoints$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01f4 -> B:21:0x01fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(lqe lqeVar, j6s j6sVar, FormLoadingStateRepository$State formLoadingStateRepository$State, Set set, ContinuationImpl continuationImpl) {
        AddressDetailsScreenMapper$mapSection$1 addressDetailsScreenMapper$mapSection$1;
        int i;
        FormLoadingStateRepository$State formLoadingStateRepository$State2;
        Iterator it;
        AddressDetailsScreenMapper$mapSection$1 addressDetailsScreenMapper$mapSection$12;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        j6s j6sVar2;
        Set set2;
        boolean z;
        ArrayList arrayList2;
        boolean z2;
        Object obj;
        int i6;
        Iterator it2;
        ArrayList arrayList3;
        Set set3;
        Object a;
        lqe lqeVar2 = lqeVar;
        if (continuationImpl instanceof AddressDetailsScreenMapper$mapSection$1) {
            addressDetailsScreenMapper$mapSection$1 = (AddressDetailsScreenMapper$mapSection$1) continuationImpl;
            int i7 = addressDetailsScreenMapper$mapSection$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                addressDetailsScreenMapper$mapSection$1.label = i7 - Integer.MIN_VALUE;
                Object obj2 = addressDetailsScreenMapper$mapSection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressDetailsScreenMapper$mapSection$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (lqeVar2 == null) {
                        return null;
                    }
                    List list = lqeVar2.a;
                    ArrayList arrayList4 = new ArrayList();
                    formLoadingStateRepository$State2 = formLoadingStateRepository$State;
                    it = list.iterator();
                    addressDetailsScreenMapper$mapSection$12 = addressDetailsScreenMapper$mapSection$1;
                    arrayList = arrayList4;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    j6sVar2 = j6sVar;
                    set2 = set;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i6 = addressDetailsScreenMapper$mapSection$1.I$2;
                    ?? r1 = (List) addressDetailsScreenMapper$mapSection$1.L$5;
                    kotlin.b.b(obj2);
                    arrayList2 = r1;
                    obj = obj2;
                    z = true;
                    z2 = false;
                    return new g2q0(arrayList2, null, null, null, i6 == 0 ? z : z2, null, null, null, (g3q0) obj, 510);
                }
                int i8 = addressDetailsScreenMapper$mapSection$1.I$3;
                int i9 = addressDetailsScreenMapper$mapSection$1.I$2;
                int i10 = addressDetailsScreenMapper$mapSection$1.I$1;
                int i11 = addressDetailsScreenMapper$mapSection$1.I$0;
                Iterator it3 = (Iterator) addressDetailsScreenMapper$mapSection$1.L$9;
                ?? r13 = (Collection) addressDetailsScreenMapper$mapSection$1.L$7;
                lqe lqeVar3 = (lqe) addressDetailsScreenMapper$mapSection$1.L$4;
                Set set4 = (Set) addressDetailsScreenMapper$mapSection$1.L$3;
                FormLoadingStateRepository$State formLoadingStateRepository$State3 = (FormLoadingStateRepository$State) addressDetailsScreenMapper$mapSection$1.L$2;
                j6s j6sVar3 = (j6s) addressDetailsScreenMapper$mapSection$1.L$1;
                kotlin.b.b(obj2);
                AddressDetailsScreenMapper$mapSection$1 addressDetailsScreenMapper$mapSection$13 = addressDetailsScreenMapper$mapSection$1;
                j6s j6sVar4 = j6sVar3;
                i4 = i10;
                i5 = i11;
                it = it3;
                arrayList = r13;
                formLoadingStateRepository$State2 = formLoadingStateRepository$State3;
                i3 = i9;
                i2 = i8;
                lqeVar2 = lqeVar3;
                n351 n351Var = (n351) obj2;
                if (n351Var != null) {
                    arrayList.add(n351Var);
                }
                j6sVar2 = j6sVar4;
                set2 = set4;
                addressDetailsScreenMapper$mapSection$12 = addressDetailsScreenMapper$mapSection$13;
                obj3 = null;
                if (it.hasNext()) {
                    pre preVar = (pre) it.next();
                    addressDetailsScreenMapper$mapSection$12.L$0 = obj3;
                    addressDetailsScreenMapper$mapSection$12.L$1 = j6sVar2;
                    addressDetailsScreenMapper$mapSection$12.L$2 = formLoadingStateRepository$State2;
                    addressDetailsScreenMapper$mapSection$12.L$3 = set2;
                    addressDetailsScreenMapper$mapSection$12.L$4 = lqeVar2;
                    addressDetailsScreenMapper$mapSection$12.L$5 = obj3;
                    addressDetailsScreenMapper$mapSection$12.L$6 = obj3;
                    addressDetailsScreenMapper$mapSection$12.L$7 = arrayList;
                    addressDetailsScreenMapper$mapSection$12.L$8 = obj3;
                    addressDetailsScreenMapper$mapSection$12.L$9 = it;
                    addressDetailsScreenMapper$mapSection$12.L$10 = obj3;
                    addressDetailsScreenMapper$mapSection$12.L$11 = obj3;
                    addressDetailsScreenMapper$mapSection$12.L$12 = obj3;
                    addressDetailsScreenMapper$mapSection$12.I$0 = i5;
                    addressDetailsScreenMapper$mapSection$12.I$1 = i4;
                    addressDetailsScreenMapper$mapSection$12.I$2 = i3;
                    addressDetailsScreenMapper$mapSection$12.I$3 = i2;
                    addressDetailsScreenMapper$mapSection$12.I$4 = 0;
                    addressDetailsScreenMapper$mapSection$12.I$5 = 0;
                    addressDetailsScreenMapper$mapSection$12.label = 1;
                    bu0 bu0Var = this.a;
                    bu0Var.getClass();
                    if (preVar instanceof et) {
                        it2 = it;
                        arrayList3 = arrayList;
                        a = ((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.a) bu0Var.a).a((et) preVar, formLoadingStateRepository$State2, false, ActionButtonMapper$Container.FORM, addressDetailsScreenMapper$mapSection$12);
                        if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            a = (n351) a;
                        }
                    } else {
                        it2 = it;
                        arrayList3 = arrayList;
                        if (preVar instanceof frl) {
                            a = ((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider.a) bu0Var.b).a((frl) preVar, addressDetailsScreenMapper$mapSection$12);
                            if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                a = (n351) a;
                            }
                        } else if (preVar instanceof tdv) {
                            a = ((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.image.a) bu0Var.c).a((tdv) preVar, addressDetailsScreenMapper$mapSection$12);
                            if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                a = (n351) a;
                            }
                        } else {
                            if (preVar instanceof q8q0) {
                                q8q0 q8q0Var = (q8q0) preVar;
                                v7q0 v7q0Var = q8q0Var.b;
                                if (v7q0Var == null) {
                                    set3 = set2;
                                    j6sVar4 = j6sVar2;
                                    obj2 = null;
                                } else {
                                    a = ((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.segment.a) bu0Var.d).a(v7q0Var, j6sVar2, q8q0Var.a, addressDetailsScreenMapper$mapSection$12);
                                    if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        a = (n351) a;
                                    }
                                }
                            } else if (preVar instanceof eus0) {
                                a = ((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.slot.b) bu0Var.e).a((eus0) preVar, j6sVar2, addressDetailsScreenMapper$mapSection$12);
                                if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    a = (n351) a;
                                }
                            } else if (preVar instanceof y6x0) {
                                a = ((u0z) bu0Var.f).a((y6x0) preVar);
                            } else if (preVar instanceof ksy0) {
                                a = ((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.b) bu0Var.g).a((ksy0) preVar, j6sVar2, addressDetailsScreenMapper$mapSection$12);
                                if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    a = (n351) a;
                                }
                            } else if (preVar instanceof mru) {
                                j6s j6sVar5 = j6sVar2;
                                set3 = set2;
                                obj2 = ((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.a) bu0Var.h).a((mru) preVar, formLoadingStateRepository$State2, j6sVar5, set3, false, addressDetailsScreenMapper$mapSection$12);
                                j6sVar4 = j6sVar5;
                                if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    obj2 = (n351) obj2;
                                }
                            } else {
                                set3 = set2;
                                j6sVar4 = j6sVar2;
                                if (preVar instanceof nxq) {
                                    obj2 = ((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.field_display.a) bu0Var.i).a((nxq) preVar, j6sVar4, addressDetailsScreenMapper$mapSection$12);
                                    if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        obj2 = (n351) obj2;
                                    }
                                }
                                obj2 = null;
                            }
                            if (obj2 != coroutineSingletons) {
                                it = it2;
                                addressDetailsScreenMapper$mapSection$13 = addressDetailsScreenMapper$mapSection$12;
                                arrayList = arrayList3;
                                set4 = set3;
                                n351 n351Var2 = (n351) obj2;
                                if (n351Var2 != null) {
                                }
                                j6sVar2 = j6sVar4;
                                set2 = set4;
                                addressDetailsScreenMapper$mapSection$12 = addressDetailsScreenMapper$mapSection$13;
                                obj3 = null;
                                if (it.hasNext()) {
                                    j6s j6sVar6 = j6sVar2;
                                    z = true;
                                    arrayList2 = arrayList;
                                    h3q0 h3q0Var = lqeVar2.c;
                                    addressDetailsScreenMapper$mapSection$12.L$0 = null;
                                    addressDetailsScreenMapper$mapSection$12.L$1 = null;
                                    addressDetailsScreenMapper$mapSection$12.L$2 = null;
                                    addressDetailsScreenMapper$mapSection$12.L$3 = null;
                                    addressDetailsScreenMapper$mapSection$12.L$4 = null;
                                    addressDetailsScreenMapper$mapSection$12.L$5 = arrayList2;
                                    addressDetailsScreenMapper$mapSection$12.L$6 = null;
                                    addressDetailsScreenMapper$mapSection$12.L$7 = null;
                                    addressDetailsScreenMapper$mapSection$12.L$8 = null;
                                    addressDetailsScreenMapper$mapSection$12.L$9 = null;
                                    addressDetailsScreenMapper$mapSection$12.L$10 = null;
                                    addressDetailsScreenMapper$mapSection$12.L$11 = null;
                                    addressDetailsScreenMapper$mapSection$12.L$12 = null;
                                    addressDetailsScreenMapper$mapSection$12.I$0 = i5;
                                    z2 = false;
                                    addressDetailsScreenMapper$mapSection$12.I$1 = 0;
                                    addressDetailsScreenMapper$mapSection$12.I$2 = 0;
                                    addressDetailsScreenMapper$mapSection$12.label = 2;
                                    Object a2 = this.i.a(h3q0Var, j6sVar6, addressDetailsScreenMapper$mapSection$12);
                                    if (a2 != coroutineSingletons) {
                                        obj = a2;
                                        i6 = 0;
                                        return new g2q0(arrayList2, null, null, null, i6 == 0 ? z : z2, null, null, null, (g3q0) obj, 510);
                                    }
                                }
                            }
                        }
                    }
                    set3 = set2;
                    j6sVar4 = j6sVar2;
                    obj2 = a;
                    if (obj2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        addressDetailsScreenMapper$mapSection$1 = new AddressDetailsScreenMapper$mapSection$1(this, continuationImpl);
        Object obj22 = addressDetailsScreenMapper$mapSection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressDetailsScreenMapper$mapSection$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
    }

    public final void g(String str, String str2, Map map) {
        if (str != null) {
            u1n.m(this.f, new x2s(g8e.p(str, Extension.DOT_CHAR, str2), map));
        }
    }
}
