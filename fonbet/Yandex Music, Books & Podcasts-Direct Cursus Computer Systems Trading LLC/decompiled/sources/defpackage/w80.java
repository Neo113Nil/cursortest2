package defpackage;

/* loaded from: classes.dex */
public final class w80 {
    public int a;

    public w80(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return f1d.i(sb, this.a, " }");
    }
}
