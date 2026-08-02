package androidx.fragment.app;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class FragmentHostCallback extends FragmentContainer {
    public final FragmentActivity activity;
    public final FragmentActivity context;
    public final FragmentManagerImpl fragmentManager;
    public final Handler handler;

    public FragmentHostCallback(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.activity = fragmentActivity;
        this.context = fragmentActivity;
        this.handler = handler;
        this.fragmentManager = new FragmentManagerImpl();
    }
}
