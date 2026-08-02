package Q7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class d implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final String f2711n;

    /* renamed from: u, reason: collision with root package name */
    public int f2712u;

    /* renamed from: v, reason: collision with root package name */
    public int f2713v;

    /* renamed from: w, reason: collision with root package name */
    public int f2714w;

    /* renamed from: x, reason: collision with root package name */
    public int f2715x;

    public d(String string) {
        kotlin.jvm.internal.h.e(string, "string");
        this.f2711n = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i4;
        int i6 = this.f2712u;
        if (i6 != 0) {
            return i6 == 1;
        }
        if (this.f2715x < 0) {
            this.f2712u = 2;
            return false;
        }
        String str = this.f2711n;
        int length = str.length();
        int length2 = str.length();
        for (int i9 = this.f2713v; i9 < length2; i9++) {
            char charAt = str.charAt(i9);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i4 = i9 + 1) < str.length() && str.charAt(i4) == '\n') ? 2 : 1;
                length = i9;
                this.f2712u = 1;
                this.f2715x = i;
                this.f2714w = length;
                return true;
            }
        }
        i = -1;
        this.f2712u = 1;
        this.f2715x = i;
        this.f2714w = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2712u = 0;
        int i = this.f2714w;
        int i4 = this.f2713v;
        this.f2713v = this.f2715x + i;
        return this.f2711n.subSequence(i4, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
