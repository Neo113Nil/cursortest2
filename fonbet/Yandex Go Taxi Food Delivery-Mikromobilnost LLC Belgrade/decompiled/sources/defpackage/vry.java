package defpackage;

import ru.yandex.taxi.design.ListItemExpandableContainerComponent;

/* loaded from: classes5.dex */
public final /* synthetic */ class vry implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListItemExpandableContainerComponent b;

    public /* synthetic */ vry(ListItemExpandableContainerComponent listItemExpandableContainerComponent, int i) {
        this.a = i;
        this.b = listItemExpandableContainerComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ListItemExpandableContainerComponent listItemExpandableContainerComponent = this.b;
        switch (i) {
            case 0:
                ListItemExpandableContainerComponent.collapseAnimated$lambda$0(listItemExpandableContainerComponent);
                break;
            default:
                ListItemExpandableContainerComponent.expandAnimated$lambda$0(listItemExpandableContainerComponent);
                break;
        }
    }
}
