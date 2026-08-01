package u2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3171f5;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2991bm;
import com.google.android.gms.internal.ads.C3064d5;
import com.google.android.gms.internal.ads.C3709p5;
import com.google.android.gms.internal.ads.V2;
import java.io.File;
import java.util.regex.Pattern;
import q2.C4900p;

/* loaded from: classes.dex */
public final class k extends C2991bm {

    /* renamed from: w, reason: collision with root package name */
    public final Context f41295w;

    public k(Context context, V2 v22) {
        super(v22);
        this.f41295w = context;
    }

    public static S0.q W(Context context) {
        S0.q qVar = new S0.q(new C3709p5(new File(new File(context.getCacheDir(), "admob_volley").getPath())), new k(context, new V2(20)));
        qVar.n();
        return qVar;
    }

    @Override // com.google.android.gms.internal.ads.C2991bm, com.google.android.gms.internal.ads.InterfaceC2903a5
    public final C3064d5 h(AbstractC3171f5 abstractC3171f5) {
        if (abstractC3171f5.f30043u == 0) {
            String str = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32347q5);
            String str2 = abstractC3171f5.f30044v;
            if (Pattern.matches(str, str2)) {
                v2.d dVar = C4900p.f40199g.f40200a;
                M2.f fVar = M2.f.f1844b;
                Context context = this.f41295w;
                if (fVar.c(context, 13400000) == 0) {
                    C3064d5 h9 = new N1.h(context).h(abstractC3171f5);
                    if (h9 != null) {
                        z.k("Got gmscore asset response: ".concat(String.valueOf(str2)));
                        return h9;
                    }
                    z.k("Failed to get gmscore asset response: ".concat(String.valueOf(str2)));
                }
            }
        }
        return super.h(abstractC3171f5);
    }
}
