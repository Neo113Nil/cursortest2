package ru.yandex.taxi.delivery;

import defpackage.fa90;
import defpackage.g92;
import defpackage.jtq0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.zuj0;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$LongRef;

/* loaded from: classes9.dex */
public final class b {
    public final jtq0 a;
    public final zuj0 b;
    public final HashMap c = new HashMap();

    public b(zuj0 zuj0Var, jtq0 jtq0Var) {
        this.a = jtq0Var;
        this.b = zuj0Var;
    }

    public final tpr a(String str, String str2, fa90 fa90Var, String str3, List list, Long l, String str4) {
        List list2 = list;
        jtq0 jtq0Var = this.a;
        if (list2 == null || list2.isEmpty()) {
            if (fa90Var == null) {
                return new g92(2, new Pair(str == null ? str3 : str, str2));
            }
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = TimeUnit.SECONDS.toMillis(fa90Var.a()) - jtq0Var.d();
            return new rol0(new DeliveryTitleUpdater$getTitleSubtitleFlow$1(ref$LongRef, this, str2, fa90Var, null));
        }
        long d = jtq0Var.d() / 1000;
        long j = 0;
        if (l != null && l.longValue() > 0) {
            j = l.longValue();
        } else if (str4 == null || str4.length() == 0) {
            j = jtq0Var.d();
        } else {
            HashMap hashMap = this.c;
            if (hashMap.containsKey(str4)) {
                Long l2 = (Long) hashMap.get(str4);
                if (l2 != null) {
                    j = l2.longValue();
                }
            } else {
                j = jtq0Var.d();
                hashMap.put(str4, Long.valueOf(j));
            }
        }
        return new rol0(new DeliveryTitleUpdater$getTimeBoundUpdatesFlow$1(d - (j / 1000), list, str2, null));
    }
}
