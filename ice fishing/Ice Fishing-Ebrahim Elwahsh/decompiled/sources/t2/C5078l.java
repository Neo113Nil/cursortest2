package t2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3074d5;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2881Yl;
import com.google.android.gms.internal.ads.C2965b5;
import com.google.android.gms.internal.ads.C3614n5;
import com.google.android.gms.internal.ads.T2;
import java.io.File;
import java.util.regex.Pattern;
import q2.C4907p;

/* renamed from: t2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5078l extends C2881Yl {

    /* renamed from: w, reason: collision with root package name */
    public final Context f40918w;

    public C5078l(Context context, T2 t22) {
        super(t22);
        this.f40918w = context;
    }

    public static S0.q x(Context context) {
        S0.q qVar = new S0.q(new C3614n5(new File(new File(context.getCacheDir(), "admob_volley").getPath())), new C5078l(context, new T2(20)));
        qVar.n();
        return qVar;
    }

    @Override // com.google.android.gms.internal.ads.C2881Yl, com.google.android.gms.internal.ads.Y4
    public final C2965b5 b(AbstractC3074d5 abstractC3074d5) {
        if (abstractC3074d5.f29794u == 0) {
            String str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31766q5);
            String str2 = abstractC3074d5.f29795v;
            if (Pattern.matches(str, str2)) {
                u2.d dVar = C4907p.f40108g.f40109a;
                L2.f fVar = L2.f.f1726b;
                Context context = this.f40918w;
                if (fVar.c(context, 13400000) == 0) {
                    C2965b5 b9 = new N1.h(context).b(abstractC3074d5);
                    if (b9 != null) {
                        C.k("Got gmscore asset response: ".concat(String.valueOf(str2)));
                        return b9;
                    }
                    C.k("Failed to get gmscore asset response: ".concat(String.valueOf(str2)));
                }
            }
        }
        return super.b(abstractC3074d5);
    }
}
