package c0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f5631a;

    /* renamed from: b, reason: collision with root package name */
    public final O2.i f5632b;

    public e(KeyListener keyListener) {
        O2.i iVar = new O2.i(15);
        this.f5631a = keyListener;
        this.f5632b = iVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f5631a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f5631a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z6;
        this.f5632b.getClass();
        if (i != 67 ? i != 112 ? false : b3.e.q(editable, keyEvent, true) : b3.e.q(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z6 = true;
        } else {
            z6 = false;
        }
        return z6 || this.f5631a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f5631a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f5631a.onKeyUp(view, editable, i, keyEvent);
    }
}
