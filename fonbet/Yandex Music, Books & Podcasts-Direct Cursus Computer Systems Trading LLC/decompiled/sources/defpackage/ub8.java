package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes3.dex */
public final class ub8 implements LayoutInflater.Factory2 {
    public final vb8 a;

    public ub8(vb8 vb8Var) {
        this.a = vb8Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        if (!"com.yandex.div.core.view2.Div2View".equals(str) && !"Div2View".equals(str)) {
            return null;
        }
        return new gc8(this.a, attributeSet, 0, 4, null);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return onCreateView(str, context, attributeSet);
    }
}
