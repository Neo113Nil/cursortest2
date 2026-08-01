package l2;

import P2.w;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2684Na;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.RunnableC3191fP;
import k2.h;
import k2.l;
import k2.v;
import q2.G0;
import q2.K;
import q2.Z0;
import q2.r;
import v2.AbstractC5111b;
import v2.i;

/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4659c extends l {
    public C4659c(Context context) {
        super(context);
        w.i(context, "Context cannot be null");
    }

    public final void c(C4658b c4658b) {
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3569ma.a(getContext());
        if (((Boolean) AbstractC2684Na.f26498f.r()).booleanValue()) {
            if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.Cc)).booleanValue()) {
                AbstractC5111b.f41397b.execute(new RunnableC3191fP(15, this, c4658b));
                return;
            }
        }
        this.f38604n.b(c4658b.f38584a);
    }

    public h[] getAdSizes() {
        return this.f38604n.f40043g;
    }

    public InterfaceC4660d getAppEventListener() {
        return this.f38604n.f40044h;
    }

    public v getVideoController() {
        return this.f38604n.f40039c;
    }

    public k2.w getVideoOptions() {
        return this.f38604n.f40045j;
    }

    public void setAdSizes(h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f38604n.d(hVarArr);
    }

    public void setAppEventListener(InterfaceC4660d interfaceC4660d) {
        this.f38604n.e(interfaceC4660d);
    }

    public void setManualImpressionsEnabled(boolean z3) {
        G0 g02 = this.f38604n;
        g02.f40048m = z3;
        try {
            K k9 = g02.i;
            if (k9 != null) {
                k9.f2(z3);
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    public void setVideoOptions(k2.w wVar) {
        G0 g02 = this.f38604n;
        g02.f40045j = wVar;
        try {
            K k9 = g02.i;
            if (k9 != null) {
                k9.U0(wVar == null ? null : new Z0(wVar));
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }
}
