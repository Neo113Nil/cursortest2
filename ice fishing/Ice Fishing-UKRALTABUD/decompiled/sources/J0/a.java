package J0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public final String f455f;

    /* renamed from: g, reason: collision with root package name */
    public int f456g;

    /* renamed from: h, reason: collision with root package name */
    public int f457h;

    /* renamed from: i, reason: collision with root package name */
    public int f458i;

    /* renamed from: j, reason: collision with root package name */
    public int f459j;

    public a(String str) {
        this.f455f = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        int i3;
        int i4 = this.f456g;
        if (i4 != 0) {
            return i4 == 1;
        }
        if (this.f459j < 0) {
            this.f456g = 2;
            return false;
        }
        String str = this.f455f;
        int length = str.length();
        int length2 = str.length();
        for (int i5 = this.f457h; i5 < length2; i5++) {
            char charAt = str.charAt(i5);
            if (charAt == '\n' || charAt == '\r') {
                i2 = (charAt == '\r' && (i3 = i5 + 1) < str.length() && str.charAt(i3) == '\n') ? 2 : 1;
                length = i5;
                this.f456g = 1;
                this.f459j = i2;
                this.f458i = length;
                return true;
            }
        }
        i2 = -1;
        this.f456g = 1;
        this.f459j = i2;
        this.f458i = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f456g = 0;
        int i2 = this.f458i;
        int i3 = this.f457h;
        this.f457h = this.f459j + i2;
        return this.f455f.subSequence(i3, i2).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
