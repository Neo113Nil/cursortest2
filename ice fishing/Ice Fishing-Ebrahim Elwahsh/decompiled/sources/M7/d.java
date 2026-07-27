package M7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class d implements Iterator, F7.a {

    /* renamed from: n, reason: collision with root package name */
    public final String f1926n;

    /* renamed from: u, reason: collision with root package name */
    public int f1927u;

    /* renamed from: v, reason: collision with root package name */
    public int f1928v;

    /* renamed from: w, reason: collision with root package name */
    public int f1929w;

    /* renamed from: x, reason: collision with root package name */
    public int f1930x;

    public d(String string) {
        kotlin.jvm.internal.h.e(string, "string");
        this.f1926n = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i4;
        int i9 = this.f1927u;
        if (i9 != 0) {
            return i9 == 1;
        }
        if (this.f1930x < 0) {
            this.f1927u = 2;
            return false;
        }
        String str = this.f1926n;
        int length = str.length();
        int length2 = str.length();
        for (int i10 = this.f1928v; i10 < length2; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i4 = i10 + 1) < str.length() && str.charAt(i4) == '\n') ? 2 : 1;
                length = i10;
                this.f1927u = 1;
                this.f1930x = i;
                this.f1929w = length;
                return true;
            }
        }
        i = -1;
        this.f1927u = 1;
        this.f1930x = i;
        this.f1929w = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1927u = 0;
        int i = this.f1929w;
        int i4 = this.f1928v;
        this.f1928v = this.f1930x + i;
        return this.f1926n.subSequence(i4, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
