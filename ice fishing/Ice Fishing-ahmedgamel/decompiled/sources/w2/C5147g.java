package w2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0472k;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2786Ro;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.DialogInterfaceOnClickListenerC3922sh;
import com.google.android.gms.internal.ads.EnumC2735Oo;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import r2.C4906k;

/* renamed from: w2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5147g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41661a;

    /* renamed from: b, reason: collision with root package name */
    public final C2786Ro f41662b;

    /* renamed from: c, reason: collision with root package name */
    public String f41663c;

    /* renamed from: d, reason: collision with root package name */
    public String f41664d;

    /* renamed from: e, reason: collision with root package name */
    public String f41665e;

    /* renamed from: f, reason: collision with root package name */
    public String f41666f;

    /* renamed from: h, reason: collision with root package name */
    public final int f41668h;
    public PointF i;

    /* renamed from: j, reason: collision with root package name */
    public PointF f41669j;

    /* renamed from: k, reason: collision with root package name */
    public final c3.e f41670k;

    /* renamed from: g, reason: collision with root package name */
    public int f41667g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC5143c f41671l = new RunnableC5143c(this, 6);

    public C5147g(Context context) {
        this.f41661a = context;
        this.f41668h = ViewConfiguration.get(context).getScaledTouchSlop();
        C4906k c4906k = C4906k.f40186C;
        c4906k.f40207t.b();
        this.f41670k = (c3.e) c4906k.f40207t.f1951c;
        this.f41662b = c4906k.f40202o.f41684g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z6) {
        if (!z6) {
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
            this.f41667g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f41667g;
        if (i == -1) {
            return;
        }
        RunnableC5143c runnableC5143c = this.f41671l;
        c3.e eVar = this.f41670k;
        if (i == 0) {
            if (actionMasked == 5) {
                this.f41667g = 5;
                this.f41669j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                eVar.postDelayed(runnableC5143c, ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32899R5)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z6 = false;
                for (int i4 = 0; i4 < historySize; i4++) {
                    z6 |= !c(motionEvent.getHistoricalX(0, i4), motionEvent.getHistoricalY(0, i4), motionEvent.getHistoricalX(1, i4), motionEvent.getHistoricalY(1, i4));
                }
                if (c(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z6) {
                    return;
                }
            }
            this.f41667g = -1;
            eVar.removeCallbacks(runnableC5143c);
        }
    }

    public final void b() {
        String str;
        try {
            Context context = this.f41661a;
            if (!(context instanceof Activity)) {
                int i = z.f41712b;
                x2.i.e("Can not create dialog without Activity Context");
                return;
            }
            C4906k c4906k = C4906k.f40186C;
            j jVar = c4906k.f40202o;
            synchronized (jVar.f41678a) {
                str = jVar.f41680c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != c4906k.f40202o.h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int e9 = e(arrayList, "Ad information", true);
            final int e10 = e(arrayList, str2, true);
            final int e11 = e(arrayList, str3, true);
            boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.za)).booleanValue();
            final int e12 = e(arrayList, "Open ad inspector", booleanValue);
            final int e13 = e(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder k9 = D.k(context);
            k9.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: w2.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    final int i6 = 0;
                    final int i9 = 1;
                    final C5147g c5147g = C5147g.this;
                    c5147g.getClass();
                    if (i4 != e9) {
                        if (i4 == e10) {
                            int i10 = z.f41712b;
                            x2.i.a("Debug mode [Creative Preview] selected.");
                            AbstractC3436jg.f32055a.execute(new RunnableC5143c(c5147g, i9));
                            return;
                        }
                        if (i4 == e11) {
                            int i11 = z.f41712b;
                            x2.i.a("Debug mode [Troubleshooting] selected.");
                            AbstractC3436jg.f32055a.execute(new RunnableC5143c(c5147g, 2));
                            return;
                        }
                        int i12 = e12;
                        C2786Ro c2786Ro = c5147g.f41662b;
                        if (i4 == i12) {
                            final C3383ig c3383ig = AbstractC3436jg.f32060f;
                            C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                            if (c2786Ro.f()) {
                                c3383ig.execute(new RunnableC5143c(c5147g, 5));
                                return;
                            } else {
                                c3383ig2.execute(new Runnable() { // from class: w2.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                C5147g c5147g2 = c5147g;
                                                c5147g2.getClass();
                                                C4906k c4906k2 = C4906k.f40186C;
                                                j jVar2 = c4906k2.f40202o;
                                                String str4 = c5147g2.f41664d;
                                                String str5 = c5147g2.f41665e;
                                                Context context2 = c5147g2.f41661a;
                                                if (!jVar2.b(context2, str4, str5)) {
                                                    c4906k2.f40202o.c(context2, c5147g2.f41664d, c5147g2.f41665e);
                                                    break;
                                                } else {
                                                    c3383ig.execute(new RunnableC5143c(c5147g2, 4));
                                                    break;
                                                }
                                            default:
                                                C5147g c5147g3 = c5147g;
                                                c5147g3.getClass();
                                                C4906k c4906k3 = C4906k.f40186C;
                                                j jVar3 = c4906k3.f40202o;
                                                String str6 = c5147g3.f41664d;
                                                String str7 = c5147g3.f41665e;
                                                Context context3 = c5147g3.f41661a;
                                                if (!jVar3.b(context3, str6, str7)) {
                                                    c4906k3.f40202o.c(context3, c5147g3.f41664d, c5147g3.f41665e);
                                                    break;
                                                } else {
                                                    c3383ig.execute(new RunnableC5143c(c5147g3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i4 == e13) {
                            final C3383ig c3383ig3 = AbstractC3436jg.f32060f;
                            C3383ig c3383ig4 = AbstractC3436jg.f32055a;
                            if (c2786Ro.f()) {
                                c3383ig3.execute(new RunnableC5143c(c5147g, i6));
                                return;
                            } else {
                                c3383ig4.execute(new Runnable() { // from class: w2.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i9) {
                                            case 0:
                                                C5147g c5147g2 = c5147g;
                                                c5147g2.getClass();
                                                C4906k c4906k2 = C4906k.f40186C;
                                                j jVar2 = c4906k2.f40202o;
                                                String str4 = c5147g2.f41664d;
                                                String str5 = c5147g2.f41665e;
                                                Context context2 = c5147g2.f41661a;
                                                if (!jVar2.b(context2, str4, str5)) {
                                                    c4906k2.f40202o.c(context2, c5147g2.f41664d, c5147g2.f41665e);
                                                    break;
                                                } else {
                                                    c3383ig3.execute(new RunnableC5143c(c5147g2, 4));
                                                    break;
                                                }
                                            default:
                                                C5147g c5147g3 = c5147g;
                                                c5147g3.getClass();
                                                C4906k c4906k3 = C4906k.f40186C;
                                                j jVar3 = c4906k3.f40202o;
                                                String str6 = c5147g3.f41664d;
                                                String str7 = c5147g3.f41665e;
                                                Context context3 = c5147g3.f41661a;
                                                if (!jVar3.b(context3, str6, str7)) {
                                                    c4906k3.f40202o.c(context3, c5147g3.f41664d, c5147g3.f41665e);
                                                    break;
                                                } else {
                                                    c3383ig3.execute(new RunnableC5143c(c5147g3, 3));
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
                    Context context2 = c5147g.f41661a;
                    if (!(context2 instanceof Activity)) {
                        int i13 = z.f41712b;
                        x2.i.e("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = c5147g.f41663c;
                    String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri build = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        D d9 = C4906k.f40186C.f40191c;
                        HashMap o4 = D.o(build);
                        for (String str6 : o4.keySet()) {
                            sb.append(str6);
                            sb.append(" = ");
                            sb.append((String) o4.get(str6));
                            sb.append("\n\n");
                        }
                        String trim = sb.toString().trim();
                        if (!TextUtils.isEmpty(trim)) {
                            str5 = trim;
                        }
                    }
                    D d10 = C4906k.f40186C.f40191c;
                    AlertDialog.Builder k10 = D.k(context2);
                    k10.setMessage(str5);
                    k10.setTitle("Ad Information");
                    k10.setPositiveButton("Share", new DialogInterfaceOnClickListenerC3922sh(i9, c5147g, str5));
                    k10.setNegativeButton("Close", DialogInterfaceOnClickListenerC5145e.f41657n);
                    k10.create().show();
                }
            });
            k9.create().show();
        } catch (WindowManager.BadTokenException e14) {
            z.l("", e14);
        }
    }

    public final boolean c(float f2, float f9, float f10, float f11) {
        float abs = Math.abs(this.i.x - f2);
        int i = this.f41668h;
        return abs < ((float) i) && Math.abs(this.i.y - f9) < ((float) i) && Math.abs(this.f41669j.x - f10) < ((float) i) && Math.abs(this.f41669j.y - f11) < ((float) i);
    }

    public final void d(Context context) {
        ArrayList arrayList = new ArrayList();
        int e9 = e(arrayList, "None", true);
        final int e10 = e(arrayList, "Shake", true);
        final int e11 = e(arrayList, "Flick", true);
        int ordinal = this.f41662b.f28040r.ordinal();
        final int i = ordinal != 1 ? ordinal != 2 ? e9 : e11 : e10;
        D d9 = C4906k.f40186C.f40191c;
        AlertDialog.Builder k9 = D.k(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        k9.setTitle("Setup gesture");
        k9.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new com.IceFishing.LiveIceFishing.E(1, atomicInteger));
        k9.setNegativeButton("Dismiss", new com.IceFishing.LiveIceFishing.E(2, this));
        k9.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: w2.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C5147g c5147g = C5147g.this;
                c5147g.getClass();
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i) {
                    int i6 = atomicInteger2.get();
                    int i9 = e10;
                    C2786Ro c2786Ro = c5147g.f41662b;
                    if (i6 == i9) {
                        c2786Ro.h(EnumC2735Oo.f27441u, true);
                    } else if (atomicInteger2.get() == e11) {
                        c2786Ro.h(EnumC2735Oo.f27442v, true);
                    } else {
                        c2786Ro.h(EnumC2735Oo.f27440n, true);
                    }
                }
                c5147g.b();
            }
        });
        k9.setOnCancelListener(new DialogInterfaceOnCancelListenerC0472k(1, this));
        k9.create().show();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f41663c);
        sb.append(",DebugSignal: ");
        sb.append(this.f41666f);
        sb.append(",AFMA Version: ");
        sb.append(this.f41665e);
        sb.append(",Ad Unit ID: ");
        return Wv.i(sb, this.f41664d, "}");
    }
}
