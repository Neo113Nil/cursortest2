package defpackage;

import ru.yandex.taxi.design.AnimatedListItemInputComponent;

/* loaded from: classes5.dex */
public final /* synthetic */ class uvh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnimatedListItemInputComponent b;

    public /* synthetic */ uvh(AnimatedListItemInputComponent animatedListItemInputComponent, int i) {
        this.a = i;
        this.b = animatedListItemInputComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AnimatedListItemInputComponent animatedListItemInputComponent = this.b;
        switch (i) {
            case 0:
                animatedListItemInputComponent.setVisibility(8);
                break;
            default:
                animatedListItemInputComponent.focusInput();
                break;
        }
    }
}
