package defpackage;

/* loaded from: classes.dex */
public interface epf extends sv7 {
    default int E(twg twgVar, ffh ffhVar, int i) {
        return c(new sxe(twgVar, twgVar.getLayoutDirection()), new ln7(ffhVar, i8j.b, j8j.b, 2), ia6.b(i, 0, 13)).a();
    }

    default int M(twg twgVar, ffh ffhVar, int i) {
        return c(new sxe(twgVar, twgVar.getLayoutDirection()), new ln7(ffhVar, i8j.a, j8j.a, 2), ia6.b(0, i, 7)).c();
    }

    default int b(twg twgVar, ffh ffhVar, int i) {
        return c(new sxe(twgVar, twgVar.getLayoutDirection()), new ln7(ffhVar, i8j.b, j8j.a, 2), ia6.b(0, i, 7)).c();
    }

    lfh c(mfh mfhVar, ffh ffhVar, long j);

    default int p0(twg twgVar, ffh ffhVar, int i) {
        return c(new sxe(twgVar, twgVar.getLayoutDirection()), new ln7(ffhVar, i8j.a, j8j.b, 2), ia6.b(i, 0, 13)).a();
    }
}
