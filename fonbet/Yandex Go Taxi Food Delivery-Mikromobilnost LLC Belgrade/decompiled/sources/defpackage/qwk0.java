package defpackage;

import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes6.dex */
public final /* synthetic */ class qwk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RotatableFloatButton b;

    public /* synthetic */ qwk0(RotatableFloatButton rotatableFloatButton, int i) {
        this.a = i;
        this.b = rotatableFloatButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RotatableFloatButton rotatableFloatButton = this.b;
        switch (i) {
            case 0:
                rotatableFloatButton.setVisibility(0);
                break;
            default:
                RotatableFloatButton.hide$lambda$0$0(rotatableFloatButton);
                break;
        }
    }
}
