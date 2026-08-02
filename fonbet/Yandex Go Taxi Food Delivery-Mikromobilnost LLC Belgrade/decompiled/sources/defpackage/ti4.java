package defpackage;

import ru.yandex.taxi.widget.BackportNumberPicker;

/* loaded from: classes6.dex */
public final class ti4 implements Runnable {
    public final /* synthetic */ BackportNumberPicker a;

    public ti4(BackportNumberPicker backportNumberPicker) {
        this.a = backportNumberPicker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BackportNumberPicker backportNumberPicker = this.a;
        backportNumberPicker.showSoftInput();
        backportNumberPicker.mIgnoreMoveEvents = true;
    }
}
