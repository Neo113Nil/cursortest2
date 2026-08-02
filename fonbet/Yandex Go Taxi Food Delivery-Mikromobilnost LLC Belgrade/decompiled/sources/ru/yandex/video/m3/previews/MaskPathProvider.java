package ru.yandex.video.m3.previews;

import defpackage.cvu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/previews/MaskPathProvider;", "Lru/yandex/video/m3/previews/PathProvider;", "maskPath", "", "(Ljava/lang/String;)V", "get", "atlasNumber", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MaskPathProvider implements PathProvider {
    public static final int $stable = 0;
    private final String maskPath;

    public MaskPathProvider(String str) {
        this.maskPath = str;
    }

    @Override // ru.yandex.video.m3.previews.PathProvider
    public String get(int atlasNumber) {
        return cvu0.v(this.maskPath, "$Number$", String.valueOf(atlasNumber), false);
    }
}
