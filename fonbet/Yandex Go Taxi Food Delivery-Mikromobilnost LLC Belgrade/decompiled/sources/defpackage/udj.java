package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final class udj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final d82 e;
    public final d82 f;
    public final Runnable g;

    public udj(String str, String str2, Runnable runnable, int i) {
        str = (i & 2) != 0 ? "" : str;
        str2 = (i & 8) != 0 ? "" : str2;
        d82 d82Var = new d82(1);
        d82 d82Var2 = new d82(1);
        runnable = (i & 64) != 0 ? new d82(1) : runnable;
        this.a = "";
        this.b = str;
        this.c = "";
        this.d = str2;
        this.e = d82Var;
        this.f = d82Var2;
        this.g = runnable;
    }

    public udj() {
        this(null, null, null, HProv.PP_VERSION_TIMESTAMP);
    }
}
