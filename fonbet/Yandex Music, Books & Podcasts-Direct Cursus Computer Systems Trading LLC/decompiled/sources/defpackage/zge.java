package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zge {
    public final String a;
    public final String b;
    public final u9b c;
    public final ArrayList d;

    public zge(String str, String str2, u9b u9bVar, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = u9bVar;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zge)) {
            return false;
        }
        zge zgeVar = (zge) obj;
        return Intrinsics.d(this.a, zgeVar.a) && Intrinsics.d(this.b, zgeVar.b) && Intrinsics.d(this.c, zgeVar.c) && this.d.equals(zgeVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        u9b u9bVar = this.c;
        return this.d.hashCode() + ((c + (u9bVar == null ? 0 : u9bVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("InStyleBlockEntity(id=", this.a, ", title=", this.b, ", cover=");
        m.append(this.c);
        m.append(", items=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
