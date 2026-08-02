package ru.yandex.video.m3.player.utils;

import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00032\b\u0010\n\u001a\u0004\u0018\u0001H\u0003H&¢\u0006\u0002\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/utils/JsonConverter;", "", "from", "T", "json", "", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "to", "model", "(Ljava/lang/Object;)Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface JsonConverter {
    <T> T from(String json2, Type type);

    <T> String to(T model);
}
