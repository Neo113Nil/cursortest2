package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z811 {
    public static volatile sbg e;
    public final s3c a;
    public final s3c b;
    public final tjh c;
    public final wd21 d;

    public z811(s3c s3cVar, s3c s3cVar2, tjh tjhVar, wd21 wd21Var, ofa0 ofa0Var) {
        this.a = s3cVar;
        this.b = s3cVar2;
        this.c = tjhVar;
        this.d = wd21Var;
        ((Executor) ofa0Var.a).execute(new ymp0(16, ofa0Var));
    }

    public static z811 a() {
        sbg sbgVar = e;
        if (sbgVar != null) {
            return (z811) sbgVar.y.get();
        }
        ny61.r("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (z811.class) {
                try {
                    if (e == null) {
                        tu6 tu6Var = new tu6();
                        context.getClass();
                        tu6Var.a = context;
                        e = tu6Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final j211 c(d87 d87Var) {
        byte[] bytes;
        Set unmodifiableSet = d87Var instanceof d87 ? Collections.unmodifiableSet(d87.d) : Collections.singleton(new pzn("proto"));
        a94 a = v111.a();
        d87Var.getClass();
        a.a = "cct";
        String str = d87Var.a;
        String str2 = d87Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = b64.l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a.b = bytes;
        return new j211(unmodifiableSet, a.a(), this);
    }
}
