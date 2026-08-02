package defpackage;

import android.graphics.Rect;
import android.text.Spanned;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.core.view.b;
import com.google.ar.core.ImageMetadata;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class zgb1 {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final CharSequence charSequence, f530 f530Var, int i, boolean z, String str, so31 so31Var, boolean z2, w4a1 w4a1Var, fid fidVar, int i2, int i3) {
        int i4;
        f530 f530Var2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        String str2;
        int i9;
        so31 so31Var2;
        int i10;
        boolean z4;
        int i11;
        int i12;
        bts btsVar;
        f530 f530Var3;
        int i13;
        so31 so31Var3;
        boolean z5;
        boolean z6;
        String str3;
        w4a1 w4a1Var2;
        aii0 v;
        int i14;
        final so31 so31Var4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1358636267);
        if ((i2 & 6) == 0) {
            i4 = (btsVar2.e(charSequence) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            f530Var2 = f530Var;
            i4 |= btsVar2.k(f530Var2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 = i;
                i4 |= btsVar2.c(i6) ? 256 : 128;
                i7 = i3 & 8;
                if (i7 != 0) {
                    i4 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    z3 = z;
                    i4 |= btsVar2.a(z3) ? 2048 : 1024;
                    i8 = i3 & 16;
                    if (i8 == 0) {
                        i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        str2 = str;
                        i4 |= btsVar2.k(str2) ? 16384 : 8192;
                        i9 = i3 & 32;
                        if (i9 != 0) {
                            i4 |= ImageMetadata.EDGE_MODE;
                            so31Var2 = so31Var;
                        } else {
                            so31Var2 = so31Var;
                            if ((i2 & ImageMetadata.EDGE_MODE) == 0) {
                                i4 |= btsVar2.k(so31Var2) ? 131072 : 65536;
                            }
                        }
                        i10 = i3 & 64;
                        if (i10 != 0) {
                            i4 |= 1572864;
                            z4 = z2;
                        } else {
                            z4 = z2;
                            if ((i2 & 1572864) == 0) {
                                i4 |= btsVar2.a(z4) ? 1048576 : 524288;
                            }
                        }
                        i11 = i3 & 128;
                        int i16 = i4;
                        if (i11 != 0) {
                            i16 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i16 |= btsVar2.k(w4a1Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        }
                        i12 = i16;
                        if (btsVar2.V(i12 & 1, (i12 & 4793491) != 4793490)) {
                            f530 f530Var4 = i15 != 0 ? c530.a : f530Var2;
                            final int i17 = i5 != 0 ? 17 : i6;
                            final boolean z7 = i7 != 0 ? false : z3;
                            final String str4 = i8 != 0 ? null : str2;
                            if (i9 != 0) {
                                so31Var4 = null;
                                i14 = i11;
                            } else {
                                i14 = i11;
                                so31Var4 = so31Var2;
                            }
                            final boolean z8 = i10 != 0 ? true : z4;
                            final w4a1 w4a1Var3 = i14 != 0 ? irn.b : w4a1Var;
                            Object Q = btsVar2.Q();
                            o430 o430Var = did.a;
                            if (Q == o430Var) {
                                Q = f.j(Boolean.FALSE);
                                btsVar2.o0(Q);
                            }
                            final oz40 oz40Var = (oz40) Q;
                            Object Q2 = btsVar2.Q();
                            if (Q2 == o430Var) {
                                Q2 = new jv8(20);
                                btsVar2.o0(Q2);
                            }
                            tls tlsVar = (tls) Q2;
                            Object Q3 = btsVar2.Q();
                            if (Q3 == o430Var) {
                                Q3 = new jv8(21);
                                btsVar2.o0(Q3);
                            }
                            tls tlsVar2 = (tls) Q3;
                            boolean e = ((i12 & 896) == 256) | btsVar2.e(charSequence) | ((3670016 & i12) == 1048576) | ((57344 & i12) == 16384) | ((458752 & i12) == 131072) | ((i12 & 7168) == 2048) | ((29360128 & i12) == 8388608);
                            Object Q4 = btsVar2.Q();
                            if (e || Q4 == o430Var) {
                                tls tlsVar3 = new tls() { // from class: fj9
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj) {
                                        final TextView textView = (TextView) obj;
                                        textView.setText(charSequence);
                                        textView.setTypeface(ngd0.s(0, lzr.D));
                                        textView.setGravity(i17);
                                        textView.setFontFeatureSettings("pnum, lnum");
                                        textView.setIncludeFontPadding(z8);
                                        textView.setContentDescription(str4);
                                        b.p(textView, so31Var4 != null ? so31.b : null);
                                        textView.setAccessibilityHeading(z7);
                                        irn irnVar = irn.b;
                                        w4a1 w4a1Var4 = w4a1Var3;
                                        if (!jl40.l(w4a1Var4, irnVar)) {
                                            if (w4a1Var4 instanceof krn) {
                                                textView.setEllipsize(((krn) w4a1Var4).b);
                                                oz40 oz40Var2 = oz40Var;
                                                if (!((Boolean) oz40Var2.getValue()).booleanValue()) {
                                                    oz40Var2.setValue(Boolean.TRUE);
                                                    textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.yandex.taxi.logistics.sdk.ui.component.text.CharSequenceTextKt$ellipsize$1
                                                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                                        public void onGlobalLayout() {
                                                            TextView textView2 = textView;
                                                            Rect rect = new Rect();
                                                            textView2.getLineBounds(0, rect);
                                                            int i18 = rect.bottom - rect.top;
                                                            if (i18 == 0) {
                                                                return;
                                                            }
                                                            TextView textView3 = textView;
                                                            textView3.setMaxLines(textView3.getHeight() / i18);
                                                            textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                                        }
                                                    });
                                                }
                                            } else {
                                                if (!(w4a1Var4 instanceof jrn)) {
                                                    w511.b();
                                                    return null;
                                                }
                                                jrn jrnVar = (jrn) w4a1Var4;
                                                textView.setEllipsize(jrnVar.c);
                                                textView.setMaxLines(jrnVar.b);
                                            }
                                        }
                                        return zy11.a;
                                    }
                                };
                                btsVar2.o0(tlsVar3);
                                Q4 = tlsVar3;
                            }
                            f530 f530Var5 = f530Var4;
                            androidx.compose.ui.viewinterop.b.b(tlsVar, f530Var5, tlsVar2, null, (tls) Q4, btsVar2, (i12 & 112) | 390, 8);
                            btsVar = btsVar2;
                            so31 so31Var5 = so31Var4;
                            str3 = str4;
                            z5 = z7;
                            so31Var3 = so31Var5;
                            w4a1Var2 = w4a1Var3;
                            z6 = z8;
                            i13 = i17;
                            f530Var3 = f530Var5;
                        } else {
                            btsVar = btsVar2;
                            btsVar.Y();
                            f530Var3 = f530Var2;
                            i13 = i6;
                            so31Var3 = so31Var2;
                            z5 = z3;
                            z6 = z4;
                            str3 = str2;
                            w4a1Var2 = w4a1Var;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new gj9(charSequence, f530Var3, i13, z5, str3, so31Var3, z6, w4a1Var2, i2, i3);
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    i9 = i3 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 128;
                    int i162 = i4;
                    if (i11 != 0) {
                    }
                    i12 = i162;
                    if (btsVar2.V(i12 & 1, (i12 & 4793491) != 4793490)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                z3 = z;
                i8 = i3 & 16;
                if (i8 == 0) {
                }
                str2 = str;
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                }
                i11 = i3 & 128;
                int i1622 = i4;
                if (i11 != 0) {
                }
                i12 = i1622;
                if (btsVar2.V(i12 & 1, (i12 & 4793491) != 4793490)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            i6 = i;
            i7 = i3 & 8;
            if (i7 != 0) {
            }
            z3 = z;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            str2 = str;
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            i11 = i3 & 128;
            int i16222 = i4;
            if (i11 != 0) {
            }
            i12 = i16222;
            if (btsVar2.V(i12 & 1, (i12 & 4793491) != 4793490)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        z3 = z;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        str2 = str;
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        i11 = i3 & 128;
        int i162222 = i4;
        if (i11 != 0) {
        }
        i12 = i162222;
        if (btsVar2.V(i12 & 1, (i12 & 4793491) != 4793490)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0302, code lost:
    
        if (defpackage.jl40.l(r8.Q(), java.lang.Integer.valueOf(r5)) == false) goto L214;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(CharSequence charSequence, CharSequence charSequence2, f530 f530Var, it1 it1Var, int i, boolean z, String str, w4a1 w4a1Var, w4a1 w4a1Var2, wls wlsVar, fid fidVar, int i2, int i3) {
        int i4;
        f530 f530Var2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        dmw0 dmw0Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        w4a1 w4a1Var3;
        wls wlsVar2;
        f530 f530Var3;
        int i15;
        bts btsVar;
        String str2;
        w4a1 w4a1Var4;
        aii0 v;
        int i16;
        wls wlsVar3;
        w4a1 w4a1Var5;
        Throwable th;
        String str3;
        f530 f530Var4;
        wls wlsVar4;
        int i17;
        int i18;
        w4a1 w4a1Var6;
        boolean z3;
        w4a1 w4a1Var7;
        CharSequence charSequence3;
        boolean z4;
        CharSequence charSequence4;
        boolean z5;
        CharSequence charSequence5 = charSequence;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(207144096);
        dmw0 dmw0Var2 = btsVar2.a;
        if ((i2 & 6) == 0) {
            i4 = (btsVar2.e(charSequence5) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar2.e(charSequence2) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f530Var2 = f530Var;
            i4 |= btsVar2.k(f530Var2) ? 256 : 128;
            if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i4 |= btsVar2.k(it1Var) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i6 = i;
                i4 |= btsVar2.c(i6) ? 16384 : 8192;
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ImageMetadata.EDGE_MODE;
                } else if ((196608 & i2) == 0) {
                    z2 = z;
                    i4 |= btsVar2.a(z2) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= btsVar2.k(str) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        dmw0Var = dmw0Var2;
                        i4 |= btsVar2.k(w4a1Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        i10 = i3 & 256;
                        if (i10 != 0) {
                            i4 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i11 = i10;
                            i4 |= btsVar2.k(w4a1Var2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                            i12 = i3 & 512;
                            if (i12 == 0) {
                                i13 = i12;
                                i14 = i4 | 805306368;
                            } else {
                                if ((i2 & 805306368) == 0) {
                                    i13 = i12;
                                    i4 |= btsVar2.e(wlsVar) ? 536870912 : SelfTester_JCP.IMITA;
                                } else {
                                    i13 = i12;
                                }
                                i14 = i4;
                            }
                            if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378)) {
                                btsVar2.Y();
                                w4a1Var3 = w4a1Var2;
                                wlsVar2 = wlsVar;
                                f530Var3 = f530Var2;
                                i15 = i6;
                                btsVar = btsVar2;
                                str2 = str;
                                w4a1Var4 = w4a1Var;
                            } else {
                                c530 c530Var = c530.a;
                                f530 f530Var5 = i19 != 0 ? c530Var : f530Var2;
                                int i20 = i5 != 0 ? 17 : i6;
                                if (i7 != 0) {
                                    z2 = false;
                                }
                                String str4 = i8 != 0 ? null : str;
                                irn irnVar = irn.b;
                                w4a1 w4a1Var8 = i9 != 0 ? irnVar : w4a1Var;
                                w4a1 w4a1Var9 = i11 != 0 ? irnVar : w4a1Var2;
                                wls wlsVar5 = i13 != 0 ? null : wlsVar;
                                o430 o430Var = did.a;
                                if (str4 == null) {
                                    btsVar2.e0(1496996070);
                                    String e = ohb1.e(btsVar2, vzh0.accessibility_crossed_out);
                                    boolean k = btsVar2.k(charSequence5) | btsVar2.k(charSequence2);
                                    th = null;
                                    Object Q = btsVar2.Q();
                                    if (k || Q == o430Var) {
                                        StringBuilder sb = new StringBuilder();
                                        i16 = i20;
                                        wlsVar3 = wlsVar5;
                                        if (charSequence5 != null) {
                                            int i21 = 0;
                                            while (true) {
                                                if (i21 >= charSequence5.length()) {
                                                    charSequence4 = null;
                                                    break;
                                                }
                                                char charAt = charSequence5.charAt(i21);
                                                if (!rza.b(charAt) && charAt != 10240) {
                                                    charSequence4 = charSequence;
                                                    break;
                                                } else {
                                                    i21++;
                                                    charSequence5 = charSequence;
                                                }
                                            }
                                            if (charSequence4 != null) {
                                                sb.append(charSequence4);
                                                if (charSequence4 instanceof Spanned) {
                                                    z5 = !(((ilf[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), ilf.class)).length == 0);
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z5) {
                                                    sb.append(e);
                                                }
                                            }
                                        }
                                        if (charSequence2 != null) {
                                            int i22 = 0;
                                            while (true) {
                                                if (i22 >= charSequence2.length()) {
                                                    charSequence3 = null;
                                                    break;
                                                }
                                                char charAt2 = charSequence2.charAt(i22);
                                                if (!rza.b(charAt2) && charAt2 != 10240) {
                                                    charSequence3 = charSequence2;
                                                    break;
                                                }
                                                i22++;
                                            }
                                            if (charSequence3 != null) {
                                                if (sb.length() > 0) {
                                                    sb.append(Extension.FIX_SPACE);
                                                }
                                                sb.append(charSequence3);
                                                if (charSequence3 instanceof Spanned) {
                                                    w4a1Var5 = w4a1Var8;
                                                    z4 = !(((ilf[]) ((Spanned) charSequence3).getSpans(0, charSequence3.length(), ilf.class)).length == 0);
                                                } else {
                                                    w4a1Var5 = w4a1Var8;
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    sb.append(Extension.FIX_SPACE + e);
                                                }
                                                Q = sb.toString();
                                                btsVar2.o0(Q);
                                            }
                                        }
                                        w4a1Var5 = w4a1Var8;
                                        Q = sb.toString();
                                        btsVar2.o0(Q);
                                    } else {
                                        i16 = i20;
                                        wlsVar3 = wlsVar5;
                                        w4a1Var5 = w4a1Var8;
                                    }
                                    str3 = (String) Q;
                                    btsVar2.t(false);
                                } else {
                                    i16 = i20;
                                    wlsVar3 = wlsVar5;
                                    w4a1Var5 = w4a1Var8;
                                    th = null;
                                    btsVar2.e0(1496995388);
                                    btsVar2.t(false);
                                    str3 = str4;
                                }
                                Object Q2 = btsVar2.Q();
                                if (Q2 == o430Var) {
                                    Q2 = new jv8(22);
                                    btsVar2.o0(Q2);
                                }
                                f530 c = rx21.c(f530Var5, z2, (tls) Q2);
                                boolean k2 = btsVar2.k(str3) | ((i14 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072);
                                Object Q3 = btsVar2.Q();
                                if (k2 || Q3 == o430Var) {
                                    Q3 = new lo1(str3, z2, 2);
                                    btsVar2.o0(Q3);
                                }
                                f530 a = fnq0.a(c, (tls) Q3);
                                int i23 = i14 >> 3;
                                sic a2 = qic.a(lr20.c, it1Var, btsVar2, ((i23 & 896) >> 3) & 112);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d = androidx.compose.ui.b.d(btsVar2, a);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (dmw0Var == null) {
                                    cma1.b0();
                                    throw th;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar);
                                } else {
                                    btsVar2.r0();
                                }
                                wls wlsVar6 = d.f;
                                qje.W(btsVar2, wlsVar6, a2);
                                wls wlsVar7 = d.e;
                                qje.W(btsVar2, wlsVar7, o);
                                wls wlsVar8 = d.g;
                                if (btsVar2.S) {
                                    f530Var4 = f530Var5;
                                } else {
                                    f530Var4 = f530Var5;
                                }
                                b64.z(hashCode, btsVar2, hashCode, wlsVar8);
                                wls wlsVar9 = d.d;
                                qje.W(btsVar2, wlsVar9, d);
                                if (charSequence == null) {
                                    btsVar2.e0(447681235);
                                    btsVar2.t(false);
                                    i18 = i16;
                                    w4a1Var6 = w4a1Var5;
                                    wlsVar4 = wlsVar3;
                                    z3 = false;
                                    i17 = i23;
                                } else {
                                    btsVar2.e0(447681236);
                                    if (wlsVar3 == null) {
                                        btsVar2.e0(-2091763072);
                                        w4a1 w4a1Var10 = w4a1Var5;
                                        wlsVar4 = wlsVar3;
                                        i17 = i23;
                                        i18 = i16;
                                        a(charSequence, null, i18, false, null, null, false, w4a1Var10, btsVar2, (i14 & 14) | ((i14 >> 6) & 896) | (i14 & 29360128), 122);
                                        btsVar2.t(false);
                                        w4a1Var6 = w4a1Var10;
                                        z3 = false;
                                    } else {
                                        wlsVar4 = wlsVar3;
                                        i17 = i23;
                                        int i24 = i16;
                                        w4a1 w4a1Var11 = w4a1Var5;
                                        btsVar2.e0(-2091555124);
                                        lhl0 a3 = khl0.a(lr20.a, x4c.E, btsVar2, 48);
                                        int hashCode2 = Long.hashCode(btsVar2.T);
                                        r1b0 o2 = btsVar2.o();
                                        f530 d2 = androidx.compose.ui.b.d(btsVar2, c530Var);
                                        if (dmw0Var == null) {
                                            cma1.b0();
                                            throw th;
                                        }
                                        btsVar2.i0();
                                        if (btsVar2.S) {
                                            btsVar2.n(slsVar);
                                        } else {
                                            btsVar2.r0();
                                        }
                                        qje.W(btsVar2, wlsVar6, a3);
                                        qje.W(btsVar2, wlsVar7, o2);
                                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                                            b64.z(hashCode2, btsVar2, hashCode2, wlsVar8);
                                        }
                                        qje.W(btsVar2, wlsVar9, d2);
                                        i18 = i24;
                                        a(charSequence, null, i18, false, null, null, false, w4a1Var11, btsVar2, (i14 & 14) | ((i14 >> 6) & 896) | (i14 & 29360128), 122);
                                        w4a1Var6 = w4a1Var11;
                                        oeb1.c(btsVar2, ljs0.q(c530Var, 4.0f));
                                        z3 = false;
                                        qv10.A((i14 >> 27) & 14, wlsVar4, btsVar2, true, false);
                                    }
                                    btsVar2.t(z3);
                                }
                                if (charSequence2 == null) {
                                    btsVar2.e0(448374581);
                                    btsVar2.t(z3);
                                    w4a1Var7 = w4a1Var9;
                                } else {
                                    btsVar2.e0(448374582);
                                    w4a1Var7 = w4a1Var9;
                                    a(charSequence2, null, i18, false, null, null, false, w4a1Var7, btsVar2, (i17 & 14) | ((i14 >> 6) & 896) | (i17 & 29360128), 122);
                                    btsVar2.t(false);
                                }
                                btsVar2.t(true);
                                i15 = i18;
                                w4a1Var3 = w4a1Var7;
                                btsVar = btsVar2;
                                wlsVar2 = wlsVar4;
                                w4a1Var4 = w4a1Var6;
                                str2 = str4;
                                f530Var3 = f530Var4;
                            }
                            boolean z6 = z2;
                            v = btsVar.v();
                            if (v == null) {
                                v.d = new hj9(charSequence, charSequence2, f530Var3, it1Var, i15, z6, str2, w4a1Var4, w4a1Var3, wlsVar2, i2, i3);
                                return;
                            }
                            return;
                        }
                        i11 = i10;
                        i12 = i3 & 512;
                        if (i12 == 0) {
                        }
                        if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378)) {
                        }
                        boolean z62 = z2;
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    dmw0Var = dmw0Var2;
                    i10 = i3 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    i12 = i3 & 512;
                    if (i12 == 0) {
                    }
                    if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378)) {
                    }
                    boolean z622 = z2;
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                z2 = z;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                dmw0Var = dmw0Var2;
                i10 = i3 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378)) {
                }
                boolean z6222 = z2;
                v = btsVar.v();
                if (v == null) {
                }
            }
            i6 = i;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            z2 = z;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            dmw0Var = dmw0Var2;
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378)) {
            }
            boolean z62222 = z2;
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        z2 = z;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        dmw0Var = dmw0Var2;
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        if (btsVar2.V(i14 & 1, (i14 & 306783379) == 306783378)) {
        }
        boolean z622222 = z2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static int c(InputStream inputStream) {
        if (inputStream instanceof ufy) {
            return ((ufy) inputStream).b;
        }
        if (inputStream instanceof j2) {
            return ((j2) inputStream).a;
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (maxMemory > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) maxMemory;
    }

    public static long d(long... jArr) {
        ffx.m(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }
}
