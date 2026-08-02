package ru.yandex.video.m3.list_player_manager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.model.MediaData;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000  2\u00020\u0001:\u0001 J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0016H'¢\u0006\u0004\b\u0014\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u00020\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager;", "", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;", "getPlayer", "()Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaDataList", "Lzy11;", "updateItemsList", "(Ljava/util/List;)V", "updateVisibleItemsList", "prepareItems", "player", "returnPlayer", "(Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;)V", "release", "()V", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "setCurrentActivity", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "", "sendDebugReport", "()Ljava/lang/String;", "", "isDebugViewEnabled", "()Z", "setDebugViewEnabled", "(Z)V", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ListYandexPlayerManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/ListYandexPlayerManager$Companion;", "", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    ListYandexPlayer getPlayer();

    boolean isDebugViewEnabled();

    void prepareItems(List<MediaData> mediaDataList);

    void release();

    void returnPlayer(ListYandexPlayer player);

    String sendDebugReport();

    void setCurrentActivity(AppCompatActivity activity);

    void setCurrentActivity(FragmentActivity activity);

    void setDebugViewEnabled(boolean z);

    void updateItemsList(List<MediaData> mediaDataList);

    void updateVisibleItemsList(List<MediaData> mediaDataList);
}
