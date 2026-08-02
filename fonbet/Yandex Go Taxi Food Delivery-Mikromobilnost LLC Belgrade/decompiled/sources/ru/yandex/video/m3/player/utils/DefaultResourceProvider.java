package ru.yandex.video.m3.player.utils;

import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J3\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0016J+\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\u0014R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/utils/DefaultResourceProvider;", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "getQuantityString", "", "resId", "", "quantity", "formatArgs", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "(I)[Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultResourceProvider implements ResourceProvider {
    public static final int $stable = 8;
    private final Resources resources;

    public DefaultResourceProvider(Context context) {
        this.resources = context.getResources();
    }

    @Override // ru.yandex.video.m3.player.utils.ResourceProvider
    public String getQuantityString(int resId, int quantity, Object... formatArgs) {
        return this.resources.getQuantityString(resId, quantity, Arrays.copyOf(formatArgs, formatArgs.length));
    }

    @Override // ru.yandex.video.m3.player.utils.ResourceProvider
    public String getString(int resId, Object... formatArgs) {
        return this.resources.getString(resId, Arrays.copyOf(formatArgs, formatArgs.length));
    }

    @Override // ru.yandex.video.m3.player.utils.ResourceProvider
    public String[] getStringArray(int resId) {
        return this.resources.getStringArray(resId);
    }

    @Override // ru.yandex.video.m3.player.utils.ResourceProvider
    public String getString(int resId) {
        return this.resources.getString(resId);
    }
}
