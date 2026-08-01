package q0;

import a.AbstractC0078a;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public G.e[] f4266a;

    /* renamed from: b, reason: collision with root package name */
    public String f4267b;

    /* renamed from: c, reason: collision with root package name */
    public int f4268c;

    public l() {
        this.f4266a = null;
        this.f4268c = 0;
    }

    public G.e[] getPathData() {
        return this.f4266a;
    }

    public String getPathName() {
        return this.f4267b;
    }

    public void setPathData(G.e[] eVarArr) {
        G.e[] eVarArr2 = this.f4266a;
        boolean z2 = false;
        if (eVarArr2 != null && eVarArr != null && eVarArr2.length == eVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= eVarArr2.length) {
                    z2 = true;
                    break;
                }
                G.e eVar = eVarArr2[i];
                char c2 = eVar.f266a;
                G.e eVar2 = eVarArr[i];
                if (c2 != eVar2.f266a || eVar.f267b.length != eVar2.f267b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f4266a = AbstractC0078a.t(eVarArr);
            return;
        }
        G.e[] eVarArr3 = this.f4266a;
        for (int i2 = 0; i2 < eVarArr.length; i2++) {
            eVarArr3[i2].f266a = eVarArr[i2].f266a;
            int i3 = 0;
            while (true) {
                float[] fArr = eVarArr[i2].f267b;
                if (i3 < fArr.length) {
                    eVarArr3[i2].f267b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f4266a = null;
        this.f4268c = 0;
        this.f4267b = lVar.f4267b;
        this.f4266a = AbstractC0078a.t(lVar.f4266a);
    }
}
