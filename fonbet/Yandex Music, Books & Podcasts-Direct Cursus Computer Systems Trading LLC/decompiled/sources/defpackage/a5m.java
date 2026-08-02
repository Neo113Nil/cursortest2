package defpackage;

import android.content.Context;
import io.appmetrica.analytics.RtmConfig;

/* loaded from: classes5.dex */
public final class a5m {
    public final String a;
    public final String b;
    public final Context c;
    public final String d;
    public final RtmConfig.Environment e;
    public final int f;
    public final jyr g;

    public a5m(Context context, z4m z4mVar, String str, String str2) {
        String str3;
        RtmConfig.Environment environment;
        int i;
        z4mVar.getClass();
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = context.getApplicationContext();
        int ordinal = z4mVar.ordinal();
        if (ordinal == 0) {
            str3 = "2ca89da6-ea92-4997-80c4-6f78e0b7c571";
        } else {
            if (ordinal != 1) {
                b6e.s();
                throw null;
            }
            str3 = "efc3d9ed-dd0d-44a1-a61a-3dac9b777047";
        }
        this.d = str3;
        int ordinal2 = z4mVar.ordinal();
        if (ordinal2 == 0) {
            environment = RtmConfig.Environment.TESTING;
        } else {
            if (ordinal2 != 1) {
                b6e.s();
                throw null;
            }
            environment = RtmConfig.Environment.PRODUCTION;
        }
        this.e = environment;
        int ordinal3 = z4mVar.ordinal();
        if (ordinal3 == 0) {
            i = 2;
        } else {
            if (ordinal3 != 1) {
                b6e.s();
                throw null;
            }
            i = 4;
        }
        this.f = i;
        this.g = btf.b(new ril(14, this));
    }
}
