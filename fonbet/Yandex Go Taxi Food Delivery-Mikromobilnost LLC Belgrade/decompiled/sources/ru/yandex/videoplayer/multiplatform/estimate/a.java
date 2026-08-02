package ru.yandex.videoplayer.multiplatform.estimate;

import defpackage.ep4;
import defpackage.f050;
import defpackage.ijo;
import defpackage.jd2;
import defpackage.jl40;
import defpackage.mbs0;
import defpackage.otr0;
import defpackage.tls;
import defpackage.uan;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes7.dex */
public final class a {
    public static volatile a e;
    public static final f050 f = new f050();
    public final LinkedHashSet a;
    public final jd2 b;
    public final ijo c;
    public final tls d;

    public a(double d) {
        this.a = new LinkedHashSet();
        this.b = otr0.a;
        this.c = new ijo(d, true);
        this.d = new tls() { // from class: ru.yandex.videoplayer.multiplatform.estimate.BandwidthEstimator$handleFetcherProgress$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                double d2;
                ep4 ep4Var = (ep4) obj;
                a aVar = a.this;
                double d3 = ep4Var.a;
                double d4 = ep4Var.b;
                ijo ijoVar = aVar.c;
                jd2 jd2Var = aVar.b;
                uan uanVar = ijoVar.d;
                uan uanVar2 = ijoVar.c;
                if (d3 > 0.0d && d4 >= 2000.0d) {
                    if (jd2Var == null) {
                        jd2Var = ijo.g;
                    }
                    uanVar2.a = Math.exp(Math.log(0.5d) / jd2Var.b);
                    uanVar.a = Math.exp(Math.log(0.5d) / jd2Var.a);
                    double d5 = d3 / 1000.0d;
                    double d6 = (8.0d * d4) / d5;
                    if (ijoVar.b) {
                        d5 = 0.1d;
                    }
                    ijoVar.e += d4;
                    uanVar2.a(d5, d6);
                    uanVar.a(d5, d6);
                    mbs0 mbs0Var = ijoVar.f;
                    if (ijoVar.e >= 128000.0d) {
                        double pow = uanVar2.b / (1.0d - Math.pow(uanVar2.a, uanVar2.c));
                        uan uanVar3 = ijoVar.d;
                        d2 = Math.min(pow, uanVar3.b / (1.0d - Math.pow(uanVar3.a, uanVar3.c)));
                    } else {
                        d2 = ijoVar.a;
                    }
                    Double valueOf = Double.valueOf(d2);
                    if (!jl40.l(mbs0Var.a, valueOf)) {
                        mbs0Var.a = valueOf;
                        Iterator it = mbs0Var.b.iterator();
                        while (it.hasNext()) {
                            ((tls) it.next()).invoke(valueOf);
                        }
                    }
                }
                return zy11.a;
            }
        };
    }

    public a() {
        this(Double.NaN);
    }
}
