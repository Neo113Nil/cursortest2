package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.data.ButtonType;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.ui.b;

/* loaded from: classes5.dex */
public final class vyc extends a151 {
    public final /* synthetic */ int b = 3;
    public final Object c;

    public vyc(ax90 ax90Var) {
        super("payment-key");
        this.c = ax90Var;
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        bts btsVar;
        aii0 v;
        wls wlsVar;
        int i3;
        bts btsVar2;
        aii0 v2;
        wls wlsVar2;
        int i4;
        aii0 v3;
        wls wlsVar3;
        int i5;
        aii0 v4;
        wls wlsVar4;
        int i6 = this.b;
        o430 o430Var = did.a;
        int i7 = 18;
        int i8 = 2;
        final int i9 = 0;
        final int i10 = 1;
        switch (i6) {
            case 0:
                bts btsVar3 = (bts) fidVar;
                btsVar3.g0(-544765312);
                if ((i & 6) == 0) {
                    i2 = i | (btsVar3.k(n351Var) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= (i & 64) == 0 ? btsVar3.k(this) : btsVar3.e(this) ? 32 : 16;
                }
                if (!btsVar3.V(i2 & 1, (i2 & 19) != 18)) {
                    btsVar = btsVar3;
                    btsVar.Y();
                } else if (!(n351Var instanceof ryc)) {
                    v = btsVar3.v();
                    if (v != null) {
                        wlsVar = new wls(this) { // from class: tyc
                            public final /* synthetic */ vyc b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i11 = i9;
                                zy11 zy11Var = zy11.a;
                                int i12 = i;
                                n351 n351Var2 = n351Var;
                                vyc vycVar = this.b;
                                fid fidVar2 = (fid) obj;
                                ((Integer) obj2).getClass();
                                switch (i11) {
                                    case 0:
                                        vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                        break;
                                    default:
                                        vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        v.d = wlsVar;
                        break;
                    }
                } else {
                    ryc rycVar = (ryc) n351Var;
                    Object Q = btsVar3.Q();
                    if (Q == o430Var) {
                        Q = new tls(this) { // from class: uyc
                            public final /* synthetic */ vyc b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i11 = i9;
                                zy11 zy11Var = zy11.a;
                                vyc vycVar = this.b;
                                az6 az6Var = (az6) obj;
                                switch (i11) {
                                    case 0:
                                        ((qyc) vycVar.c).b(az6Var, ButtonType.PRIMARY);
                                        break;
                                    default:
                                        ((qyc) vycVar.c).b(az6Var, ButtonType.SECONDARY);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar3.o0(Q);
                    }
                    tls tlsVar = (tls) Q;
                    Object Q2 = btsVar3.Q();
                    if (Q2 == o430Var) {
                        Q2 = new tls(this) { // from class: uyc
                            public final /* synthetic */ vyc b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i11 = i10;
                                zy11 zy11Var = zy11.a;
                                vyc vycVar = this.b;
                                az6 az6Var = (az6) obj;
                                switch (i11) {
                                    case 0:
                                        ((qyc) vycVar.c).b(az6Var, ButtonType.PRIMARY);
                                        break;
                                    default:
                                        ((qyc) vycVar.c).b(az6Var, ButtonType.SECONDARY);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar3.o0(Q2);
                    }
                    btsVar = btsVar3;
                    yob1.b(rycVar, tlsVar, (tls) Q2, null, btsVar, (i2 & 14) | 432);
                }
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: tyc
                        public final /* synthetic */ vyc b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = i10;
                            zy11 zy11Var = zy11.a;
                            int i12 = i;
                            n351 n351Var2 = n351Var;
                            vyc vycVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i11) {
                                case 0:
                                    vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                    break;
                                default:
                                    vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                break;
            case 1:
                bts btsVar4 = (bts) fidVar;
                btsVar4.g0(1951683615);
                if ((i & 6) == 0) {
                    i3 = i | (btsVar4.k(n351Var) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= (i & 64) == 0 ? btsVar4.k(this) : btsVar4.e(this) ? 32 : 16;
                }
                if (!btsVar4.V(i3 & 1, (i3 & 19) != 18)) {
                    btsVar2 = btsVar4;
                    btsVar2.Y();
                } else if (!(n351Var instanceof j6n)) {
                    v2 = btsVar4.v();
                    if (v2 != null) {
                        wlsVar2 = new wls(this) { // from class: k6n
                            public final /* synthetic */ vyc b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i11 = i9;
                                zy11 zy11Var = zy11.a;
                                int i12 = i;
                                n351 n351Var2 = n351Var;
                                vyc vycVar = this.b;
                                fid fidVar2 = (fid) obj;
                                ((Integer) obj2).getClass();
                                switch (i11) {
                                    case 0:
                                        vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                        break;
                                    default:
                                        vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        v2.d = wlsVar2;
                        break;
                    }
                } else {
                    j6n j6nVar = (j6n) n351Var;
                    Object Q3 = btsVar4.Q();
                    if (Q3 == o430Var) {
                        Q3 = new t8j(19, this, n351Var);
                        btsVar4.o0(Q3);
                    }
                    tls tlsVar2 = (tls) Q3;
                    Object Q4 = btsVar4.Q();
                    if (Q4 == o430Var) {
                        Q4 = new ymj(i7, this, n351Var);
                        btsVar4.o0(Q4);
                    }
                    btsVar2 = btsVar4;
                    b.b(j6nVar, null, tlsVar2, (sls) Q4, btsVar2, (i3 & 14) | 3456);
                }
                v2 = btsVar2.v();
                if (v2 != null) {
                    wlsVar2 = new wls(this) { // from class: k6n
                        public final /* synthetic */ vyc b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = i10;
                            zy11 zy11Var = zy11.a;
                            int i12 = i;
                            n351 n351Var2 = n351Var;
                            vyc vycVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i11) {
                                case 0:
                                    vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                    break;
                                default:
                                    vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v2.d = wlsVar2;
                }
                break;
            case 2:
                bts btsVar5 = (bts) fidVar;
                btsVar5.g0(-1977280874);
                if ((i & 6) == 0) {
                    i4 = i | (btsVar5.k(n351Var) ? 4 : 2);
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= btsVar5.e(this) ? 32 : 16;
                }
                if (!btsVar5.V(i4 & 1, (i4 & 19) != 18)) {
                    btsVar5.Y();
                } else if (!(n351Var instanceof w9n)) {
                    v3 = btsVar5.v();
                    if (v3 != null) {
                        wlsVar3 = new wls(this) { // from class: aan
                            public final /* synthetic */ vyc b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i11 = i9;
                                zy11 zy11Var = zy11.a;
                                int i12 = i;
                                n351 n351Var2 = n351Var;
                                vyc vycVar = this.b;
                                fid fidVar2 = (fid) obj;
                                ((Integer) obj2).getClass();
                                switch (i11) {
                                    case 0:
                                        vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                        break;
                                    default:
                                        vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        v3.d = wlsVar3;
                        break;
                    }
                } else {
                    sb2.b(ua3.a.a((dci) this.c), wwg.S(-663598250, true, new qq0(n351Var, i8), btsVar5), btsVar5, 56);
                }
                v3 = btsVar5.v();
                if (v3 != null) {
                    wlsVar3 = new wls(this) { // from class: aan
                        public final /* synthetic */ vyc b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = i10;
                            zy11 zy11Var = zy11.a;
                            int i12 = i;
                            n351 n351Var2 = n351Var;
                            vyc vycVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i11) {
                                case 0:
                                    vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                    break;
                                default:
                                    vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v3.d = wlsVar3;
                }
                break;
            default:
                bts btsVar6 = (bts) fidVar;
                btsVar6.g0(-1662192400);
                if ((i & 6) == 0) {
                    i5 = i | (btsVar6.k(n351Var) ? 4 : 2);
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= (i & 64) == 0 ? btsVar6.k(this) : btsVar6.e(this) ? 32 : 16;
                }
                if (!btsVar6.V(i5 & 1, (i5 & 19) != 18)) {
                    btsVar6.Y();
                } else if (!(n351Var instanceof cx90)) {
                    v4 = btsVar6.v();
                    if (v4 != null) {
                        wlsVar4 = new wls(this) { // from class: mx90
                            public final /* synthetic */ vyc b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i11 = i9;
                                zy11 zy11Var = zy11.a;
                                int i12 = i;
                                n351 n351Var2 = n351Var;
                                vyc vycVar = this.b;
                                fid fidVar2 = (fid) obj;
                                ((Integer) obj2).getClass();
                                switch (i11) {
                                    case 0:
                                        vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                        break;
                                    default:
                                        vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        v4.d = wlsVar4;
                        break;
                    }
                } else {
                    cx90 cx90Var = (cx90) n351Var;
                    boolean k = btsVar6.k(cx90Var.f);
                    Object Q5 = btsVar6.Q();
                    if (k || Q5 == o430Var) {
                        Q5 = new xw90(i10, this, n351Var);
                        btsVar6.o0(Q5);
                    }
                    i991.a(cx90Var, (sls) Q5, btsVar6, i5 & 14);
                }
                v4 = btsVar6.v();
                if (v4 != null) {
                    wlsVar4 = new wls(this) { // from class: mx90
                        public final /* synthetic */ vyc b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = i10;
                            zy11 zy11Var = zy11.a;
                            int i12 = i;
                            n351 n351Var2 = n351Var;
                            vyc vycVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i11) {
                                case 0:
                                    vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                    break;
                                default:
                                    vycVar.a(n351Var2, fidVar2, vng.O(i12 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v4.d = wlsVar4;
                }
                break;
        }
    }

    public vyc(qyc qycVar) {
        super("complete-buttons-key");
        this.c = qycVar;
    }

    public vyc(e1q0 e1q0Var) {
        super("dynamic-content-section-header-key");
        this.c = e1q0Var;
    }

    public vyc(dci dciVar) {
        super("dynamic-timeline-key");
        this.c = dciVar;
    }
}
