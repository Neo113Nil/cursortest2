package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Density;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public interface PressGestureScope extends Density {
    Object awaitRelease(ContinuationImpl continuationImpl);

    Object tryAwaitRelease(ContinuationImpl continuationImpl);
}
