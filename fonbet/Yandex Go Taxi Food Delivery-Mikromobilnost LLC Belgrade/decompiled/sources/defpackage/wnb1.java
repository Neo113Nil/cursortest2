package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;

/* loaded from: classes11.dex */
public abstract class wnb1 {
    public static final void a(AppCompatImageView appCompatImageView, float f, float f2, float f3) {
        float f4 = f3 / f2;
        float b = g8e.b(1.0f, f4, f == f ? y6i0.c(f, 0.0f, 1.0f) : 1.0f, f4);
        if (appCompatImageView.getScaleX() == b && appCompatImageView.getScaleY() == b) {
            return;
        }
        appCompatImageView.setPivotX(0.0f);
        appCompatImageView.setScaleX(b);
        appCompatImageView.setScaleY(b);
    }

    public static void b(float f, float f2, int i, TextView textView) {
        float w = kp50.w(textView.getTextSize());
        float abs = Math.abs(i) / (f - 0.0f);
        float c = (((f2 / w) - 1.0f) * (abs == abs ? y6i0.c(abs, 0.0f, 1.0f) : 1.0f)) + 1.0f;
        if (textView.getScaleX() == c && textView.getScaleY() == c) {
            return;
        }
        textView.setPivotX(0.0f);
        textView.setScaleX(c);
        textView.setScaleY(c);
    }

    public static final long c(dry0 dry0Var, int i, boolean z, boolean z2) {
        hm40 hm40Var = dry0Var.b;
        long j = dry0Var.c;
        int d = hm40Var.d(i);
        hm40 hm40Var2 = dry0Var.b;
        if (d >= hm40Var2.f) {
            return 9205357640488583168L;
        }
        boolean z3 = dry0Var.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == dry0Var.l(i);
        hm40Var2.l(i);
        int length = ((kk2) hm40Var2.a.a).b.length();
        ArrayList arrayList = hm40Var2.h;
        cc90 cc90Var = (cc90) arrayList.get(i == length ? scc.f(arrayList) : cqb1.a(i, arrayList));
        gb2 gb2Var = cc90Var.a;
        int d2 = cc90Var.d(i);
        zqy0 zqy0Var = gb2Var.d;
        return (Float.floatToRawIntBits(y6i0.c(z3 ? zqy0Var.h(d2, false) : zqy0Var.i(d2, false), 0.0f, (int) (j >> 32))) << 32) | (Float.floatToRawIntBits(y6i0.c(hm40Var2.b(d), 0.0f, (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public static final void d(int i, View view) {
        view.setBackgroundColor(qje.t(xng0.bgMain, view.getContext()));
        view.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(i));
        view.setClipToOutline(true);
    }
}
