package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes9.dex */
public abstract class ws11 {
    private View view;

    public final View ensureCreatedView(ViewGroup viewGroup) {
        if (this.view == null) {
            this.view = onCreateView(viewGroup);
        }
        View view = this.view;
        if (view != null) {
            return view;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public final void ensureDestroyedView() {
        View view = this.view;
        if (view != null) {
            onDestroyView(view);
            this.view = null;
        }
    }

    public abstract View onCreateView(ViewGroup viewGroup);

    public void onDestroy() {
    }

    public abstract void onDestroyView(View view);

    public void onRestoreState(Bundle bundle) {
    }

    public void onSaveState(Bundle bundle) {
    }

    public abstract void onUpdateState(Object obj);
}
