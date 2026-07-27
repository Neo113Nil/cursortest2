package kotlin.text;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishFluxMVPToast implements Runnable {
    public final /* synthetic */ CatchingFishGraphQLIntent CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishAppCompatDagger CatchingFishReduxKtor;
    public final /* synthetic */ View CatchingFishViewModelFAB;
    public final /* synthetic */ MainActivity CatchingFishViewModelScope;
    public final /* synthetic */ CatchingFishGraphQLIntent CatchingFishWorkManager;

    public /* synthetic */ CatchingFishFluxMVPToast(CatchingFishAppCompatDagger catchingFishAppCompatDagger, CatchingFishGraphQLIntent catchingFishGraphQLIntent, CatchingFishGraphQLIntent catchingFishGraphQLIntent2, MainActivity mainActivity, View view) {
        this.CatchingFishReduxKtor = catchingFishAppCompatDagger;
        this.CatchingFishDaggerWebsocket = catchingFishGraphQLIntent;
        this.CatchingFishWorkManager = catchingFishGraphQLIntent2;
        this.CatchingFishViewModelScope = mainActivity;
        this.CatchingFishViewModelFAB = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.CatchingFishViewModelScope.getWindow();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(window, "getWindow(...)");
        CatchingFishGraphQLIntent catchingFishGraphQLIntent = this.CatchingFishDaggerWebsocket;
        CatchingFishServiceHandler catchingFishServiceHandler = catchingFishGraphQLIntent.CatchingFishCoroutine;
        View view = this.CatchingFishViewModelFAB;
        Resources resources = view.getResources();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(resources, "getResources(...)");
        boolean booleanValue = ((Boolean) catchingFishServiceHandler.CatchingFishFragmentHandler(resources)).booleanValue();
        CatchingFishGraphQLIntent catchingFishGraphQLIntent2 = this.CatchingFishWorkManager;
        CatchingFishServiceHandler catchingFishServiceHandler2 = catchingFishGraphQLIntent2.CatchingFishCoroutine;
        Resources resources2 = view.getResources();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(resources2, "getResources(...)");
        this.CatchingFishReduxKtor.CatchingFishSnackbar(catchingFishGraphQLIntent, catchingFishGraphQLIntent2, window, view, booleanValue, ((Boolean) catchingFishServiceHandler2.CatchingFishFragmentHandler(resources2)).booleanValue());
    }
}
