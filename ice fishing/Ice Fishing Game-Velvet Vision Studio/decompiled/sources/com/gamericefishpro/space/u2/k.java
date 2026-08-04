package com.gamericefishpro.space.u2;

import com.gamericefishpro.space.ph.x;
import com.onesignal.core.activities.PermissionsActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable {
    public static final k e;
    public static final k i;
    public static final k v;
    public static final k w;
    public static final k y;
    public static final k z;
    public final int d;

    static {
        k kVar = new k(100);
        k kVar2 = new k(200);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
        k kVar6 = new k(600);
        e = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        i = kVar4;
        v = kVar5;
        w = kVar7;
        y = kVar8;
        z = kVar9;
        x.f(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i2) {
        this.d = i2;
        boolean z2 = false;
        if (1 <= i2 && i2 < 1001) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        com.gamericefishpro.space.w2.a.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.d(this.d, ((k) obj).d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.d == ((k) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return com.gamericefishpro.space.m5.a.i(new StringBuilder("FontWeight(weight="), this.d, ')');
    }
}
