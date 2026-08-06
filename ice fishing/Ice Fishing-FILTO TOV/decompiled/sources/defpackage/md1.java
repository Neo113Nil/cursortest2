package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class md1 extends id1 {
    public final fo0 AvO7iQsrTN;
    public float E7jCp8Ls;
    public wu EljAMC1QTz;
    public long JFJ3QoxA;
    public final co OOA6hdeuvCS;
    public String X1lG3V04pd;
    public final ld1 XnEVoBF0td1l;
    public final yy Yi7zF1RB1;
    public s6 encWxUiV2;
    public final fo0 mOu10nynGul;
    public float rQPn8YBR;
    public boolean xqGvceK5x;

    public md1(yy yyVar) {
        this.Yi7zF1RB1 = yyVar;
        yyVar.mOu10nynGul = new ld1(this, 0);
        this.X1lG3V04pd = "";
        this.xqGvceK5x = true;
        this.OOA6hdeuvCS = new co();
        this.EljAMC1QTz = hf.WIEu4Ya2g8;
        this.AvO7iQsrTN = z50.WRKkgoJXwDn(null);
        this.mOu10nynGul = z50.WRKkgoJXwDn(new t21(0L));
        this.JFJ3QoxA = 9205357640488583168L;
        this.rQPn8YBR = 1.0f;
        this.E7jCp8Ls = 1.0f;
        this.XnEVoBF0td1l = new ld1(this, 1);
    }

    @Override // defpackage.id1
    public final void GWasM1elztuh(ho hoVar) {
        OOA6hdeuvCS(hoVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r3 != (r8 == null ? r8.GWasM1elztuh() : 0)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
    
        if (r9.xqGvceK5x == r3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OOA6hdeuvCS(ho hoVar, float f, s6 s6Var) {
        int i;
        boolean z;
        co coVar;
        s6 s6Var2;
        w0 w0Var;
        long j;
        s6 s6Var3;
        w0 w0Var2;
        int i2;
        int i3;
        yy yyVar = this.Yi7zF1RB1;
        boolean z2 = yyVar.xqGvceK5x;
        fo0 fo0Var = this.AvO7iQsrTN;
        if (z2 && yyVar.OOA6hdeuvCS != 16) {
            s6 s6Var4 = (s6) fo0Var.getValue();
            int i4 = pd1.GWasM1elztuh;
            if (!(s6Var4 instanceof s6) ? s6Var4 == null : !((i3 = s6Var4.X1lG3V04pd) != 5 && i3 != 3)) {
                if (!(s6Var instanceof s6) ? s6Var == null : !((i2 = s6Var.X1lG3V04pd) != 5 && i2 != 3)) {
                    i = 1;
                    z = this.xqGvceK5x;
                    coVar = this.OOA6hdeuvCS;
                    if (!z && t21.GWasM1elztuh(this.JFJ3QoxA, hoVar.xqGvceK5x())) {
                        w0 w0Var3 = coVar.GWasM1elztuh;
                    }
                    if (i != 1) {
                        long j2 = yyVar.OOA6hdeuvCS;
                        int i5 = pd1.GWasM1elztuh;
                        if (yb.xqGvceK5x(j2) != 1.0f) {
                            j2 = yb.Yi7zF1RB1(1.0f, j2);
                        }
                        s6Var2 = new s6(5, j2);
                    } else {
                        s6Var2 = null;
                    }
                    this.encWxUiV2 = s6Var2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> 32));
                    fo0 fo0Var2 = this.mOu10nynGul;
                    this.rQPn8YBR = intBitsToFloat / Float.intBitsToFloat((int) (((t21) fo0Var2.getValue()).GWasM1elztuh >> 32));
                    this.E7jCp8Ls = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & 4294967295L)) / Float.intBitsToFloat((int) (((t21) fo0Var2.getValue()).GWasM1elztuh & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & 4294967295L)))) & 4294967295L);
                    p50 layoutDirection = hoVar.getLayoutDirection();
                    w0Var = coVar.GWasM1elztuh;
                    Jz7YUlEP53 jz7YUlEP53 = coVar.Yi7zF1RB1;
                    if (w0Var != null) {
                        Bitmap bitmap = w0Var.GWasM1elztuh;
                        if (jz7YUlEP53 != null) {
                            j = 4294967295L;
                            if (((int) (ceil >> 32)) <= bitmap.getWidth()) {
                                if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                                }
                            }
                            w0Var = o30.OOA6hdeuvCS((int) (ceil >> 32), (int) (ceil & j), i);
                            Canvas canvas = ddkiCTz5mZ.GWasM1elztuh;
                            jz7YUlEP53 = new Jz7YUlEP53();
                            jz7YUlEP53.GWasM1elztuh = new Canvas(w0Var.GWasM1elztuh);
                            coVar.GWasM1elztuh = w0Var;
                            coVar.Yi7zF1RB1 = jz7YUlEP53;
                            coVar.xqGvceK5x = i;
                            coVar.X1lG3V04pd = ceil;
                            u9 u9Var = coVar.OOA6hdeuvCS;
                            long CMh55RymNfS = o30.CMh55RymNfS(ceil);
                            t9 t9Var = u9Var.OOA6hdeuvCS;
                            el elVar = t9Var.GWasM1elztuh;
                            p50 p50Var = t9Var.Yi7zF1RB1;
                            s9 s9Var = t9Var.X1lG3V04pd;
                            Jz7YUlEP53 jz7YUlEP532 = jz7YUlEP53;
                            long j3 = t9Var.xqGvceK5x;
                            t9Var.GWasM1elztuh = hoVar;
                            t9Var.Yi7zF1RB1 = layoutDirection;
                            t9Var.X1lG3V04pd = jz7YUlEP532;
                            t9Var.xqGvceK5x = CMh55RymNfS;
                            jz7YUlEP532.E7jCp8Ls();
                            ho.k8h8IjolWQ(u9Var, yb.Yi7zF1RB1, 0L, 62);
                            this.XnEVoBF0td1l.mOu10nynGul(u9Var);
                            jz7YUlEP532.JFJ3QoxA();
                            t9 t9Var2 = u9Var.OOA6hdeuvCS;
                            t9Var2.GWasM1elztuh = elVar;
                            t9Var2.Yi7zF1RB1 = p50Var;
                            t9Var2.X1lG3V04pd = s9Var;
                            t9Var2.xqGvceK5x = j3;
                            w0Var.GWasM1elztuh.prepareToDraw();
                            this.xqGvceK5x = false;
                            this.JFJ3QoxA = hoVar.xqGvceK5x();
                            if (s6Var != null) {
                                s6Var3 = s6Var;
                            } else {
                                s6Var3 = ((s6) fo0Var.getValue()) != null ? (s6) fo0Var.getValue() : this.encWxUiV2;
                            }
                            w0Var2 = coVar.GWasM1elztuh;
                            if (w0Var2 == null) {
                                t10.Yi7zF1RB1("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                            }
                            ho.mE4lRynR(hoVar, w0Var2, coVar.X1lG3V04pd, f, s6Var3, 858);
                        }
                    }
                    j = 4294967295L;
                    w0Var = o30.OOA6hdeuvCS((int) (ceil >> 32), (int) (ceil & j), i);
                    Canvas canvas2 = ddkiCTz5mZ.GWasM1elztuh;
                    jz7YUlEP53 = new Jz7YUlEP53();
                    jz7YUlEP53.GWasM1elztuh = new Canvas(w0Var.GWasM1elztuh);
                    coVar.GWasM1elztuh = w0Var;
                    coVar.Yi7zF1RB1 = jz7YUlEP53;
                    coVar.xqGvceK5x = i;
                    coVar.X1lG3V04pd = ceil;
                    u9 u9Var2 = coVar.OOA6hdeuvCS;
                    long CMh55RymNfS2 = o30.CMh55RymNfS(ceil);
                    t9 t9Var3 = u9Var2.OOA6hdeuvCS;
                    el elVar2 = t9Var3.GWasM1elztuh;
                    p50 p50Var2 = t9Var3.Yi7zF1RB1;
                    s9 s9Var2 = t9Var3.X1lG3V04pd;
                    Jz7YUlEP53 jz7YUlEP5322 = jz7YUlEP53;
                    long j32 = t9Var3.xqGvceK5x;
                    t9Var3.GWasM1elztuh = hoVar;
                    t9Var3.Yi7zF1RB1 = layoutDirection;
                    t9Var3.X1lG3V04pd = jz7YUlEP5322;
                    t9Var3.xqGvceK5x = CMh55RymNfS2;
                    jz7YUlEP5322.E7jCp8Ls();
                    ho.k8h8IjolWQ(u9Var2, yb.Yi7zF1RB1, 0L, 62);
                    this.XnEVoBF0td1l.mOu10nynGul(u9Var2);
                    jz7YUlEP5322.JFJ3QoxA();
                    t9 t9Var22 = u9Var2.OOA6hdeuvCS;
                    t9Var22.GWasM1elztuh = elVar2;
                    t9Var22.Yi7zF1RB1 = p50Var2;
                    t9Var22.X1lG3V04pd = s9Var2;
                    t9Var22.xqGvceK5x = j32;
                    w0Var.GWasM1elztuh.prepareToDraw();
                    this.xqGvceK5x = false;
                    this.JFJ3QoxA = hoVar.xqGvceK5x();
                    if (s6Var != null) {
                    }
                    w0Var2 = coVar.GWasM1elztuh;
                    if (w0Var2 == null) {
                    }
                    ho.mE4lRynR(hoVar, w0Var2, coVar.X1lG3V04pd, f, s6Var3, 858);
                }
            }
        }
        i = 0;
        z = this.xqGvceK5x;
        coVar = this.OOA6hdeuvCS;
        if (!z) {
            w0 w0Var32 = coVar.GWasM1elztuh;
        }
        if (i != 1) {
        }
        this.encWxUiV2 = s6Var2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> 32));
        fo0 fo0Var22 = this.mOu10nynGul;
        this.rQPn8YBR = intBitsToFloat2 / Float.intBitsToFloat((int) (((t21) fo0Var22.getValue()).GWasM1elztuh >> 32));
        this.E7jCp8Ls = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & 4294967295L)) / Float.intBitsToFloat((int) (((t21) fo0Var22.getValue()).GWasM1elztuh & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & 4294967295L)))) & 4294967295L);
        p50 layoutDirection2 = hoVar.getLayoutDirection();
        w0Var = coVar.GWasM1elztuh;
        Jz7YUlEP53 jz7YUlEP533 = coVar.Yi7zF1RB1;
        if (w0Var != null) {
        }
        j = 4294967295L;
        w0Var = o30.OOA6hdeuvCS((int) (ceil2 >> 32), (int) (ceil2 & j), i);
        Canvas canvas22 = ddkiCTz5mZ.GWasM1elztuh;
        jz7YUlEP533 = new Jz7YUlEP53();
        jz7YUlEP533.GWasM1elztuh = new Canvas(w0Var.GWasM1elztuh);
        coVar.GWasM1elztuh = w0Var;
        coVar.Yi7zF1RB1 = jz7YUlEP533;
        coVar.xqGvceK5x = i;
        coVar.X1lG3V04pd = ceil2;
        u9 u9Var22 = coVar.OOA6hdeuvCS;
        long CMh55RymNfS22 = o30.CMh55RymNfS(ceil2);
        t9 t9Var32 = u9Var22.OOA6hdeuvCS;
        el elVar22 = t9Var32.GWasM1elztuh;
        p50 p50Var22 = t9Var32.Yi7zF1RB1;
        s9 s9Var22 = t9Var32.X1lG3V04pd;
        Jz7YUlEP53 jz7YUlEP53222 = jz7YUlEP533;
        long j322 = t9Var32.xqGvceK5x;
        t9Var32.GWasM1elztuh = hoVar;
        t9Var32.Yi7zF1RB1 = layoutDirection2;
        t9Var32.X1lG3V04pd = jz7YUlEP53222;
        t9Var32.xqGvceK5x = CMh55RymNfS22;
        jz7YUlEP53222.E7jCp8Ls();
        ho.k8h8IjolWQ(u9Var22, yb.Yi7zF1RB1, 0L, 62);
        this.XnEVoBF0td1l.mOu10nynGul(u9Var22);
        jz7YUlEP53222.JFJ3QoxA();
        t9 t9Var222 = u9Var22.OOA6hdeuvCS;
        t9Var222.GWasM1elztuh = elVar22;
        t9Var222.Yi7zF1RB1 = p50Var22;
        t9Var222.X1lG3V04pd = s9Var22;
        t9Var222.xqGvceK5x = j322;
        w0Var.GWasM1elztuh.prepareToDraw();
        this.xqGvceK5x = false;
        this.JFJ3QoxA = hoVar.xqGvceK5x();
        if (s6Var != null) {
        }
        w0Var2 = coVar.GWasM1elztuh;
        if (w0Var2 == null) {
        }
        ho.mE4lRynR(hoVar, w0Var2, coVar.X1lG3V04pd, f, s6Var3, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.X1lG3V04pd);
        sb.append("\n\tviewportWidth: ");
        fo0 fo0Var = this.mOu10nynGul;
        sb.append(Float.intBitsToFloat((int) (((t21) fo0Var.getValue()).GWasM1elztuh >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((t21) fo0Var.getValue()).GWasM1elztuh & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
