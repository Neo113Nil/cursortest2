package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class Scene {
    public final View mLayout;
    public final ViewGroup mSceneRoot;

    public Scene(View view, ViewGroup viewGroup) {
        this.mSceneRoot = viewGroup;
        this.mLayout = view;
    }
}
