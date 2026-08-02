package ru.yandex.video.m3.player.impl.debug;

import android.net.Uri;
import defpackage.jl40;
import defpackage.sls;
import kotlin.Metadata;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.report.logger.RecordLogger;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/impl/debug/StartPositionValidatorImpl;", "Lru/yandex/video/m3/player/impl/debug/StartPositionValidator;", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "recordLogger", "<init>", "(Lru/yandex/video/m3/player/report/logger/RecordLogger;)V", "", "mediaSourceUriString", "", "startPosition", "Lzy11;", "onPrepare", "(Ljava/lang/String;Ljava/lang/Long;)V", "Landroid/net/Uri;", "mediaIemUri", "onMediaItemTransition", "(Landroid/net/Uri;)V", "Lru/yandex/video/m3/data/VideoType;", "videoType", "onVideoTypeDetected", "(Lru/yandex/video/m3/data/VideoType;)V", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "preparedContentUri", "Ljava/lang/String;", "currentContentUri", "", "hasZeroStartPosition", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StartPositionValidatorImpl implements StartPositionValidator {
    public static final int $stable = 8;
    private String currentContentUri;
    private boolean hasZeroStartPosition;
    private String preparedContentUri;
    private final RecordLogger recordLogger;

    public StartPositionValidatorImpl(RecordLogger recordLogger) {
        this.recordLogger = recordLogger;
    }

    @Override // ru.yandex.video.m3.player.impl.debug.StartPositionValidator
    public void onMediaItemTransition(Uri mediaIemUri) {
        this.currentContentUri = mediaIemUri.toString();
    }

    @Override // ru.yandex.video.m3.player.impl.debug.StartPositionValidator
    public void onPrepare(String mediaSourceUriString, Long startPosition) {
        this.preparedContentUri = mediaSourceUriString;
        this.hasZeroStartPosition = startPosition != null && startPosition.longValue() == 0;
    }

    @Override // ru.yandex.video.m3.player.impl.debug.StartPositionValidator
    public void onVideoTypeDetected(final VideoType videoType) {
        String str = this.preparedContentUri;
        if (str == null || !jl40.l(str, this.currentContentUri)) {
            return;
        }
        RecordLogger.assert$default(this.recordLogger, videoType == VideoType.VOD || !this.hasZeroStartPosition, 0L, new sls() { // from class: ru.yandex.video.m3.player.impl.debug.StartPositionValidatorImpl$onVideoTypeDetected$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final String invoke() {
                return "Content type " + VideoType.this + " was incorrectly started from 0 instead of default position";
            }
        }, 2, null);
        this.preparedContentUri = null;
    }
}
