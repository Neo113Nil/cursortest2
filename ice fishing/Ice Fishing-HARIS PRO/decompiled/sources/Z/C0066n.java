package Z;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.InterfaceC0101s;

/* renamed from: Z.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066n implements androidx.lifecycle.A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f1565a;

    public C0066n(DialogFragment dialogFragment) {
        this.f1565a = dialogFragment;
    }

    @Override // androidx.lifecycle.A
    public final void a(Object obj) {
        if (((InterfaceC0101s) obj) != null) {
            DialogFragment dialogFragment = this.f1565a;
            if (dialogFragment.f1970d0) {
                View I2 = dialogFragment.I();
                if (I2.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogFragment.f1974h0 != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogFragment.f1974h0);
                    }
                    dialogFragment.f1974h0.setContentView(I2);
                }
            }
        }
    }
}
