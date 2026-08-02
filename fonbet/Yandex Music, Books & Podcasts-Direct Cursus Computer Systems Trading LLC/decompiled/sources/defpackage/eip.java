package defpackage;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class eip implements Externalizable {

    @NotNull
    public static final dip b = new dip(null);
    private static final long serialVersionUID = 0;
    public Object a;

    public eip() {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.a = e5bVar;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException(k5r.i(readByte, "Unsupported flags value: "));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(hrg.o("Illegal size value: ", readInt, '.'));
        }
        f9h f9hVar = new f9h(readInt);
        for (int i = 0; i < readInt; i++) {
            f9hVar.put(objectInput.readObject(), objectInput.readObject());
        }
        this.a = f9hVar.b();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
