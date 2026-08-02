package defpackage;

import android.os.Bundle;
import android.webkit.WebView;
import android.window.OnBackInvokedDispatcher;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.passport.internal.ui.sloth.ebs.d1;
import com.yandex.passport.internal.ui.sloth.ebs.g1;
import com.yandex.passport.internal.ui.sloth.ebs.k;
import com.yandex.passport.internal.ui.sloth.ebs.k1;
import com.yandex.passport.internal.ui.sloth.ebs.m1;
import com.yandex.passport.internal.ui.sloth.ebs.s0;
import com.yandex.plus.home.common.utils.n;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;

/* loaded from: classes.dex */
public final /* synthetic */ class an5 implements uyf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ an5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        switch (this.a) {
            case 0:
                qpj qpjVar = (qpj) this.b;
                hn5 hn5Var = (hn5) this.c;
                if (kyfVar == kyf.ON_CREATE) {
                    OnBackInvokedDispatcher t = rb.t(hn5Var);
                    qpjVar.getClass();
                    qpjVar.e = t;
                    qpjVar.e(qpjVar.g);
                    break;
                }
                break;
            case 1:
                pyf pyfVar = (pyf) this.b;
                r2f r2fVar = (r2f) this.c;
                if (dzfVar.getLifecycle().b() != lyf.a) {
                    int compareTo = dzfVar.getLifecycle().b().compareTo(lyf.d);
                    u98 u98Var = pyfVar.b;
                    if (compareTo >= 0) {
                        if (u98Var.a) {
                            if (!u98Var.b) {
                                u98Var.a = false;
                                u98Var.a();
                                break;
                            } else {
                                xq0.q("Cannot resume a finished dispatcher");
                                break;
                            }
                        }
                    } else {
                        u98Var.a = true;
                        break;
                    }
                } else {
                    r2fVar.g(null);
                    pyfVar.a();
                    break;
                }
                break;
            case 2:
                kyf kyfVar2 = (kyf) this.b;
                aqi aqiVar = (aqi) this.c;
                if (kyfVar == kyfVar2) {
                    ((Function0) aqiVar.getValue()).invoke();
                    break;
                }
                break;
            case 3:
                mxh mxhVar = (mxh) this.b;
                hyh hyhVar = (hyh) this.c;
                mxhVar.getClass();
                if (kyfVar == kyf.ON_DESTROY) {
                    mxhVar.b(hyhVar);
                    break;
                }
                break;
            case 4:
                u7g u7gVar = (u7g) this.b;
                paw pawVar = (paw) this.c;
                int i = gau.a[kyfVar.ordinal()];
                if (i == 1) {
                    if (!(u7gVar instanceof ibu)) {
                        if (!(u7gVar instanceof jbu)) {
                            b6e.s();
                            break;
                        } else {
                            String str = ((jbu) u7gVar).c;
                            str.getClass();
                            e5b e5bVar = e5b.a;
                            e5bVar.getClass();
                            pawVar.y(new VhVideoData(str, "", -9223372036854775807L, null, null, null, false, null, false, null, null, null, new Ott.TrackingData(e5bVar, false, null, null, null, Ott.DeviceType.App), !r19.getTrackings().isEmpty(), null), new PlaybackParameters(false, null, null, null, null, null, false, false, false, null, false, null, null, null));
                            break;
                        }
                    } else {
                        pawVar.H(((ibu) u7gVar).c, new PlaybackParameters(false, null, null, null, null, null, false, false, false, null, false, null, null, null));
                        break;
                    }
                } else if (i == 2) {
                    pawVar.stop();
                    break;
                }
                break;
            case 5:
                g1 g1Var = (g1) this.b;
                sdr sdrVar = (sdr) this.c;
                if (k.a[kyfVar.ordinal()] == 1) {
                    k1 k1Var = ((s0) sdrVar.getValue()).a;
                    if ((k1Var != null ? k1Var.a : null) == m1.m) {
                        g1Var.a(d1.a);
                        break;
                    }
                }
                break;
            case 6:
                WebView webView = (WebView) this.b;
                Bundle bundle = (Bundle) this.c;
                if (kyfVar == kyf.ON_STOP) {
                    webView.saveState(bundle);
                    break;
                }
                break;
            default:
                h hVar = (h) this.b;
                nyf nyfVar = (nyf) this.c;
                if (kyfVar == kyf.ON_DESTROY) {
                    an5 an5Var = (an5) hVar.e;
                    if (an5Var != null) {
                        nyfVar.d(an5Var);
                    }
                    hVar.e = null;
                    hVar.d = n.a;
                    break;
                }
                break;
        }
    }
}
