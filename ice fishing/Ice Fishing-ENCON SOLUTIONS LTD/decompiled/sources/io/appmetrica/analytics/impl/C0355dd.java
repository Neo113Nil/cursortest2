package io.appmetrica.analytics.impl;

import java.util.Comparator;

/* renamed from: io.appmetrica.analytics.impl.dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355dd implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = ((C0303bd) obj).f5667a;
        String str2 = ((C0303bd) obj2).f5667a;
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
