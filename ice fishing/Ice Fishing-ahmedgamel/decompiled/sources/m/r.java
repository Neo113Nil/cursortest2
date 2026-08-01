package m;

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
import com.google.android.gms.internal.ads.C2712Ol;
import com.icefishing.icefishingbigwin.C5275R;
import g.AbstractC4518a;

/* loaded from: classes.dex */
public final class r extends CheckedTextView {

    /* renamed from: n, reason: collision with root package name */
    public final f8.j f39215n;

    /* renamed from: u, reason: collision with root package name */
    public final C2712Ol f39216u;

    /* renamed from: v, reason: collision with root package name */
    public final V f39217v;

    /* renamed from: w, reason: collision with root package name */
    public C4716v f39218w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        O0.a(context);
        N0.a(getContext(), this);
        V v9 = new V(this);
        this.f39217v = v9;
        v9.f(attributeSet, C5275R.attr.checkedTextViewStyle);
        v9.b();
        C2712Ol c2712Ol = new C2712Ol(this);
        this.f39216u = c2712Ol;
        c2712Ol.d(attributeSet, C5275R.attr.checkedTextViewStyle);
        this.f39215n = new f8.j(this, 1);
        Context context2 = getContext();
        int[] iArr = AbstractC4518a.f37598l;
        j4.g s9 = j4.g.s(context2, attributeSet, iArr, C5275R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) s9.f38405v;
        O.X.n(this, getContext(), iArr, attributeSet, (TypedArray) s9.f38405v, C5275R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(com.bumptech.glide.g.e(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(s9.h(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC4694j0.b(typedArray.getInt(3, -1), null));
                }
                s9.t();
                getEmojiTextViewHelper().a(attributeSet, C5275R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(com.bumptech.glide.g.e(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            s9.t();
            getEmojiTextViewHelper().a(attributeSet, C5275R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            s9.t();
            throw th;
        }
    }

    private C4716v getEmojiTextViewHelper() {
        if (this.f39218w == null) {
            this.f39218w = new C4716v(this);
        }
        return this.f39218w;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        V v9 = this.f39217v;
        if (v9 != null) {
            v9.b();
        }
        C2712Ol c2712Ol = this.f39216u;
        if (c2712Ol != null) {
            c2712Ol.a();
        }
        f8.j jVar = this.f39215n;
        if (jVar != null) {
            jVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d6.c.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2712Ol c2712Ol = this.f39216u;
        if (c2712Ol != null) {
            return c2712Ol.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2712Ol c2712Ol = this.f39216u;
        if (c2712Ol != null) {
            return c2712Ol.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        f8.j jVar = this.f39215n;
        if (jVar != null) {
            return (ColorStateList) jVar.f37560f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        f8.j jVar = this.f39215n;
        if (jVar != null) {
            return (PorterDuff.Mode) jVar.f37561g;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39217v.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39217v.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        t8.g.r(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2712Ol c2712Ol = this.f39216u;
        if (c2712Ol != null) {
            c2712Ol.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2712Ol c2712Ol = this.f39216u;
        if (c2712Ol != null) {
            c2712Ol.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        f8.j jVar = this.f39215n;
        if (jVar != null) {
            if (jVar.f37558d) {
                jVar.f37558d = false;
            } else {
                jVar.f37558d = true;
                jVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39217v;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39217v;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d6.c.r(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2712Ol c2712Ol = this.f39216u;
        if (c2712Ol != null) {
            c2712Ol.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2712Ol c2712Ol = this.f39216u;
        if (c2712Ol != null) {
            c2712Ol.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        f8.j jVar = this.f39215n;
        if (jVar != null) {
            jVar.f37560f = colorStateList;
            jVar.f37556b = true;
            jVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        f8.j jVar = this.f39215n;
        if (jVar != null) {
            jVar.f37561g = mode;
            jVar.f37557c = true;
            jVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v9 = this.f39217v;
        v9.l(colorStateList);
        v9.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v9 = this.f39217v;
        v9.m(mode);
        v9.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v9 = this.f39217v;
        if (v9 != null) {
            v9.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(com.bumptech.glide.g.e(getContext(), i));
    }
}
