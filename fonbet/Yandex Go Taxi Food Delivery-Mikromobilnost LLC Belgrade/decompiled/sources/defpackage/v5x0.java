package defpackage;

import android.view.View;
import com.yandex.div.legacy.view.RatioImageView;
import com.yandex.div.legacy.view.tab.TabItemLayout;
import com.yandex.div.legacy.view.tab.TabsLayout;

/* loaded from: classes11.dex */
public final /* synthetic */ class v5x0 implements zq31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ggk b;

    public /* synthetic */ v5x0(ggk ggkVar, int i) {
        this.a = i;
        this.b = ggkVar;
    }

    @Override // defpackage.zq31
    public final View a() {
        int i = this.a;
        ggk ggkVar = this.b;
        switch (i) {
            case 0:
                return new TabsLayout(((z5x0) ggkVar).a);
            case 1:
                return new TabItemLayout(((z5x0) ggkVar).a);
            default:
                return new RatioImageView(((atk) ggkVar).a);
        }
    }
}
