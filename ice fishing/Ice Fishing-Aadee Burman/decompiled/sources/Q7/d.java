package Q7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class d implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final String f2674n;

    /* renamed from: u, reason: collision with root package name */
    public int f2675u;

    /* renamed from: v, reason: collision with root package name */
    public int f2676v;

    /* renamed from: w, reason: collision with root package name */
    public int f2677w;

    /* renamed from: x, reason: collision with root package name */
    public int f2678x;

    public d(String string) {
        kotlin.jvm.internal.h.e(string, "string");
        this.f2674n = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i6;
        int i9 = this.f2675u;
        if (i9 != 0) {
            return i9 == 1;
        }
        if (this.f2678x < 0) {
            this.f2675u = 2;
            return false;
        }
        String str = this.f2674n;
        int length = str.length();
        int length2 = str.length();
        for (int i10 = this.f2676v; i10 < length2; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i6 = i10 + 1) < str.length() && str.charAt(i6) == '\n') ? 2 : 1;
                length = i10;
                this.f2675u = 1;
                this.f2678x = i;
                this.f2677w = length;
                return true;
            }
        }
        i = -1;
        this.f2675u = 1;
        this.f2678x = i;
        this.f2677w = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2675u = 0;
        int i = this.f2677w;
        int i6 = this.f2676v;
        this.f2676v = this.f2678x + i;
        return this.f2674n.subSequence(i6, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
