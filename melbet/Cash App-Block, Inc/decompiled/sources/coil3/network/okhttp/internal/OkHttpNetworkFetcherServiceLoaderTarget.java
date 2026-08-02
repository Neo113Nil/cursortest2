package coil3.network.okhttp.internal;

import bo.app.zg$$ExternalSyntheticLambda0;
import coil3.Uri;
import coil3.network.NetworkFetcher;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class OkHttpNetworkFetcherServiceLoaderTarget {
    public final NetworkFetcher.Factory factory$1() {
        return new NetworkFetcher.Factory(new zg$$ExternalSyntheticLambda0(10));
    }

    public final KClass type() {
        return Reflection.factory.getOrCreateKotlinClass(Uri.class);
    }
}
