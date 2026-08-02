package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text;

import android.text.TextUtils;
import com.google.ar.core.ImageMetadata;
import com.yandex.delivery.attrbutedtext.api.TruncationMode;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.cib1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.irn;
import defpackage.iuy0;
import defpackage.juy0;
import defpackage.krn;
import defpackage.kuy0;
import defpackage.ljs0;
import defpackage.luy0;
import defpackage.muy0;
import defpackage.o430;
import defpackage.ogo0;
import defpackage.rmy0;
import defpackage.rx21;
import defpackage.s5w0;
import defpackage.sjy0;
import defpackage.so31;
import defpackage.tls;
import defpackage.unr0;
import defpackage.w4a1;
import defpackage.w511;
import defpackage.wls;
import defpackage.x2s;
import defpackage.yg;
import defpackage.zgb1;
import defpackage.zpn;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.TextAlignment;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(muy0 muy0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        int i3;
        w4a1 w4a1Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2019203027);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(muy0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            x2s x2sVar = muy0Var.i;
            TextAlignment textAlignment = muy0Var.f;
            luy0 luy0Var = muy0Var.c;
            int i4 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i4 == 4);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new TextWidgetKt$TextWidgetContent$1$1(tlsVar, muy0Var, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, x2sVar);
            boolean z2 = muy0Var.g != null;
            f530 c = ljs0.c(c530.a, 1.0f);
            boolean z3 = ((i2 & 896) == 256) | (i4 == 4);
            Object Q2 = btsVar2.Q();
            int i5 = 5;
            if (z3 || Q2 == o430Var) {
                Q2 = new rmy0(i5, tlsVar2, muy0Var);
                btsVar2.o0(Q2);
            }
            f530 c2 = rx21.c(c, z2, (tls) Q2);
            boolean z4 = muy0Var.d != null;
            boolean z5 = i4 == 4;
            Object Q3 = btsVar2.Q();
            if (z5 || Q3 == o430Var) {
                Q3 = new s5w0(29, muy0Var);
                btsVar2.o0(Q3);
            }
            f530 j = an91.j(rx21.c(c2, z4, (tls) Q3), muy0Var.e);
            if (luy0Var instanceof juy0) {
                btsVar2.e0(1235427788);
                juy0 juy0Var = (juy0) luy0Var;
                CharSequence charSequence = juy0Var.a;
                int i6 = iuy0.a[textAlignment.ordinal()];
                if (i6 == 1) {
                    i3 = 8388611;
                } else if (i6 == 2) {
                    i3 = 17;
                } else {
                    if (i6 != 3) {
                        w511.b();
                        return;
                    }
                    i3 = 8388613;
                }
                yg ygVar = muy0Var.h;
                boolean z6 = ygVar != null ? ygVar.a : false;
                String str = ygVar != null ? ygVar.b : null;
                so31 so31Var = z2 ? so31.a : null;
                TruncationMode truncationMode = juy0Var.b;
                int i7 = truncationMode == null ? -1 : iuy0.b[truncationMode.ordinal()];
                if (i7 == -1) {
                    w4a1Var = irn.b;
                } else if (i7 == 1) {
                    w4a1Var = new krn(TextUtils.TruncateAt.START);
                } else if (i7 == 2) {
                    w4a1Var = new krn(TextUtils.TruncateAt.END);
                } else {
                    if (i7 != 3) {
                        w511.b();
                        return;
                    }
                    w4a1Var = new krn(TextUtils.TruncateAt.MIDDLE);
                }
                int i8 = i3;
                boolean z7 = z6;
                so31 so31Var2 = so31Var;
                btsVar = btsVar2;
                zgb1.a(charSequence, j, i8, z7, str, so31Var2, false, w4a1Var, btsVar, (so31.c << 15) | 1572864, 0);
                btsVar.t(false);
            } else {
                if (!(luy0Var instanceof kuy0)) {
                    throw unr0.y(871135647, btsVar2, false);
                }
                btsVar2.e0(1236168626);
                kuy0 kuy0Var = (kuy0) luy0Var;
                String str2 = kuy0Var.a;
                int i9 = iuy0.a[textAlignment.ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        i5 = 3;
                    } else {
                        if (i9 != 3) {
                            w511.b();
                            return;
                        }
                        i5 = 6;
                    }
                }
                cib1.d(str2, j, kuy0Var.b, new sjy0(i5), 0, 2, btsVar2, ImageMetadata.EDGE_MODE, 16);
                btsVar = btsVar2;
                btsVar.t(false);
            }
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(muy0Var, tlsVar, tlsVar2, i, 27);
        }
    }
}
