package L;

import Q2.C;
import S0.l;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.AbstractC3182eu;
import com.google.android.gms.internal.ads.BO;
import com.google.android.gms.internal.ads.C2749Pl;
import com.google.android.gms.internal.ads.C3168eg;
import com.google.android.gms.internal.ads.C3230fo;
import com.google.android.gms.internal.ads.C3235ft;
import com.google.android.gms.internal.ads.C4077va;
import com.google.android.gms.internal.ads.C4137wg;
import com.google.android.gms.internal.ads.C4219y7;
import com.google.android.gms.internal.ads.C4290zO;
import com.google.android.gms.internal.ads.Cz;
import com.google.android.gms.internal.ads.GN;
import com.google.android.gms.internal.ads.H6;
import com.google.android.gms.internal.ads.HN;
import com.google.android.gms.internal.ads.RunnableC3996u0;
import com.google.android.gms.internal.ads.SP;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2625Ig;
import com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC3921sg;
import com.google.android.gms.internal.ads.VN;
import i1.C4585b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import t0.AbstractC4987C;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1689n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1690u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f1691v;

    public /* synthetic */ a(VN vn, int i, boolean z6) {
        this.f1689n = 10;
        this.f1691v = vn;
        this.f1690u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H6 h62;
        switch (this.f1689n) {
            case 0:
                F.b bVar = (F.b) ((C4585b) this.f1691v).f38152u;
                if (bVar != null) {
                    bVar.g(this.f1690u);
                    break;
                }
                break;
            case 1:
                ((C) this.f1691v).f(this.f1690u);
                break;
            case 2:
                ((SystemForegroundService) this.f1691v).f5361x.cancel(this.f1690u);
                break;
            case 3:
                ArrayList arrayList = (ArrayList) this.f1691v;
                int size = arrayList.size();
                if (this.f1690u != 1) {
                    for (int i = 0; i < size; i++) {
                        ((androidx.emoji2.text.h) arrayList.get(i)).getClass();
                    }
                    break;
                } else {
                    for (int i4 = 0; i4 < size; i4++) {
                        ((androidx.emoji2.text.h) arrayList.get(i4)).a();
                    }
                    break;
                }
            case 4:
                int i6 = this.f1690u;
                C4219y7 c4219y7 = (C4219y7) this.f1691v;
                if (i6 > 0) {
                    try {
                        Thread.sleep(i6 * 1000);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = c4219y7.f35881a;
                    h62 = AbstractC2792Sd.f(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    h62 = null;
                }
                C4219y7 c4219y72 = (C4219y7) this.f1691v;
                c4219y72.f35888h = h62;
                int i9 = this.f1690u;
                if (i9 < 4) {
                    if (h62 == null || !h62.a0() || h62.v0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !h62.z0() || !h62.A0().A() || h62.A0().B() == -2) {
                        int i10 = i9 + 1;
                        if (c4219y72.f35891l) {
                            Future<?> submit = c4219y72.f35882b.submit(new a(c4219y72, i10));
                            if (i10 == 0) {
                                c4219y72.i = submit;
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                C3230fo c3230fo = ((C4077va) this.f1691v).f35464v;
                if (c3230fo != null) {
                    S0.e a9 = c3230fo.a();
                    a9.M(NativeAdvancedJsUtils.f18693p, "cct_nav");
                    a9.M("cct_navs", String.valueOf(this.f1690u));
                    a9.N();
                    break;
                }
                break;
            case 6:
                ((C3168eg) this.f1691v).f30748b.onAudioFocusChange(this.f1690u);
                break;
            case 7:
                C4137wg c4137wg = ((TextureViewSurfaceTextureListenerC3921sg) this.f1691v).J;
                if (c4137wg != null) {
                    c4137wg.onWindowVisibilityChanged(this.f1690u);
                    break;
                }
                break;
            case 8:
                C4137wg c4137wg2 = ((TextureViewSurfaceTextureListenerC2625Ig) this.f1691v).f26292z;
                if (c4137wg2 != null) {
                    c4137wg2.onWindowVisibilityChanged(this.f1690u);
                    break;
                }
                break;
            case 9:
                ((Cz) this.f1691v).b(this.f1690u + 1);
                break;
            case 10:
                VN vn = (VN) this.f1691v;
                int i11 = ((SP) vn.f28967n[this.f1690u].f434e).f28261u;
                BO bo = vn.f28952O;
                bo.s(bo.x(), 1033, new C4290zO(6));
                break;
            case 11:
                l lVar = (l) this.f1691v;
                lVar.getClass();
                String str = AbstractC3182eu.f30782a;
                HN hn = (HN) lVar.f2927v;
                int i12 = this.f1690u;
                GN gn = new GN(i12);
                C2749Pl c2749Pl = hn.f26036n.f27567T;
                AbstractC2792Sd.H(Looper.myLooper() == ((C3235ft) c2749Pl.f27644c).f31231a.getLooper());
                c2749Pl.f27642a++;
                RunnableC3996u0 runnableC3996u0 = new RunnableC3996u0(23, c2749Pl, gn);
                C3235ft c3235ft = (C3235ft) c2749Pl.f27643b;
                if (c3235ft.f31231a.getLooper().getThread().isAlive()) {
                    c3235ft.e(runnableC3996u0);
                }
                c2749Pl.m(Integer.valueOf(i12));
                break;
            default:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.j) this.f1691v).f36727B0;
                if (!recyclerView.f5202N) {
                    AbstractC4987C abstractC4987C = recyclerView.f5185E;
                    if (abstractC4987C == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    } else {
                        abstractC4987C.x0(recyclerView, this.f1690u);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i, int i4) {
        this.f1689n = i4;
        this.f1691v = obj;
        this.f1690u = i;
    }

    public a(C4219y7 c4219y7, int i) {
        this.f1689n = 4;
        this.f1690u = i;
        Objects.requireNonNull(c4219y7);
        this.f1691v = c4219y7;
    }

    public a(List list, int i, Throwable th) {
        this.f1689n = 3;
        A8.b.e(list, "initCallbacks cannot be null");
        this.f1691v = new ArrayList(list);
        this.f1690u = i;
    }
}
