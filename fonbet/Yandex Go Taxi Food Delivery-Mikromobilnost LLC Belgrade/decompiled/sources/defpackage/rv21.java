package defpackage;

import java.util.List;
import ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.h;

/* loaded from: classes6.dex */
public final class rv21 implements ov21 {
    public final /* synthetic */ UsualOptionSelectorView a;

    public rv21(UsualOptionSelectorView usualOptionSelectorView) {
        this.a = usualOptionSelectorView;
    }

    @Override // defpackage.ov21
    public final void applyTheme(ThemeType themeType) {
        this.a.applyTheme(themeType);
    }

    @Override // defpackage.ov21
    public final void render(List list) {
        h hVar;
        hVar = this.a.listDelegate;
        hVar.c(list);
    }
}
