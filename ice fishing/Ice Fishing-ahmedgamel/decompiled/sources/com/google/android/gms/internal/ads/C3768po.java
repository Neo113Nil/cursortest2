package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.po, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3768po {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f33920a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:3:0x0001, B:11:0x001a, B:13:0x001f, B:15:0x0028, B:16:0x002d, B:18:0x0030, B:19:0x0035, B:20:0x0044, B:21:0x0045, B:23:0x0054, B:25:0x005a, B:27:0x0063, B:29:0x006b, B:31:0x0070, B:33:0x0079, B:34:0x007e, B:36:0x0082, B:37:0x0087, B:38:0x0096, B:39:0x0097, B:44:0x00a7, B:46:0x00d5, B:48:0x00df, B:49:0x00e7, B:50:0x00ee, B:52:0x00f4, B:54:0x00f8, B:56:0x010d, B:57:0x0116, B:59:0x011c, B:62:0x012a, B:65:0x0130, B:66:0x0142, B:68:0x0148, B:71:0x015a, B:74:0x0162, B:86:0x0173, B:89:0x017b, B:92:0x0181, B:95:0x018a, B:104:0x0193, B:107:0x00b6, B:108:0x00c5), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(int i, long j6, long j9) {
        int i4;
        ArrayDeque arrayDeque;
        Long l9;
        try {
            C3324ha c3324ha = AbstractC3592ma.H8;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                if (i == 2) {
                    byte b9 = (byte) (((byte) 1) | 2);
                    if (b9 != 3) {
                        StringBuilder sb = new StringBuilder();
                        if ((b9 & 1) == 0) {
                            sb.append(" id");
                        }
                        if ((b9 & 2) == 0) {
                            sb.append(" eventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    C3714oo c3714oo = new C3714oo(j6, 1);
                    ConcurrentHashMap concurrentHashMap = this.f33920a;
                    ArrayDeque arrayDeque2 = (ArrayDeque) concurrentHashMap.get(c3714oo);
                    if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                        arrayDeque2.removeFirst();
                        if (arrayDeque2.isEmpty()) {
                            concurrentHashMap.remove(c3714oo);
                        }
                    }
                    i = 2;
                }
                byte b10 = (byte) (((byte) 1) | 2);
                if (b10 != 3) {
                    StringBuilder sb2 = new StringBuilder();
                    if ((b10 & 1) == 0) {
                        sb2.append(" id");
                    }
                    if ((b10 & 2) == 0) {
                        sb2.append(" eventType");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                }
                C3714oo c3714oo2 = new C3714oo(j6, i);
                if (i != 0) {
                    if (i == 1) {
                        i4 = ((Integer) rVar.f40509c.a(AbstractC3592ma.O8)).intValue();
                    } else if (i == 2) {
                        i4 = ((Integer) rVar.f40509c.a(AbstractC3592ma.P8)).intValue();
                    } else if (i == 3) {
                        i4 = ((Integer) rVar.f40509c.a(AbstractC3592ma.Q8)).intValue();
                    }
                    if (i4 > 0) {
                        ConcurrentHashMap concurrentHashMap2 = this.f33920a;
                        ArrayDeque arrayDeque3 = (ArrayDeque) concurrentHashMap2.get(c3714oo2);
                        if (arrayDeque3 == null) {
                            arrayDeque3 = new ArrayDeque();
                            concurrentHashMap2.put(c3714oo2, arrayDeque3);
                        }
                        arrayDeque3.addLast(Long.valueOf(j9));
                        while (arrayDeque3.size() > i4) {
                            arrayDeque3.removeFirst();
                        }
                        b();
                        int intValue = ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.R8)).intValue();
                        if (intValue <= 0) {
                            concurrentHashMap2.clear();
                            return;
                        }
                        while (true) {
                            Iterator it = concurrentHashMap2.values().iterator();
                            int i6 = 0;
                            while (it.hasNext()) {
                                i6 += ((ArrayDeque) it.next()).size();
                            }
                            if (i6 <= intValue) {
                                break;
                            }
                            if (!concurrentHashMap2.isEmpty()) {
                                Long l10 = Long.MAX_VALUE;
                                Map.Entry entry = null;
                                for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                                    ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                                    if (!arrayDeque4.isEmpty() && (l9 = (Long) arrayDeque4.peekFirst()) != null && l9.longValue() < l10.longValue()) {
                                        entry = entry2;
                                        l10 = l9;
                                    }
                                }
                                if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                    arrayDeque.removeFirst();
                                    if (arrayDeque.isEmpty()) {
                                        concurrentHashMap2.remove(entry.getKey());
                                    }
                                }
                            }
                        }
                    }
                }
                i4 = 0;
                if (i4 > 0) {
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        long j6;
        C4906k.f40186C.f40198k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = this.f33920a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C3714oo c3714oo = (C3714oo) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int i = c3714oo.f33731b;
            if (i != 0) {
                if (i == 1) {
                    j6 = ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.L8)).longValue();
                } else if (i == 2) {
                    j6 = ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.M8)).longValue();
                } else if (i == 3) {
                    j6 = ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.N8)).longValue();
                }
                if (j6 == 0) {
                    it.remove();
                    j6 = 0;
                }
                if (j6 <= 0) {
                    Iterator it2 = arrayDeque.iterator();
                    while (it2.hasNext() && currentTimeMillis - ((Long) it2.next()).longValue() > j6) {
                        it2.remove();
                    }
                    if (arrayDeque.isEmpty()) {
                        it.remove();
                    }
                }
            }
            j6 = 0;
            if (j6 == 0) {
            }
            if (j6 <= 0) {
            }
        }
    }
}
