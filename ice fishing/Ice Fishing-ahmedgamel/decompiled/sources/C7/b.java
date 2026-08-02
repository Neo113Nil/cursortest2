package C7;

import java.io.Serializable;
import kotlin.jvm.internal.h;
import v7.AbstractC5113d;
import v7.AbstractC5118i;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class b extends AbstractC5113d implements a, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final Enum[] f331n;

    public b(Enum[] entries) {
        h.e(entries, "entries");
        this.f331n = entries;
    }

    @Override // v7.AbstractC5110a
    public final int a() {
        return this.f331n.length;
    }

    @Override // v7.AbstractC5110a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        h.e(element, "element");
        return ((Enum) AbstractC5118i.A(this.f331n, element.ordinal())) == element;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f331n;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override // v7.AbstractC5113d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        h.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC5118i.A(this.f331n, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // v7.AbstractC5113d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        h.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC5118i.A(this.f331n, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }
}
