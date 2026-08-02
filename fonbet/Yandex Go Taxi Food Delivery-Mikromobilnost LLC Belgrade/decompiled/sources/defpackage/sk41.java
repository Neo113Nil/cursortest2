package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$MiniStoryControlType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$StoryNavigationType;
import java.util.List;

/* loaded from: classes2.dex */
public interface sk41 {
    default void dismiss() {
    }

    default void selectPage(int i) {
    }

    default void setStorySelected(int i, boolean z, InMessage$StoryIsVisibleEvent$StoryNavigationType inMessage$StoryIsVisibleEvent$StoryNavigationType, InMessage$StoryIsVisibleEvent$MiniStoryControlType inMessage$StoryIsVisibleEvent$MiniStoryControlType) {
    }

    void showStories(List list, int i);
}
