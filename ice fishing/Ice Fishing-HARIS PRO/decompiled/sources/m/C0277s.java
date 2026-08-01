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
import com.lumenpath.harispro.hrnavigator.R;
import g.AbstractC0155a;
import k0.C0188b;
import l0.C0233d;

/* renamed from: m.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277s extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0233d f4015a;

    /* renamed from: b, reason: collision with root package name */
    public final C0188b f4016b;

    /* renamed from: c, reason: collision with root package name */
    public final X f4017c;

    /* renamed from: d, reason: collision with root package name */
    public C0287x f4018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0277s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        R0.a(context);
        Q0.a(this, getContext());
        X x2 = new X(this);
        this.f4017c = x2;
        x2.f(attributeSet, R.attr.checkedTextViewStyle);
        x2.b();
        C0188b c0188b = new C0188b(this);
        this.f4016b = c0188b;
        c0188b.k(attributeSet, R.attr.checkedTextViewStyle);
        this.f4015a = new C0233d(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0155a.f3042l;
        M0.h i = M0.h.i(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) i.f617c;
        O.K.k(this, getContext(), iArr, attributeSet, (TypedArray) i.f617c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(h0.f.n(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(i.b(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC0265l0.b(typedArray.getInt(3, -1), null));
                }
                i.l();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(h0.f.n(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            i.l();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            i.l();
            throw th;
        }
    }

    private C0287x getEmojiTextViewHelper() {
        if (this.f4018d == null) {
            this.f4018d = new C0287x(this);
        }
        return this.f4018d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        X x2 = this.f4017c;
        if (x2 != null) {
            x2.b();
        }
        C0188b c0188b = this.f4016b;
        if (c0188b != null) {
            c0188b.a();
        }
        C0233d c0233d = this.f4015a;
        if (c0233d != null) {
            c0233d.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof R.i ? ((R.i) customSelectionActionModeCallback).f1005a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0188b c0188b = this.f4016b;
        if (c0188b != null) {
            return c0188b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0188b c0188b = this.f4016b;
        if (c0188b != null) {
            return c0188b.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0233d c0233d = this.f4015a;
        if (c0233d != null) {
            return (ColorStateList) c0233d.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0233d c0233d = this.f4015a;
        if (c0233d != null) {
            return (PorterDuff.Mode) c0233d.f3785f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4017c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4017c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h0.f.u(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0188b c0188b = this.f4016b;
        if (c0188b != null) {
            c0188b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0188b c0188b = this.f4016b;
        if (c0188b != null) {
            c0188b.n(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0233d c0233d = this.f4015a;
        if (c0233d != null) {
            if (c0233d.f3783c) {
                c0233d.f3783c = false;
            } else {
                c0233d.f3783c = true;
                c0233d.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f4017c;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f4017c;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(R.j.u0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0188b c0188b = this.f4016b;
        if (c0188b != null) {
            c0188b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0188b c0188b = this.f4016b;
        if (c0188b != null) {
            c0188b.t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0233d c0233d = this.f4015a;
        if (c0233d != null) {
            c0233d.e = colorStateList;
            c0233d.f3781a = true;
            c0233d.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0233d c0233d = this.f4015a;
        if (c0233d != null) {
            c0233d.f3785f = mode;
            c0233d.f3782b = true;
            c0233d.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f4017c;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f4017c;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f4017c;
        if (x2 != null) {
            x2.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(h0.f.n(getContext(), i));
    }
}
