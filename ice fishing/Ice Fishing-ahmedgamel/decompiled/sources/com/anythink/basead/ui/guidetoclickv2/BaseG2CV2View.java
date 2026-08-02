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
    protected b f11618a;

    /* renamed from: b, reason: collision with root package name */
    protected Runnable f11619b;

    /* renamed from: c, reason: collision with root package name */
    protected c.a f11620c;

    /* renamed from: d, reason: collision with root package name */
    private long f11621d;

    /* renamed from: e, reason: collision with root package name */
    private long f11622e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11623f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11624g;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f11626a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f11627b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f11628c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f11629d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f11630e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f11631f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f11632g = 7;

        /* renamed from: h, reason: collision with root package name */
        public static final int f11633h = 8;
        public static final int i = 9;

        /* renamed from: j, reason: collision with root package name */
        public static final int f11634j = 10;

        /* renamed from: k, reason: collision with root package name */
        public static final int f11635k = 11;

        /* renamed from: l, reason: collision with root package name */
        public static final int f11636l = 12;

        /* renamed from: m, reason: collision with root package name */
        public static final int f11637m = 13;

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
        if (this.f11618a == null || this.f11623f || !canStartNextAnim()) {
            return;
        }
        this.f11623f = true;
        this.f11618a.a();
        b();
    }

    public boolean canStartNextAnim() {
        return true;
    }

    public void init(long j6, int i, int i4, c.a aVar, b bVar) {
        this.f11621d = j6;
        this.f11620c = aVar;
        this.f11618a = bVar;
        this.f11623f = false;
        this.f11619b = new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View.1
            @Override // java.lang.Runnable
            public final void run() {
                BaseG2CV2View.this.c();
            }
        };
        a(i, i4);
    }

    public void pauseAnimPlay() {
        if (this.f11624g) {
            this.f11624g = false;
            long j6 = this.f11621d;
            if (j6 > 0) {
                this.f11621d = Math.max(j6 - (SystemClock.elapsedRealtime() - this.f11622e), 0L);
            }
            t.b().d(this.f11619b);
            b();
        }
    }

    public void release() {
    }

    public void resumeAnimPlay() {
        if (this.f11624g) {
            return;
        }
        this.f11624g = true;
        this.f11622e = SystemClock.elapsedRealtime();
        if (this.f11621d <= 0) {
            this.f11618a.a();
        } else {
            a();
            t.b().a(this.f11619b, this.f11621d);
        }
    }

    public BaseG2CV2View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseG2CV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11621d = f.f7973a;
        this.f11624g = false;
    }
}
