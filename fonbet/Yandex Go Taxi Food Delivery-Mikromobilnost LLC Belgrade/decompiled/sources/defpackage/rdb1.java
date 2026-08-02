package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.compose.icon.IconSpotStyle;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;

/* loaded from: classes11.dex */
public abstract class rdb1 {
    public static final void a(ibp0 ibp0Var, nvi0 nvi0Var, f530 f530Var, IconSpotStyle iconSpotStyle, wls wlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        IconSpotStyle iconSpotStyle2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1302889823);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(nvi0Var) ? 32 : 16;
        }
        int i3 = i2 | 28032;
        int i4 = 1;
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            IconSpotStyle iconSpotStyle3 = IconSpotStyle.Fill;
            wlsVar = wwg.S(-364719674, true, new ofj(ibp0Var, i4), btsVar);
            int i5 = i3 >> 3;
            int i6 = i5 & 7182;
            ywy ywyVar = (ywy) ffb1.f(nvi0Var, btsVar, i5 & 14).getValue();
            boolean l = jl40.l(ywyVar, wwy.a);
            c530 c530Var = c530.a;
            if (l) {
                btsVar.e0(-576192361);
                s8y.a(ibp0Var, c530Var, btsVar, (i3 & 14) | ((i3 >> 3) & 112), 0);
                btsVar.t(false);
                iconSpotStyle2 = iconSpotStyle3;
            } else if (ywyVar instanceof xwy) {
                btsVar.e0(-576123541);
                iconSpotStyle2 = iconSpotStyle3;
                ceb1.a(((xwy) ywyVar).a, an91.m(c530Var, deb1.b(ibp0Var.c()) ? 0.0f : 8.0f, 0.0f, 2), ibp0Var.c() == SlotSize.XS ? IconSpotSize.S : IconSpotSize.M, iconSpotStyle2, btsVar, (0 & 14) | (i3 & 7168));
                btsVar.t(false);
            } else {
                iconSpotStyle2 = iconSpotStyle3;
                if (!jl40.l(ywyVar, vwy.a)) {
                    throw unr0.y(1505431128, btsVar, false);
                }
                btsVar.e0(-576049575);
                wlsVar.invoke(btsVar, Integer.valueOf((i6 >> 9) & 14));
                btsVar.t(false);
            }
            iconSpotStyle = iconSpotStyle2;
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        wls wlsVar2 = wlsVar;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0((Object) ibp0Var, (Object) nvi0Var, f530Var2, (Object) iconSpotStyle, (Object) wlsVar2, i, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(fqs0 fqs0Var, f530 f530Var, yg ygVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        yg ygVar2;
        int i4;
        f530 f530Var3;
        yg ygVar3;
        aii0 v;
        Pair pair;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1394539540);
        int i5 = i | (btsVar.k(fqs0Var) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i5 |= btsVar.k(f530Var2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i4 = i5 | 384;
                ygVar2 = ygVar;
            } else {
                ygVar2 = ygVar;
                i4 = i5 | (btsVar.k(ygVar2) ? 256 : 128);
            }
            if (btsVar.V(i4 & 1, (i4 & 147) == 146)) {
                btsVar.Y();
                f530Var3 = f530Var2;
                ygVar3 = ygVar2;
            } else {
                f530 f530Var4 = i6 != 0 ? c530.a : f530Var2;
                yg ygVar4 = i3 != 0 ? null : ygVar2;
                lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, f530Var4);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, a);
                qje.W(btsVar, d.e, o);
                wls wlsVar = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar);
                }
                qje.W(btsVar, d.d, d);
                int i7 = gqs0.a[fqs0Var.c.ordinal()];
                if (i7 == 1) {
                    pair = new Pair(x4c.G, Integer.valueOf(NavigationBarView.ITEM_GRAVITY_START_CENTER));
                } else if (i7 == 2) {
                    pair = new Pair(x4c.H, 17);
                } else {
                    if (i7 != 3) {
                        w511.b();
                        return;
                    }
                    pair = new Pair(x4c.I, 8388629);
                }
                it1 it1Var = (it1) pair.getFirst();
                int intValue = ((Number) pair.getSecond()).intValue();
                CharSequence charSequence = fqs0Var.a;
                CharSequence charSequence2 = fqs0Var.b;
                boolean z = ygVar4 != null ? ygVar4.a : false;
                String str = ygVar4 != null ? ygVar4.b : null;
                w4a1 w4a1Var = fqs0Var.e;
                a aVar = null;
                boolean z2 = z;
                String str2 = str;
                w4a1 w4a1Var2 = fqs0Var.f;
                qj4 qj4Var = fqs0Var.d;
                if (qj4Var == null) {
                    btsVar.e0(-1699130872);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1699130871);
                    aVar = wwg.S(1798595358, true, new e0s0(qj4Var), btsVar);
                    btsVar.t(false);
                }
                zgb1.b(charSequence, charSequence2, null, it1Var, intValue, z2, str2, w4a1Var, w4a1Var2, aVar, btsVar, 0, 4);
                btsVar.t(true);
                f530Var3 = f530Var4;
                ygVar3 = ygVar4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new v4(fqs0Var, f530Var3, ygVar3, i, i2, 25);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        if (btsVar.V(i4 & 1, (i4 & 147) == 146)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static void c(CaptureRequest.Builder builder, ug70 ug70Var) {
        b48 a = a48.b(ug70Var).a();
        for (x34 x34Var : a.h()) {
            CaptureRequest.Key key = (CaptureRequest.Key) x34Var.c;
            try {
                builder.set(key, a.f(x34Var));
            } catch (IllegalArgumentException unused) {
                sgb1.d("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void d(CaptureRequest.Builder builder, int i, zy2 zy2Var) {
        Map map;
        if (i == 3 && zy2Var.a) {
            HashMap hashMap = new HashMap();
            hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            map = Collections.unmodifiableMap(hashMap);
        } else {
            if (i != 4) {
                zy2Var.getClass();
            } else if (zy2Var.b) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                map = Collections.unmodifiableMap(hashMap2);
            }
            map = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : map.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest e(s38 s38Var, CameraDevice cameraDevice, HashMap hashMap, boolean z, zy2 zy2Var) {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice != null) {
            ArrayList arrayList = s38Var.a;
            int i = s38Var.c;
            ug70 ug70Var = s38Var.b;
            TreeMap treeMap = ug70Var.a;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                Surface surface = (Surface) hashMap.get((DeferrableSurface) it.next());
                if (surface == null) {
                    ny61.g("DeferrableSurface not in configuredSurfaceMap");
                    return null;
                }
                arrayList2.add(surface);
            }
            if (!arrayList2.isEmpty()) {
                ap7 ap7Var = s38Var.h;
                if (i == 5 && ap7Var != null && (ap7Var.m() instanceof TotalCaptureResult)) {
                    sgb1.g(3, "Camera2CaptureRequestBuilder");
                    createCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) ap7Var.m());
                } else {
                    sgb1.g(3, "Camera2CaptureRequestBuilder");
                    if (i == 5) {
                        createCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
                    } else {
                        createCaptureRequest = cameraDevice.createCaptureRequest(i);
                    }
                }
                d(createCaptureRequest, i, zy2Var);
                Range a = s38Var.a();
                if (!a.equals(lru0.a)) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, a);
                }
                a.toString();
                sgb1.g(3, "Camera2CaptureRequestBuilder");
                Integer g = g(s38Var);
                if (g != null) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, g);
                }
                sgb1.g(3, "Camera2CaptureRequestBuilder");
                x34 x34Var = s38.i;
                if (treeMap.containsKey(x34Var)) {
                    createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) ug70Var.f(x34Var));
                }
                x34 x34Var2 = s38.j;
                if (treeMap.containsKey(x34Var2)) {
                    createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) ug70Var.f(x34Var2)).byteValue()));
                }
                c(createCaptureRequest, ug70Var);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    createCaptureRequest.addTarget((Surface) it2.next());
                }
                createCaptureRequest.setTag(s38Var.g);
                return createCaptureRequest.build();
            }
        }
        return null;
    }

    public static CaptureRequest f(s38 s38Var, CameraDevice cameraDevice, zy2 zy2Var) {
        if (cameraDevice == null) {
            return null;
        }
        int i = s38Var.c;
        sgb1.g(3, "Camera2CaptureRequestBuilder");
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(i);
        d(createCaptureRequest, i, zy2Var);
        Range a = s38Var.a();
        if (!a.equals(lru0.a)) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, a);
        }
        a.toString();
        sgb1.g(3, "Camera2CaptureRequestBuilder");
        c(createCaptureRequest, s38Var.b);
        return createCaptureRequest.build();
    }

    public static Integer g(s38 s38Var) {
        if (s38Var.c() == 1 || s38Var.d() == 1) {
            return 0;
        }
        if (s38Var.c() == 2) {
            return 2;
        }
        return s38Var.d() == 2 ? 1 : null;
    }
}
