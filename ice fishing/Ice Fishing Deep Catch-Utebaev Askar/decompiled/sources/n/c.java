package n;

import java.util.NoSuchElementException;
import kotlin.collections.a0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f219d;

    public c(int i2, int i3, int i4) {
        this.f216a = i4;
        this.f217b = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f218c = z;
        this.f219d = z ? i2 : i3;
    }

    @Override // kotlin.collections.a0
    public final int a() {
        int i2 = this.f219d;
        if (i2 != this.f217b) {
            this.f219d = this.f216a + i2;
        } else {
            if (!this.f218c) {
                throw new NoSuchElementException();
            }
            this.f218c = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f218c;
    }
}
