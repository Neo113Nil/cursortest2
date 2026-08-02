package defpackage;

/* loaded from: classes.dex */
public final class xsb {
    public final xvs a;
    public final int[] b;

    public xsb(int i, xvs xvsVar, int[] iArr) {
        if (iArr.length == 0) {
            vq1.L("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = xvsVar;
        this.b = iArr;
    }
}
