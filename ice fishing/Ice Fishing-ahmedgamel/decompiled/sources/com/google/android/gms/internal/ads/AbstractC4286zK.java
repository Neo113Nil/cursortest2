package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.zK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4286zK {
    protected transient int zzq;

    public static void e(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof InterfaceC4125wL) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof C4233yL) {
                C4233yL c4233yL = (C4233yL) list;
                int i = ((C4233yL) list).f35937v + size;
                int length = c4233yL.f35936u.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        c4233yL.f35936u = Arrays.copyOf(c4233yL.f35936u, length);
                    } else {
                        c4233yL.f35936u = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    TK.l(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Object obj2 = list2.get(i4);
            if (obj2 == null) {
                TK.l(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final HK a() {
        try {
            int d9 = ((VK) this).d(null);
            HK hk = JK.f26428u;
            byte[] bArr = new byte[d9];
            MK mk = new MK(bArr, d9);
            ((VK) this).v(mk);
            mk.k0();
            return new HK(bArr);
        } catch (IOException e9) {
            throw new RuntimeException(f("ByteString"), e9);
        }
    }

    public final byte[] b() {
        try {
            int d9 = ((VK) this).d(null);
            byte[] bArr = new byte[d9];
            MK mk = new MK(bArr, d9);
            ((VK) this).v(mk);
            mk.k0();
            return bArr;
        } catch (IOException e9) {
            throw new RuntimeException(f("byte array"), e9);
        }
    }

    public final void c(OutputStream outputStream) {
        VK vk = (VK) this;
        int d9 = vk.d(null);
        if (d9 > 4096) {
            d9 = 4096;
        }
        NK nk = new NK(outputStream, d9);
        vk.v(nk);
        if (nk.f27266x > 0) {
            nk.X1();
        }
    }

    public abstract int d(DL dl);

    public final String f(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + str.length() + 44);
        AbstractC5128c.h(sb, "Serializing ", name, " to a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }
}
