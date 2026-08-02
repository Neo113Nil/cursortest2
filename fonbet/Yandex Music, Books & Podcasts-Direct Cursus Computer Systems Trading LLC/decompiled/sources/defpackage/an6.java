package defpackage;

/* loaded from: classes5.dex */
public final class an6 {
    public final int a;
    public final String b;
    public final hjp c;
    public final fyc d;

    public an6(hjp hjpVar, s3r s3rVar) {
        this.b = "topic_space";
        this.a = -1;
        this.d = s3rVar;
        this.c = hjpVar;
    }

    public final int a() {
        int intValue = ((Integer) this.d.call()).intValue();
        int i = this.a;
        return i == -1 ? intValue : Math.min(i, intValue);
    }

    public an6(hjp hjpVar, s3r s3rVar, boolean z) {
        this.b = "title_space";
        this.a = 1;
        this.d = s3rVar;
        this.c = hjpVar;
    }
}
