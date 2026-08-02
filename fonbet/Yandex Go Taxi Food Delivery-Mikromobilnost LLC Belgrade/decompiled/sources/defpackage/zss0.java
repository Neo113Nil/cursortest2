package defpackage;

import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SwitchComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class zss0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListItemComponent b;
    public final /* synthetic */ SwitchComponent c;

    public /* synthetic */ zss0(SwitchComponent switchComponent, ListItemComponent listItemComponent) {
        this.a = 0;
        this.c = switchComponent;
        this.b = listItemComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SwitchComponent switchComponent = this.c;
        ListItemComponent listItemComponent = this.b;
        switch (i) {
            case 0:
                SlotItemViewComponent.renderTrailInternal$lambda$2(switchComponent, listItemComponent);
                break;
            case 1:
                qke.v(listItemComponent.getContext());
                switchComponent.toggleWithAnimation();
                break;
            default:
                qke.v(listItemComponent.getContext());
                switchComponent.toggleWithAnimation();
                break;
        }
    }

    public /* synthetic */ zss0(ListItemComponent listItemComponent, SwitchComponent switchComponent, int i) {
        this.a = i;
        this.b = listItemComponent;
        this.c = switchComponent;
    }
}
