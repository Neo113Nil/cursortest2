package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class u extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2497b = 0;

    /* renamed from: a, reason: collision with root package name */
    public Z0.i f2498a;

    public final void a(d dVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.i.d(activity, "activity");
            R1.d.i(activity, dVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(d.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(d.ON_DESTROY);
        this.f2498a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(d.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Z0.i iVar = this.f2498a;
        if (iVar != null) {
            ((r) iVar.f1992b).c();
        }
        a(d.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        Z0.i iVar = this.f2498a;
        if (iVar != null) {
            r rVar = (r) iVar.f1992b;
            int i2 = rVar.f2489a + 1;
            rVar.f2489a = i2;
            if (i2 == 1 && rVar.f2492d) {
                rVar.f2494f.d(d.ON_START);
                rVar.f2492d = false;
            }
        }
        a(d.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(d.ON_STOP);
    }
}
