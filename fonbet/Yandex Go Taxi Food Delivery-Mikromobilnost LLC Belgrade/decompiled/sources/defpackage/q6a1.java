package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.compose.animation.core.c;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.ybsdk.widgets.common.MoneyInputEditView;

/* loaded from: classes11.dex */
public abstract class q6a1 {
    public static final void a(f530 f530Var, m3u0 m3u0Var, boolean z, wp2 wp2Var, float f, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        wp2 wp2Var2;
        float f2;
        wp2 wp2Var3;
        f530 f530Var3;
        float f3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(658869066);
        int i2 = i | 6 | (btsVar2.k(m3u0Var) ? 32 : 16) | 27648;
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                wp2Var3 = AppColor$Palette.EverFront;
                f530Var3 = c530.a;
                f3 = 2.0f;
            } else {
                btsVar2.Y();
                f530Var3 = f530Var;
                wp2Var3 = wp2Var;
                f3 = f;
            }
            btsVar2.u();
            long n = tje.n(wp2Var3, btsVar2);
            c g = z5b1.g("TwoPulsingCircles", btsVar2, 0);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new of11(8);
                btsVar2.o0(Q);
            }
            osv d = z5b1.d(g, 0.0f, 0.0f, sb2.w(sb2.y((tls) Q), null, 0L, 6), "TwoPulsingCirclesAlpha", btsVar2, 29112, 0);
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = new of11(9);
                btsVar2.o0(Q2);
            }
            osv d2 = z5b1.d(g, 0.1f, 0.1f, sb2.w(sb2.y((tls) Q2), null, 0L, 6), "TwoPulsingCirclesInnerRadius", btsVar2, 29112, 0);
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = new of11(10);
                btsVar2.o0(Q3);
            }
            osv d3 = z5b1.d(g, 0.6f, 0.6f, sb2.w(sb2.y((tls) Q3), null, 0L, 6), "TwoPulsingCirclesOuterRadius", btsVar2, 29112, 0);
            btsVar = btsVar2;
            f530 k = f530Var3.k(ljs0.c);
            boolean d4 = btsVar.d(n) | ((((i2 & 112) ^ 48) > 32 && btsVar.k(m3u0Var)) || (i2 & 48) == 32) | btsVar.k(d2) | btsVar.k(d) | btsVar.k(d3);
            Object Q4 = btsVar.Q();
            if (d4 || Q4 == o430Var) {
                wk11 wk11Var = new wk11(f3, m3u0Var, z, n, d2, d, d3);
                btsVar.o0(wk11Var);
                Q4 = wk11Var;
            }
            qeb1.a(0, btsVar, (tls) Q4, k);
            f2 = f3;
            f530Var2 = f530Var3;
            wp2Var2 = wp2Var3;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
            wp2Var2 = wp2Var;
            f2 = f;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xk11(f530Var2, m3u0Var, z, wp2Var2, f2, i, 0);
        }
    }

    public static void b(StringBuilder sb, int i) {
        if (i < 10) {
            sb.append(MoneyInputEditView.DEFAULT_VALUE);
        }
        sb.append(i);
    }

    public static final f530 c(f530 f530Var, boolean z) {
        return tra1.b(f530Var, z ? 1.0f : 0.5f);
    }

    public static final void d(f9f0 f9f0Var, e9f0 e9f0Var) {
        fky0 fky0Var;
        SpannedString valueOf;
        PlusSdkBrandType a = e9f0Var.a();
        int[] iArr = g9f0.a;
        int i = iArr[a.ordinal()];
        if (i == 1) {
            fky0Var = new fky0(b1i0.AcquisitionSdk_TextAppearance_Check_S_Title, b1i0.AcquisitionSdk_TextAppearance_Check_S_Subtitle);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            fky0Var = new fky0(b1i0.AcquisitionSdk_Yango_TextAppearance_Title5, b1i0.AcquisitionSdk_Yango_TextAppearance_Caption);
        }
        if (e9f0Var instanceof d9f0) {
            valueOf = SpannedString.valueOf(((d9f0) e9f0Var).c);
        } else {
            if (!(e9f0Var instanceof c9f0)) {
                w511.b();
                return;
            }
            c9f0 c9f0Var = (c9f0) e9f0Var;
            PlusSdkBrandType plusSdkBrandType = c9f0Var.b;
            String str = c9f0Var.d;
            String str2 = c9f0Var.c;
            int i2 = iArr[plusSdkBrandType.ordinal()];
            if (i2 == 1) {
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) str2).append((CharSequence) str);
                append.setSpan(new ForegroundColorSpan(f9f0Var.getView().getContext().getColor(qpg0.acquisition_sdk_semantic_control_content_accent)), 0, str2.length(), 33);
                valueOf = SpannedString.valueOf(append);
            } else {
                if (i2 != 2) {
                    w511.b();
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                valueOf = SpannedString.valueOf(sb);
            }
        }
        String title = e9f0Var.getTitle();
        TextView titleTextView = f9f0Var.getTitleTextView();
        titleTextView.setText(SpannedString.valueOf(title));
        titleTextView.setTextAppearance(fky0Var.a);
        TextView subtitleTextView = f9f0Var.getSubtitleTextView();
        subtitleTextView.setText(valueOf);
        subtitleTextView.setTextAppearance(fky0Var.b);
    }
}
