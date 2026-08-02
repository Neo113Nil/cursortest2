package defpackage;

import android.widget.SeekBar;
import java.util.Collections;

/* loaded from: classes5.dex */
public final class gk4 extends erh {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gk4(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.erh
    public void onProviderAdded(krh krhVar, hrh hrhVar) {
        switch (this.b) {
            case 0:
                hrhVar.getClass();
                jk4.a((jk4) this.c);
                break;
            case 1:
                ((mph) this.c).b();
                break;
        }
    }

    @Override // defpackage.erh
    public void onProviderChanged(krh krhVar, hrh hrhVar) {
        switch (this.b) {
            case 0:
                hrhVar.getClass();
                jk4.a((jk4) this.c);
                break;
            case 1:
                ((mph) this.c).b();
                break;
        }
    }

    @Override // defpackage.erh
    public void onProviderRemoved(krh krhVar, hrh hrhVar) {
        switch (this.b) {
            case 0:
                hrhVar.getClass();
                jk4.a((jk4) this.c);
                break;
            case 1:
                ((mph) this.c).b();
                break;
        }
    }

    @Override // defpackage.erh
    public void onRouteAdded(krh krhVar, irh irhVar) {
        switch (this.b) {
            case 0:
                jk4.a((jk4) this.c);
                break;
            case 1:
                ((mph) this.c).b();
                break;
            case 2:
                ((oph) this.c).f();
                break;
            case 4:
                ((lqh) this.c).e();
                break;
            case 5:
                ((wqh) this.c).l();
                break;
        }
    }

    @Override // defpackage.erh
    public final void onRouteChanged(krh krhVar, irh irhVar) {
        g8c b;
        xqh xqhVar;
        switch (this.b) {
            case 0:
                jk4.a((jk4) this.c);
                break;
            case 1:
                ((mph) this.c).b();
                break;
            case 2:
                ((oph) this.c).f();
                break;
            case 3:
                ((aqh) this.c).o(true);
                break;
            case 4:
                ((lqh) this.c).e();
                break;
            default:
                wqh wqhVar = (wqh) this.c;
                if (irhVar == wqhVar.i && irh.a() != null) {
                    hrh hrhVar = irhVar.a;
                    hrhVar.getClass();
                    krh.b();
                    for (irh irhVar2 : Collections.unmodifiableList(hrhVar.b)) {
                        if (!Collections.unmodifiableList(wqhVar.i.v).contains(irhVar2) && (b = wqhVar.i.b(irhVar2)) != null && (xqhVar = (xqh) b.a) != null && xqhVar.d && !wqhVar.k.contains(irhVar2)) {
                            wqhVar.m();
                            wqhVar.k();
                            break;
                        }
                    }
                }
                wqhVar.l();
                break;
        }
    }

    @Override // defpackage.erh
    public void onRouteRemoved(krh krhVar, irh irhVar) {
        switch (this.b) {
            case 0:
                jk4.a((jk4) this.c);
                break;
            case 1:
                ((mph) this.c).b();
                break;
            case 2:
                ((oph) this.c).f();
                break;
            case 4:
                ((lqh) this.c).e();
                break;
            case 5:
                ((wqh) this.c).l();
                break;
        }
    }

    @Override // defpackage.erh
    public void onRouteSelected(krh krhVar, irh irhVar) {
        switch (this.b) {
            case 0:
                krhVar.getClass();
                irhVar.getClass();
                jk4.a((jk4) this.c);
                break;
            case 1:
                ((mph) this.c).b();
                break;
            case 2:
                ((oph) this.c).dismiss();
                break;
            case 4:
                ((lqh) this.c).dismiss();
                break;
            case 5:
                wqh wqhVar = (wqh) this.c;
                wqhVar.i = irhVar;
                wqhVar.m();
                wqhVar.k();
                break;
        }
    }

    @Override // defpackage.erh
    public void onRouteUnselected(krh krhVar, irh irhVar) {
        switch (this.b) {
            case 0:
                krhVar.getClass();
                irhVar.getClass();
                jk4.a((jk4) this.c);
                break;
            case 1:
                ((mph) this.c).b();
                break;
            case 3:
                ((aqh) this.c).o(false);
                break;
            case 5:
                ((wqh) this.c).l();
                break;
        }
    }

    @Override // defpackage.erh
    public void onRouteVolumeChanged(krh krhVar, irh irhVar) {
        oqh oqhVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 3:
                aqh aqhVar = (aqh) obj;
                SeekBar seekBar = (SeekBar) aqhVar.x0.get(irhVar);
                int i2 = irhVar.p;
                int i3 = aqh.V0;
                if (seekBar != null && aqhVar.X != irhVar) {
                    seekBar.setProgress(i2);
                    break;
                }
                break;
            case 4:
            default:
                super.onRouteVolumeChanged(krhVar, irhVar);
                break;
            case 5:
                irhVar.getClass();
                int i4 = wqh.z0;
                wqh wqhVar = (wqh) obj;
                if (wqhVar.w != irhVar && (oqhVar = (oqh) wqhVar.v.get(irhVar.c)) != null) {
                    int i5 = oqhVar.u.p;
                    oqhVar.u(i5 == 0);
                    oqhVar.w.setProgress(i5);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.erh
    public void onRouterParamsChanged(krh krhVar, mrh mrhVar) {
        switch (this.b) {
            case 1:
                boolean z = mrhVar != null ? mrhVar.d.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
                mph mphVar = (mph) this.c;
                if (mphVar.f != z) {
                    mphVar.f = z;
                    mphVar.refreshDrawableState();
                    break;
                }
                break;
            default:
                super.onRouterParamsChanged(krhVar, mrhVar);
                break;
        }
    }
}
