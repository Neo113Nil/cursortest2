package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final View f2625a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2626b;

    public m(View view, int i2) {
        this.f2625a = view;
        this.f2626b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2626b == mVar.f2626b && this.f2625a.equals(mVar.f2625a);
    }

    public final int hashCode() {
        return ((this.f2625a.hashCode() + 31) * 31) + this.f2626b;
    }
}
