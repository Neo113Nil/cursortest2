package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input;

import android.graphics.BlurMaskFilter;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.j;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.a7b;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b1w;
import defpackage.b5a;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cot;
import defpackage.cvu0;
import defpackage.did;
import defpackage.eja1;
import defpackage.evu0;
import defpackage.exw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fvb;
import defpackage.fwi;
import defpackage.gty0;
import defpackage.i3r;
import defpackage.jl40;
import defpackage.jvb;
import defpackage.jvu0;
import defpackage.l5i0;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lub;
import defpackage.lvb;
import defpackage.ly3;
import defpackage.lzr;
import defpackage.nfh;
import defpackage.nub;
import defpackage.nxw0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oub;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.px40;
import defpackage.q791;
import defpackage.qam;
import defpackage.qeb1;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rcb1;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.sty0;
import defpackage.teb;
import defpackage.tls;
import defpackage.tx40;
import defpackage.un1;
import defpackage.v45;
import defpackage.w511;
import defpackage.w6u;
import defpackage.wls;
import defpackage.wqy0;
import defpackage.wu60;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.yx40;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input.a;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(final lub lubVar, final long j, final long j2, final long j3, final wls wlsVar, final sls slsVar, final tls tlsVar, final sls slsVar2, fid fidVar, final int i) {
        bts btsVar;
        boolean z;
        String N;
        String v;
        String str = lubVar.h;
        String str2 = lubVar.f;
        String str3 = lubVar.e;
        List list = lubVar.d;
        int i2 = lubVar.b;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-426682898);
        int i3 = i | (btsVar2.k(lubVar) ? 4 : 2) | (btsVar2.d(j) ? 32 : 16) | (btsVar2.d(j2) ? 256 : 128) | (btsVar2.d(j3) ? 2048 : 1024) | (btsVar2.e(wlsVar) ? 16384 : 8192) | (btsVar2.e(slsVar) ? 131072 : 65536) | (btsVar2.e(tlsVar) ? 1048576 : 524288) | (btsVar2.e(slsVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar2.V(i3 & 1, (i3 & 4793491) != 4793490)) {
            int i4 = lubVar.a;
            if (i4 < i2) {
                i4 = i2;
            }
            int i5 = lubVar.c;
            double e = e(i4, i5, list);
            double e2 = e(i2, i5, list);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.g(i4);
                btsVar2.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            Integer valueOf = Integer.valueOf(i4);
            boolean c = btsVar2.c(i4);
            Object Q2 = btsVar2.Q();
            if (c || Q2 == o430Var) {
                Q2 = new CircleInputKt$CircleInput$1$1(i4, yx40Var, null);
                btsVar2.o0(Q2);
            }
            zpn.e(btsVar2, (wls) Q2, valueOf);
            f530 m = an91.m(ljs0.c(c530.a, 1.0f), 43.0f, 0.0f, 2);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar2, m);
            ohd.G1.getClass();
            sls slsVar3 = androidx.compose.ui.node.d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar3);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
            wls wlsVar2 = androidx.compose.ui.node.d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar2);
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
            List list2 = lubVar.k;
            boolean c2 = ((i3 & 14) == 4) | btsVar2.c(i5);
            Object Q3 = btsVar2.Q();
            if (c2 || Q3 == o430Var) {
                z = true;
                Q3 = new v45(lubVar, i5, yx40Var, 1 == true ? 1 : 0);
                btsVar2.o0(Q3);
            } else {
                z = true;
            }
            tls tlsVar2 = (tls) Q3;
            boolean z2 = (i3 & 3670016) == 1048576 ? z : false;
            Object Q4 = btsVar2.Q();
            if (z2 || Q4 == o430Var) {
                Q4 = new a7b(19, tlsVar, yx40Var);
                btsVar2.o0(Q4);
            }
            int i6 = i3 << 6;
            b(null, e, e2, j, j2, list2, j3, tlsVar2, (tls) Q4, slsVar2, btsVar2, (3670016 & (i3 << 9)) | (64512 & i6) | (i6 & 1879048192));
            if (yx40Var.getIntValue() <= i2) {
                v = str3;
            } else {
                int intValue = yx40Var.getIntValue() / 1000;
                int intValue2 = yx40Var.getIntValue() % 1000;
                if (intValue > 0) {
                    N = intValue + (char) 8201 + evu0.N(MoneyInputEditView.DEFAULT_VALUE, 3, String.valueOf(intValue2));
                } else {
                    N = evu0.N(MoneyInputEditView.DEFAULT_VALUE, 3, String.valueOf(intValue2));
                }
                v = cvu0.v(str2, str, N, false);
            }
            c(v, yx40Var.getIntValue() <= i2 ? str3 : cvu0.v(str2, str, String.valueOf(yx40Var.getIntValue()), false), lubVar.g, lubVar.i, lubVar.j, wlsVar, slsVar, btsVar2, (i3 << 3) & 4128768);
            btsVar = btsVar2;
            btsVar.t(z);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new wls(j, j2, j3, wlsVar, slsVar, tlsVar, slsVar2, i) { // from class: mub
                public final /* synthetic */ sls A;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long w;
                public final /* synthetic */ wls x;
                public final /* synthetic */ sls y;
                public final /* synthetic */ tls z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    a.a(lub.this, this.b, this.c, this.w, this.x, this.y, this.z, this.A, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(f530 f530Var, final double d, final double d2, final long j, final long j2, final List list, final long j3, final tls tlsVar, final tls tlsVar2, final sls slsVar, fid fidVar, final int i) {
        f530 f530Var2;
        Object obj;
        oz40 oz40Var;
        int i2;
        Object jvbVar;
        int i3;
        w6u w6uVar;
        zy11 zy11Var;
        Object obj2;
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1188056712);
        int i5 = i | 6;
        if ((i & 48) == 0) {
            i5 |= btsVar.j(d) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= btsVar.j(d2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i5 |= btsVar.d(j) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i5 |= btsVar.d(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= btsVar.e(list) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= btsVar.d(j3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= btsVar.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            i5 |= btsVar.e(tlsVar2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i5 |= btsVar.e(slsVar) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if (btsVar.V(i5 & 1, (i5 & 306783379) != 306783378)) {
            Object Q = btsVar.Q();
            Object obj3 = did.a;
            if (Q == obj3) {
                Q = f.g(0);
                btsVar.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == obj3) {
                Q2 = f.g(0);
                btsVar.o0(Q2);
            }
            yx40 yx40Var2 = (yx40) Q2;
            Object Q3 = btsVar.Q();
            if (Q3 == obj3) {
                Q3 = f.f(0.0f);
                btsVar.o0(Q3);
            }
            final tx40 tx40Var = (tx40) Q3;
            Object Q4 = btsVar.Q();
            if (Q4 == obj3) {
                obj = obj3;
                Q4 = f.j(new wu60(0L));
                btsVar.o0(Q4);
            } else {
                obj = obj3;
            }
            oz40 oz40Var2 = (oz40) Q4;
            Object Q5 = btsVar.Q();
            Object obj4 = obj;
            if (Q5 == obj4) {
                Q5 = m.a(d);
                btsVar.o0(Q5);
            }
            px40 px40Var = (px40) Q5;
            Object Q6 = btsVar.Q();
            if (Q6 == obj4) {
                Q6 = m.a(d);
                btsVar.o0(Q6);
            }
            px40 px40Var2 = (px40) Q6;
            final float w0 = ((fwi) btsVar.m(j.h)).w0(56.0f);
            w6u w6uVar2 = (w6u) btsVar.m(j.l);
            Double valueOf = Double.valueOf(d);
            boolean z = (i5 & 112) == 32;
            Object Q7 = btsVar.Q();
            if (z || Q7 == obj4) {
                Q7 = new CircularProgressBarKt$CircularProgressBar$1$1(d, px40Var, null);
                btsVar.o0(Q7);
            }
            zpn.e(btsVar, (wls) Q7, valueOf);
            c530 c530Var = c530.a;
            f530 m = ljs0.m(c530Var, 288.0f);
            boolean b = btsVar.b(w0);
            px40 px40Var3 = px40Var;
            Object Q8 = btsVar.Q();
            if (b || Q8 == obj4) {
                Q8 = new fvb(w0, yx40Var, yx40Var2, oz40Var2, tx40Var);
                oz40Var = oz40Var2;
                btsVar.o0(Q8);
            } else {
                oz40Var = oz40Var2;
            }
            f530 y = eja1.y(m, (tls) Q8);
            int i6 = 234881024 & i5;
            int i7 = i5 & 896;
            int i8 = 29360128 & i5;
            boolean e = (i6 == 67108864) | ((1879048192 & i5) == 536870912) | (i7 == 256) | (i8 == 8388608) | btsVar.e(w6uVar2);
            Object Q9 = btsVar.Q();
            if (e || Q9 == obj4) {
                i2 = i6;
                i3 = SelfTester_JCP.ENCRYPT_CNT;
                jvbVar = new jvb(slsVar, tlsVar2, px40Var3, d2, tlsVar, w6uVar2, oz40Var, px40Var2);
                w6uVar = w6uVar2;
                px40Var3 = px40Var3;
                btsVar.o0(jvbVar);
            } else {
                jvbVar = Q9;
                i2 = i6;
                w6uVar = w6uVar2;
                i3 = SelfTester_JCP.ENCRYPT_CNT;
            }
            zy11 zy11Var2 = zy11.a;
            f530 a = exw0.a(y, zy11Var2, (PointerInputEventHandler) jvbVar);
            boolean e2 = (i2 == 67108864) | (i7 == 256) | (i8 == i3) | btsVar.e(w6uVar);
            Object Q10 = btsVar.Q();
            if (e2 || Q10 == obj4) {
                zy11Var = zy11Var2;
                oz40 oz40Var3 = oz40Var;
                Object lvbVar = new lvb(d2, tlsVar, w6uVar, tlsVar2, oz40Var3, px40Var3, px40Var2);
                oz40Var = oz40Var3;
                btsVar.o0(lvbVar);
                Q10 = lvbVar;
            } else {
                zy11Var = zy11Var2;
            }
            f530 a2 = exw0.a(a, zy11Var, (PointerInputEventHandler) Q10);
            boolean b2 = btsVar.b(w0) | ((i5 & 7168) == 2048) | ((57344 & i5) == 16384) | btsVar.e(list) | ((3670016 & i5) == 1048576);
            Object Q11 = btsVar.Q();
            if (b2 || Q11 == obj4) {
                f530Var2 = c530Var;
                final px40 px40Var4 = px40Var3;
                final oz40 oz40Var4 = oz40Var;
                i4 = 0;
                obj2 = new tls() { // from class: gvb
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        float floatValue;
                        qam qamVar = (qam) obj5;
                        tx40 tx40Var2 = tx40Var;
                        float floatValue2 = tx40Var2.getFloatValue();
                        float f = w0;
                        float f2 = f / 2.4f;
                        zy11 zy11Var3 = zy11.a;
                        if (floatValue2 > f2) {
                            float floatValue3 = tx40Var2.getFloatValue();
                            long e3 = wu60.e(qamVar.P(), (Float.floatToRawIntBits(floatValue3) << 32) | (Float.floatToRawIntBits(floatValue3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                            float f3 = floatValue3 * 2.0f;
                            long floatToRawIntBits = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            jvu0 jvu0Var = new jvu0(1, 0, 26, f, 0.0f);
                            long j4 = j;
                            qamVar.F(j4, 100.0f, 340.0f, false, e3, floatToRawIntBits, (r25 & 128) != 0 ? i3r.a : jvu0Var, (r25 & 512) != 0 ? 3 : 0);
                            long j5 = j2;
                            a.i(qamVar, floatValue3, f, j5, 100.0f, 340.0f);
                            float floatValue4 = tx40Var2.getFloatValue();
                            oz40 oz40Var5 = oz40Var4;
                            a.h(qamVar, floatValue4, f, ((wu60) oz40Var5.getValue()).a, 0.0f, 269.0f, j5);
                            px40 px40Var5 = px40Var4;
                            float abs = Math.abs((float) px40Var5.getDoubleValue());
                            float floatValue5 = tx40Var2.getFloatValue();
                            List list2 = list;
                            a.g(qamVar, floatValue5, f, 100.0f, abs, list2);
                            if (px40Var5.getDoubleValue() >= 90.0d) {
                                a.j(qamVar, tx40Var2.getFloatValue(), f, j4, j5);
                                a.h(qamVar, tx40Var2.getFloatValue(), f, ((wu60) oz40Var5.getValue()).a, 270.0f, 360.0f, j5);
                            }
                            float abs2 = Math.abs((float) px40Var5.getDoubleValue());
                            a.g(qamVar, tx40Var2.getFloatValue(), f, 270.0f, abs2 > 180.0f ? abs2 - 180.0f : 0.0f, list2);
                            floatValue = tx40Var2.getFloatValue();
                            double doubleValue = px40Var5.getDoubleValue();
                            long b3 = ldc.b(ldc.b, 0.2f, 0.0f, 0.0f, 0.0f, 14);
                            float f4 = f / 2.0f;
                            double d3 = 0.9449999928474426d * doubleValue;
                            long f5 = wu60.f(qamVar.P(), (Float.floatToRawIntBits(((float) Math.cos(((Math.abs(d3) + 100.0d) * 3.141592653589793d) / 180.0d)) * floatValue) << 32) | (Float.floatToRawIntBits(((float) Math.sin(((Math.abs(d3) + 100.0d) * 3.141592653589793d) / 180.0d)) * floatValue) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                            i28 q = qamVar.N().q();
                            eb2 eb2Var = new eb2();
                            eb2Var.f(b3);
                            eb2Var.a.setMaskFilter(new BlurMaskFilter(15.0f, BlurMaskFilter.Blur.NORMAL));
                            q.t(f4, f5, eb2Var);
                            qam.z(qamVar, j3, f4, f5, 0.0f, null, 0, 120);
                            a.f(qamVar, j5, floatValue, doubleValue, -20, 10);
                            a.f(qamVar, j5, floatValue, doubleValue, 0, 10);
                            a.f(qamVar, j5, floatValue, doubleValue, 20, 10);
                            a.f(qamVar, j5, floatValue, doubleValue, -20, -10);
                            a.f(qamVar, j5, floatValue, doubleValue, 0, -10);
                            a.f(qamVar, j5, floatValue, doubleValue, 20, -10);
                            if (px40Var5.getDoubleValue() < 90.0d) {
                                a.j(qamVar, tx40Var2.getFloatValue(), f, j4, j5);
                                a.h(qamVar, tx40Var2.getFloatValue(), f, ((wu60) oz40Var5.getValue()).a, 270.0f, 360.0f, j5);
                            }
                        }
                        return zy11Var3;
                    }
                };
                btsVar.o0(obj2);
            } else {
                obj2 = Q11;
                f530Var2 = c530Var;
                i4 = 0;
            }
            qeb1.a(i4, btsVar, (tls) obj2, a2);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final f530 f530Var3 = f530Var2;
            v.d = new wls() { // from class: hvb
                @Override // defpackage.wls
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int O = vng.O(i | 1);
                    a.b(f530.this, d, d2, j, j2, list, j3, tlsVar, tlsVar2, slsVar, (fid) obj5, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(String str, String str2, gty0 gty0Var, CharSequence charSequence, boolean z, wls wlsVar, sls slsVar, fid fidVar, int i) {
        String str3;
        int i2;
        String str4;
        boolean z2;
        ldc ldcVar;
        sty0 sty0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1585870182);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (btsVar.k(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(gty0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(charSequence) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.a(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(wlsVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.e(slsVar) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 599187) != 599186)) {
            if (z || charSequence == null) {
                str4 = str2;
            } else {
                str4 = str2 + Extension.FIX_SPACE + ((Object) charSequence);
            }
            so5 so5Var = x4c.H;
            boolean k = btsVar.k(str4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new b5a(str4, 29);
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 d = q791.d(fnq0.b(c530Var, true, (tls) Q), false, null, null, slsVar, 15);
            sic a = qic.a(lr20.c, so5Var, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar2 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            if (wlsVar == null) {
                btsVar.e0(1421648896);
                btsVar.t(false);
            } else {
                btsVar.e0(1421648897);
                wlsVar.invoke(btsVar, 0);
                ly3.B(c530Var, 6.0f, btsVar, false);
            }
            long j = (gty0Var == null || (sty0Var = gty0Var.a) == null) ? sty0.c : sty0Var.a;
            lzr lzrVar = gty0Var != null ? gty0Var.b : null;
            long j2 = (gty0Var == null || (ldcVar = gty0Var.c) == null) ? ldc.b : ldcVar.a;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new teb(20);
                btsVar.o0(Q2);
            }
            wqy0.b(str3, fnq0.a(c530Var, (tls) Q2), j2, j, null, lzrVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar, i3 & 14, 0, 131024);
            btsVar = btsVar;
            if (charSequence == null) {
                btsVar.e0(1422022570);
                btsVar.t(false);
                z2 = true;
            } else {
                btsVar.e0(1422022571);
                z2 = true;
                rcb1.c(null, z, 0, null, wwg.S(-1239491391, true, new un1(8, charSequence), btsVar), btsVar, ((i3 >> 9) & 112) | HProv.ALG_CLASS_DATA_ENCRYPT, 13);
                btsVar.t(false);
            }
            btsVar.t(z2);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nub(str, str2, gty0Var, charSequence, z, wlsVar, slsVar, i, 0);
        }
    }

    public static final double d(long j, long j2) {
        boolean z = Float.intBitsToFloat((int) (j >> 32)) < Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) < Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        if (z) {
            return Math.toDegrees(Math.atan2(Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat(r0) - Float.intBitsToFloat(r1))) + 270.0d;
        }
        if (!z) {
            return 90.0d - Math.toDegrees(Math.atan2(Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat(r1) - Float.intBitsToFloat(r0)));
        }
        w511.b();
        return 0.0d;
    }

    public static final double e(int i, int i2, List list) {
        if (i <= 0) {
            return 0.0d;
        }
        if (i >= i2) {
            return 360.0d;
        }
        List<b1w> x0 = kotlin.collections.a.x0(list, new oub());
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (b1w b1wVar : x0) {
            int i6 = b1wVar.a;
            i4 = x4e.c(i6, i5, b1wVar.b, i4);
            i5 = i6;
        }
        int i7 = 0;
        for (b1w b1wVar2 : x0) {
            int i8 = b1wVar2.a;
            int i9 = b1wVar2.b;
            if (i <= i8) {
                return (x4e.c(i, i7, i9, i3) / i4) * 360.0d;
            }
            i3 = x4e.c(i8, i7, i9, i3);
            i7 = i8;
        }
        double c = x4e.c(i, i7, ((b1w) kotlin.collections.a.b0(x0)) != null ? r8.b : 1, i3) / i4;
        if (c > 1.0d) {
            c = 1.0d;
        }
        return c * 360.0d;
    }

    public static final void f(qam qamVar, long j, float f, double d, int i, int i2) {
        long P = qamVar.P();
        double d2 = 0.9449999928474426d * d;
        float cos = (((float) Math.cos(((Math.abs(d2) + 100.0d) * 3.141592653589793d) / 180.0d)) * f) + i;
        float sin = (((float) Math.sin(((Math.abs(d2) + 100.0d) * 3.141592653589793d) / 180.0d)) * f) + i2;
        qam.z(qamVar, j, 5.0f, wu60.f(P, (Float.floatToRawIntBits(cos) << 32) | (Float.floatToRawIntBits(sin) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), 0.0f, null, 0, 120);
    }

    public static final void g(qam qamVar, float f, float f2, float f3, float f4, List list) {
        long P = qamVar.P();
        nfh N = qamVar.N();
        long v = N.v();
        N.q().save();
        try {
            ((cot) N.a).j(90.0f, P);
            float f5 = 2.0f * f;
            qam.M(qamVar, new nxw0(9205357640488583168L, list, null), f3 - 90.0f, f4 * 0.945f, wu60.e(qamVar.P(), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), new jvu0(1, 2, 18, f2, 0.0f), 832);
        } finally {
            b64.C(N, v);
        }
    }

    public static final void h(qam qamVar, float f, float f2, long j, float f3, float f4, long j2) {
        float f5;
        qam qamVar2 = qamVar;
        float f6 = f - (f2 / 7.0f);
        int i = 1;
        while (true) {
            float f7 = (i * 360.0f) / 32.0f;
            if (f7 < f3 || f7 > f4) {
                f5 = f6;
            } else {
                double d = (f7 * 3.141592653589793d) / 180.0d;
                double d2 = 1.5707963267948966d + d;
                double cos = Math.cos(d);
                double d3 = -Math.sin(d);
                double d4 = f6;
                f5 = f6;
                int i2 = (int) (j >> 32);
                float cos2 = (float) ((Math.cos(d2) * d4) + Float.intBitsToFloat(i2) + d3);
                double sin = Math.sin(d2) * d4;
                int i3 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float intBitsToFloat = (float) (sin + Float.intBitsToFloat(i3) + cos);
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(cos2) << 32);
                float cos3 = (float) ((Math.cos(d2) * d4) + Float.intBitsToFloat(i2) + d3);
                float sin2 = (float) ((Math.sin(d2) * d4) + qamVar2.w0(16.0f) + Float.intBitsToFloat(i3) + cos);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(cos3) << 32) | (Float.floatToRawIntBits(sin2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                nfh N = qamVar2.N();
                long v = N.v();
                N.q().save();
                try {
                    ((cot) N.a).j(f7, floatToRawIntBits);
                    qamVar2.h(ldc.b(j2, 0.3f, 0.0f, 0.0f, 0.0f, 14), floatToRawIntBits, floatToRawIntBits2, qamVar2.w0(2.0f), (r21 & 16) != 0 ? 0 : 1, (r21 & 32) != 0 ? null : null);
                } finally {
                    b64.C(N, v);
                }
            }
            if (i == 31) {
                return;
            }
            i++;
            qamVar2 = qamVar;
            f6 = f5;
        }
    }

    public static final void i(qam qamVar, float f, float f2, long j, float f3, float f4) {
        ldc ldcVar = new ldc(ldc.b);
        long j2 = ldc.l;
        float f5 = 2.0f * f;
        qam.M(qamVar, new l5i0(scc.g(ldcVar, new ldc(j2)), null, qamVar.P(), f - (f2 / 2.4f), 0), f3, f4, wu60.e(qamVar.P(), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), new jvu0(1, 0, 26, f2, 0.0f), 832);
        Pair[] pairArr = {new Pair(Float.valueOf(0.85f), new ldc(j2)), new Pair(Float.valueOf(3.0f), new ldc(j))};
        long P = qamVar.P();
        float f6 = (f2 / 1.2f) + f;
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(new ldc(((ldc) pairArr[i].f()).a));
        }
        ArrayList arrayList2 = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList2.add(Float.valueOf(((Number) pairArr[i2].c()).floatValue()));
        }
        qam.M(qamVar, new l5i0(arrayList, arrayList2, P, f6, 0), f3, f4, wu60.e(qamVar.P(), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), new jvu0(1, 0, 26, f2, 0.0f), 832);
    }

    public static final void j(qam qamVar, float f, float f2, long j, long j2) {
        float f3 = 2.0f * f;
        qamVar.F(j, 30.0f, 50.0f, false, wu60.e(qamVar.P(), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (r25 & 128) != 0 ? i3r.a : new jvu0(1, 0, 26, f2, 0.0f), (r25 & 512) != 0 ? 3 : 0);
        i(qamVar, f, f2, j2, 30.0f, 50.0f);
    }
}
