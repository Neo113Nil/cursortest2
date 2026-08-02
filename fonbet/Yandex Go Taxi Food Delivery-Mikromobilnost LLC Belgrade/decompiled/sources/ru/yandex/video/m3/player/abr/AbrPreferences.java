package ru.yandex.video.m3.player.abr;

import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J8\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/player/abr/AbrPreferences;", "", "defaultQuality", "", "aesthetePreferenceProvider", "Lru/yandex/video/m3/player/abr/AesthetePreferenceProvider;", "userQualityRepository", "Lru/yandex/video/m3/player/abr/UserQualityRepository;", "experimentalShouldConsiderSelectedUserQuality", "", "(Ljava/lang/Integer;Lru/yandex/video/m3/player/abr/AesthetePreferenceProvider;Lru/yandex/video/m3/player/abr/UserQualityRepository;Z)V", "getAesthetePreferenceProvider", "()Lru/yandex/video/m3/player/abr/AesthetePreferenceProvider;", "getDefaultQuality", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExperimentalShouldConsiderSelectedUserQuality", "()Z", "getUserQualityRepository", "()Lru/yandex/video/m3/player/abr/UserQualityRepository;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Lru/yandex/video/m3/player/abr/AesthetePreferenceProvider;Lru/yandex/video/m3/player/abr/UserQualityRepository;Z)Lru/yandex/video/m3/player/abr/AbrPreferences;", "equals", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AbrPreferences {
    public static final int $stable = 0;
    private final AesthetePreferenceProvider aesthetePreferenceProvider;
    private final Integer defaultQuality;
    private final boolean experimentalShouldConsiderSelectedUserQuality;
    private final UserQualityRepository userQualityRepository;

    public AbrPreferences(Integer num, AesthetePreferenceProvider aesthetePreferenceProvider, UserQualityRepository userQualityRepository, boolean z) {
        this.defaultQuality = num;
        this.aesthetePreferenceProvider = aesthetePreferenceProvider;
        this.userQualityRepository = userQualityRepository;
        this.experimentalShouldConsiderSelectedUserQuality = z;
    }

    public static /* synthetic */ AbrPreferences copy$default(AbrPreferences abrPreferences, Integer num, AesthetePreferenceProvider aesthetePreferenceProvider, UserQualityRepository userQualityRepository, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = abrPreferences.defaultQuality;
        }
        if ((i & 2) != 0) {
            aesthetePreferenceProvider = abrPreferences.aesthetePreferenceProvider;
        }
        if ((i & 4) != 0) {
            userQualityRepository = abrPreferences.userQualityRepository;
        }
        if ((i & 8) != 0) {
            z = abrPreferences.experimentalShouldConsiderSelectedUserQuality;
        }
        return abrPreferences.copy(num, aesthetePreferenceProvider, userQualityRepository, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getDefaultQuality() {
        return this.defaultQuality;
    }

    /* renamed from: component2, reason: from getter */
    public final AesthetePreferenceProvider getAesthetePreferenceProvider() {
        return this.aesthetePreferenceProvider;
    }

    /* renamed from: component3, reason: from getter */
    public final UserQualityRepository getUserQualityRepository() {
        return this.userQualityRepository;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getExperimentalShouldConsiderSelectedUserQuality() {
        return this.experimentalShouldConsiderSelectedUserQuality;
    }

    public final AbrPreferences copy(Integer defaultQuality, AesthetePreferenceProvider aesthetePreferenceProvider, UserQualityRepository userQualityRepository, boolean experimentalShouldConsiderSelectedUserQuality) {
        return new AbrPreferences(defaultQuality, aesthetePreferenceProvider, userQualityRepository, experimentalShouldConsiderSelectedUserQuality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbrPreferences)) {
            return false;
        }
        AbrPreferences abrPreferences = (AbrPreferences) other;
        return jl40.l(this.defaultQuality, abrPreferences.defaultQuality) && jl40.l(this.aesthetePreferenceProvider, abrPreferences.aesthetePreferenceProvider) && jl40.l(this.userQualityRepository, abrPreferences.userQualityRepository) && this.experimentalShouldConsiderSelectedUserQuality == abrPreferences.experimentalShouldConsiderSelectedUserQuality;
    }

    public final AesthetePreferenceProvider getAesthetePreferenceProvider() {
        return this.aesthetePreferenceProvider;
    }

    public final Integer getDefaultQuality() {
        return this.defaultQuality;
    }

    public final boolean getExperimentalShouldConsiderSelectedUserQuality() {
        return this.experimentalShouldConsiderSelectedUserQuality;
    }

    public final UserQualityRepository getUserQualityRepository() {
        return this.userQualityRepository;
    }

    public int hashCode() {
        Integer num = this.defaultQuality;
        return Boolean.hashCode(this.experimentalShouldConsiderSelectedUserQuality) + ((this.userQualityRepository.hashCode() + ((this.aesthetePreferenceProvider.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AbrPreferences(defaultQuality=");
        sb.append(this.defaultQuality);
        sb.append(", aesthetePreferenceProvider=");
        sb.append(this.aesthetePreferenceProvider);
        sb.append(", userQualityRepository=");
        sb.append(this.userQualityRepository);
        sb.append(", experimentalShouldConsiderSelectedUserQuality=");
        return unr0.u(sb, this.experimentalShouldConsiderSelectedUserQuality, ')');
    }
}
