package defpackage;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.go.design.compose.modal.utils.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class qy20 {
    public static final w2o a;
    public static final zmo b;
    public static final w2o c;
    public static final zmo d;

    static {
        int i = 29;
        a = k.p(sb2.K(SubsamplingScaleImageView.ORIENTATION_180, 0, null, 6), new ur70(i));
        b = k.u(sb2.K(SubsamplingScaleImageView.ORIENTATION_180, 0, null, 6), new ur70(i));
        c = k.n(sb2.K(SubsamplingScaleImageView.ORIENTATION_180, 0, null, 6), new ur70(i));
        d = k.s(sb2.K(SubsamplingScaleImageView.ORIENTATION_180, 0, null, 6), new ur70(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(rz20 rz20Var, v2o v2oVar, ymo ymoVar, boolean z, zls zlsVar, fid fidVar, int i, int i2) {
        rz20 rz20Var2;
        int i3;
        v2o v2oVar2;
        int i4;
        ymo ymoVar2;
        int i5;
        boolean z2;
        v2o v2oVar3;
        ymo ymoVar3;
        boolean z3;
        aii0 v;
        v2o v2oVar4;
        ymo ymoVar4;
        int i6;
        boolean z4;
        Object Q;
        int i7;
        bts btsVar = (bts) fidVar;
        btsVar.g0(901543603);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                rz20Var2 = rz20Var;
                if (btsVar.k(rz20Var2)) {
                    i7 = 4;
                    i3 = i7 | i;
                }
            } else {
                rz20Var2 = rz20Var;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            rz20Var2 = rz20Var;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            v2oVar2 = v2oVar;
            i3 |= btsVar.k(v2oVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                ymoVar2 = ymoVar;
                i3 |= btsVar.k(ymoVar2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    z2 = z;
                    i3 |= btsVar.a(z2) ? 2048 : 1024;
                    if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        i3 |= btsVar.e(zlsVar) ? 16384 : 8192;
                    }
                    if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
                        btsVar.Y();
                        v2oVar3 = v2oVar2;
                        ymoVar3 = ymoVar2;
                        z3 = z2;
                    } else {
                        btsVar.a0();
                        if ((i & 1) == 0 || btsVar.C()) {
                            if ((i2 & 1) != 0) {
                                rz20Var2 = a.a(false, null, btsVar, 0, 7);
                                i3 &= -15;
                            }
                            v2oVar4 = i8 != 0 ? a : v2oVar2;
                            ymoVar4 = i4 != 0 ? b : ymoVar2;
                            i6 = i3;
                            if (i5 != 0) {
                                z4 = true;
                                btsVar.u();
                                zx01 O = bvf0.O(rz20Var2.a, "Modal View Appear Animation", btsVar, 48, 0);
                                f530 f530Var = c530.a;
                                if (z4) {
                                    f530Var = i9a1.c(i9a1.g(f530Var));
                                }
                                Q = btsVar.Q();
                                if (Q == did.a) {
                                    Q = new qu(13);
                                    btsVar.o0(Q);
                                }
                                int i9 = i6 << 6;
                                g.d(O, (tls) Q, ljs0.c, v2oVar4, ymoVar4, wwg.S(-1983569334, true, new u5(6, f530Var, zlsVar), btsVar), btsVar, (i9 & 7168) | 197040 | (i9 & HProv.ALG_CLASS_ALL), 0);
                                z3 = z4;
                                v2oVar3 = v2oVar4;
                                ymoVar3 = ymoVar4;
                            }
                        } else {
                            btsVar.Y();
                            if ((i2 & 1) != 0) {
                                i3 &= -15;
                            }
                            i6 = i3;
                            v2oVar4 = v2oVar2;
                            ymoVar4 = ymoVar2;
                        }
                        z4 = z2;
                        btsVar.u();
                        zx01 O2 = bvf0.O(rz20Var2.a, "Modal View Appear Animation", btsVar, 48, 0);
                        f530 f530Var2 = c530.a;
                        if (z4) {
                        }
                        Q = btsVar.Q();
                        if (Q == did.a) {
                        }
                        int i92 = i6 << 6;
                        g.d(O2, (tls) Q, ljs0.c, v2oVar4, ymoVar4, wwg.S(-1983569334, true, new u5(6, f530Var2, zlsVar), btsVar), btsVar, (i92 & 7168) | 197040 | (i92 & HProv.ALG_CLASS_ALL), 0);
                        z3 = z4;
                        v2oVar3 = v2oVar4;
                        ymoVar3 = ymoVar4;
                    }
                    rz20 rz20Var3 = rz20Var2;
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new egb(rz20Var3, v2oVar3, ymoVar3, z3, zlsVar, i, i2);
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                }
                if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
                }
                rz20 rz20Var32 = rz20Var2;
                v = btsVar.v();
                if (v == null) {
                }
            }
            ymoVar2 = ymoVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
            }
            rz20 rz20Var322 = rz20Var2;
            v = btsVar.v();
            if (v == null) {
            }
        }
        v2oVar2 = v2oVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        ymoVar2 = ymoVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
        }
        rz20 rz20Var3222 = rz20Var2;
        v = btsVar.v();
        if (v == null) {
        }
    }
}
