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
    Context f10767a;

    /* renamed from: b, reason: collision with root package name */
    w f10768b;

    /* renamed from: c, reason: collision with root package name */
    x f10769c;

    /* renamed from: d, reason: collision with root package name */
    c.a f10770d;

    /* renamed from: f, reason: collision with root package name */
    int f10772f;

    /* renamed from: g, reason: collision with root package name */
    ViewGroup f10773g;

    /* renamed from: h, reason: collision with root package name */
    d.a f10774h;
    Handler i;

    /* renamed from: k, reason: collision with root package name */
    protected Thread f10776k;

    /* renamed from: l, reason: collision with root package name */
    protected long f10777l;

    /* renamed from: m, reason: collision with root package name */
    protected long f10778m;

    /* renamed from: n, reason: collision with root package name */
    protected CountDownView f10779n;

    /* renamed from: p, reason: collision with root package name */
    private f.b f10781p;

    /* renamed from: o, reason: collision with root package name */
    private final String f10780o = getClass().getSimpleName();

    /* renamed from: j, reason: collision with root package name */
    protected boolean f10775j = false;

    /* renamed from: e, reason: collision with root package name */
    c.a f10771e = new c.a() { // from class: com.anythink.basead.ui.c.a.1
        @Override // com.anythink.basead.ui.improveclick.c.a
        public final void a(int i, int i4) {
            CountDownView countDownView = a.this.f10779n;
            if (countDownView != null) {
                countDownView.setClickViewAlpha(1.0d);
            }
            if (a.this.b() != null && (a.this.b() instanceof com.anythink.basead.ui.b)) {
                ((com.anythink.basead.ui.b) a.this.b()).setClickViewAlpha(1.0d);
            }
            c.a aVar = a.this.f10770d;
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
                if (!aVar.f10775j) {
                    return;
                }
                if (aVar.f10773g != null && (aVar.f().getParent() instanceof View) && a.this.f10781p.a((View) a.this.f().getParent(), a.this.f(), 50, 0)) {
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
                    long j9 = aVar2.f10777l;
                    if (j9 >= aVar2.f10778m) {
                        aVar2.c();
                    } else {
                        aVar2.f10777l = j9 + 200;
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
        this.f10767a = context.getApplicationContext();
        this.f10768b = wVar;
        this.f10769c = xVar;
        this.f10770d = aVar;
        this.f10772f = i;
        this.f10773g = viewGroup;
        this.f10781p = new f.b((wVar == null || wVar.r() == null) ? 1 : wVar.r().bO());
        this.i = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.c.a.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                a aVar2 = a.this;
                aVar2.a(aVar2.f10777l);
            }
        };
    }

    private void c(long j9) {
        if (this.f10776k != null) {
            return;
        }
        this.f10777l = 0L;
        this.f10778m = j9;
        this.f10775j = true;
        Thread thread = new Thread(new AnonymousClass3());
        this.f10776k = thread;
        thread.setName("anythink_type_endcard_improve_progress");
        this.f10776k.start();
    }

    private View g() {
        d.a aVar = this.f10774h;
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
        if (b9 == null || this.f10779n == null) {
            return;
        }
        ((ViewGroup) b9.getParent()).addView(this.f10779n, b9.getLayoutParams());
        if (b() != null) {
            am.a(b());
        }
    }

    public void a() {
    }

    public final View b() {
        d.a aVar = this.f10774h;
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
        return this.f10773g;
    }

    public void a(ViewGroup viewGroup) {
        if (com.anythink.basead.b.e.e(this.f10768b, this.f10769c)) {
            return;
        }
        a(false);
    }

    public final void b(long j9) {
        View b9 = b();
        if (j9 > 0) {
            j9 = Math.min(j9, 30L);
        } else if (j9 < 0) {
            j9 = Math.max(j9, -30L);
        }
        long j10 = j9 * 1000;
        if (b9 != null) {
            CountDownView countDownView = new CountDownView(this.f10767a);
            this.f10779n = countDownView;
            Context context = this.f10767a;
            countDownView.setCountDownEndDrawable(am.a(context, q.a(context, "myoffer_base_close_icon", k.f19790c)));
            this.f10779n.setDuration(Math.abs(j10));
            if (Math.abs(j10) > 0) {
                long abs = Math.abs(j10);
                if (this.f10776k == null) {
                    this.f10777l = 0L;
                    this.f10778m = abs;
                    this.f10775j = true;
                    Thread thread = new Thread(new AnonymousClass3());
                    this.f10776k = thread;
                    thread.setName("anythink_type_endcard_improve_progress");
                    this.f10776k.start();
                }
            } else {
                a(0L);
            }
            if (j10 >= 0) {
                this.f10779n.setVisibility(0);
            } else {
                this.f10779n.setVisibility(8);
            }
            View b10 = b();
            if (b10 == null || this.f10779n == null) {
                return;
            }
            ((ViewGroup) b10.getParent()).addView(this.f10779n, b10.getLayoutParams());
            if (b() != null) {
                am.a(b());
            }
        }
    }

    public final void a(boolean z8) {
        String valueOf;
        int aW;
        int a9 = com.anythink.basead.b.e.a(this.f10769c, this.f10773g.getContext());
        y yVar = this.f10769c.f14325o;
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
        com.anythink.core.common.u.e.a(this.f10768b, this.f10769c, a9, z8, yVar.aQ(), valueOf, aW, yVar.aQ());
    }

    public final void c() {
        this.f10775j = false;
        this.f10776k = null;
    }

    public final void a(d.a aVar) {
        this.f10774h = aVar;
    }

    public void a(long j9) {
        CountDownView countDownView = this.f10779n;
        if (countDownView != null) {
            countDownView.refresh(j9);
            if (this.f10777l >= this.f10778m) {
                this.f10779n.setVisibility(0);
            }
        }
    }
}
