package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class mq0 extends CheckedTextView {
    public final nq0 a;
    public final jq0 b;
    public final ls0 c;
    public lr0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0084 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:3:0x004a, B:5:0x0051, B:8:0x0057, B:9:0x007d, B:11:0x0084, B:12:0x008b, B:14:0x0092, B:21:0x0066, B:23:0x006c, B:25:0x0072), top: B:2:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:3:0x004a, B:5:0x0051, B:8:0x0057, B:9:0x007d, B:11:0x0084, B:12:0x008b, B:14:0x0092, B:21:0x0066, B:23:0x006c, B:25:0x0072), top: B:2:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mq0(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        int resourceId2;
        sjs.a(context);
        gfs.a(getContext(), this);
        ls0 ls0Var = new ls0(this);
        this.c = ls0Var;
        ls0Var.f(attributeSet, i);
        ls0Var.b();
        jq0 jq0Var = new jq0(this);
        this.b = jq0Var;
        jq0Var.d(attributeSet, i);
        this.a = new nq0(this);
        Context context2 = getContext();
        int[] iArr = ken.l;
        lum W = lum.W(context2, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) W.b;
        wdu.p(this, getContext(), iArr, attributeSet, (TypedArray) W.b, i, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(y2x.w(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(W.J(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(xpa.c(typedArray.getInt(3, -1), null));
                }
                W.f0();
                getEmojiTextViewHelper().b(attributeSet, i);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(y2x.w(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            W.f0();
            getEmojiTextViewHelper().b(attributeSet, i);
        } catch (Throwable th) {
            W.f0();
            throw th;
        }
    }

    @NonNull
    private lr0 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new lr0(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ls0 ls0Var = this.c;
        if (ls0Var != null) {
            ls0Var.b();
        }
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            jq0Var.a();
        }
        nq0 nq0Var = this.a;
        if (nq0Var != null) {
            nq0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return asq.W(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            return jq0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            return jq0Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        nq0 nq0Var = this.a;
        if (nq0Var != null) {
            return (ColorStateList) nq0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        nq0 nq0Var = this.a;
        if (nq0Var != null) {
            return (PorterDuff.Mode) nq0Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        u2x.N(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            jq0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            jq0Var.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        nq0 nq0Var = this.a;
        if (nq0Var != null) {
            if (nq0Var.e) {
                nq0Var.e = false;
            } else {
                nq0Var.e = true;
                nq0Var.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ls0 ls0Var = this.c;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ls0 ls0Var = this.c;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(asq.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            jq0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jq0 jq0Var = this.b;
        if (jq0Var != null) {
            jq0Var.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        nq0 nq0Var = this.a;
        if (nq0Var != null) {
            nq0Var.a = colorStateList;
            nq0Var.c = true;
            nq0Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        nq0 nq0Var = this.a;
        if (nq0Var != null) {
            nq0Var.b = mode;
            nq0Var.d = true;
            nq0Var.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ls0 ls0Var = this.c;
        ls0Var.k(colorStateList);
        ls0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ls0 ls0Var = this.c;
        ls0Var.l(mode);
        ls0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ls0 ls0Var = this.c;
        if (ls0Var != null) {
            ls0Var.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(y2x.w(getContext(), i));
    }

    public mq0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public mq0(@NonNull Context context) {
        this(context, null);
    }
}
