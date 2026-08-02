package ru.yandex.video.m3.telemetry.datasource.impl;

import android.net.Uri;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.h5z0;
import defpackage.tls;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracking.LoadErrorKt;
import ru.yandex.video.m3.telemetry.datasource.DataSourceErrorNotifier;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ1\u0010\u0013\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/telemetry/datasource/impl/DataSourceErrorNotifierImpl;", "Lru/yandex/video/m3/telemetry/datasource/DataSourceErrorNotifier;", "Lru/yandex/video/m3/telemetry/datasource/impl/StandaloneTelemetryReporter;", "standaloneTelemetryReporter", "<init>", "(Lru/yandex/video/m3/telemetry/datasource/impl/StandaloneTelemetryReporter;)V", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "observer", "Lzy11;", "addObserver", "(Lru/yandex/video/m3/player/PlayerDelegate$Observer;)V", "removeObserver", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "", "throwable", "", "loadDurationMs", "bytesLoaded", "onLoadError", "(Landroid/net/Uri;Ljava/lang/Throwable;JJ)V", "Lru/yandex/video/m3/telemetry/datasource/impl/StandaloneTelemetryReporter;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "observerDispatcher", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataSourceErrorNotifierImpl implements DataSourceErrorNotifier {
    public static final int $stable = 8;
    private final ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = new ObserverDispatcher<>();
    private final StandaloneTelemetryReporter standaloneTelemetryReporter;

    public DataSourceErrorNotifierImpl(StandaloneTelemetryReporter standaloneTelemetryReporter) {
        this.standaloneTelemetryReporter = standaloneTelemetryReporter;
    }

    public final void addObserver(PlayerDelegate.Observer observer) {
        this.observerDispatcher.add((ObserverDispatcher<PlayerDelegate.Observer>) observer);
    }

    @Override // ru.yandex.video.m3.telemetry.datasource.DataSourceErrorNotifier
    public void onLoadError(Uri uri, final Throwable throwable, long loadDurationMs, long bytesLoaded) {
        HashSet H0;
        Object failure;
        Integer valueOf = throwable instanceof HttpDataSource$InvalidResponseCodeException ? Integer.valueOf(((HttpDataSource$InvalidResponseCodeException) throwable).responseCode) : null;
        String host = uri != null ? uri.getHost() : null;
        if (host == null) {
            host = "";
        }
        LoadError LoadError = LoadErrorKt.LoadError(host, String.valueOf(uri), loadDurationMs, bytesLoaded, throwable.getClass().getName(), throwable.getMessage(), valueOf, new tls() { // from class: ru.yandex.video.m3.telemetry.datasource.impl.DataSourceErrorNotifierImpl$onLoadError$error$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LoadError.Builder) obj);
                return zy11.a;
            }

            public final void invoke(LoadError.Builder builder) {
                builder.setThrowable(throwable);
            }
        });
        if (this.observerDispatcher.getObservers().isEmpty()) {
            this.standaloneTelemetryReporter.onLoadError(LoadError);
            return;
        }
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onLoadError(LoadError);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    public final void removeObserver(PlayerDelegate.Observer observer) {
        this.observerDispatcher.remove(observer);
    }
}
