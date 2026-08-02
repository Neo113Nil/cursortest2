package f0;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0479s;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: u, reason: collision with root package name */
    public final ViewGroup f37422u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AbstractComponentCallbacksC0479s fragment, ViewGroup viewGroup, int i) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        switch (i) {
            case 1:
                h.e(fragment, "fragment");
                super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.f37422u = viewGroup;
                break;
            default:
                this.f37422u = viewGroup;
                break;
        }
    }
}
