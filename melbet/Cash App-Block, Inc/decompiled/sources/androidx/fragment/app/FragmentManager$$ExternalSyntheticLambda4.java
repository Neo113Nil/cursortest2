package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
public final /* synthetic */ class FragmentManager$$ExternalSyntheticLambda4 implements SavedStateRegistry.SavedStateProvider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FragmentManager$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return ((FragmentManager) obj).saveAllStateInternal();
            default:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                String str = FragmentActivity.LIFECYCLE_TAG;
                fragmentActivity.markFragmentsCreated();
                fragmentActivity.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                return new Bundle();
        }
    }
}
