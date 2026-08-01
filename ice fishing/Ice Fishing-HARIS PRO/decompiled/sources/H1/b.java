package H1;

import java.util.NoSuchElementException;
import u1.r;

/* loaded from: classes.dex */
public final class b extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f347c;

    /* renamed from: d, reason: collision with root package name */
    public int f348d;

    public b(int i, int i2, int i3) {
        this.f345a = i3;
        this.f346b = i2;
        boolean z2 = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z2 = true;
        }
        this.f347c = z2;
        this.f348d = z2 ? i : i2;
    }

    @Override // u1.r
    public final int a() {
        int i = this.f348d;
        if (i != this.f346b) {
            this.f348d = this.f345a + i;
        } else {
            if (!this.f347c) {
                throw new NoSuchElementException();
            }
            this.f347c = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f347c;
    }
}
