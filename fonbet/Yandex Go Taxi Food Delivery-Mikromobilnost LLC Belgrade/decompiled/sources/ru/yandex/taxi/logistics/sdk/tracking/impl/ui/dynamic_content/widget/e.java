package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget;

import defpackage.a151;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.d6n;
import defpackage.did;
import defpackage.dlb0;
import defpackage.f530;
import defpackage.fid;
import defpackage.gv90;
import defpackage.jl40;
import defpackage.klb0;
import defpackage.n351;
import defpackage.o430;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rx21;
import defpackage.skb0;
import defpackage.sls;
import defpackage.t8j;
import defpackage.tls;
import defpackage.urm;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.e;

/* loaded from: classes5.dex */
public final class e extends a151 {
    public final klb0 b;

    public e(klb0 klb0Var) {
        super("dynamic-content-photos-key");
        this.b = klb0Var;
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        final int i3;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1767794453);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(this) : btsVar.e(this) ? 32 : 16;
        }
        int i4 = 18;
        final int i5 = 0;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            i3 = 1;
            btsVar.Y();
        } else {
            if (!(n351Var instanceof d6n)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: e6n
                        public final /* synthetic */ e b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            zy11 zy11Var = zy11.a;
                            int i7 = i;
                            n351 n351Var2 = n351Var;
                            e eVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    eVar.a(n351Var2, fidVar2, vng.O(i7 | 1));
                                    break;
                                default:
                                    eVar.a(n351Var2, fidVar2, vng.O(i7 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && btsVar.e(this)));
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new DynamicContentPhotosWidget$Content$2$1(this, n351Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            d6n d6nVar = (d6n) n351Var;
            List list = d6nVar.c;
            boolean z2 = !list.isEmpty();
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new urm(17);
                btsVar.o0(Q2);
            }
            f530 c = rx21.c(c530.a, z2, (tls) Q2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar2 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            dlb0 dlb0Var = new dlb0(list, 2);
            gv90 gv90Var = d6nVar.d;
            boolean z3 = d6nVar.e;
            PhotocommentsMode photocommentsMode = PhotocommentsMode.IMMUTABLE;
            skb0 skb0Var = new skb0();
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new t8j(i4, this, n351Var);
                btsVar.o0(Q3);
            }
            i3 = 1;
            ru.yandex.taxi.logistics.sdk.photocomments.a.k(dlb0Var, gv90Var, z3, photocommentsMode, skb0Var, null, null, (tls) Q3, null, null, btsVar, 12585992, 864);
            btsVar.t(true);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: e6n
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i3;
                    zy11 zy11Var = zy11.a;
                    int i7 = i;
                    n351 n351Var2 = n351Var;
                    e eVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            eVar.a(n351Var2, fidVar2, vng.O(i7 | 1));
                            break;
                        default:
                            eVar.a(n351Var2, fidVar2, vng.O(i7 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
