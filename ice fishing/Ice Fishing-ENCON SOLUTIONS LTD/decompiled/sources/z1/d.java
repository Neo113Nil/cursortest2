package z1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final String f8631a;

    /* renamed from: b, reason: collision with root package name */
    public int f8632b;

    /* renamed from: c, reason: collision with root package name */
    public int f8633c;

    /* renamed from: d, reason: collision with root package name */
    public int f8634d;

    /* renamed from: e, reason: collision with root package name */
    public int f8635e;

    public d(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        this.f8631a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        int i3;
        int i4 = this.f8632b;
        if (i4 != 0) {
            return i4 == 1;
        }
        if (this.f8635e < 0) {
            this.f8632b = 2;
            return false;
        }
        String str = this.f8631a;
        int length = str.length();
        int length2 = str.length();
        for (int i5 = this.f8633c; i5 < length2; i5++) {
            char charAt = str.charAt(i5);
            if (charAt == '\n' || charAt == '\r') {
                i2 = (charAt == '\r' && (i3 = i5 + 1) < str.length() && str.charAt(i3) == '\n') ? 2 : 1;
                length = i5;
                this.f8632b = 1;
                this.f8635e = i2;
                this.f8634d = length;
                return true;
            }
        }
        i2 = -1;
        this.f8632b = 1;
        this.f8635e = i2;
        this.f8634d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8632b = 0;
        int i2 = this.f8634d;
        int i3 = this.f8633c;
        this.f8633c = this.f8635e + i2;
        return this.f8631a.subSequence(i3, i2).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
