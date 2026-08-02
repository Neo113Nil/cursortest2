package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class j79 extends tqr implements f29 {
    public final /* synthetic */ g29 l;
    public final Drawable m;
    public one n;
    public final ArrayList o;
    public lb4 p;
    public String q;
    public TextView.OnEditorActionListener r;
    public boolean s;
    public boolean t;

    public j79(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new g29();
        this.m = context.getDrawable(getNativeBackgroundResId());
        this.o = new ArrayList();
        this.s = true;
    }

    private int getNativeBackgroundResId() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.editTextBackground, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.f29, defpackage.a0c, defpackage.ptn
    public final void a() {
        this.l.a();
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.l.d(view);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int save;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        tp8 divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        if (scrollX == 0 && scrollY == 0) {
            save = canvas.save();
            try {
                divBorderDrawer.c(canvas);
                super.draw(canvas);
                divBorderDrawer.d(canvas);
                return;
            } finally {
            }
        }
        float f = scrollX;
        float f2 = scrollY;
        save = canvas.save();
        try {
            canvas.translate(f, f2);
            divBorderDrawer.c(canvas);
            canvas.translate(-f, -f2);
            super.draw(canvas);
            canvas.translate(f, f2);
            divBorderDrawer.d(canvas);
        } finally {
        }
    }

    @Override // defpackage.p7t
    public final boolean e() {
        return this.l.b.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.l.g(e23Var, op8Var, view);
    }

    public boolean getAccessibilityEnabled$div_release() {
        return this.t;
    }

    @Override // defpackage.f29
    public e23 getBindingContext() {
        return this.l.d;
    }

    @Override // defpackage.f29
    public jb8 getDiv() {
        return (jb8) this.l.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.l.a.a;
    }

    public boolean getEnabled() {
        return this.s;
    }

    public one getFocusTracker$div_release() {
        return this.n;
    }

    public Drawable getNativeBackground$div_release() {
        return this.m;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.l.a.b;
    }

    @Override // defpackage.a0c
    @NotNull
    public List<ja8> getSubscriptions() {
        return this.l.e;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.l.h(view);
    }

    @Override // defpackage.a0c
    public final void i(ja8 ja8Var) {
        this.l.i(ja8Var);
    }

    @Override // defpackage.yp8
    public final void k() {
        this.l.k();
    }

    @Override // defpackage.a0c
    public final void l() {
        this.l.l();
    }

    @Override // defpackage.yp8
    public final void m() {
        this.l.m();
    }

    @Override // defpackage.kr0, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        return (getInputType() & SQLiteDatabase.OPEN_SHAREDCACHE) == 0 ? onCreateInputConnection : new i79((x3b) onCreateInputConnection, this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        one focusTracker$div_release = getFocusTracker$div_release();
        if (focusTracker$div_release != null) {
            Object tag = getTag();
            if (!focusTracker$div_release.b) {
                if (z) {
                    focusTracker$div_release.a = tag;
                    one.d = new WeakReference(this);
                    setSelection(length());
                } else if (!z) {
                    focusTracker$div_release.a = null;
                    one.d = null;
                }
            }
        }
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if ((getInputType() & SQLiteDatabase.OPEN_SHAREDCACHE) != 0 && (i == 66 || i == 160)) {
            int imeOptions = getImeOptions() & KotlinVersion.MAX_COMPONENT_VALUE;
            TextView.OnEditorActionListener onEditorActionListener = this.r;
            if (onEditorActionListener != null) {
                return onEditorActionListener.onEditorAction(this, imeOptions, keyEvent);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.tqr, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.l.b(i, i2);
    }

    public void setAccessibilityEnabled$div_release(boolean z) {
        this.t = z;
        setInputHint(this.q);
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.l.d = e23Var;
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        setInputHint(this.q);
    }

    public void setEnabled$div_release(boolean z) {
        this.s = z;
        setFocusable(z);
        setFocusableInTouchMode(z);
    }

    public void setFocusTracker$div_release(one oneVar) {
        this.n = oneVar;
    }

    public void setInputHint(String str) {
        CharSequence contentDescription;
        CharSequence charSequence;
        this.q = str;
        CharSequence charSequence2 = str;
        if (getAccessibilityEnabled$div_release()) {
            if ((str == null || str.length() == 0) && ((contentDescription = getContentDescription()) == null || contentDescription.length() == 0)) {
                charSequence2 = null;
            } else if (str == null || str.length() == 0) {
                charSequence2 = getContentDescription();
            } else {
                CharSequence contentDescription2 = getContentDescription();
                charSequence2 = str;
                if (contentDescription2 != null) {
                    charSequence2 = str;
                    if (contentDescription2.length() != 0) {
                        StringBuilder sb = new StringBuilder();
                        char[] cArr = {'.'};
                        str.getClass();
                        int length = str.length() - 1;
                        if (length >= 0) {
                            while (true) {
                                int i = length - 1;
                                if (!xz0.s(cArr, str.charAt(length))) {
                                    charSequence = str.subSequence(0, length + 1);
                                    break;
                                } else if (i < 0) {
                                    break;
                                } else {
                                    length = i;
                                }
                            }
                        }
                        charSequence = "";
                        sb.append(charSequence.toString());
                        sb.append(". ");
                        sb.append((Object) getContentDescription());
                        charSequence2 = sb.toString();
                    }
                }
            }
        }
        setHint(charSequence2);
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        if (getInputType() == i) {
            return;
        }
        super.setInputType(i);
    }

    @Override // defpackage.kr0, android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        if (Intrinsics.d(getKeyListener(), keyListener)) {
            return;
        }
        super.setKeyListener(keyListener);
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.l.setNeedClipping(z);
    }

    @Override // android.widget.TextView
    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        super.setOnEditorActionListener(onEditorActionListener);
        this.r = onEditorActionListener;
    }

    @Override // defpackage.f29
    public void setDiv(jb8 jb8Var) {
        this.l.c = jb8Var;
    }

    public j79(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ j79(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? ru.yandex.music.R.attr.divInputStyle : i);
    }

    public j79(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
