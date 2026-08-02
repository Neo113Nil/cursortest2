package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class fip implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public transient String b;

    public fip(String str) {
        if (str != null) {
            this.a = str;
        } else {
            xq0.q("Null String illegal for SerializedString");
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.b = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != fip.class) {
            return false;
        }
        return this.a.equals(((fip) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public Object readResolve() {
        return new fip(this.b);
    }

    public final String toString() {
        return this.a;
    }
}
