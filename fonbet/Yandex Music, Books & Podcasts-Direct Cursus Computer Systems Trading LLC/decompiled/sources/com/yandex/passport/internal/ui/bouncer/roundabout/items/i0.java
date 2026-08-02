package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import com.yandex.passport.internal.ui.bouncer.model.k2;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 implements f0 {
    public final com.yandex.passport.common.core.f a;
    public final com.yandex.passport.common.core.f b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final u h;
    public final boolean i;
    public final k2 j;

    public i0(com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.f fVar2, String str, String str2, String str3, String str4, List list, u uVar, boolean z, k2 k2Var) {
        fVar2.getClass();
        str3.getClass();
        list.getClass();
        this.a = fVar;
        this.b = fVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = uVar;
        this.i = z;
        this.j = k2Var;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final k2 a() {
        return this.j;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final String b() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final String c() {
        return this.f;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final String d() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final u e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.a.equals(i0Var.a) && Intrinsics.d(this.b, i0Var.b) && Intrinsics.d(this.c, i0Var.c) && Intrinsics.d(this.d, i0Var.d) && Intrinsics.d(this.e, i0Var.e) && Intrinsics.d(this.f, i0Var.f) && Intrinsics.d(this.g, i0Var.g) && this.h.equals(i0Var.h) && this.i == i0Var.i && this.j == i0Var.j;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final boolean f() {
        return this.i;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final List g() {
        return this.g;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final String h() {
        return null;
    }

    public final int hashCode() {
        int d = com.appsflyer.internal.k.d(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int c = k5r.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        return this.j.hashCode() + k5r.e((this.h.hashCode() + k5r.d((c + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.g)) * 31, 31, this.i);
    }

    public final String toString() {
        return "MasterMember(uid=" + this.a + ", masterUid=" + this.b + ", displayLogin=" + this.c + ", publicName=" + this.d + ", phoneNumber=" + this.e + ", avatarUrl=" + this.f + ", badges=" + this.g + ", variant=" + this.h + ", hasPlus=" + this.i + ", displayState=" + this.j + ')';
    }
}
