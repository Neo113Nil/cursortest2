package t2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0478k;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2748Qo;
import com.google.android.gms.internal.ads.C3157eg;
import com.google.android.gms.internal.ads.EnumC2697No;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import t0.AbstractC5051n;

/* renamed from: t2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5074h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40894a;

    /* renamed from: b, reason: collision with root package name */
    public final C2748Qo f40895b;

    /* renamed from: c, reason: collision with root package name */
    public String f40896c;

    /* renamed from: d, reason: collision with root package name */
    public String f40897d;

    /* renamed from: e, reason: collision with root package name */
    public String f40898e;

    /* renamed from: f, reason: collision with root package name */
    public String f40899f;

    /* renamed from: h, reason: collision with root package name */
    public final int f40901h;
    public PointF i;

    /* renamed from: j, reason: collision with root package name */
    public PointF f40902j;

    /* renamed from: k, reason: collision with root package name */
    public final Z2.e f40903k;

    /* renamed from: g, reason: collision with root package name */
    public int f40900g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC5069c f40904l = new RunnableC5069c(this, 6);

    public C5074h(Context context) {
        this.f40894a = context;
        this.f40901h = ViewConfiguration.get(context).getScaledTouchSlop();
        p2.j jVar = p2.j.f39798C;
        jVar.f39819t.b();
        this.f40903k = (Z2.e) jVar.f39819t.f1606c;
        this.f40895b = jVar.f39814o.f40917g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z8) {
        if (!z8) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f40900g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f40900g;
        if (i == -1) {
            return;
        }
        RunnableC5069c runnableC5069c = this.f40904l;
        Z2.e eVar = this.f40903k;
        if (i == 0) {
            if (actionMasked == 5) {
                this.f40900g = 5;
                this.f40902j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                eVar.postDelayed(runnableC5069c, ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31540R5)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z8 = false;
                for (int i4 = 0; i4 < historySize; i4++) {
                    z8 |= !c(motionEvent.getHistoricalX(0, i4), motionEvent.getHistoricalY(0, i4), motionEvent.getHistoricalX(1, i4), motionEvent.getHistoricalY(1, i4));
                }
                if (c(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z8) {
                    return;
                }
            }
            this.f40900g = -1;
            eVar.removeCallbacks(runnableC5069c);
        }
    }

    public final void b() {
        String str;
        try {
            Context context = this.f40894a;
            if (!(context instanceof Activity)) {
                int i = C.f40822b;
                u2.i.e("Can not create dialog without Activity Context");
                return;
            }
            p2.j jVar = p2.j.f39798C;
            C5077k c5077k = jVar.f39814o;
            synchronized (c5077k.f40911a) {
                str = c5077k.f40913c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != jVar.f39814o.h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int e6 = e(arrayList, "Ad information", true);
            final int e9 = e(arrayList, str2, true);
            final int e10 = e(arrayList, str3, true);
            boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.za)).booleanValue();
            final int e11 = e(arrayList, "Open ad inspector", booleanValue);
            final int e12 = e(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder k6 = G.k(context);
            k6.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: t2.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    final int i9 = 0;
                    final int i10 = 1;
                    final C5074h c5074h = C5074h.this;
                    c5074h.getClass();
                    if (i4 != e6) {
                        if (i4 == e9) {
                            int i11 = C.f40822b;
                            u2.i.a("Debug mode [Creative Preview] selected.");
                            AbstractC3212fg.f30738a.execute(new RunnableC5069c(c5074h, i10));
                            return;
                        }
                        if (i4 == e10) {
                            int i12 = C.f40822b;
                            u2.i.a("Debug mode [Troubleshooting] selected.");
                            AbstractC3212fg.f30738a.execute(new RunnableC5069c(c5074h, 2));
                            return;
                        }
                        int i13 = e11;
                        C2748Qo c2748Qo = c5074h.f40895b;
                        if (i4 == i13) {
                            final C3157eg c3157eg = AbstractC3212fg.f30743f;
                            C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                            if (c2748Qo.f()) {
                                c3157eg.execute(new RunnableC5069c(c5074h, 5));
                                return;
                            } else {
                                c3157eg2.execute(new Runnable() { // from class: t2.g
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i9) {
                                            case 0:
                                                C5074h c5074h2 = c5074h;
                                                c5074h2.getClass();
                                                p2.j jVar2 = p2.j.f39798C;
                                                C5077k c5077k2 = jVar2.f39814o;
                                                String str4 = c5074h2.f40897d;
                                                String str5 = c5074h2.f40898e;
                                                Context context2 = c5074h2.f40894a;
                                                if (!c5077k2.b(context2, str4, str5)) {
                                                    jVar2.f39814o.c(context2, c5074h2.f40897d, c5074h2.f40898e);
                                                    break;
                                                } else {
                                                    c3157eg.execute(new RunnableC5069c(c5074h2, 4));
                                                    break;
                                                }
                                            default:
                                                C5074h c5074h3 = c5074h;
                                                c5074h3.getClass();
                                                p2.j jVar3 = p2.j.f39798C;
                                                C5077k c5077k3 = jVar3.f39814o;
                                                String str6 = c5074h3.f40897d;
                                                String str7 = c5074h3.f40898e;
                                                Context context3 = c5074h3.f40894a;
                                                if (!c5077k3.b(context3, str6, str7)) {
                                                    jVar3.f39814o.c(context3, c5074h3.f40897d, c5074h3.f40898e);
                                                    break;
                                                } else {
                                                    c3157eg.execute(new RunnableC5069c(c5074h3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i4 == e12) {
                            final C3157eg c3157eg3 = AbstractC3212fg.f30743f;
                            C3157eg c3157eg4 = AbstractC3212fg.f30738a;
                            if (c2748Qo.f()) {
                                c3157eg3.execute(new RunnableC5069c(c5074h, i9));
                                return;
                            } else {
                                c3157eg4.execute(new Runnable() { // from class: t2.g
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                C5074h c5074h2 = c5074h;
                                                c5074h2.getClass();
                                                p2.j jVar2 = p2.j.f39798C;
                                                C5077k c5077k2 = jVar2.f39814o;
                                                String str4 = c5074h2.f40897d;
                                                String str5 = c5074h2.f40898e;
                                                Context context2 = c5074h2.f40894a;
                                                if (!c5077k2.b(context2, str4, str5)) {
                                                    jVar2.f39814o.c(context2, c5074h2.f40897d, c5074h2.f40898e);
                                                    break;
                                                } else {
                                                    c3157eg3.execute(new RunnableC5069c(c5074h2, 4));
                                                    break;
                                                }
                                            default:
                                                C5074h c5074h3 = c5074h;
                                                c5074h3.getClass();
                                                p2.j jVar3 = p2.j.f39798C;
                                                C5077k c5077k3 = jVar3.f39814o;
                                                String str6 = c5074h3.f40897d;
                                                String str7 = c5074h3.f40898e;
                                                Context context3 = c5074h3.f40894a;
                                                if (!c5077k3.b(context3, str6, str7)) {
                                                    jVar3.f39814o.c(context3, c5074h3.f40897d, c5074h3.f40898e);
                                                    break;
                                                } else {
                                                    c3157eg3.execute(new RunnableC5069c(c5074h3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = c5074h.f40894a;
                    if (!(context2 instanceof Activity)) {
                        int i14 = C.f40822b;
                        u2.i.e("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = c5074h.f40896c;
                    final String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri build = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        G g9 = p2.j.f39798C.f39803c;
                        HashMap o9 = G.o(build);
                        for (String str6 : o9.keySet()) {
                            sb.append(str6);
                            sb.append(" = ");
                            sb.append((String) o9.get(str6));
                            sb.append("\n\n");
                        }
                        String trim = sb.toString().trim();
                        if (!TextUtils.isEmpty(trim)) {
                            str5 = trim;
                        }
                    }
                    G g10 = p2.j.f39798C.f39803c;
                    AlertDialog.Builder k9 = G.k(context2);
                    k9.setMessage(str5);
                    k9.setTitle("Ad Information");
                    k9.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: t2.e
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i15) {
                            C5074h c5074h2 = C5074h.this;
                            c5074h2.getClass();
                            G g11 = p2.j.f39798C.f39803c;
                            G.s(c5074h2.f40894a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str5), "Share via"));
                        }
                    });
                    k9.setNegativeButton("Close", DialogInterfaceOnClickListenerC5072f.f40890n);
                    k9.create().show();
                }
            });
            k6.create().show();
        } catch (WindowManager.BadTokenException e13) {
            C.l("", e13);
        }
    }

    public final boolean c(float f6, float f9, float f10, float f11) {
        float abs = Math.abs(this.i.x - f6);
        int i = this.f40901h;
        return abs < ((float) i) && Math.abs(this.i.y - f9) < ((float) i) && Math.abs(this.f40902j.x - f10) < ((float) i) && Math.abs(this.f40902j.y - f11) < ((float) i);
    }

    public final void d(Context context) {
        ArrayList arrayList = new ArrayList();
        int e6 = e(arrayList, "None", true);
        final int e9 = e(arrayList, "Shake", true);
        final int e10 = e(arrayList, "Flick", true);
        int ordinal = this.f40895b.f27233r.ordinal();
        final int i = ordinal != 1 ? ordinal != 2 ? e6 : e10 : e9;
        G g9 = p2.j.f39798C.f39803c;
        AlertDialog.Builder k6 = G.k(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        k6.setTitle("Setup gesture");
        k6.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new com.icefishing.icefishingliveapp.D(1, atomicInteger));
        k6.setNegativeButton("Dismiss", new com.icefishing.icefishingliveapp.D(2, this));
        k6.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: t2.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C5074h c5074h = C5074h.this;
                c5074h.getClass();
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i) {
                    int i9 = atomicInteger2.get();
                    int i10 = e9;
                    C2748Qo c2748Qo = c5074h.f40895b;
                    if (i9 == i10) {
                        c2748Qo.h(EnumC2697No.f26604u, true);
                    } else if (atomicInteger2.get() == e10) {
                        c2748Qo.h(EnumC2697No.f26605v, true);
                    } else {
                        c2748Qo.h(EnumC2697No.f26603n, true);
                    }
                }
                c5074h.b();
            }
        });
        k6.setOnCancelListener(new DialogInterfaceOnCancelListenerC0478k(1, this));
        k6.create().show();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f40896c);
        sb.append(",DebugSignal: ");
        sb.append(this.f40899f);
        sb.append(",AFMA Version: ");
        sb.append(this.f40898e);
        sb.append(",Ad Unit ID: ");
        return AbstractC5051n.g(sb, this.f40897d, "}");
    }
}
