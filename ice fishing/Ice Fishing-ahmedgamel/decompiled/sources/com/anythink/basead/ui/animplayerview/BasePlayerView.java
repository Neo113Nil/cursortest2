package com.anythink.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.anythink.basead.d.f;
import com.anythink.basead.j.e;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BasePlayerView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f11243a;
    protected long i;

    /* renamed from: j, reason: collision with root package name */
    protected long f11244j;

    /* renamed from: k, reason: collision with root package name */
    protected int f11245k;

    /* renamed from: l, reason: collision with root package name */
    protected int f11246l;

    /* renamed from: m, reason: collision with root package name */
    protected int f11247m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f11248n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f11249o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f11250p;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f11251q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f11252r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f11253s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f11254t;

    /* renamed from: u, reason: collision with root package name */
    protected Thread f11255u;

    /* renamed from: v, reason: collision with root package name */
    protected Handler f11256v;

    /* renamed from: w, reason: collision with root package name */
    protected a f11257w;

    /* renamed from: x, reason: collision with root package name */
    protected w f11258x;

    /* renamed from: y, reason: collision with root package name */
    protected x f11259y;

    /* renamed from: z, reason: collision with root package name */
    protected boolean f11260z;

    public interface a {
        void a();

        void a(int i);

        void a(long j6);

        void a(f fVar);

        void b();

        void b(int i);

        void b(long j6);

        void c();

        void d();

        void e();

        void f();
    }

    public BasePlayerView(Context context) {
        super(context);
        this.i = com.anythink.basead.exoplayer.f.f7973a;
        this.f11244j = -1L;
        this.f11252r = false;
        this.f11253s = false;
        this.f11254t = false;
        this.f11260z = false;
    }

    public void a(f fVar) {
        a aVar = this.f11257w;
        if (aVar != null) {
            aVar.a(fVar);
        }
        this.f11257w = null;
    }

    public final void b(f fVar) {
        a aVar = this.f11257w;
        if (aVar != null) {
            aVar.a(fVar);
        }
        if (this.f11260z) {
            return;
        }
        this.f11257w = null;
    }

    public abstract long getCurrentPosition();

    public abstract long getVideoLength();

    public int getViewType() {
        return this.f11243a;
    }

    public final void h() {
        this.f11257w = null;
    }

    public abstract boolean hasVideo();

    public void init(w wVar, x xVar, boolean z6, List<Bitmap> list, e eVar) {
        this.f11258x = wVar;
        this.f11259y = xVar;
    }

    public abstract boolean isMute();

    public boolean isPlayCompletion() {
        return this.f11254t;
    }

    public abstract boolean isPlaying();

    public abstract void pause();

    public void rePlayVideo() {
    }

    public void release(int i) {
    }

    public abstract void setListener(a aVar);

    public abstract void setMute(boolean z6);

    public void setNeedInterruptRelease(boolean z6) {
        this.f11260z = z6;
    }

    public void setViewType(int i) {
        this.f11243a = i;
    }

    public abstract void start();

    public abstract void stop();

    public BasePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = com.anythink.basead.exoplayer.f.f7973a;
        this.f11244j = -1L;
        this.f11252r = false;
        this.f11253s = false;
        this.f11254t = false;
        this.f11260z = false;
    }

    public BasePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = com.anythink.basead.exoplayer.f.f7973a;
        this.f11244j = -1L;
        this.f11252r = false;
        this.f11253s = false;
        this.f11254t = false;
        this.f11260z = false;
    }
}
