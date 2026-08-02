package app.cash.zipline.loader;

import app.cash.zipline.loader.internal.fetcher.HttpFetcher$fetchByteString$1;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ZiplineHttpClient {
    public abstract Object download(String str, List list, HttpFetcher$fetchByteString$1 httpFetcher$fetchByteString$1);

    public abstract Object openDevelopmentServerWebSocket(String str, List list, FastCodeUpdatesKt$withDevelopmentServerPush$1 fastCodeUpdatesKt$withDevelopmentServerPush$1);
}
