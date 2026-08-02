package w2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3194f5;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3067cm;
import com.google.android.gms.internal.ads.C3087d5;
import com.google.android.gms.internal.ads.C3732p5;
import com.google.android.gms.internal.ads.V2;
import java.io.File;
import java.util.regex.Pattern;
import s2.C4949p;

/* loaded from: classes.dex */
public final class k extends C3067cm {

    /* renamed from: w, reason: collision with root package name */
    public final Context f41685w;

    public k(Context context, V2 v22) {
        super(v22);
        this.f41685w = context;
    }

    public static S0.q L(Context context) {
        S0.q qVar = new S0.q(new C3732p5(new File(new File(context.getCacheDir(), "admob_volley").getPath())), new k(context, new V2(20)));
        qVar.n();
        return qVar;
    }

    @Override // com.google.android.gms.internal.ads.C3067cm, com.google.android.gms.internal.ads.InterfaceC2926a5
    public final C3087d5 k(AbstractC3194f5 abstractC3194f5) {
        if (abstractC3194f5.f30830u == 0) {
            String str = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33127q5);
            String str2 = abstractC3194f5.f30831v;
            if (Pattern.matches(str, str2)) {
                x2.d dVar = C4949p.f40498g.f40499a;
                O2.f fVar = O2.f.f2270b;
                Context context = this.f41685w;
                if (fVar.c(context, 13400000) == 0) {
                    C3087d5 k9 = new P1.h(context).k(abstractC3194f5);
                    if (k9 != null) {
                        z.k("Got gmscore asset response: ".concat(String.valueOf(str2)));
                        return k9;
                    }
                    z.k("Failed to get gmscore asset response: ".concat(String.valueOf(str2)));
                }
            }
        }
        return super.k(abstractC3194f5);
    }
}
