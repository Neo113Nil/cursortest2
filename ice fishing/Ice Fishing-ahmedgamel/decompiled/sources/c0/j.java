package c0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f5493a;

    public j(TransformationMethod transformationMethod) {
        this.f5493a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f5493a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || androidx.emoji2.text.j.a().b() != 1) {
            return charSequence;
        }
        androidx.emoji2.text.j a9 = androidx.emoji2.text.j.a();
        a9.getClass();
        return a9.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f5493a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i, rect);
        }
    }
}
