package com.squareup.cash.education.stories.backend.real;

import android.graphics.Color;
import com.google.zxing.Result;
import com.squareup.cash.education.stories.backend.api.EducationStory;
import com.squareup.cash.education.stories.backend.api.SceneBackground;
import com.squareup.cash.education.stories.db.Education_story;
import com.squareup.cash.education.stories.db.Education_story_scene_data;
import com.squareup.cash.education.stories.service.api.EducationStoryService;
import com.squareup.cash.education.stories.service.api.models.SceneColor;
import com.squareup.cash.education.stories.service.api.models.SceneData;
import com.squareup.cash.education.stories.service.api.models.Story;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.scannerview.SizeMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class RealEducationStoryRepository {
    public final AndroidClock clock;
    public final SizeMap colorParser;
    public final ErrorReporter errorReporter;
    public final StateFlowImpl expiryTime;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final Result storyDao;
    public final EducationStoryService storyService;

    public RealEducationStoryRepository(FeatureFlagManager featureFlagManager, EducationStoryService educationStoryService, SizeMap sizeMap, AndroidClock androidClock, ErrorReporter errorReporter, CoroutineContext coroutineContext, Result result) {
        this.featureFlagManager = featureFlagManager;
        this.storyService = educationStoryService;
        this.colorParser = sizeMap;
        this.clock = androidClock;
        this.errorReporter = errorReporter;
        this.ioDispatcher = coroutineContext;
        this.storyDao = result;
        this.expiryTime = FlowKt.MutableStateFlow(Long.valueOf(androidClock.millis()));
    }

    public static final EducationStory access$toDomainModel(RealEducationStoryRepository realEducationStoryRepository, EducationStoryEntity educationStoryEntity) {
        Education_story education_story = educationStoryEntity.story;
        String str = education_story.url;
        String str2 = education_story.title;
        String str3 = education_story.thumbnail;
        Long l = education_story.primaryColor;
        Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
        String str4 = educationStoryEntity.story.slug;
        ArrayList arrayList = educationStoryEntity.sceneData;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long l2 = ((Education_story_scene_data) it.next()).backgroundColor;
            Integer valueOf2 = l2 != null ? Integer.valueOf((int) l2.longValue()) : null;
            arrayList2.add(valueOf2 != null ? new SceneBackground.Color(valueOf2.intValue()) : SceneBackground.None.INSTANCE);
        }
        return new EducationStory(str, str4, str2, str3, valueOf, arrayList2);
    }

    public final Integer getPrimaryColor(Story story) {
        SceneColor sceneColor;
        SceneData sceneData = (SceneData) CollectionsKt.firstOrNull(story.sceneData);
        if (sceneData == null || (sceneColor = (SceneColor) CollectionsKt.firstOrNull(sceneData.color)) == null) {
            return null;
        }
        return toAndroidColor(sceneColor.background);
    }

    public final Integer toAndroidColor(String str) {
        MatcherMatchResult matchEntire = ((Regex) this.colorParser.mRatios).matchEntire(str);
        if (matchEntire == null) {
            return null;
        }
        String str2 = (String) ((MatcherMatchResult$groupValues$1) matchEntire.getGroupValues()).get(1);
        String str3 = (String) ((MatcherMatchResult$groupValues$1) matchEntire.getGroupValues()).get(2);
        String str4 = (String) ((MatcherMatchResult$groupValues$1) matchEntire.getGroupValues()).get(3);
        String str5 = (String) ((MatcherMatchResult$groupValues$1) matchEntire.getGroupValues()).get(4);
        int parseInt = Integer.parseInt(str2);
        int parseInt2 = Integer.parseInt(str3);
        int parseInt3 = Integer.parseInt(str4);
        int roundToInt = MathKt__MathJVMKt.roundToInt(Float.parseFloat(str5) * 255.0f);
        int i = new IntRange(0, 255, 1).last;
        if (parseInt > i || parseInt < 0 || parseInt2 > i || parseInt2 < 0 || parseInt3 > i || parseInt3 < 0 || roundToInt > i || roundToInt < 0) {
            return null;
        }
        return Integer.valueOf(Color.argb(roundToInt, parseInt, parseInt2, parseInt3));
    }
}
