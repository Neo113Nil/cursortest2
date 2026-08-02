package ru.yandex.video.m3.debug;

import defpackage.bvf0;
import defpackage.n4u0;
import defpackage.pz40;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.debug.model.InitMediaItemBundle;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/debug/InitMediaItemManager;", "Lru/yandex/video/m3/debug/SpeedTelemetryCallback;", "Lru/yandex/video/m3/debug/SpeedTelemetryObservable;", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "debugViewToggleManager", "<init>", "(Lru/yandex/video/m3/debug/DebugViewToggleManager;)V", "Lru/yandex/video/m3/debug/model/InitMediaItemBundle;", "initMediaItemBundle", "Lzy11;", "onNemInitMediaItemBundle", "(Lru/yandex/video/m3/debug/model/InitMediaItemBundle;)V", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "Lpz40;", "", "_items", "Lpz40;", "Ln4u0;", "items", "Ln4u0;", "getItems", "()Ln4u0;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitMediaItemManager implements SpeedTelemetryCallback, SpeedTelemetryObservable {
    public static final int $stable = 8;
    private final pz40 _items;
    private final DebugViewToggleManager debugViewToggleManager;
    private final n4u0 items;

    public InitMediaItemManager(DebugViewToggleManager debugViewToggleManager) {
        this.debugViewToggleManager = debugViewToggleManager;
        r0 c = bvf0.c(EmptyList.a);
        this._items = c;
        this.items = e.d(c);
    }

    @Override // ru.yandex.video.m3.debug.SpeedTelemetryObservable
    public n4u0 getItems() {
        return this.items;
    }

    @Override // ru.yandex.video.m3.debug.SpeedTelemetryCallback
    public void onNemInitMediaItemBundle(InitMediaItemBundle initMediaItemBundle) {
        if (DebugViewToggleManagerImpl.INSTANCE.isNotEnabled$video_player_internalRelease(this.debugViewToggleManager)) {
            return;
        }
        ArrayList arrayList = new ArrayList((Collection) getItems().getValue());
        arrayList.add(initMediaItemBundle);
        r0 r0Var = (r0) this._items;
        r0Var.getClass();
        r0Var.m(null, arrayList);
    }
}
