package bo.app;

import java.io.File;

/* loaded from: classes3.dex */
public final class d7 {
    public final String a;
    public final long[] b;
    public boolean c;
    public j5 d;
    public final int e;
    public final File f;

    public d7(String str, int i, File file) {
        this.a = str;
        this.e = i;
        this.f = file;
        this.b = new long[i];
    }

    public final File a(int i) {
        return new File(this.f, this.a + "." + i + ".tmp");
    }
}
