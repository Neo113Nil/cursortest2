package K0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final String f464e;

    /* renamed from: f, reason: collision with root package name */
    public int f465f;

    /* renamed from: g, reason: collision with root package name */
    public int f466g;

    /* renamed from: h, reason: collision with root package name */
    public int f467h;

    /* renamed from: i, reason: collision with root package name */
    public int f468i;

    public a(String str) {
        this.f464e = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        int i3;
        int i4 = this.f465f;
        if (i4 != 0) {
            return i4 == 1;
        }
        if (this.f468i < 0) {
            this.f465f = 2;
            return false;
        }
        String str = this.f464e;
        int length = str.length();
        int length2 = str.length();
        for (int i5 = this.f466g; i5 < length2; i5++) {
            char charAt = str.charAt(i5);
            if (charAt == '\n' || charAt == '\r') {
                i2 = (charAt == '\r' && (i3 = i5 + 1) < str.length() && str.charAt(i3) == '\n') ? 2 : 1;
                length = i5;
                this.f465f = 1;
                this.f468i = i2;
                this.f467h = length;
                return true;
            }
        }
        i2 = -1;
        this.f465f = 1;
        this.f468i = i2;
        this.f467h = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f465f = 0;
        int i2 = this.f467h;
        int i3 = this.f466g;
        this.f466g = this.f468i + i2;
        return this.f464e.subSequence(i3, i2).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
