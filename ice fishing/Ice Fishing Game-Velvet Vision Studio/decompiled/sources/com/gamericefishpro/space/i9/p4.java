package com.gamericefishpro.space.i9;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p4 {
    protected int zza;

    public static void c(Iterable iterable, List list) {
        Charset charset = n5.a;
        iterable.getClass();
        if (iterable instanceof r5) {
            List listA = ((r5) iterable).a();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = listA.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof w4) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                w4.f(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof e6) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof g6) {
                g6 g6Var = (g6) list;
                int i = g6Var.i + size;
                int length = g6Var.e.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        g6Var.e = Arrays.copyOf(g6Var.e, length);
                    } else {
                        g6Var.e = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    f5.a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                f5.a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] a() {
        try {
            g5 g5Var = (g5) this;
            int iK = g5Var.k();
            byte[] bArr = new byte[iK];
            x4 x4Var = new x4(iK, bArr);
            g5Var.d(x4Var);
            if (iK - x4Var.j == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(com.gamericefishpro.space.m5.a.j(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public abstract int b(i6 i6Var);
}
