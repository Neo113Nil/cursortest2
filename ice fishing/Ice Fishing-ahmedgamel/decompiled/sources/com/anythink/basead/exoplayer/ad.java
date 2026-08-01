package com.anythink.basead.exoplayer;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.anythink.basead.exoplayer.a.a;
import com.anythink.basead.exoplayer.b.b;
import com.anythink.basead.exoplayer.h;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.w;
import com.anythink.basead.exoplayer.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class ad implements h, w.e, w.g {

    /* renamed from: x, reason: collision with root package name */
    private static final String f6318x = "SimpleExoPlayer";

    /* renamed from: A, reason: collision with root package name */
    private final a f6319A;

    /* renamed from: B, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.anythink.basead.exoplayer.l.g> f6320B;

    /* renamed from: C, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.anythink.basead.exoplayer.g.f> f6321C;

    /* renamed from: D, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.anythink.basead.exoplayer.l.h> f6322D;

    /* renamed from: E, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.anythink.basead.exoplayer.b.g> f6323E;

    /* renamed from: F, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.a.a f6324F;

    /* renamed from: G, reason: collision with root package name */
    private m f6325G;

    /* renamed from: H, reason: collision with root package name */
    private m f6326H;

    /* renamed from: I, reason: collision with root package name */
    private Surface f6327I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f6328K;

    /* renamed from: L, reason: collision with root package name */
    private SurfaceHolder f6329L;

    /* renamed from: M, reason: collision with root package name */
    private TextureView f6330M;

    /* renamed from: N, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.d f6331N;

    /* renamed from: O, reason: collision with root package name */
    private com.anythink.basead.exoplayer.c.d f6332O;

    /* renamed from: P, reason: collision with root package name */
    private int f6333P;

    /* renamed from: Q, reason: collision with root package name */
    private com.anythink.basead.exoplayer.b.b f6334Q;

    /* renamed from: R, reason: collision with root package name */
    private float f6335R;

    /* renamed from: S, reason: collision with root package name */
    private com.anythink.basead.exoplayer.h.s f6336S;

    /* renamed from: w, reason: collision with root package name */
    protected final y[] f6337w;

    /* renamed from: y, reason: collision with root package name */
    private final h f6338y;

    /* renamed from: z, reason: collision with root package name */
    private final Handler f6339z;

    public final class a implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, com.anythink.basead.exoplayer.b.g, com.anythink.basead.exoplayer.g.f, com.anythink.basead.exoplayer.l.h {
        private a() {
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void a(com.anythink.basead.exoplayer.c.d dVar) {
            ad.this.f6331N = dVar;
            Iterator it = ad.this.f6322D.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it.next()).a(dVar);
            }
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void b(com.anythink.basead.exoplayer.c.d dVar) {
            Iterator it = ad.this.f6322D.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it.next()).b(dVar);
            }
            ad.this.f6325G = null;
            ad.this.f6331N = null;
        }

        @Override // com.anythink.basead.exoplayer.b.g
        public final void c(com.anythink.basead.exoplayer.c.d dVar) {
            ad.this.f6332O = dVar;
            Iterator it = ad.this.f6323E.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.b.g) it.next()).c(dVar);
            }
        }

        @Override // com.anythink.basead.exoplayer.b.g
        public final void d(com.anythink.basead.exoplayer.c.d dVar) {
            Iterator it = ad.this.f6323E.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.b.g) it.next()).d(dVar);
            }
            ad.this.f6326H = null;
            ad.this.f6332O = null;
            ad.this.f6333P = 0;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i6) {
            ad.this.a(new Surface(surfaceTexture), true);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ad.this.a((Surface) null, true);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i6) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i6, int i9) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            ad.this.a(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            ad.this.a((Surface) null, false);
        }

        public /* synthetic */ a(ad adVar, byte b9) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void a(String str, long j6, long j9) {
            Iterator it = ad.this.f6322D.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it.next()).a(str, j6, j9);
            }
        }

        @Override // com.anythink.basead.exoplayer.b.g
        public final void b(String str, long j6, long j9) {
            Iterator it = ad.this.f6323E.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.b.g) it.next()).b(str, j6, j9);
            }
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void a(m mVar) {
            ad.this.f6325G = mVar;
            Iterator it = ad.this.f6322D.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it.next()).a(mVar);
            }
        }

        @Override // com.anythink.basead.exoplayer.b.g
        public final void b(m mVar) {
            ad.this.f6326H = mVar;
            Iterator it = ad.this.f6323E.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.b.g) it.next()).b(mVar);
            }
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void a(int i, long j6) {
            Iterator it = ad.this.f6322D.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it.next()).a(i, j6);
            }
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void a(int i, int i6, int i9, float f3) {
            Iterator it = ad.this.f6320B.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.l.g) it.next()).a(i, i6);
            }
            Iterator it2 = ad.this.f6322D.iterator();
            while (it2.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it2.next()).a(i, i6, i9, f3);
            }
        }

        @Override // com.anythink.basead.exoplayer.l.h
        public final void a(Surface surface) {
            if (ad.this.f6327I == surface) {
                Iterator it = ad.this.f6320B.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            Iterator it2 = ad.this.f6322D.iterator();
            while (it2.hasNext()) {
                ((com.anythink.basead.exoplayer.l.h) it2.next()).a(surface);
            }
        }

        @Override // com.anythink.basead.exoplayer.b.g
        public final void a(int i) {
            ad.this.f6333P = i;
            Iterator it = ad.this.f6323E.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.b.g) it.next()).a(i);
            }
        }

        @Override // com.anythink.basead.exoplayer.b.g
        public final void a(int i, long j6, long j9) {
            Iterator it = ad.this.f6323E.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.b.g) it.next()).a(i, j6, j9);
            }
        }

        @Override // com.anythink.basead.exoplayer.g.f
        public final void a(com.anythink.basead.exoplayer.g.a aVar) {
            Iterator it = ad.this.f6321C.iterator();
            while (it.hasNext()) {
                ((com.anythink.basead.exoplayer.g.f) it.next()).a(aVar);
            }
        }
    }

    @Deprecated
    public interface b extends com.anythink.basead.exoplayer.l.g {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ad(ab abVar, com.anythink.basead.exoplayer.i.h hVar, p pVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar) {
        this(abVar, hVar, pVar, gVar, (byte) 0);
        new a.C0014a();
    }

    @Deprecated
    private int K() {
        return af.f(this.f6334Q.f6427d);
    }

    private com.anythink.basead.exoplayer.a.a L() {
        return this.f6324F;
    }

    private com.anythink.basead.exoplayer.b.b M() {
        return this.f6334Q;
    }

    private float N() {
        return this.f6335R;
    }

    private m O() {
        return this.f6325G;
    }

    private m P() {
        return this.f6326H;
    }

    private int Q() {
        return this.f6333P;
    }

    private com.anythink.basead.exoplayer.c.d R() {
        return this.f6331N;
    }

    private com.anythink.basead.exoplayer.c.d S() {
        return this.f6332O;
    }

    private void T() {
        TextureView textureView = this.f6330M;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f6319A) {
                Log.w(f6318x, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f6330M.setSurfaceTextureListener(null);
            }
            this.f6330M = null;
        }
        SurfaceHolder surfaceHolder = this.f6329L;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f6319A);
            this.f6329L = null;
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int A() {
        return this.f6338y.A();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long B() {
        return this.f6338y.B();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int C() {
        return this.f6338y.C();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final com.anythink.basead.exoplayer.h.af D() {
        return this.f6338y.D();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final com.anythink.basead.exoplayer.i.g E() {
        return this.f6338y.E();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final ae F() {
        return this.f6338y.F();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final Object G() {
        return this.f6338y.G();
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final int H() {
        return this.f6328K;
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void I() {
        a((Surface) null);
    }

    public final boolean J() {
        return d() == 3 && f();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final w.g b() {
        return this;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final w.e c() {
        return this;
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean f() {
        return this.f6338y.f();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int g() {
        return this.f6338y.g();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean h() {
        return this.f6338y.h();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean i() {
        return this.f6338y.i();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void j() {
        this.f6324F.a();
        this.f6338y.j();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final v k() {
        return this.f6338y.k();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final Object l() {
        return this.f6338y.l();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void m() {
        c(false);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void n() {
        this.f6338y.n();
        T();
        Surface surface = this.f6327I;
        if (surface != null) {
            if (this.J) {
                surface.release();
            }
            this.f6327I = null;
        }
        com.anythink.basead.exoplayer.h.s sVar = this.f6336S;
        if (sVar != null) {
            sVar.a(this.f6324F);
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int o() {
        return this.f6338y.o();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int p() {
        return this.f6338y.p();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int q() {
        return this.f6338y.q();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int r() {
        return this.f6338y.r();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long s() {
        try {
            return this.f6338y.s();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long t() {
        return this.f6338y.t();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final long u() {
        return this.f6338y.u();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int v() {
        return this.f6338y.v();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean w() {
        return this.f6338y.w();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean x() {
        return this.f6338y.x();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final boolean y() {
        return this.f6338y.y();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int z() {
        return this.f6338y.z();
    }

    public ad(ab abVar, com.anythink.basead.exoplayer.i.h hVar, p pVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, byte b9) {
        this(abVar, hVar, pVar, gVar, com.anythink.basead.exoplayer.k.c.f8365a);
    }

    @Deprecated
    private void e(int i) {
        com.anythink.basead.exoplayer.b.b a9 = new b.a().b(af.d(i)).a(af.e(i)).a();
        this.f6334Q = a9;
        for (y yVar : this.f6337w) {
            if (yVar.a() == 1) {
                this.f6338y.a(yVar).a(3).a(a9).i();
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void d(int i) {
        this.f6328K = i;
        for (y yVar : this.f6337w) {
            if (yVar.a() == 2) {
                this.f6338y.a(yVar).a(4).a(Integer.valueOf(i)).i();
            }
        }
    }

    private ad(ab abVar, com.anythink.basead.exoplayer.i.h hVar, p pVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, com.anythink.basead.exoplayer.k.c cVar) {
        a aVar = new a(this, (byte) 0);
        this.f6319A = aVar;
        this.f6320B = new CopyOnWriteArraySet<>();
        this.f6321C = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<com.anythink.basead.exoplayer.l.h> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f6322D = copyOnWriteArraySet;
        CopyOnWriteArraySet<com.anythink.basead.exoplayer.b.g> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.f6323E = copyOnWriteArraySet2;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f6339z = handler;
        y[] a9 = abVar.a(handler, aVar, aVar, aVar, gVar);
        this.f6337w = a9;
        this.f6335R = 1.0f;
        this.f6333P = 0;
        this.f6334Q = com.anythink.basead.exoplayer.b.b.f6424a;
        this.f6328K = 1;
        j jVar = new j(a9, hVar, pVar, cVar);
        this.f6338y = jVar;
        com.anythink.basead.exoplayer.a.a a10 = a.C0014a.a(jVar, cVar);
        this.f6324F = a10;
        a((w.c) a10);
        copyOnWriteArraySet.add(a10);
        copyOnWriteArraySet2.add(a10);
        a((com.anythink.basead.exoplayer.g.f) a10);
        if (gVar instanceof com.anythink.basead.exoplayer.d.d) {
            ((com.anythink.basead.exoplayer.d.d) gVar).a(handler, a10);
        }
    }

    @Deprecated
    private void c(com.anythink.basead.exoplayer.g.f fVar) {
        this.f6321C.retainAll(Collections.singleton(this.f6324F));
        if (fVar != null) {
            a(fVar);
        }
    }

    @Deprecated
    private void c(com.anythink.basead.exoplayer.l.h hVar) {
        this.f6322D.remove(hVar);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void b(Surface surface) {
        if (surface == null || surface != this.f6327I) {
            return;
        }
        a((Surface) null);
    }

    @Deprecated
    private void c(com.anythink.basead.exoplayer.b.g gVar) {
        this.f6323E.remove(gVar);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void a(Surface surface) {
        T();
        a(surface, false);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null || surfaceHolder != this.f6329L) {
            return;
        }
        a((SurfaceHolder) null);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void c(boolean z3) {
        this.f6338y.c(z3);
        com.anythink.basead.exoplayer.h.s sVar = this.f6336S;
        if (sVar != null) {
            sVar.a(this.f6324F);
            this.f6336S = null;
            this.f6324F.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.isValid() != false) goto L11;
     */
    @Override // com.anythink.basead.exoplayer.w.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(SurfaceHolder surfaceHolder) {
        Surface surface;
        T();
        this.f6329L = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.f6319A);
            surface = surfaceHolder.getSurface();
            if (surface != null) {
            }
        }
        surface = null;
        a(surface, false);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void b(SurfaceView surfaceView) {
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        if (holder == null || holder != this.f6329L) {
            return;
        }
        a((SurfaceHolder) null);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int d() {
        return this.f6338y.d();
    }

    @Deprecated
    private void d(com.anythink.basead.exoplayer.g.f fVar) {
        this.f6321C.remove(fVar);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void b(TextureView textureView) {
        if (textureView == null || textureView != this.f6330M) {
            return;
        }
        a((TextureView) null);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final int c(int i) {
        return this.f6338y.c(i);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void a(SurfaceView surfaceView) {
        a(surfaceView == null ? null : surfaceView.getHolder());
    }

    private void b(com.anythink.basead.exoplayer.a.b bVar) {
        this.f6324F.b(bVar);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void a(TextureView textureView) {
        T();
        this.f6330M = textureView;
        Surface surface = null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                Log.w(f6318x, "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.f6319A);
            SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
            if (surfaceTexture != null) {
                surface = new Surface(surfaceTexture);
            }
        }
        a(surface, true);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final g e() {
        return this.f6338y.e();
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void b(com.anythink.basead.exoplayer.l.g gVar) {
        this.f6320B.remove(gVar);
    }

    @Deprecated
    private void b(b bVar) {
        b((com.anythink.basead.exoplayer.l.g) bVar);
    }

    private void b(com.anythink.basead.exoplayer.g.f fVar) {
        this.f6321C.remove(fVar);
    }

    @Deprecated
    private void b(com.anythink.basead.exoplayer.l.h hVar) {
        this.f6322D.add(hVar);
    }

    @Deprecated
    private void b(com.anythink.basead.exoplayer.b.g gVar) {
        this.f6323E.add(gVar);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(w.c cVar) {
        this.f6338y.b(cVar);
    }

    private void a(com.anythink.basead.exoplayer.a.b bVar) {
        this.f6324F.a(bVar);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(boolean z3) {
        this.f6338y.b(z3);
    }

    private void a(com.anythink.basead.exoplayer.b.b bVar) {
        this.f6334Q = bVar;
        for (y yVar : this.f6337w) {
            if (yVar.a() == 1) {
                this.f6338y.a(yVar).a(3).a(bVar).i();
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void b(int i) {
        this.f6324F.a();
        this.f6338y.b(i);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void b(h.c... cVarArr) {
        this.f6338y.b(cVarArr);
    }

    public final void a(float f3) {
        this.f6335R = f3;
        for (y yVar : this.f6337w) {
            if (yVar.a() == 1) {
                this.f6338y.a(yVar).a(2).a(Float.valueOf(f3)).i();
            }
        }
    }

    @Deprecated
    private void a(PlaybackParams playbackParams) {
        v vVar;
        if (playbackParams != null) {
            playbackParams.allowDefaults();
            vVar = new v(playbackParams.getSpeed(), playbackParams.getPitch());
        } else {
            vVar = null;
        }
        a(vVar);
    }

    @Override // com.anythink.basead.exoplayer.w.g
    public final void a(com.anythink.basead.exoplayer.l.g gVar) {
        this.f6320B.add(gVar);
    }

    @Deprecated
    private void a(b bVar) {
        this.f6320B.clear();
        if (bVar != null) {
            a((com.anythink.basead.exoplayer.l.g) bVar);
        }
    }

    private void a(com.anythink.basead.exoplayer.g.f fVar) {
        this.f6321C.add(fVar);
    }

    @Deprecated
    private void a(com.anythink.basead.exoplayer.l.h hVar) {
        this.f6322D.retainAll(Collections.singleton(this.f6324F));
        if (hVar != null) {
            this.f6322D.add(hVar);
        }
    }

    @Deprecated
    private void a(com.anythink.basead.exoplayer.b.g gVar) {
        this.f6323E.retainAll(Collections.singleton(this.f6324F));
        if (gVar != null) {
            this.f6323E.add(gVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.h
    public final Looper a() {
        return this.f6338y.a();
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(w.c cVar) {
        this.f6338y.a(cVar);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(com.anythink.basead.exoplayer.h.s sVar) {
        a(sVar, true, true);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(com.anythink.basead.exoplayer.h.s sVar, boolean z3, boolean z6) {
        com.anythink.basead.exoplayer.h.s sVar2 = this.f6336S;
        if (sVar2 != sVar) {
            if (sVar2 != null) {
                sVar2.a(this.f6324F);
                this.f6324F.b();
            }
            sVar.a(this.f6339z, this.f6324F);
            this.f6336S = sVar;
        }
        this.f6338y.a(sVar, z3, z6);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(boolean z3) {
        this.f6338y.a(z3);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(int i) {
        this.f6338y.a(i);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(long j6) {
        this.f6324F.a();
        this.f6338y.a(j6);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(int i, long j6) {
        this.f6324F.a();
        this.f6338y.a(i, j6);
    }

    @Override // com.anythink.basead.exoplayer.w
    public final void a(v vVar) {
        this.f6338y.a(vVar);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(ac acVar) {
        this.f6338y.a(acVar);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final void a(h.c... cVarArr) {
        this.f6338y.a(cVarArr);
    }

    @Override // com.anythink.basead.exoplayer.h
    public final x a(x.b bVar) {
        return this.f6338y.a(bVar);
    }

    private static h a(y[] yVarArr, com.anythink.basead.exoplayer.i.h hVar, p pVar, com.anythink.basead.exoplayer.k.c cVar) {
        return new j(yVarArr, hVar, pVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Surface surface, boolean z3) {
        ArrayList arrayList = new ArrayList();
        for (y yVar : this.f6337w) {
            if (yVar.a() == 2) {
                arrayList.add(this.f6338y.a(yVar).a(1).a(surface).i());
            }
        }
        Surface surface2 = this.f6327I;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((x) it.next()).k();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f6338y.c(false);
            }
            if (this.J) {
                this.f6327I.release();
            }
        }
        this.f6327I = surface;
        this.J = z3;
    }
}
