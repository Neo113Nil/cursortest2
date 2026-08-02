package defpackage;

/* loaded from: classes.dex */
public abstract class gzt extends fzt {
    public fbk[] a;
    public String b;
    public int c;

    public gzt(gzt gztVar) {
        this.a = null;
        this.c = 0;
        this.b = gztVar.b;
        fbk[] fbkVarArr = gztVar.a;
        fbk[] fbkVarArr2 = new fbk[fbkVarArr.length];
        for (int i = 0; i < fbkVarArr.length; i++) {
            fbkVarArr2[i] = new fbk(fbkVarArr[i]);
        }
        this.a = fbkVarArr2;
    }

    public fbk[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(fbk[] fbkVarArr) {
        int i;
        fbk[] fbkVarArr2 = this.a;
        if (fbkVarArr2 != null && fbkVarArr != null && fbkVarArr2.length == fbkVarArr.length) {
            for (0; i < fbkVarArr2.length; i + 1) {
                fbk fbkVar = fbkVarArr2[i];
                char c = fbkVar.a;
                fbk fbkVar2 = fbkVarArr[i];
                i = (c == fbkVar2.a && fbkVar.b.length == fbkVar2.b.length) ? i + 1 : 0;
            }
            fbk[] fbkVarArr3 = this.a;
            for (int i2 = 0; i2 < fbkVarArr.length; i2++) {
                fbkVarArr3[i2].a = fbkVarArr[i2].a;
                int i3 = 0;
                while (true) {
                    float[] fArr = fbkVarArr[i2].b;
                    if (i3 < fArr.length) {
                        fbkVarArr3[i2].b[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        fbk[] fbkVarArr4 = new fbk[fbkVarArr.length];
        for (int i4 = 0; i4 < fbkVarArr.length; i4++) {
            fbkVarArr4[i4] = new fbk(fbkVarArr[i4]);
        }
        this.a = fbkVarArr4;
    }

    public gzt() {
        this.a = null;
        this.c = 0;
    }
}
