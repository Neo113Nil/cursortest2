package defpackage;

import ru.yandex.taxi.widget.BackportNumberPicker;

/* loaded from: classes6.dex */
public final class zi4 implements Runnable {
    public int a;
    public int b;
    public final /* synthetic */ BackportNumberPicker c;

    public zi4(BackportNumberPicker backportNumberPicker) {
        this.c = backportNumberPicker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BackportNumberPicker backportNumberPicker = this.c;
        try {
            backportNumberPicker.mInputText.setSelection(this.a, this.b);
        } catch (IndexOutOfBoundsException unused) {
            backportNumberPicker.mInputText.setSelection(backportNumberPicker.mInputText.getText().length());
        }
    }
}
