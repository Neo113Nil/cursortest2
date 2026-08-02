package ru.yandex.video.m3.source;

import android.net.Uri;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.data.PlaybackParameters;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/source/DefaultTrackFilterProviderImpl;", "Lru/yandex/video/m3/source/TrackFilterProvider;", "()V", "filter", "", "Lru/yandex/video/m3/source/TrackItem;", LaunchBrowserActivity.KEY_URI, "Landroid/net/Uri;", "playbackParameters", "Lru/yandex/video/m3/data/PlaybackParameters;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultTrackFilterProviderImpl implements TrackFilterProvider {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.source.TrackFilterProvider
    public List<TrackItem> filter(Uri uri, PlaybackParameters playbackParameters) {
        return EmptyList.a;
    }
}
