package h0;

import android.view.View;
import androidx.navigation.fragment.AbstractListDetailFragment;
import m0.C0303k;

/* loaded from: classes.dex */
public final class b implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractListDetailFragment f3243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0303k f3244b;

    public b(AbstractListDetailFragment abstractListDetailFragment, C0303k c0303k) {
        this.f3243a = abstractListDetailFragment;
        this.f3244b = c0303k;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(D1.i.f("view"));
            D1.i.g(illegalArgumentException, D1.i.class.getName());
            throw illegalArgumentException;
        }
        view.removeOnLayoutChangeListener(this);
        a aVar = this.f3243a.f2070W;
        D1.i.b(aVar);
        C0303k c0303k = this.f3244b;
        aVar.b(c0303k.e && c0303k.d());
    }
}
