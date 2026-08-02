package app.cash.zipline.loader.internal.fetcher;

import app.cash.zipline.EventListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;

/* loaded from: classes3.dex */
public interface Fetcher {
    Object fetch(String str, EventListener eventListener, String str2, ByteString byteString, long j, String str3, String str4, ContinuationImpl continuationImpl);
}
