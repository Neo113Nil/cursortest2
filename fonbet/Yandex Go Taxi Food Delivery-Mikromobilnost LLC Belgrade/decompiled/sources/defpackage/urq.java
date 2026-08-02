package defpackage;

import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$AchievementIconChoice;
import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$FeedbackBadgeType;
import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$TagChoice;
import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$TextChoice;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes15.dex */
public final class urq extends lnt {
    public static final urq f = new urq();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, FeedbackBadgeChoice$TextChoice.Companion.serializer(), qoi0.a(FeedbackBadgeChoice$TextChoice.class));
    }

    @Override // defpackage.h9
    public final List f() {
        FeedbackBadgeChoice$FeedbackBadgeType feedbackBadgeChoice$FeedbackBadgeType = FeedbackBadgeChoice$FeedbackBadgeType.ACHIEVEMENT_ICON;
        f9 f9Var = new f9((String) h().invoke(feedbackBadgeChoice$FeedbackBadgeType), FeedbackBadgeChoice$AchievementIconChoice.Companion.serializer(), qoi0.a(FeedbackBadgeChoice$AchievementIconChoice.class));
        FeedbackBadgeChoice$FeedbackBadgeType feedbackBadgeChoice$FeedbackBadgeType2 = FeedbackBadgeChoice$FeedbackBadgeType.TAG;
        return Arrays.asList(f9Var, new f9((String) h().invoke(feedbackBadgeChoice$FeedbackBadgeType2), FeedbackBadgeChoice$TagChoice.Companion.serializer(), qoi0.a(FeedbackBadgeChoice$TagChoice.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return FeedbackBadgeChoice$FeedbackBadgeType.Companion.serializer();
    }
}
