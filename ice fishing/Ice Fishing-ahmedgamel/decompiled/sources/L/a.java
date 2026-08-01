package L;

import L3.F;
import O2.D;
import S0.l;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.AbstractC3159eu;
import com.google.android.gms.internal.ads.BO;
import com.google.android.gms.internal.ads.C2712Ol;
import com.google.android.gms.internal.ads.C3145eg;
import com.google.android.gms.internal.ads.C3153eo;
import com.google.android.gms.internal.ads.C3212ft;
import com.google.android.gms.internal.ads.C4054va;
import com.google.android.gms.internal.ads.C4114wg;
import com.google.android.gms.internal.ads.C4196y7;
import com.google.android.gms.internal.ads.C4267zO;
import com.google.android.gms.internal.ads.Cz;
import com.google.android.gms.internal.ads.GN;
import com.google.android.gms.internal.ads.H6;
import com.google.android.gms.internal.ads.HN;
import com.google.android.gms.internal.ads.RP;
import com.google.android.gms.internal.ads.RunnableC3973u0;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2605Ig;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC3898sg;
import com.google.android.gms.internal.ads.VN;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import t0.AbstractC4990E;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1580n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1581u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f1582v;

    public /* synthetic */ a(VN vn, int i, boolean z3) {
        this.f1580n = 10;
        this.f1582v = vn;
        this.f1581u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H6 h62;
        switch (this.f1580n) {
            case 0:
                F.b bVar = (F.b) ((I0.j) this.f1582v).f1264u;
                if (bVar != null) {
                    bVar.g(this.f1581u);
                    break;
                }
                break;
            case 1:
                ((D) this.f1582v).f(this.f1581u);
                break;
            case 2:
                ((SystemForegroundService) this.f1582v).f5396x.cancel(this.f1581u);
                break;
            case 3:
                ArrayList arrayList = (ArrayList) this.f1582v;
                int size = arrayList.size();
                if (this.f1581u != 1) {
                    for (int i = 0; i < size; i++) {
                        ((androidx.emoji2.text.h) arrayList.get(i)).getClass();
                    }
                    break;
                } else {
                    for (int i6 = 0; i6 < size; i6++) {
                        ((androidx.emoji2.text.h) arrayList.get(i6)).a();
                    }
                    break;
                }
            case 4:
                int i9 = this.f1581u;
                C4196y7 c4196y7 = (C4196y7) this.f1582v;
                if (i9 > 0) {
                    try {
                        Thread.sleep(i9 * 1000);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = c4196y7.f35095a;
                    h62 = AbstractC2772Sd.f(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    h62 = null;
                }
                C4196y7 c4196y72 = (C4196y7) this.f1582v;
                c4196y72.f35102h = h62;
                int i10 = this.f1581u;
                if (i10 < 4) {
                    if (h62 == null || !h62.a0() || h62.v0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !h62.z0() || !h62.A0().A() || h62.A0().B() == -2) {
                        int i11 = i10 + 1;
                        if (c4196y72.f35105l) {
                            Future<?> submit = c4196y72.f35096b.submit(new a(c4196y72, i11));
                            if (i11 == 0) {
                                c4196y72.i = submit;
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                C3153eo c3153eo = ((C4054va) this.f1582v).f34707v;
                if (c3153eo != null) {
                    S0.e a9 = c3153eo.a();
                    a9.v(NativeAdvancedJsUtils.f17906p, "cct_nav");
                    a9.v("cct_navs", String.valueOf(this.f1581u));
                    a9.y();
                    break;
                }
                break;
            case 6:
                ((C3145eg) this.f1582v).f29957b.onAudioFocusChange(this.f1581u);
                break;
            case 7:
                C4114wg c4114wg = ((TextureViewSurfaceTextureListenerC3898sg) this.f1582v).J;
                if (c4114wg != null) {
                    c4114wg.onWindowVisibilityChanged(this.f1581u);
                    break;
                }
                break;
            case 8:
                C4114wg c4114wg2 = ((TextureViewSurfaceTextureListenerC2605Ig) this.f1582v).f25543z;
                if (c4114wg2 != null) {
                    c4114wg2.onWindowVisibilityChanged(this.f1581u);
                    break;
                }
                break;
            case 9:
                ((Cz) this.f1582v).b(this.f1581u + 1);
                break;
            case 10:
                VN vn = (VN) this.f1582v;
                int i12 = ((RP) vn.f28171n[this.f1581u].f539e).f27272u;
                BO bo = vn.f28160O;
                bo.s(bo.x(), 1033, new C4267zO(6));
                break;
            case 11:
                l lVar = (l) this.f1582v;
                lVar.getClass();
                String str = AbstractC3159eu.f29993a;
                HN hn = (HN) lVar.f2798v;
                int i13 = this.f1581u;
                GN gn = new GN(i13);
                C2712Ol c2712Ol = hn.f25264n.f26789T;
                AbstractC2772Sd.H(Looper.myLooper() == ((C3212ft) c2712Ol.f26652c).f30468a.getLooper());
                c2712Ol.f26650a++;
                RunnableC3973u0 runnableC3973u0 = new RunnableC3973u0(23, c2712Ol, gn);
                C3212ft c3212ft = (C3212ft) c2712Ol.f26651b;
                if (c3212ft.f30468a.getLooper().getThread().isAlive()) {
                    c3212ft.e(runnableC3973u0);
                }
                c2712Ol.m(Integer.valueOf(i13));
                break;
            default:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.j) this.f1582v).f35963G0;
                if (!recyclerView.f5235N) {
                    AbstractC4990E abstractC4990E = recyclerView.f5218E;
                    if (abstractC4990E == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    } else {
                        abstractC4990E.x0(recyclerView, this.f1581u);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i, int i6) {
        this.f1580n = i6;
        this.f1582v = obj;
        this.f1581u = i;
    }

    public a(C4196y7 c4196y7, int i) {
        this.f1580n = 4;
        this.f1581u = i;
        Objects.requireNonNull(c4196y7);
        this.f1582v = c4196y7;
    }

    public a(List list, int i, Throwable th) {
        this.f1580n = 3;
        F.f(list, "initCallbacks cannot be null");
        this.f1582v = new ArrayList(list);
        this.f1581u = i;
    }
}
