package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class l00 {
    public final long MdtA4re8;
    public final int NCTxEWno;
    public final int qoPGr6Ce;
    public final long wxUZMvaN;

    public l00(int i, int i2, long j, long j2) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = i2;
        this.MdtA4re8 = j;
        this.wxUZMvaN = j2;
    }

    public static l00 qoPGr6Ce(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            l00 l00Var = new l00(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return l00Var;
        } finally {
        }
    }

    public final void NCTxEWno(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.qoPGr6Ce);
            dataOutputStream.writeInt(this.NCTxEWno);
            dataOutputStream.writeLong(this.MdtA4re8);
            dataOutputStream.writeLong(this.wxUZMvaN);
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
        if (obj != null && (obj instanceof l00)) {
            l00 l00Var = (l00) obj;
            if (this.NCTxEWno == l00Var.NCTxEWno && this.MdtA4re8 == l00Var.MdtA4re8 && this.qoPGr6Ce == l00Var.qoPGr6Ce && this.wxUZMvaN == l00Var.wxUZMvaN) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.NCTxEWno), Long.valueOf(this.MdtA4re8), Integer.valueOf(this.qoPGr6Ce), Long.valueOf(this.wxUZMvaN));
    }
}
