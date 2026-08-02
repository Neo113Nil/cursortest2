package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import com.yandex.passport.internal.ui.bouncer.model.k2;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h0 implements f0 {
    public final com.yandex.passport.internal.l a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final u h;
    public final String i;
    public final List j;
    public final k2 k;
    public final String l;

    public h0(com.yandex.passport.internal.l lVar, String str, String str2, String str3, String str4, String str5, boolean z, u uVar, String str6, List list, k2 k2Var) {
        lVar.getClass();
        list.getClass();
        this.a = lVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = uVar;
        this.i = str6;
        this.j = list;
        this.k = k2Var;
        this.l = str5 == null ? null : str5;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final k2 a() {
        return this.k;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final String b() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final String c() {
        return this.l;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final String d() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final u e() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof h0) {
                h0 h0Var = (h0) obj;
                if (Intrinsics.d(this.a, h0Var.a) && Intrinsics.d(this.b, h0Var.b) && Intrinsics.d(this.c, h0Var.c) && Intrinsics.d(this.d, h0Var.d) && Intrinsics.d(this.e, h0Var.e)) {
                    String str = h0Var.f;
                    String str2 = this.f;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && this.g == h0Var.g && this.h.equals(h0Var.h) && Intrinsics.d(this.i, h0Var.i) && Intrinsics.d(this.j, h0Var.j) && this.k == h0Var.k) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final boolean f() {
        return this.g;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final List g() {
        return this.j;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.roundabout.items.f0
    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (this.h.hashCode() + k5r.e((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.g)) * 31;
        String str6 = this.i;
        return this.k.hashCode() + k5r.d((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultAccount(modernAccount=");
        sb.append(this.a);
        sb.append(", publicName=");
        sb.append(this.b);
        sb.append(", displayLogin=");
        sb.append(this.c);
        sb.append(", phoneNumber=");
        sb.append(this.d);
        sb.append(", email=");
        sb.append(this.e);
        sb.append(", avatarCommonUrl=");
        String str = this.f;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.common.url.b.m(str)));
        sb.append(", hasPlus=");
        sb.append(this.g);
        sb.append(", variant=");
        sb.append(this.h);
        sb.append(", deleteMessageOverride=");
        sb.append(this.i);
        sb.append(", badges=");
        sb.append(this.j);
        sb.append(", displayState=");
        sb.append(this.k);
        sb.append(')');
        return sb.toString();
    }
}
