package defpackage;

import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class yeo {
    public final String a;
    public final String b;
    public final int c;

    public yeo(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public abstract void a(xjo xjoVar);

    public abstract void b(xjo xjoVar);

    public abstract void c(xjo xjoVar);

    public abstract void d(xjo xjoVar);

    public abstract void e(xjo xjoVar);

    public abstract void f(xjo xjoVar);

    public abstract c7f g(xjo xjoVar);

    public Map h() {
        return uah.e(new Pair("url", this.a), new Pair("imageSize", this.b), new Pair("sampleSize", Integer.valueOf(this.c)));
    }

    public yeo(int i, String str, String str2) {
        this.c = i;
        this.a = str;
        this.b = str2;
    }
}
