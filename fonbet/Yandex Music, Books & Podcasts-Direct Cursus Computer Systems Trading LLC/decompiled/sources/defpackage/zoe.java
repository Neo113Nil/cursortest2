package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* loaded from: classes5.dex */
public final class zoe implements Externalizable {
    private static final long serialVersionUID = 0;
    public long a;
    public int b;

    private final Object readResolve() {
        voe voeVar = voe.c;
        return kg5.u(this.b, this.a);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        this.a = objectInput.readLong();
        this.b = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeLong(this.a);
        objectOutput.writeInt(this.b);
    }
}
