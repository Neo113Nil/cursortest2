package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.comment;

import androidx.compose.ui.node.d;
import defpackage.a151;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.lmc;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.n351;
import defpackage.o430;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.wls;
import defpackage.x4c;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.comment.b;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.e;

/* loaded from: classes5.dex */
public final class b extends a151 {
    public final e b;

    public b(e eVar) {
        super("comment-key");
        this.b = eVar;
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1135618348);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(this) : btsVar.e(this) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof lmc)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: bnc
                        public final /* synthetic */ b b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            b bVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    bVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    bVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
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
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d);
            int i5 = i2;
            lmc lmcVar = (lmc) n351Var;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                CommentWidget$Content$2$1$1 commentWidget$Content$2$1$1 = new CommentWidget$Content$2$1$1(1, this.b, e.class, "onTextChanged", "onTextChanged(Ljava/lang/String;)V", 0);
                btsVar.o0(commentWidget$Content$2$1$1);
                Q = commentWidget$Content$2$1$1;
            }
            tls tlsVar = (tls) ((tfx) Q);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                CommentWidget$Content$2$2$1 commentWidget$Content$2$2$1 = new CommentWidget$Content$2$2$1(0, this.b, e.class, "onCommentClicked", "onCommentClicked()V", 0);
                btsVar.o0(commentWidget$Content$2$2$1);
                Q2 = commentWidget$Content$2$2$1;
            }
            sls slsVar2 = (sls) ((tfx) Q2);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                CommentWidget$Content$2$3$1 commentWidget$Content$2$3$1 = new CommentWidget$Content$2$3$1(0, this.b, e.class, "onCommentShown", "onCommentShown()V", 0);
                btsVar.o0(commentWidget$Content$2$3$1);
                Q3 = commentWidget$Content$2$3$1;
            }
            a.a(lmcVar, tlsVar, slsVar2, (sls) ((tfx) Q3), btsVar, (i5 & 14) | 3504);
            ly3.B(c530Var, 16.0f, btsVar, true);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: bnc
                public final /* synthetic */ b b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    b bVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            bVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            bVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
