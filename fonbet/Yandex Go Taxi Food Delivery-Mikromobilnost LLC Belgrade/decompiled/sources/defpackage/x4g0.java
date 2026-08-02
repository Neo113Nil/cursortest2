package defpackage;

import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.settings.presentation.system_disabled.PushSystemDisabledView;

/* loaded from: classes6.dex */
public final class x4g0 implements v4g0 {
    public final /* synthetic */ PushSystemDisabledView a;

    public x4g0(PushSystemDisabledView pushSystemDisabledView) {
        this.a = pushSystemDisabledView;
    }

    @Override // defpackage.v4g0
    public final void Ae(String str) {
        ListItemComponent listItemComponent;
        listItemComponent = this.a.item;
        listItemComponent.setTitle(str);
    }

    @Override // defpackage.v4g0
    public final void Rc(String str) {
        ListItemComponent listItemComponent;
        listItemComponent = this.a.item;
        listItemComponent.setSubtitle(str);
    }

    @Override // defpackage.v4g0
    public final void f3(String str) {
        ListTitleComponent listTitleComponent;
        listTitleComponent = this.a.sectionTitle;
        listTitleComponent.setTitle(str);
    }
}
