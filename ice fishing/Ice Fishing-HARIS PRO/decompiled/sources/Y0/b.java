package Y0;

import D1.i;
import android.view.MenuItem;
import com.lumenpath.harispro.hrnavigator.MainActivity;
import com.lumenpath.harispro.hrnavigator.databinding.ActivityMainBinding;
import f0.w;
import f0.z;

/* loaded from: classes.dex */
public final /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1400a;

    public /* synthetic */ b(MainActivity mainActivity) {
        this.f1400a = mainActivity;
    }

    public final void a(z zVar, w wVar) {
        int i = MainActivity.f2774B;
        i.e(zVar, "<unused var>");
        i.e(wVar, "destination");
        MainActivity mainActivity = this.f1400a;
        boolean contains = mainActivity.f2775A.contains(Integer.valueOf(wVar.f2994h));
        ActivityMainBinding activityMainBinding = mainActivity.f2776x;
        if (activityMainBinding == null) {
            i.i("binding");
            throw null;
        }
        activityMainBinding.bottomNavigation.setVisibility(contains ? 0 : 8);
        mainActivity.u(contains);
        if (contains) {
            ActivityMainBinding activityMainBinding2 = mainActivity.f2776x;
            if (activityMainBinding2 == null) {
                i.i("binding");
                throw null;
            }
            MenuItem findItem = activityMainBinding2.bottomNavigation.getMenu().findItem(wVar.f2994h);
            if (findItem != null) {
                findItem.setChecked(true);
            }
        }
    }
}
