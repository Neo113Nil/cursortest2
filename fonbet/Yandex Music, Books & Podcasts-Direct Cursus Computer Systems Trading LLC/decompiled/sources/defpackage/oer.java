package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.Decoder;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.ViewPortState;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.AudioTrack;
import ru.yandex.video.m3.player.impl.tracking.event.PlaybackState;
import ru.yandex.video.m3.player.impl.tracking.event.VideoTrack;
import ru.yandex.video.m3.player.tracking.FullscreenInfo;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.utils.network.NetworkType;

/* loaded from: classes6.dex */
public final class oer {
    public final paw a;
    public final ihs b;
    public final qku c;
    public final j6e d;
    public final l2j e;
    public final mvt f;
    public final dyc g;
    public final bnd h;
    public final nur i;
    public final rgu j;
    public final bnd k;
    public final s5g l;
    public PlaybackState m;
    public int n;
    public bh3 o;
    public Long p;
    public LinkedHashMap q;
    public StalledReason r;
    public final g8c s;
    public volatile PlayerState t;

    public oer(paw pawVar, ujl ujlVar, ihs ihsVar, qku qkuVar, j6e j6eVar, l2j l2jVar, mvt mvtVar, dyc dycVar, bnd bndVar, nur nurVar, rgu rguVar, bnd bndVar2) {
        mvtVar.getClass();
        bndVar.getClass();
        nurVar.getClass();
        this.a = pawVar;
        this.b = ihsVar;
        this.c = qkuVar;
        this.d = j6eVar;
        this.e = l2jVar;
        this.f = mvtVar;
        this.g = dycVar;
        this.h = bndVar;
        this.i = nurVar;
        this.j = rguVar;
        this.k = bndVar2;
        this.l = new s5g();
        this.m = PlaybackState.PAUSE;
        iyn g = pawVar.g();
        g.getClass();
        g8c g8cVar = new g8c();
        g8cVar.a = g8c.l(g);
        this.s = g8cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x017e, code lost:
    
        if (r15 > (-1)) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0198, code lost:
    
        if (r24 > (-1)) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PlayerState a() {
        Size o;
        Size size;
        boolean z;
        TrackVariant trackVariant;
        TrackVariant.Variant variant;
        VideoTrack videoTrack;
        PlaybackStats j;
        Long l;
        Long l2;
        Long valueOf;
        paw pawVar;
        boolean z2;
        rgu rguVar;
        Decoder audioDecoder;
        Decoder videoDecoder;
        isb b;
        isb b2;
        Object next;
        paw pawVar2 = this.a;
        nqs x = pawVar2.x();
        TrackVariant c = x != null ? ((jsb) x).c() : null;
        nqs x2 = pawVar2.x();
        List a = x2 != null ? ((jsb) x2).a() : null;
        if (c instanceof TrackVariant.Adaptive) {
            su3 cappingProvider = ((TrackVariant.Adaptive) c).getCappingProvider();
            if (cappingProvider != null) {
                o = cappingProvider.c();
                size = o;
            }
            size = null;
        } else {
            if (c instanceof TrackVariant.Variant) {
                TrackVariant.Variant variant2 = (TrackVariant.Variant) c;
                o = v3g.o(((isb) variant2.getFormat()).f, ((isb) variant2.getFormat()).g);
                size = o;
            }
            size = null;
        }
        Boolean valueOf2 = c != null ? Boolean.valueOf(c instanceof TrackVariant.Adaptive) : null;
        if (a != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : a) {
                TrackVariant trackVariant2 = (TrackVariant) obj;
                if (!(trackVariant2 instanceof TrackVariant.Adaptive) && !(trackVariant2 instanceof TrackVariant.Disable)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == 1) {
                z = true;
                Boolean valueOf3 = valueOf2 == null ? Boolean.valueOf(valueOf2.booleanValue() || z) : null;
                if (a == null) {
                    Iterator it = a.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            TrackVariant trackVariant3 = (TrackVariant) next;
                            int i = trackVariant3 instanceof TrackVariant.Variant ? ((isb) ((TrackVariant.Variant) trackVariant3).getFormat()).g : 0;
                            do {
                                Object next2 = it.next();
                                TrackVariant trackVariant4 = (TrackVariant) next2;
                                int i2 = trackVariant4 instanceof TrackVariant.Variant ? ((isb) ((TrackVariant.Variant) trackVariant4).getFormat()).g : 0;
                                if (i < i2) {
                                    next = next2;
                                    i = i2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    trackVariant = (TrackVariant) next;
                } else {
                    trackVariant = null;
                }
                variant = !(trackVariant instanceof TrackVariant.Variant) ? (TrackVariant.Variant) trackVariant : null;
                if (variant == null) {
                    isb isbVar = (isb) variant.getFormat();
                    videoTrack = new VideoTrack(isbVar.f, isbVar.g, isbVar.h);
                } else {
                    videoTrack = null;
                }
                nqs x3 = pawVar2.x();
                VideoTrack videoTrack2 = (x3 != null || (b2 = ((jsb) x3).b()) == null) ? null : new VideoTrack(b2.f, b2.g, b2.h);
                nqs f = pawVar2.f();
                AudioTrack audioTrack = (f != null || (b = ((jsb) f).b()) == null) ? null : new AudioTrack(b.b, b.h);
                j = pawVar2.j();
                float volume = pawVar2.getVolume();
                float h = pawVar2.h();
                long currentTimeMillis = System.currentTimeMillis();
                boolean i3 = this.d.i();
                long a2 = this.c.b.a();
                if (j != null) {
                    long playbackPosition = j.getPlaybackPosition();
                    l = Long.valueOf(playbackPosition);
                }
                l = null;
                long remainingBufferedTime = j == null ? j.getRemainingBufferedTime() : 0L;
                if (j != null) {
                    long windowDuration = j.getWindowDuration();
                    l2 = Long.valueOf(windowDuration);
                }
                l2 = null;
                VideoType videoType = j == null ? j.getVideoType() : null;
                int i4 = this.n;
                long a3 = this.b.a();
                bh3 bh3Var = this.o;
                Integer valueOf4 = bh3Var == null ? Integer.valueOf(bh3Var.i()) : null;
                bh3 bh3Var2 = this.o;
                Integer valueOf5 = bh3Var2 == null ? Integer.valueOf(bh3Var2.f()) : null;
                PlaybackState playbackState = this.m;
                Long l3 = this.p;
                valueOf = j == null ? Long.valueOf(j.getLiveOffset()) : null;
                if (valueOf != null && valueOf.longValue() == -9223372036854775807L) {
                    valueOf = null;
                }
                if (j == null) {
                    pawVar = pawVar2;
                    z2 = Intrinsics.d(j.getIsInLive(), Boolean.TRUE);
                } else {
                    pawVar = pawVar2;
                    z2 = false;
                }
                StalledReason stalledReason = this.r;
                NetworkType d = this.e.d();
                this.f.getClass();
                FullscreenInfo fullscreenInfo = this.g.c;
                Size size2 = (Size) this.h.b;
                bnd bndVar = this.k;
                Size size3 = bndVar == null ? (Size) bndVar.b : null;
                Long valueOf6 = j == null ? Long.valueOf(j.getLiveEdgePosition()) : null;
                Integer num = (Integer) this.i.c;
                long uptimeMillis = SystemClock.uptimeMillis();
                long maxTargetBufferMs = j == null ? j.getMaxTargetBufferMs() : 0L;
                rguVar = this.j;
                if (rguVar != null || (r1 = rguVar.a()) == null) {
                    ViewPortState viewPortState = ViewPortState.DEFAULT;
                }
                return new PlayerState(currentTimeMillis, null, i3, a2, l, remainingBufferedTime, l2, videoTrack2, videoTrack, size, videoType, valueOf3, i4, a3, valueOf4, valueOf5, playbackState, audioTrack, l3, valueOf, z2, stalledReason, d, null, null, fullscreenInfo, size2, valueOf6, num, uptimeMillis, maxTargetBufferMs, viewPortState, volume, h, size3, j == null ? j.getActualLiveOffset() : null, !Intrinsics.d(pawVar.g(), fyn.a), (Integer) this.s.a, this.q, pawVar.A(), j == null ? j.getExoPlayerPlaybackState() : null, (j != null || (videoDecoder = j.getVideoDecoder()) == null) ? null : videoDecoder.getName(), (j != null || (audioDecoder = j.getAudioDecoder()) == null) ? null : audioDecoder.getName());
            }
        }
        z = false;
        if (valueOf2 == null) {
        }
        if (a == null) {
        }
        if (!(trackVariant instanceof TrackVariant.Variant)) {
        }
        if (variant == null) {
        }
        nqs x32 = pawVar2.x();
        if (x32 != null) {
        }
        nqs f2 = pawVar2.f();
        if (f2 != null) {
        }
        j = pawVar2.j();
        float volume2 = pawVar2.getVolume();
        float h2 = pawVar2.h();
        long currentTimeMillis2 = System.currentTimeMillis();
        boolean i32 = this.d.i();
        long a22 = this.c.b.a();
        if (j != null) {
        }
        l = null;
        if (j == null) {
        }
        if (j != null) {
        }
        l2 = null;
        if (j == null) {
        }
        int i42 = this.n;
        long a32 = this.b.a();
        bh3 bh3Var3 = this.o;
        if (bh3Var3 == null) {
        }
        bh3 bh3Var22 = this.o;
        if (bh3Var22 == null) {
        }
        PlaybackState playbackState2 = this.m;
        Long l32 = this.p;
        if (j == null) {
        }
        if (valueOf != null) {
            valueOf = null;
        }
        if (j == null) {
        }
        StalledReason stalledReason2 = this.r;
        NetworkType d2 = this.e.d();
        this.f.getClass();
        FullscreenInfo fullscreenInfo2 = this.g.c;
        Size size22 = (Size) this.h.b;
        bnd bndVar2 = this.k;
        if (bndVar2 == null) {
        }
        if (j == null) {
        }
        Integer num2 = (Integer) this.i.c;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (j == null) {
        }
        rguVar = this.j;
        if (rguVar != null) {
        }
        ViewPortState viewPortState2 = ViewPortState.DEFAULT;
        return new PlayerState(currentTimeMillis2, null, i32, a22, l, remainingBufferedTime, l2, videoTrack2, videoTrack, size, videoType, valueOf3, i42, a32, valueOf4, valueOf5, playbackState2, audioTrack, l32, valueOf, z2, stalledReason2, d2, null, null, fullscreenInfo2, size22, valueOf6, num2, uptimeMillis2, maxTargetBufferMs, viewPortState2, volume2, h2, size3, j == null ? j.getActualLiveOffset() : null, !Intrinsics.d(pawVar.g(), fyn.a), (Integer) this.s.a, this.q, pawVar.A(), j == null ? j.getExoPlayerPlaybackState() : null, (j != null || (videoDecoder = j.getVideoDecoder()) == null) ? null : videoDecoder.getName(), (j != null || (audioDecoder = j.getAudioDecoder()) == null) ? null : audioDecoder.getName());
    }
}
