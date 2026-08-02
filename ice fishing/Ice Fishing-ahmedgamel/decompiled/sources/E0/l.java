package E0;

import N3.C;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public G.i[] f671a;

    /* renamed from: b, reason: collision with root package name */
    public String f672b;

    /* renamed from: c, reason: collision with root package name */
    public int f673c;

    public l() {
        this.f671a = null;
        this.f673c = 0;
    }

    public G.i[] getPathData() {
        return this.f671a;
    }

    public String getPathName() {
        return this.f672b;
    }

    public void setPathData(G.i[] iVarArr) {
        G.i[] iVarArr2 = this.f671a;
        boolean z6 = false;
        if (iVarArr2 != null && iVarArr != null && iVarArr2.length == iVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= iVarArr2.length) {
                    z6 = true;
                    break;
                }
                G.i iVar = iVarArr2[i];
                char c9 = iVar.f1036a;
                G.i iVar2 = iVarArr[i];
                if (c9 != iVar2.f1036a || iVar.f1037b.length != iVar2.f1037b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z6) {
            this.f671a = C.G(iVarArr);
            return;
        }
        G.i[] iVarArr3 = this.f671a;
        for (int i4 = 0; i4 < iVarArr.length; i4++) {
            iVarArr3[i4].f1036a = iVarArr[i4].f1036a;
            int i6 = 0;
            while (true) {
                float[] fArr = iVarArr[i4].f1037b;
                if (i6 < fArr.length) {
                    iVarArr3[i4].f1037b[i6] = fArr[i6];
                    i6++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f671a = null;
        this.f673c = 0;
        this.f672b = lVar.f672b;
        this.f671a = C.G(lVar.f671a);
    }
}
