package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class suf {
    public int a = -1;
    public boolean b = true;
    public Object c = q5b.a;

    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Set] */
    public static final void c(suf sufVar, jvf jvfVar, List list, int i, int i2, Function1 function1) {
        ssg.a(3, "BlockPrefetcher", "Prefetcher state: " + jvfVar, null);
        int i3 = jvfVar.a;
        Integer num = jvfVar.b;
        if (num != null) {
            int intValue = num.intValue();
            int i4 = i3 - i2;
            if (i4 < 0) {
                i4 = 0;
            }
            int i5 = intValue - i2;
            if (i5 < 0) {
                i5 = 0;
            }
            int i6 = jvfVar.d;
            int i7 = sufVar.a;
            boolean z = i4 > i7 ? true : i4 < i7 ? false : sufVar.b;
            sufVar.b = z;
            sufVar.a = i4;
            if (!z) {
                i4 = Math.max(0, i4 - i);
            }
            if (z) {
                i5 = Integer.min(i6 - 1, i5 + i);
            }
            IntRange intRange = new IntRange(i4, i5, 1);
            mnp mnpVar = new mnp();
            int i8 = intRange.b;
            if (i4 <= i8) {
                while (true) {
                    rrf rrfVar = (rrf) CollectionsKt.S(list, i4);
                    if (rrfVar != null) {
                        mnpVar.add(rrfVar.getId());
                    }
                    if (i4 == i8) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            mnp a = uop.a(mnpVar);
            ssg.a(3, "BlockPrefetcher", "Prefetcher Range(inc=" + z + "): " + intRange + StringUtil.SPACE + a, null);
            function1.invoke(new orf(intRange, a, sufVar.c));
            sufVar.c = a;
        }
    }

    public final void a(fvf fvfVar, aqi aqiVar, int i, Function1 function1, hq5 hq5Var, int i2) {
        int i3;
        aqi aqiVar2;
        Function1 function12;
        fvf fvfVar2 = fvfVar;
        fvfVar2.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1228682636);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(fvfVar2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            aqiVar2 = aqiVar;
            i3 |= oq5Var.f(aqiVar2) ? 32 : 16;
        } else {
            aqiVar2 = aqiVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function12 = function1;
            i3 |= oq5Var.h(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        int i4 = i3 | 221184;
        if ((1572864 & i2) == 0) {
            i4 |= oq5Var.h(this) ? 1048576 : 524288;
        }
        if ((599187 & i4) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean h = ((i4 & 14) == 4) | ((458752 & i4) == 131072) | ((i4 & 112) == 32) | oq5Var.h(this) | ((i4 & 896) == 256) | ((57344 & i4) == 16384) | ((i4 & 7168) == 2048);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                zy3 zy3Var = new zy3(fvfVar2, aqiVar2, this, i, function12, (Continuation) null, 4);
                fvfVar2 = fvfVar2;
                oq5Var.k0(zy3Var);
                K = zy3Var;
            }
            gld.y(fvfVar2, null, (Function2) K, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq(this, fvfVar2, aqiVar, i, function1, i2);
        }
    }

    public final void b(fvf fvfVar, List list, Function1 function1, int i, hq5 hq5Var, int i2) {
        Function1 function12;
        list.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-865070175);
        int i3 = (oq5Var.f(fvfVar) ? 4 : 2) | i2 | (oq5Var.f(list) ? 32 : 16);
        if ((i2 & 3072) == 0) {
            function12 = function1;
            i3 |= oq5Var.h(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.d(i) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i4 = i3 | 196608 | (oq5Var.h(this) ? 1048576 : 524288);
        if ((599187 & i4) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean h = ((i4 & 14) == 4) | oq5Var.h(this) | ((i4 & 112) == 32) | ((57344 & i4) == 16384) | ((i4 & 7168) == 2048);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                zy3 zy3Var = new zy3(fvfVar, this, list, i, function12, (Continuation) null, 5);
                oq5Var.k0(zy3Var);
                K = zy3Var;
            }
            gld.x(fvfVar, null, list, (Function2) K, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq(this, fvfVar, list, function1, i, i2, 15);
        }
    }
}
