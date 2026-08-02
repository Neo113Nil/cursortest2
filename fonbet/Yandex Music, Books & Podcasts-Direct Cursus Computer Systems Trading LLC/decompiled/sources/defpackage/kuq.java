package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class kuq {
    public static final float a = 48;
    public static final float b = 144;
    public static final act c = new act(100, (kya) null, 6);

    public static final void a(final Function1 function1, final gq4 gq4Var, final fq4 fq4Var, final aqi aqiVar, final float f, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-644648461);
        int i2 = i | (oq5Var.h(function1) ? 4 : 2) | (oq5Var.f(gq4Var) ? 32 : 16) | (oq5Var.f(fq4Var) ? 256 : 128) | (oq5Var.c(f) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((57344 & i2) == 16384) | ((i2 & 896) == 256);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                Function0 function0 = new Function0() { // from class: xtq
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        gq4 gq4Var2 = gq4.this;
                        float floatValue = (((Number) gq4Var2.m()).floatValue() - ((Number) gq4Var2.g()).floatValue()) / 1000;
                        float floatValue2 = ((Number) function1.invoke(Float.valueOf(f))).floatValue();
                        aqi aqiVar2 = aqiVar;
                        if (Math.abs(floatValue2 - ((Number) aqiVar2.getValue()).floatValue()) > floatValue) {
                            if (fq4Var.b((Comparable) aqiVar2.getValue())) {
                                aqiVar2.setValue(Float.valueOf(floatValue2));
                            }
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(function0);
                K = function0;
            }
            gld.D((Function0) K, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ytq(function1, gq4Var, fq4Var, aqiVar, f, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    /* JADX WARN: Type inference failed for: r15v1, types: [hq5, oq5] */
    /* JADX WARN: Type inference failed for: r3v18, types: [c5b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final float f, final Function1 function1, final yci yciVar, rtq rtqVar, kgs kgsVar, boolean z, gq4 gq4Var, int i, Function1 function12, final lr7 lr7Var, hq5 hq5Var, final int i2, final int i3) {
        rtq rtqVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Function1 function13;
        int i9;
        int i10;
        rtq rtqVar3;
        gq4 fq4Var;
        final int i11;
        kgs kgsVar2;
        Function1 function14;
        int i12;
        rtq rtqVar4;
        boolean z2;
        Object K;
        Object obj;
        ArrayList arrayList;
        gq4 gq4Var2;
        Object obj2;
        Function0 function0;
        boolean z3;
        Function1 function15;
        float rint;
        final rtq rtqVar5;
        oq5 oq5Var;
        final boolean z4;
        final gq4 gq4Var3;
        final kgs kgsVar3;
        final int i13;
        function1.getClass();
        ?? r15 = (oq5) hq5Var;
        r15.b0(1221738218);
        int i14 = (r15.c(f) ? 4 : 2) | i2 | (r15.h(function1) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i14 |= r15.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 8) == 0) {
            rtqVar2 = rtqVar;
            if (r15.f(rtqVar2)) {
                i4 = 2048;
                int i15 = i14 | i4;
                int i16 = 745472 | i15;
                i5 = i3 & 128;
                if (i5 == 0) {
                    i7 = i15 | 13328384;
                    i6 = i;
                } else {
                    i6 = i;
                    i7 = i16 | (r15.d(i6) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                    i9 = i7 | 100663296;
                    function13 = function12;
                } else {
                    function13 = function12;
                    i9 = i7 | (r15.h(function13) ? 67108864 : 33554432);
                }
                i10 = i9 | 805306368;
                char c2 = r15.f(lr7Var) ? (char) 4 : (char) 2;
                if ((i10 & 306783379) != 306783378 && (c2 & 3) == 2 && r15.z()) {
                    r15.S();
                    kgsVar3 = kgsVar;
                    z4 = z;
                    gq4Var3 = gq4Var;
                    i13 = i6;
                    rtqVar5 = rtqVar2;
                    oq5Var = r15;
                } else {
                    r15.U();
                    Function0 function02 = null;
                    if ((i2 & 1) != 0 || r15.y()) {
                        if ((i3 & 8) == 0) {
                            rtqVar3 = new rtq(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 127);
                            i10 &= -7169;
                        } else {
                            rtqVar3 = rtqVar2;
                        }
                        kgs kgsVar4 = kgs.a;
                        fq4Var = new fq4(0.0f, 1.0f);
                        int i17 = i10 & (-3670017);
                        i11 = i5 == 0 ? 0 : i;
                        if (i8 != 0) {
                            function13 = null;
                        }
                        Function1 function16 = function13;
                        kgsVar2 = kgsVar4;
                        function14 = function16;
                        i12 = i17;
                        rtqVar4 = rtqVar3;
                        z2 = true;
                    } else {
                        r15.S();
                        if ((i3 & 8) != 0) {
                            i10 &= -7169;
                        }
                        int i18 = i10 & (-3670017);
                        z2 = z;
                        i11 = i;
                        i12 = i18;
                        rtqVar4 = rtqVar2;
                        function14 = function13;
                        kgsVar2 = kgsVar;
                        fq4Var = gq4Var;
                    }
                    r15.q();
                    r15.Z(1250934929);
                    K = r15.K();
                    obj = gq5.a;
                    if (K == obj) {
                        K = vz1.h(r15);
                    }
                    final uoi uoiVar = (uoi) K;
                    final boolean z5 = z2;
                    r15.p(false);
                    if (i11 >= 0) {
                        xq0.x("steps should be >= 0");
                        return;
                    }
                    final aqi o0 = szf.o0(function1, r15);
                    boolean z6 = (29360128 & i12) == 8388608;
                    Object K2 = r15.K();
                    if (z6 || K2 == obj) {
                        if (i11 == 0) {
                            arrayList = c5b.a;
                            gq4Var2 = fq4Var;
                        } else {
                            int i19 = i11 + 2;
                            arrayList = new ArrayList(i19);
                            gq4Var2 = fq4Var;
                            int i20 = 0;
                            while (i20 < i19) {
                                arrayList.add(Float.valueOf(i20 / (i11 + 1)));
                                i20++;
                                i19 = i19;
                            }
                        }
                        r15.k0(arrayList);
                        obj2 = arrayList;
                    } else {
                        gq4Var2 = fq4Var;
                        obj2 = K2;
                    }
                    final List list = (List) obj2;
                    if (function14 == null) {
                        r15.Z(1251232931);
                        z3 = false;
                        r15.p(false);
                        function0 = null;
                    } else {
                        r15.Z(1251232932);
                        boolean f2 = r15.f(function14);
                        Object K3 = r15.K();
                        if (f2 || K3 == obj) {
                            K3 = new pl3(5, function14);
                            r15.k0(K3);
                        }
                        function0 = (Function0) K3;
                        z3 = false;
                        r15.p(false);
                    }
                    if (function14 == null) {
                        r15.Z(1251346050);
                    } else {
                        r15.Z(1251346051);
                        boolean f3 = r15.f(function14);
                        Object K4 = r15.K();
                        if (f3 || K4 == obj) {
                            K4 = new pl3(6, function14);
                            r15.k0(K4);
                        }
                        function02 = (Function0) K4;
                        z3 = false;
                    }
                    r15.p(z3);
                    agr agrVar = yre.a;
                    yci f4 = yciVar.f(MinimumInteractiveModifier.a);
                    float f5 = rtqVar4.c * 2;
                    yci k = d.k(f4, f5, f5, 0.0f, 0.0f, 12);
                    final float c3 = yhn.c(f, ((Number) gq4Var2.g()).floatValue(), ((Number) gq4Var2.m()).floatValue());
                    float floatValue = ((Number) gq4Var2.m()).floatValue() - ((Number) gq4Var2.g()).floatValue();
                    if (floatValue <= 0.0f) {
                        function15 = function14;
                        rint = c3;
                    } else {
                        function15 = function14;
                        rint = (((float) Math.rint((c3 - ((Number) gq4Var2.g()).floatValue()) / r3)) * (floatValue / 100)) + ((Number) gq4Var2.g()).floatValue();
                    }
                    final kgs kgsVar5 = kgsVar2;
                    final Function0 function03 = function0;
                    final gq4 gq4Var4 = gq4Var2;
                    Function1 function17 = new Function1() { // from class: wtq
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            jfp jfpVar = (jfp) obj3;
                            jfpVar.getClass();
                            if (!z5) {
                                wfp.c(jfpVar);
                            }
                            wfp.p(jfpVar, new g54(gq4Var4, i11, c3, function1, function03));
                            return Unit.a;
                        }
                    };
                    int i21 = i11;
                    yci k2 = a.k(nfp.b(nfp.b(k, false, function17), true, new jvm(rint, gq4Var4, i21)), z5, uoiVar);
                    final Function0 function04 = function02;
                    rtqVar5 = rtqVar4;
                    wn5 C = ild.C(-597512000, new pyc() { // from class: utq
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            poi poiVar;
                            rtq rtqVar6 = rtqVar5;
                            float f6 = rtqVar6.c;
                            c cVar = (c) obj3;
                            hq5 hq5Var2 = (hq5) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            cVar.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                            }
                            if ((intValue & 19) == 18) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    return Unit.a;
                                }
                            }
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            final boolean z7 = oq5Var3.j(es5.n) == xof.b;
                            final float i22 = ga6.i(cVar.b);
                            uqn uqnVar = new uqn();
                            uqn uqnVar2 = new uqn();
                            jx7 jx7Var = (jx7) oq5Var3.j(es5.h);
                            uqnVar.a = Math.max(i22 - jx7Var.n0(f6), 0.0f);
                            uqnVar2.a = Math.min(jx7Var.n0(f6), uqnVar.a);
                            Object K5 = oq5Var3.K();
                            Object obj6 = gq5.a;
                            if (K5 == obj6) {
                                K5 = tlm.f(gld.R(g.a, oq5Var3), oq5Var3);
                            }
                            mm6 mm6Var = ((fs5) K5).a;
                            Object K6 = oq5Var3.K();
                            gq4 gq4Var5 = gq4.this;
                            float f7 = f;
                            if (K6 == obj6) {
                                float floatValue2 = ((Number) gq4Var5.g()).floatValue();
                                float floatValue3 = ((Number) gq4Var5.m()).floatValue() - floatValue2;
                                K6 = tlm.h(fxf.I(uqnVar2.a, uqnVar.a, yhn.c(floatValue3 == 0.0f ? 0.0f : (f7 - floatValue2) / floatValue3, 0.0f, 1.0f)), oq5Var3);
                            }
                            final poi poiVar2 = (poi) K6;
                            Object K7 = oq5Var3.K();
                            if (K7 == obj6) {
                                K7 = tlm.h(0.0f, oq5Var3);
                            }
                            poi poiVar3 = (poi) K7;
                            boolean c4 = oq5Var3.c(uqnVar2.a) | oq5Var3.c(uqnVar.a) | oq5Var3.f(gq4Var5);
                            Object K8 = oq5Var3.K();
                            if (c4 || K8 == obj6) {
                                poiVar = poiVar3;
                                K8 = new stq(new m10(poiVar2, poiVar, uqnVar2, uqnVar, o0, gq4Var5, 3));
                                oq5Var3.k0(K8);
                            } else {
                                poiVar = poiVar3;
                            }
                            final stq stqVar = (stq) K8;
                            boolean f8 = oq5Var3.f(gq4Var5) | oq5Var3.c(uqnVar2.a) | oq5Var3.c(uqnVar.a);
                            Object K9 = oq5Var3.K();
                            if (f8 || K9 == obj6) {
                                K9 = new fuq(gq4Var5, uqnVar2, uqnVar);
                                oq5Var3.k0(K9);
                            }
                            kuq.a((Function1) ((h9f) K9), gq4Var5, new fq4(uqnVar2.a, uqnVar.a), poiVar2, f7, oq5Var3, 3072);
                            float f9 = uqnVar2.a;
                            float f10 = uqnVar.a;
                            List list2 = list;
                            final aqi f11 = kuq.f(mm6Var, poiVar2, list2, f9, f10, stqVar, function03, oq5Var3);
                            Object f12 = kuq.f(mm6Var, poiVar2, list2, uqnVar2.a, uqnVar.a, stqVar, function04, oq5Var3);
                            final boolean z8 = z5;
                            final uoi uoiVar2 = uoiVar;
                            final poi poiVar4 = poiVar;
                            pyc pycVar = new pyc() { // from class: ztq
                                @Override // defpackage.pyc
                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                    yci yciVar2 = (yci) obj7;
                                    ((Integer) obj9).getClass();
                                    yciVar2.getClass();
                                    oq5 oq5Var4 = (oq5) ((hq5) obj8);
                                    oq5Var4.Z(1901605215);
                                    if (z8) {
                                        oq5Var4.Z(102381472);
                                        Object K10 = oq5Var4.K();
                                        kjn kjnVar = gq5.a;
                                        if (K10 == kjnVar) {
                                            K10 = tlm.f(gld.R(g.a, oq5Var4), oq5Var4);
                                        }
                                        mm6 mm6Var2 = ((fs5) K10).a;
                                        float f13 = i22;
                                        Float valueOf = Float.valueOf(f13);
                                        boolean z9 = z7;
                                        Boolean valueOf2 = Boolean.valueOf(z9);
                                        cpa cpaVar = stqVar;
                                        Object[] objArr = {cpaVar, uoiVar2, valueOf, valueOf2};
                                        boolean g = oq5Var4.g(z9) | oq5Var4.c(f13);
                                        aqi aqiVar = poiVar4;
                                        boolean f14 = g | oq5Var4.f(aqiVar);
                                        sdr sdrVar = poiVar2;
                                        boolean f15 = f14 | oq5Var4.f(sdrVar) | oq5Var4.h(mm6Var2) | oq5Var4.h(cpaVar);
                                        aqi aqiVar2 = f11;
                                        boolean f16 = f15 | oq5Var4.f(aqiVar2);
                                        Object K11 = oq5Var4.K();
                                        if (f16 || K11 == kjnVar) {
                                            K11 = new juq(z9, f13, aqiVar, sdrVar, mm6Var2, cpaVar, aqiVar2, null);
                                            oq5Var4.k0(K11);
                                        }
                                        ffm ffmVar = eur.a;
                                        yciVar2 = yciVar2.f(new SuspendPointerInputElement(null, null, objArr, new dur((Function2) K11), 3));
                                        oq5Var4.p(false);
                                    } else {
                                        oq5Var4.Z(103405991);
                                        oq5Var4.p(false);
                                    }
                                    oq5Var4.p(false);
                                    return yciVar2;
                                }
                            };
                            vci vciVar = vci.a;
                            yci r = vnj.r(vciVar, "com.yandex.music.shared.design.api.components.slider.sliderTapModifier", new Object[0], pycVar);
                            bxj bxjVar = bxj.b;
                            boolean booleanValue = ((Boolean) stqVar.b.getValue()).booleanValue();
                            boolean f13 = oq5Var3.f(f12);
                            Object K10 = oq5Var3.K();
                            if (f13 || K10 == obj6) {
                                K10 = new ibi(f12, null, 1);
                                oq5Var3.k0(K10);
                            }
                            yci a2 = zoa.a(vciVar, stqVar, bxjVar, z8, uoiVar2, booleanValue, null, (pyc) K10, z7, 32);
                            float c5 = yhn.c(f7, ((Number) gq4Var5.g()).floatValue(), ((Number) gq4Var5.m()).floatValue());
                            float floatValue4 = ((Number) gq4Var5.g()).floatValue();
                            float floatValue5 = ((Number) gq4Var5.m()).floatValue() - floatValue4;
                            kuq.c(z8, yhn.c(floatValue5 == 0.0f ? 0.0f : (c5 - floatValue4) / floatValue5, 0.0f, 1.0f), list2, lr7Var, rtqVar6, kgsVar5, uqnVar.a - uqnVar2.a, uoiVar2, r.f(a2), oq5Var3, 0);
                            return Unit.a;
                        }
                    }, r15);
                    oq5Var = r15;
                    bg3.a(k2, null, false, C, oq5Var, 3072, 6);
                    z4 = z5;
                    gq4Var3 = gq4Var4;
                    kgsVar3 = kgsVar5;
                    function13 = function15;
                    i13 = i21;
                }
                xmn r = oq5Var.r();
                if (r != null) {
                    final rtq rtqVar6 = rtqVar5;
                    final Function1 function18 = function13;
                    r.d = new Function2() { // from class: vtq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            kuq.b(f, function1, yciVar, rtqVar6, kgsVar3, z4, gq4Var3, i13, function18, lr7Var, (hq5) obj3, rvf.R(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            rtqVar2 = rtqVar;
        }
        i4 = 1024;
        int i152 = i14 | i4;
        int i162 = 745472 | i152;
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i10 = i9 | 805306368;
        if (r15.f(lr7Var)) {
        }
        if ((i10 & 306783379) != 306783378) {
        }
        r15.U();
        Function0 function022 = null;
        if ((i2 & 1) != 0) {
        }
        if ((i3 & 8) == 0) {
        }
        kgs kgsVar42 = kgs.a;
        fq4Var = new fq4(0.0f, 1.0f);
        int i172 = i10 & (-3670017);
        if (i5 == 0) {
        }
        if (i8 != 0) {
        }
        Function1 function162 = function13;
        kgsVar2 = kgsVar42;
        function14 = function162;
        i12 = i172;
        rtqVar4 = rtqVar3;
        z2 = true;
        r15.q();
        r15.Z(1250934929);
        K = r15.K();
        obj = gq5.a;
        if (K == obj) {
        }
        final uoi uoiVar2 = (uoi) K;
        final boolean z52 = z2;
        r15.p(false);
        if (i11 >= 0) {
        }
    }

    public static final void c(final boolean z, final float f, final List list, final lr7 lr7Var, final rtq rtqVar, final kgs kgsVar, final float f2, final uoi uoiVar, final yci yciVar, hq5 hq5Var, final int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1114970502);
        int i2 = i | (oq5Var2.g(z) ? 4 : 2) | (oq5Var2.c(f) ? 32 : 16) | (oq5Var2.f(list) ? 256 : 128) | (oq5Var2.f(lr7Var) ? 2048 : 1024) | (oq5Var2.f(rtqVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.d(kgsVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.c(f2) ? 1048576 : 524288) | (oq5Var2.f(uoiVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var2.f(yciVar) ? 67108864 : 33554432);
        if ((i2 & 38347923) == 38347922 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            float f3 = rtqVar.c;
            float f4 = 2;
            yci q = d.q(yciVar, b, 0.0f, 0.0f, Math.max(a, (rtqVar.d + f3) * f4), 6);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
            float n0 = jx7Var.n0(rtqVar.a);
            float n02 = jx7Var.n0(rtqVar.b);
            oq5Var = oq5Var2;
            float n03 = jx7Var.n0(f3);
            float d0 = jx7Var.d0(f2) * f;
            int i4 = i2 << 12;
            e(d.c(vci.a, 1.0f), lr7Var, kgsVar, z, f, list, n03, n0, n02, oq5Var, ((i2 >> 6) & 112) | 24582 | ((i2 >> 9) & 896) | ((i2 << 9) & 7168) | (i4 & 458752) | (i4 & 3670016));
            int i5 = i2 << 3;
            d(d0, uoiVar, lr7Var, rtqVar, z, f3 * f4, oq5Var, ((i2 >> 12) & 7168) | 54 | (57344 & i5) | (i5 & 458752) | ((i2 << 18) & 3670016));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(z, f, list, lr7Var, rtqVar, kgsVar, f2, uoiVar, yciVar, i) { // from class: buq
                public final /* synthetic */ boolean a;
                public final /* synthetic */ float b;
                public final /* synthetic */ List c;
                public final /* synthetic */ lr7 d;
                public final /* synthetic */ rtq e;
                public final /* synthetic */ kgs f;
                public final /* synthetic */ float g;
                public final /* synthetic */ uoi h;
                public final /* synthetic */ yci i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    kuq.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final float f, final uoi uoiVar, final lr7 lr7Var, final rtq rtqVar, final boolean z, final float f2, hq5 hq5Var, final int i) {
        int i2;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(506930654);
        int i3 = i & 6;
        b bVar = b.a;
        if (i3 == 0) {
            i2 = (oq5Var.f(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        yci yciVar = vci.a;
        if (i4 == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.c(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(uoiVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(lr7Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.f(rtqVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.g(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var.c(f2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((4793491 & i2) == 4793490 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z3 = (i2 & 896) == 256;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z3 || K == kjnVar) {
                K = new vp(2, f);
                oq5Var.k0(K);
            }
            yci a2 = androidx.compose.ui.platform.a.a(bVar.a(androidx.compose.ui.graphics.a.a(yciVar, (Function1) K), b2c.e), "slider_thumb");
            kfh d = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new s2r();
                oq5Var.k0(K2);
            }
            s2r s2rVar = (s2r) K2;
            boolean z4 = (i2 & 7168) == 2048;
            Object K3 = oq5Var.K();
            if (z4 || K3 == kjnVar) {
                K3 = new dl3(uoiVar, s2rVar, null, 2);
                oq5Var.k0(K3);
            }
            gld.w(oq5Var, uoiVar, (Function2) K3);
            float f3 = !s2rVar.isEmpty() ? rtqVar.g : rtqVar.f;
            oq5Var.Z(-691797498);
            yci o = d.o(yciVar, f2, f2);
            float f4 = rtqVar.e;
            float f5 = rtqVar.d;
            yci l2 = a.l(e.a(o, uoiVar, eeo.a(f4, 4, 0L, false)), uoiVar);
            if (!z) {
                f3 = 0;
            }
            tgo tgoVar = ugo.a;
            yci d0 = y1g.d0(l2, f3, tgoVar, false, 24);
            oq5Var.Z(1055851280);
            aqi o0 = szf.o0(new d85(z ? lr7Var.a : lr7Var.b), oq5Var);
            oq5Var.p(false);
            yci b2 = a.b(d0, ((d85) o0.getValue()).a, tgoVar);
            if (Float.compare(f5, 0) > 0) {
                oq5Var.Z(660340804);
                aqi o02 = szf.o0(new d85(z ? lr7Var.c : lr7Var.d), oq5Var);
                z2 = false;
                oq5Var.p(false);
                yciVar = c3x.y(f5, ((d85) o02.getValue()).a, yciVar, tgoVar);
            } else {
                z2 = false;
            }
            yci f6 = b2.f(yciVar);
            oq5Var.p(z2);
            u1g.l(oq5Var, f6);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: cuq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kuq.d(f, uoiVar, lr7Var, rtqVar, z, f2, (hq5) obj, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final yci yciVar, final lr7 lr7Var, final kgs kgsVar, final boolean z, final float f, final List list, final float f2, final float f3, final float f4, hq5 hq5Var, final int i) {
        int i2;
        float f5;
        List list2;
        float f6;
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1367566346);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(lr7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.d(kgsVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.c(0.0f) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            f5 = f;
            i2 |= oq5Var.c(f5) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            f5 = f;
        }
        if ((1572864 & i) == 0) {
            list2 = list;
            i2 |= oq5Var.f(list2) ? 1048576 : 524288;
        } else {
            list2 = list;
        }
        if ((12582912 & i) == 0) {
            f6 = f2;
            i2 |= oq5Var.c(f6) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            f6 = f2;
        }
        if ((100663296 & i) == 0) {
            i2 |= oq5Var.c(f3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= oq5Var.c(f4) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 306783379) == 306783378 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            final aqi b2 = lr7Var.b(z, false, oq5Var);
            final aqi b3 = lr7Var.b(z, true, oq5Var);
            final aqi a2 = lr7Var.a(z, false, oq5Var);
            final aqi a3 = lr7Var.a(z, true, oq5Var);
            boolean f7 = ((234881024 & i2) == 67108864) | ((i2 & 29360128) == 8388608) | oq5Var.f(b2) | ((458752 & i2) == 131072) | ((57344 & i2) == 16384) | oq5Var.f(b3) | ((((1879048192 & i2) ^ 805306368) > 536870912 && oq5Var.c(f4)) || (i2 & 805306368) == 536870912) | ((3670016 & i2) == 1048576) | ((i2 & 896) == 256) | oq5Var.f(a2) | oq5Var.f(a3);
            Object K = oq5Var.K();
            if (f7 || K == gq5.a) {
                i3 = i2;
                final List list3 = list2;
                final float f8 = f5;
                final float f9 = f6;
                Function1 function1 = new Function1() { // from class: duq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j;
                        long j2;
                        jpa jpaVar = (jpa) obj;
                        jpaVar.getClass();
                        boolean z2 = jpaVar.getLayoutDirection() == xof.b;
                        float f10 = f9 / 2.0f;
                        long i4 = swf.i(f10, enj.f(jpaVar.y0()));
                        long i5 = swf.i(nmq.d(jpaVar.e()) - f10, enj.f(jpaVar.y0()));
                        if (z2) {
                            j2 = i4;
                            j = i5;
                        } else {
                            j = i4;
                            j2 = j;
                        }
                        if (!z2) {
                            j2 = i5;
                        }
                        long j3 = ((d85) b2.getValue()).a;
                        float f11 = f3;
                        jpaVar.s(j3, j, j2, (r18 & 8) != 0 ? 0.0f : f11, (r18 & 16) != 0 ? 0 : 1);
                        long j4 = j;
                        long j5 = j2;
                        float e = enj.e(j4);
                        float e2 = enj.e(j5) - enj.e(j4);
                        float f12 = f8;
                        jpaVar.s(((d85) b3.getValue()).a, swf.i(((enj.e(j5) - enj.e(j4)) * 0.0f) + enj.e(j4), enj.f(jpaVar.y0())), swf.i((e2 * f12) + e, enj.f(jpaVar.y0())), (r18 & 8) != 0 ? 0.0f : f4, (r18 & 16) != 0 ? 0 : 1);
                        List list4 = list3;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : list4) {
                            float floatValue = ((Number) obj2).floatValue();
                            Boolean valueOf = Boolean.valueOf(floatValue > f12 || floatValue < 0.0f);
                            Object obj3 = linkedHashMap.get(valueOf);
                            if (obj3 == null) {
                                obj3 = new ArrayList();
                                linkedHashMap.put(valueOf, obj3);
                            }
                            ((List) obj3).add(obj2);
                        }
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list5 = (List) entry.getValue();
                            int ordinal = kgsVar.ordinal();
                            aqi aqiVar = a2;
                            aqi aqiVar2 = a3;
                            if (ordinal != 0) {
                                boolean z3 = true;
                                if (ordinal != 1) {
                                    b6e.s();
                                    return null;
                                }
                                Iterator it = (booleanValue ? CollectionsKt.M(list5) : CollectionsKt.L(list5, 1)).iterator();
                                while (it.hasNext()) {
                                    float e3 = enj.e(swf.W(j4, j5, ((Number) it.next()).floatValue()));
                                    float f13 = f11 / 2;
                                    jpaVar.s(((d85) (booleanValue ? aqiVar : aqiVar2).getValue()).a, swf.i(e3, enj.f(jpaVar.y0()) - f13), swf.i(e3, enj.f(jpaVar.y0()) + f13), (r18 & 8) != 0 ? 0.0f : 0.0f, (r18 & 16) != 0 ? 0 : 1);
                                    aqiVar = aqiVar;
                                    aqiVar2 = aqiVar2;
                                    z3 = z3;
                                }
                            } else {
                                ArrayList arrayList = new ArrayList(list5.size());
                                int size = list5.size();
                                for (int i6 = 0; i6 < size; i6++) {
                                    arrayList.add(new enj(swf.i(enj.e(swf.W(j4, j5, ((Number) list5.get(i6)).floatValue())), enj.f(jpaVar.y0()))));
                                }
                                jpaVar.u0(arrayList, ((d85) (booleanValue ? aqiVar : aqiVar2).getValue()).a, f11);
                            }
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(function1);
                K = function1;
            } else {
                i3 = i2;
            }
            ksw.j(i3 & 14, oq5Var, yciVar, (Function1) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: euq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kuq.e(yci.this, lr7Var, kgsVar, z, f, list, f2, f3, f4, (hq5) obj, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final aqi f(final mm6 mm6Var, final poi poiVar, final List list, final float f, final float f2, final stq stqVar, final Function0 function0, oq5 oq5Var) {
        boolean f3 = oq5Var.f(list) | oq5Var.c(f) | oq5Var.c(f2) | oq5Var.h(mm6Var) | oq5Var.h(stqVar) | oq5Var.f(function0);
        Object K = oq5Var.K();
        if (f3 || K == gq5.a) {
            Function1 function1 = new Function1() { // from class: auq
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object obj2;
                    float floatValue = ((Float) obj).floatValue();
                    float e = cjc.this.e();
                    List list2 = list;
                    boolean isEmpty = list2.isEmpty();
                    float f4 = f;
                    float f5 = f2;
                    if (isEmpty) {
                        obj2 = null;
                    } else {
                        obj2 = list2.get(0);
                        float abs = Math.abs(fxf.I(f4, f5, ((Number) obj2).floatValue()) - e);
                        int i = 1;
                        int size = list2.size() - 1;
                        if (1 <= size) {
                            while (true) {
                                Object obj3 = list2.get(i);
                                float abs2 = Math.abs(fxf.I(f4, f5, ((Number) obj3).floatValue()) - e);
                                if (Float.compare(abs, abs2) > 0) {
                                    obj2 = obj3;
                                    abs = abs2;
                                }
                                if (i == size) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                    Float f6 = (Float) obj2;
                    float I = f6 != null ? fxf.I(f4, f5, f6.floatValue()) : e;
                    stq stqVar2 = stqVar;
                    Function0 function02 = function0;
                    if (e != I) {
                        x97.y(mm6Var, null, null, new huq(stqVar2, e, I, floatValue, function02, null), 3);
                    } else if (!((Boolean) stqVar2.b.getValue()).booleanValue() && function02 != null) {
                        function02.invoke();
                    }
                    return Unit.a;
                }
            };
            oq5Var.k0(function1);
            K = function1;
        }
        return szf.o0((Function1) K, oq5Var);
    }
}
