package xc;

import ac.i;
import java.util.Iterator;
import java.util.NoSuchElementException;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements Iterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public int f8400g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f8401h;

    /* renamed from: i, reason: collision with root package name */
    public int f8402i;

    /* renamed from: j, reason: collision with root package name */
    public uc.d f8403j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wc.d f8404k;

    public b(wc.d dVar) {
        this.f8404k = dVar;
        int h10 = uc.e.h(0, 0, ((CharSequence) dVar.f7717b).length());
        this.f8401h = h10;
        this.f8402i = h10;
    }

    public final void a() {
        wc.d dVar = this.f8404k;
        CharSequence charSequence = (CharSequence) dVar.f7717b;
        int i10 = this.f8402i;
        if (i10 < 0) {
            this.f8400g = 0;
            this.f8403j = null;
            return;
        }
        if (i10 > charSequence.length()) {
            this.f8403j = new uc.d(this.f8401h, h.p(charSequence), 1);
            this.f8402i = -1;
        } else {
            i iVar = (i) ((a1.g) dVar.f7718c).invoke(charSequence, Integer.valueOf(this.f8402i));
            if (iVar == null) {
                this.f8403j = new uc.d(this.f8401h, h.p(charSequence), 1);
                this.f8402i = -1;
            } else {
                int intValue = ((Number) iVar.f270g).intValue();
                int intValue2 = ((Number) iVar.f271h).intValue();
                this.f8403j = uc.e.q(this.f8401h, intValue);
                int i11 = intValue + intValue2;
                this.f8401h = i11;
                this.f8402i = i11 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.f8400g = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8400g == -1) {
            a();
        }
        return this.f8400g == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8400g == -1) {
            a();
        }
        if (this.f8400g == 0) {
            throw new NoSuchElementException();
        }
        uc.d dVar = this.f8403j;
        j.c(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f8403j = null;
        this.f8400g = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
