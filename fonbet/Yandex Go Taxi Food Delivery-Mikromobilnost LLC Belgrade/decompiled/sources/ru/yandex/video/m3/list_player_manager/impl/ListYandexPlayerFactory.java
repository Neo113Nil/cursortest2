package ru.yandex.video.m3.list_player_manager.impl;

import android.content.Context;
import defpackage.tse;
import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbFlags;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.debug.DebugViewToggleManager;
import ru.yandex.video.m3.debug.ListSdkDebugDataManager;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.audio.ListPlayerManagerAudioControl;
import ru.yandex.video.m3.list_player_manager.debug.ListPlayerIndexGenerator;
import ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache;
import ru.yandex.video.m3.list_player_manager.model.FirstFrameData;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u001c\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'¨\u0006("}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerFactory;", "", "", "listSdkVsid", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "", "failFast", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "Lru/yandex/video/m3/data/dto/VideoData;", "videoDataCache", "Lru/yandex/video/m3/list_player_manager/model/FirstFrameData;", "firstFrameCache", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;", "listPlayerManagerAudioControl", "Lru/yandex/video/m3/ab/config/AbFlags;", "abFlags", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "debugViewToggleManager", "Ltse;", "scope", "Lru/yandex/video/m3/debug/ListSdkDebugDataManager;", "listSdkDebugDataManager", "Landroid/content/Context;", "context", "<init>", "(Ljava/lang/String;Lru/yandex/video/m3/player/utils/PlayerLogger;ZLru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;Lru/yandex/video/m3/ab/config/AbFlags;Lru/yandex/video/m3/debug/DebugViewToggleManager;Ltse;Lru/yandex/video/m3/debug/ListSdkDebugDataManager;Landroid/content/Context;)V", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "create", "()Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "Ljava/lang/String;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Z", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;", "Lru/yandex/video/m3/ab/config/AbFlags;", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "Ltse;", "Lru/yandex/video/m3/debug/ListSdkDebugDataManager;", "Landroid/content/Context;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListYandexPlayerFactory {
    public static final int $stable = 8;
    private final AbFlags abFlags;
    private final Context context;
    private final DebugViewToggleManager debugViewToggleManager;
    private final boolean failFast;
    private final DataCache<FirstFrameData> firstFrameCache;
    private final ListPlayerManagerAudioControl listPlayerManagerAudioControl;
    private final ListSdkDebugDataManager listSdkDebugDataManager;
    private final String listSdkVsid;
    private final PlayerLogger playerLogger;
    private final tse scope;
    private final DataCache<? extends VideoData> videoDataCache;

    public ListYandexPlayerFactory(String str, PlayerLogger playerLogger, boolean z, DataCache<? extends VideoData> dataCache, DataCache<FirstFrameData> dataCache2, ListPlayerManagerAudioControl listPlayerManagerAudioControl, AbFlags abFlags, DebugViewToggleManager debugViewToggleManager, tse tseVar, ListSdkDebugDataManager listSdkDebugDataManager, Context context) {
        this.listSdkVsid = str;
        this.playerLogger = playerLogger;
        this.failFast = z;
        this.videoDataCache = dataCache;
        this.firstFrameCache = dataCache2;
        this.listPlayerManagerAudioControl = listPlayerManagerAudioControl;
        this.abFlags = abFlags;
        this.debugViewToggleManager = debugViewToggleManager;
        this.scope = tseVar;
        this.listSdkDebugDataManager = listSdkDebugDataManager;
        this.context = context;
    }

    public final InternalListYandexPlayer create() {
        ListSdkDebugDataManager listSdkDebugDataManager = this.listSdkDebugDataManager;
        ListPlayerDebugManagerImpl listPlayerDebugManagerImpl = new ListPlayerDebugManagerImpl(this.debugViewToggleManager, this.scope, listSdkDebugDataManager, this.context.getApplicationContext());
        String str = this.listSdkVsid;
        return new ListYandexPlayerImpl(this.playerLogger, str, ListPlayerIndexGenerator.INSTANCE.getNextIndex(), this.failFast, this.videoDataCache, this.firstFrameCache, this.listPlayerManagerAudioControl, this.abFlags, listPlayerDebugManagerImpl);
    }
}
