package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* loaded from: classes5.dex */
public final class hwt implements Externalizable {
    private static final long serialVersionUID = 0;
    public long a;
    public long b;

    private final Object readResolve() {
        long j = this.a;
        long j2 = this.b;
        return (j == 0 && j2 == 0) ? fwt.c : new fwt(j, j2);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        this.a = objectInput.readLong();
        this.b = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeLong(this.a);
        objectOutput.writeLong(this.b);
    }
}
