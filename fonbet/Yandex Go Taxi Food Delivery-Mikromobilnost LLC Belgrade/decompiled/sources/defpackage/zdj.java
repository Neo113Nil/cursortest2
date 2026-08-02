package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.view.f;

/* loaded from: classes10.dex */
public final class zdj extends f {
    public String E;

    @Override // androidx.view.f
    public final void e(Context context, AttributeSet attributeSet) {
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, m2i0.DialogFragmentNavigator);
        String string = obtainAttributes.getString(m2i0.DialogFragmentNavigator_android_name);
        if (string != null) {
            this.E = string;
        }
        obtainAttributes.recycle();
    }

    @Override // androidx.view.f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof zdj) && super.equals(obj) && jl40.l(this.E, ((zdj) obj).E);
    }

    @Override // androidx.view.f
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.E;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
