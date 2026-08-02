package ru.yandex.video.m3.player.impl.tracking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import defpackage.lnv0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.MediaStreamTrack;
import ru.yandex.video.m3.player.utils.ThreadNameUtilKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 $2\u00020\u0001:\u0002$%B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u00060\u001eR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProviderImpl;", "Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProvider;", "Landroid/media/AudioManager;", "audioManager", "Landroid/content/Context;", "context", "Landroid/os/HandlerThread;", "handlerThread", "", "playerIndex", "<init>", "(Landroid/media/AudioManager;Landroid/content/Context;Landroid/os/HandlerThread;Ljava/lang/Integer;)V", "(Landroid/media/AudioManager;)V", "Lzy11;", "updateSystemVolume", "()V", "", "getVolume", "()F", "start", "release", "Landroid/media/AudioManager;", "Landroid/content/Context;", "Landroid/os/HandlerThread;", "Ljava/lang/Integer;", "systemVolume", "F", "", "isVolumeBroadcastReceiverRegistered", "Z", "Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProviderImpl$VolumeBroadcastReceiver;", "volumeBroadcastReceiver", "Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProviderImpl$VolumeBroadcastReceiver;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Companion", "VolumeBroadcastReceiver", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SystemMediaVolumeProviderImpl implements SystemMediaVolumeProvider {
    private static final float DEFAULT_VALUE = 1.0f;
    private static final String HANDLER_THREAD_NAME = "HtVlmPrvdr";
    private static final String TAG = "MediaVolumeProvider";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final AudioManager audioManager;
    private final Context context;
    private final Handler handler;
    private final HandlerThread handlerThread;
    private boolean isVolumeBroadcastReceiverRegistered;
    private final Integer playerIndex;
    private volatile float systemVolume;
    private final VolumeBroadcastReceiver volumeBroadcastReceiver;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Object lock = new Object();
    private static final Map<Integer, SystemMediaVolumeProvider> providers = new LinkedHashMap();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProviderImpl$VolumeBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProviderImpl;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class VolumeBroadcastReceiver extends BroadcastReceiver {
        public VolumeBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SystemMediaVolumeProviderImpl.this.updateSystemVolume();
        }
    }

    private SystemMediaVolumeProviderImpl(AudioManager audioManager, Context context, HandlerThread handlerThread, Integer num) {
        this.audioManager = audioManager;
        this.context = context;
        this.handlerThread = handlerThread;
        this.playerIndex = num;
        this.systemVolume = 1.0f;
        this.volumeBroadcastReceiver = new VolumeBroadcastReceiver();
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.handler = handler;
        handler.post(new lnv0(23, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSystemVolume() {
        this.systemVolume = this.audioManager.getStreamVolume(3) / this.audioManager.getStreamMaxVolume(3);
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.SystemMediaVolumeProvider
    /* renamed from: getVolume, reason: from getter */
    public float getSystemVolume() {
        return this.systemVolume;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.SystemMediaVolumeProvider
    public void release() {
        Context context;
        synchronized (lock) {
            providers.remove(this.playerIndex);
            if (this.isVolumeBroadcastReceiverRegistered && (context = this.context) != null) {
                try {
                    context.unregisterReceiver(this.volumeBroadcastReceiver);
                    this.isVolumeBroadcastReceiverRegistered = false;
                } catch (Exception e) {
                    Log.e(TAG, "VolumeBroadcastReceiver unregister exception happened: " + e.getMessage());
                }
            }
            this.handlerThread.quitSafely();
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.SystemMediaVolumeProvider
    public void start() {
        Context context;
        synchronized (lock) {
            if (!this.isVolumeBroadcastReceiverRegistered && (context = this.context) != null) {
                context.registerReceiver(this.volumeBroadcastReceiver, new IntentFilter(VOLUME_CHANGED_ACTION), null, this.handler);
                this.isVolumeBroadcastReceiverRegistered = true;
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProviderImpl$Companion;", "", "()V", "DEFAULT_VALUE", "", "HANDLER_THREAD_NAME", "", "TAG", "VOLUME_CHANGED_ACTION", "lock", "providers", "", "", "Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProvider;", "buildFromContext", "context", "Landroid/content/Context;", "playerIndex", "(Landroid/content/Context;Ljava/lang/Integer;)Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProvider;", "createNewInstance", "getHandlerThread", "Landroid/os/HandlerThread;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SystemMediaVolumeProvider buildFromContext$default(Companion companion, Context context, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.buildFromContext(context, num);
        }

        private final SystemMediaVolumeProvider createNewInstance(Context context, Integer playerIndex) {
            Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            return audioManager != null ? new SystemMediaVolumeProviderImpl(audioManager, context, SystemMediaVolumeProviderImpl.INSTANCE.getHandlerThread(), playerIndex, null) : new SystemMediaVolumeProvider() { // from class: ru.yandex.video.m3.player.impl.tracking.SystemMediaVolumeProviderImpl$Companion$createNewInstance$2
                @Override // ru.yandex.video.m3.player.impl.tracking.SystemMediaVolumeProvider
                /* renamed from: getVolume */
                public float getSystemVolume() {
                    return 1.0f;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HandlerThread getHandlerThread() {
            return new HandlerThread(ThreadNameUtilKt.getFormatThreadName$default(SystemMediaVolumeProviderImpl.HANDLER_THREAD_NAME, null, 2, null));
        }

        public final SystemMediaVolumeProvider buildFromContext(Context context, Integer playerIndex) {
            SystemMediaVolumeProvider systemMediaVolumeProvider;
            synchronized (SystemMediaVolumeProviderImpl.lock) {
                systemMediaVolumeProvider = (SystemMediaVolumeProvider) SystemMediaVolumeProviderImpl.providers.get(playerIndex);
                if (systemMediaVolumeProvider == null) {
                    systemMediaVolumeProvider = SystemMediaVolumeProviderImpl.INSTANCE.createNewInstance(context, playerIndex);
                    SystemMediaVolumeProviderImpl.providers.put(playerIndex, systemMediaVolumeProvider);
                }
            }
            return systemMediaVolumeProvider;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SystemMediaVolumeProviderImpl(AudioManager audioManager, Context context, HandlerThread handlerThread, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(audioManager, context, handlerThread, num);
    }

    public SystemMediaVolumeProviderImpl(AudioManager audioManager) {
        this(audioManager, null, INSTANCE.getHandlerThread(), null);
    }
}
