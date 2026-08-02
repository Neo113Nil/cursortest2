package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineService;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public interface FlowZiplineCollector extends ZiplineService {
    Object emit(Object obj, Continuation continuation);
}
