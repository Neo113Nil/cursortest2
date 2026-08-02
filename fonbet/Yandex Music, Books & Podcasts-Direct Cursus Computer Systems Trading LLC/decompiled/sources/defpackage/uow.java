package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class uow {
    public static final uow j = new uow("stub", tow.d, "ynison-android-app", "Unknown", null, null, null, null, null);
    public final String a;
    public final tow b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final row g;
    public final String h;
    public final String i;

    public uow(String str, tow towVar, String str2, String str3, String str4, String str5, row rowVar, String str6, String str7) {
        this.a = str;
        this.b = towVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = rowVar;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!uow.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            uow uowVar = (uow) obj;
            row rowVar = uowVar.g;
            String str = uowVar.d;
            String str2 = uowVar.a;
            tow towVar = uowVar.b;
            tow towVar2 = this.b;
            if (towVar2 != towVar) {
                return false;
            }
            int ordinal = towVar2.ordinal();
            row rowVar2 = this.g;
            String str3 = this.a;
            if (ordinal != 0) {
                String str4 = this.d;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            b6e.s();
                            return false;
                        }
                        if (!str3.equals(str2) || !str4.equals(str)) {
                            return false;
                        }
                    } else if (!str3.equals(str2) || !Intrinsics.d(rowVar2, rowVar)) {
                        return false;
                    }
                } else if (!str3.equals(str2) || !str4.equals(str)) {
                    return false;
                }
            } else if (!str3.equals(str2) || !Intrinsics.d(rowVar2, rowVar)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("YnisonRemotePlayableMeta(id=", this.a, ", title=", this.d, ", type=");
        m.append(this.b);
        m.append(", from=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
