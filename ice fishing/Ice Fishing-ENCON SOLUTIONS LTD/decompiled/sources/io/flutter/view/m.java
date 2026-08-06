package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final View f8007a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8008b;

    public m(View view, int i2) {
        this.f8007a = view;
        this.f8008b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f8008b == mVar.f8008b && this.f8007a.equals(mVar.f8007a);
    }

    public final int hashCode() {
        return ((this.f8007a.hashCode() + 31) * 31) + this.f8008b;
    }
}
