package r0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class d implements Iterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final l[] f5904g;

    /* renamed from: h, reason: collision with root package name */
    public int f5905h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5906i = true;

    public d(k kVar, l[] lVarArr) {
        this.f5904g = lVarArr;
        lVarArr[0].a(kVar.f5920d, Integer.bitCount(kVar.f5917a) * 2, 0);
        this.f5905h = 0;
        a();
    }

    public final void a() {
        int i10 = this.f5905h;
        l[] lVarArr = this.f5904g;
        l lVar = lVarArr[i10];
        if (lVar.f5923i < lVar.f5922h) {
            return;
        }
        while (-1 < i10) {
            int b2 = b(i10);
            if (b2 == -1) {
                l lVar2 = lVarArr[i10];
                int i11 = lVar2.f5923i;
                Object[] objArr = lVar2.f5921g;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    lVar2.f5923i = i11 + 1;
                    b2 = b(i10);
                }
            }
            if (b2 != -1) {
                this.f5905h = b2;
                return;
            }
            if (i10 > 0) {
                l lVar3 = lVarArr[i10 - 1];
                int i12 = lVar3.f5923i;
                int length2 = lVar3.f5921g.length;
                lVar3.f5923i = i12 + 1;
            }
            lVarArr[i10].a(k.f5916e.f5920d, 0, 0);
            i10--;
        }
        this.f5906i = false;
    }

    public final int b(int i10) {
        l[] lVarArr = this.f5904g;
        l lVar = lVarArr[i10];
        int i11 = lVar.f5923i;
        if (i11 < lVar.f5922h) {
            return i10;
        }
        Object[] objArr = lVar.f5921g;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        pc.j.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        k kVar = (k) obj;
        if (i10 == 6) {
            l lVar2 = lVarArr[i10 + 1];
            Object[] objArr2 = kVar.f5920d;
            lVar2.a(objArr2, objArr2.length, 0);
        } else {
            lVarArr[i10 + 1].a(kVar.f5920d, Integer.bitCount(kVar.f5917a) * 2, 0);
        }
        return b(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5906i;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f5906i) {
            throw new NoSuchElementException();
        }
        Object next = this.f5904g[this.f5905h].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
