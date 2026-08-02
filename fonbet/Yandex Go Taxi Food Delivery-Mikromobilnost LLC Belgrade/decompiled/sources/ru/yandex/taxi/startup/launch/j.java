package ru.yandex.taxi.startup.launch;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.yandex.go.agreement.api.trackable.network.CachedTrackableAcceptance;
import defpackage.awx;
import defpackage.bwx;
import defpackage.c4g0;
import defpackage.e3g0;
import defpackage.ecr;
import defpackage.evu0;
import defpackage.ewx;
import defpackage.g5g0;
import defpackage.gtq0;
import defpackage.hcr;
import defpackage.hk20;
import defpackage.im51;
import defpackage.jsq0;
import defpackage.kb20;
import defpackage.kd7;
import defpackage.ksq0;
import defpackage.kwx;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.oxn;
import defpackage.phe0;
import defpackage.po21;
import defpackage.rcc;
import defpackage.t3v;
import defpackage.tcc;
import defpackage.vvx;
import defpackage.y810;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.client.dto.LaunchParam$SupportedFeatures;

/* loaded from: classes10.dex */
public final class j {
    public final kb20 a;
    public final WifiManager b;
    public final oxn c;
    public final y810 d;
    public final im51 e;
    public final e3g0 f;
    public final com.yandex.go.superapp.orders.known.b g;
    public final g5g0 h;
    public final ecr i;
    public final po21 j;
    public final com.yandex.go.ads.prefetch.impl.a k;

    public j(kb20 kb20Var, WifiManager wifiManager, oxn oxnVar, y810 y810Var, im51 im51Var, e3g0 e3g0Var, com.yandex.go.superapp.orders.known.b bVar, g5g0 g5g0Var, ecr ecrVar, po21 po21Var, com.yandex.go.ads.prefetch.impl.a aVar) {
        this.a = kb20Var;
        this.b = wifiManager;
        this.c = oxnVar;
        this.d = y810Var;
        this.e = im51Var;
        this.f = e3g0Var;
        this.g = bVar;
        this.h = g5g0Var;
        this.i = ecrVar;
        this.j = po21Var;
        this.k = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x014a, code lost:
    
        if (r10 == r3) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0280 A[LOOP:0: B:41:0x027a->B:43:0x0280, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Set set, kd7 kd7Var, ContinuationImpl continuationImpl) {
        LaunchParamFactory$create$1 launchParamFactory$create$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        Set set2;
        kd7 kd7Var2;
        Object b;
        String str3;
        kd7 kd7Var3;
        Set set3;
        String str4;
        Object c;
        String str5;
        String str6;
        Set set4;
        kd7 kd7Var4;
        String str7;
        WifiInfo connectionInfo;
        String a;
        Object h;
        Set set5;
        Set set6;
        kd7 kd7Var5;
        String str8;
        boolean z;
        Iterator it;
        CoroutineSingletons coroutineSingletons2;
        Object a2;
        kwx kwxVar;
        Set set7;
        boolean z2;
        List list;
        String str9;
        jsq0 jsq0Var;
        String str10;
        kd7 kd7Var6;
        bwx bwxVar;
        ArrayList arrayList;
        String str11;
        String str12;
        if (continuationImpl instanceof LaunchParamFactory$create$1) {
            launchParamFactory$create$1 = (LaunchParamFactory$create$1) continuationImpl;
            int i2 = launchParamFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                launchParamFactory$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = launchParamFactory$create$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = launchParamFactory$create$1.label;
                g5g0 g5g0Var = this.h;
                if (i != 0) {
                    kotlin.b.b(obj);
                    str2 = str;
                    launchParamFactory$create$1.L$0 = str2;
                    set2 = set;
                    launchParamFactory$create$1.L$1 = set2;
                    kd7Var2 = kd7Var;
                    launchParamFactory$create$1.L$2 = kd7Var2;
                    launchParamFactory$create$1.label = 1;
                    b = g5g0Var.a.b(launchParamFactory$create$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            str4 = (String) launchParamFactory$create$1.L$3;
                            kd7Var3 = (kd7) launchParamFactory$create$1.L$2;
                            set3 = (Set) launchParamFactory$create$1.L$1;
                            str3 = (String) launchParamFactory$create$1.L$0;
                            kotlin.b.b(obj);
                            String str13 = (String) obj;
                            launchParamFactory$create$1.L$0 = str3;
                            launchParamFactory$create$1.L$1 = set3;
                            launchParamFactory$create$1.L$2 = kd7Var3;
                            launchParamFactory$create$1.L$3 = str4;
                            launchParamFactory$create$1.L$4 = str13;
                            launchParamFactory$create$1.label = 3;
                            this.i.getClass();
                            Object obj2 = com.google.firebase.installations.a.m;
                            c = gtq0.c(((com.google.firebase.installations.a) com.google.firebase.a.d().b(hcr.class)).c(), launchParamFactory$create$1);
                            if (c != coroutineSingletons) {
                                str5 = str13;
                                str6 = str4;
                                set4 = set3;
                                obj = c;
                                kd7Var4 = kd7Var3;
                                str7 = (String) obj;
                                connectionInfo = this.b.getConnectionInfo();
                                kb20 kb20Var = this.a;
                                String b2 = kb20Var.b();
                                a = kb20Var.a();
                                c4g0 a3 = this.f.a();
                                boolean z3 = a3.a;
                                Set set8 = a3.b;
                                Set set9 = a3.c;
                                launchParamFactory$create$1.L$0 = str3;
                                launchParamFactory$create$1.L$1 = set4;
                                launchParamFactory$create$1.L$2 = kd7Var4;
                                launchParamFactory$create$1.L$3 = str6;
                                launchParamFactory$create$1.L$4 = str5;
                                launchParamFactory$create$1.L$5 = str7;
                                launchParamFactory$create$1.L$6 = connectionInfo;
                                launchParamFactory$create$1.L$7 = b2;
                                launchParamFactory$create$1.L$8 = a;
                                launchParamFactory$create$1.L$9 = set8;
                                launchParamFactory$create$1.L$10 = set9;
                                launchParamFactory$create$1.Z$0 = z3;
                                launchParamFactory$create$1.label = 4;
                                h = ((ru.yandex.taxi.preorder.source.userposition.e) this.j).h(launchParamFactory$create$1);
                                if (h != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i == 3) {
                            String str14 = (String) launchParamFactory$create$1.L$4;
                            String str15 = (String) launchParamFactory$create$1.L$3;
                            kd7Var4 = (kd7) launchParamFactory$create$1.L$2;
                            Set set10 = (Set) launchParamFactory$create$1.L$1;
                            str3 = (String) launchParamFactory$create$1.L$0;
                            kotlin.b.b(obj);
                            str5 = str14;
                            str6 = str15;
                            set4 = set10;
                            str7 = (String) obj;
                            connectionInfo = this.b.getConnectionInfo();
                            kb20 kb20Var2 = this.a;
                            String b22 = kb20Var2.b();
                            a = kb20Var2.a();
                            c4g0 a32 = this.f.a();
                            boolean z32 = a32.a;
                            Set set82 = a32.b;
                            Set set92 = a32.c;
                            launchParamFactory$create$1.L$0 = str3;
                            launchParamFactory$create$1.L$1 = set4;
                            launchParamFactory$create$1.L$2 = kd7Var4;
                            launchParamFactory$create$1.L$3 = str6;
                            launchParamFactory$create$1.L$4 = str5;
                            launchParamFactory$create$1.L$5 = str7;
                            launchParamFactory$create$1.L$6 = connectionInfo;
                            launchParamFactory$create$1.L$7 = b22;
                            launchParamFactory$create$1.L$8 = a;
                            launchParamFactory$create$1.L$9 = set82;
                            launchParamFactory$create$1.L$10 = set92;
                            launchParamFactory$create$1.Z$0 = z32;
                            launchParamFactory$create$1.label = 4;
                            h = ((ru.yandex.taxi.preorder.source.userposition.e) this.j).h(launchParamFactory$create$1);
                            if (h != coroutineSingletons) {
                                set5 = set92;
                                obj = h;
                                set6 = set82;
                                kd7Var5 = kd7Var4;
                                str8 = b22;
                                z = z32;
                                mo21 mo21Var = (mo21) obj;
                                String str16 = str8;
                                this.e.getClass();
                                if (str6 != null) {
                                }
                                str6 = null;
                                if (str5 != null) {
                                }
                                str5 = null;
                                String a4 = this.d.a();
                                if (!evu0.J(str7)) {
                                }
                                Set set11 = set4;
                                WifiInfo wifiInfo = connectionInfo;
                                awx awxVar = new awx(mo21Var.a, mo21Var.b, (int) mo21Var.c);
                                String a5 = t3v.a();
                                if (wifiInfo == null) {
                                }
                                if (!evu0.J(str16)) {
                                }
                                bwx bwxVar2 = new bwx(r20, !evu0.J(str16) ? null : str16, (a != null || evu0.J(a)) ? null : a, wifiInfo == null ? wifiInfo.getMacAddress() : null, a5, awxVar, ((Boolean) this.c.b.getValue()).booleanValue());
                                Set set12 = set11;
                                ArrayList arrayList2 = new ArrayList(tcc.n(set12, 10));
                                it = set12.iterator();
                                while (it.hasNext()) {
                                }
                                mo21 mo21Var2 = mo21Var;
                                coroutineSingletons2 = coroutineSingletons;
                                bwx bwxVar3 = bwxVar2;
                                kwx kwxVar2 = new kwx(set6, set5, z);
                                Set set13 = phe0.a;
                                List list2 = (List) ((hk20) this.g.a.a.getValue()).c();
                                ListBuilder a6 = rcc.a();
                                a6.add(LaunchParam$SupportedFeatures.MULTIORDER);
                                a6.add(LaunchParam$SupportedFeatures.PENDING_ORDERS);
                                ListBuilder j = a6.j();
                                jsq0 jsq0Var2 = ksq0.a;
                                jsq0 jsq0Var3 = new jsq0(j);
                                if (wifiInfo == null) {
                                }
                                launchParamFactory$create$1.L$0 = str3;
                                launchParamFactory$create$1.L$1 = null;
                                launchParamFactory$create$1.L$2 = kd7Var5;
                                launchParamFactory$create$1.L$3 = null;
                                launchParamFactory$create$1.L$4 = null;
                                launchParamFactory$create$1.L$5 = null;
                                launchParamFactory$create$1.L$6 = null;
                                launchParamFactory$create$1.L$7 = null;
                                launchParamFactory$create$1.L$8 = null;
                                launchParamFactory$create$1.L$9 = null;
                                launchParamFactory$create$1.L$10 = null;
                                launchParamFactory$create$1.L$11 = null;
                                launchParamFactory$create$1.L$12 = str6;
                                launchParamFactory$create$1.L$13 = str5;
                                launchParamFactory$create$1.L$14 = a4;
                                launchParamFactory$create$1.L$15 = bwxVar3;
                                launchParamFactory$create$1.L$16 = arrayList2;
                                launchParamFactory$create$1.L$17 = kwxVar2;
                                launchParamFactory$create$1.L$18 = set13;
                                launchParamFactory$create$1.L$19 = list2;
                                launchParamFactory$create$1.L$20 = jsq0Var3;
                                launchParamFactory$create$1.Z$0 = z;
                                launchParamFactory$create$1.Z$1 = true;
                                launchParamFactory$create$1.label = 5;
                                a2 = this.k.a(mo21Var2, launchParamFactory$create$1, r7);
                                if (a2 != coroutineSingletons2) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z4 = launchParamFactory$create$1.Z$1;
                            jsq0 jsq0Var4 = (jsq0) launchParamFactory$create$1.L$20;
                            List list3 = (List) launchParamFactory$create$1.L$19;
                            Set set14 = (Set) launchParamFactory$create$1.L$18;
                            kwx kwxVar3 = (kwx) launchParamFactory$create$1.L$17;
                            ?? r6 = (List) launchParamFactory$create$1.L$16;
                            bwx bwxVar4 = (bwx) launchParamFactory$create$1.L$15;
                            String str17 = (String) launchParamFactory$create$1.L$14;
                            String str18 = (String) launchParamFactory$create$1.L$13;
                            String str19 = (String) launchParamFactory$create$1.L$12;
                            kd7 kd7Var7 = (kd7) launchParamFactory$create$1.L$2;
                            String str20 = (String) launchParamFactory$create$1.L$0;
                            kotlin.b.b(obj);
                            jsq0Var = jsq0Var4;
                            str10 = str20;
                            list = list3;
                            set7 = set14;
                            kwxVar = kwxVar3;
                            arrayList = r6;
                            bwxVar = bwxVar4;
                            str9 = str17;
                            str11 = str18;
                            z2 = z4;
                            str12 = str19;
                            kd7Var6 = kd7Var7;
                            return new ewx(str10, str12, str11, str9, bwxVar, arrayList, z2, jsq0Var, kwxVar, list, set7, (kotlinx.serialization.json.c) obj, kd7Var6);
                        }
                        z = launchParamFactory$create$1.Z$0;
                        set5 = (Set) launchParamFactory$create$1.L$10;
                        set6 = (Set) launchParamFactory$create$1.L$9;
                        a = (String) launchParamFactory$create$1.L$8;
                        String str21 = (String) launchParamFactory$create$1.L$7;
                        connectionInfo = (WifiInfo) launchParamFactory$create$1.L$6;
                        str7 = (String) launchParamFactory$create$1.L$5;
                        str5 = (String) launchParamFactory$create$1.L$4;
                        str6 = (String) launchParamFactory$create$1.L$3;
                        kd7 kd7Var8 = (kd7) launchParamFactory$create$1.L$2;
                        set4 = (Set) launchParamFactory$create$1.L$1;
                        String str22 = (String) launchParamFactory$create$1.L$0;
                        kotlin.b.b(obj);
                        kd7Var5 = kd7Var8;
                        str8 = str21;
                        str3 = str22;
                        mo21 mo21Var3 = (mo21) obj;
                        String str162 = str8;
                        this.e.getClass();
                        if (str6 != null || evu0.J(str6)) {
                            str6 = null;
                        }
                        if (str5 != null || evu0.J(str5)) {
                            str5 = null;
                        }
                        String a42 = this.d.a();
                        String str23 = !evu0.J(str7) ? null : str7;
                        Set set112 = set4;
                        WifiInfo wifiInfo2 = connectionInfo;
                        awx awxVar2 = new awx(mo21Var3.a, mo21Var3.b, (int) mo21Var3.c);
                        String a52 = t3v.a();
                        bwx bwxVar22 = new bwx(str23, !evu0.J(str162) ? null : str162, (a != null || evu0.J(a)) ? null : a, wifiInfo2 == null ? wifiInfo2.getMacAddress() : null, a52, awxVar2, ((Boolean) this.c.b.getValue()).booleanValue());
                        Set set122 = set112;
                        ArrayList arrayList22 = new ArrayList(tcc.n(set122, 10));
                        it = set122.iterator();
                        while (it.hasNext()) {
                            CachedTrackableAcceptance cachedTrackableAcceptance = (CachedTrackableAcceptance) it.next();
                            arrayList22.add(new vvx(cachedTrackableAcceptance.getD(), cachedTrackableAcceptance.getA(), cachedTrackableAcceptance.getC(), cachedTrackableAcceptance.getB()));
                            it = it;
                            coroutineSingletons = coroutineSingletons;
                            mo21Var3 = mo21Var3;
                            bwxVar22 = bwxVar22;
                        }
                        mo21 mo21Var22 = mo21Var3;
                        coroutineSingletons2 = coroutineSingletons;
                        bwx bwxVar32 = bwxVar22;
                        kwx kwxVar22 = new kwx(set6, set5, z);
                        Set set132 = phe0.a;
                        List list22 = (List) ((hk20) this.g.a.a.getValue()).c();
                        ListBuilder a62 = rcc.a();
                        a62.add(LaunchParam$SupportedFeatures.MULTIORDER);
                        a62.add(LaunchParam$SupportedFeatures.PENDING_ORDERS);
                        ListBuilder j2 = a62.j();
                        jsq0 jsq0Var22 = ksq0.a;
                        jsq0 jsq0Var32 = new jsq0(j2);
                        boolean z5 = wifiInfo2 == null;
                        launchParamFactory$create$1.L$0 = str3;
                        launchParamFactory$create$1.L$1 = null;
                        launchParamFactory$create$1.L$2 = kd7Var5;
                        launchParamFactory$create$1.L$3 = null;
                        launchParamFactory$create$1.L$4 = null;
                        launchParamFactory$create$1.L$5 = null;
                        launchParamFactory$create$1.L$6 = null;
                        launchParamFactory$create$1.L$7 = null;
                        launchParamFactory$create$1.L$8 = null;
                        launchParamFactory$create$1.L$9 = null;
                        launchParamFactory$create$1.L$10 = null;
                        launchParamFactory$create$1.L$11 = null;
                        launchParamFactory$create$1.L$12 = str6;
                        launchParamFactory$create$1.L$13 = str5;
                        launchParamFactory$create$1.L$14 = a42;
                        launchParamFactory$create$1.L$15 = bwxVar32;
                        launchParamFactory$create$1.L$16 = arrayList22;
                        launchParamFactory$create$1.L$17 = kwxVar22;
                        launchParamFactory$create$1.L$18 = set132;
                        launchParamFactory$create$1.L$19 = list22;
                        launchParamFactory$create$1.L$20 = jsq0Var32;
                        launchParamFactory$create$1.Z$0 = z;
                        launchParamFactory$create$1.Z$1 = true;
                        launchParamFactory$create$1.label = 5;
                        a2 = this.k.a(mo21Var22, launchParamFactory$create$1, z5);
                        if (a2 != coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        kwxVar = kwxVar22;
                        set7 = set132;
                        z2 = true;
                        list = list22;
                        str9 = a42;
                        jsq0Var = jsq0Var32;
                        str10 = str3;
                        kd7Var6 = kd7Var5;
                        bwxVar = bwxVar32;
                        arrayList = arrayList22;
                        str11 = str5;
                        str12 = str6;
                        obj = a2;
                        return new ewx(str10, str12, str11, str9, bwxVar, arrayList, z2, jsq0Var, kwxVar, list, set7, (kotlinx.serialization.json.c) obj, kd7Var6);
                    }
                    kd7 kd7Var9 = (kd7) launchParamFactory$create$1.L$2;
                    Set set15 = (Set) launchParamFactory$create$1.L$1;
                    String str24 = (String) launchParamFactory$create$1.L$0;
                    kotlin.b.b(obj);
                    b = obj;
                    str2 = str24;
                    kd7Var2 = kd7Var9;
                    set2 = set15;
                }
                String str25 = (String) b;
                launchParamFactory$create$1.L$0 = str2;
                launchParamFactory$create$1.L$1 = set2;
                launchParamFactory$create$1.L$2 = kd7Var2;
                launchParamFactory$create$1.L$3 = str25;
                launchParamFactory$create$1.label = 2;
                g5g0Var.getClass();
                if (coroutineSingletons != null) {
                    str3 = str2;
                    kd7Var3 = kd7Var2;
                    obj = null;
                    set3 = set2;
                    str4 = str25;
                    String str132 = (String) obj;
                    launchParamFactory$create$1.L$0 = str3;
                    launchParamFactory$create$1.L$1 = set3;
                    launchParamFactory$create$1.L$2 = kd7Var3;
                    launchParamFactory$create$1.L$3 = str4;
                    launchParamFactory$create$1.L$4 = str132;
                    launchParamFactory$create$1.label = 3;
                    this.i.getClass();
                    Object obj22 = com.google.firebase.installations.a.m;
                    c = gtq0.c(((com.google.firebase.installations.a) com.google.firebase.a.d().b(hcr.class)).c(), launchParamFactory$create$1);
                    if (c != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        launchParamFactory$create$1 = new LaunchParamFactory$create$1(this, continuationImpl);
        Object obj3 = launchParamFactory$create$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = launchParamFactory$create$1.label;
        g5g0 g5g0Var2 = this.h;
        if (i != 0) {
        }
        String str252 = (String) b;
        launchParamFactory$create$1.L$0 = str2;
        launchParamFactory$create$1.L$1 = set2;
        launchParamFactory$create$1.L$2 = kd7Var2;
        launchParamFactory$create$1.L$3 = str252;
        launchParamFactory$create$1.label = 2;
        g5g0Var2.getClass();
        if (coroutineSingletons != null) {
        }
        return coroutineSingletons;
    }
}
