package ru.yandex.video.m3.ui.debug;

import defpackage.jl40;
import defpackage.tcc;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\t\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003¢\u0006\u0002\u0010\u0017J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u0015\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003J\u0015\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\tHÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003HÆ\u0003JÇ\u0001\u0010.\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\t2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\t2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\fHÖ\u0001J\b\u00103\u001a\u00020\u0012H\u0016R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001c¨\u00064"}, d2 = {"Lru/yandex/video/m3/ui/debug/DebugData;", "", "mediaData", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "visibleMediaData", "currentItems", "Lru/yandex/video/m3/ui/debug/Item;", "preloadData", "", "Lru/yandex/video/m3/ui/debug/PreloadState;", "attachedListPlayerIndex", "", "attachedEnginesData", "Lru/yandex/video/m3/ui/debug/EngineHolder;", "decoderData", "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "fatalErrorData", "", "startVideoBitrateData", "Lru/yandex/video/m3/ui/debug/StartBitrateDataHolder;", "speedTelemetry", "Lru/yandex/video/m3/ui/debug/SpeedTelemetry;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "getAttachedEnginesData", "()Ljava/util/Map;", "getAttachedListPlayerIndex", "getCurrentItems", "()Ljava/util/List;", "getDecoderData", "getFatalErrorData", "getMediaData", "getPreloadData", "getSpeedTelemetry", "getStartVideoBitrateData", "getVisibleMediaData", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DebugData {
    public static final int $stable = 8;
    private final Map<MediaData, EngineHolder> attachedEnginesData;
    private final Map<MediaData, Integer> attachedListPlayerIndex;
    private final List<Item> currentItems;
    private final Map<Integer, DecoderEventData> decoderData;
    private final Map<String, Integer> fatalErrorData;
    private final List<MediaData> mediaData;
    private final Map<MediaData, PreloadState> preloadData;
    private final List<SpeedTelemetry> speedTelemetry;
    private final List<StartBitrateDataHolder> startVideoBitrateData;
    private final List<MediaData> visibleMediaData;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DebugData(List list, List list2, List list3, Map map, Map map2, Map map3, Map map4, Map map5, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r13 != 0 ? r0 : list, (i & 2) != 0 ? r0 : list2, (i & 4) != 0 ? r0 : list3, (i & 8) != 0 ? b.f() : map, (i & 16) != 0 ? b.f() : map2, (i & 32) != 0 ? b.f() : map3, (i & 64) != 0 ? b.f() : map4, (i & 128) != 0 ? b.f() : map5, (i & 256) != 0 ? r0 : list4, (i & 512) != 0 ? r0 : list5);
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
    }

    public static /* synthetic */ DebugData copy$default(DebugData debugData, List list, List list2, List list3, Map map, Map map2, Map map3, Map map4, Map map5, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = debugData.mediaData;
        }
        if ((i & 2) != 0) {
            list2 = debugData.visibleMediaData;
        }
        if ((i & 4) != 0) {
            list3 = debugData.currentItems;
        }
        if ((i & 8) != 0) {
            map = debugData.preloadData;
        }
        if ((i & 16) != 0) {
            map2 = debugData.attachedListPlayerIndex;
        }
        if ((i & 32) != 0) {
            map3 = debugData.attachedEnginesData;
        }
        if ((i & 64) != 0) {
            map4 = debugData.decoderData;
        }
        if ((i & 128) != 0) {
            map5 = debugData.fatalErrorData;
        }
        if ((i & 256) != 0) {
            list4 = debugData.startVideoBitrateData;
        }
        if ((i & 512) != 0) {
            list5 = debugData.speedTelemetry;
        }
        List list6 = list4;
        List list7 = list5;
        Map map6 = map4;
        Map map7 = map5;
        Map map8 = map2;
        Map map9 = map3;
        return debugData.copy(list, list2, list3, map, map8, map9, map6, map7, list6, list7);
    }

    public final List<MediaData> component1() {
        return this.mediaData;
    }

    public final List<SpeedTelemetry> component10() {
        return this.speedTelemetry;
    }

    public final List<MediaData> component2() {
        return this.visibleMediaData;
    }

    public final List<Item> component3() {
        return this.currentItems;
    }

    public final Map<MediaData, PreloadState> component4() {
        return this.preloadData;
    }

    public final Map<MediaData, Integer> component5() {
        return this.attachedListPlayerIndex;
    }

    public final Map<MediaData, EngineHolder> component6() {
        return this.attachedEnginesData;
    }

    public final Map<Integer, DecoderEventData> component7() {
        return this.decoderData;
    }

    public final Map<String, Integer> component8() {
        return this.fatalErrorData;
    }

    public final List<StartBitrateDataHolder> component9() {
        return this.startVideoBitrateData;
    }

    public final DebugData copy(List<MediaData> mediaData, List<MediaData> visibleMediaData, List<Item> currentItems, Map<MediaData, ? extends PreloadState> preloadData, Map<MediaData, Integer> attachedListPlayerIndex, Map<MediaData, EngineHolder> attachedEnginesData, Map<Integer, DecoderEventData> decoderData, Map<String, Integer> fatalErrorData, List<StartBitrateDataHolder> startVideoBitrateData, List<SpeedTelemetry> speedTelemetry) {
        return new DebugData(mediaData, visibleMediaData, currentItems, preloadData, attachedListPlayerIndex, attachedEnginesData, decoderData, fatalErrorData, startVideoBitrateData, speedTelemetry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebugData)) {
            return false;
        }
        DebugData debugData = (DebugData) other;
        return jl40.l(this.mediaData, debugData.mediaData) && jl40.l(this.visibleMediaData, debugData.visibleMediaData) && jl40.l(this.currentItems, debugData.currentItems) && jl40.l(this.preloadData, debugData.preloadData) && jl40.l(this.attachedListPlayerIndex, debugData.attachedListPlayerIndex) && jl40.l(this.attachedEnginesData, debugData.attachedEnginesData) && jl40.l(this.decoderData, debugData.decoderData) && jl40.l(this.fatalErrorData, debugData.fatalErrorData) && jl40.l(this.startVideoBitrateData, debugData.startVideoBitrateData) && jl40.l(this.speedTelemetry, debugData.speedTelemetry);
    }

    public final Map<MediaData, EngineHolder> getAttachedEnginesData() {
        return this.attachedEnginesData;
    }

    public final Map<MediaData, Integer> getAttachedListPlayerIndex() {
        return this.attachedListPlayerIndex;
    }

    public final List<Item> getCurrentItems() {
        return this.currentItems;
    }

    public final Map<Integer, DecoderEventData> getDecoderData() {
        return this.decoderData;
    }

    public final Map<String, Integer> getFatalErrorData() {
        return this.fatalErrorData;
    }

    public final List<MediaData> getMediaData() {
        return this.mediaData;
    }

    public final Map<MediaData, PreloadState> getPreloadData() {
        return this.preloadData;
    }

    public final List<SpeedTelemetry> getSpeedTelemetry() {
        return this.speedTelemetry;
    }

    public final List<StartBitrateDataHolder> getStartVideoBitrateData() {
        return this.startVideoBitrateData;
    }

    public final List<MediaData> getVisibleMediaData() {
        return this.visibleMediaData;
    }

    public int hashCode() {
        return this.speedTelemetry.hashCode() + unr0.c(unr0.d(unr0.d(unr0.d(unr0.d(unr0.d(unr0.c(unr0.c(this.mediaData.hashCode() * 31, 31, this.visibleMediaData), 31, this.currentItems), 31, this.preloadData), 31, this.attachedListPlayerIndex), 31, this.attachedEnginesData), 31, this.decoderData), 31, this.fatalErrorData), 31, this.startVideoBitrateData);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("mediaData=");
        List<MediaData> list = this.mediaData;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaData) it.next()).getVideoContentId());
        }
        sb2.append(arrayList);
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder("visibleMediaData=");
        List<MediaData> list2 = this.visibleMediaData;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((MediaData) it2.next()).getVideoContentId());
        }
        sb3.append(arrayList2);
        sb.append(sb3.toString());
        sb.append('\n');
        sb.append("currentItems=" + this.currentItems);
        sb.append('\n');
        sb.append("preloadData=" + this.preloadData);
        sb.append('\n');
        StringBuilder sb4 = new StringBuilder("attachedEnginesData=");
        Map<MediaData, EngineHolder> map = this.attachedEnginesData;
        ArrayList arrayList3 = new ArrayList(map.size());
        for (Map.Entry<MediaData, EngineHolder> entry : map.entrySet()) {
            arrayList3.add("uuid=" + entry.getKey().getVideoContentId() + " vsid=" + entry.getValue().getEngine().getVideoSessionId());
        }
        sb4.append(arrayList3);
        sb.append(sb4.toString());
        sb.append('\n');
        sb.append("decoderData=" + this.decoderData);
        sb.append('\n');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DebugData(List<MediaData> list, List<MediaData> list2, List<Item> list3, Map<MediaData, ? extends PreloadState> map, Map<MediaData, Integer> map2, Map<MediaData, EngineHolder> map3, Map<Integer, DecoderEventData> map4, Map<String, Integer> map5, List<StartBitrateDataHolder> list4, List<SpeedTelemetry> list5) {
        this.mediaData = list;
        this.visibleMediaData = list2;
        this.currentItems = list3;
        this.preloadData = map;
        this.attachedListPlayerIndex = map2;
        this.attachedEnginesData = map3;
        this.decoderData = map4;
        this.fatalErrorData = map5;
        this.startVideoBitrateData = list4;
        this.speedTelemetry = list5;
    }

    public DebugData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
