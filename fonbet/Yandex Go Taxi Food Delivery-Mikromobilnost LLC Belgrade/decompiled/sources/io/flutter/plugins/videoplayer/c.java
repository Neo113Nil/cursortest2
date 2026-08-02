package io.flutter.plugins.videoplayer;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import defpackage.aq80;
import defpackage.bd2;
import defpackage.cd2;
import defpackage.d5z;
import defpackage.eg01;
import defpackage.el11;
import defpackage.g8e;
import defpackage.hlx0;
import defpackage.itr;
import defpackage.jsr;
import defpackage.nm31;
import defpackage.ny61;
import defpackage.psr;
import defpackage.r3k0;
import defpackage.ssr;
import defpackage.tsr;
import defpackage.tt5;
import defpackage.tuy0;
import defpackage.twc0;
import defpackage.um31;
import defpackage.vm31;
import defpackage.vwc0;
import defpackage.wm31;
import defpackage.wwc0;
import defpackage.xm31;
import defpackage.xuy0;
import defpackage.ye0;
import defpackage.ym31;
import defpackage.yuy0;
import defpackage.z8f;
import io.flutter.embedding.engine.renderer.f;
import io.flutter.view.TextureRegistry$SurfaceLifecycle;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public class c implements tsr, cd2 {
    public hlx0 b;
    public final LongSparseArray a = new LongSparseArray();
    public final wm31 c = new wm31();
    public long w = 1;

    public static ye0 d(z8f z8fVar) {
        String str = z8fVar.a;
        if (str.startsWith("asset:")) {
            if (str.startsWith("asset:///")) {
                return new d5z(str, 0);
            }
            ny61.g("assetUrl must start with 'asset:///'");
            return null;
        }
        int i = 1;
        if (str.startsWith("rtsp:")) {
            if (str.startsWith("rtsp://")) {
                return new d5z(str, i);
            }
            ny61.g("rtspUrl must start with 'rtsp://'");
            return null;
        }
        VideoAsset$StreamingFormat videoAsset$StreamingFormat = VideoAsset$StreamingFormat.UNKNOWN;
        PlatformVideoFormat platformVideoFormat = z8fVar.b;
        if (platformVideoFormat != null) {
            int i2 = ym31.a[platformVideoFormat.ordinal()];
            if (i2 == 1) {
                videoAsset$StreamingFormat = VideoAsset$StreamingFormat.SMOOTH;
            } else if (i2 == 2) {
                videoAsset$StreamingFormat = VideoAsset$StreamingFormat.DYNAMIC_ADAPTIVE;
            } else if (i2 == 3) {
                videoAsset$StreamingFormat = VideoAsset$StreamingFormat.HTTP_LIVE;
            }
        }
        Map map = z8fVar.c;
        return new b(str, videoAsset$StreamingFormat, new HashMap(map), z8fVar.d);
    }

    public final long a(z8f z8fVar) {
        ye0 d = d(z8fVar);
        long j = this.w;
        this.w = 1 + j;
        String l = Long.toString(j);
        hlx0 hlx0Var = this.b;
        Context context = (Context) hlx0Var.b;
        wwc0 wwc0Var = new wwc0(eg01.i((tt5) hlx0Var.c, l), d.h(), this.c, null, new vwc0(context, d, 0));
        tt5 tt5Var = (tt5) this.b.c;
        String l2 = Long.toString(j);
        vm31.A4.getClass();
        um31.b(tt5Var, wwc0Var, l2);
        wwc0Var.c = new r3k0(26, tt5Var, l2);
        this.a.put(j, wwc0Var);
        return j;
    }

    public final tuy0 b(z8f z8fVar) {
        ye0 d = d(z8fVar);
        long j = this.w;
        this.w = 1 + j;
        String l = Long.toString(j);
        xuy0 xuy0Var = (xuy0) this.b.y;
        xuy0Var.getClass();
        TextureRegistry$SurfaceProducer b = ((f) xuy0Var).b(TextureRegistry$SurfaceLifecycle.manual);
        hlx0 hlx0Var = this.b;
        yuy0 yuy0Var = new yuy0(eg01.i((tt5) hlx0Var.c, l), d.h(), this.c, b, new vwc0((Context) hlx0Var.b, d, 1));
        yuy0Var.x = true;
        b.setCallback(yuy0Var);
        Surface surface = b.getSurface();
        yuy0Var.w.setVideoSurface(surface);
        yuy0Var.x = surface == null;
        tt5 tt5Var = (tt5) this.b.c;
        String l2 = Long.toString(j);
        vm31.A4.getClass();
        um31.b(tt5Var, yuy0Var, l2);
        yuy0Var.c = new r3k0(26, tt5Var, l2);
        this.a.put(j, yuy0Var);
        return new tuy0(j, b.id());
    }

    public final String c(String str, String str2) {
        hlx0 hlx0Var = this.b;
        if (str2 == null) {
            return ((xm31) hlx0Var.w).a.c(str);
        }
        psr psrVar = ((xm31) hlx0Var.x).a;
        psrVar.getClass();
        StringBuilder sb = new StringBuilder("packages");
        String str3 = File.separator;
        return psrVar.c(g8e.r(sb, str3, str2, str3, str));
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        jsr d = jsr.d();
        Context context = ssrVar.a;
        tt5 tt5Var = ssrVar.c;
        psr psrVar = d.a;
        Objects.requireNonNull(psrVar);
        xm31 xm31Var = new xm31(psrVar);
        psr psrVar2 = d.a;
        Objects.requireNonNull(psrVar2);
        this.b = new hlx0(context, tt5Var, xm31Var, new xm31(psrVar2), ssrVar.d, 10);
        tt5 tt5Var2 = ssrVar.c;
        cd2.U0.getClass();
        bd2.b(tt5Var2, this);
        twc0 twc0Var = ssrVar.e;
        LongSparseArray longSparseArray = this.a;
        Objects.requireNonNull(longSparseArray);
        ((aq80) twc0Var).E("plugins.flutter.dev/video_player_android", new itr(new el11(15, longSparseArray)));
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        if (this.b == null) {
            Log.wtf("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        hlx0 hlx0Var = this.b;
        tt5 tt5Var = ssrVar.c;
        hlx0Var.getClass();
        cd2.U0.getClass();
        bd2.b(tt5Var, null);
        this.b = null;
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.a;
            if (i >= longSparseArray.size()) {
                longSparseArray.clear();
                return;
            } else {
                ((nm31) longSparseArray.valueAt(i)).b();
                i++;
            }
        }
    }
}
