package com.anythink.basead.ui.guidetoclickv2;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.anythink.basead.exoplayer.f;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public abstract class BaseG2CV2View extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected b f10989a;

    /* renamed from: b, reason: collision with root package name */
    protected Runnable f10990b;

    /* renamed from: c, reason: collision with root package name */
    protected c.a f10991c;

    /* renamed from: d, reason: collision with root package name */
    private long f10992d;

    /* renamed from: e, reason: collision with root package name */
    private long f10993e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10994f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10995g;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10997a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10998b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10999c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f11000d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f11001e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f11002f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f11003g = 7;

        /* renamed from: h, reason: collision with root package name */
        public static final int f11004h = 8;
        public static final int i = 9;

        /* renamed from: j, reason: collision with root package name */
        public static final int f11005j = 10;

        /* renamed from: k, reason: collision with root package name */
        public static final int f11006k = 11;

        /* renamed from: l, reason: collision with root package name */
        public static final int f11007l = 12;

        /* renamed from: m, reason: collision with root package name */
        public static final int f11008m = 13;

        private a() {
        }
    }

    public interface b {
        void a();

        void b();
    }

    public BaseG2CV2View(Context context) {
        this(context, null);
    }

    public void a() {
    }

    public abstract void a(int i, int i4);

    public void b() {
    }

    public final void c() {
        if (this.f10989a == null || this.f10994f || !canStartNextAnim()) {
            return;
        }
        this.f10994f = true;
        this.f10989a.a();
        b();
    }

    public boolean canStartNextAnim() {
        return true;
    }

    public void init(long j9, int i, int i4, c.a aVar, b bVar) {
        this.f10992d = j9;
        this.f10991c = aVar;
        this.f10989a = bVar;
        this.f10994f = false;
        this.f10990b = new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View.1
            @Override // java.lang.Runnable
            public final void run() {
                BaseG2CV2View.this.c();
            }
        };
        a(i, i4);
    }

    public void pauseAnimPlay() {
        if (this.f10995g) {
            this.f10995g = false;
            long j9 = this.f10992d;
            if (j9 > 0) {
                this.f10992d = Math.max(j9 - (SystemClock.elapsedRealtime() - this.f10993e), 0L);
            }
            t.b().d(this.f10990b);
            b();
        }
    }

    public void release() {
    }

    public void resumeAnimPlay() {
        if (this.f10995g) {
            return;
        }
        this.f10995g = true;
        this.f10993e = SystemClock.elapsedRealtime();
        if (this.f10992d <= 0) {
            this.f10989a.a();
        } else {
            a();
            t.b().a(this.f10990b, this.f10992d);
        }
    }

    public BaseG2CV2View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseG2CV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10992d = f.f7344a;
        this.f10995g = false;
    }
}
