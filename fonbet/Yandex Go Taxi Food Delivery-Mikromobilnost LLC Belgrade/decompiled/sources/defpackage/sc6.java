package defpackage;

import android.view.View;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class sc6 extends wys {
    public static final /* synthetic */ int S = 0;
    public static final /* synthetic */ int T = 0;
    public final /* synthetic */ int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc6(View view, int i) {
        super(view);
        this.R = i;
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.R) {
            case 0:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        switch (this.R) {
            case 0:
                break;
            default:
                int i = ((v2j) obj).a;
                View view = this.a;
                c.C(c.h(i, view), view);
                break;
        }
    }
}
