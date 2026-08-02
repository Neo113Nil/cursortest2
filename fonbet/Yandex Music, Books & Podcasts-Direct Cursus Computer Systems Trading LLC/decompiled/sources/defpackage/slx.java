package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class slx {
    protected int zza;

    public static void b(ArrayList arrayList, List list) {
        Charset charset = smx.a;
        int size = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        }
        if (list instanceof inx) {
            inx inxVar = (inx) list;
            int i = inxVar.c + size;
            int length = inxVar.b.length;
            if (i > length) {
                while (length < i) {
                    length = tlm.b(length, 3, 2, 1);
                }
                inxVar.b = Arrays.copyOf(inxVar.b, length);
            }
        }
        int size2 = list.size();
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String c = dfi.c(list.size() - size2, "Element at index ", " is null.");
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        jj4.j(c);
                        return;
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public abstract int a(knx knxVar);
}
