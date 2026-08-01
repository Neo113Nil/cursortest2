package E0;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public G.i[] f691a;

    /* renamed from: b, reason: collision with root package name */
    public String f692b;

    /* renamed from: c, reason: collision with root package name */
    public int f693c;

    public l() {
        this.f691a = null;
        this.f693c = 0;
    }

    public G.i[] getPathData() {
        return this.f691a;
    }

    public String getPathName() {
        return this.f692b;
    }

    public void setPathData(G.i[] iVarArr) {
        G.i[] iVarArr2 = this.f691a;
        boolean z3 = false;
        if (iVarArr2 != null && iVarArr != null && iVarArr2.length == iVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= iVarArr2.length) {
                    z3 = true;
                    break;
                }
                G.i iVar = iVarArr2[i];
                char c9 = iVar.f1010a;
                G.i iVar2 = iVarArr[i];
                if (c9 != iVar2.f1010a || iVar.f1011b.length != iVar2.f1011b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z3) {
            this.f691a = S0.f.g(iVarArr);
            return;
        }
        G.i[] iVarArr3 = this.f691a;
        for (int i6 = 0; i6 < iVarArr.length; i6++) {
            iVarArr3[i6].f1010a = iVarArr[i6].f1010a;
            int i9 = 0;
            while (true) {
                float[] fArr = iVarArr[i6].f1011b;
                if (i9 < fArr.length) {
                    iVarArr3[i6].f1011b[i9] = fArr[i9];
                    i9++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f691a = null;
        this.f693c = 0;
        this.f692b = lVar.f692b;
        this.f691a = S0.f.g(lVar.f691a);
    }
}
