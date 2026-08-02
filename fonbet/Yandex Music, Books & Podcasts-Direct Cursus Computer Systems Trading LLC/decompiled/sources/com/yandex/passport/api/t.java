package com.yandex.passport.api;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t implements v {
    public final z1 a;
    public final com.yandex.passport.internal.account.f b;
    public final w0 c;
    public final String d;
    public final String e;

    public t(z1 z1Var, com.yandex.passport.internal.account.f fVar, w0 w0Var, String str, String str2) {
        w0Var.getClass();
        this.a = z1Var;
        this.b = fVar;
        this.c = w0Var;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (Intrinsics.d(this.a, tVar.a) && Intrinsics.d(this.b, tVar.b) && this.c == tVar.c) {
                    String str = tVar.d;
                    String str2 = this.d;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && Intrinsics.d(this.e, tVar.e)) {
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

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggedIn(uid=");
        sb.append(this.a);
        sb.append(", passportAccount=");
        sb.append(this.b);
        sb.append(", loginAction=");
        sb.append(this.c);
        sb.append(", additionalActionResponse=");
        String str = this.d;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.internal.ui.a.J(str)));
        sb.append(", phoneNumber=");
        return dfi.i(sb, this.e, ')');
    }
}
