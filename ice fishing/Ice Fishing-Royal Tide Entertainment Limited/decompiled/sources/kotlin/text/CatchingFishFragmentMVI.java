package kotlin.text;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishFragmentMVI {
    public final long CatchingFishCoroutine;
    public final int CatchingFishParcelableFAB;
    public final long CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;

    public CatchingFishFragmentMVI(int i, int i2, long j, long j2) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = i2;
        this.CatchingFishCoroutine = j;
        this.CatchingFishReduxKtor = j2;
    }

    public static CatchingFishFragmentMVI CatchingFishParcelableFAB(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            CatchingFishFragmentMVI catchingFishFragmentMVI = new CatchingFishFragmentMVI(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return catchingFishFragmentMVI;
        } finally {
        }
    }

    public final void CatchingFishSnackbar(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.CatchingFishParcelableFAB);
            dataOutputStream.writeInt(this.CatchingFishSnackbar);
            dataOutputStream.writeLong(this.CatchingFishCoroutine);
            dataOutputStream.writeLong(this.CatchingFishReduxKtor);
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
        if (obj != null && (obj instanceof CatchingFishFragmentMVI)) {
            CatchingFishFragmentMVI catchingFishFragmentMVI = (CatchingFishFragmentMVI) obj;
            if (this.CatchingFishSnackbar == catchingFishFragmentMVI.CatchingFishSnackbar && this.CatchingFishCoroutine == catchingFishFragmentMVI.CatchingFishCoroutine && this.CatchingFishParcelableFAB == catchingFishFragmentMVI.CatchingFishParcelableFAB && this.CatchingFishReduxKtor == catchingFishFragmentMVI.CatchingFishReduxKtor) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.CatchingFishSnackbar), Long.valueOf(this.CatchingFishCoroutine), Integer.valueOf(this.CatchingFishParcelableFAB), Long.valueOf(this.CatchingFishReduxKtor));
    }
}
