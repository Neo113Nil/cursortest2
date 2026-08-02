package defpackage;

import android.view.View;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class zc6 extends wys {
    public static final /* synthetic */ int S = 0;
    public static final /* synthetic */ int T = 0;
    public final /* synthetic */ int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc6(View view, int i) {
        super(view);
        this.R = i;
    }

    @Override // defpackage.wys
    public final boolean X() {
        switch (this.R) {
        }
        return false;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        switch (this.R) {
            case 0:
                int i = ((fd6) obj).a;
                View view = this.a;
                c.C(c.h(i, view), view);
                break;
            default:
                break;
        }
    }
}
