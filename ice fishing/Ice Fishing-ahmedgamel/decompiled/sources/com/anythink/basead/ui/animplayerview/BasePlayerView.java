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
    private int f10457a;
    protected long i;

    /* renamed from: j, reason: collision with root package name */
    protected long f10458j;

    /* renamed from: k, reason: collision with root package name */
    protected int f10459k;

    /* renamed from: l, reason: collision with root package name */
    protected int f10460l;

    /* renamed from: m, reason: collision with root package name */
    protected int f10461m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f10462n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f10463o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f10464p;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f10465q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f10466r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f10467s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f10468t;

    /* renamed from: u, reason: collision with root package name */
    protected Thread f10469u;

    /* renamed from: v, reason: collision with root package name */
    protected Handler f10470v;

    /* renamed from: w, reason: collision with root package name */
    protected a f10471w;

    /* renamed from: x, reason: collision with root package name */
    protected w f10472x;

    /* renamed from: y, reason: collision with root package name */
    protected x f10473y;

    /* renamed from: z, reason: collision with root package name */
    protected boolean f10474z;

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
        this.i = com.anythink.basead.exoplayer.f.f7187a;
        this.f10458j = -1L;
        this.f10466r = false;
        this.f10467s = false;
        this.f10468t = false;
        this.f10474z = false;
    }

    public void a(f fVar) {
        a aVar = this.f10471w;
        if (aVar != null) {
            aVar.a(fVar);
        }
        this.f10471w = null;
    }

    public final void b(f fVar) {
        a aVar = this.f10471w;
        if (aVar != null) {
            aVar.a(fVar);
        }
        if (this.f10474z) {
            return;
        }
        this.f10471w = null;
    }

    public abstract long getCurrentPosition();

    public abstract long getVideoLength();

    public int getViewType() {
        return this.f10457a;
    }

    public final void h() {
        this.f10471w = null;
    }

    public abstract boolean hasVideo();

    public void init(w wVar, x xVar, boolean z3, List<Bitmap> list, e eVar) {
        this.f10472x = wVar;
        this.f10473y = xVar;
    }

    public abstract boolean isMute();

    public boolean isPlayCompletion() {
        return this.f10468t;
    }

    public abstract boolean isPlaying();

    public abstract void pause();

    public void rePlayVideo() {
    }

    public void release(int i) {
    }

    public abstract void setListener(a aVar);

    public abstract void setMute(boolean z3);

    public void setNeedInterruptRelease(boolean z3) {
        this.f10474z = z3;
    }

    public void setViewType(int i) {
        this.f10457a = i;
    }

    public abstract void start();

    public abstract void stop();

    public BasePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = com.anythink.basead.exoplayer.f.f7187a;
        this.f10458j = -1L;
        this.f10466r = false;
        this.f10467s = false;
        this.f10468t = false;
        this.f10474z = false;
    }

    public BasePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = com.anythink.basead.exoplayer.f.f7187a;
        this.f10458j = -1L;
        this.f10466r = false;
        this.f10467s = false;
        this.f10468t = false;
        this.f10474z = false;
    }
}
