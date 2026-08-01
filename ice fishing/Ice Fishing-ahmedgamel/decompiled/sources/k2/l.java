package k2;

import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC2684Na;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2815Uo;
import com.google.android.gms.internal.ads.RunnableC3191fP;
import java.util.concurrent.atomic.AtomicLong;
import l2.InterfaceC4660d;
import q2.C4900p;
import q2.G0;
import q2.InterfaceC4870a;
import q2.InterfaceC4914w0;
import q2.K;
import q2.U0;
import q2.f1;
import v2.AbstractC5111b;

/* loaded from: classes.dex */
public abstract class l extends ViewGroup {

    /* renamed from: n, reason: collision with root package name */
    public final G0 f38604n;

    public l(Context context) {
        super(context);
        this.f38604n = new G0(this);
    }

    public final void a() {
        AbstractC3569ma.a(getContext());
        if (((Boolean) AbstractC2684Na.f26497e.r()).booleanValue()) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.zc)).booleanValue()) {
                AbstractC5111b.f41397b.execute(new y(this, 2));
                return;
            }
        }
        G0 g02 = this.f38604n;
        g02.getClass();
        try {
            K k9 = g02.i;
            if (k9 != null) {
                k9.A();
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public final void b(g gVar) {
        P2.w.d("#008 Must be called on the main UI thread.");
        AbstractC3569ma.a(getContext());
        if (((Boolean) AbstractC2684Na.f26498f.r()).booleanValue()) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Cc)).booleanValue()) {
                AbstractC5111b.f41397b.execute(new RunnableC3191fP(13, this, gVar));
                return;
            }
        }
        this.f38604n.b(gVar.f38584a);
    }

    public c getAdListener() {
        return this.f38604n.f40042f;
    }

    public h getAdSize() {
        f1 q8;
        G0 g02 = this.f38604n;
        g02.getClass();
        try {
            K k9 = g02.i;
            if (k9 != null && (q8 = k9.q()) != null) {
                return new h(q8.f40146x, q8.f40143u, q8.f40142n);
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
        h[] hVarArr = g02.f40043g;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        K k9;
        G0 g02 = this.f38604n;
        if (g02.f40046k == null && (k9 = g02.i) != null) {
            try {
                g02.f40046k = k9.N();
            } catch (RemoteException e9) {
                v2.i.i("#007 Could not call remote method.", e9);
            }
        }
        return g02.f40046k;
    }

    public p getOnPaidEventListener() {
        return this.f38604n.f40049n;
    }

    public long getPlacementId() {
        G0 g02 = this.f38604n;
        AtomicLong atomicLong = g02.f40050o;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            K k9 = g02.i;
            if (k9 != null) {
                atomicLong.set(k9.f0());
                return atomicLong.get();
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s getResponseInfo() {
        InterfaceC4914w0 interfaceC4914w0;
        K k9;
        G0 g02 = this.f38604n;
        g02.getClass();
        try {
            k9 = g02.i;
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
        if (k9 != null) {
            interfaceC4914w0 = k9.C();
            if (interfaceC4914w0 == null) {
                return new s(interfaceC4914w0);
            }
            return null;
        }
        interfaceC4914w0 = null;
        if (interfaceC4914w0 == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i11 = ((i9 - i) - measuredWidth) / 2;
        int i12 = ((i10 - i6) - measuredHeight) / 2;
        childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i6) {
        h hVar;
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                hVar = getAdSize();
            } catch (NullPointerException e9) {
                v2.i.d("Unable to retrieve ad size.", e9);
                hVar = null;
            }
            if (hVar != null) {
                Context context = getContext();
                int i13 = hVar.f38591a;
                if (i13 == -3) {
                    i10 = -1;
                } else if (i13 != -1) {
                    v2.d dVar = C4900p.f40199g.f40200a;
                    i10 = v2.d.b(context, i13);
                } else {
                    i10 = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i14 = hVar.f38592b;
                if (i14 == -4 || i14 == -3) {
                    i11 = -1;
                } else if (i14 != -2) {
                    v2.d dVar2 = C4900p.f40199g.f40200a;
                    i11 = v2.d.b(context, i14);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f3 = displayMetrics.heightPixels;
                    float f9 = displayMetrics.density;
                    int i15 = (int) (f3 / f9);
                    i11 = (int) ((i15 <= 400 ? 32 : i15 <= 720 ? 50 : 90) * f9);
                }
                i9 = i11;
                i12 = i10;
            } else {
                i9 = 0;
            }
        } else {
            measureChild(childAt, i, i6);
            i12 = childAt.getMeasuredWidth();
            i9 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i12, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i9, getSuggestedMinimumHeight()), i6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(c cVar) {
        G0 g02 = this.f38604n;
        g02.f40042f = cVar;
        C2815Uo c2815Uo = g02.f40040d;
        synchronized (c2815Uo.f27981u) {
            c2815Uo.f27982v = cVar;
        }
        if (cVar == 0) {
            g02.c(null);
            return;
        }
        if (cVar instanceof InterfaceC4870a) {
            g02.c((InterfaceC4870a) cVar);
        }
        if (cVar instanceof InterfaceC4660d) {
            g02.e((InterfaceC4660d) cVar);
        }
    }

    public void setAdSize(h hVar) {
        h[] hVarArr = {hVar};
        G0 g02 = this.f38604n;
        if (g02.f40043g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        g02.d(hVarArr);
    }

    public void setAdUnitId(String str) {
        G0 g02 = this.f38604n;
        if (g02.f40046k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        g02.f40046k = str;
    }

    public void setOnPaidEventListener(p pVar) {
        G0 g02 = this.f38604n;
        g02.getClass();
        try {
            g02.f40049n = pVar;
            K k9 = g02.i;
            if (k9 != null) {
                k9.s0(new U0(pVar));
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }

    public void setPlacementId(long j6) {
        G0 g02 = this.f38604n;
        g02.f40050o.set(j6);
        try {
            K k9 = g02.i;
            if (k9 != null) {
                k9.A0(j6);
            }
        } catch (RemoteException e9) {
            v2.i.i("#007 Could not call remote method.", e9);
        }
    }
}
