package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public abstract class z431 extends y431 {
    public wr90[] a;
    public String b;
    public int c;

    public z431(z431 z431Var) {
        this.a = null;
        this.c = 0;
        this.b = z431Var.b;
        this.a = n891.j(z431Var.a);
    }

    public final void c(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(Extension.TAB_CHAR);
        }
        wr90[] wr90VarArr = this.a;
        StringBuilder sb2 = new StringBuilder(" ");
        for (wr90 wr90Var : wr90VarArr) {
            sb2.append(wr90Var.a);
            sb2.append(":");
            for (float f : wr90Var.b) {
                sb2.append(f);
                sb2.append(",");
            }
        }
    }

    public wr90[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(wr90[] wr90VarArr) {
        if (!n891.f(this.a, wr90VarArr)) {
            this.a = n891.j(wr90VarArr);
            return;
        }
        wr90[] wr90VarArr2 = this.a;
        for (int i = 0; i < wr90VarArr.length; i++) {
            wr90VarArr2[i].a = wr90VarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = wr90VarArr[i].b;
                if (i2 < fArr.length) {
                    wr90VarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public z431() {
        this.a = null;
        this.c = 0;
    }
}
