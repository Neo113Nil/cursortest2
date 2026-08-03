package cc;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: g, reason: collision with root package name */
    public int f1310g;

    /* renamed from: h, reason: collision with root package name */
    public int f1311h;

    /* renamed from: i, reason: collision with root package name */
    public int f1312i;

    /* renamed from: j, reason: collision with root package name */
    public Object f1313j;

    public f() {
        if (u7.d.f6724h == null) {
            u7.d.f6724h = new u7.d();
        }
    }

    public int a(int i10) {
        if (i10 < this.f1312i) {
            return ((ByteBuffer) this.f1313j).getShort(this.f1311h + i10);
        }
        return 0;
    }

    public void b() {
        if (((g) this.f1313j).f1322n != this.f1312i) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i10 = this.f1310g;
            g gVar = (g) this.f1313j;
            if (i10 >= gVar.f1320l || gVar.f1317i[i10] >= 0) {
                return;
            } else {
                this.f1310g = i10 + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f1310g < ((g) this.f1313j).f1320l;
    }

    public void remove() {
        g gVar = (g) this.f1313j;
        b();
        if (this.f1311h == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        gVar.d();
        gVar.m(this.f1311h);
        this.f1311h = -1;
        this.f1312i = gVar.f1322n;
    }
}
