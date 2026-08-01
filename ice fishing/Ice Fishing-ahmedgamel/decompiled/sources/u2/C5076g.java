package u2;

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
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0468k;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2749Qo;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.DialogInterfaceOnClickListenerC3899sh;
import com.google.android.gms.internal.ads.EnumC2698No;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p2.C4835j;

/* renamed from: u2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5076g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41271a;

    /* renamed from: b, reason: collision with root package name */
    public final C2749Qo f41272b;

    /* renamed from: c, reason: collision with root package name */
    public String f41273c;

    /* renamed from: d, reason: collision with root package name */
    public String f41274d;

    /* renamed from: e, reason: collision with root package name */
    public String f41275e;

    /* renamed from: f, reason: collision with root package name */
    public String f41276f;

    /* renamed from: h, reason: collision with root package name */
    public final int f41278h;
    public PointF i;

    /* renamed from: j, reason: collision with root package name */
    public PointF f41279j;

    /* renamed from: k, reason: collision with root package name */
    public final a3.e f41280k;

    /* renamed from: g, reason: collision with root package name */
    public int f41277g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC5072c f41281l = new RunnableC5072c(this, 6);

    public C5076g(Context context) {
        this.f41271a = context;
        this.f41278h = ViewConfiguration.get(context).getScaledTouchSlop();
        C4835j c4835j = C4835j.f39733C;
        c4835j.f39754t.b();
        this.f41280k = (a3.e) c4835j.f39754t.f1661c;
        this.f41272b = c4835j.f39749o.f41294g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z3) {
        if (!z3) {
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
            this.f41277g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f41277g;
        if (i == -1) {
            return;
        }
        RunnableC5072c runnableC5072c = this.f41281l;
        a3.e eVar = this.f41280k;
        if (i == 0) {
            if (actionMasked == 5) {
                this.f41277g = 5;
                this.f41279j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                eVar.postDelayed(runnableC5072c, ((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32120R5)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z3 = false;
                for (int i6 = 0; i6 < historySize; i6++) {
                    z3 |= !c(motionEvent.getHistoricalX(0, i6), motionEvent.getHistoricalY(0, i6), motionEvent.getHistoricalX(1, i6), motionEvent.getHistoricalY(1, i6));
                }
                if (c(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z3) {
                    return;
                }
            }
            this.f41277g = -1;
            eVar.removeCallbacks(runnableC5072c);
        }
    }

    public final void b() {
        String str;
        try {
            Context context = this.f41271a;
            if (!(context instanceof Activity)) {
                int i = z.f41322b;
                v2.i.e("Can not create dialog without Activity Context");
                return;
            }
            C4835j c4835j = C4835j.f39733C;
            j jVar = c4835j.f39749o;
            synchronized (jVar.f41288a) {
                str = jVar.f41290c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != c4835j.f39749o.h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int e9 = e(arrayList, "Ad information", true);
            final int e10 = e(arrayList, str2, true);
            final int e11 = e(arrayList, str3, true);
            boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.za)).booleanValue();
            final int e12 = e(arrayList, "Open ad inspector", booleanValue);
            final int e13 = e(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder k9 = D.k(context);
            k9.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: u2.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    final int i9 = 0;
                    final int i10 = 1;
                    final C5076g c5076g = C5076g.this;
                    c5076g.getClass();
                    if (i6 != e9) {
                        if (i6 == e10) {
                            int i11 = z.f41322b;
                            v2.i.a("Debug mode [Creative Preview] selected.");
                            AbstractC3413jg.f31268a.execute(new RunnableC5072c(c5076g, i10));
                            return;
                        }
                        if (i6 == e11) {
                            int i12 = z.f41322b;
                            v2.i.a("Debug mode [Troubleshooting] selected.");
                            AbstractC3413jg.f31268a.execute(new RunnableC5072c(c5076g, 2));
                            return;
                        }
                        int i13 = e12;
                        C2749Qo c2749Qo = c5076g.f41272b;
                        if (i6 == i13) {
                            final C3360ig c3360ig = AbstractC3413jg.f31273f;
                            C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                            if (c2749Qo.f()) {
                                c3360ig.execute(new RunnableC5072c(c5076g, 5));
                                return;
                            } else {
                                c3360ig2.execute(new Runnable() { // from class: u2.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i9) {
                                            case 0:
                                                C5076g c5076g2 = c5076g;
                                                c5076g2.getClass();
                                                C4835j c4835j2 = C4835j.f39733C;
                                                j jVar2 = c4835j2.f39749o;
                                                String str4 = c5076g2.f41274d;
                                                String str5 = c5076g2.f41275e;
                                                Context context2 = c5076g2.f41271a;
                                                if (!jVar2.b(context2, str4, str5)) {
                                                    c4835j2.f39749o.c(context2, c5076g2.f41274d, c5076g2.f41275e);
                                                    break;
                                                } else {
                                                    c3360ig.execute(new RunnableC5072c(c5076g2, 4));
                                                    break;
                                                }
                                            default:
                                                C5076g c5076g3 = c5076g;
                                                c5076g3.getClass();
                                                C4835j c4835j3 = C4835j.f39733C;
                                                j jVar3 = c4835j3.f39749o;
                                                String str6 = c5076g3.f41274d;
                                                String str7 = c5076g3.f41275e;
                                                Context context3 = c5076g3.f41271a;
                                                if (!jVar3.b(context3, str6, str7)) {
                                                    c4835j3.f39749o.c(context3, c5076g3.f41274d, c5076g3.f41275e);
                                                    break;
                                                } else {
                                                    c3360ig.execute(new RunnableC5072c(c5076g3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i6 == e13) {
                            final C3360ig c3360ig3 = AbstractC3413jg.f31273f;
                            C3360ig c3360ig4 = AbstractC3413jg.f31268a;
                            if (c2749Qo.f()) {
                                c3360ig3.execute(new RunnableC5072c(c5076g, i9));
                                return;
                            } else {
                                c3360ig4.execute(new Runnable() { // from class: u2.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                C5076g c5076g2 = c5076g;
                                                c5076g2.getClass();
                                                C4835j c4835j2 = C4835j.f39733C;
                                                j jVar2 = c4835j2.f39749o;
                                                String str4 = c5076g2.f41274d;
                                                String str5 = c5076g2.f41275e;
                                                Context context2 = c5076g2.f41271a;
                                                if (!jVar2.b(context2, str4, str5)) {
                                                    c4835j2.f39749o.c(context2, c5076g2.f41274d, c5076g2.f41275e);
                                                    break;
                                                } else {
                                                    c3360ig3.execute(new RunnableC5072c(c5076g2, 4));
                                                    break;
                                                }
                                            default:
                                                C5076g c5076g3 = c5076g;
                                                c5076g3.getClass();
                                                C4835j c4835j3 = C4835j.f39733C;
                                                j jVar3 = c4835j3.f39749o;
                                                String str6 = c5076g3.f41274d;
                                                String str7 = c5076g3.f41275e;
                                                Context context3 = c5076g3.f41271a;
                                                if (!jVar3.b(context3, str6, str7)) {
                                                    c4835j3.f39749o.c(context3, c5076g3.f41274d, c5076g3.f41275e);
                                                    break;
                                                } else {
                                                    c3360ig3.execute(new RunnableC5072c(c5076g3, 3));
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
                    Context context2 = c5076g.f41271a;
                    if (!(context2 instanceof Activity)) {
                        int i14 = z.f41322b;
                        v2.i.e("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = c5076g.f41273c;
                    String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri build = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        D d2 = C4835j.f39733C.f39738c;
                        HashMap o6 = D.o(build);
                        for (String str6 : o6.keySet()) {
                            sb.append(str6);
                            sb.append(" = ");
                            sb.append((String) o6.get(str6));
                            sb.append("\n\n");
                        }
                        String trim = sb.toString().trim();
                        if (!TextUtils.isEmpty(trim)) {
                            str5 = trim;
                        }
                    }
                    D d9 = C4835j.f39733C.f39738c;
                    AlertDialog.Builder k10 = D.k(context2);
                    k10.setMessage(str5);
                    k10.setTitle("Ad Information");
                    k10.setPositiveButton("Share", new DialogInterfaceOnClickListenerC3899sh(i10, c5076g, str5));
                    k10.setNegativeButton("Close", DialogInterfaceOnClickListenerC5074e.f41267n);
                    k10.create().show();
                }
            });
            k9.create().show();
        } catch (WindowManager.BadTokenException e14) {
            z.l("", e14);
        }
    }

    public final boolean c(float f3, float f9, float f10, float f11) {
        float abs = Math.abs(this.i.x - f3);
        int i = this.f41278h;
        return abs < ((float) i) && Math.abs(this.i.y - f9) < ((float) i) && Math.abs(this.f41279j.x - f10) < ((float) i) && Math.abs(this.f41279j.y - f11) < ((float) i);
    }

    public final void d(Context context) {
        ArrayList arrayList = new ArrayList();
        int e9 = e(arrayList, "None", true);
        final int e10 = e(arrayList, "Shake", true);
        final int e11 = e(arrayList, "Flick", true);
        int ordinal = this.f41272b.f27096r.ordinal();
        final int i = ordinal != 1 ? ordinal != 2 ? e9 : e11 : e10;
        D d2 = C4835j.f39733C.f39738c;
        AlertDialog.Builder k9 = D.k(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        k9.setTitle("Setup gesture");
        k9.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new com.icefishinggame.icefishinggamemultigames.D(1, atomicInteger));
        k9.setNegativeButton("Dismiss", new com.icefishinggame.icefishinggamemultigames.D(2, this));
        k9.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: u2.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                C5076g c5076g = C5076g.this;
                c5076g.getClass();
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i) {
                    int i9 = atomicInteger2.get();
                    int i10 = e10;
                    C2749Qo c2749Qo = c5076g.f41272b;
                    if (i9 == i10) {
                        c2749Qo.h(EnumC2698No.f26537u, true);
                    } else if (atomicInteger2.get() == e11) {
                        c2749Qo.h(EnumC2698No.f26538v, true);
                    } else {
                        c2749Qo.h(EnumC2698No.f26536n, true);
                    }
                }
                c5076g.b();
            }
        });
        k9.setOnCancelListener(new DialogInterfaceOnCancelListenerC0468k(1, this));
        k9.create().show();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f41273c);
        sb.append(",DebugSignal: ");
        sb.append(this.f41276f);
        sb.append(",AFMA Version: ");
        sb.append(this.f41275e);
        sb.append(",Ad Unit ID: ");
        return u1.h.g(sb, this.f41274d, "}");
    }
}
