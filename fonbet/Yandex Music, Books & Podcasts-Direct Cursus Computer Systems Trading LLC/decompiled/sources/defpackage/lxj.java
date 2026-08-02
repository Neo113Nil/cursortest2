package defpackage;

import java.util.regex.Pattern;
import okhttp3.OkHttpClient;

/* loaded from: classes6.dex */
public final class lxj {
    public static final twh d;
    public final OkHttpClient a;
    public final n4f b;
    public final String c;

    static {
        twh twhVar;
        Pattern pattern = twh.e;
        try {
            twhVar = q5g.C("application/json");
        } catch (IllegalArgumentException unused) {
            twhVar = null;
        }
        d = twhVar;
    }

    public lxj(OkHttpClient okHttpClient, n4f n4fVar, String str) {
        str.getClass();
        this.a = okHttpClient;
        this.b = n4fVar;
        this.c = str;
    }
}
