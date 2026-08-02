package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class jhb {
    public static final Set c;
    public final String a;
    public boolean b;

    static {
        y8d y8dVar = y8d.a;
        v9d v9dVar = v9d.a;
        ybd ybdVar = ybd.a;
        j7d j7dVar = j7d.a;
        k7d k7dVar = k7d.a;
        jcd jcdVar = jcd.a;
        icd icdVar = icd.a;
        f7d f7dVar = f7d.a;
        c = xz0.Y(new String[]{"getIntegerValue", "getNumberValue", "getStringValue", "getColorValue", "getColorValue", "getUrlValue", "getUrlValue", "getBooleanValue"});
    }

    public jhb(String str) {
        str.getClass();
        this.a = str;
        this.b = true;
    }

    public abstract Object a(h4b h4bVar);

    public abstract List b();

    public abstract List c();

    public final void d(boolean z) {
        this.b = this.b && z;
    }
}
