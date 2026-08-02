package ru.yandex.video.m3.player.impl.load_control;

import android.content.Context;
import androidx.media3.common.PriorityTaskManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.model.config.loadcontrol.LoadControlConfig;
import ru.yandex.video.m3.model.config.loadcontrol.LoadControlConfigKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/MemoryDependsLoadControlFactory;", "Lru/yandex/video/m3/player/impl/load_control/LoadControlFactory;", "context", "Landroid/content/Context;", "priorityTaskManager", "Landroidx/media3/common/PriorityTaskManager;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;", "(Landroid/content/Context;Landroidx/media3/common/PriorityTaskManager;Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;)V", "create", "Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MemoryDependsLoadControlFactory implements LoadControlFactory {
    public static final int $stable = 8;
    private final LoadControlConfig config;
    private final Context context;
    private final PriorityTaskManager priorityTaskManager;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/MemoryDependsLoadControlFactory$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", ConfigConstants.CONFIG, "Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;", "getConfig", "()Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;", "setConfig", "(Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;)V", "getContext", "()Landroid/content/Context;", "setContext", "priorityTaskManager", "Landroidx/media3/common/PriorityTaskManager;", "getPriorityTaskManager", "()Landroidx/media3/common/PriorityTaskManager;", "setPriorityTaskManager", "(Landroidx/media3/common/PriorityTaskManager;)V", "build", "Lru/yandex/video/m3/player/impl/load_control/MemoryDependsLoadControlFactory;", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private LoadControlConfig config;
        private Context context;
        private PriorityTaskManager priorityTaskManager;

        public Builder(Context context) {
            this.context = context.getApplicationContext();
        }

        public final MemoryDependsLoadControlFactory build$video_player_internalRelease() {
            Context context = this.context;
            PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            LoadControlConfig loadControlConfig = this.config;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (loadControlConfig == null) {
                loadControlConfig = LoadControlConfigKt.LoadControlConfig$default(null, 1, null);
            }
            return new MemoryDependsLoadControlFactory(context, priorityTaskManager, loadControlConfig, defaultConstructorMarker);
        }

        public final LoadControlConfig getConfig() {
            return this.config;
        }

        public final Context getContext() {
            return this.context;
        }

        public final PriorityTaskManager getPriorityTaskManager() {
            return this.priorityTaskManager;
        }

        public final void setConfig(LoadControlConfig loadControlConfig) {
            this.config = loadControlConfig;
        }

        public final void setContext(Context context) {
            this.context = context;
        }

        public final void setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
            this.priorityTaskManager = priorityTaskManager;
        }
    }

    private MemoryDependsLoadControlFactory(Context context, PriorityTaskManager priorityTaskManager, LoadControlConfig loadControlConfig) {
        this.context = context;
        this.priorityTaskManager = priorityTaskManager;
        this.config = loadControlConfig;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.LoadControlFactory
    public YandexLoadControl create() {
        return new MultiplatformLoadControlFactory(this.context, this.priorityTaskManager, this.config).create();
    }

    public /* synthetic */ MemoryDependsLoadControlFactory(Context context, PriorityTaskManager priorityTaskManager, LoadControlConfig loadControlConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, priorityTaskManager, loadControlConfig);
    }
}
