package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final View f2617a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2618b;

    public m(View view, int i2) {
        this.f2617a = view;
        this.f2618b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2618b == mVar.f2618b && this.f2617a.equals(mVar.f2617a);
    }

    public final int hashCode() {
        return ((this.f2617a.hashCode() + 31) * 31) + this.f2618b;
    }
}
