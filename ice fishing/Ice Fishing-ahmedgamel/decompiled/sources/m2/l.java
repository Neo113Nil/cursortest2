package m2;

import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC2704Na;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.RunnableC3214fP;
import java.util.concurrent.atomic.AtomicLong;
import n2.InterfaceC4769d;
import s2.C4949p;
import s2.G0;
import s2.InterfaceC4919a;
import s2.InterfaceC4963w0;
import s2.K;
import s2.U0;
import s2.f1;
import x2.AbstractC5190b;

/* loaded from: classes.dex */
public abstract class l extends ViewGroup {

    /* renamed from: n, reason: collision with root package name */
    public final G0 f39393n;

    public l(Context context) {
        super(context);
        this.f39393n = new G0(this);
    }

    public final void a() {
        AbstractC3592ma.a(getContext());
        if (((Boolean) AbstractC2704Na.f27280e.r()).booleanValue()) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.zc)).booleanValue()) {
                AbstractC5190b.f41851b.execute(new y(this, 2));
                return;
            }
        }
        G0 g02 = this.f39393n;
        g02.getClass();
        try {
            K k9 = g02.i;
            if (k9 != null) {
                k9.A();
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public final void b(g gVar) {
        R2.w.d("#008 Must be called on the main UI thread.");
        AbstractC3592ma.a(getContext());
        if (((Boolean) AbstractC2704Na.f27281f.r()).booleanValue()) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                AbstractC5190b.f41851b.execute(new RunnableC3214fP(13, this, gVar));
                return;
            }
        }
        this.f39393n.b(gVar.f39373a);
    }

    public c getAdListener() {
        return this.f39393n.f40341f;
    }

    public h getAdSize() {
        f1 q8;
        G0 g02 = this.f39393n;
        g02.getClass();
        try {
            K k9 = g02.i;
            if (k9 != null && (q8 = k9.q()) != null) {
                return new h(q8.f40445x, q8.f40442u, q8.f40441n);
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
        h[] hVarArr = g02.f40342g;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        K k9;
        G0 g02 = this.f39393n;
        if (g02.f40345k == null && (k9 = g02.i) != null) {
            try {
                g02.f40345k = k9.N();
            } catch (RemoteException e9) {
                x2.i.i("#007 Could not call remote method.", e9);
            }
        }
        return g02.f40345k;
    }

    public p getOnPaidEventListener() {
        return this.f39393n.f40348n;
    }

    public long getPlacementId() {
        G0 g02 = this.f39393n;
        AtomicLong atomicLong = g02.f40349o;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            K k9 = g02.i;
            if (k9 != null) {
                atomicLong.set(k9.g0());
                return atomicLong.get();
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s getResponseInfo() {
        InterfaceC4963w0 interfaceC4963w0;
        K k9;
        G0 g02 = this.f39393n;
        g02.getClass();
        try {
            k9 = g02.i;
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
        if (k9 != null) {
            interfaceC4963w0 = k9.C();
            if (interfaceC4963w0 == null) {
                return new s(interfaceC4963w0);
            }
            return null;
        }
        interfaceC4963w0 = null;
        if (interfaceC4963w0 == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i10 = ((i6 - i) - measuredWidth) / 2;
        int i11 = ((i9 - i4) - measuredHeight) / 2;
        childAt.layout(i10, i11, measuredWidth + i10, measuredHeight + i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        h hVar;
        int i6;
        int i9;
        int i10;
        int i11 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                hVar = getAdSize();
            } catch (NullPointerException e9) {
                x2.i.d("Unable to retrieve ad size.", e9);
                hVar = null;
            }
            if (hVar != null) {
                Context context = getContext();
                int i12 = hVar.f39380a;
                if (i12 == -3) {
                    i9 = -1;
                } else if (i12 != -1) {
                    x2.d dVar = C4949p.f40498g.f40499a;
                    i9 = x2.d.b(context, i12);
                } else {
                    i9 = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i13 = hVar.f39381b;
                if (i13 == -4 || i13 == -3) {
                    i10 = -1;
                } else if (i13 != -2) {
                    x2.d dVar2 = C4949p.f40498g.f40499a;
                    i10 = x2.d.b(context, i13);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f2 = displayMetrics.heightPixels;
                    float f9 = displayMetrics.density;
                    int i14 = (int) (f2 / f9);
                    i10 = (int) ((i14 <= 400 ? 32 : i14 <= 720 ? 50 : 90) * f9);
                }
                i6 = i10;
                i11 = i9;
            } else {
                i6 = 0;
            }
        } else {
            measureChild(childAt, i, i4);
            i11 = childAt.getMeasuredWidth();
            i6 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i11, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i6, getSuggestedMinimumHeight()), i4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(c cVar) {
        G0 g02 = this.f39393n;
        g02.f40341f = cVar;
        Y0.m mVar = g02.f40339d;
        synchronized (mVar.f3849u) {
            mVar.f3850v = cVar;
        }
        if (cVar == 0) {
            g02.c(null);
            return;
        }
        if (cVar instanceof InterfaceC4919a) {
            g02.c((InterfaceC4919a) cVar);
        }
        if (cVar instanceof InterfaceC4769d) {
            g02.e((InterfaceC4769d) cVar);
        }
    }

    public void setAdSize(h hVar) {
        h[] hVarArr = {hVar};
        G0 g02 = this.f39393n;
        if (g02.f40342g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        g02.d(hVarArr);
    }

    public void setAdUnitId(String str) {
        G0 g02 = this.f39393n;
        if (g02.f40345k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        g02.f40345k = str;
    }

    public void setOnPaidEventListener(p pVar) {
        G0 g02 = this.f39393n;
        g02.getClass();
        try {
            g02.f40348n = pVar;
            K k9 = g02.i;
            if (k9 != null) {
                k9.M3(new U0(pVar));
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public void setPlacementId(long j6) {
        G0 g02 = this.f39393n;
        g02.f40349o.set(j6);
        try {
            K k9 = g02.i;
            if (k9 != null) {
                k9.w0(j6);
            }
        } catch (RemoteException e9) {
            x2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
