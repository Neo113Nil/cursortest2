package ru.yandex.video.m3.ott.data.local.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.SubProfileProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/ott/data/local/impl/SubProfileProviderImpl;", "Lru/yandex/video/m3/ott/data/local/SubProfileProvider;", "subProfileId", "", "(Ljava/lang/Long;)V", "getSubProfileId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SubProfileProviderImpl implements SubProfileProvider {
    public static final int $stable = 0;
    private final Long subProfileId;

    public /* synthetic */ SubProfileProviderImpl(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l);
    }

    @Override // ru.yandex.video.m3.ott.data.local.SubProfileProvider
    public Long getSubProfileId() {
        return this.subProfileId;
    }

    public SubProfileProviderImpl(Long l) {
        this.subProfileId = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubProfileProviderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
