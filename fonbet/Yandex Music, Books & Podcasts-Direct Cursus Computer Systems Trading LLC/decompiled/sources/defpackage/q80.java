package defpackage;

/* loaded from: classes3.dex */
public final class q80 implements t80 {
    public final int a;
    public final int b;

    public q80(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.t80
    public final int a() {
        return this.a;
    }

    @Override // defpackage.t80
    public final String b() {
        return this.b + "_days_ago";
    }
}
