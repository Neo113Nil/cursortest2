package bo.app;

import android.os.StatFs;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.core.os.BundleKt;
import coil3.compose.AsyncImageModelEqualityDelegate$Companion$Default$1;
import coil3.compose.AsyncImagePreviewHandler$Companion$Default$1;
import coil3.compose.LocalAsyncImageModelEqualityDelegateKt;
import coil3.disk.RealDiskCache;
import coil3.gif.internal.GifDecoderServiceLoaderTarget;
import coil3.network.okhttp.internal.CallFactoryNetworkClient;
import coil3.network.okhttp.internal.OkHttpNetworkFetcherServiceLoaderTarget;
import coil3.svg.internal.SvgDecoderServiceLoaderTarget;
import com.braze.Braze;
import java.io.File;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import okhttp3.OkHttpClient;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Path;

/* loaded from: classes3.dex */
public final /* synthetic */ class zg$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zg$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ServiceConfigurationError serviceConfigurationError;
        String _init_$lambda$0;
        String requestImmediateDataFlush$lambda$0;
        String changeUser$lambda$1$0;
        String requestImmediateDataFlush$lambda$1$0;
        String closeSession$lambda$0;
        String logPushStoryPageClicked$lambda$1$0;
        String logPushStoryPageClicked$lambda$1$1;
        String logPushNotificationActionClicked$lambda$1$2;
        String logPushNotificationActionClicked$lambda$1$1;
        String logPushNotificationActionClicked$lambda$1$0;
        String closeSession$lambda$1;
        String logPushNotificationOpened$lambda$3$0;
        String logPushNotificationOpened$lambda$3$2;
        String handleInternalBannerRefresh$lambda$0;
        String refreshFeatureFlags$lambda$0;
        String schedulePushDelivery$lambda$0;
        String logPurchase$lambda$1$0;
        switch (this.$r8$classId) {
            case 0:
                return zg.a();
            case 1:
                return zg.b();
            case 2:
                return zg.c();
            case 3:
                return zg.d();
            case 4:
                return zg.e();
            case 5:
                return zg.f();
            case 6:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalAsyncImageModelEqualityDelegateKt.LocalAsyncImageModelEqualityDelegate;
                return AsyncImageModelEqualityDelegate$Companion$Default$1.Default;
            case 7:
                return AsyncImagePreviewHandler$Companion$Default$1.INSTANCE;
            case 8:
                throw new IllegalStateException("CompositionLocal LocalImageLoader not present");
            case 9:
                JvmSystemFileSystem jvmSystemFileSystem = FileSystem.SYSTEM;
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                Path resolve = FileSystem.SYSTEM_TEMPORARY_DIRECTORY.resolve("coil3_disk_cache");
                long j = 10485760;
                try {
                    File file = resolve.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    j = RangesKt___RangesKt.coerceIn((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                } catch (Exception unused) {
                }
                return new RealDiskCache(j, resolve, jvmSystemFileSystem, emptyCoroutineContext);
            case 10:
                return new CallFactoryNetworkClient(new OkHttpClient());
            case 11:
                try {
                    return BundleKt.toImmutableList(SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.asSequence(Arrays.asList(new OkHttpNetworkFetcherServiceLoaderTarget()).iterator())));
                } finally {
                }
            case 12:
                try {
                    return BundleKt.toImmutableList(SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.asSequence(Arrays.asList(new GifDecoderServiceLoaderTarget(), new SvgDecoderServiceLoaderTarget()).iterator())));
                } finally {
                }
            case 13:
                _init_$lambda$0 = Braze._init_$lambda$0();
                return _init_$lambda$0;
            case 14:
                requestImmediateDataFlush$lambda$0 = Braze.requestImmediateDataFlush$lambda$0();
                return requestImmediateDataFlush$lambda$0;
            case 15:
                changeUser$lambda$1$0 = Braze.changeUser$lambda$1$0();
                return changeUser$lambda$1$0;
            case 16:
                requestImmediateDataFlush$lambda$1$0 = Braze.requestImmediateDataFlush$lambda$1$0();
                return requestImmediateDataFlush$lambda$1$0;
            case 17:
                closeSession$lambda$0 = Braze.closeSession$lambda$0();
                return closeSession$lambda$0;
            case 18:
                logPushStoryPageClicked$lambda$1$0 = Braze.logPushStoryPageClicked$lambda$1$0();
                return logPushStoryPageClicked$lambda$1$0;
            case 19:
                logPushStoryPageClicked$lambda$1$1 = Braze.logPushStoryPageClicked$lambda$1$1();
                return logPushStoryPageClicked$lambda$1$1;
            case 20:
                logPushNotificationActionClicked$lambda$1$2 = Braze.logPushNotificationActionClicked$lambda$1$2();
                return logPushNotificationActionClicked$lambda$1$2;
            case 21:
                logPushNotificationActionClicked$lambda$1$1 = Braze.logPushNotificationActionClicked$lambda$1$1();
                return logPushNotificationActionClicked$lambda$1$1;
            case 22:
                logPushNotificationActionClicked$lambda$1$0 = Braze.logPushNotificationActionClicked$lambda$1$0();
                return logPushNotificationActionClicked$lambda$1$0;
            case 23:
                closeSession$lambda$1 = Braze.closeSession$lambda$1();
                return closeSession$lambda$1;
            case 24:
                logPushNotificationOpened$lambda$3$0 = Braze.logPushNotificationOpened$lambda$3$0();
                return logPushNotificationOpened$lambda$3$0;
            case 25:
                logPushNotificationOpened$lambda$3$2 = Braze.logPushNotificationOpened$lambda$3$2();
                return logPushNotificationOpened$lambda$3$2;
            case 26:
                handleInternalBannerRefresh$lambda$0 = Braze.handleInternalBannerRefresh$lambda$0();
                return handleInternalBannerRefresh$lambda$0;
            case 27:
                refreshFeatureFlags$lambda$0 = Braze.refreshFeatureFlags$lambda$0();
                return refreshFeatureFlags$lambda$0;
            case 28:
                schedulePushDelivery$lambda$0 = Braze.schedulePushDelivery$lambda$0();
                return schedulePushDelivery$lambda$0;
            default:
                logPurchase$lambda$1$0 = Braze.logPurchase$lambda$1$0();
                return logPurchase$lambda$1$0;
        }
    }
}
