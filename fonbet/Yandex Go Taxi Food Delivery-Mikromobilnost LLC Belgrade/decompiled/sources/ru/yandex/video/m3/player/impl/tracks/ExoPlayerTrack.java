package ru.yandex.video.m3.player.impl.tracks;

import androidx.media3.common.a;
import defpackage.g8e;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.s820;
import defpackage.t5w;
import defpackage.w820;
import defpackage.xzz0;
import defpackage.y6i0;
import defpackage.yci0;
import defpackage.yzz0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.source.dash.manifest.util.ManifestLanguageHolder;
import ru.yandex.video.m3.player.impl.tracks.RendererTrackSelector;
import ru.yandex.video.m3.player.impl.utils.LanguageTagIso1toIso3;
import ru.yandex.video.m3.player.tracks.CappingProvider;
import ru.yandex.video.m3.player.tracks.PlayerTrackNameProvider;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u00010B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010!\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010(\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/yandex/video/m3/player/impl/tracks/ExoPlayerTrack;", "Lru/yandex/video/m3/player/tracks/Track;", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector;", "rendererTrackSelector", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "playerTrackNameProvider", "", "allowDisabledTrackVariant", "<init>", "(Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector;Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;Z)V", "", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "createTrackVariants", "()Ljava/util/Collection;", "Lzy11;", "update", "()V", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "resourceProvider", "", "getSelectedTrackName", "(Lru/yandex/video/m3/player/utils/ResourceProvider;)Ljava/lang/String;", "trackVariant", "selectTrack", "(Lru/yandex/video/m3/player/tracks/TrackVariant;)Z", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "getSelectedTrackFormat", "()Lru/yandex/video/m3/player/tracks/TrackFormat;", "", "getAvailableTrackVariants", "()Ljava/util/List;", "getSelectedTrackVariant", "()Lru/yandex/video/m3/player/tracks/TrackVariant;", "toString", "()Ljava/lang/String;", "Lru/yandex/video/m3/player/tracks/TrackType;", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector;", "Lru/yandex/video/m3/player/tracks/PlayerTrackNameProvider;", "allowDisable", "Z", "allowAdaptive", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "selection", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "trackVariants", "Ljava/util/Collection;", "ExoTrackFormat", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoPlayerTrack implements Track {
    public static final int $stable = 8;
    private final boolean allowAdaptive;
    private final boolean allowDisable;
    private final PlayerTrackNameProvider playerTrackNameProvider;
    private final RendererTrackSelector rendererTrackSelector;
    private volatile RendererTrackSelector.Selection selection;
    private final TrackType trackType;
    private volatile Collection<? extends TrackVariant> trackVariants;

    public ExoPlayerTrack(TrackType trackType, RendererTrackSelector rendererTrackSelector, PlayerTrackNameProvider playerTrackNameProvider, boolean z) {
        this.trackType = trackType;
        this.rendererTrackSelector = rendererTrackSelector;
        this.playerTrackNameProvider = playerTrackNameProvider;
        this.allowDisable = z || trackType == TrackType.Subtitles;
        this.allowAdaptive = trackType == TrackType.Video;
        this.trackVariants = EmptyList.a;
    }

    private final Collection<TrackVariant> createTrackVariants() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.allowDisable) {
            TrackVariant.Disable disable = new TrackVariant.Disable(this.playerTrackNameProvider.getDisabledTrackName(), this.selection instanceof RendererTrackSelector.Selection.Disabled, false, 4, null);
            linkedHashMap.put(disable.getTitle(), disable);
        }
        if (this.allowAdaptive) {
            String adaptiveTrackName = this.playerTrackNameProvider.getAdaptiveTrackName();
            boolean z = this.selection instanceof RendererTrackSelector.Selection.Adaptive;
            RendererTrackSelector.Selection selection = this.selection;
            RendererTrackSelector.Selection.Adaptive adaptive = selection instanceof RendererTrackSelector.Selection.Adaptive ? (RendererTrackSelector.Selection.Adaptive) selection : null;
            CappingProvider cappingProvider = adaptive != null ? adaptive.getCappingProvider() : null;
            RendererTrackSelector.Selection selection2 = this.selection;
            RendererTrackSelector.Selection.Adaptive adaptive2 = selection2 instanceof RendererTrackSelector.Selection.Adaptive ? (RendererTrackSelector.Selection.Adaptive) selection2 : null;
            TrackVariant.Adaptive adaptive3 = new TrackVariant.Adaptive(adaptiveTrackName, z, cappingProvider, adaptive2 != null ? adaptive2.getTrackSelectionInitializationError() : null);
            linkedHashMap.put(adaptive3.getTitle(), adaptive3);
        }
        yzz0 trackGroups = this.rendererTrackSelector.getTrackGroups();
        RendererTrackSelector.Selection selection3 = this.selection;
        RendererTrackSelector.Selection.Track track = selection3 instanceof RendererTrackSelector.Selection.Track ? (RendererTrackSelector.Selection.Track) selection3 : null;
        Iterator it = y6i0.n(0, trackGroups.a).iterator();
        while (it.hasNext()) {
            int nextInt = ((t5w) it).nextInt();
            xzz0 a = trackGroups.a(nextInt);
            Iterator it2 = y6i0.n(0, a.a).iterator();
            while (it2.hasNext()) {
                int nextInt2 = ((t5w) it2).nextInt();
                a aVar = a.d[nextInt2];
                ExoTrackFormat exoTrackFormat = new ExoTrackFormat(aVar, null, null, null, null, 0, 0, 0, 0.0f, null, null, 2046, null);
                String otherTrackName = this.playerTrackNameProvider.getOtherTrackName(exoTrackFormat);
                if (!linkedHashMap.containsKey(otherTrackName)) {
                    linkedHashMap.put(otherTrackName, new TrackVariant.Variant(otherTrackName, nextInt, nextInt2, jl40.l(track != null ? track.getFormat() : null, aVar), exoTrackFormat));
                }
            }
        }
        return linkedHashMap.values();
    }

    @Override // ru.yandex.video.m3.player.tracks.Track
    public List<TrackVariant> getAvailableTrackVariants() {
        return kotlin.collections.a.J0(this.trackVariants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    @Override // ru.yandex.video.m3.player.tracks.Track
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TrackFormat getSelectedTrackFormat() {
        a aVar;
        a format;
        RendererTrackSelector.Selection selection = this.selection;
        if (selection != null) {
            RendererTrackSelector.Selection.Adaptive adaptive = selection instanceof RendererTrackSelector.Selection.Adaptive ? (RendererTrackSelector.Selection.Adaptive) selection : null;
            if (adaptive != null) {
                format = adaptive.getFormat();
            }
        }
        RendererTrackSelector.Selection selection2 = this.selection;
        if (selection2 != null) {
            RendererTrackSelector.Selection.Track track = selection2 instanceof RendererTrackSelector.Selection.Track ? (RendererTrackSelector.Selection.Track) selection2 : null;
            if (track != null) {
                format = track.getFormat();
                aVar = format;
                if (aVar == null) {
                    return new ExoTrackFormat(aVar, null, null, null, null, 0, 0, 0, 0.0f, null, null, 2046, null);
                }
                return null;
            }
        }
        aVar = null;
        if (aVar == null) {
        }
    }

    @Override // ru.yandex.video.m3.player.tracks.Track
    public String getSelectedTrackName(ResourceProvider resourceProvider) {
        String title;
        TrackVariant selectedTrackVariant = getSelectedTrackVariant();
        return (selectedTrackVariant == null || (title = selectedTrackVariant.getTitle()) == null) ? this.playerTrackNameProvider.getDisabledTrackName() : title;
    }

    @Override // ru.yandex.video.m3.player.tracks.Track
    public TrackVariant getSelectedTrackVariant() {
        Object obj;
        Iterator<T> it = this.trackVariants.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((TrackVariant) obj).getSelected()) {
                break;
            }
        }
        return (TrackVariant) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (defpackage.jl40.l(r0.getFormat(), r3.getFormat()) != false) goto L20;
     */
    @Override // ru.yandex.video.m3.player.tracks.Track
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean selectTrack(TrackVariant trackVariant) {
        TrackVariant selectedTrackVariant = getSelectedTrackVariant();
        if ((!(selectedTrackVariant instanceof TrackVariant.Adaptive) || !(trackVariant instanceof TrackVariant.Adaptive)) && (!(selectedTrackVariant instanceof TrackVariant.Disable) || !(trackVariant instanceof TrackVariant.Disable))) {
            if ((selectedTrackVariant instanceof TrackVariant.Variant) && (trackVariant instanceof TrackVariant.Variant)) {
                TrackVariant.Variant variant = (TrackVariant.Variant) selectedTrackVariant;
                TrackVariant.Variant variant2 = (TrackVariant.Variant) trackVariant;
                if (variant.getTrackIndex() == variant2.getTrackIndex()) {
                    if (variant.getGroupIndex() == variant2.getGroupIndex()) {
                    }
                }
            }
            h5z0.a.a("Apply track: " + trackVariant, new Object[0]);
            if (trackVariant instanceof TrackVariant.Disable) {
                this.rendererTrackSelector.disableRenderer();
                return true;
            }
            if (trackVariant instanceof TrackVariant.Adaptive) {
                this.rendererTrackSelector.selectAdaptive();
                return true;
            }
            if (trackVariant instanceof TrackVariant.Variant) {
                TrackVariant.Variant variant3 = (TrackVariant.Variant) trackVariant;
                this.rendererTrackSelector.selectTrack(variant3.getGroupIndex(), variant3.getTrackIndex());
                return true;
            }
            if (trackVariant instanceof TrackVariant.PreferredTrackVariant) {
                this.rendererTrackSelector.defaultTrackLanguage(((TrackVariant.PreferredTrackVariant) trackVariant).getLanguage());
                return true;
            }
            yci0.k(trackVariant, "Not supported: ");
            return false;
        }
        h5z0.a.a("Track is not changed, do not reapply: " + trackVariant, new Object[0]);
        return false;
    }

    public String toString() {
        return "ExoPlayerTrack(trackType=" + this.trackType + ", selection=" + this.selection + ", trackVariants=" + this.trackVariants + ')';
    }

    @Override // ru.yandex.video.m3.player.tracks.Track
    public void update() {
        this.selection = this.rendererTrackSelector.getSelection();
        this.trackVariants = createTrackVariants();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00019B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u0016J\u008a\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b0\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b3\u0010\u001cR\u001a\u0010\f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b4\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b7\u0010\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b8\u0010\u0016¨\u0006:"}, d2 = {"Lru/yandex/video/m3/player/impl/tracks/ExoPlayerTrack$ExoTrackFormat;", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "Landroidx/media3/common/a;", "format", "", "id", "label", "language", "iso3Language", "", "width", "height", "bitrate", "", "frameRate", "codecs", "manifestLanguage", "<init>", "(Landroidx/media3/common/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIFLjava/lang/String;Ljava/lang/String;)V", "component1", "()Landroidx/media3/common/a;", "toString", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()I", "component7", "component8", "component9", "()F", "component10", "component11", "copy", "(Landroidx/media3/common/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIFLjava/lang/String;Ljava/lang/String;)Lru/yandex/video/m3/player/impl/tracks/ExoPlayerTrack$ExoTrackFormat;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/media3/common/a;", "Ljava/lang/String;", "getId", "getLabel", "getLanguage", "getIso3Language", CA20Status.STATUS_USER_I, "getWidth", "getHeight", "getBitrate", "F", "getFrameRate", "getCodecs", "getManifestLanguage", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ExoTrackFormat implements TrackFormat {
        private final int bitrate;
        private final String codecs;
        private final a format;
        private final float frameRate;
        private final int height;
        private final String id;
        private final String iso3Language;
        private final String label;
        private final String language;
        private final String manifestLanguage;
        private final int width;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ ExoTrackFormat(a aVar, String str, String str2, String str3, String str4, int i, int i2, int i3, float f, String str5, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i4 & 2) != 0 ? aVar.a : str, (i4 & 4) != 0 ? aVar.b : str2, (i4 & 8) != 0 ? aVar.d : str3, (i4 & 16) != 0 ? LanguageTagIso1toIso3.INSTANCE.convert(aVar.d) : str4, (i4 & 32) != 0 ? aVar.u : i, (i4 & 64) != 0 ? aVar.v : i2, (i4 & 128) != 0 ? aVar.j : i3, (i4 & 256) != 0 ? aVar.w : f, (i4 & 512) != 0 ? aVar.k : str5, (i4 & 1024) != 0 ? INSTANCE.tryExtractManifestLanguageFromMetadata(aVar) : str6);
        }

        /* renamed from: component1, reason: from getter */
        private final a getFormat() {
            return this.format;
        }

        public static /* synthetic */ ExoTrackFormat copy$default(ExoTrackFormat exoTrackFormat, a aVar, String str, String str2, String str3, String str4, int i, int i2, int i3, float f, String str5, String str6, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                aVar = exoTrackFormat.format;
            }
            if ((i4 & 2) != 0) {
                str = exoTrackFormat.id;
            }
            if ((i4 & 4) != 0) {
                str2 = exoTrackFormat.label;
            }
            if ((i4 & 8) != 0) {
                str3 = exoTrackFormat.language;
            }
            if ((i4 & 16) != 0) {
                str4 = exoTrackFormat.iso3Language;
            }
            if ((i4 & 32) != 0) {
                i = exoTrackFormat.width;
            }
            if ((i4 & 64) != 0) {
                i2 = exoTrackFormat.height;
            }
            if ((i4 & 128) != 0) {
                i3 = exoTrackFormat.bitrate;
            }
            if ((i4 & 256) != 0) {
                f = exoTrackFormat.frameRate;
            }
            if ((i4 & 512) != 0) {
                str5 = exoTrackFormat.codecs;
            }
            if ((i4 & 1024) != 0) {
                str6 = exoTrackFormat.manifestLanguage;
            }
            String str7 = str5;
            String str8 = str6;
            int i5 = i3;
            float f2 = f;
            int i6 = i;
            int i7 = i2;
            String str9 = str4;
            String str10 = str2;
            return exoTrackFormat.copy(aVar, str, str10, str3, str9, i6, i7, i5, f2, str7, str8);
        }

        /* renamed from: component10, reason: from getter */
        public final String getCodecs() {
            return this.codecs;
        }

        /* renamed from: component11, reason: from getter */
        public final String getManifestLanguage() {
            return this.manifestLanguage;
        }

        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        /* renamed from: component5, reason: from getter */
        public final String getIso3Language() {
            return this.iso3Language;
        }

        /* renamed from: component6, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component7, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: component8, reason: from getter */
        public final int getBitrate() {
            return this.bitrate;
        }

        /* renamed from: component9, reason: from getter */
        public final float getFrameRate() {
            return this.frameRate;
        }

        public final ExoTrackFormat copy(a format, String id, String label, String language, String iso3Language, int width, int height, int bitrate, float frameRate, String codecs, String manifestLanguage) {
            return new ExoTrackFormat(format, id, label, language, iso3Language, width, height, bitrate, frameRate, codecs, manifestLanguage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExoTrackFormat)) {
                return false;
            }
            ExoTrackFormat exoTrackFormat = (ExoTrackFormat) other;
            return jl40.l(this.format, exoTrackFormat.format) && jl40.l(this.id, exoTrackFormat.id) && jl40.l(this.label, exoTrackFormat.label) && jl40.l(this.language, exoTrackFormat.language) && jl40.l(this.iso3Language, exoTrackFormat.iso3Language) && this.width == exoTrackFormat.width && this.height == exoTrackFormat.height && this.bitrate == exoTrackFormat.bitrate && Float.compare(this.frameRate, exoTrackFormat.frameRate) == 0 && jl40.l(this.codecs, exoTrackFormat.codecs) && jl40.l(this.manifestLanguage, exoTrackFormat.manifestLanguage);
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackFormat
        public int getBitrate() {
            return this.bitrate;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackFormat
        public String getCodecs() {
            return this.codecs;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackFormat
        public float getFrameRate() {
            return this.frameRate;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackFormat
        public int getHeight() {
            return this.height;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackFormat
        public String getId() {
            return this.id;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackFormat
        public String getIso3Language() {
            return this.iso3Language;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackFormat
        public String getLabel() {
            return this.label;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackFormat
        public String getLanguage() {
            return this.language;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackFormat
        public String getManifestLanguage() {
            return this.manifestLanguage;
        }

        @Override // ru.yandex.video.m3.player.tracks.TrackFormat
        public int getWidth() {
            return this.width;
        }

        public int hashCode() {
            int hashCode = this.format.hashCode() * 31;
            String str = this.id;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.language;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.iso3Language;
            int c = g8e.c(this.frameRate, oyr.b(this.bitrate, oyr.b(this.height, oyr.b(this.width, (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31), 31);
            String str5 = this.codecs;
            int hashCode5 = (c + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.manifestLanguage;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "ExoTrackFormat(language=" + getLanguage() + ", iso3Language=" + getIso3Language() + ", manifestLanguage=" + getManifestLanguage() + ", format=Format(" + a.c(this.format) + "))";
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/impl/tracks/ExoPlayerTrack$ExoTrackFormat$Companion;", "", "<init>", "()V", "Landroidx/media3/common/a;", "", "tryExtractManifestLanguageFromMetadata", "(Landroidx/media3/common/a;)Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final String tryExtractManifestLanguageFromMetadata(a aVar) {
                w820 w820Var = aVar.l;
                if (w820Var == null) {
                    return null;
                }
                for (s820 s820Var : w820Var.a) {
                    ManifestLanguageHolder manifestLanguageHolder = s820Var instanceof ManifestLanguageHolder ? (ManifestLanguageHolder) s820Var : null;
                    if (manifestLanguageHolder != null) {
                        return manifestLanguageHolder.getLanguage();
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        public ExoTrackFormat(a aVar, String str, String str2, String str3, String str4, int i, int i2, int i3, float f, String str5, String str6) {
            this.format = aVar;
            this.id = str;
            this.label = str2;
            this.language = str3;
            this.iso3Language = str4;
            this.width = i;
            this.height = i2;
            this.bitrate = i3;
            this.frameRate = f;
            this.codecs = str5;
            this.manifestLanguage = str6;
        }
    }
}
