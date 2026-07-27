package G0;

import android.database.DataSetObservable;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public abstract class a {
    public a() {
        new DataSetObservable();
    }

    public abstract void a(ViewPager viewPager, Object obj);

    public abstract int b();

    public abstract View c(ViewPager viewPager, int i);

    public abstract boolean d(View view, Object obj);
}
