package com.gamericefishpro.space.mi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, com.gamericefishpro.space.fi.a {
    public final CharSequence d;
    public int e;
    public int i;
    public int v;
    public int w;

    public c(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.d = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.e;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.w < 0) {
            this.e = 2;
            return false;
        }
        CharSequence charSequence = this.d;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.i; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.e = 1;
                this.w = i;
                this.v = length;
                return true;
            }
        }
        i = -1;
        this.e = 1;
        this.w = i;
        this.v = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.e = 0;
        int i = this.v;
        int i2 = this.i;
        this.i = this.w + i;
        return this.d.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
