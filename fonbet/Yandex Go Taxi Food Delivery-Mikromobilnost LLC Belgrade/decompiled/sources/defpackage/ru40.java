package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteFabState;
import com.yandex.mapkit.geometry.BoundingBox;

/* loaded from: classes11.dex */
public final /* synthetic */ class ru40 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MultimodalRouteFabState b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ BoundingBox w;

    public /* synthetic */ ru40(MultimodalRouteFabState multimodalRouteFabState, tls tlsVar, BoundingBox boundingBox) {
        this.b = multimodalRouteFabState;
        this.c = tlsVar;
        this.w = boundingBox;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        BoundingBox boundingBox = this.w;
        tls tlsVar = this.c;
        MultimodalRouteFabState multimodalRouteFabState = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, c530.a);
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
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    int i2 = tu40.a[multimodalRouteFabState.ordinal()];
                    o430 o430Var = did.a;
                    if (i2 == 1) {
                        btsVar.e0(-1411391112);
                        boolean k = btsVar.k(tlsVar) | btsVar.e(boundingBox);
                        Object Q = btsVar.Q();
                        if (k || Q == o430Var) {
                            Q = new su40(tlsVar, boundingBox, 0);
                            btsVar.o0(Q);
                        }
                        cra1.b(0, btsVar, (sls) Q, null);
                        btsVar.t(false);
                    } else {
                        if (i2 != 2) {
                            throw unr0.y(-461172732, btsVar, false);
                        }
                        btsVar.e0(-1411189860);
                        boolean k2 = btsVar.k(tlsVar);
                        Object Q2 = btsVar.Q();
                        if (k2 || Q2 == o430Var) {
                            Q2 = new s140(22, tlsVar);
                            btsVar.o0(Q2);
                        }
                        ora1.a(0, btsVar, (sls) Q2, null);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                num.getClass();
                uqb1.a(multimodalRouteFabState, tlsVar, boundingBox, fidVar, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ ru40(MultimodalRouteFabState multimodalRouteFabState, tls tlsVar, BoundingBox boundingBox, int i) {
        this.b = multimodalRouteFabState;
        this.c = tlsVar;
        this.w = boundingBox;
    }
}
