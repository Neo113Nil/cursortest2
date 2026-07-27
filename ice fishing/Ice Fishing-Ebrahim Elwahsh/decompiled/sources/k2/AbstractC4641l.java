package k2;

import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC2598Ia;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2833Vo;
import java.util.concurrent.atomic.AtomicLong;
import l2.InterfaceC4689d;
import q2.C4907p;
import q2.G0;
import q2.InterfaceC4877a;
import q2.InterfaceC4921w0;
import q2.K;
import q2.V0;
import q2.g1;
import u2.AbstractC5108b;

/* renamed from: k2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4641l extends ViewGroup {

    /* renamed from: n, reason: collision with root package name */
    public final G0 f38724n;

    public AbstractC4641l(Context context) {
        super(context);
        this.f38724n = new G0(this);
    }

    public final void a() {
        AbstractC3368ia.a(getContext());
        if (((Boolean) AbstractC2598Ia.f25570e.r()).booleanValue()) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.zc)).booleanValue()) {
                AbstractC5108b.f41223b.execute(new y(this, 2));
                return;
            }
        }
        G0 g02 = this.f38724n;
        g02.getClass();
        try {
            K k6 = g02.i;
            if (k6 != null) {
                k6.x();
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    public final void b(C4636g c4636g) {
        O2.w.d("#008 Must be called on the main UI thread.");
        AbstractC3368ia.a(getContext());
        if (((Boolean) AbstractC2598Ia.f25571f.r()).booleanValue()) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                AbstractC5108b.f41223b.execute(new h3.l(this, c4636g, 3, false));
                return;
            }
        }
        this.f38724n.b(c4636g.f38704a);
    }

    public AbstractC4632c getAdListener() {
        return this.f38724n.f39949f;
    }

    public C4637h getAdSize() {
        g1 p6;
        G0 g02 = this.f38724n;
        g02.getClass();
        try {
            K k6 = g02.i;
            if (k6 != null && (p6 = k6.p()) != null) {
                return new C4637h(p6.f40060x, p6.f40057u, p6.f40056n);
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
        C4637h[] c4637hArr = g02.f39950g;
        if (c4637hArr != null) {
            return c4637hArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        K k6;
        G0 g02 = this.f38724n;
        if (g02.f39953k == null && (k6 = g02.i) != null) {
            try {
                g02.f39953k = k6.u();
            } catch (RemoteException e6) {
                u2.i.i("#007 Could not call remote method.", e6);
            }
        }
        return g02.f39953k;
    }

    public p getOnPaidEventListener() {
        return this.f38724n.f39956n;
    }

    public long getPlacementId() {
        G0 g02 = this.f38724n;
        AtomicLong atomicLong = g02.f39957o;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            K k6 = g02.i;
            if (k6 != null) {
                atomicLong.set(k6.Z());
                return atomicLong.get();
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s getResponseInfo() {
        InterfaceC4921w0 interfaceC4921w0;
        K k6;
        G0 g02 = this.f38724n;
        g02.getClass();
        try {
            k6 = g02.i;
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
        if (k6 != null) {
            interfaceC4921w0 = k6.M();
            if (interfaceC4921w0 == null) {
                return new s(interfaceC4921w0);
            }
            return null;
        }
        interfaceC4921w0 = null;
        if (interfaceC4921w0 == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i11 = ((i9 - i) - measuredWidth) / 2;
        int i12 = ((i10 - i4) - measuredHeight) / 2;
        childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        C4637h c4637h;
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                c4637h = getAdSize();
            } catch (NullPointerException e6) {
                u2.i.d("Unable to retrieve ad size.", e6);
                c4637h = null;
            }
            if (c4637h != null) {
                Context context = getContext();
                int i13 = c4637h.f38711a;
                if (i13 == -3) {
                    i10 = -1;
                } else if (i13 != -1) {
                    u2.d dVar = C4907p.f40108g.f40109a;
                    i10 = u2.d.b(context, i13);
                } else {
                    i10 = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i14 = c4637h.f38712b;
                if (i14 == -4 || i14 == -3) {
                    i11 = -1;
                } else if (i14 != -2) {
                    u2.d dVar2 = C4907p.f40108g.f40109a;
                    i11 = u2.d.b(context, i14);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f6 = displayMetrics.heightPixels;
                    float f9 = displayMetrics.density;
                    int i15 = (int) (f6 / f9);
                    i11 = (int) ((i15 <= 400 ? 32 : i15 <= 720 ? 50 : 90) * f9);
                }
                i9 = i11;
                i12 = i10;
            } else {
                i9 = 0;
            }
        } else {
            measureChild(childAt, i, i4);
            i12 = childAt.getMeasuredWidth();
            i9 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i12, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i9, getSuggestedMinimumHeight()), i4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AbstractC4632c abstractC4632c) {
        G0 g02 = this.f38724n;
        g02.f39949f = abstractC4632c;
        C2833Vo c2833Vo = g02.f39947d;
        synchronized (c2833Vo.f28306u) {
            c2833Vo.f28307v = abstractC4632c;
        }
        if (abstractC4632c == 0) {
            g02.c(null);
            return;
        }
        if (abstractC4632c instanceof InterfaceC4877a) {
            g02.c((InterfaceC4877a) abstractC4632c);
        }
        if (abstractC4632c instanceof InterfaceC4689d) {
            g02.e((InterfaceC4689d) abstractC4632c);
        }
    }

    public void setAdSize(C4637h c4637h) {
        C4637h[] c4637hArr = {c4637h};
        G0 g02 = this.f38724n;
        if (g02.f39950g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        g02.d(c4637hArr);
    }

    public void setAdUnitId(String str) {
        G0 g02 = this.f38724n;
        if (g02.f39953k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        g02.f39953k = str;
    }

    public void setOnPaidEventListener(p pVar) {
        G0 g02 = this.f38724n;
        g02.getClass();
        try {
            g02.f39956n = pVar;
            K k6 = g02.i;
            if (k6 != null) {
                k6.p3(new V0(pVar));
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    public void setPlacementId(long j9) {
        G0 g02 = this.f38724n;
        g02.f39957o.set(j9);
        try {
            K k6 = g02.i;
            if (k6 != null) {
                k6.P0(j9);
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }
}
