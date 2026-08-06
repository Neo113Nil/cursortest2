package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class is0 {
    public final int GWasM1elztuh;
    public final long X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final long xqGvceK5x;

    public is0(int i, int i2, long j, long j2) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        this.X1lG3V04pd = j;
        this.xqGvceK5x = j2;
    }

    public static is0 GWasM1elztuh(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            is0 is0Var = new is0(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return is0Var;
        } finally {
        }
    }

    public final void Yi7zF1RB1(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.GWasM1elztuh);
            dataOutputStream.writeInt(this.Yi7zF1RB1);
            dataOutputStream.writeLong(this.X1lG3V04pd);
            dataOutputStream.writeLong(this.xqGvceK5x);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof is0)) {
            is0 is0Var = (is0) obj;
            if (this.Yi7zF1RB1 == is0Var.Yi7zF1RB1 && this.X1lG3V04pd == is0Var.X1lG3V04pd && this.GWasM1elztuh == is0Var.GWasM1elztuh && this.xqGvceK5x == is0Var.xqGvceK5x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.Yi7zF1RB1), Long.valueOf(this.X1lG3V04pd), Integer.valueOf(this.GWasM1elztuh), Long.valueOf(this.xqGvceK5x));
    }
}
