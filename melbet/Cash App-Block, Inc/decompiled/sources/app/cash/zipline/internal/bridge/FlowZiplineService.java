package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineService;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public interface FlowZiplineService extends ZiplineService {
    Object collect(FlowZiplineCollector flowZiplineCollector, ContinuationImpl continuationImpl);
}
