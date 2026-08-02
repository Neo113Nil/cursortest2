package ru.yandex.video.m3.player.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H&¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&J+\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H&¢\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/utils/ResourceProvider;", "", "getQuantityString", "", "resId", "", "quantity", "formatArgs", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "(I)[Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ResourceProvider {
    String getQuantityString(int resId, int quantity, Object... formatArgs);

    String getString(int resId);

    String getString(int resId, Object... formatArgs);

    String[] getStringArray(int resId);
}
