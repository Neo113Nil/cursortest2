package com.anythink.basead.ui.c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.ui.CountDownView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.d;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.a.f;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    Context f11396a;

    /* renamed from: b, reason: collision with root package name */
    w f11397b;

    /* renamed from: c, reason: collision with root package name */
    x f11398c;

    /* renamed from: d, reason: collision with root package name */
    c.a f11399d;

    /* renamed from: f, reason: collision with root package name */
    int f11401f;

    /* renamed from: g, reason: collision with root package name */
    ViewGroup f11402g;

    /* renamed from: h, reason: collision with root package name */
    d.a f11403h;
    Handler i;

    /* renamed from: k, reason: collision with root package name */
    protected Thread f11405k;

    /* renamed from: l, reason: collision with root package name */
    protected long f11406l;

    /* renamed from: m, reason: collision with root package name */
    protected long f11407m;

    /* renamed from: n, reason: collision with root package name */
    protected CountDownView f11408n;

    /* renamed from: p, reason: collision with root package name */
    private f.b f11410p;

    /* renamed from: o, reason: collision with root package name */
    private final String f11409o = getClass().getSimpleName();

    /* renamed from: j, reason: collision with root package name */
    protected boolean f11404j = false;

    /* renamed from: e, reason: collision with root package name */
    c.a f11400e = new c.a() { // from class: com.anythink.basead.ui.c.a.1
        @Override // com.anythink.basead.ui.improveclick.c.a
        public final void a(int i, int i4) {
            CountDownView countDownView = a.this.f11408n;
            if (countDownView != null) {
                countDownView.setClickViewAlpha(1.0d);
            }
            if (a.this.b() != null && (a.this.b() instanceof com.anythink.basead.ui.b)) {
                ((com.anythink.basead.ui.b) a.this.b()).setClickViewAlpha(1.0d);
            }
            c.a aVar = a.this.f11399d;
            if (aVar != null) {
                aVar.a(i, i4);
            }
        }
    };

    /* renamed from: com.anythink.basead.ui.c.a$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (true) {
                a aVar = a.this;
                if (!aVar.f11404j) {
                    return;
                }
                if (aVar.f11402g != null && (aVar.f().getParent() instanceof View) && a.this.f11410p.a((View) a.this.f().getParent(), a.this.f(), 50, 0)) {
                    Handler handler = a.this.i;
                    if (handler != null) {
                        try {
                            handler.sendEmptyMessage(1);
                        } catch (Throwable unused) {
                        }
                        try {
                            Thread.sleep(200L);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    } else {
                        try {
                            Thread.sleep(10L);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    a aVar2 = a.this;
                    long j6 = aVar2.f11406l;
                    if (j6 >= aVar2.f11407m) {
                        aVar2.c();
                    } else {
                        aVar2.f11406l = j6 + 200;
                    }
                } else {
                    try {
                        Thread.sleep(1000L);
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
            }
        }
    }

    public a(Context context, w wVar, x xVar, c.a aVar, int i, ViewGroup viewGroup) {
        this.f11396a = context.getApplicationContext();
        this.f11397b = wVar;
        this.f11398c = xVar;
        this.f11399d = aVar;
        this.f11401f = i;
        this.f11402g = viewGroup;
        this.f11410p = new f.b((wVar == null || wVar.r() == null) ? 1 : wVar.r().bO());
        this.i = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.c.a.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                a aVar2 = a.this;
                aVar2.a(aVar2.f11406l);
            }
        };
    }

    private void c(long j6) {
        if (this.f11405k != null) {
            return;
        }
        this.f11406l = 0L;
        this.f11407m = j6;
        this.f11404j = true;
        Thread thread = new Thread(new AnonymousClass3());
        this.f11405k = thread;
        thread.setName("anythink_type_endcard_improve_progress");
        this.f11405k.start();
    }

    private View g() {
        d.a aVar = this.f11403h;
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    private void h() {
        if (b() != null) {
            am.a(b());
        }
    }

    private void i() {
        View b9 = b();
        if (b9 == null || this.f11408n == null) {
            return;
        }
        ((ViewGroup) b9.getParent()).addView(this.f11408n, b9.getLayoutParams());
        if (b() != null) {
            am.a(b());
        }
    }

    public void a() {
    }

    public final View b() {
        d.a aVar = this.f11403h;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public void d() {
    }

    public final void e() {
        c();
    }

    public View f() {
        return this.f11402g;
    }

    public void a(ViewGroup viewGroup) {
        if (com.anythink.basead.b.e.e(this.f11397b, this.f11398c)) {
            return;
        }
        a(false);
    }

    public final void b(long j6) {
        View b9 = b();
        if (j6 > 0) {
            j6 = Math.min(j6, 30L);
        } else if (j6 < 0) {
            j6 = Math.max(j6, -30L);
        }
        long j9 = j6 * 1000;
        if (b9 != null) {
            CountDownView countDownView = new CountDownView(this.f11396a);
            this.f11408n = countDownView;
            Context context = this.f11396a;
            countDownView.setCountDownEndDrawable(am.a(context, q.a(context, "myoffer_base_close_icon", k.f20419c)));
            this.f11408n.setDuration(Math.abs(j9));
            if (Math.abs(j9) > 0) {
                long abs = Math.abs(j9);
                if (this.f11405k == null) {
                    this.f11406l = 0L;
                    this.f11407m = abs;
                    this.f11404j = true;
                    Thread thread = new Thread(new AnonymousClass3());
                    this.f11405k = thread;
                    thread.setName("anythink_type_endcard_improve_progress");
                    this.f11405k.start();
                }
            } else {
                a(0L);
            }
            if (j9 >= 0) {
                this.f11408n.setVisibility(0);
            } else {
                this.f11408n.setVisibility(8);
            }
            View b10 = b();
            if (b10 == null || this.f11408n == null) {
                return;
            }
            ((ViewGroup) b10.getParent()).addView(this.f11408n, b10.getLayoutParams());
            if (b() != null) {
                am.a(b());
            }
        }
    }

    public final void a(boolean z6) {
        String valueOf;
        int aW;
        int a9 = com.anythink.basead.b.e.a(this.f11398c, this.f11402g.getContext());
        y yVar = this.f11398c.f14954o;
        int aQ = yVar.aQ();
        if (aQ != 3) {
            aW = 0;
            if (aQ != 4) {
                valueOf = aQ != 5 ? "" : String.valueOf(yVar.aY());
            } else {
                valueOf = String.valueOf(yVar.bg());
            }
        } else {
            valueOf = String.valueOf(yVar.aX());
            aW = yVar.aW();
        }
        com.anythink.core.common.u.e.a(this.f11397b, this.f11398c, a9, z6, yVar.aQ(), valueOf, aW, yVar.aQ());
    }

    public final void c() {
        this.f11404j = false;
        this.f11405k = null;
    }

    public final void a(d.a aVar) {
        this.f11403h = aVar;
    }

    public void a(long j6) {
        CountDownView countDownView = this.f11408n;
        if (countDownView != null) {
            countDownView.refresh(j6);
            if (this.f11406l >= this.f11407m) {
                this.f11408n.setVisibility(0);
            }
        }
    }
}
