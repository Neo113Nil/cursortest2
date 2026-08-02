package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.semantics.CollectionInfo;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;

/* loaded from: classes3.dex */
public interface LazyLayoutSemanticState {
    CollectionInfo collectionInfo();

    int getContentPadding();

    float getMaxScrollOffset();

    float getScrollOffset();

    int getViewport();

    Object scrollToItem(int i, RingtoneView$playRingtone$1 ringtoneView$playRingtone$1);
}
