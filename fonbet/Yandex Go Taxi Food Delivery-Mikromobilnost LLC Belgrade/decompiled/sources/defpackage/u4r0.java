package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public class u4r0 extends t4r0 {
    public static HashSet c(Object... objArr) {
        HashSet hashSet = new HashSet(gw00.d(objArr.length));
        j73.Z(objArr, hashSet);
        return hashSet;
    }

    public static Set d(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(gw00.d(objArr.length));
        j73.Z(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set e(Object obj) {
        return obj != null ? Collections.singleton(obj) : EmptySet.a;
    }
}
