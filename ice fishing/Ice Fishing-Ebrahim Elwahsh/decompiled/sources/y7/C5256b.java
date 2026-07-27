package y7;

import java.io.Serializable;
import kotlin.jvm.internal.h;
import r7.AbstractC4973d;
import r7.AbstractC4978i;
import t0.AbstractC5051n;

/* renamed from: y7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5256b extends AbstractC4973d implements InterfaceC5255a, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final Enum[] f41884n;

    public C5256b(Enum[] entries) {
        h.e(entries, "entries");
        this.f41884n = entries;
    }

    @Override // r7.AbstractC4970a
    public final int a() {
        return this.f41884n.length;
    }

    @Override // r7.AbstractC4970a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        h.e(element, "element");
        return ((Enum) AbstractC4978i.O(this.f41884n, element.ordinal())) == element;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f41884n;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override // r7.AbstractC4973d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        h.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC4978i.O(this.f41884n, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // r7.AbstractC4973d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        h.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC4978i.O(this.f41884n, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }
}
