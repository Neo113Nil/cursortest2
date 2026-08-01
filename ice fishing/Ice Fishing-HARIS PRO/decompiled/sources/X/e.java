package X;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f1383a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.e f1384b;

    public e(KeyListener keyListener) {
        S0.e eVar = new S0.e(15);
        this.f1383a = keyListener;
        this.f1384b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f1383a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f1383a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z2;
        this.f1384b.getClass();
        if (i != 67 ? i != 112 ? false : M0.h.a(editable, keyEvent, true) : M0.h.a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f1383a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1383a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f1383a.onKeyUp(view, editable, i, keyEvent);
    }
}
