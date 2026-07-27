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
    protected b f10832a;

    /* renamed from: b, reason: collision with root package name */
    protected Runnable f10833b;

    /* renamed from: c, reason: collision with root package name */
    protected c.a f10834c;

    /* renamed from: d, reason: collision with root package name */
    private long f10835d;

    /* renamed from: e, reason: collision with root package name */
    private long f10836e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10837f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10838g;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10840a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10841b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10842c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f10843d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f10844e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f10845f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f10846g = 7;

        /* renamed from: h, reason: collision with root package name */
        public static final int f10847h = 8;
        public static final int i = 9;

        /* renamed from: j, reason: collision with root package name */
        public static final int f10848j = 10;

        /* renamed from: k, reason: collision with root package name */
        public static final int f10849k = 11;

        /* renamed from: l, reason: collision with root package name */
        public static final int f10850l = 12;

        /* renamed from: m, reason: collision with root package name */
        public static final int f10851m = 13;

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

    public abstract void a(int i, int i6);

    public void b() {
    }

    public final void c() {
        if (this.f10832a == null || this.f10837f || !canStartNextAnim()) {
            return;
        }
        this.f10837f = true;
        this.f10832a.a();
        b();
    }

    public boolean canStartNextAnim() {
        return true;
    }

    public void init(long j6, int i, int i6, c.a aVar, b bVar) {
        this.f10835d = j6;
        this.f10834c = aVar;
        this.f10832a = bVar;
        this.f10837f = false;
        this.f10833b = new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View.1
            @Override // java.lang.Runnable
            public final void run() {
                BaseG2CV2View.this.c();
            }
        };
        a(i, i6);
    }

    public void pauseAnimPlay() {
        if (this.f10838g) {
            this.f10838g = false;
            long j6 = this.f10835d;
            if (j6 > 0) {
                this.f10835d = Math.max(j6 - (SystemClock.elapsedRealtime() - this.f10836e), 0L);
            }
            t.b().d(this.f10833b);
            b();
        }
    }

    public void release() {
    }

    public void resumeAnimPlay() {
        if (this.f10838g) {
            return;
        }
        this.f10838g = true;
        this.f10836e = SystemClock.elapsedRealtime();
        if (this.f10835d <= 0) {
            this.f10832a.a();
        } else {
            a();
            t.b().a(this.f10833b, this.f10835d);
        }
    }

    public BaseG2CV2View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseG2CV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10835d = f.f7187a;
        this.f10838g = false;
    }
}
