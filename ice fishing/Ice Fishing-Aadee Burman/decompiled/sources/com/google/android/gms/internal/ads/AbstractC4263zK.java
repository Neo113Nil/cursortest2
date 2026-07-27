package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.zK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4263zK {
    protected transient int zzq;

    public static void e(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof InterfaceC4102wL) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof C4210yL) {
                C4210yL c4210yL = (C4210yL) list;
                int i = ((C4210yL) list).f35151v + size;
                int length = c4210yL.f35150u.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        c4210yL.f35150u = Arrays.copyOf(c4210yL.f35150u, length);
                    } else {
                        c4210yL.f35150u = new Object[Math.max(i, 10)];
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
        for (int i6 = 0; i6 < size3; i6++) {
            Object obj2 = list2.get(i6);
            if (obj2 == null) {
                TK.l(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final HK a() {
        try {
            int d2 = ((VK) this).d(null);
            HK hk = JK.f25675u;
            byte[] bArr = new byte[d2];
            MK mk = new MK(bArr, d2);
            ((VK) this).v(mk);
            mk.k0();
            return new HK(bArr);
        } catch (IOException e9) {
            throw new RuntimeException(f("ByteString"), e9);
        }
    }

    public final byte[] b() {
        try {
            int d2 = ((VK) this).d(null);
            byte[] bArr = new byte[d2];
            MK mk = new MK(bArr, d2);
            ((VK) this).v(mk);
            mk.k0();
            return bArr;
        } catch (IOException e9) {
            throw new RuntimeException(f("byte array"), e9);
        }
    }

    public final void c(OutputStream outputStream) {
        VK vk = (VK) this;
        int d2 = vk.d(null);
        if (d2 > 4096) {
            d2 = 4096;
        }
        NK nk = new NK(outputStream, d2);
        vk.v(nk);
        if (nk.f26482x > 0) {
            nk.X1();
        }
    }

    public abstract int d(DL dl);

    public final String f(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + str.length() + 44);
        u1.h.i(sb, "Serializing ", name, " to a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }
}
