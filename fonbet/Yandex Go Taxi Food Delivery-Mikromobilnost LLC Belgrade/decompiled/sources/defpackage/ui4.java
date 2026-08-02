package defpackage;

import ru.yandex.taxi.widget.BackportNumberPicker;

/* loaded from: classes6.dex */
public final class ui4 implements Runnable {
    public boolean a;
    public final /* synthetic */ BackportNumberPicker b;

    public ui4(BackportNumberPicker backportNumberPicker) {
        this.b = backportNumberPicker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.a;
        BackportNumberPicker backportNumberPicker = this.b;
        backportNumberPicker.changeValueByOne(z);
        backportNumberPicker.postDelayed(this, 300L);
    }
}
