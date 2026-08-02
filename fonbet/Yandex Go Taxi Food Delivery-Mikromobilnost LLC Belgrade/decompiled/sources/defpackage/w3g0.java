package defpackage;

import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.settings.presentation.notification.PushSettingsNotification;

/* loaded from: classes6.dex */
public final class w3g0 implements x3g0 {
    public final /* synthetic */ PushSettingsNotification a;

    public w3g0(PushSettingsNotification pushSettingsNotification) {
        this.a = pushSettingsNotification;
    }

    @Override // defpackage.x3g0
    public final void P1(String str) {
        pav pavVar;
        ListItemComponent listItemComponent;
        PushSettingsNotification pushSettingsNotification = this.a;
        pavVar = pushSettingsNotification.imageLoader;
        listItemComponent = pushSettingsNotification.listItem;
        ((nac) pavVar.a(listItemComponent.getLeadImageView())).c(str);
    }

    @Override // defpackage.x3g0
    public final void setSubtitle(String str) {
        ListItemComponent listItemComponent;
        listItemComponent = this.a.listItem;
        listItemComponent.setSubtitle(str);
    }

    @Override // defpackage.x3g0
    public final void setTitle(String str) {
        ListItemComponent listItemComponent;
        listItemComponent = this.a.listItem;
        listItemComponent.setTitle(str);
    }
}
