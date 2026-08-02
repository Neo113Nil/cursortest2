package ru.yandex.video.m3.ui;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import defpackage.bts;
import defpackage.fid;
import defpackage.h5z0;
import defpackage.i3y;
import defpackage.j73;
import defpackage.jxi;
import defpackage.n4u0;
import defpackage.sls;
import defpackage.tls;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.ListPlayerObserver;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.LogcatPlayerLogger;
import ru.yandex.video.m3.list_player_manager.UtilKt;
import ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver;
import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerInstanceProvider;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryRegistry;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewFlags;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewFlagsKt;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.ui.debug.ListSdkDebugViewFlags;
import ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;
import ru.yandex.video.m3.ui.surface.DefaultPlayerViewSurfaceController;
import ru.yandex.video.m3.ui.surface.InternalPlayerViewSurfaceController;
import ru.yandex.video.m3.ui.surface.InternalSurfaceControllerWrapper;
import ru.yandex.video.m3.ui.surface.PlayerViewSurface;
import ru.yandex.video.m3.ui.surface.PlayerViewSurfaceController;
import ru.yandex.video.m3.ui.surface.PlayerViewSurfaceKt;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u0002:\u0006\u0080\u0001\u0081\u0001\u0082\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u000f\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010(\u001a\u00020\u000bH\u0000¢\u0006\u0004\b'\u0010\u001cJ\u000f\u0010*\u001a\u00020\u000bH\u0000¢\u0006\u0004\b)\u0010\u001cJ\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J/\u00103\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\tH\u0014¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0011\u00109\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000bH\u0016¢\u0006\u0004\b;\u0010\u001cJ+\u0010C\u001a\u00020\u000b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0<H\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010E\u001a\u00020\u000bH\u0000¢\u0006\u0004\bD\u0010\u001cJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010\rJ\u000f\u0010G\u001a\u00020\u000bH\u0002¢\u0006\u0004\bG\u0010\u001cJ\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\bH\u0010 J\u000f\u0010I\u001a\u00020\u000bH\u0002¢\u0006\u0004\bI\u0010\u001cJ\u000f\u0010J\u001a\u00020\u000bH\u0002¢\u0006\u0004\bJ\u0010\u001cJ+\u0010K\u001a\u00020\u000b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0<H\u0002¢\u0006\u0004\bK\u0010BJ\u001d\u0010O\u001a\u00020\u000b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020M0LH\u0002¢\u0006\u0004\bO\u0010PJ\u001d\u0010Q\u001a\u00020\u000b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020M0LH\u0002¢\u0006\u0004\bQ\u0010PR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u000e0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00130U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010WR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0018\u0010f\u001a\u00060eR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u00060hR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u00109\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010lR$\u0010n\u001a\u00020+2\u0006\u0010m\u001a\u00020+8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010t\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010sR0\u0010v\u001a\u00020+2\u0006\u0010u\u001a\u00020+8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\bv\u0010o\u0012\u0004\by\u0010\u001c\u001a\u0004\bw\u0010q\"\u0004\bx\u0010.R\u0016\u0010{\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u007f\u001a\u00020\\8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0083\u0001"}, d2 = {"Lru/yandex/video/m3/ui/ListYandexPlayerView;", "Landroid/widget/FrameLayout;", "Lru/yandex/video/m3/ui/ListYandexPlayerAttachable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "color", "Lzy11;", "setBackgroundColor", "(I)V", "Lru/yandex/video/m3/ui/PlayerViewInternalObserver;", "observer", "addInternalObserverForever$video_player_internalRelease", "(Lru/yandex/video/m3/ui/PlayerViewInternalObserver;)V", "addInternalObserverForever", "Lru/yandex/video/m3/ui/PlayerViewObserver;", "addObserver", "(Lru/yandex/video/m3/ui/PlayerViewObserver;)V", "removeObserver", "Lru/yandex/video/m3/ui/surface/PlayerViewSurfaceController;", "controller", "setController", "(Lru/yandex/video/m3/ui/surface/PlayerViewSurfaceController;)V", "removeController", "()V", "Landroid/widget/ImageView$ScaleType;", "scaleType", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "", "tag$video_player_internalRelease", "()Ljava/lang/String;", "tag", "notifyBlurPictureIsSet$video_player_internalRelease", "notifyBlurPictureIsSet", "notifyFirstFramePictureIsSet$video_player_internalRelease", "notifyFirstFramePictureIsSet", "", "visible", "onViewVisibleChange", "(Z)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;", "player", "attachPlayer", "(Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;)V", "attachedPlayer", "()Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;", "detach", "Ln4u0;", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "playerEngineDebugDatStateFlow", "Lru/yandex/video/m3/debug/model/ListSdkPlayerDebugData;", "listPlayerManagerDebugDataStateFlow", "addDebugView$video_player_internalRelease", "(Ln4u0;Ln4u0;)V", "addDebugView", "removeDebugView$video_player_internalRelease", "removeDebugView", "setShutterColor", "syncSurfacesScaleTypeForViews", "setVideoScaleType", "activatePreviewSurface", "activateVideoSurface", "configureView", "", "Lru/yandex/video/m3/ui/surface/PlayerViewSurface;", "surfaces", "tryWillFlush", "(Ljava/util/Set;)V", "tryDidFlush", "Lru/yandex/video/m3/list_player_manager/LogcatPlayerLogger;", "playerLogger", "Lru/yandex/video/m3/list_player_manager/LogcatPlayerLogger;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "internalObservers", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "publicObservers", "Lru/yandex/video/m3/ui/PlayerView;", "styledPlayerView", "Lru/yandex/video/m3/ui/PlayerView;", "Landroid/widget/ImageView;", "firstFrameView", "Landroid/widget/ImageView;", "Landroidx/compose/ui/platform/ComposeView;", "debugView$delegate", "Li3y;", "getDebugView", "()Landroidx/compose/ui/platform/ComposeView;", "debugView", "Lru/yandex/video/m3/ui/ListYandexPlayerView$ListPlayerObserverImpl;", "publicObserver", "Lru/yandex/video/m3/ui/ListYandexPlayerView$ListPlayerObserverImpl;", "Lru/yandex/video/m3/ui/ListYandexPlayerView$ListPlayerInternalObserverImpl;", "internalObserver", "Lru/yandex/video/m3/ui/ListYandexPlayerView$ListPlayerInternalObserverImpl;", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "<set-?>", "isShowingContent", "Z", "isShowingContent$video_player_internalRelease", "()Z", "previewSurface", "Lru/yandex/video/m3/ui/surface/PlayerViewSurface;", "videoSurface", "value", "firstFrameUntilPlay", "getFirstFrameUntilPlay", "setFirstFrameUntilPlay", "getFirstFrameUntilPlay$annotations", "Lru/yandex/video/m3/ui/surface/InternalPlayerViewSurfaceController;", "surfaceController", "Lru/yandex/video/m3/ui/surface/InternalPlayerViewSurfaceController;", "getFirstFrameImageView$video_player_internalRelease", "()Landroid/widget/ImageView;", "firstFrameImageView", "Companion", "ListPlayerInternalObserverImpl", "ListPlayerObserverImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ListYandexPlayerView extends FrameLayout implements ListYandexPlayerAttachable {
    private static final String TAG = "LPView";
    private InternalListYandexPlayer attachedPlayer;

    /* renamed from: debugView$delegate, reason: from kotlin metadata */
    private final i3y debugView;
    private boolean firstFrameUntilPlay;
    private final ImageView firstFrameView;
    private final ListPlayerInternalObserverImpl internalObserver;
    private final ObserverDispatcher<PlayerViewInternalObserver> internalObservers;
    private boolean isShowingContent;
    private final LogcatPlayerLogger playerLogger;
    private final PlayerViewSurface previewSurface;
    private final ListPlayerObserverImpl publicObserver;
    private final ObserverDispatcher<PlayerViewObserver> publicObservers;
    private final PlayerView styledPlayerView;
    private InternalPlayerViewSurfaceController surfaceController;
    private final PlayerViewSurface videoSurface;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/ui/ListYandexPlayerView$ListPlayerInternalObserverImpl;", "Lru/yandex/video/m3/list_player_manager/impl/ListPlayerInternalObserver;", "<init>", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "engine", "Lzy11;", "onEngineAttached", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "onEngineDetached", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ListPlayerInternalObserverImpl implements ListPlayerInternalObserver {
        public ListPlayerInternalObserverImpl() {
        }

        @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
        public void onEngineAttached(YandexPlayer<zxc0> engine) {
            LogcatPlayerLogger logcatPlayerLogger = ListYandexPlayerView.this.playerLogger;
            ListYandexPlayerView listYandexPlayerView = ListYandexPlayerView.this;
            if (PlayerLoggerExtensionsKt.getEnabled(logcatPlayerLogger)) {
                PlayerLogger.verbose$default(logcatPlayerLogger, listYandexPlayerView.tag$video_player_internalRelease(), "onEngineAttached", null, new Object[0], 4, null);
            }
        }

        @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
        public void onEngineDetached() {
            LogcatPlayerLogger logcatPlayerLogger = ListYandexPlayerView.this.playerLogger;
            ListYandexPlayerView listYandexPlayerView = ListYandexPlayerView.this;
            if (PlayerLoggerExtensionsKt.getEnabled(logcatPlayerLogger)) {
                PlayerLogger.verbose$default(logcatPlayerLogger, listYandexPlayerView.tag$video_player_internalRelease(), "onEngineDetached", null, new Object[0], 4, null);
            }
            ListYandexPlayerView listYandexPlayerView2 = ListYandexPlayerView.this;
            listYandexPlayerView2.tryWillFlush(Collections.singleton(listYandexPlayerView2.videoSurface));
            ListYandexPlayerView listYandexPlayerView3 = ListYandexPlayerView.this;
            listYandexPlayerView3.tryDidFlush(Collections.singleton(listYandexPlayerView3.videoSurface));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/ui/ListYandexPlayerView$ListPlayerObserverImpl;", "Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;", "<init>", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;)V", "Lzy11;", "onNewSourceIsSet", "()V", "onReadyForFirstPlayback", "onResumePlayback", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ListPlayerObserverImpl implements ListPlayerObserver {
        public ListPlayerObserverImpl() {
        }

        @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
        public void onNewSourceIsSet() {
            MediaData item;
            LogcatPlayerLogger logcatPlayerLogger = ListYandexPlayerView.this.playerLogger;
            ListYandexPlayerView listYandexPlayerView = ListYandexPlayerView.this;
            if (PlayerLoggerExtensionsKt.getEnabled(logcatPlayerLogger)) {
                String tag$video_player_internalRelease = listYandexPlayerView.tag$video_player_internalRelease();
                StringBuilder sb = new StringBuilder("new source = ");
                InternalListYandexPlayer internalListYandexPlayer = listYandexPlayerView.attachedPlayer;
                sb.append((internalListYandexPlayer == null || (item = internalListYandexPlayer.getItem()) == null) ? null : item.getVideoContentId());
                logcatPlayerLogger.verbose(tag$video_player_internalRelease, "onNewSourceIsSet", sb.toString(), new Object[0]);
            }
            ListYandexPlayerView listYandexPlayerView2 = ListYandexPlayerView.this;
            listYandexPlayerView2.tryWillFlush(j73.f0(new PlayerViewSurface[]{listYandexPlayerView2.previewSurface, ListYandexPlayerView.this.videoSurface}));
            ListYandexPlayerView.this.surfaceController.onSetSource();
            ListYandexPlayerView.this.firstFrameView.setImageResource(R.color.transparent);
            ListYandexPlayerView.this.firstFrameView.setTag(null);
            ListYandexPlayerView listYandexPlayerView3 = ListYandexPlayerView.this;
            listYandexPlayerView3.tryDidFlush(j73.f0(new PlayerViewSurface[]{listYandexPlayerView3.previewSurface, ListYandexPlayerView.this.videoSurface}));
        }

        @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
        public void onReadyForFirstPlayback() {
            LogcatPlayerLogger logcatPlayerLogger = ListYandexPlayerView.this.playerLogger;
            ListYandexPlayerView listYandexPlayerView = ListYandexPlayerView.this;
            if (PlayerLoggerExtensionsKt.getEnabled(logcatPlayerLogger)) {
                PlayerLogger.verbose$default(logcatPlayerLogger, listYandexPlayerView.tag$video_player_internalRelease(), "onReadyForFirstPlayback", null, new Object[0], 4, null);
            }
            ListYandexPlayerView.this.videoSurface.setReadyForDisplay$video_player_internalRelease(true);
            ListYandexPlayerView.this.surfaceController.onSurfaceReadyForDisplay(ListYandexPlayerView.this.videoSurface);
        }

        @Override // ru.yandex.video.m3.list_player_manager.ListPlayerObserver
        public void onResumePlayback() {
            ListYandexPlayerView.this.surfaceController.onResume();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ListYandexPlayerView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ImageView.ScaleType extractScaleType;
        LogcatPlayerLogger logcatPlayerLogger = new LogcatPlayerLogger();
        this.playerLogger = logcatPlayerLogger;
        this.internalObservers = new ObserverDispatcher<>();
        this.publicObservers = new ObserverDispatcher<>();
        StyledPlayerViewLite styledPlayerViewLite = new StyledPlayerViewLite(context, attributeSet);
        this.styledPlayerView = styledPlayerViewLite;
        ImageView imageView = new ImageView(context, attributeSet);
        this.firstFrameView = imageView;
        this.debugView = kotlin.a.a(new sls() { // from class: ru.yandex.video.m3.ui.ListYandexPlayerView$debugView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final ComposeView invoke() {
                return new ComposeView(context, null, 0, 6, null);
            }
        });
        this.publicObserver = new ListPlayerObserverImpl();
        this.internalObserver = new ListPlayerInternalObserverImpl();
        this.isShowingContent = true;
        zy11 zy11Var = null;
        PlayerViewSurface PreviewSurface$default = PlayerViewSurfaceKt.PreviewSurface$default(false, false, new sls() { // from class: ru.yandex.video.m3.ui.ListYandexPlayerView$previewSurface$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m906invoke();
                return zy11.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m906invoke() {
                ListYandexPlayerView.this.activatePreviewSurface();
            }
        }, 2, null);
        this.previewSurface = PreviewSurface$default;
        PlayerViewSurface VideoSurface$default = PlayerViewSurfaceKt.VideoSurface$default(this.isShowingContent, false, new sls() { // from class: ru.yandex.video.m3.ui.ListYandexPlayerView$videoSurface$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m907invoke();
                return zy11.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m907invoke() {
                ListYandexPlayerView.this.activateVideoSurface();
            }
        }, 2, null);
        this.videoSurface = VideoSurface$default;
        this.surfaceController = new DefaultPlayerViewSurfaceController(this.firstFrameUntilPlay);
        addView(styledPlayerViewLite.getView(), -1, -1);
        styledPlayerViewLite.getView().setVisibility(0);
        addView(imageView, -1, -1);
        imageView.bringToFront();
        imageView.setVisibility(!this.isShowingContent ? 0 : 8);
        PreviewSurface$default.setScaleType(getScaleType());
        VideoSurface$default.setScaleType(getScaleType());
        this.surfaceController.onUpdateAvailableSurfaces(j73.f0(new PlayerViewSurface[]{PreviewSurface$default, VideoSurface$default}));
        syncSurfacesScaleTypeForViews();
        if (attributeSet != null && (extractScaleType = INSTANCE.extractScaleType(attributeSet)) != null) {
            setScaleType(extractScaleType);
        }
        Drawable background = getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            setShutterColor(colorDrawable.getColor());
        }
        ListViewTelemetryRegistry listViewTelemetryRegistry$video_player_internalRelease = ListYandexPlayerManagerInstanceProvider.INSTANCE.getListViewTelemetryRegistry$video_player_internalRelease();
        if (listViewTelemetryRegistry$video_player_internalRelease != null) {
            listViewTelemetryRegistry$video_player_internalRelease.registerViewCreation(this);
            zy11Var = zy11.a;
        }
        if (zy11Var == null) {
            PlayerLogger.error$default(logcatPlayerLogger, TAG, "View created before ListYandexPlayerManager is initialized! Telemetry will not work.", null, null, new Object[0], 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void activatePreviewSurface() {
        HashSet H0;
        Object failure;
        LogcatPlayerLogger logcatPlayerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(logcatPlayerLogger)) {
            PlayerLogger.verbose$default(logcatPlayerLogger, tag$video_player_internalRelease(), "activatePreviewSurface", null, new Object[0], 4, null);
        }
        if (this.isShowingContent) {
            this.firstFrameView.setVisibility(0);
            this.isShowingContent = false;
            this.videoSurface.setActive$video_player_internalRelease(false);
            this.previewSurface.setActive$video_player_internalRelease(true);
            ObserverDispatcher<PlayerViewObserver> observerDispatcher = this.publicObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerViewObserver) it.next()).onSwitchedToFirstFrame();
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void activateVideoSurface() {
        HashSet H0;
        Object failure;
        LogcatPlayerLogger logcatPlayerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(logcatPlayerLogger)) {
            PlayerLogger.verbose$default(logcatPlayerLogger, tag$video_player_internalRelease(), "activateVideoSurface", null, new Object[0], 4, null);
        }
        if (this.isShowingContent) {
            return;
        }
        this.firstFrameView.setVisibility(8);
        this.isShowingContent = true;
        this.videoSurface.setActive$video_player_internalRelease(true);
        this.previewSurface.setActive$video_player_internalRelease(false);
        ObserverDispatcher<PlayerViewObserver> observerDispatcher = this.publicObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerViewObserver) it.next()).onSwitchedToContent();
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

    private final void configureView(final n4u0 playerEngineDebugDatStateFlow, final n4u0 listPlayerManagerDebugDataStateFlow) {
        ComposeView debugView = getDebugView();
        debugView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        debugView.setContent(new androidx.compose.runtime.internal.a(945099184, new wls() { // from class: ru.yandex.video.m3.ui.ListYandexPlayerView$configureView$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.ListYandexPlayerView$configureView$1$1$1] */
            public final void invoke(fid fidVar, int i) {
                if ((i & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        return;
                    }
                }
                final n4u0 n4u0Var = n4u0.this;
                final n4u0 n4u0Var2 = listPlayerManagerDebugDataStateFlow;
                ThemeKt.DebugTheme(false, wwg.i(fidVar, -1780682380, new wls() { // from class: ru.yandex.video.m3.ui.ListYandexPlayerView$configureView$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(fid fidVar2, int i2) {
                        if ((i2 & 3) == 2) {
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.E()) {
                                btsVar2.Y();
                                return;
                            }
                        }
                        ListDebugViewKt.ListDebugView(n4u0.this, n4u0Var2, null, PlayerDebugViewFlagsKt.PlayerDebugViewFlags(new tls() { // from class: ru.yandex.video.m3.ui.ListYandexPlayerView.configureView.1.1.1.1
                            public final void invoke(PlayerDebugViewFlags.Builder builder) {
                                Boolean bool = Boolean.FALSE;
                                builder.m884setShowSubtitlesTrack(bool);
                                builder.m887setShowVideoDecoderInitsReusesReleases(bool);
                            }

                            @Override // defpackage.tls
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((PlayerDebugViewFlags.Builder) obj);
                                return zy11.a;
                            }
                        }), new ListSdkDebugViewFlags(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, -1, 67108863, null), fidVar2, 0, 4);
                    }

                    @Override // defpackage.wls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((fid) obj, ((Number) obj2).intValue());
                        return zy11.a;
                    }
                }), fidVar, 48, 1);
            }

            @Override // defpackage.wls
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((fid) obj, ((Number) obj2).intValue());
                return zy11.a;
            }
        }, true));
        debugView.bringToFront();
    }

    private final ComposeView getDebugView() {
        return (ComposeView) this.debugView.getValue();
    }

    @jxi
    public static /* synthetic */ void getFirstFrameUntilPlay$annotations() {
    }

    private final void setShutterColor(int color) {
        this.styledPlayerView.setShutterBackgroundColor(color);
        this.firstFrameView.setBackgroundColor(color);
    }

    private final void setVideoScaleType(ImageView.ScaleType scaleType) {
        PlayerView playerView = this.styledPlayerView;
        int i = 0;
        switch (WhenMappings.$EnumSwitchMapping$0[scaleType.ordinal()]) {
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                PlayerLogger.error$default(this.playerLogger, TAG, "Unsupported scale type: " + scaleType + ". Use FIT_XY, FIT_CENTER, CENTER_CROP.", null, null, new Object[0], 12, null);
                break;
            default:
                w511.b();
                return;
        }
        playerView.setResizeMode(i);
    }

    private final void syncSurfacesScaleTypeForViews() {
        this.firstFrameView.setScaleType(this.previewSurface.getScaleType());
        setVideoScaleType(this.videoSurface.getScaleType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryDidFlush(Set<PlayerViewSurface> surfaces) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : surfaces) {
            if (((PlayerViewSurface) obj).getIsReadyForDisplay()) {
                arrayList.add(obj);
            }
        }
        Set<PlayerViewSurface> N0 = kotlin.collections.a.N0(arrayList);
        Iterator it = N0.iterator();
        while (it.hasNext()) {
            ((PlayerViewSurface) it.next()).setReadyForDisplay$video_player_internalRelease(false);
        }
        this.surfaceController.onSurfacesContentDidFlush(N0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryWillFlush(Set<PlayerViewSurface> surfaces) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : surfaces) {
            if (((PlayerViewSurface) obj).getIsReadyForDisplay()) {
                arrayList.add(obj);
            }
        }
        this.surfaceController.onSurfacesContentWillFlush(kotlin.collections.a.N0(arrayList));
    }

    public final void addDebugView$video_player_internalRelease(n4u0 playerEngineDebugDatStateFlow, n4u0 listPlayerManagerDebugDataStateFlow) {
        if (getDebugView().getParent() != null) {
            return;
        }
        configureView(playerEngineDebugDatStateFlow, listPlayerManagerDebugDataStateFlow);
        addView(getDebugView());
    }

    public final void addInternalObserverForever$video_player_internalRelease(PlayerViewInternalObserver observer) {
        this.internalObservers.add((ObserverDispatcher<PlayerViewInternalObserver>) observer);
    }

    public final void addObserver(PlayerViewObserver observer) {
        this.publicObservers.add((ObserverDispatcher<PlayerViewObserver>) observer);
    }

    @Override // ru.yandex.video.m3.ui.ListYandexPlayerAttachable
    public void attachPlayer(ListYandexPlayer player) {
        HashSet H0;
        Object failure;
        InternalListYandexPlayer impl = InternalListYandexPlayer.INSTANCE.impl(player);
        LogcatPlayerLogger logcatPlayerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(logcatPlayerLogger)) {
            logcatPlayerLogger.verbose(tag$video_player_internalRelease(), "attachPlayer", "new player = " + UtilKt.debugStringIdentificator(impl), new Object[0]);
        }
        this.attachedPlayer = impl;
        ObserverDispatcher<PlayerViewInternalObserver> observerDispatcher = this.internalObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerViewInternalObserver) it.next()).onPlayerAttachedToView(impl);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        impl.onAttachToView(this, this.styledPlayerView);
        impl.addObserver(this.publicObserver);
        impl.addInternalObserver(this.internalObserver);
    }

    @Override // ru.yandex.video.m3.ui.ListYandexPlayerAttachable
    public ListYandexPlayer attachedPlayer() {
        return this.attachedPlayer;
    }

    @Override // ru.yandex.video.m3.ui.ListYandexPlayerAttachable
    public void detach() {
        HashSet H0;
        Object failure;
        LogcatPlayerLogger logcatPlayerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(logcatPlayerLogger)) {
            PlayerLogger.verbose$default(logcatPlayerLogger, tag$video_player_internalRelease(), "detach", null, new Object[0], 4, null);
        }
        tryWillFlush(Collections.singleton(this.videoSurface));
        InternalListYandexPlayer internalListYandexPlayer = this.attachedPlayer;
        if (internalListYandexPlayer != null) {
            internalListYandexPlayer.pause();
        }
        InternalListYandexPlayer internalListYandexPlayer2 = this.attachedPlayer;
        if (internalListYandexPlayer2 != null) {
            internalListYandexPlayer2.removeObserver(this.publicObserver);
        }
        InternalListYandexPlayer internalListYandexPlayer3 = this.attachedPlayer;
        if (internalListYandexPlayer3 != null) {
            internalListYandexPlayer3.removeInternalObserver(this.internalObserver);
        }
        InternalListYandexPlayer internalListYandexPlayer4 = this.attachedPlayer;
        if (internalListYandexPlayer4 != null) {
            internalListYandexPlayer4.onDetachFromView();
        }
        this.styledPlayerView.setPlayer(null);
        InternalListYandexPlayer internalListYandexPlayer5 = this.attachedPlayer;
        if (internalListYandexPlayer5 != null) {
            ObserverDispatcher<PlayerViewInternalObserver> observerDispatcher = this.internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerViewInternalObserver) it.next()).onPlayerDetachedFromView(internalListYandexPlayer5);
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
        this.attachedPlayer = null;
        tryDidFlush(Collections.singleton(this.videoSurface));
    }

    /* renamed from: getFirstFrameImageView$video_player_internalRelease, reason: from getter */
    public final ImageView getFirstFrameView() {
        return this.firstFrameView;
    }

    public final boolean getFirstFrameUntilPlay() {
        return this.firstFrameUntilPlay;
    }

    public final ImageView.ScaleType getScaleType() {
        return this.firstFrameView.getScaleType();
    }

    /* renamed from: isShowingContent$video_player_internalRelease, reason: from getter */
    public final boolean getIsShowingContent() {
        return this.isShowingContent;
    }

    public final void notifyBlurPictureIsSet$video_player_internalRelease() {
        HashSet H0;
        Object failure;
        LogcatPlayerLogger logcatPlayerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(logcatPlayerLogger)) {
            PlayerLogger.verbose$default(logcatPlayerLogger, tag$video_player_internalRelease(), "blurPictureIsSet", null, new Object[0], 4, null);
        }
        ObserverDispatcher<PlayerViewObserver> observerDispatcher = this.publicObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerViewObserver) it.next()).onBlurPictureIsSet();
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        this.previewSurface.setReadyForDisplay$video_player_internalRelease(true);
        this.surfaceController.onSurfaceReadyForDisplay(this.previewSurface);
    }

    public final void notifyFirstFramePictureIsSet$video_player_internalRelease() {
        HashSet H0;
        Object failure;
        LogcatPlayerLogger logcatPlayerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(logcatPlayerLogger)) {
            PlayerLogger.verbose$default(logcatPlayerLogger, tag$video_player_internalRelease(), "firstFramePictureIsSet", null, new Object[0], 4, null);
        }
        ObserverDispatcher<PlayerViewObserver> observerDispatcher = this.publicObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerViewObserver) it.next()).onFirstFramePictureIsSet();
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        if (this.previewSurface.getIsReadyForDisplay()) {
            return;
        }
        this.previewSurface.setReadyForDisplay$video_player_internalRelease(true);
        this.surfaceController.onSurfaceReadyForDisplay(this.previewSurface);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        InternalListYandexPlayer internalListYandexPlayer = this.attachedPlayer;
        if (internalListYandexPlayer != null) {
            internalListYandexPlayer.onPlayerViewSizeChange(w, h, oldw, oldh);
        }
    }

    public final void onViewVisibleChange(boolean visible) {
        HashSet H0;
        Object failure;
        HashSet H02;
        Object failure2;
        LogcatPlayerLogger logcatPlayerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(logcatPlayerLogger)) {
            logcatPlayerLogger.verbose(tag$video_player_internalRelease(), "onViewVisibleChange", "visible = " + visible, new Object[0]);
        }
        ObserverDispatcher<PlayerViewInternalObserver> observerDispatcher = this.internalObservers;
        if (visible) {
            synchronized (observerDispatcher.getObservers()) {
                H02 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H02.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerViewInternalObserver) it.next()).onViewAppearOnScreen();
                    failure2 = zy11.a;
                } catch (Throwable th) {
                    failure2 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure2);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            return;
        }
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it2 = H0.iterator();
        while (it2.hasNext()) {
            try {
                ((PlayerViewInternalObserver) it2.next()).onViewDisappearFromScreen();
                failure = zy11.a;
            } catch (Throwable th2) {
                failure = new Result.Failure(th2);
            }
            Throwable a2 = Result.a(failure);
            if (a2 != null) {
                h5z0.a.f(a2, "notifyObservers", new Object[0]);
            }
        }
    }

    public final void removeController() {
        setController(new DefaultPlayerViewSurfaceController(this.firstFrameUntilPlay));
    }

    public final void removeDebugView$video_player_internalRelease() {
        if (getDebugView().getParent() == null) {
            return;
        }
        removeView(getDebugView());
    }

    public final void removeObserver(PlayerViewObserver observer) {
        this.publicObservers.remove(observer);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        super.setBackgroundColor(color);
        setShutterColor(color);
    }

    public final void setController(PlayerViewSurfaceController controller) {
        this.surfaceController.onUpdateAvailableSurfaces(EmptySet.a);
        InternalSurfaceControllerWrapper internalSurfaceControllerWrapper = new InternalSurfaceControllerWrapper(controller);
        this.surfaceController = internalSurfaceControllerWrapper;
        internalSurfaceControllerWrapper.onUpdateAvailableSurfaces(j73.f0(new PlayerViewSurface[]{this.videoSurface, this.previewSurface}));
        syncSurfacesScaleTypeForViews();
    }

    public final void setFirstFrameUntilPlay(boolean z) {
        this.surfaceController.setShowPreviewUntilFirstPlay(z);
        this.firstFrameUntilPlay = z;
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        this.previewSurface.setScaleType(scaleType);
        this.videoSurface.setScaleType(scaleType);
        syncSurfacesScaleTypeForViews();
    }

    public final String tag$video_player_internalRelease() {
        return "LPView-" + String.format(Locale.US, "%04d", Arrays.copyOf(new Object[]{Integer.valueOf(hashCode() % 10000)}, 1)) + LicenseUtility.SEPARATOR + UtilKt.debugStringIdentificator(this.attachedPlayer) + '}';
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/ui/ListYandexPlayerView$Companion;", "", "()V", "TAG", "", "extractScaleType", "Landroid/widget/ImageView$ScaleType;", "Landroid/util/AttributeSet;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ImageView.ScaleType extractScaleType(AttributeSet attributeSet) {
            return (ImageView.ScaleType) j73.G(attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "scaleType", -1), ImageView.ScaleType.values());
        }

        private Companion() {
        }
    }

    public /* synthetic */ ListYandexPlayerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListYandexPlayerView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
