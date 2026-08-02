package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class t8n {
    public static final HashMap a;
    public static final HashMap b;
    public static final HashMap c;
    public static final HashMap d;
    public static final HashMap e;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        HashMap hashMap3 = new HashMap();
        c = hashMap3;
        HashMap hashMap4 = new HashMap();
        d = hashMap4;
        HashMap hashMap5 = new HashMap();
        e = hashMap5;
        hashMap.put(8, new HashSet(Collections.singletonList(8)));
        hashMap.put(10, new HashSet(Collections.singletonList(10)));
        hashMap.put(0, new HashSet(Arrays.asList(8, 10)));
        hashMap2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        hashMap2.put(1, new HashSet(Collections.singletonList(0)));
        hashMap2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        hashMap2.put(3, new HashSet(Collections.singletonList(1)));
        hashMap2.put(4, new HashSet(Collections.singletonList(2)));
        hashMap2.put(5, new HashSet(Collections.singletonList(3)));
        hashMap2.put(6, new HashSet(Collections.singletonList(4)));
        hashMap3.put(8, 8);
        hashMap3.put(10, 10);
        hashMap4.put(0, 1);
        hashMap4.put(1, 3);
        hashMap4.put(2, 4);
        hashMap4.put(3, 5);
        hashMap4.put(4, 6);
        HashMap hashMap6 = new HashMap();
        q8n q8nVar = q8n.d;
        hashMap6.put(q8nVar, 1);
        q8n q8nVar2 = q8n.e;
        hashMap6.put(q8nVar2, 2);
        q8n q8nVar3 = q8n.f;
        hashMap6.put(q8nVar3, 4096);
        q8n q8nVar4 = q8n.g;
        hashMap6.put(q8nVar4, 8192);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(q8nVar, 1);
        hashMap7.put(q8nVar2, 2);
        hashMap7.put(q8nVar3, 4096);
        hashMap7.put(q8nVar4, 8192);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(q8nVar, 1);
        hashMap8.put(q8nVar2, 4);
        hashMap8.put(q8nVar3, 4096);
        hashMap8.put(q8nVar4, 16384);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(q8n.h, 256);
        hashMap9.put(q8n.i, 512);
        hashMap5.put("video/hevc", hashMap6);
        hashMap5.put("video/av01", hashMap7);
        hashMap5.put("video/x-vnd.on2.vp9", hashMap8);
        hashMap5.put("video/dolby-vision", hashMap9);
    }

    public static boolean a(lzn lznVar, q8n q8nVar) {
        int a2 = lznVar.a();
        Set set = (Set) a.get(Integer.valueOf(q8nVar.b));
        if (set == null || !set.contains(Integer.valueOf(a2))) {
            return false;
        }
        int f = lznVar.f();
        Set set2 = (Set) b.get(Integer.valueOf(q8nVar.a));
        return set2 != null && set2.contains(Integer.valueOf(f));
    }
}
