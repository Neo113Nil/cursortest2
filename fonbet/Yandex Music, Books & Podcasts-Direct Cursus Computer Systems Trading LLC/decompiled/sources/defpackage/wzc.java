package defpackage;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class wzc {
    public static final /* synthetic */ s9f[] e;
    public int c;
    public final vzc a = new vzc(this, 0);
    public final vzc b = new vzc(this, 1);
    public final HashMap d = new HashMap();

    static {
        opi opiVar = new opi(wzc.class, "enabled", "getEnabled()Z", 0);
        ern.a.getClass();
        e = new s9f[]{opiVar, new opi(wzc.class, "gainDb", "getGainDb()F", 0)};
    }

    public final void a(szc szcVar) {
        szcVar.k = ((Boolean) this.a.getValue(this, e[0])).booleanValue();
        szcVar.l = Math.pow(10.0d, ((Number) this.b.getValue(this, r1[1])).floatValue() / 20.0d);
    }
}
