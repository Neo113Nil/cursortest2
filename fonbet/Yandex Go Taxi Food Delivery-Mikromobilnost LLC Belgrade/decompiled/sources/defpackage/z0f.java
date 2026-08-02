package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.List;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;

/* loaded from: classes5.dex */
public final class z0f extends o15 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public z0f(a aVar) {
        super("counter");
        this.c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        int i3;
        final ?? r4;
        boolean z;
        Object obj;
        int i4 = this.b;
        o430 o430Var = did.a;
        final int i5 = 0;
        switch (i4) {
            case 0:
                bts btsVar = (bts) fidVar;
                btsVar.g0(340708235);
                if ((i & 6) == 0) {
                    i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= btsVar.e(this) ? 32 : 16;
                }
                if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
                    btsVar.Y();
                } else {
                    if (!(n351Var instanceof mze)) {
                        v = btsVar.v();
                        if (v != null) {
                            final int i6 = 0;
                            wlsVar = new wls(this) { // from class: y0f
                                public final /* synthetic */ z0f b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i7 = i6;
                                    zy11 zy11Var = zy11.a;
                                    int i8 = i;
                                    n351 n351Var2 = n351Var;
                                    z0f z0fVar = this.b;
                                    fid fidVar2 = (fid) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i7) {
                                        case 0:
                                            z0fVar.e(n351Var2, fidVar2, vng.O(i8 | 1));
                                            break;
                                        default:
                                            z0fVar.e(n351Var2, fidVar2, vng.O(i8 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v.d = wlsVar;
                            return;
                        }
                        return;
                    }
                    mze mzeVar = (mze) n351Var;
                    boolean e = btsVar.e(this);
                    Object Q = btsVar.Q();
                    if (e || Q == o430Var) {
                        Q = new dye(2, this);
                        btsVar.o0(Q);
                    }
                    wsb1.a(mzeVar, (tls) Q, btsVar, i2 & 14);
                }
                v = btsVar.v();
                if (v != null) {
                    final int i7 = 1;
                    wlsVar = new wls(this) { // from class: y0f
                        public final /* synthetic */ z0f b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i72 = i7;
                            zy11 zy11Var = zy11.a;
                            int i8 = i;
                            n351 n351Var2 = n351Var;
                            z0f z0fVar = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i72) {
                                case 0:
                                    z0fVar.e(n351Var2, fidVar2, vng.O(i8 | 1));
                                    break;
                                default:
                                    z0fVar.e(n351Var2, fidVar2, vng.O(i8 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                    return;
                }
                return;
            default:
                bts btsVar2 = (bts) fidVar;
                btsVar2.g0(1967269101);
                if ((i & 6) == 0) {
                    i3 = (btsVar2.k(n351Var) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= btsVar2.e(this) ? 32 : 16;
                }
                if (!btsVar2.V(i3 & 1, (i3 & 19) != 18)) {
                    r4 = 1;
                    btsVar2.Y();
                } else {
                    if (!(n351Var instanceof od21)) {
                        aii0 v2 = btsVar2.v();
                        if (v2 != null) {
                            v2.d = new wls(this) { // from class: rd21
                                public final /* synthetic */ z0f b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i8 = i5;
                                    zy11 zy11Var = zy11.a;
                                    int i9 = i;
                                    n351 n351Var2 = n351Var;
                                    z0f z0fVar = this.b;
                                    fid fidVar2 = (fid) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i8) {
                                        case 0:
                                            z0fVar.e(n351Var2, fidVar2, vng.O(i9 | 1));
                                            break;
                                        default:
                                            z0fVar.e(n351Var2, fidVar2, vng.O(i9 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    od21 od21Var = (od21) n351Var;
                    List list = od21Var.d;
                    boolean z2 = !list.isEmpty();
                    Object Q2 = btsVar2.Q();
                    Object obj2 = Q2;
                    if (Q2 == o430Var) {
                        of11 of11Var = new of11(24);
                        btsVar2.o0(of11Var);
                        obj2 = of11Var;
                    }
                    f530 c = rx21.c(c530.a, z2, (tls) obj2);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = b.d(btsVar2, c);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, d);
                    qje.W(btsVar2, d.e, o);
                    wls wlsVar2 = d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar2, hashCode, wlsVar2);
                    }
                    qje.W(btsVar2, d.d, d2);
                    int i8 = i3;
                    dlb0 dlb0Var = new dlb0(list, 2);
                    PhotocommentsMode photocommentsMode = PhotocommentsMode.MUTABLE;
                    tkb0 tkb0Var = od21Var.e;
                    l690 l690Var = od21Var.f;
                    int i9 = i8 & 14;
                    boolean e2 = btsVar2.e(this) | (i9 == 4);
                    Object Q3 = btsVar2.Q();
                    Object obj3 = Q3;
                    if (e2 || Q3 == o430Var) {
                        dl01 dl01Var = new dl01(20, this, n351Var);
                        btsVar2.o0(dl01Var);
                        obj3 = dl01Var;
                    }
                    tls tlsVar = (tls) obj3;
                    boolean e3 = btsVar2.e(this) | (i9 == 4);
                    Object Q4 = btsVar2.Q();
                    Object obj4 = Q4;
                    if (e3 || Q4 == o430Var) {
                        final int i10 = 0;
                        sls slsVar2 = new sls(this) { // from class: sd21
                            public final /* synthetic */ z0f b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i11 = i10;
                                zy11 zy11Var = zy11.a;
                                n351 n351Var2 = n351Var;
                                z0f z0fVar = this.b;
                                switch (i11) {
                                    case 0:
                                        ((kcz0) z0fVar.c).r(((od21) n351Var2).g, "Opened");
                                        break;
                                    default:
                                        ((kcz0) z0fVar.c).r(((od21) n351Var2).g, "Uploaded");
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar2.o0(slsVar2);
                        obj4 = slsVar2;
                    }
                    sls slsVar3 = (sls) obj4;
                    boolean e4 = btsVar2.e(this) | (i9 == 4);
                    Object Q5 = btsVar2.Q();
                    if (e4 || Q5 == o430Var) {
                        z = true;
                        final boolean z3 = true ? 1 : 0;
                        sls slsVar4 = new sls(this) { // from class: sd21
                            public final /* synthetic */ z0f b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i11 = z3;
                                zy11 zy11Var = zy11.a;
                                n351 n351Var2 = n351Var;
                                z0f z0fVar = this.b;
                                switch (i11) {
                                    case 0:
                                        ((kcz0) z0fVar.c).r(((od21) n351Var2).g, "Opened");
                                        break;
                                    default:
                                        ((kcz0) z0fVar.c).r(((od21) n351Var2).g, "Uploaded");
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar2.o0(slsVar4);
                        obj = slsVar4;
                    } else {
                        z = true;
                        obj = Q5;
                    }
                    ru.yandex.taxi.logistics.sdk.photocomments.a.b(dlb0Var, photocommentsMode, tkb0Var, null, l690Var, tlsVar, slsVar3, (sls) obj, btsVar2, 56, 8);
                    btsVar2.t(z);
                    r4 = z;
                }
                aii0 v3 = btsVar2.v();
                if (v3 != null) {
                    v3.d = new wls(this) { // from class: rd21
                        public final /* synthetic */ z0f b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj22, Object obj32) {
                            int i82 = r4;
                            zy11 zy11Var = zy11.a;
                            int i92 = i;
                            n351 n351Var2 = n351Var;
                            z0f z0fVar = this.b;
                            fid fidVar2 = (fid) obj22;
                            ((Integer) obj32).getClass();
                            switch (i82) {
                                case 0:
                                    z0fVar.e(n351Var2, fidVar2, vng.O(i92 | 1));
                                    break;
                                default:
                                    z0fVar.e(n351Var2, fidVar2, vng.O(i92 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
        }
    }

    public z0f(kcz0 kcz0Var) {
        super("uploaded-images-preview");
        this.c = kcz0Var;
    }
}
