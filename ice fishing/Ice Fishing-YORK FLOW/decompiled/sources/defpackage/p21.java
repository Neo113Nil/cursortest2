package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p21 {
    public final long JhCgjQRTAOCT;
    public final int ZpBGe2uQfcn8;
    public final long fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public p21(int i, int i2, long j, long j2) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        this.fWTAfUmVKrZq = j;
        this.JhCgjQRTAOCT = j2;
    }

    public static defpackage.p21 ZpBGe2uQfcn8(java.io.File file) {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
        try {
            defpackage.p21 p21Var = new defpackage.p21(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return p21Var;
        } finally {
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.p21)) {
            defpackage.p21 p21Var = (defpackage.p21) obj;
            if (this.giKS3J6vZuNy == p21Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == p21Var.fWTAfUmVKrZq && this.ZpBGe2uQfcn8 == p21Var.ZpBGe2uQfcn8 && this.JhCgjQRTAOCT == p21Var.JhCgjQRTAOCT) {
                return true;
            }
        }
        return false;
    }

    public final void giKS3J6vZuNy(java.io.File file) {
        file.delete();
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.ZpBGe2uQfcn8);
            dataOutputStream.writeInt(this.giKS3J6vZuNy);
            dataOutputStream.writeLong(this.fWTAfUmVKrZq);
            dataOutputStream.writeLong(this.JhCgjQRTAOCT);
            dataOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                dataOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.giKS3J6vZuNy), java.lang.Long.valueOf(this.fWTAfUmVKrZq), java.lang.Integer.valueOf(this.ZpBGe2uQfcn8), java.lang.Long.valueOf(this.JhCgjQRTAOCT));
    }
}
