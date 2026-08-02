package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class x3q0 extends wys {
    public static final /* synthetic */ int S = 0;
    public static final /* synthetic */ int T = 0;
    public final /* synthetic */ int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3q0(View view, int i) {
        super(view);
        this.R = i;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        switch (this.R) {
            case 0:
                break;
            default:
                ListItemComponent listItemComponent = (ListItemComponent) this.a;
                listItemComponent.setTitle(((jsy) obj).a);
                listItemComponent.setSubtitle("");
                listItemComponent.setTitleAlignment(0);
                listItemComponent.setSubtitleAlignment(0);
                break;
        }
    }
}
