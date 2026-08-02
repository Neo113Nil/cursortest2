package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class j5n extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5n(gds gdsVar, ln0 ln0Var, ej0 ej0Var) {
        super(0);
        this.r = 15;
        this.s = ln0Var;
        this.t = ej0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        char c;
        char c2;
        char c3;
        byte b;
        long j;
        ymn ymnVar;
        long j2;
        long j3;
        dds d;
        axf axfVar;
        mn0 mn0Var;
        int i = this.r;
        int i2 = 9;
        int i3 = 4;
        int i4 = 0;
        boolean z = false;
        int i5 = 2;
        int i6 = 3;
        int i7 = 1;
        Object obj = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                String str = (String) obj2;
                if (str != null) {
                    mn0 mn0Var2 = new mn0(6, str, (ArrayList) null);
                    ClipboardManager clipboardManager = ((de0) ((lp4) obj)).a;
                    List list = mn0Var2.c;
                    if (!(list == null ? c5b.a : list).isEmpty()) {
                        SpannableString spannableString = new SpannableString(str);
                        bnd bndVar = new bnd(28, z ? 1 : 0);
                        bndVar.b = Parcel.obtain();
                        List list2 = list;
                        if (list == null) {
                            list2 = c5b.a;
                        }
                        int size = list2.size();
                        int i8 = 0;
                        List list3 = list2;
                        while (i8 < size) {
                            ln0 ln0Var = (ln0) list3.get(i8);
                            c4r c4rVar = (c4r) ln0Var.a;
                            int i9 = ln0Var.b;
                            int i10 = ln0Var.c;
                            ((Parcel) bndVar.b).recycle();
                            bndVar.b = Parcel.obtain();
                            bcs bcsVar = c4rVar.a;
                            ClipboardManager clipboardManager2 = clipboardManager;
                            long j4 = c4rVar.l;
                            long j5 = c4rVar.h;
                            long j6 = c4rVar.b;
                            List list4 = list3;
                            long a = bcsVar.a();
                            int i11 = size;
                            int i12 = i8;
                            long j7 = d85.n;
                            if (!d85.c(a, j7)) {
                                bndVar.k((byte) 1);
                                ((Parcel) bndVar.b).writeLong(c4rVar.a.a());
                            }
                            long j8 = kes.c;
                            if (!kes.a(j6, j8)) {
                                bndVar.k((byte) 2);
                                bndVar.n(j6);
                            }
                            tqc tqcVar = c4rVar.c;
                            if (tqcVar != null) {
                                bndVar.k((byte) 3);
                                ((Parcel) bndVar.b).writeInt(tqcVar.a);
                            }
                            oqc oqcVar = c4rVar.d;
                            if (oqcVar != null) {
                                int i13 = oqcVar.a;
                                c = 4;
                                bndVar.k((byte) 4);
                                bndVar.k((i13 != 0 && i13 == 1) ? (byte) 1 : (byte) 0);
                            } else {
                                c = 4;
                            }
                            pqc pqcVar = c4rVar.e;
                            if (pqcVar != null) {
                                int i14 = pqcVar.a;
                                bndVar.k((byte) 5);
                                if (i14 == 0) {
                                    b = 0;
                                } else if (i14 == 65535) {
                                    b = 1;
                                } else if (i14 == 1) {
                                    b = 2;
                                } else {
                                    b = i14 == 2 ? (byte) 3 : (byte) 0;
                                    bndVar.k(b);
                                }
                                bndVar.k(b);
                            }
                            String str2 = c4rVar.g;
                            if (str2 != null) {
                                bndVar.k((byte) 6);
                                ((Parcel) bndVar.b).writeString(str2);
                            }
                            if (kes.a(j5, j8)) {
                                c2 = 7;
                            } else {
                                c2 = 7;
                                bndVar.k((byte) 7);
                                bndVar.n(j5);
                            }
                            wu2 wu2Var = c4rVar.i;
                            if (wu2Var != null) {
                                float f = wu2Var.a;
                                c3 = '\b';
                                bndVar.k((byte) 8);
                                bndVar.l(f);
                            } else {
                                c3 = '\b';
                            }
                            ccs ccsVar = c4rVar.j;
                            if (ccsVar != null) {
                                bndVar.k((byte) 9);
                                bndVar.l(ccsVar.a);
                                bndVar.l(ccsVar.b);
                            }
                            if (!d85.c(j4, j7)) {
                                bndVar.k((byte) 10);
                                ((Parcel) bndVar.b).writeLong(j4);
                            }
                            aas aasVar = c4rVar.m;
                            if (aasVar != null) {
                                bndVar.k((byte) 11);
                                ((Parcel) bndVar.b).writeInt(aasVar.a);
                            }
                            otp otpVar = c4rVar.n;
                            if (otpVar != null) {
                                bndVar.k((byte) 12);
                                ((Parcel) bndVar.b).writeLong(otpVar.a);
                                long j9 = otpVar.b;
                                bndVar.l(Float.intBitsToFloat((int) (j9 >> 32)));
                                bndVar.l(Float.intBitsToFloat((int) (j9 & 4294967295L)));
                                bndVar.l(otpVar.c);
                            }
                            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) bndVar.b).marshall(), 0)), i9, i10, 33);
                            i8 = i12 + 1;
                            size = i11;
                            clipboardManager = clipboardManager2;
                            list3 = list4;
                        }
                        str = spannableString;
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", str));
                }
                return Unit.a;
            case 1:
                upi upiVar = (upi) obj2;
                wr5 wr5Var = (wr5) obj;
                Object[] objArr = upiVar.b;
                long[] jArr = upiVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((255 & j10) < 128) {
                                    wr5Var.z(objArr[(i15 << 3) + i17]);
                                }
                                j10 >>= 8;
                            }
                            if (i16 != 8) {
                            }
                        }
                        if (i15 != length) {
                            i15++;
                        }
                    }
                }
                return Unit.a;
            case 2:
                ayn aynVar = ((oxn) obj2).a;
                zxn d2 = aynVar.d();
                x6k x6kVar = aynVar.k;
                Continuation continuation = null;
                wpe wpeVar = d2 != null ? new wpe(d2.a()) : null;
                zxn d3 = aynVar.d();
                if ((d3 != null ? Integer.valueOf(d3.a.a) : null) != null) {
                    aynVar.s.setValue(x6kVar.getValue());
                    x97.y(aynVar.b, null, null, new mj0(aynVar, aynVar.e(), continuation, 6), 3);
                }
                aynVar.m.setValue(new enj(0L));
                x6kVar.setValue(null);
                aynVar.n.setValue(new wpe(wpeVar != null ? wpeVar.a : 0L));
                dyo dyoVar = aynVar.f;
                x97.y(dyoVar.b, null, null, new byo(dyoVar, continuation, i7), 3);
                aynVar.o.setValue(null);
                aynVar.p.setValue(null);
                ((Function0) obj).invoke();
                return Unit.a;
            case 3:
                return Boolean.valueOf(obj2.equals(((ayn) obj).k.getValue()));
            case 4:
                e47 e47Var = (e47) obj2;
                cro croVar = (cro) obj;
                Uri uri = croVar.a;
                String str3 = croVar.b;
                if (str3 == null) {
                    str3 = "";
                }
                e47Var.invoke(new dn(uri, str3));
                return Unit.a;
            case 5:
                ((e47) obj2).invoke(new s7o((bfk) obj));
                return Unit.a;
            case 6:
                ((e47) obj2).invoke(new u7o((en) obj));
                return Unit.a;
            case 7:
                ((e47) obj2).invoke(new s7o((bfk) obj));
                return Unit.a;
            case 8:
                ((e47) obj2).invoke(new u7o((en) obj));
                return Unit.a;
            case 9:
                return Float.valueOf(((Number) ((Function0) ((aqi) obj2).getValue()).invoke()).floatValue() / (((Number) ((aqi) obj).getValue()).floatValue() / 1000.0f));
            case 10:
                lum lumVar = (lum) obj2;
                sbp sbpVar = (sbp) obj;
                kmk kmkVar = sbpVar.h;
                boolean z2 = ((ugk) sbpVar.b.q.get()).a;
                e9k b2 = s9k.b();
                if (b2 != null) {
                    s9k.c(((sbp) lumVar.c).a, b2, kmkVar, z2);
                }
                return Unit.a;
            case 11:
                xep xepVar = (xep) obj2;
                long j11 = ((hqe) ((aqi) obj).getValue()).a;
                ydp e = xepVar.e();
                if (e != null) {
                    xrd d4 = xepVar.d();
                    int i18 = d4 == null ? -1 : yep.a[d4.ordinal()];
                    if (i18 != -1) {
                        if (i18 == 1) {
                            j = weo.y(xepVar, j11, e.a);
                        } else {
                            if (i18 != 2) {
                                if (i18 != 3) {
                                    b6e.s();
                                    return null;
                                }
                                xq0.q("SelectionContainer does not support cursor");
                                return null;
                            }
                            j = weo.y(xepVar, j11, e.b);
                        }
                        return new enj(j);
                    }
                }
                j = 9205357640488583168L;
                return new enj(j);
            case 12:
                g1r g1rVar = (g1r) obj2;
                c4c c4cVar = (c4c) obj;
                if (!Intrinsics.d(g1rVar, c4cVar.a)) {
                    z75.z(c4cVar.b, new hxo(i2, g1rVar));
                    xmn xmnVar = c4cVar.c;
                    if (xmnVar != null && (ymnVar = xmnVar.b) != null) {
                        ymnVar.b(xmnVar, null);
                    }
                }
                return Unit.a;
            case 13:
                ((ktr) obj2).a.z((Surface) obj);
                return Unit.a;
            case 14:
                qbs qbsVar = (qbs) obj2;
                long j12 = ((hqe) ((aqi) obj).getValue()).a;
                enj g = qbsVar.g();
                if (g != null) {
                    long j13 = g.a;
                    axf axfVar2 = qbsVar.d;
                    mn0 mn0Var3 = axfVar2 != null ? axfVar2.a.a : null;
                    if (mn0Var3 != null && mn0Var3.b.length() != 0) {
                        xrd xrdVar = (xrd) qbsVar.r.getValue();
                        int i19 = xrdVar == null ? -1 : sbs.a[xrdVar.ordinal()];
                        if (i19 != -1) {
                            if (i19 == 1 || i19 == 2) {
                                long j14 = qbsVar.k().b;
                                int i20 = rds.c;
                                j3 = j14 >> 32;
                            } else {
                                if (i19 != 3) {
                                    b6e.s();
                                    return null;
                                }
                                long j15 = qbsVar.k().b;
                                int i21 = rds.c;
                                j3 = j15 & 4294967295L;
                            }
                            int i22 = (int) j3;
                            axf axfVar3 = qbsVar.d;
                            if (axfVar3 != null && (d = axfVar3.d()) != null && (axfVar = qbsVar.d) != null && (mn0Var = axfVar.a.a) != null) {
                                int d5 = yhn.d(qbsVar.b.d(i22), 0, mn0Var.b.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d.d(j13) >> 32));
                                cds cdsVar = d.a;
                                ogi ogiVar = cdsVar.b;
                                int e2 = ogiVar.e(d5);
                                float g2 = ogiVar.g(e2);
                                float d6 = cdsVar.d(e2);
                                float c4 = yhn.c(intBitsToFloat, Math.min(g2, d6), Math.max(g2, d6));
                                if (hqe.a(j12, 0L) || Math.abs(intBitsToFloat - c4) <= ((int) (j12 >> 32)) / 2) {
                                    float h = ogiVar.h(e2);
                                    j2 = (Float.floatToRawIntBits(c4) << 32) | (Float.floatToRawIntBits(((ogiVar.c(e2) - h) / 2) + h) & 4294967295L);
                                    return new enj(j2);
                                }
                            }
                        }
                    }
                }
                j2 = 9205357640488583168L;
                return new enj(j2);
            case 15:
                p7g p7gVar = (p7g) ((ln0) obj2).a;
                ej0 ej0Var = (ej0) obj;
                if (p7gVar instanceof o7g) {
                    try {
                        String str4 = ((o7g) p7gVar).a;
                        ej0Var.getClass();
                        try {
                            ej0Var.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                        } catch (ActivityNotFoundException e3) {
                            throw new IllegalArgumentException(ouj.k('.', "Can't open ", str4), e3);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return Unit.a;
            case 16:
                ((z5) obj2).removeOnAttachStateChangeListener((xdu) obj);
                return Unit.a;
            case 17:
                ((z5) obj2).removeOnAttachStateChangeListener((ac8) obj);
                return Unit.a;
            case 18:
                ((nyf) obj2).d((ru2) obj);
                return Unit.a;
            case 19:
                pcg.L((ImageView) obj2, (View) obj);
                return Unit.a;
            case 20:
                ((bpv) ((vtm) obj2).a).b((rtc) obj);
                return Unit.a;
            default:
                yks yksVar = (yks) obj2;
                z6u z6uVar = new z6u((Context) yksVar.b, (ugk) obj, (g0c) yksVar.c);
                u77 u77Var = new u77();
                u77Var.a = t8a.b(new ccp(z6uVar, t8a.b(new y6w(z6uVar, i5))));
                rzm b3 = t8a.b(new y6w(z6uVar, i7));
                u77Var.b = b3;
                t8a.b(new e13(z6uVar, u77Var.a, b3));
                u77Var.c = t8a.b(new y6w(z6uVar, i6));
                u77Var.d = t8a.b(new r79(z6uVar, u77Var.c, t8a.b(new y6w(z6uVar, i3))));
                u77Var.e = t8a.b(new y6w(z6uVar, i4));
                return u77Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5n(int i, Object obj, Object obj2) {
        super(0);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }
}
