package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class rc6 extends wys {
    public static final /* synthetic */ int T = 0;
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public final /* synthetic */ int R;
    public final View S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc6(View view, int i) {
        super(view);
        this.R = i;
        this.S = view;
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
        int i = this.R;
        View view = this.S;
        switch (i) {
            case 0:
                ((GoImageView) view).setImageDrawable(((cd6) obj).a.getDrawable());
                break;
            case 1:
                ((ListGroupHeaderComponent) view).setTitle(((dq4) obj).a);
                break;
            default:
                ((ListItemComponent) view).setTitle(((vca0) obj).b);
                break;
        }
    }
}
