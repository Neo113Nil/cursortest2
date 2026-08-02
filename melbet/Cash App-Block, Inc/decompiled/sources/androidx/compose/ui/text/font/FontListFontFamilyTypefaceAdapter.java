package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.DispatcherKt;
import coil3.RealImageLoaderKt$CoroutineScope$$inlined$CoroutineExceptionHandler$1;
import com.squareup.wire.GrpcMethod;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter {
    public static final RealImageLoaderKt$CoroutineScope$$inlined$CoroutineExceptionHandler$1 DropExceptionHandler = new RealImageLoaderKt$CoroutineScope$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.$$INSTANCE, 1);
    public final ContextScope asyncLoadScope;
    public final GrpcMethod asyncTypefaceCache;

    public FontListFontFamilyTypefaceAdapter(GrpcMethod grpcMethod) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        this.asyncTypefaceCache = grpcMethod;
        CoroutineContext plus = DropExceptionHandler.plus(DispatcherKt.FontCacheManagementDispatcher).plus(emptyCoroutineContext);
        emptyCoroutineContext.getClass();
        this.asyncLoadScope = JobKt.CoroutineScope(plus.plus(new SupervisorJobImpl(null)));
    }
}
