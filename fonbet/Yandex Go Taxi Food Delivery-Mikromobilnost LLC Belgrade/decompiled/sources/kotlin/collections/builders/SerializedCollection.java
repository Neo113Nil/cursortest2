package kotlin.collections.builders;

import defpackage.oyr;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "", "collection", "Ljava/util/Collection;", "", "tag", CA20Status.STATUS_USER_I, "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SerializedCollection implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection<?> collection;
    private final int tag;

    public SerializedCollection(int i, Collection collection) {
        this.collection = collection;
        this.tag = i;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Collection<?> j;
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException(oyr.e('.', readByte, "Unsupported flags value: "));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(oyr.e('.', readInt, "Illegal size value: "));
        }
        int i2 = 0;
        if (i == 0) {
            ListBuilder listBuilder = new ListBuilder(readInt);
            while (i2 < readInt) {
                listBuilder.add(objectInput.readObject());
                i2++;
            }
            j = listBuilder.j();
        } else {
            if (i != 1) {
                throw new InvalidObjectException(oyr.e('.', i, "Unsupported collection type tag: "));
            }
            SetBuilder setBuilder = new SetBuilder(new MapBuilder(readInt));
            while (i2 < readInt) {
                setBuilder.add(objectInput.readObject());
                i2++;
            }
            j = setBuilder.b();
        }
        this.collection = j;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public SerializedCollection() {
        this(0, EmptyList.a);
    }
}
