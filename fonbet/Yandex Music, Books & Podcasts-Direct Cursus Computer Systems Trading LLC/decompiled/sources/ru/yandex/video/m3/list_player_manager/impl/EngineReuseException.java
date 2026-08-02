package ru.yandex.video.m3.list_player_manager.impl;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\b\t\nB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/EngineReuseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "CanNotFindVisibleItemsInItemsList", "PlayToPlayerWithoutEngine", "ReleaseCalledButPlayersAlive", "Lru/yandex/video/m3/list_player_manager/impl/EngineReuseException$CanNotFindVisibleItemsInItemsList;", "Lru/yandex/video/m3/list_player_manager/impl/EngineReuseException$PlayToPlayerWithoutEngine;", "Lru/yandex/video/m3/list_player_manager/impl/EngineReuseException$ReleaseCalledButPlayersAlive;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public abstract class EngineReuseException extends RuntimeException {
    public static final int $stable = 0;

    public /* synthetic */ EngineReuseException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, null);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/EngineReuseException$CanNotFindVisibleItemsInItemsList;", "Lru/yandex/video/m3/list_player_manager/impl/EngineReuseException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class CanNotFindVisibleItemsInItemsList extends EngineReuseException {
        public static final int $stable = 0;

        public /* synthetic */ CanNotFindVisibleItemsInItemsList(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CanNotFindVisibleItemsInItemsList(@NotNull String str, Throwable th) {
            super(str, th, null);
            str.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/EngineReuseException$PlayToPlayerWithoutEngine;", "Lru/yandex/video/m3/list_player_manager/impl/EngineReuseException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class PlayToPlayerWithoutEngine extends EngineReuseException {
        public static final int $stable = 0;

        public /* synthetic */ PlayToPlayerWithoutEngine(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlayToPlayerWithoutEngine(@NotNull String str, Throwable th) {
            super(str, th, null);
            str.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/EngineReuseException$ReleaseCalledButPlayersAlive;", "Lru/yandex/video/m3/list_player_manager/impl/EngineReuseException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class ReleaseCalledButPlayersAlive extends EngineReuseException {
        public static final int $stable = 0;

        public /* synthetic */ ReleaseCalledButPlayersAlive(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReleaseCalledButPlayersAlive(@NotNull String str, Throwable th) {
            super(str, th, null);
            str.getClass();
        }
    }

    private EngineReuseException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ EngineReuseException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }
}
