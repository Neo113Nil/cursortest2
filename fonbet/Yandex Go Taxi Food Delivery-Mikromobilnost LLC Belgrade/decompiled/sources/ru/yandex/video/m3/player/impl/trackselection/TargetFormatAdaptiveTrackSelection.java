package ru.yandex.video.m3.player.impl.trackselection;

import com.google.common.collect.ImmutableList;
import defpackage.ip4;
import defpackage.jl40;
import defpackage.nsb;
import defpackage.ny61;
import defpackage.qk51;
import defpackage.scc;
import defpackage.sk51;
import defpackage.tcc;
import defpackage.xzz0;
import defpackage.y3c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandex.video.m3.data.Format;
import ru.yandex.video.m3.data.TargetFormat;
import ru.yandex.video.m3.player.impl.trackselection.SurfaceSizeDependAdaptiveTrackSelection;
import ru.yandex.video.m3.player.impl.trackselection.TargetFormatAdaptiveTrackSelection;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.player.provider.model.StartQuality;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;
import ru.yandex.video.m3.player.tracks.CappingProvider;
import ru.yandex.video.m3.player.tracks.TrackSelectionInitializationError;
import ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002%&B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0005¢\u0006\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/TargetFormatAdaptiveTrackSelection;", "Lru/yandex/video/m3/player/impl/trackselection/SurfaceSizeDependAdaptiveTrackSelection;", "Lru/yandex/video/m3/player/tracks/CappingProvider;", "Lru/yandex/video/m3/player/tracks/TrackSelectionInitializationError;", "trackSelectionInitializationError", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "surfaceSizeSupplier", "Lxzz0;", "group", "", "tracks", "", "type", "Lip4;", "bandwidthMeter", "", "minDurationForQualityIncreaseMs", "maxDurationForQualityDecreaseMs", "minDurationToRetainAfterDiscardMs", "maxWidthToDiscard", "maxHeightToDiscard", "", "bandwidthFraction", "bufferedFractionToLiveEdgeForQualityIncrease", "", "Lqk51;", "adaptationCheckpoints", "Ly3c;", "clock", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "startQualitySupplier", "<init>", "(Lru/yandex/video/m3/player/tracks/TrackSelectionInitializationError;Lru/yandex/video/m3/player/provider/Supplier;Lxzz0;[IILip4;JJJIIFFLjava/util/List;Ly3c;Lru/yandex/video/m3/player/provider/Supplier;)V", "Lru/yandex/video/m3/player/tracks/TrackSelectionInitializationError;", "getTrackSelectionInitializationError", "()Lru/yandex/video/m3/player/tracks/TrackSelectionInitializationError;", "Companion", "Factory", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TargetFormatAdaptiveTrackSelection extends SurfaceSizeDependAdaptiveTrackSelection implements CappingProvider {
    public static final String FEW_USABLE_FORMATS_FALLBACK = "FEW_USABLE_FORMATS_FALLBACK";
    public static final String JUST_ONE_USABLE_FORMATS = "JUST_ONE_USABLE_FORMATS";
    public static final String TOO_MANY_USABLE_FORMATS = "TOO_MANY_USABLE_FORMATS";
    public static final String ZERO_USABLE_FORMATS = "ZERO_USABLE_FORMATS";
    private final TrackSelectionInitializationError trackSelectionInitializationError;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ TargetFormatAdaptiveTrackSelection(TrackSelectionInitializationError trackSelectionInitializationError, Supplier supplier, xzz0 xzz0Var, int[] iArr, int i, ip4 ip4Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, y3c y3cVar, Supplier supplier2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(trackSelectionInitializationError, supplier, xzz0Var, iArr, i, ip4Var, j, j2, j3, i2, i3, f, f2, list, y3cVar, (i4 & 32768) != 0 ? null : supplier2);
    }

    public final TrackSelectionInitializationError getTrackSelectionInitializationError() {
        return this.trackSelectionInitializationError;
    }

    @Override // ru.yandex.video.m3.player.impl.trackselection.SurfaceSizeDependAdaptiveTrackSelection, ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection, defpackage.loo
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
    }

    @Override // ru.yandex.video.m3.player.impl.trackselection.SurfaceSizeDependAdaptiveTrackSelection, ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection, defpackage.loo
    public /* bridge */ /* synthetic */ void onRebuffer() {
    }

    @Override // ru.yandex.video.m3.player.impl.trackselection.SurfaceSizeDependAdaptiveTrackSelection, ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection, defpackage.loo
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j, nsb nsbVar, List list) {
        return false;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\fH\u0007JD\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\rH\u0007J\u001e\u0010\u0014\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/TargetFormatAdaptiveTrackSelection$Companion;", "", "()V", TargetFormatAdaptiveTrackSelection.FEW_USABLE_FORMATS_FALLBACK, "", TargetFormatAdaptiveTrackSelection.JUST_ONE_USABLE_FORMATS, TargetFormatAdaptiveTrackSelection.TOO_MANY_USABLE_FORMATS, TargetFormatAdaptiveTrackSelection.ZERO_USABLE_FORMATS, "findLowerGroupWithMultipleFormats", "", "Lru/yandex/video/m3/player/impl/trackselection/TargetFormatAdaptiveTrackSelection$Factory$UsableFormat;", PolicyMappingsExtension.MAP, "", "", "findUsableFormats", "targetFormat", "Lru/yandex/video/m3/data/TargetFormat;", "selectMonoBitrate", "", "degradationSteps", "isAllUsableFormatsFitsTargetFormat", "usableFormats", "isFormatFitsTargetFormat", "format", "Lru/yandex/video/m3/data/Format;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ List findUsableFormats$default(Companion companion, Map map, TargetFormat targetFormat, boolean z, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z = false;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            return companion.findUsableFormats(map, targetFormat, z, i);
        }

        private final boolean isAllUsableFormatsFitsTargetFormat(List<Factory.UsableFormat> usableFormats, TargetFormat targetFormat) {
            List<Factory.UsableFormat> list = usableFormats;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!TargetFormatAdaptiveTrackSelection.INSTANCE.isFormatFitsTargetFormat(((Factory.UsableFormat) it.next()).getFormat(), targetFormat)) {
                    return false;
                }
            }
            return true;
        }

        private final boolean isFormatFitsTargetFormat(Format format, TargetFormat targetFormat) {
            return format.getHeight() >= targetFormat.getMinSize().getHeight() && format.getWidth() >= targetFormat.getMinSize().getWidth() && format.getHeight() <= targetFormat.getMaxSize().getHeight() && format.getWidth() <= targetFormat.getMaxSize().getWidth();
        }

        public final List<Factory.UsableFormat> findLowerGroupWithMultipleFormats(Map<Integer, ? extends List<Factory.UsableFormat>> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, ? extends List<Factory.UsableFormat>> entry : map.entrySet()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<T> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(Integer.valueOf(((Factory.UsableFormat) it.next()).getFormat().getBitrate()));
                }
                linkedHashMap.put(entry.getKey(), Integer.valueOf(linkedHashSet.size()));
            }
            Set<Integer> keySet = map.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(((Number) obj).intValue()));
                if ((num != null ? num.intValue() : 0) > 1) {
                    arrayList.add(obj);
                }
            }
            List<Factory.UsableFormat> list = map.get((Integer) a.h0(arrayList));
            return list == null ? EmptyList.a : list;
        }

        public final List<Factory.UsableFormat> findUsableFormats(Map<Integer, ? extends List<Factory.UsableFormat>> map, TargetFormat targetFormat, boolean selectMonoBitrate, int degradationSteps) {
            if (!selectMonoBitrate) {
                for (Map.Entry<Integer, ? extends List<Factory.UsableFormat>> entry : map.entrySet()) {
                    if (TargetFormatAdaptiveTrackSelection.INSTANCE.isAllUsableFormatsFitsTargetFormat(entry.getValue(), targetFormat)) {
                        return entry.getValue();
                    }
                }
                return EmptyList.a;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Integer, ? extends List<Factory.UsableFormat>> entry2 : map.entrySet()) {
                if (degradationSteps <= 0) {
                    Iterator<T> it = entry2.getValue().iterator();
                    if (!it.hasNext()) {
                        ny61.p();
                        return null;
                    }
                    Object next = it.next();
                    if (it.hasNext()) {
                        int bitrate = ((Factory.UsableFormat) next).getFormat().getBitrate();
                        do {
                            Object next2 = it.next();
                            int bitrate2 = ((Factory.UsableFormat) next2).getFormat().getBitrate();
                            if (bitrate < bitrate2) {
                                next = next2;
                                bitrate = bitrate2;
                            }
                        } while (it.hasNext());
                    }
                    arrayList.add(next);
                } else {
                    arrayList.add(a.x0(entry2.getValue(), new Comparator() { // from class: ru.yandex.video.m3.player.impl.trackselection.TargetFormatAdaptiveTrackSelection$Companion$findUsableFormats$lambda$2$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return Integer.valueOf(((TargetFormatAdaptiveTrackSelection.Factory.UsableFormat) t2).getFormat().getBitrate()).compareTo(Integer.valueOf(((TargetFormatAdaptiveTrackSelection.Factory.UsableFormat) t).getFormat().getBitrate()));
                        }
                    }).get(Math.min(degradationSteps, entry2.getValue().size() - 1)));
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001-Bq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u00122\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010(\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0014¢\u0006\u0004\b(\u0010)R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,¨\u0006."}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/TargetFormatAdaptiveTrackSelection$Factory;", "Lru/yandex/video/m3/player/impl/trackselection/SurfaceSizeDependAdaptiveTrackSelection$Factory;", "Lru/yandex/video/m3/data/TargetFormat;", "targetFormat", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "surfaceSizeSupplier", "", "minDurationForQualityIncreaseMs", "maxDurationForQualityDecreaseMs", "minDurationToRetainAfterDiscardMs", "", "bandwidthFraction", "bufferedFractionToLiveEdgeForQualityIncrease", "Ly3c;", "clock", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "startQualitySupplier", "", "selectMonoBitrate", "degradationSteps", "<init>", "(Lru/yandex/video/m3/data/TargetFormat;Lru/yandex/video/m3/player/provider/Supplier;IIIFFLy3c;Lru/yandex/video/m3/player/provider/Supplier;ZI)V", "", "", "Lru/yandex/video/m3/player/impl/trackselection/TargetFormatAdaptiveTrackSelection$Factory$UsableFormat;", PolicyMappingsExtension.MAP, "containFormatsWithSameResolutionAndDiffBitrate", "(Ljava/util/Map;)Z", "Lxzz0;", "group", "", "tracks", "type", "Lip4;", "bandwidthMeter", "Lcom/google/common/collect/ImmutableList;", "Lqk51;", "adaptationCheckpoints", "Lsk51;", "createAdaptiveTrackSelection", "(Lxzz0;[IILip4;Lcom/google/common/collect/ImmutableList;)Lsk51;", "Lru/yandex/video/m3/data/TargetFormat;", "Z", CA20Status.STATUS_USER_I, "UsableFormat", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory extends SurfaceSizeDependAdaptiveTrackSelection.Factory {
        public static final int $stable = 0;
        private final int degradationSteps;
        private final boolean selectMonoBitrate;
        private final TargetFormat targetFormat;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/TargetFormatAdaptiveTrackSelection$Factory$UsableFormat;", "", "trackIndex", "", "format", "Lru/yandex/video/m3/data/Format;", "(ILru/yandex/video/m3/data/Format;)V", "getFormat", "()Lru/yandex/video/m3/data/Format;", "getTrackIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class UsableFormat {
            public static final int $stable = 0;
            private final Format format;
            private final int trackIndex;

            public UsableFormat(int i, Format format) {
                this.trackIndex = i;
                this.format = format;
            }

            public static /* synthetic */ UsableFormat copy$default(UsableFormat usableFormat, int i, Format format, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = usableFormat.trackIndex;
                }
                if ((i2 & 2) != 0) {
                    format = usableFormat.format;
                }
                return usableFormat.copy(i, format);
            }

            /* renamed from: component1, reason: from getter */
            public final int getTrackIndex() {
                return this.trackIndex;
            }

            /* renamed from: component2, reason: from getter */
            public final Format getFormat() {
                return this.format;
            }

            public final UsableFormat copy(int trackIndex, Format format) {
                return new UsableFormat(trackIndex, format);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UsableFormat)) {
                    return false;
                }
                UsableFormat usableFormat = (UsableFormat) other;
                return this.trackIndex == usableFormat.trackIndex && jl40.l(this.format, usableFormat.format);
            }

            public final Format getFormat() {
                return this.format;
            }

            public final int getTrackIndex() {
                return this.trackIndex;
            }

            public int hashCode() {
                return this.format.hashCode() + (Integer.hashCode(this.trackIndex) * 31);
            }

            public String toString() {
                return "UsableFormat(trackIndex=" + this.trackIndex + ", format=" + this.format + ')';
            }
        }

        public /* synthetic */ Factory(TargetFormat targetFormat, Supplier supplier, int i, int i2, int i3, float f, float f2, y3c y3cVar, Supplier supplier2, boolean z, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(targetFormat, supplier, i, i2, i3, f, f2, y3cVar, (i5 & 256) != 0 ? null : supplier2, z, i4);
        }

        private final boolean containFormatsWithSameResolutionAndDiffBitrate(Map<Integer, ? extends List<UsableFormat>> map) {
            Iterator<Map.Entry<Integer, ? extends List<UsableFormat>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().size() > 1) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
        @Override // ru.yandex.video.m3.player.impl.trackselection.SurfaceSizeDependAdaptiveTrackSelection.Factory, ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection.Factory, defpackage.rk51
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public sk51 createAdaptiveTrackSelection(xzz0 group, int[] tracks, int type, ip4 bandwidthMeter, ImmutableList<qk51> adaptationCheckpoints) {
            List<UsableFormat> list;
            int[] iArr;
            String str;
            int[] iArr2 = tracks;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            int length = iArr2.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                androidx.media3.common.a aVar = group.d[iArr2[i2]];
                Format format = new Format(aVar.u, aVar.v, aVar.j);
                arrayList.add(format);
                List list2 = (List) linkedHashMap.get(Integer.valueOf(format.getHeight()));
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(new UsableFormat(iArr2[i2], format));
                linkedHashMap.put(Integer.valueOf(format.getHeight()), list2);
            }
            TargetFormat targetFormat = this.targetFormat;
            TrackSelectionInitializationError trackSelectionInitializationError = null;
            if (targetFormat != null) {
                Companion companion = TargetFormatAdaptiveTrackSelection.INSTANCE;
                list = companion.findUsableFormats(linkedHashMap, targetFormat, this.selectMonoBitrate, this.degradationSteps);
                if (list.size() <= 1) {
                    List<UsableFormat> findLowerGroupWithMultipleFormats = companion.findLowerGroupWithMultipleFormats(linkedHashMap);
                    if (findLowerGroupWithMultipleFormats.size() > 1) {
                        list = findLowerGroupWithMultipleFormats;
                        str = TargetFormatAdaptiveTrackSelection.FEW_USABLE_FORMATS_FALLBACK;
                        if (list.isEmpty()) {
                            if (list.size() != 1) {
                                List<UsableFormat> list3 = list;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator<T> it = list3.iterator();
                                    while (it.hasNext()) {
                                        if (((UsableFormat) it.next()).getFormat().getBitrate() != list.get(0).getFormat().getBitrate()) {
                                            iArr2 = new int[list.size()];
                                            for (Object obj : list3) {
                                                int i3 = i + 1;
                                                if (i < 0) {
                                                    scc.m();
                                                    throw null;
                                                }
                                                iArr2[i] = ((UsableFormat) obj).getTrackIndex();
                                                i = i3;
                                            }
                                        }
                                    }
                                }
                            }
                            str = TargetFormatAdaptiveTrackSelection.JUST_ONE_USABLE_FORMATS;
                        } else {
                            str = TargetFormatAdaptiveTrackSelection.ZERO_USABLE_FORMATS;
                        }
                    }
                }
                str = null;
                if (list.isEmpty()) {
                }
            } else {
                boolean containFormatsWithSameResolutionAndDiffBitrate = containFormatsWithSameResolutionAndDiffBitrate(linkedHashMap);
                list = EmptyList.a;
                if (!containFormatsWithSameResolutionAndDiffBitrate) {
                    iArr = iArr2;
                    str = null;
                    if (str != null) {
                        List<UsableFormat> list4 = list;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((UsableFormat) it2.next()).getFormat());
                        }
                        trackSelectionInitializationError = new TrackSelectionInitializationError(str, this.targetFormat, arrayList, arrayList2);
                    }
                    return new TargetFormatAdaptiveTrackSelection(trackSelectionInitializationError, getSurfaceSizeSupplier(), group, iArr, type, bandwidthMeter, getMinDurationForQualityIncreaseMs(), getMaxDurationForQualityDecreaseMs(), getMinDurationToRetainAfterDiscardMs(), ((DefaultAdaptiveTrackSelection.Factory) this).maxWidthToDiscard, ((DefaultAdaptiveTrackSelection.Factory) this).maxHeightToDiscard, getBandwidthFraction(), getBufferedFractionToLiveEdgeForQualityIncrease(), adaptationCheckpoints, getClock(), getStartQualitySupplier());
                }
                str = TargetFormatAdaptiveTrackSelection.TOO_MANY_USABLE_FORMATS;
            }
            iArr = iArr2;
            if (str != null) {
            }
            return new TargetFormatAdaptiveTrackSelection(trackSelectionInitializationError, getSurfaceSizeSupplier(), group, iArr, type, bandwidthMeter, getMinDurationForQualityIncreaseMs(), getMaxDurationForQualityDecreaseMs(), getMinDurationToRetainAfterDiscardMs(), ((DefaultAdaptiveTrackSelection.Factory) this).maxWidthToDiscard, ((DefaultAdaptiveTrackSelection.Factory) this).maxHeightToDiscard, getBandwidthFraction(), getBufferedFractionToLiveEdgeForQualityIncrease(), adaptationCheckpoints, getClock(), getStartQualitySupplier());
        }

        public Factory(TargetFormat targetFormat, Supplier<SurfaceSize> supplier, int i, int i2, int i3, float f, float f2, y3c y3cVar, Supplier<StartQuality> supplier2, boolean z, int i4) {
            super(supplier, i, i2, i3, f, f2, y3cVar, supplier2, false, 256, null);
            this.targetFormat = targetFormat;
            this.selectMonoBitrate = z;
            this.degradationSteps = i4;
        }
    }

    public TargetFormatAdaptiveTrackSelection(TrackSelectionInitializationError trackSelectionInitializationError, Supplier<SurfaceSize> supplier, xzz0 xzz0Var, int[] iArr, int i, ip4 ip4Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List<qk51> list, y3c y3cVar, Supplier<StartQuality> supplier2) {
        super(supplier, xzz0Var, iArr, i, ip4Var, j, j2, j3, i2, i3, f, f2, list, y3cVar, supplier2, false, 32768, null);
        this.trackSelectionInitializationError = trackSelectionInitializationError;
    }
}
