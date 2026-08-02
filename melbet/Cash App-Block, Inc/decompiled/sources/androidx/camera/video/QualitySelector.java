package androidx.camera.video;

import androidx.room.TransactorKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class QualitySelector {
    public static final QualitySelector NONE = new QualitySelector(Collections.EMPTY_LIST, AutoValue_FallbackStrategy_RuleStrategy.NONE);
    public final AutoValue_FallbackStrategy_RuleStrategy mFallbackStrategy;
    public final List mPreferredQualityList;

    public QualitySelector(List list, AutoValue_FallbackStrategy_RuleStrategy autoValue_FallbackStrategy_RuleStrategy) {
        this.mPreferredQualityList = Collections.unmodifiableList(new ArrayList(list));
        this.mFallbackStrategy = autoValue_FallbackStrategy_RuleStrategy;
    }

    public static QualitySelector fromOrderedList(List list, AutoValue_FallbackStrategy_RuleStrategy autoValue_FallbackStrategy_RuleStrategy) {
        TransactorKt.checkNotNull(list, "qualities cannot be null");
        TransactorKt.checkNotNull(autoValue_FallbackStrategy_RuleStrategy, "fallbackStrategy cannot be null");
        TransactorKt.checkArgument("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = (AutoValue_Quality_ConstantQuality) it.next();
            TransactorKt.checkArgument("qualities contain invalid quality: " + autoValue_Quality_ConstantQuality, AutoValue_Quality_ConstantQuality.QUALITIES.contains(autoValue_Quality_ConstantQuality));
        }
        return new QualitySelector(list, autoValue_FallbackStrategy_RuleStrategy);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.mPreferredQualityList + ", fallbackStrategy=" + this.mFallbackStrategy + "}";
    }
}
