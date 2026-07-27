package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishLifecycleOkHttp;
import kotlin.text.CatchingFishMockkStateFlow;
import kotlin.text.CatchingFishReduxCardView;
import kotlin.text.CatchingFishToolbarAdMob;
import kotlin.text.CatchingFishToolbarLiveData;
import kotlin.text.CatchingFishViewPagerDagger;
import kotlin.text.CatchingFishViewView;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements CatchingFishToolbarAdMob {
    @Override // kotlin.text.CatchingFishToolbarAdMob
    public final List CatchingFishParcelableFAB() {
        return CatchingFishViewPagerDagger.CatchingFishReduxKtor;
    }

    @Override // kotlin.text.CatchingFishToolbarAdMob
    public final Object CatchingFishSnackbar(Context context) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(context, "context");
        CatchingFishAsyncTaskDagger CatchingFishSensorManager = CatchingFishAsyncTaskDagger.CatchingFishSensorManager(context);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(CatchingFishSensorManager, "getInstance(...)");
        if (!((HashSet) CatchingFishSensorManager.CatchingFishWorkManager).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!CatchingFishViewView.CatchingFishParcelableFAB.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new CatchingFishMockkStateFlow());
        }
        CatchingFishReduxCardView catchingFishReduxCardView = CatchingFishReduxCardView.CatchingFishEspressoTesting;
        catchingFishReduxCardView.getClass();
        catchingFishReduxCardView.CatchingFishViewModelFAB = new Handler();
        catchingFishReduxCardView.CatchingFishLayout.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new CatchingFishLifecycleOkHttp(catchingFishReduxCardView));
        return catchingFishReduxCardView;
    }
}
