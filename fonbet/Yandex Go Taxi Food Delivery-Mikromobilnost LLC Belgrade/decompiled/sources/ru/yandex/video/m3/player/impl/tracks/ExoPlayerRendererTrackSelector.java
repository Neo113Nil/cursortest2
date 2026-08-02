package ru.yandex.video.m3.player.impl.tracks;

import android.util.SparseArray;
import androidx.media3.common.a;
import defpackage.l001;
import defpackage.loo;
import defpackage.nmh;
import defpackage.omh;
import defpackage.qmh;
import defpackage.r80;
import defpackage.sk51;
import defpackage.sls;
import defpackage.tls;
import defpackage.vmh;
import defpackage.xv00;
import defpackage.xzz0;
import defpackage.yzz0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.impl.tracks.RendererTrackSelector;
import ru.yandex.video.m3.player.impl.trackselection.AnyTrackSelectionCappingProvider;
import ru.yandex.video.m3.player.impl.trackselection.TargetFormatAdaptiveTrackSelection;
import ru.yandex.video.m3.player.tracks.CappingProvider;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/yandex/video/m3/player/impl/tracks/ExoPlayerRendererTrackSelector;", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector;", "Lvmh;", "trackSelector", "", "rendererType", "Lkotlin/Function0;", "rendererIndex", "Lkotlin/Function1;", "Lloo;", "trackSelection", "Lzy11;", "updateListener", "", "allowPendingAudioTrackDisabling", "<init>", "(Lvmh;ILsls;Ltls;Lsls;Z)V", "Ll001;", "Lru/yandex/video/m3/player/tracks/CappingProvider;", "createCappingProvider", "(Ll001;)Lru/yandex/video/m3/player/tracks/CappingProvider;", "maybeDisableRendererIfQueued", "()V", "isRendererEnabled", "()Z", "disableRenderer", "selectAdaptive", "groupIndex", "trackIndex", "selectTrack", "(II)V", "", "language", "defaultTrackLanguage", "(Ljava/lang/String;)V", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "getSelection", "()Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "Lvmh;", CA20Status.STATUS_USER_I, "Lsls;", "Ltls;", "Z", "pendingTrackDisabling", "Lyzz0;", "getTrackGroups", "()Lyzz0;", "trackGroups", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoPlayerRendererTrackSelector implements RendererTrackSelector {
    public static final int $stable = 8;
    private final boolean allowPendingAudioTrackDisabling;
    private boolean pendingTrackDisabling;
    private final sls rendererIndex;
    private final int rendererType;
    private final tls trackSelection;
    private final vmh trackSelector;
    private final sls updateListener;

    public ExoPlayerRendererTrackSelector(vmh vmhVar, int i, sls slsVar, tls tlsVar, sls slsVar2, boolean z) {
        this.trackSelector = vmhVar;
        this.rendererType = i;
        this.rendererIndex = slsVar;
        this.trackSelection = tlsVar;
        this.updateListener = slsVar2;
        this.allowPendingAudioTrackDisabling = z;
    }

    private final CappingProvider createCappingProvider(l001 trackSelection) {
        return trackSelection instanceof CappingProvider ? (CappingProvider) trackSelection : new AnyTrackSelectionCappingProvider(trackSelection);
    }

    private final boolean isRendererEnabled() {
        omh parameters = this.trackSelector.getParameters();
        return !parameters.E.get(((Number) this.rendererIndex.invoke()).intValue());
    }

    private final void maybeDisableRendererIfQueued() {
        if (this.allowPendingAudioTrackDisabling && this.pendingTrackDisabling) {
            disableRenderer();
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracks.RendererTrackSelector
    public void defaultTrackLanguage(String language) {
        nmh buildUponParameters = this.trackSelector.buildUponParameters();
        int i = this.rendererType;
        if (i != 1) {
            if (i == 3) {
                buildUponParameters.n(language);
            }
        } else if (language == null) {
            buildUponParameters.m(new String[0]);
        } else {
            buildUponParameters.m(new String[]{language});
        }
        this.trackSelector.setParameters(buildUponParameters);
    }

    @Override // ru.yandex.video.m3.player.impl.tracks.RendererTrackSelector
    public void disableRenderer() {
        int intValue = ((Number) this.rendererIndex.invoke()).intValue();
        if (this.allowPendingAudioTrackDisabling && this.rendererType == 1 && intValue == -1) {
            this.pendingTrackDisabling = true;
            return;
        }
        nmh buildUponParameters = this.trackSelector.buildUponParameters();
        buildUponParameters.p(intValue, true);
        this.trackSelector.setParameters(buildUponParameters);
        this.updateListener.invoke();
        this.pendingTrackDisabling = false;
    }

    @Override // ru.yandex.video.m3.player.impl.tracks.RendererTrackSelector
    public RendererTrackSelector.Selection getSelection() {
        maybeDisableRendererIfQueued();
        if (!isRendererEnabled()) {
            return RendererTrackSelector.Selection.Disabled.INSTANCE;
        }
        loo looVar = (loo) this.trackSelection.invoke(this.rendererIndex.invoke());
        if (!(looVar instanceof r80 ? true : looVar instanceof sk51)) {
            return looVar != null ? new RendererTrackSelector.Selection.Track(looVar.getSelectedIndex(), looVar.getSelectedIndexInTrackGroup(), looVar.getSelectedFormat()) : RendererTrackSelector.Selection.Disabled.INSTANCE;
        }
        a selectedFormat = looVar.getSelectedFormat();
        CappingProvider createCappingProvider = createCappingProvider(looVar);
        TargetFormatAdaptiveTrackSelection targetFormatAdaptiveTrackSelection = looVar instanceof TargetFormatAdaptiveTrackSelection ? (TargetFormatAdaptiveTrackSelection) looVar : null;
        return new RendererTrackSelector.Selection.Adaptive(selectedFormat, createCappingProvider, targetFormatAdaptiveTrackSelection != null ? targetFormatAdaptiveTrackSelection.getTrackSelectionInitializationError() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r1 <= (r5.trackSelector.getCurrentMappedTrackInfo() != null ? r4.a - 1 : 0)) goto L11;
     */
    @Override // ru.yandex.video.m3.player.impl.tracks.RendererTrackSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yzz0 getTrackGroups() {
        Object invoke = this.rendererIndex.invoke();
        int intValue = ((Number) invoke).intValue();
        if (intValue >= 0) {
        }
        invoke = null;
        Integer num = (Integer) invoke;
        if (num != null) {
            int intValue2 = num.intValue();
            xv00 currentMappedTrackInfo = this.trackSelector.getCurrentMappedTrackInfo();
            yzz0 yzz0Var = currentMappedTrackInfo != null ? currentMappedTrackInfo.c[intValue2] : null;
            if (yzz0Var != null) {
                return yzz0Var;
            }
        }
        return new yzz0(new xzz0[0]);
    }

    @Override // ru.yandex.video.m3.player.impl.tracks.RendererTrackSelector
    public void selectAdaptive() {
        this.pendingTrackDisabling = false;
        int intValue = ((Number) this.rendererIndex.invoke()).intValue();
        nmh buildUponParameters = this.trackSelector.buildUponParameters();
        SparseArray sparseArray = buildUponParameters.C;
        Map map = (Map) sparseArray.get(intValue);
        if (map != null && !map.isEmpty()) {
            sparseArray.remove(intValue);
        }
        buildUponParameters.p(intValue, false);
        this.trackSelector.setParameters(buildUponParameters);
        this.updateListener.invoke();
    }

    @Override // ru.yandex.video.m3.player.impl.tracks.RendererTrackSelector
    public void selectTrack(int groupIndex, int trackIndex) {
        this.pendingTrackDisabling = false;
        int intValue = ((Number) this.rendererIndex.invoke()).intValue();
        nmh buildUponParameters = this.trackSelector.buildUponParameters();
        SparseArray sparseArray = buildUponParameters.C;
        Map map = (Map) sparseArray.get(intValue);
        if (map != null && !map.isEmpty()) {
            sparseArray.remove(intValue);
        }
        buildUponParameters.p(intValue, false);
        yzz0 trackGroups = getTrackGroups();
        qmh qmhVar = new qmh(groupIndex, trackIndex);
        SparseArray sparseArray2 = buildUponParameters.C;
        Map map2 = (Map) sparseArray2.get(intValue);
        if (map2 == null) {
            map2 = new HashMap();
            sparseArray2.put(intValue, map2);
        }
        if (!map2.containsKey(trackGroups) || !Objects.equals(map2.get(trackGroups), qmhVar)) {
            map2.put(trackGroups, qmhVar);
        }
        this.trackSelector.setParameters(buildUponParameters);
        this.updateListener.invoke();
    }
}
