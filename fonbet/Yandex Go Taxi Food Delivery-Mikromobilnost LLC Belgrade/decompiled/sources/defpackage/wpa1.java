package defpackage;

import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.ybsdk.core.transfer.utils.domain.dto.AgreementImageDto;
import com.ybsdk.core.transfer.utils.domain.entities.AgreementImageEntity;

/* loaded from: classes11.dex */
public abstract class wpa1 {
    public static final void a(bj6 bj6Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1805065996);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 o = an91.o(bj6Var.a(c530.a, x4c.A), 8.0f, 8.0f, 0.0f, 8.0f, 4);
            ButtonSize buttonSize = ButtonSize.M;
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new azd(23, tlsVar);
                btsVar.o0(Q);
            }
            snb1.a(o, buttonSize, (sls) Q, btsVar, 48, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(bj6Var, tlsVar, i, 24);
        }
    }

    public static final void b(final cqk0 cqk0Var, final tls tlsVar, fid fidVar, final int i) {
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(889368743);
        int i2 = (btsVar.k(cqk0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        final int i3 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (cqk0Var.c.a.isEmpty()) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(cqk0Var, tlsVar, i, r8) { // from class: zpk0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ cqk0 b;
                        public final /* synthetic */ tls c;

                        {
                            this.a = r4;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            zy11 zy11Var = zy11.a;
                            tls tlsVar2 = this.c;
                            cqk0 cqk0Var2 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    wpa1.b(cqk0Var2, tlsVar2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    wpa1.b(cqk0Var2, tlsVar2, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            f530 c = ljs0.c(c530.a, 1.0f);
            l690 l690Var = new l690(16.0f, 10.0f, 16.0f, 8.0f);
            i43 i43Var = new i43(4.0f, true, new quz(11));
            int i4 = ((i2 & 14) == 4 ? 1 : 0) | ((i2 & 112) == 32 ? 1 : 0);
            Object Q = btsVar.Q();
            if (i4 != 0 || Q == did.a) {
                Q = new vxj0(10, cqk0Var, tlsVar);
                btsVar.o0(Q);
            }
            adb1.b(c, null, l690Var, i43Var, null, null, false, null, (tls) Q, btsVar, 24966, 490);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(cqk0Var, tlsVar, i, i3) { // from class: zpk0
                public final /* synthetic */ int a;
                public final /* synthetic */ cqk0 b;
                public final /* synthetic */ tls c;

                {
                    this.a = i3;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar2 = this.c;
                    cqk0 cqk0Var2 = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            wpa1.b(cqk0Var2, tlsVar2, fidVar2, vng.O(1));
                            break;
                        default:
                            wpa1.b(cqk0Var2, tlsVar2, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final AgreementImageEntity c(AgreementImageDto agreementImageDto) {
        return new AgreementImageEntity(qxy0.c(agreementImageDto.getHeader(), null), qxy0.c(agreementImageDto.getSelector(), null));
    }

    public static int d(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }
}
