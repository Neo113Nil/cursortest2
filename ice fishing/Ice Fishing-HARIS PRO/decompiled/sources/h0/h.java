package h0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import f0.w;

/* loaded from: classes.dex */
public final class h extends w {

    /* renamed from: k, reason: collision with root package name */
    public String f3255k;

    @Override // f0.w
    public final void e(Context context, AttributeSet attributeSet) {
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, n.f3266b);
        D1.i.d(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.f3255k = string;
        }
        obtainAttributes.recycle();
    }

    @Override // f0.w
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        return super.equals(obj) && D1.i.a(this.f3255k, ((h) obj).f3255k);
    }

    @Override // f0.w
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f3255k;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // f0.w
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.f3255k;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        String sb2 = sb.toString();
        D1.i.d(sb2, "sb.toString()");
        return sb2;
    }
}
