package ru.yandex.logistics.care.camera.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Size;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.aii0;
import defpackage.asj0;
import defpackage.b3b1;
import defpackage.bms;
import defpackage.bsj0;
import defpackage.bts;
import defpackage.cs8;
import defpackage.csj0;
import defpackage.cx7;
import defpackage.did;
import defpackage.es8;
import defpackage.f530;
import defpackage.ffx;
import defpackage.fid;
import defpackage.iy40;
import defpackage.kzd;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lz40;
import defpackage.m4m0;
import defpackage.n4u0;
import defpackage.oz40;
import defpackage.q8v;
import defpackage.qke;
import defpackage.rk6;
import defpackage.rs8;
import defpackage.sd8;
import defpackage.sls;
import defpackage.tls;
import defpackage.tpr;
import defpackage.w8v;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import defpackage.zy11;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.care.camera.data.BackgroundVisibility;
import ru.yandex.logistics.care.camera.di.Config$CameraLens;
import ru.yandex.logistics.care.camera.di.Config$Orientation;
import ru.yandex.logistics.care.camera.ui.a;

/* loaded from: classes4.dex */
public abstract class c {
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
    
        if (r28.intValue() != 270) goto L90;
     */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final rs8 rs8Var, final n4u0 n4u0Var, final n4u0 n4u0Var2, final kzd kzdVar, final tls tlsVar, Integer num, f530 f530Var, tpr tprVar, tpr tprVar2, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        int i2;
        int i3;
        int i4;
        Object careCameraComposableKt$CareCameraComposable$3$1;
        boolean z;
        Object obj;
        int i5;
        ?? r9;
        int i6;
        lz40 lz40Var;
        ?? r12;
        Object obj2;
        Object obj3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-182209657);
        int i7 = i | (btsVar2.k(rs8Var) ? 4 : 2) | (btsVar2.e(n4u0Var) ? 32 : 16) | (btsVar2.e(n4u0Var2) ? 256 : 128) | (btsVar2.k(kzdVar) ? 2048 : 1024) | (btsVar2.e(tlsVar) ? 16384 : 8192) | (btsVar2.k(f530Var) ? 1048576 : 524288) | (btsVar2.e(tprVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar2.e(tprVar2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
        if (btsVar2.V(i7 & 1, (38347923 & i7) != 38347922)) {
            btsVar2.a0();
            if ((i & 1) != 0 && !btsVar2.C()) {
                btsVar2.Y();
            }
            btsVar2.u();
            Object Q = btsVar2.Q();
            Object obj4 = did.a;
            if (Q == obj4) {
                Q = ffx.c(0, 1, null, 5);
                btsVar2.o0(Q);
            }
            lz40 lz40Var2 = (lz40) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == obj4) {
                Q2 = f.h(0L);
                btsVar2.o0(Q2);
            }
            final iy40 iy40Var = (iy40) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == obj4) {
                asj0 asj0Var = new asj0();
                i2 = i7;
                asj0Var.b = new csj0(1, new Size(1280, 960));
                bsj0 a = asj0Var.a();
                q8v q8vVar = new q8v();
                q8vVar.h(a);
                Q3 = q8vVar.f();
                btsVar2.o0(Q3);
            } else {
                i2 = i7;
            }
            final w8v w8vVar = (w8v) Q3;
            Object Q4 = btsVar2.Q();
            if (Q4 == obj4) {
                Q4 = Executors.newSingleThreadExecutor();
                btsVar2.o0(Q4);
            }
            final ExecutorService executorService = (ExecutorService) Q4;
            boolean e = btsVar2.e(executorService);
            Object Q5 = btsVar2.Q();
            if (e || Q5 == obj4) {
                Q5 = new cx7(17, executorService);
                btsVar2.o0(Q5);
            }
            zy11 zy11Var = zy11.a;
            zpn.a(zy11Var, (tls) Q5, btsVar2);
            Object obj5 = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
            Object Q6 = btsVar2.Q();
            if (Q6 == obj4) {
                while (true) {
                    if (!(obj5 instanceof ContextWrapper)) {
                        obj3 = null;
                        break;
                    } else {
                        if (obj5 instanceof Activity) {
                            obj3 = (Activity) obj5;
                            break;
                        }
                        obj5 = ((ContextWrapper) obj5).getBaseContext();
                    }
                }
                btsVar2.o0(obj3);
                Q6 = obj3;
            }
            Object obj6 = (Activity) Q6;
            int i8 = i2 & 14;
            boolean e2 = (i8 == 4) | btsVar2.e(obj6);
            Object Q7 = btsVar2.Q();
            if (e2 || Q7 == obj4) {
                Q7 = new cs8(0, obj6, rs8Var);
                btsVar2.o0(Q7);
            }
            zpn.a(rs8Var, (tls) Q7, btsVar2);
            if (rs8Var.a().e == Config$Orientation.Landscape) {
                i3 = 90;
                if (num.intValue() != 90) {
                }
                i4 = 0;
            } else {
                if (rs8Var.a().e == Config$Orientation.Portrait && num.intValue() != 0 && num.intValue() != 180) {
                    i3 = -90;
                    i4 = i3;
                }
                i4 = 0;
            }
            Object Q8 = btsVar2.Q();
            if (Q8 == obj4) {
                Q8 = f.j(Boolean.FALSE);
                btsVar2.o0(Q8);
            }
            final oz40 oz40Var = (oz40) Q8;
            boolean e3 = btsVar2.e(tprVar2) | btsVar2.e(w8vVar) | btsVar2.e(executorService);
            int i9 = i2 & HProv.ALG_CLASS_ALL;
            boolean z2 = e3 | (i9 == 16384);
            Object Q9 = btsVar2.Q();
            if (z2 || Q9 == obj4) {
                z = true;
                obj = obj4;
                i5 = i9;
                r9 = 0;
                i6 = 16384;
                careCameraComposableKt$CareCameraComposable$3$1 = new CareCameraComposableKt$CareCameraComposable$3$1(tprVar2, w8vVar, executorService, tlsVar, null);
                btsVar2.o0(careCameraComposableKt$CareCameraComposable$3$1);
            } else {
                obj = obj4;
                i6 = 16384;
                r9 = 0;
                z = true;
                careCameraComposableKt$CareCameraComposable$3$1 = Q9;
                i5 = i9;
            }
            zpn.e(btsVar2, (wls) careCameraComposableKt$CareCameraComposable$3$1, zy11Var);
            boolean e4 = (i5 == i6 ? z : r9) | btsVar2.e(n4u0Var) | btsVar2.e(tprVar) | btsVar2.e(lz40Var2) | (i8 != 4 ? r9 : z);
            Object Q10 = btsVar2.Q();
            if (e4 || Q10 == obj) {
                lz40Var = lz40Var2;
                r12 = z;
                obj2 = obj;
                Object careCameraComposableKt$CareCameraComposable$4$1 = new CareCameraComposableKt$CareCameraComposable$4$1(n4u0Var, tprVar, lz40Var, rs8Var, tlsVar, oz40Var, null);
                btsVar2.o0(careCameraComposableKt$CareCameraComposable$4$1);
                Q10 = careCameraComposableKt$CareCameraComposable$4$1;
            } else {
                obj2 = obj;
                lz40Var = lz40Var2;
                r12 = z;
            }
            zpn.e(btsVar2, (wls) Q10, rs8Var);
            boolean e5 = btsVar2.e(lz40Var);
            Object Q11 = btsVar2.Q();
            if (e5 || Q11 == obj2) {
                Q11 = new rk6(29, lz40Var);
                btsVar2.o0(Q11);
            }
            b3b1.a(r9, (sls) Q11, btsVar2, r9, r12);
            f530Var2 = f530Var;
            f530 b = m4m0.b(f530Var2.k(ljs0.c), ldc.b, qke.q);
            Object Q12 = btsVar2.Q();
            if (Q12 == obj2) {
                Q12 = new sd8(25);
                btsVar2.o0(Q12);
            }
            tls tlsVar2 = (tls) Q12;
            Object Q13 = btsVar2.Q();
            if (Q13 == obj2) {
                Q13 = new sd8(26);
                btsVar2.o0(Q13);
            }
            final int i10 = i4;
            btsVar = btsVar2;
            androidx.compose.animation.a.b(rs8Var, b, tlsVar2, null, null, (tls) Q13, wwg.S(1649900241, r12, new bms() { // from class: ds8
                /* JADX WARN: Code restructure failed: missing block: B:58:0x0468, code lost:
                
                    if (r0 == r12) goto L128;
                 */
                /* JADX WARN: Removed duplicated region for block: B:159:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:161:0x01bc  */
                @Override // defpackage.bms
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                    tls tlsVar3;
                    uo5 uo5Var;
                    Bitmap bitmap;
                    char c;
                    Bitmap decodeFile;
                    int i11;
                    bts btsVar3;
                    boolean z3;
                    rs8 rs8Var2;
                    boolean z4;
                    w8v w8vVar2;
                    o430 o430Var;
                    f530 F;
                    int i12;
                    uo5 uo5Var2;
                    rs8 rs8Var3;
                    bts btsVar4;
                    c530 c530Var;
                    boolean z5;
                    cj6 cj6Var;
                    uo5 uo5Var3;
                    tls tlsVar4;
                    oz40 oz40Var2;
                    n4u0 n4u0Var3;
                    o430 o430Var2;
                    uo5 uo5Var4;
                    tls tlsVar5;
                    c530 c530Var2;
                    cj6 cj6Var2;
                    kzd kzdVar2;
                    uo5 uo5Var5;
                    o430 o430Var3;
                    uo5 uo5Var6;
                    pzd pzdVar;
                    cj6 cj6Var3;
                    boolean z6;
                    int i13;
                    oz40 oz40Var3;
                    o430 o430Var4;
                    boolean z7;
                    rs8 rs8Var4 = (rs8) obj8;
                    fid fidVar2 = (fid) obj9;
                    ((Integer) obj10).getClass();
                    uo5 uo5Var7 = x4c.B;
                    uo5 uo5Var8 = x4c.y;
                    k3r k3rVar = ljs0.c;
                    uo5 uo5Var9 = x4c.b;
                    z910 d = pi6.d(uo5Var9, false);
                    bts btsVar5 = (bts) fidVar2;
                    int hashCode = Long.hashCode(btsVar5.T);
                    r1b0 o = btsVar5.o();
                    f530 d2 = b.d(fidVar2, k3rVar);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    bts btsVar6 = (bts) fidVar2;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar);
                    } else {
                        btsVar6.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(fidVar2, wlsVar, d);
                    wls wlsVar2 = d.e;
                    qje.W(fidVar2, wlsVar2, o);
                    wls wlsVar3 = d.g;
                    if (btsVar6.S || !jl40.l(btsVar6.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar6, hashCode, wlsVar3);
                    }
                    wls wlsVar4 = d.d;
                    qje.W(fidVar2, wlsVar4, d2);
                    boolean z8 = rs8Var4 instanceof ms8;
                    int i14 = 24;
                    w8v w8vVar3 = w8v.this;
                    tls tlsVar6 = tlsVar;
                    o430 o430Var5 = did.a;
                    if (z8) {
                        btsVar6.e0(-1918416704);
                        ms8 ms8Var = (ms8) rs8Var4;
                        qs8 qs8Var = ms8Var.a;
                        int i15 = ms8Var.b ? 1 : 2;
                        float f = ms8Var.f;
                        boolean k = btsVar6.k(tlsVar6);
                        Object Q14 = btsVar6.Q();
                        if (k || Q14 == o430Var5) {
                            Q14 = new a0(i14, tlsVar6);
                            btsVar6.o0(Q14);
                        }
                        tls tlsVar7 = (tls) Q14;
                        Config$CameraLens config$CameraLens = qs8Var.f;
                        boolean k2 = btsVar6.k(tlsVar6);
                        Object Q15 = btsVar6.Q();
                        if (k2 || Q15 == o430Var5) {
                            Q15 = new zp5(23, tlsVar6);
                            btsVar6.o0(Q15);
                        }
                        tlsVar3 = tlsVar6;
                        a.a(w8vVar3, i15, f, tlsVar7, config$CameraLens, (sls) Q15, qs8Var.h, fidVar2, 0);
                        fidVar2 = fidVar2;
                        btsVar6.t(false);
                        rs8Var2 = rs8Var4;
                        w8vVar2 = w8vVar3;
                        z3 = false;
                        o430Var = o430Var5;
                        uo5Var = uo5Var8;
                        z4 = z8;
                        btsVar3 = btsVar6;
                    } else {
                        tlsVar3 = tlsVar6;
                        if (!(rs8Var4 instanceof os8)) {
                            throw unr0.y(-200432976, btsVar6, false);
                        }
                        btsVar6.e0(-1917499197);
                        z910 d3 = pi6.d(uo5Var9, false);
                        uo5Var = uo5Var8;
                        int hashCode2 = Long.hashCode(btsVar6.T);
                        r1b0 o2 = btsVar6.o();
                        f530 d4 = b.d(fidVar2, k3rVar);
                        btsVar6.i0();
                        if (btsVar6.S) {
                            btsVar6.n(slsVar);
                        } else {
                            btsVar6.r0();
                        }
                        qje.W(fidVar2, wlsVar, d3);
                        qje.W(fidVar2, wlsVar2, o2);
                        if (btsVar6.S || !jl40.l(btsVar6.Q(), Integer.valueOf(hashCode2))) {
                            b64.z(hashCode2, btsVar6, hashCode2, wlsVar3);
                        }
                        qje.W(fidVar2, wlsVar4, d4);
                        File file = ((os8) rs8Var4).a;
                        boolean k3 = btsVar6.k(file);
                        Object Q16 = btsVar6.Q();
                        if (k3 || Q16 == o430Var5) {
                            try {
                                decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), new BitmapFactory.Options());
                            } catch (Exception unused) {
                            }
                            if (decodeFile != null) {
                                try {
                                    int d5 = new androidx.exifinterface.media.a(file).d(1, "Orientation");
                                    c = 3;
                                    i11 = d5 != 3 ? d5 != 6 ? d5 != 8 ? 0 : SubsamplingScaleImageView.ORIENTATION_270 : 90 : SubsamplingScaleImageView.ORIENTATION_180;
                                } catch (Exception unused2) {
                                    c = 3;
                                }
                                if (i11 != 0) {
                                    try {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(i11);
                                        Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                                        decodeFile.recycle();
                                        bitmap = createBitmap;
                                    } catch (Exception unused3) {
                                    }
                                    u92 u92Var = bitmap != null ? new u92(bitmap) : null;
                                    btsVar6.o0(u92Var);
                                    Q16 = u92Var;
                                }
                                bitmap = decodeFile;
                                if (bitmap != null) {
                                }
                                btsVar6.o0(u92Var);
                                Q16 = u92Var;
                            }
                            c = 3;
                            bitmap = null;
                            if (bitmap != null) {
                            }
                            btsVar6.o0(u92Var);
                            Q16 = u92Var;
                        } else {
                            c = 3;
                        }
                        l8v l8vVar = (l8v) Q16;
                        if (l8vVar == null) {
                            btsVar6.e0(-1889691625);
                            btsVar6.t(false);
                            rs8Var2 = rs8Var4;
                            z3 = false;
                            o430Var = o430Var5;
                            btsVar3 = btsVar6;
                            z4 = z8;
                            w8vVar2 = w8vVar3;
                        } else {
                            btsVar6.e0(-1889691624);
                            btsVar3 = btsVar6;
                            z3 = false;
                            rs8Var2 = rs8Var4;
                            z4 = z8;
                            w8vVar2 = w8vVar3;
                            o430Var = o430Var5;
                            o4b1.c(l8vVar, null, ljs0.c, null, mhe.b, 0.0f, null, 0, fidVar2, 25008, 232);
                            fidVar2 = fidVar2;
                            btsVar3.t(false);
                        }
                        btsVar3.t(true);
                        btsVar3.t(z3);
                    }
                    k3r k3rVar2 = ljs0.c;
                    int i16 = i10;
                    float f2 = i16;
                    if (f2 == 0.0f) {
                        F = k3rVar2;
                    } else {
                        F = kp50.F(k3rVar2, new xwb0(!(f2 % 180.0f == 0.0f ? true : z3), f2));
                    }
                    z910 d6 = pi6.d(uo5Var9, z3);
                    int hashCode3 = Long.hashCode(btsVar3.T);
                    r1b0 o3 = btsVar3.o();
                    f530 d7 = b.d(fidVar2, F);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar2);
                    } else {
                        btsVar3.r0();
                    }
                    wls wlsVar5 = d.f;
                    qje.W(fidVar2, wlsVar5, d6);
                    wls wlsVar6 = d.e;
                    qje.W(fidVar2, wlsVar6, o3);
                    wls wlsVar7 = d.g;
                    if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode3))) {
                        b64.z(hashCode3, btsVar3, hashCode3, wlsVar7);
                    }
                    wls wlsVar8 = d.d;
                    qje.W(fidVar2, wlsVar8, d7);
                    rs8 rs8Var5 = rs8Var;
                    float f3 = rs8Var5.a().e == Config$Orientation.Portrait ? 48.0f : 16.0f;
                    c530 c530Var3 = c530.a;
                    f530 c2 = ljs0.c(c530Var3, 1.0f);
                    uo5 uo5Var10 = x4c.c;
                    cj6 cj6Var4 = cj6.a;
                    f530 a2 = cj6Var4.a(c2, uo5Var10);
                    long j = ldc.b;
                    f530 m = an91.m(m4m0.a(a2, zoy0.G(scc.g(new ldc(ldc.b(j, 0.5f, 0.0f, 0.0f, 0.0f, 14)), new ldc(ldc.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))), 0.0f, 0.0f, 14), null, 6), 0.0f, f3, 1);
                    sic a3 = qic.a(lr20.e, x4c.H, fidVar2, 54);
                    int hashCode4 = Long.hashCode(btsVar3.T);
                    r1b0 o4 = btsVar3.o();
                    f530 d8 = b.d(fidVar2, m);
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar2);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(fidVar2, wlsVar5, a3);
                    qje.W(fidVar2, wlsVar6, o4);
                    if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode4))) {
                        b64.z(hashCode4, btsVar3, hashCode4, wlsVar7);
                    }
                    qje.W(fidVar2, wlsVar8, d8);
                    ps8 ps8Var = rs8Var5.a().d;
                    String str = ps8Var != null ? ps8Var.a : null;
                    if (str == null) {
                        btsVar3.e0(-1514652901);
                        btsVar3.t(false);
                        cj6Var = cj6Var4;
                        rs8Var3 = rs8Var5;
                        z5 = false;
                        btsVar4 = btsVar3;
                        uo5Var3 = uo5Var9;
                        i12 = i16;
                        uo5Var2 = uo5Var;
                        tlsVar4 = tlsVar3;
                        c530Var = c530Var3;
                    } else {
                        btsVar3.e0(-1514652900);
                        fid fidVar3 = fidVar2;
                        i12 = i16;
                        uo5Var2 = uo5Var;
                        rs8Var3 = rs8Var5;
                        btsVar4 = btsVar3;
                        c530Var = c530Var3;
                        z5 = false;
                        cj6Var = cj6Var4;
                        uo5Var3 = uo5Var9;
                        tlsVar4 = tlsVar3;
                        ymb1.c(str, null, ldc.f, tq7.a, lzr.E, 0L, 0L, 0L, new sjy0(3), 0, false, 1, null, null, fidVar3, 28032, HProv.ALG_TYPE_SECURECHANNEL, 56290);
                        fidVar2 = fidVar3;
                        btsVar4.t(false);
                    }
                    ps8 ps8Var2 = rs8Var3.a().d;
                    String str2 = ps8Var2 != null ? ps8Var2.b : null;
                    if (str2 == null) {
                        btsVar4.e0(-1514205943);
                        btsVar4.t(z5);
                    } else {
                        btsVar4.e0(-1514205942);
                        fid fidVar4 = fidVar2;
                        ymb1.f(str2, null, ldc.f, null, null, null, 0L, 0L, 0L, new sjy0(3), 0, false, 1, null, null, fidVar4, 384, HProv.ALG_TYPE_SECURECHANNEL, 56314);
                        fidVar2 = fidVar4;
                        btsVar4.t(z5);
                    }
                    btsVar4.t(true);
                    n4u0 n4u0Var4 = n4u0Var;
                    kzd kzdVar3 = kzdVar;
                    oz40 oz40Var4 = oz40Var;
                    if (z4) {
                        btsVar4.e0(-243949782);
                        oz40 b2 = f.b(n4u0Var4, fidVar2);
                        oz40 b3 = f.b(n4u0Var2, fidVar2);
                        ms8 ms8Var2 = (ms8) rs8Var2;
                        boolean z9 = ms8Var2.b;
                        String str3 = ms8Var2.e;
                        qs8 qs8Var2 = ms8Var2.a;
                        oz40Var2 = oz40Var4;
                        boolean z10 = qs8Var2.a;
                        boolean z11 = qs8Var2.b;
                        ozd ozdVar = qs8Var2.c;
                        pzd pzdVar2 = qs8Var2.g;
                        BackgroundVisibility backgroundVisibility = (BackgroundVisibility) b3.getValue();
                        w8v w8vVar4 = w8vVar2;
                        boolean e6 = fidVar2.e(w8vVar4);
                        ExecutorService executorService2 = executorService;
                        tls tlsVar8 = tlsVar4;
                        boolean e7 = e6 | fidVar2.e(executorService2) | btsVar4.k(tlsVar8);
                        Object Q17 = btsVar4.Q();
                        if (e7) {
                            o430Var4 = o430Var;
                        } else {
                            o430Var4 = o430Var;
                        }
                        Q17 = new u50(w8vVar4, executorService2, tlsVar8, iy40Var, oz40Var2, 8);
                        btsVar4.o0(Q17);
                        n4u0Var3 = n4u0Var4;
                        o430Var2 = o430Var4;
                        fid fidVar5 = fidVar2;
                        tlsVar5 = tlsVar8;
                        mt71.a(z11, z10, z9, str3, ozdVar, pzdVar2, (tls) Q17, k3rVar2, i12, backgroundVisibility, fidVar5, 12582912);
                        fidVar2 = fidVar5;
                        if (((Number) b2.getValue()).intValue() > 0) {
                            btsVar4.e0(-242270636);
                            uo5Var4 = uo5Var2;
                            c530Var2 = c530Var;
                            cj6Var2 = cj6Var;
                            z7 = false;
                            d9b1.a(((Number) b2.getValue()).intValue(), 0, fidVar2, cj6Var2.a(c530Var2, uo5Var4));
                            btsVar4.t(false);
                        } else {
                            uo5Var4 = uo5Var2;
                            c530Var2 = c530Var;
                            cj6Var2 = cj6Var;
                            z7 = false;
                            btsVar4.e0(-242039035);
                            btsVar4.t(false);
                        }
                        btsVar4.t(z7);
                        kzdVar2 = kzdVar3;
                        uo5Var5 = uo5Var7;
                    } else {
                        oz40Var2 = oz40Var4;
                        n4u0Var3 = n4u0Var4;
                        o430Var2 = o430Var;
                        uo5Var4 = uo5Var2;
                        tlsVar5 = tlsVar4;
                        c530Var2 = c530Var;
                        cj6Var2 = cj6Var;
                        if (!(rs8Var2 instanceof os8)) {
                            throw unr0.y(-146417951, btsVar4, false);
                        }
                        btsVar4.e0(-241909858);
                        izd izdVar = kzdVar3.b;
                        String str4 = izdVar.a;
                        String str5 = izdVar.b;
                        String str6 = izdVar.c;
                        f530 a4 = cj6Var2.a(c530Var2, uo5Var7);
                        boolean k4 = btsVar4.k(tlsVar5);
                        Object Q18 = btsVar4.Q();
                        if (k4 || Q18 == o430Var2) {
                            Q18 = new a0(22, tlsVar5);
                            btsVar4.o0(Q18);
                        }
                        kzdVar2 = kzdVar3;
                        uo5Var5 = uo5Var7;
                        udb1.a((tls) Q18, str4, str5, str6, a4, null, fidVar2, 0, 32);
                        btsVar4.t(false);
                    }
                    rs8 rs8Var6 = rs8Var3;
                    ms8 ms8Var3 = rs8Var6 instanceof ms8 ? (ms8) rs8Var6 : null;
                    pzd pzdVar3 = ms8Var3 != null ? ms8Var3.a.g : null;
                    if (pzdVar3 == null) {
                        btsVar4.e0(-240865189);
                        f530 a5 = ljs0.a(rs8Var6.a().e == Config$Orientation.Landscape ? an91.o(cj6Var2.a(c530Var2, uo5Var3), 48.0f, 12.0f, 0.0f, 0.0f, 12) : an91.k(cj6Var2.a(c530Var2, x4c.w), 16.0f), 48.0f, 48.0f);
                        cuj0 cuj0Var = new cuj0(jyg0.baseline_close_24, null, null, new zez0(ldc.f), 22);
                        boolean k5 = btsVar4.k(tlsVar5);
                        Object Q19 = btsVar4.Q();
                        if (k5 || Q19 == o430Var2) {
                            oz40Var3 = oz40Var2;
                            Q19 = new c0(tlsVar5, oz40Var3, 3);
                            btsVar4.o0(Q19);
                        } else {
                            oz40Var3 = oz40Var2;
                        }
                        fid fidVar6 = fidVar2;
                        oz40Var2 = oz40Var3;
                        o430Var3 = o430Var2;
                        uo5Var6 = uo5Var5;
                        cj6Var3 = cj6Var2;
                        pzdVar = pzdVar3;
                        s3b1.c(cuj0Var, a5, false, null, false, null, (sls) Q19, fidVar6, 0, 60);
                        fidVar2 = fidVar6;
                        btsVar4.t(false);
                    } else {
                        o430Var3 = o430Var2;
                        uo5Var6 = uo5Var5;
                        pzdVar = pzdVar3;
                        cj6Var3 = cj6Var2;
                        btsVar4.e0(-239730651);
                        btsVar4.t(false);
                    }
                    if (pzdVar == null || ((Boolean) oz40Var2.getValue()).booleanValue()) {
                        btsVar4.e0(-239610097);
                        btsVar4.t(false);
                        z6 = false;
                    } else {
                        btsVar4.e0(-146276730);
                        boolean z12 = ((Number) f.b(n4u0Var3, fidVar2).getValue()).intValue() < 0;
                        btsVar4.t(false);
                        z6 = z12;
                    }
                    oz40 oz40Var5 = oz40Var2;
                    g.e(z6, cj6Var3.a(c530Var2, uo5Var4), k.e(null, 3), k.f(null, 3), null, wwg.S(1019046709, true, new qk30(12, pzdVar, tlsVar5, oz40Var5), fidVar2), fidVar2, 200064, 16);
                    boolean booleanValue = ((Boolean) oz40Var5.getValue()).booleanValue();
                    Object Q20 = btsVar4.Q();
                    o430 o430Var6 = o430Var3;
                    if (Q20 == o430Var6) {
                        i13 = 24;
                        Q20 = new sd8(24);
                        btsVar4.o0(Q20);
                    } else {
                        i13 = 24;
                    }
                    w2o a6 = k.q(1, (tls) Q20, null).a(k.e(null, 3));
                    Object Q21 = btsVar4.Q();
                    if (Q21 == o430Var6) {
                        Q21 = new sd8(i13);
                        btsVar4.o0(Q21);
                    }
                    g.e(booleanValue, cj6Var3.a(c530Var2, uo5Var6), a6, k.v(1, (tls) Q21, null).a(k.f(null, 3)), null, wwg.S(-93590676, true, new qk30(13, kzdVar2, tlsVar5, oz40Var5), fidVar2), fidVar2, 200064, 16);
                    btsVar4.t(true);
                    btsVar4.t(true);
                    return zy11.a;
                }
            }, btsVar2), btsVar, i8 | 1769856, 24);
        } else {
            btsVar = btsVar2;
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new es8(rs8Var, n4u0Var, n4u0Var2, kzdVar, tlsVar, num, f530Var2, tprVar, tprVar2, i);
        }
    }

    public static final void b(oz40 oz40Var, boolean z) {
        oz40Var.setValue(Boolean.valueOf(z));
    }
}
