package com.anythink.core.common.v;

import com.anythink.core.common.d.j;
import com.anythink.core.common.h.bv;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17533a = "f";

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r4.contains(3) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r4.contains(1) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(com.anythink.core.d.l lVar, Map<String, Object> map, bv bvVar, com.anythink.core.common.h.ac acVar) {
        if (acVar == null) {
            return;
        }
        double j6 = acVar.j();
        if (j6 < 0.0d) {
            return;
        }
        int k9 = acVar.k();
        boolean l9 = acVar.l();
        List<Integer> m9 = lVar.m();
        if (m9 == null) {
            return;
        }
        boolean o4 = bvVar.o();
        int i = 2;
        boolean z6 = false;
        if (k9 == 22) {
            if (o4) {
            }
            if (!o4) {
            }
            if (!z6) {
                m9.toString();
                return;
            }
            int L2 = (int) ((j6 / lVar.L()) * 100.0d);
            int i4 = l9 ? 3 : 1;
            boolean f2 = acVar.f();
            bvVar.toString();
            m9.toString();
            map.put(j.w.f13419u, Integer.valueOf(i));
            map.put(j.w.f13420v, Integer.valueOf(L2));
            map.put(j.w.f13421w, Integer.valueOf(i4));
            map.put(j.w.f13422x, Integer.valueOf(f2 ? 1 : 0));
            return;
        }
        if (!(o4 && m9.contains(4)) && (o4 || !m9.contains(2))) {
            i = 5;
            if (!z6) {
            }
        } else {
            i = 5;
            z6 = true;
            if (!z6) {
            }
        }
    }
}
