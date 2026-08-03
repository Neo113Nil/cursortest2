package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class m extends AutoCompleteTextView {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f4384i = {R.attr.popupBackground};

    /* renamed from: g, reason: collision with root package name */
    public final n f4385g;

    /* renamed from: h, reason: collision with root package name */
    public final u f4386h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.fortheloss.st.R.attr.autoCompleteTextViewStyle);
        k1.a(context);
        j1.a(this, getContext());
        a5.c C = a5.c.C(getContext(), attributeSet, f4384i, org.fortheloss.st.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) C.f261g).hasValue(0)) {
            setDropDownBackgroundDrawable(C.v(0));
        }
        C.F();
        n nVar = new n(this);
        this.f4385g = nVar;
        nVar.b(attributeSet, org.fortheloss.st.R.attr.autoCompleteTextViewStyle);
        u uVar = new u(this);
        this.f4386h = uVar;
        uVar.d(attributeSet, org.fortheloss.st.R.attr.autoCompleteTextViewStyle);
        uVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f4385g;
        if (nVar != null) {
            nVar.a();
        }
        u uVar = this.f4386h;
        if (uVar != null) {
            uVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        l1 l1Var;
        n nVar = this.f4385g;
        if (nVar == null || (l1Var = (l1) nVar.f4392e) == null) {
            return null;
        }
        return l1Var.f4380a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l1 l1Var;
        n nVar = this.f4385g;
        if (nVar == null || (l1Var = (l1) nVar.f4392e) == null) {
            return null;
        }
        return l1Var.f4381b;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f4385g;
        if (nVar != null) {
            nVar.f4388a = -1;
            nVar.d(null);
            nVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f4385g;
        if (nVar != null) {
            nVar.c(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT <= 27 && !(callback instanceof l3.j) && callback != null) {
            callback = new l3.j(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(j.a.a(getContext(), i10));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f4385g;
        if (nVar != null) {
            nVar.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f4385g;
        if (nVar != null) {
            nVar.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        u uVar = this.f4386h;
        if (uVar != null) {
            uVar.e(context, i10);
        }
    }
}
