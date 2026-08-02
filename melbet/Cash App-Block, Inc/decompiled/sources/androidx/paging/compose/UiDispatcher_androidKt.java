package androidx.paging.compose;

import androidx.compose.ui.platform.AndroidUiDispatcher;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class UiDispatcher_androidKt {
    public static final CoroutineContext uiDispatcher = (CoroutineContext) AndroidUiDispatcher.Main$delegate.getValue();
}
