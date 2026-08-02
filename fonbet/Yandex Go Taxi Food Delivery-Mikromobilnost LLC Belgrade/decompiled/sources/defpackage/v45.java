package defpackage;

import android.graphics.Rect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.f;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.d;
import com.yandex.go.masstransit.sdk.camera.view.MtQRCameraPreview;
import com.yandex.go.scooters.offers.v2.domain.b;
import com.yandex.go.shortcuts.dto.response.Overlay;
import com.yandex.go.shortcuts.impl.view.adapter.model.a;
import com.yandex.plus.home.feature.webviews.internal.stories.list.WebStoriesContainer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes5.dex */
public final /* synthetic */ class v45 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ v45(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.w = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onStoriesViewReady$lambda$6;
        int i = this.a;
        int i2 = 0;
        r4 = false;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        int i3 = this.b;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                a aVar = (a) obj3;
                bl4 bl4Var = (bl4) obj;
                String valueOf = String.valueOf(((Overlay) obj2).hashCode() + i3);
                HashMap hashMap = aVar.i;
                Object obj4 = hashMap.get(valueOf);
                Object obj5 = obj4;
                if (obj4 == null) {
                    Integer valueOf2 = Integer.valueOf(aVar.j.nextInt(7) - 3);
                    hashMap.put(valueOf, valueOf2);
                    obj5 = valueOf2;
                }
                return new ql4(bl4Var, ((Number) obj5).intValue());
            case 1:
                yx40 yx40Var = (yx40) obj2;
                double doubleValue = ((Double) obj).doubleValue();
                List list = ((lub) obj3).d;
                if (doubleValue != 1.0d) {
                    List<b1w> x0 = kotlin.collections.a.x0(list, new pub());
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    int i5 = 0;
                    for (b1w b1wVar : x0) {
                        int i6 = b1wVar.a;
                        int i7 = b1wVar.b;
                        i4 = x4e.c(i6, i5, i7, i4);
                        arrayList.add(new Pair(Integer.valueOf(i4), Integer.valueOf(i7)));
                        i5 = i6;
                    }
                    int a = m810.a(i4 * doubleValue);
                    int size = arrayList.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        if (i2 < size) {
                            Pair pair = (Pair) arrayList.get(i2);
                            int intValue = ((Number) pair.getFirst()).intValue();
                            int intValue2 = ((Number) pair.getSecond()).intValue();
                            if (intValue >= a) {
                                i3 = g8e.d(a, i9, intValue2, i8);
                            } else {
                                b1w b1wVar2 = (b1w) kotlin.collections.a.S(i2, x0);
                                i8 = b1wVar2 != null ? b1wVar2.a : i3;
                                i2++;
                                i9 = intValue;
                            }
                        } else {
                            i3 = i8;
                        }
                    }
                }
                yx40Var.setIntValue(i3);
                return zy11Var;
            case 2:
                boj0 boj0Var = (boj0) obj3;
                sls slsVar = (sls) obj2;
                s9e s9eVar = (s9e) obj;
                ((xe00) boj0Var.x).a.put(Integer.valueOf(i3), s9eVar);
                if (s9eVar != null) {
                    ((f4l0) boj0Var.b).e(i3, s9eVar);
                }
                slsVar.invoke();
                return zy11Var;
            case 3:
                bpl0 bpl0Var = (bpl0) obj3;
                tls tlsVar = (tls) obj2;
                u6y u6yVar = (u6y) obj;
                List list2 = bpl0Var.a;
                wls wlsVar = bpl0Var.b;
                ((m6y) u6yVar).f(list2.size(), wlsVar != null ? new qq5(6, wlsVar, list2) : null, new qc0(list2, 23), new androidx.compose.runtime.internal.a(-930734472, new m3x(list2, i3, tlsVar), true));
                return zy11Var;
            case 4:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                int intValue3 = ((Integer) obj).intValue();
                ((b) obj3).getClass();
                if (intValue3 == qfh0.scooters_component_option_insurance || intValue3 == qfh0.scooters_component_option_super_pass || intValue3 == qfh0.scooters_component_option_subscription || intValue3 == qfh0.scooters_component_option_active_packages) {
                    int i10 = ref$IntRef.element + 1;
                    ref$IntRef.element = i10;
                    if (i10 == i3) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                aip0 aip0Var = (aip0) obj3;
                o oVar = (o) obj2;
                o.a aVar2 = (o.a) obj;
                int intValue4 = aip0Var.a.a.getIntValue();
                if (intValue4 < 0) {
                    intValue4 = 0;
                }
                if (intValue4 <= i3) {
                    i3 = intValue4;
                }
                int i11 = -i3;
                boolean z2 = aip0Var.b;
                int i12 = z2 ? 0 : i11;
                if (!z2) {
                    i11 = 0;
                }
                aVar2.a = true;
                o.a.q(aVar2, oVar, i12, i11);
                aVar2.a = false;
                return zy11Var;
            case 6:
                o oVar2 = (o) obj3;
                androidx.compose.animation.core.a aVar3 = (androidx.compose.animation.core.a) obj2;
                o.a aVar4 = (o.a) obj;
                if (i3 != 0) {
                    o.a.x(aVar4, oVar2, 0, 0, new x1c(aVar3, 5), 4);
                }
                return zy11Var;
            case 7:
                MtQRCameraPreview mtQRCameraPreview = (MtQRCameraPreview) obj3;
                tls tlsVar2 = (tls) obj2;
                ggg0 ggg0Var = (ggg0) obj;
                int width = mtQRCameraPreview.getWidth() != 0 ? mtQRCameraPreview.getWidth() : 1080;
                int height = mtQRCameraPreview.getHeight() != 0 ? mtQRCameraPreview.getHeight() : 2080;
                float f = width / ggg0Var.c;
                float f2 = height / ggg0Var.d;
                Rect rect = ggg0Var.b;
                Rect rect2 = new Rect((int) (rect.left * f), (int) (rect.top * f2), (int) (rect.right * f), (int) (rect.bottom * f2));
                if (mtQRCameraPreview.getDefaultQrTargetRect().contains(rect2) || mtQRCameraPreview.isQrRectGrabbed()) {
                    Rect rect3 = new Rect(rect2);
                    rect3.set(rect3.left - i3, rect3.top - i3, rect3.right + i3, rect3.bottom + i3);
                    tlsVar2.invoke(new l1z0(ggg0Var.a, rect3));
                }
                return zy11Var;
            case 8:
                tf31 tf31Var = (tf31) obj3;
                o oVar3 = (o) obj2;
                o.a aVar5 = (o.a) obj;
                int i13 = tf31Var.b;
                yny0 yny0Var = tf31Var.a;
                vw01 vw01Var = tf31Var.c;
                ery0 ery0Var = (ery0) tf31Var.w.invoke();
                yny0Var.a(Orientation.Vertical, xlb1.b(aVar5, i13, vw01Var, ery0Var != null ? ery0Var.a : null, false, oVar3.a), i3, oVar3.b);
                o.a.o(aVar5, oVar3, 0, Math.round(-yny0Var.a.getFloatValue()));
                return zy11Var;
            case 9:
                final o9z0 o9z0Var = (o9z0) obj3;
                final fwi fwiVar = (fwi) obj2;
                u6y u6yVar2 = (u6y) obj;
                final int i14 = 0;
                for (Object obj6 : o9z0Var.c) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        scc.m();
                        throw null;
                    }
                    final hj31 hj31Var = (hj31) obj6;
                    final int i16 = this.b;
                    u6y.b(u6yVar2, null, new androidx.compose.runtime.internal.a(-2028526041, new zls() { // from class: pj31
                        /* JADX WARN: Code restructure failed: missing block: B:24:0x00dc, code lost:
                        
                            if (defpackage.jl40.l(r14.Q(), java.lang.Integer.valueOf(r10)) == false) goto L32;
                         */
                        @Override // defpackage.zls
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            long j;
                            boolean z3;
                            long j2;
                            boolean z4;
                            fid fidVar = (fid) obj8;
                            int intValue5 = ((Integer) obj9).intValue();
                            bts btsVar = (bts) fidVar;
                            boolean V = btsVar.V(intValue5 & 1, (intValue5 & 17) != 16);
                            dmw0 dmw0Var = btsVar.a;
                            if (V) {
                                Object Q = btsVar.Q();
                                o430 o430Var = did.a;
                                if (Q == o430Var) {
                                    Q = f.j(new y7m(0.0f));
                                    btsVar.o0(Q);
                                }
                                oz40 oz40Var = (oz40) Q;
                                hj31 hj31Var2 = hj31.this;
                                if (hj31Var2.c) {
                                    btsVar.e0(-1629255699);
                                    j = ((el51) btsVar.m(gl51.a)).f();
                                    btsVar.t(false);
                                } else {
                                    btsVar.e0(-1629172526);
                                    btsVar.t(false);
                                    j = ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.b.a;
                                }
                                long j3 = j;
                                c530 c530Var = c530.a;
                                f530 c = ljs0.c(c530Var, 1.0f);
                                fwi fwiVar2 = fwiVar;
                                boolean k = btsVar.k(fwiVar2);
                                Object Q2 = btsVar.Q();
                                if (k || Q2 == o430Var) {
                                    Q2 = new ooi(fwiVar2, oz40Var, 11);
                                    btsVar.o0(Q2);
                                }
                                f530 b = xm91.b(c, (tls) Q2);
                                lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar, 54);
                                int hashCode = Long.hashCode(btsVar.T);
                                r1b0 o = btsVar.o();
                                f530 d = androidx.compose.ui.b.d(btsVar, b);
                                ohd.G1.getClass();
                                sls slsVar2 = d.b;
                                if (dmw0Var == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar.i0();
                                if (btsVar.S) {
                                    btsVar.n(slsVar2);
                                } else {
                                    btsVar.r0();
                                }
                                wls wlsVar2 = d.f;
                                qje.W(btsVar, wlsVar2, a2);
                                wls wlsVar3 = d.e;
                                qje.W(btsVar, wlsVar3, o);
                                wls wlsVar4 = d.g;
                                if (btsVar.S) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                b64.z(hashCode, btsVar, hashCode, wlsVar4);
                                wls wlsVar5 = d.d;
                                qje.W(btsVar, wlsVar5, d);
                                ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.b.e(hj31Var2, btsVar, 0);
                                f530 e = ljs0.e(ljs0.q(an91.o(c530Var, 4.0f, 0.0f, 4.0f, 0.0f, 10), 56.0f), Math.max(((y7m) oz40Var.getValue()).a, 56.0f));
                                z910 d2 = pi6.d(x4c.y, false);
                                int hashCode2 = Long.hashCode(btsVar.T);
                                r1b0 o2 = btsVar.o();
                                f530 d3 = androidx.compose.ui.b.d(btsVar, e);
                                btsVar.i0();
                                if (btsVar.S) {
                                    btsVar.n(slsVar2);
                                } else {
                                    btsVar.r0();
                                }
                                qje.W(btsVar, wlsVar2, d2);
                                qje.W(btsVar, wlsVar3, o2);
                                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                                    b64.z(hashCode2, btsVar, hashCode2, wlsVar4);
                                }
                                qje.W(btsVar, wlsVar5, d3);
                                int i17 = i14;
                                boolean z5 = i17 == 0 ? z3 : false;
                                boolean z6 = i17 == o9z0Var.c.size() + (-1) ? z3 : false;
                                float f3 = ((y7m) oz40Var.getValue()).a;
                                int i18 = i16;
                                ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.b.a(i17, i18, z5, z6, j3, f3, btsVar, 6);
                                if (i17 == i18) {
                                    j2 = j3;
                                    z4 = z3;
                                } else {
                                    j2 = j3;
                                    z4 = false;
                                }
                                ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.b.d(0, j2, btsVar, hj31Var2.d, z4);
                                boolean z7 = z3;
                                btsVar.t(z7);
                                ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.b.f(hj31Var2, btsVar, 0);
                                btsVar.t(z7);
                            } else {
                                btsVar.Y();
                            }
                            return zy11.a;
                        }
                    }, true), 3);
                    i14 = i15;
                }
                return zy11Var;
            default:
                onStoriesViewReady$lambda$6 = WebStoriesContainer.onStoriesViewReady$lambda$6(i3, (tls) obj3, (WebStoriesContainer) obj2, ((Integer) obj).intValue());
                return onStoriesViewReady$lambda$6;
        }
    }

    public /* synthetic */ v45(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.w = obj2;
    }

    public /* synthetic */ v45(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = i;
    }
}
