package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class qpv implements View.OnApplyWindowInsetsListener {
    public final rr4 a;
    public kqv b;

    public qpv(View view, rr4 rr4Var) {
        kqv kqvVar;
        this.a = rr4Var;
        WeakHashMap weakHashMap = wdu.a;
        kqv a = odu.a(view);
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            kqvVar = (i >= 34 ? new zpv(a) : i >= 30 ? new ypv(a) : i >= 29 ? new xpv(a) : new wpv(a)).b();
        } else {
            kqvVar = null;
        }
        this.b = kqvVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = kqv.h(view, windowInsets);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        kqv h = kqv.h(view, windowInsets);
        hqv hqvVar = h.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = wdu.a;
            this.b = odu.a(view);
        }
        if (this.b == null) {
            this.b = h;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            rr4 j = rpv.j(view);
            if (j == null || !Objects.equals((kqv) j.b, h)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                kqv kqvVar = this.b;
                int i = 1;
                while (i <= 512) {
                    zne g = hqvVar.g(i);
                    zne g2 = kqvVar.a.g(i);
                    int i2 = g.a;
                    int i3 = g.d;
                    int i4 = g.c;
                    int i5 = g.b;
                    int i6 = g2.a;
                    int i7 = g2.d;
                    int i8 = g2.c;
                    int i9 = g2.b;
                    if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                        iArr = iArr2;
                        z = true;
                    } else {
                        iArr = iArr2;
                        z = false;
                    }
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr[0] = iArr[0] | i;
                        } else {
                            iArr3[0] = iArr3[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr2 = iArr;
                }
                int i10 = iArr2[0];
                int i11 = iArr3[0];
                int i12 = i10 | i11;
                if (i12 != 0) {
                    kqv kqvVar2 = this.b;
                    vpv vpvVar = new vpv(i12, (i10 & 8) != 0 ? rpv.e : (i11 & 8) != 0 ? rpv.f : (i10 & 519) != 0 ? rpv.g : (i11 & 519) != 0 ? rpv.h : null, (i12 & 8) != 0 ? 160L : 250L);
                    vpvVar.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(vpvVar.a.b());
                    zne g3 = hqvVar.g(i12);
                    zne g4 = kqvVar2.a.g(i12);
                    int min = Math.min(g3.a, g4.a);
                    int i13 = g3.b;
                    int i14 = g4.b;
                    int min2 = Math.min(i13, i14);
                    int i15 = g3.c;
                    int i16 = g4.c;
                    int min3 = Math.min(i15, i16);
                    int i17 = g3.d;
                    int i18 = g4.d;
                    nur nurVar = new nur(8, zne.c(min, min2, min3, Math.min(i17, i18)), zne.c(Math.max(g3.a, g4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
                    rpv.g(view, vpvVar, h, false);
                    duration.addUpdateListener(new ppv(vpvVar, h, kqvVar2, i12, view));
                    duration.addListener(new w2c(3, vpvVar, view));
                    srj.c(view, new t5(12, view, vpvVar, nurVar, duration, false));
                    this.b = h;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                    return windowInsets;
                }
                this.b = h;
                if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
