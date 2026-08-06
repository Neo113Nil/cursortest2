package defpackage;

/* loaded from: classes.dex */
public final class cy0 {
    public final long F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final long r1MBDhnF;

    public cy0(int i, int i2, long j, long j2) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        this.r1MBDhnF = j;
        this.F7NU4MC0GW = j2;
    }

    public static defpackage.cy0 IHQe1A4L2xu(java.io.File file) {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
        try {
            defpackage.cy0 cy0Var = new defpackage.cy0(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return cy0Var;
        } finally {
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.cy0)) {
            defpackage.cy0 cy0Var = (defpackage.cy0) obj;
            if (this.oh6vYeIP == cy0Var.oh6vYeIP && this.r1MBDhnF == cy0Var.r1MBDhnF && this.IHQe1A4L2xu == cy0Var.IHQe1A4L2xu && this.F7NU4MC0GW == cy0Var.F7NU4MC0GW) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.oh6vYeIP), java.lang.Long.valueOf(this.r1MBDhnF), java.lang.Integer.valueOf(this.IHQe1A4L2xu), java.lang.Long.valueOf(this.F7NU4MC0GW));
    }

    public final void oh6vYeIP(java.io.File file) {
        file.delete();
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.IHQe1A4L2xu);
            dataOutputStream.writeInt(this.oh6vYeIP);
            dataOutputStream.writeLong(this.r1MBDhnF);
            dataOutputStream.writeLong(this.F7NU4MC0GW);
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
}
