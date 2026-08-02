package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class mb7 {
    public Uri a;
    public long b;
    public int c;
    public byte[] d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;

    public final nb7 a() {
        vq1.C(this.a, "The uri must be set.");
        return new nb7(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
