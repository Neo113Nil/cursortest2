package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.n;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public abstract class tcv0 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0219, code lost:
    
        if (r5.e(r1) != false) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final CharSequence charSequence, final f530 f530Var, String str, final wp2 wp2Var, long j, long j2, final sjy0 sjy0Var, long j3, final int i, final int i2, int i3, final ety0 ety0Var, final boolean z, final sty0 sty0Var, fid fidVar, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        final String str2;
        final long j4;
        final long j5;
        final int i9;
        bts btsVar;
        final long j6;
        long j7;
        int i10;
        String str3;
        long j8;
        final long j9;
        int i11;
        CharSequence charSequence2;
        boolean z2;
        boolean d;
        Object Q;
        final int i12;
        final long j10;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(210371269);
        if ((i4 & 6) == 0) {
            i6 = ((i4 & 8) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= 128;
        }
        if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i6 |= btsVar2.k(wp2Var) ? 2048 : 1024;
        }
        int i13 = i6 | 1794048;
        if ((12582912 & i4) == 0) {
            i13 |= btsVar2.k(sjy0Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        int i14 = i13 | 100663296;
        if ((805306368 & i4) == 0) {
            i7 = i;
            i14 |= btsVar2.c(i7) ? 536870912 : SelfTester_JCP.IMITA;
        } else {
            i7 = i;
        }
        if ((i5 & 6) == 0) {
            i8 = i5 | (btsVar2.c(i2) ? 4 : 2);
        } else {
            i8 = i5;
        }
        int i15 = i8 | 48;
        if ((i5 & 384) == 0) {
            i15 |= btsVar2.k(ety0Var) ? 256 : 128;
        }
        if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i15 |= btsVar2.a(z) ? 2048 : 1024;
        }
        if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i15 |= btsVar2.k(sty0Var) ? 16384 : 8192;
        }
        int i16 = i15;
        if (btsVar2.V(i14 & 1, ((i14 & 306783379) == 306783378 && (i16 & 9363) == 9362) ? false : true)) {
            btsVar2.a0();
            if ((i4 & 1) == 0 || btsVar2.C()) {
                String obj = charSequence.toString();
                j7 = sty0.c;
                i10 = i14 & (-897);
                str3 = obj;
                j8 = j7;
                j9 = j8;
                i11 = 1;
            } else {
                btsVar2.Y();
                j7 = j;
                j8 = j2;
                j9 = j3;
                i11 = i3;
                i10 = i14 & (-897);
                str3 = str;
            }
            btsVar2.u();
            final long n = tje.n(wp2Var, btsVar2);
            final fwi fwiVar = (fwi) btsVar2.m(j.h);
            int i17 = i11;
            boolean booleanValue = ((Boolean) btsVar2.m(n.a)).booleanValue();
            long j11 = j8;
            LayoutDirection layoutDirection = (LayoutDirection) btsVar2.m(j.n);
            Object Q2 = btsVar2.Q();
            Object obj2 = did.a;
            if (Q2 == obj2) {
                Q2 = new b80(booleanValue, layoutDirection);
                btsVar2.o0(Q2);
            }
            final b80 b80Var = (b80) Q2;
            boolean k = btsVar2.k(str3);
            Object Q3 = btsVar2.Q();
            if (k || Q3 == obj2) {
                Q3 = new g8r0(str3, 17);
                btsVar2.o0(Q3);
            }
            f530 a2 = fnq0.a(f530Var, (tls) Q3);
            z910 d2 = pi6.d(x4c.b, true);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = b.d(btsVar2, a2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            String str4 = str3;
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
            qje.W(btsVar2, d.f, d2);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d3);
            Object Q4 = btsVar2.Q();
            if (Q4 == obj2) {
                Q4 = new omu0(14);
                btsVar2.o0(Q4);
            }
            tls tlsVar = (tls) Q4;
            boolean e = btsVar2.e(b80Var);
            Object Q5 = btsVar2.Q();
            if (e || Q5 == obj2) {
                Q5 = new p9t0(23, b80Var);
                btsVar2.o0(Q5);
            }
            tls tlsVar2 = (tls) Q5;
            boolean e2 = btsVar2.e(b80Var) | btsVar2.k(fwiVar);
            if ((i10 & 14) != 4) {
                if ((i10 & 8) != 0) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = charSequence;
                }
                z2 = false;
                d = e2 | z2 | btsVar2.d(n) | ((i10 & HProv.ALG_CLASS_ALL) != 16384) | ((i10 & ImageMetadata.JPEG_GPS_COORDINATES) != 131072) | ((i10 & 3670016) != 1048576) | ((i10 & 29360128) != 8388608) | ((i10 & 234881024) != 67108864) | ((i10 & 1879048192) != 536870912) | ((i16 & 14) != 4) | ((i16 & 112) != 32) | ((((i16 & 896) ^ 384) <= 256 && btsVar2.k(ety0Var)) || (i16 & 384) == 256) | ((i16 & 7168) != 2048) | ((57344 & i16) == 16384);
                Q = btsVar2.Q();
                if (!d || Q == obj2) {
                    final int i18 = i7;
                    final long j12 = j7;
                    i12 = i17;
                    final CharSequence charSequence3 = charSequence2;
                    j10 = j11;
                    tls tlsVar3 = new tls() { // from class: rcv0
                        /* JADX WARN: Code restructure failed: missing block: B:66:0x01c4, code lost:
                        
                            if (r3 == androidx.compose.ui.unit.LayoutDirection.Ltr) goto L123;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:67:0x01c6, code lost:
                        
                            r5 = 3;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:71:0x01cc, code lost:
                        
                            if (r3 == androidx.compose.ui.unit.LayoutDirection.Ltr) goto L131;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x01c0  */
                        /* JADX WARN: Removed duplicated region for block: B:99:0x010b  */
                        @Override // defpackage.tls
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj3) {
                            long j13;
                            int i19;
                            Typeface typeface;
                            yxr yxrVar;
                            int i20;
                            RobotoTextView robotoTextView = (RobotoTextView) obj3;
                            b80 b80Var2 = b80.this;
                            LayoutDirection layoutDirection2 = b80Var2.b;
                            tty0[] tty0VarArr = sty0.b;
                            long j14 = j12;
                            long j15 = j14 & 1095216660480L;
                            ety0 ety0Var2 = ety0Var;
                            if (j15 == 0) {
                                j14 = ety0Var2.a.b;
                            }
                            CharSequence charSequence4 = b80Var2.c;
                            CharSequence charSequence5 = charSequence3;
                            if (charSequence4 != charSequence5) {
                                b80Var2.c = charSequence5;
                                robotoTextView.setText(charSequence5);
                            }
                            int i21 = b80Var2.d;
                            int i22 = i12;
                            if (i21 != i22) {
                                b80Var2.d = i22;
                                robotoTextView.setMinLines(i22);
                            }
                            boolean z3 = b80Var2.m;
                            fwi fwiVar2 = fwiVar;
                            int i23 = i2;
                            boolean z4 = z;
                            sty0 sty0Var2 = sty0Var;
                            if (z3 == z4 && b80Var2.e == i23 && sty0.a(b80Var2.k, j14) && jl40.l(null, sty0Var2)) {
                                j13 = 0;
                            } else {
                                float i0 = fwiVar2.i0(j14);
                                j13 = 0;
                                Float valueOf = sty0Var2 != null ? Float.valueOf(fwiVar2.i0(sty0Var2.a)) : null;
                                if (z4 && valueOf != null) {
                                    robotoTextView.enableAutoSize(valueOf.floatValue(), i0, i23);
                                } else if (b80Var2.m) {
                                    robotoTextView.disableAutoSize();
                                }
                                b80Var2.m = z4;
                            }
                            if (b80Var2.e != i23) {
                                b80Var2.e = i23;
                                robotoTextView.setMaxLines(i23);
                            }
                            long j16 = b80Var2.f;
                            long j17 = n;
                            if (!ldc.c(j16, j17)) {
                                b80Var2.f = j17;
                                robotoTextView.setTextColor(rzo.X(j17));
                                robotoTextView.setTextLinkColor(rzo.X(j17));
                            }
                            bmt0 bmt0Var = ety0Var2.a;
                            hzr hzrVar = bmt0Var.d;
                            int i24 = hzrVar != null ? hzrVar.a : 0;
                            eyr eyrVar = b80Var2.g;
                            gc90 gc90Var = ety0Var2.b;
                            eyr eyrVar2 = bmt0Var.f;
                            if (eyrVar == eyrVar2 && b80Var2.h == i24) {
                                i19 = 1;
                            } else {
                                b80Var2.g = eyrVar2;
                                b80Var2.h = i24;
                                Context context = robotoTextView.getContext();
                                eyr eyrVar3 = bmt0Var.f;
                                if (eyrVar3 != null) {
                                    ConcurrentHashMap concurrentHashMap = tcv0.a;
                                    Typeface typeface2 = (Typeface) concurrentHashMap.get(eyrVar3);
                                    if (typeface2 != null) {
                                        typeface = typeface2;
                                    } else if ((eyrVar3 instanceof iyr) && (yxrVar = (yxr) a.R(((iyr) eyrVar3).y)) != null && (yxrVar instanceof buj0)) {
                                        typeface = wuj0.b(((buj0) yxrVar).a, context);
                                        if (typeface == null) {
                                            int[] iArr = up11.a;
                                            typeface = eja1.w(0, 0);
                                        }
                                        concurrentHashMap.put(eyrVar3, typeface);
                                    }
                                    i19 = 1;
                                    robotoTextView.setTypeface(typeface, i24 != i19 ? 2 : 0);
                                }
                                i19 = 1;
                                typeface = null;
                                robotoTextView.setTypeface(typeface, i24 != i19 ? 2 : 0);
                            }
                            robotoTextView.setFontFeatureSettings(bmt0Var.g);
                            robotoTextView.setEllipsize(i18 == i19 ? null : TextUtils.TruncateAt.END);
                            long j18 = j10;
                            if ((j18 & 1095216660480L) == j13) {
                                j18 = bmt0Var.h;
                            }
                            if (!sty0.a(b80Var2.i, j18)) {
                                b80Var2.i = j18;
                                robotoTextView.setLetterSpacing(((j18 & 1095216660480L) != j13 && sty0.d(j18)) ? sty0.c(j18) : 0.0f);
                            }
                            long j19 = j9;
                            long j20 = (j19 & 1095216660480L) == j13 ? gc90Var.c : j19;
                            boolean a3 = sty0.a(b80Var2.k, j14);
                            boolean a4 = sty0.a(b80Var2.j, j20);
                            if (!a3 || !a4) {
                                if (!a3) {
                                    b80Var2.k = j14;
                                    if ((j14 & 1095216660480L) != j13) {
                                        robotoTextView.setTextSize(0, fwiVar2.i0(j14));
                                    }
                                }
                                b80Var2.j = j19;
                                if ((j20 & 1095216660480L) != j13) {
                                    Paint.FontMetricsInt fontMetricsInt = robotoTextView.getPaint().getFontMetricsInt();
                                    robotoTextView.setLineSpacing(fwiVar2.i0(j20) - (fontMetricsInt.descent - fontMetricsInt.ascent), 1.0f);
                                }
                            }
                            sjy0 sjy0Var2 = sjy0Var;
                            int i25 = sjy0Var2 != null ? sjy0Var2.a : gc90Var.a;
                            if (b80Var2.l != i25) {
                                b80Var2.l = i25;
                                int i26 = 5;
                                if (i25 != 5) {
                                    if (i25 == 6) {
                                        i20 = 3;
                                    } else if (i25 == 3) {
                                        i20 = 4;
                                    }
                                    robotoTextView.setTextAlignment(i20);
                                    if (b80Var2.a) {
                                        if (i25 != 5) {
                                            if (i25 != 6) {
                                                i26 = i25 == 3 ? 17 : 8388611;
                                            }
                                            robotoTextView.setGravity(i26);
                                        }
                                    }
                                }
                                i20 = 2;
                                robotoTextView.setTextAlignment(i20);
                                if (b80Var2.a) {
                                }
                            }
                            return zy11.a;
                        }
                    };
                    btsVar2 = btsVar2;
                    btsVar2.o0(tlsVar3);
                    Q = tlsVar3;
                } else {
                    i12 = i17;
                    j10 = j11;
                }
                androidx.compose.ui.viewinterop.b.b(tlsVar, null, null, tlsVar2, (tls) Q, btsVar2, 6, 6);
                btsVar2.t(true);
                btsVar = btsVar2;
                j4 = j10;
                j5 = j9;
                i9 = i12;
                j6 = j7;
                str2 = str4;
            } else {
                charSequence2 = charSequence;
            }
            z2 = true;
            d = e2 | z2 | btsVar2.d(n) | ((i10 & HProv.ALG_CLASS_ALL) != 16384) | ((i10 & ImageMetadata.JPEG_GPS_COORDINATES) != 131072) | ((i10 & 3670016) != 1048576) | ((i10 & 29360128) != 8388608) | ((i10 & 234881024) != 67108864) | ((i10 & 1879048192) != 536870912) | ((i16 & 14) != 4) | ((i16 & 112) != 32) | ((((i16 & 896) ^ 384) <= 256 && btsVar2.k(ety0Var)) || (i16 & 384) == 256) | ((i16 & 7168) != 2048) | ((57344 & i16) == 16384);
            Q = btsVar2.Q();
            if (d) {
            }
            final int i182 = i7;
            final long j122 = j7;
            i12 = i17;
            final CharSequence charSequence32 = charSequence2;
            j10 = j11;
            tls tlsVar32 = new tls() { // from class: rcv0
                /* JADX WARN: Code restructure failed: missing block: B:66:0x01c4, code lost:
                
                    if (r3 == androidx.compose.ui.unit.LayoutDirection.Ltr) goto L123;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:67:0x01c6, code lost:
                
                    r5 = 3;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:71:0x01cc, code lost:
                
                    if (r3 == androidx.compose.ui.unit.LayoutDirection.Ltr) goto L131;
                 */
                /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x01c0  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x010b  */
                @Override // defpackage.tls
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj3) {
                    long j13;
                    int i19;
                    Typeface typeface;
                    yxr yxrVar;
                    int i20;
                    RobotoTextView robotoTextView = (RobotoTextView) obj3;
                    b80 b80Var2 = b80.this;
                    LayoutDirection layoutDirection2 = b80Var2.b;
                    tty0[] tty0VarArr = sty0.b;
                    long j14 = j122;
                    long j15 = j14 & 1095216660480L;
                    ety0 ety0Var2 = ety0Var;
                    if (j15 == 0) {
                        j14 = ety0Var2.a.b;
                    }
                    CharSequence charSequence4 = b80Var2.c;
                    CharSequence charSequence5 = charSequence32;
                    if (charSequence4 != charSequence5) {
                        b80Var2.c = charSequence5;
                        robotoTextView.setText(charSequence5);
                    }
                    int i21 = b80Var2.d;
                    int i22 = i12;
                    if (i21 != i22) {
                        b80Var2.d = i22;
                        robotoTextView.setMinLines(i22);
                    }
                    boolean z3 = b80Var2.m;
                    fwi fwiVar2 = fwiVar;
                    int i23 = i2;
                    boolean z4 = z;
                    sty0 sty0Var2 = sty0Var;
                    if (z3 == z4 && b80Var2.e == i23 && sty0.a(b80Var2.k, j14) && jl40.l(null, sty0Var2)) {
                        j13 = 0;
                    } else {
                        float i0 = fwiVar2.i0(j14);
                        j13 = 0;
                        Float valueOf = sty0Var2 != null ? Float.valueOf(fwiVar2.i0(sty0Var2.a)) : null;
                        if (z4 && valueOf != null) {
                            robotoTextView.enableAutoSize(valueOf.floatValue(), i0, i23);
                        } else if (b80Var2.m) {
                            robotoTextView.disableAutoSize();
                        }
                        b80Var2.m = z4;
                    }
                    if (b80Var2.e != i23) {
                        b80Var2.e = i23;
                        robotoTextView.setMaxLines(i23);
                    }
                    long j16 = b80Var2.f;
                    long j17 = n;
                    if (!ldc.c(j16, j17)) {
                        b80Var2.f = j17;
                        robotoTextView.setTextColor(rzo.X(j17));
                        robotoTextView.setTextLinkColor(rzo.X(j17));
                    }
                    bmt0 bmt0Var = ety0Var2.a;
                    hzr hzrVar = bmt0Var.d;
                    int i24 = hzrVar != null ? hzrVar.a : 0;
                    eyr eyrVar = b80Var2.g;
                    gc90 gc90Var = ety0Var2.b;
                    eyr eyrVar2 = bmt0Var.f;
                    if (eyrVar == eyrVar2 && b80Var2.h == i24) {
                        i19 = 1;
                    } else {
                        b80Var2.g = eyrVar2;
                        b80Var2.h = i24;
                        Context context = robotoTextView.getContext();
                        eyr eyrVar3 = bmt0Var.f;
                        if (eyrVar3 != null) {
                            ConcurrentHashMap concurrentHashMap = tcv0.a;
                            Typeface typeface2 = (Typeface) concurrentHashMap.get(eyrVar3);
                            if (typeface2 != null) {
                                typeface = typeface2;
                            } else if ((eyrVar3 instanceof iyr) && (yxrVar = (yxr) a.R(((iyr) eyrVar3).y)) != null && (yxrVar instanceof buj0)) {
                                typeface = wuj0.b(((buj0) yxrVar).a, context);
                                if (typeface == null) {
                                    int[] iArr = up11.a;
                                    typeface = eja1.w(0, 0);
                                }
                                concurrentHashMap.put(eyrVar3, typeface);
                            }
                            i19 = 1;
                            robotoTextView.setTypeface(typeface, i24 != i19 ? 2 : 0);
                        }
                        i19 = 1;
                        typeface = null;
                        robotoTextView.setTypeface(typeface, i24 != i19 ? 2 : 0);
                    }
                    robotoTextView.setFontFeatureSettings(bmt0Var.g);
                    robotoTextView.setEllipsize(i182 == i19 ? null : TextUtils.TruncateAt.END);
                    long j18 = j10;
                    if ((j18 & 1095216660480L) == j13) {
                        j18 = bmt0Var.h;
                    }
                    if (!sty0.a(b80Var2.i, j18)) {
                        b80Var2.i = j18;
                        robotoTextView.setLetterSpacing(((j18 & 1095216660480L) != j13 && sty0.d(j18)) ? sty0.c(j18) : 0.0f);
                    }
                    long j19 = j9;
                    long j20 = (j19 & 1095216660480L) == j13 ? gc90Var.c : j19;
                    boolean a3 = sty0.a(b80Var2.k, j14);
                    boolean a4 = sty0.a(b80Var2.j, j20);
                    if (!a3 || !a4) {
                        if (!a3) {
                            b80Var2.k = j14;
                            if ((j14 & 1095216660480L) != j13) {
                                robotoTextView.setTextSize(0, fwiVar2.i0(j14));
                            }
                        }
                        b80Var2.j = j19;
                        if ((j20 & 1095216660480L) != j13) {
                            Paint.FontMetricsInt fontMetricsInt = robotoTextView.getPaint().getFontMetricsInt();
                            robotoTextView.setLineSpacing(fwiVar2.i0(j20) - (fontMetricsInt.descent - fontMetricsInt.ascent), 1.0f);
                        }
                    }
                    sjy0 sjy0Var2 = sjy0Var;
                    int i25 = sjy0Var2 != null ? sjy0Var2.a : gc90Var.a;
                    if (b80Var2.l != i25) {
                        b80Var2.l = i25;
                        int i26 = 5;
                        if (i25 != 5) {
                            if (i25 == 6) {
                                i20 = 3;
                            } else if (i25 == 3) {
                                i20 = 4;
                            }
                            robotoTextView.setTextAlignment(i20);
                            if (b80Var2.a) {
                                if (i25 != 5) {
                                    if (i25 != 6) {
                                        i26 = i25 == 3 ? 17 : 8388611;
                                    }
                                    robotoTextView.setGravity(i26);
                                }
                            }
                        }
                        i20 = 2;
                        robotoTextView.setTextAlignment(i20);
                        if (b80Var2.a) {
                        }
                    }
                    return zy11.a;
                }
            };
            btsVar2 = btsVar2;
            btsVar2.o0(tlsVar32);
            Q = tlsVar32;
            androidx.compose.ui.viewinterop.b.b(tlsVar, null, null, tlsVar2, (tls) Q, btsVar2, 6, 6);
            btsVar2.t(true);
            btsVar = btsVar2;
            j4 = j10;
            j5 = j9;
            i9 = i12;
            j6 = j7;
            str2 = str4;
        } else {
            btsVar2.Y();
            str2 = str;
            j4 = j2;
            j5 = j3;
            i9 = i3;
            btsVar = btsVar2;
            j6 = j;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: scv0
                @Override // defpackage.wls
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int O = vng.O(i4 | 1);
                    int O2 = vng.O(i5);
                    tcv0.a(charSequence, f530Var, str2, wp2Var, j6, j4, sjy0Var, j5, i, i2, i9, ety0Var, z, sty0Var, (fid) obj3, O, O2);
                    return zy11.a;
                }
            };
        }
    }
}
