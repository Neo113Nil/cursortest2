package bo.app;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.paging.CachedPagingDataKt$cachedIn$4;
import androidx.viewpager.widget.ViewPager;
import app.cash.broadway.ui.compose.ChromeConfigAggregator;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ComposeUiViewKt;
import app.cash.broadway.ui.compose.DialogEventDispatcher;
import app.cash.broadway.ui.compose.FullScreenAggregator;
import app.cash.broadway.ui.compose.OrientationAggregator;
import app.cash.broadway.ui.compose.SecureScreenAggregator;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.molecule.AndroidUiDispatcher;
import coil3.disk.UtilsKt;
import coil3.network.CacheStrategy;
import coil3.network.UncoordinatedConcurrentRequestStrategy;
import coil3.network.okhttp.internal.OkHttpNetworkFetcherServiceLoaderTarget;
import coil3.util.DecoderServiceLoaderTarget;
import coil3.util.ServiceLoaderComponentRegistry;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public final /* synthetic */ class u4$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ u4$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        String enableDelayedInitialization$lambda$0;
        String enableDelayedInitialization$lambda$1;
        String enableDelayedInitialization$lambda$2;
        String stopInstance$lambda$0;
        String stopInstance$lambda$1$0;
        String stopInstance$lambda$1$1;
        String stopInstance$lambda$2;
        String cancelChildren$lambda$0;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                return u4.a();
            case 1:
                throw new IllegalStateException("CompositionLocal LocalActivityLifecycleOwner not present");
            case 2:
                throw new IllegalStateException("CompositionLocal LocalActivityLifecycleOwner not present");
            case 3:
                throw new IllegalStateException("LocalRenavigationDispatcher is only available when being executed by Broadway or under test using MoleculePresenter#test.");
            case 4:
                throw new IllegalStateException("LocalSwipeCallbackDispatcher is only available when being executed by Broadway or under test using MoleculePresenter#test.");
            case 5:
                return new ChromeConfigAggregator();
            case 6:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ChromeConfigKt.LocalChromeConfigAggregator;
                return null;
            case 7:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ComposeUiViewKt.LocalInComposeContainer;
                return Boolean.FALSE;
            case 8:
                return new DialogEventDispatcher();
            case 9:
                return new FullScreenAggregator();
            case 10:
                return new OrientationAggregator();
            case 11:
                return new SecureScreenAggregator();
            case 12:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = UiScopeKt.LocalContainerSharedTransitionScope;
                return null;
            case 13:
                Locale locale = Locale.getDefault();
                locale.getClass();
                return locale;
            case 14:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    choreographer = (Choreographer) JobKt.runBlockingK(MainDispatcherLoader.dispatcher, new CachedPagingDataKt$cachedIn$4(5));
                }
                choreographer.getClass();
                Handler createAsync = Handler.createAsync(Looper.getMainLooper());
                createAsync.getClass();
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, createAsync);
                return androidUiDispatcher.plus(androidUiDispatcher.frameClock);
            case 15:
                try {
                    return Activity.class.getDeclaredMethod("setDisablePreviewScreenshots", Boolean.TYPE);
                } catch (Throwable unused) {
                    return null;
                }
            case 16:
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                return MainDispatcherLoader.dispatcher.immediate;
            case 17:
                return UtilsKt.singletonDiskCache();
            case 18:
                List sortedWith = CollectionsKt.sortedWith(ServiceLoaderComponentRegistry.getFetchers(), new ViewPager.AnonymousClass1(18));
                ArrayList arrayList = new ArrayList();
                int size = sortedWith.size();
                while (i < size) {
                    OkHttpNetworkFetcherServiceLoaderTarget okHttpNetworkFetcherServiceLoaderTarget = (OkHttpNetworkFetcherServiceLoaderTarget) sortedWith.get(i);
                    okHttpNetworkFetcherServiceLoaderTarget.getClass();
                    arrayList.add(new Pair(okHttpNetworkFetcherServiceLoaderTarget.factory$1(), okHttpNetworkFetcherServiceLoaderTarget.type()));
                    i++;
                }
                return arrayList;
            case 19:
                List sortedWith2 = CollectionsKt.sortedWith(ServiceLoaderComponentRegistry.getDecoders(), new ViewPager.AnonymousClass1(19));
                ArrayList arrayList2 = new ArrayList();
                int size2 = sortedWith2.size();
                while (i < size2) {
                    arrayList2.add(((DecoderServiceLoaderTarget) sortedWith2.get(i)).factory());
                    i++;
                }
                return arrayList2;
            case 20:
                return CacheStrategy.DEFAULT;
            case 21:
                return UncoordinatedConcurrentRequestStrategy.UNCOORDINATED;
            case 22:
                enableDelayedInitialization$lambda$0 = Braze.Companion.enableDelayedInitialization$lambda$0();
                return enableDelayedInitialization$lambda$0;
            case 23:
                enableDelayedInitialization$lambda$1 = Braze.Companion.enableDelayedInitialization$lambda$1();
                return enableDelayedInitialization$lambda$1;
            case 24:
                enableDelayedInitialization$lambda$2 = Braze.Companion.enableDelayedInitialization$lambda$2();
                return enableDelayedInitialization$lambda$2;
            case 25:
                stopInstance$lambda$0 = Braze.Companion.stopInstance$lambda$0();
                return stopInstance$lambda$0;
            case 26:
                stopInstance$lambda$1$0 = Braze.Companion.stopInstance$lambda$1$0();
                return stopInstance$lambda$1$0;
            case 27:
                stopInstance$lambda$1$1 = Braze.Companion.stopInstance$lambda$1$1();
                return stopInstance$lambda$1$1;
            case 28:
                stopInstance$lambda$2 = Braze.Companion.stopInstance$lambda$2();
                return stopInstance$lambda$2;
            default:
                cancelChildren$lambda$0 = BrazeCoroutineScope.cancelChildren$lambda$0();
                return cancelChildren$lambda$0;
        }
    }
}
