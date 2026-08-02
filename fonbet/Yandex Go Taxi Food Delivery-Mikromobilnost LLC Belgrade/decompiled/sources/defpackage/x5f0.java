package defpackage;

/* loaded from: classes8.dex */
public final class x5f0 {
    public final ycs0 a = new ycs0();

    public final vku a(String str) {
        ycs0 ycs0Var = this.a;
        vku vkuVar = (vku) ycs0Var.get(str);
        if (vkuVar != null) {
            return vkuVar;
        }
        vku I = ffx.I(1, 4000, 100, str);
        ycs0Var.put(str, I);
        return I;
    }
}
