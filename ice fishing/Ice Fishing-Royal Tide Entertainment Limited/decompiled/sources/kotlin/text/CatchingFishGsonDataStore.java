package kotlin.text;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishGsonDataStore extends CatchingFishPicassoRetrofit implements CatchingFishServiceHandler {
    public static final CatchingFishGsonDataStore CatchingFishEspressoTesting = new CatchingFishGsonDataStore(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
