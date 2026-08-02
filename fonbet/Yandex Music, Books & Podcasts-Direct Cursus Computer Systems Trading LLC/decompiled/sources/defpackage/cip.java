package defpackage;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class cip implements Externalizable {

    @NotNull
    public static final bip c = new bip(null);
    private static final long serialVersionUID = 0;
    public Collection a;
    public final int b;

    public cip(int i, Collection collection) {
        collection.getClass();
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Collection a;
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException(hrg.o("Unsupported flags value: ", readByte, '.'));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(hrg.o("Illegal size value: ", readInt, '.'));
        }
        int i2 = 0;
        if (i == 0) {
            n8g n8gVar = new n8g(readInt);
            while (i2 < readInt) {
                n8gVar.add(objectInput.readObject());
                i2++;
            }
            a = t75.a(n8gVar);
        } else {
            if (i != 1) {
                throw new InvalidObjectException(hrg.o("Unsupported collection type tag: ", i, '.'));
            }
            mnp mnpVar = new mnp(readInt);
            while (i2 < readInt) {
                mnpVar.add(objectInput.readObject());
                i2++;
            }
            a = uop.a(mnpVar);
        }
        this.a = a;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public cip() {
        this(0, c5b.a);
    }
}
