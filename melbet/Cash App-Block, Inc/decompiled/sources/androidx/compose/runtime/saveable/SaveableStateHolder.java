package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* loaded from: classes.dex */
public interface SaveableStateHolder {
    void SaveableStateProvider(Object obj, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i);

    void removeState(Object obj);
}
