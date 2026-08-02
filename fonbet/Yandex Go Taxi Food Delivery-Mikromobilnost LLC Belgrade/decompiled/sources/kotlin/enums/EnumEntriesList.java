package kotlin.enums;

import defpackage.g8;
import defpackage.j73;
import defpackage.k4o;
import defpackage.k8;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u00062\u00060\u0007j\u0002`\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/enums/EnumEntriesList;", "", "T", "Lk4o;", "Lk8;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "entries", "[Ljava/lang/Enum;", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
final class EnumEntriesList<T extends Enum<T>> extends k8 implements k4o, RandomAccess, Serializable {
    private final T[] entries;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumEntriesList(Enum[] enumArr) {
        this.entries = enumArr;
    }

    private final void readObject(ObjectInputStream input) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.entries);
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) j73.G(r3.ordinal(), this.entries)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        g8 g8Var = k8.Companion;
        int length = this.entries.length;
        g8Var.getClass();
        g8.b(i, length);
        return this.entries[i];
    }

    @Override // defpackage.z6
    public final int getSize() {
        return this.entries.length;
    }

    @Override // defpackage.k8, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) j73.G(ordinal, this.entries)) == r3) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.k8, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) j73.G(ordinal, this.entries)) == r3) {
            return ordinal;
        }
        return -1;
    }
}
