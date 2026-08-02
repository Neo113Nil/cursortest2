package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;

/* loaded from: classes3.dex */
public interface LazyLayoutItemProvider {
    void Item(int i, int i2, Composer composer, Object obj);

    default Object getContentType(int i) {
        return null;
    }

    int getIndex(Object obj);

    int getItemCount();

    Object getKey(int i);
}
