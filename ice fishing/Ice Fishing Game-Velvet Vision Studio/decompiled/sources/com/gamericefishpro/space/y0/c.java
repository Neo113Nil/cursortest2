package com.gamericefishpro.space.y0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Iterator, com.gamericefishpro.space.fi.a {
    public final j[] d;
    public int e;
    public boolean i = true;

    public c(i iVar, j[] jVarArr) {
        this.d = jVarArr;
        jVarArr[0].a(iVar.d, Integer.bitCount(iVar.a) * 2, 0);
        this.e = 0;
        a();
    }

    public final void a() {
        int i = this.e;
        j[] jVarArr = this.d;
        j jVar = jVarArr[i];
        if (jVar.i < jVar.e) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                j jVar2 = jVarArr[i];
                int i2 = jVar2.i;
                Object[] objArr = jVar2.d;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    jVar2.i = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.e = iB;
                return;
            }
            if (i > 0) {
                j jVar3 = jVarArr[i - 1];
                int i3 = jVar3.i;
                int length2 = jVar3.d.length;
                jVar3.i = i3 + 1;
            }
            jVarArr[i].a(i.e.d, 0, 0);
            i--;
        }
        this.i = false;
    }

    public final int b(int i) {
        j[] jVarArr = this.d;
        j jVar = jVarArr[i];
        int i2 = jVar.i;
        if (i2 < jVar.e) {
            return i;
        }
        Object[] objArr = jVar.d;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        i iVar = (i) obj;
        if (i == 6) {
            j jVar2 = jVarArr[i + 1];
            Object[] objArr2 = iVar.d;
            jVar2.a(objArr2, objArr2.length, 0);
        } else {
            jVarArr[i + 1].a(iVar.d, Integer.bitCount(iVar.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.i) {
            throw new NoSuchElementException();
        }
        Object next = this.d[this.e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
