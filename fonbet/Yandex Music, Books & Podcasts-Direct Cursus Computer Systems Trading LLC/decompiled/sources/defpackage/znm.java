package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public final class znm {
    public static final long c;
    public final to3 a;
    public final hj2 b = new hj2(1);

    static {
        msa msaVar = nsa.b;
        c = nsa.f(yd5.M(7, ssa.DAYS));
    }

    public znm(Context context) {
        this.a = new to3(new File(context.getCacheDir(), "bdu_cache_lottie"), 20971520L);
    }
}
