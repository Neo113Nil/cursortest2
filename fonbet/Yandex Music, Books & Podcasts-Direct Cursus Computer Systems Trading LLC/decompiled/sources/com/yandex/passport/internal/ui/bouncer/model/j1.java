package com.yandex.passport.internal.ui.bouncer.model;

import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j1 implements k1 {
    public final com.yandex.passport.internal.l a;
    public final com.yandex.passport.internal.entities.e b;
    public final com.yandex.passport.api.w0 c;
    public final String d;
    public final String e;
    public final EnumSet f;

    public j1(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.entities.e eVar, com.yandex.passport.api.w0 w0Var, String str, String str2, EnumSet enumSet, int i) {
        str = (i & 8) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        if ((i & 32) != 0) {
            enumSet = EnumSet.noneOf(com.yandex.passport.internal.ui.domik.w.class);
            enumSet.getClass();
        }
        lVar.getClass();
        w0Var.getClass();
        enumSet.getClass();
        this.a = lVar;
        this.b = eVar;
        this.c = w0Var;
        this.d = str;
        this.e = str2;
        this.f = enumSet;
    }

    public final boolean equals(Object obj) {
        boolean d;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (!Intrinsics.d(this.a, j1Var.a) || !Intrinsics.d(this.b, j1Var.b) || this.c != j1Var.c) {
            return false;
        }
        String str = j1Var.d;
        String str2 = this.d;
        if (str2 == null) {
            if (str == null) {
                d = true;
            }
            d = false;
        } else {
            if (str != null) {
                d = Intrinsics.d(str2, str);
            }
            d = false;
        }
        return d && Intrinsics.d(this.e, j1Var.e) && Intrinsics.d(this.f, j1Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.passport.internal.entities.e eVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(account=");
        sb.append(this.a);
        sb.append(", clientToken=");
        sb.append(this.b);
        sb.append(", loginAction=");
        sb.append(this.c);
        sb.append(", additionalActionResponse=");
        String str = this.d;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.internal.ui.a.J(str)));
        sb.append(", phoneNumber=");
        sb.append(this.e);
        sb.append(", skipFinishRegistrationActivities=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
