package G0;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import m.B0;

/* loaded from: classes.dex */
public final class h extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1190b;

    public /* synthetic */ h(int i, Object obj) {
        this.f1189a = i;
        this.f1190b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f1189a) {
            case 0:
                ((ViewPager) this.f1190b).e();
                break;
            default:
                B0 b02 = (B0) this.f1190b;
                if (b02.f39252S.isShowing()) {
                    b02.show();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f1189a) {
            case 0:
                ((ViewPager) this.f1190b).e();
                break;
            default:
                ((B0) this.f1190b).dismiss();
                break;
        }
    }
}
