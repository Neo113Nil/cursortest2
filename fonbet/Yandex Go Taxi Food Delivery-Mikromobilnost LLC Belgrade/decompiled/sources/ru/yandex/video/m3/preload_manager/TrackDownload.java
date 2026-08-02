package ru.yandex.video.m3.preload_manager;

import defpackage.skl0;
import defpackage.t26;
import defpackage.tls;
import defpackage.u7m;
import defpackage.zy11;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.preload_manager.DownloadResult;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00012\b\u0012\u0004\u0012\u00020\u00020\u0005B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/yandex/video/m3/preload_manager/TrackDownload;", "Lskl0;", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/util/concurrent/Callable;", "", "id", "contentType", "Lu7m;", "downloader", "Lru/yandex/video/m3/preload_manager/QualityInfo;", "qualityInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lu7m;Lru/yandex/video/m3/preload_manager/QualityInfo;)V", "doWork", "()Lru/yandex/video/m3/preload_manager/DownloadResult;", "call", "Lzy11;", "cancelWork", "()V", "cancelAndGetResult", "", "sizeInBytes", "setSizeLimit", "(J)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lu7m;", "Lru/yandex/video/m3/preload_manager/QualityInfo;", "requestedSize", "J", "downloadResult", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackDownload extends skl0 implements Callable<DownloadResult> {
    public static final int $stable = 8;
    private final String contentType;
    private volatile DownloadResult downloadResult;
    private final u7m downloader;
    private final String id;
    private final QualityInfo qualityInfo;
    private long requestedSize = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;

    public TrackDownload(String str, String str2, u7m u7mVar, QualityInfo qualityInfo) {
        this.id = str;
        this.contentType = str2;
        this.downloader = u7mVar;
        this.qualityInfo = qualityInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doWork$lambda$0(Ref$LongRef ref$LongRef, TrackDownload trackDownload, Ref$BooleanRef ref$BooleanRef, long j, long j2, float f) {
        ref$LongRef.element = j2;
        if (j2 >= trackDownload.requestedSize) {
            ref$BooleanRef.element = true;
            trackDownload.downloader.cancel();
        }
    }

    @Override // java.util.concurrent.Callable
    public DownloadResult call() {
        run();
        return (DownloadResult) get();
    }

    public final DownloadResult cancelAndGetResult() {
        DownloadResult DownloadResult;
        if (!isCancelled()) {
            cancel(true);
        }
        blockUntilFinished();
        DownloadResult downloadResult = this.downloadResult;
        if (downloadResult != null) {
            return downloadResult;
        }
        DownloadResult = DownloadResultKt.DownloadResult(this.id, this.contentType, 0L, QualityInfoKt.QualityInfo$default(null, null, null, null, 8, null), false, true, (r17 & 64) != 0 ? new tls() { // from class: ru.yandex.video.m3.preload_manager.DownloadResultKt$DownloadResult$1
            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DownloadResult.Builder) obj);
                return zy11.a;
            }

            public final void invoke(DownloadResult.Builder builder) {
            }
        } : null);
        return DownloadResult;
    }

    @Override // defpackage.skl0
    public void cancelWork() {
        this.downloader.cancel();
    }

    @Override // defpackage.skl0
    public DownloadResult doWork() {
        boolean z;
        boolean z2;
        DownloadResult DownloadResult;
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        try {
            this.downloader.a(new t26(23, ref$LongRef, this, ref$BooleanRef));
            if (!isCancelled()) {
                ref$BooleanRef.element = true;
            }
        } finally {
            if (!z) {
                if (!z2) {
                }
            }
            DownloadResult = DownloadResultKt.DownloadResult(this.id, this.contentType, ref$LongRef.element, this.qualityInfo, ref$BooleanRef.element, (isCancelled() || ref$BooleanRef.element) ? false : true, (r17 & 64) != 0 ? new tls() { // from class: ru.yandex.video.m3.preload_manager.DownloadResultKt$DownloadResult$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DownloadResult.Builder) obj);
                    return zy11.a;
                }

                public final void invoke(DownloadResult.Builder builder) {
                }
            } : null);
            this.downloadResult = DownloadResult;
            return DownloadResult;
        }
        DownloadResult = DownloadResultKt.DownloadResult(this.id, this.contentType, ref$LongRef.element, this.qualityInfo, ref$BooleanRef.element, (isCancelled() || ref$BooleanRef.element) ? false : true, (r17 & 64) != 0 ? new tls() { // from class: ru.yandex.video.m3.preload_manager.DownloadResultKt$DownloadResult$1
            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DownloadResult.Builder) obj);
                return zy11.a;
            }

            public final void invoke(DownloadResult.Builder builder) {
            }
        } : null);
        this.downloadResult = DownloadResult;
        return DownloadResult;
    }

    public final String getId() {
        return this.id;
    }

    public final void setSizeLimit(long sizeInBytes) {
        this.requestedSize = sizeInBytes;
    }
}
