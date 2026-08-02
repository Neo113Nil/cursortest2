package ru.yandex.taxi.settings.profile;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/settings/profile/ProfileAnalyticsReporter$PreviousScreenIdentifier", "", "Lru/yandex/taxi/settings/profile/ProfileAnalyticsReporter$PreviousScreenIdentifier;", "", "context", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DEEPLINK", "PROFILE_FRAGMENT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProfileAnalyticsReporter$PreviousScreenIdentifier {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProfileAnalyticsReporter$PreviousScreenIdentifier[] $VALUES;
    public static final ProfileAnalyticsReporter$PreviousScreenIdentifier DEEPLINK;
    public static final ProfileAnalyticsReporter$PreviousScreenIdentifier PROFILE_FRAGMENT;
    private final String context;

    static {
        ProfileAnalyticsReporter$PreviousScreenIdentifier profileAnalyticsReporter$PreviousScreenIdentifier = new ProfileAnalyticsReporter$PreviousScreenIdentifier("DEEPLINK", 0, "Deeplink");
        DEEPLINK = profileAnalyticsReporter$PreviousScreenIdentifier;
        ProfileAnalyticsReporter$PreviousScreenIdentifier profileAnalyticsReporter$PreviousScreenIdentifier2 = new ProfileAnalyticsReporter$PreviousScreenIdentifier("PROFILE_FRAGMENT", 1, "Profile screen");
        PROFILE_FRAGMENT = profileAnalyticsReporter$PreviousScreenIdentifier2;
        ProfileAnalyticsReporter$PreviousScreenIdentifier[] profileAnalyticsReporter$PreviousScreenIdentifierArr = {profileAnalyticsReporter$PreviousScreenIdentifier, profileAnalyticsReporter$PreviousScreenIdentifier2};
        $VALUES = profileAnalyticsReporter$PreviousScreenIdentifierArr;
        $ENTRIES = kotlin.enums.a.a(profileAnalyticsReporter$PreviousScreenIdentifierArr);
    }

    public ProfileAnalyticsReporter$PreviousScreenIdentifier(String str, int i, String str2) {
        this.context = str2;
    }

    public static ProfileAnalyticsReporter$PreviousScreenIdentifier valueOf(String str) {
        return (ProfileAnalyticsReporter$PreviousScreenIdentifier) Enum.valueOf(ProfileAnalyticsReporter$PreviousScreenIdentifier.class, str);
    }

    public static ProfileAnalyticsReporter$PreviousScreenIdentifier[] values() {
        return (ProfileAnalyticsReporter$PreviousScreenIdentifier[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getContext() {
        return this.context;
    }
}
