package G0;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import m.B0;

/* loaded from: classes.dex */
public final class i extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1046b;

    public /* synthetic */ i(int i, Object obj) {
        this.f1045a = i;
        this.f1046b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f1045a) {
            case 0:
                ((ViewPager) this.f1046b).e();
                break;
            default:
                B0 b02 = (B0) this.f1046b;
                if (b02.f38985S.isShowing()) {
                    b02.show();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f1045a) {
            case 0:
                ((ViewPager) this.f1046b).e();
                break;
            default:
                ((B0) this.f1046b).dismiss();
                break;
        }
    }
}
