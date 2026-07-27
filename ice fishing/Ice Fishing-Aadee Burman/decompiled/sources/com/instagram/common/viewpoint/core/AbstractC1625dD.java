package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1625dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1624dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1624dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1624dC A01(C1840gi c1840gi, AbstractC2005jd abstractC2005jd, int i, InterfaceC1622dA interfaceC1622dA) {
        C1624dC c1624dC = new C1624dC(c1840gi, abstractC2005jd, c1840gi.A02().A0A(), i);
        c1624dC.A0b(interfaceC1622dA);
        c1624dC.A0X();
        A01.put(abstractC2005jd.A1D(), new WeakReference<>(c1624dC));
        return c1624dC;
    }

    public static C1624dC A02(String str) {
        WeakReference<C1624dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC2005jd abstractC2005jd, C1624dC c1624dC) {
        A01.put(abstractC2005jd.A1D(), new WeakReference<>(c1624dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
