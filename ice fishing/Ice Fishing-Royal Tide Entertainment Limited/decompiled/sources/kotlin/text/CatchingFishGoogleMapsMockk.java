package kotlin.text;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class CatchingFishGoogleMapsMockk extends FrameLayout implements CatchingFishMVVMRetrofit {
    public final CollapsibleActionView CatchingFishReduxKtor;

    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishGoogleMapsMockk(View view) {
        super(view.getContext());
        this.CatchingFishReduxKtor = (CollapsibleActionView) view;
        addView(view);
    }
}
