package ru.yandex.video.m3.player.impl;

import android.content.Context;
import android.util.Pair;
import defpackage.joo;
import defpackage.koo;
import defpackage.omh;
import defpackage.vmh;
import defpackage.xv00;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJM\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000e\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\r0\f0\f2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/player/impl/TrackSelectorImpl;", "Lvmh;", "Landroid/content/Context;", "context", "Lkoo;", "trackSelectionFactory", "Lomh;", "trackSelectorParameters", "<init>", "(Landroid/content/Context;Lkoo;Lomh;)V", "Lxv00;", "mappedTrackInfo", "", "", "rendererFormatSupports", "params", "", "selectedAudioLanguage", "Landroid/util/Pair;", "Ljoo;", "", "selectTextTrack", "(Lxv00;[[[ILomh;Ljava/lang/String;)Landroid/util/Pair;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackSelectorImpl extends vmh {
    public static final int $stable = 0;

    public TrackSelectorImpl(Context context, koo kooVar, omh omhVar) {
        super(omhVar, kooVar, context);
    }

    @Override // defpackage.vmh
    public Pair<joo, Integer> selectTextTrack(xv00 mappedTrackInfo, int[][][] rendererFormatSupports, omh params, String selectedAudioLanguage) {
        return super.selectTextTrack(mappedTrackInfo, rendererFormatSupports, params, null);
    }
}
