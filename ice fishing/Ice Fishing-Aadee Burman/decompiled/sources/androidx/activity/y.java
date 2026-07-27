package androidx.activity;

import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.i implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public static final y f4469n = new y(0);

    @Override // I7.a
    public final Object invoke() {
        try {
            InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
            InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
            InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
            return new z();
        } catch (NoSuchFieldException unused) {
            return z.f4470b;
        }
    }
}
