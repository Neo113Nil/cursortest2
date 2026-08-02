package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wua {
    public final String a;
    public final vua b;
    public final String c;
    public final String d;

    public wua(String str, vua vuaVar, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = vuaVar;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wua)) {
            return false;
        }
        wua wuaVar = (wua) obj;
        return Intrinsics.d(this.a, wuaVar.a) && this.b.equals(wuaVar.b) && Intrinsics.d(this.c, wuaVar.c) && Intrinsics.d(this.d, wuaVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicOverlayButtonState(text=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", color=");
        return ouj.q(sb, this.c, ", textColor=", this.d, ")");
    }
}
