package defpackage;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.emoji2.viewsintegration.a;

/* loaded from: classes.dex */
public final class qr2 {
    public final EditText a;
    public final a b;

    public qr2(EditText editText) {
        this.a = editText;
        this.b = new a(editText, false);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        this.b.getClass();
        return a.a(keyListener);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, n4i0.AppCompatTextView, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(n4i0.AppCompatTextView_emojiCompatEnabled) ? obtainStyledAttributes.getBoolean(n4i0.AppCompatTextView_emojiCompatEnabled, true) : true;
            obtainStyledAttributes.recycle();
            this.b.e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
