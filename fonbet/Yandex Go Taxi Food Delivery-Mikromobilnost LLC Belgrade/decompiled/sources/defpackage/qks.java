package defpackage;

import ru.yandex.taxi.design.ListItemInputComponent;

/* loaded from: classes8.dex */
public final /* synthetic */ class qks implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListItemInputComponent b;

    public /* synthetic */ qks(ListItemInputComponent listItemInputComponent, int i) {
        this.a = i;
        this.b = listItemInputComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ListItemInputComponent listItemInputComponent = this.b;
        switch (i) {
            case 0:
                listItemInputComponent.requestInputFocus();
                break;
            default:
                listItemInputComponent.updateInputStateNow();
                break;
        }
    }
}
