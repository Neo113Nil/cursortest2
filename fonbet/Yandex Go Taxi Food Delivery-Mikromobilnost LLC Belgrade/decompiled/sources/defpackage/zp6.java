package defpackage;

/* loaded from: classes10.dex */
public abstract class zp6 {
    public int a;

    public final void a(int i) {
        this.a = i | this.a;
    }

    public final boolean b(int i) {
        return (this.a & i) == i;
    }
}
