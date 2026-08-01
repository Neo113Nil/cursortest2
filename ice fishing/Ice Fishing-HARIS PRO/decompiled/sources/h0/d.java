package h0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import f0.InterfaceC0138c;
import f0.w;

/* loaded from: classes.dex */
public final class d extends w implements InterfaceC0138c {

    /* renamed from: k, reason: collision with root package name */
    public String f3246k;

    @Override // f0.w
    public final void e(Context context, AttributeSet attributeSet) {
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, n.f3265a);
        D1.i.d(obtainAttributes, "context.resources.obtain….DialogFragmentNavigator)");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.f3246k = string;
        }
        obtainAttributes.recycle();
    }

    @Override // f0.w
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        return super.equals(obj) && D1.i.a(this.f3246k, ((d) obj).f3246k);
    }

    @Override // f0.w
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f3246k;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
