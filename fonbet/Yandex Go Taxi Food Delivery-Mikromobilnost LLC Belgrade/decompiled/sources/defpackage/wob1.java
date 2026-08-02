package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.a;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.j;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import java.io.ByteArrayOutputStream;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class wob1 {
    public static final void a(float f, f530 f530Var, ButtonSize buttonSize, sls slsVar, fid fidVar, int i) {
        f530 f530Var2;
        ButtonSize buttonSize2;
        ButtonSize buttonSize3;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(898676749);
        int i2 = i | (btsVar.b(f) ? 32 : 16) | 3456 | (btsVar.e(slsVar) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                buttonSize3 = ButtonSize.L;
                f530Var3 = c530.a;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
                buttonSize3 = buttonSize;
            }
            btsVar.u();
            y4b1.a(u3a1.d(an91.o(f530Var3.k(new pa31(x4c.E)), 0.0f, 8.0f, 8.0f, 8.0f, 1), "compass_btn"), null, buttonSize3, slsVar, wwg.S(-1174529531, true, new xvc(f, 2), btsVar), btsVar, 24960 | ((i2 >> 3) & 7168), 2);
            buttonSize2 = buttonSize3;
            f530Var2 = f530Var3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            buttonSize2 = buttonSize;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zvc(f, f530Var2, buttonSize2, slsVar, i);
        }
    }

    public static final void b(final ot30 ot30Var, sls slsVar, fid fidVar, int i) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-394420365);
        int i2 = (btsVar.k(ot30Var) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int i5 = xt30.a[ot30Var.c.ordinal()];
            if (i5 == 1) {
                btsVar.e0(-1080843987);
                slsVar2 = slsVar;
                ohb1.b(null, false, null, slsVar2, wwg.S(-322262114, true, new zls() { // from class: wt30
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i3;
                        zy11 zy11Var = zy11.a;
                        c530 c530Var = c530.a;
                        ot30 ot30Var2 = ot30Var;
                        switch (i6) {
                            case 0:
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    jeb1.f(ot30Var2.b, an91.m(c530Var, 8.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.b, btsVar2, 48, 0, 16380);
                                    break;
                                }
                            default:
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    jeb1.f(ot30Var2.b, an91.m(c530Var, 8.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.b, btsVar3, 48, 0, 16380);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar, ((i2 << 6) & 7168) | HProv.ALG_CLASS_DATA_ENCRYPT, 7);
                btsVar.t(false);
            } else {
                if (i5 != 2) {
                    throw unr0.y(-1080845495, btsVar, false);
                }
                btsVar.e0(-1080836850);
                slsVar2 = slsVar;
                ulb1.a(null, false, null, slsVar2, wwg.S(134237941, true, new zls() { // from class: wt30
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i4;
                        zy11 zy11Var = zy11.a;
                        c530 c530Var = c530.a;
                        ot30 ot30Var2 = ot30Var;
                        switch (i6) {
                            case 0:
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    jeb1.f(ot30Var2.b, an91.m(c530Var, 8.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.b, btsVar2, 48, 0, 16380);
                                    break;
                                }
                            default:
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    jeb1.f(ot30Var2.b, an91.m(c530Var, 8.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.b, btsVar3, 48, 0, 16380);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar, ((i2 << 6) & 7168) | HProv.ALG_CLASS_DATA_ENCRYPT, 7);
                btsVar.t(false);
            }
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(ot30Var, slsVar2, i, 29);
        }
    }

    public static final void c(yt30 yt30Var, tls tlsVar, f530 f530Var, qor qorVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        qor qorVar2;
        aii0 v;
        wls squVar;
        int i4;
        qor qorVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-152899948);
        int i5 = (btsVar.k(yt30Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i6 = i5 | 384;
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i5 | 3456;
        } else {
            i3 = i6 | (btsVar.k(qorVar) ? 2048 : 1024);
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            if (i7 != 0) {
                int i8 = i3;
                qorVar3 = null;
                i4 = i8;
            } else {
                i4 = i3;
                qorVar3 = qorVar;
            }
            if (yt30Var.a.isEmpty()) {
                v = btsVar.v();
                if (v != null) {
                    squVar = new ivy(yt30Var, tlsVar, qorVar3, i, i2, 6);
                    v.d = squVar;
                }
                return;
            }
            qor qorVar4 = qorVar3;
            a S = wwg.S(-568514536, true, new nfj(26, yt30Var, tlsVar), btsVar);
            int i9 = 196614 | ((i4 >> 3) & 896);
            c530 c530Var = c530.a;
            dta1.a(c530Var, false, qorVar4, false, false, S, btsVar, i9, 26);
            f530Var2 = c530Var;
            qorVar2 = qorVar4;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            qorVar2 = qorVar;
        }
        v = btsVar.v();
        if (v != null) {
            squVar = new squ(yt30Var, tlsVar, f530Var2, qorVar2, i, i2);
            v.d = squVar;
        }
    }

    public static void d(Context context, d93 d93Var, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, long j, ozj0 ozj0Var) {
        try {
            p5j0 p5j0Var = (p5j0) Glide.with(context).asBitmap().a(((r7j0) new r7j0().t(j.d, Long.valueOf(j))).q(Priority.IMMEDIATE)).J(d93Var.a()).u(new lp60(Long.valueOf(d93Var.i)));
            p5j0Var.getClass();
            o6j0 o6j0Var = new o6j0(i, i2);
            p5j0Var.F(o6j0Var, o6j0Var, p5j0Var, ph91.b);
            Bitmap bitmap = (Bitmap) o6j0Var.get();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(compressFormat, i3, byteArrayOutputStream);
            ozj0Var.a(byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            ozj0.c(ozj0Var, "Thumbnail request error", e.toString(), 4);
        }
    }
}
