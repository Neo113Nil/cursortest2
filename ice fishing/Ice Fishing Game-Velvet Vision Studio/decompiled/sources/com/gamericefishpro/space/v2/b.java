package com.gamericefishpro.space.v2;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final /* synthetic */ int e = 0;
    public final boolean a;
    public final int b;
    public final int c;
    public final com.gamericefishpro.space.x2.b d;

    static {
        new b();
    }

    public b() {
        com.gamericefishpro.space.x2.b bVar = com.gamericefishpro.space.x2.b.i;
        this.a = true;
        this.b = 1;
        this.c = 1;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Intrinsics.a(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.d.hashCode() + com.gamericefishpro.space.m5.a.t(this.c, com.gamericefishpro.space.m5.a.t(this.b, y0.c(com.gamericefishpro.space.m5.a.t(0, Boolean.hashCode(false) * 31, 31), 31, this.a), 31), 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str2 = "None";
        sb.append((Object) "None");
        sb.append(", autoCorrect=");
        sb.append(this.a);
        sb.append(", keyboardType=");
        int i = this.b;
        if (i == 0) {
            str = "Unspecified";
        } else if (i == 1) {
            str = "Text";
        } else if (i == 2) {
            str = "Ascii";
        } else if (i == 3) {
            str = "Number";
        } else if (i == 4) {
            str = "Phone";
        } else if (i == 5) {
            str = "Uri";
        } else if (i == 6) {
            str = "Email";
        } else if (i == 7) {
            str = "Password";
        } else if (i == 8) {
            str = "NumberPassword";
        } else {
            str = i == 9 ? "Decimal" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", imeAction=");
        int i2 = this.c;
        if (i2 == -1) {
            str2 = "Unspecified";
        } else if (i2 != 0) {
            if (i2 == 1) {
                str2 = "Default";
            } else if (i2 == 2) {
                str2 = "Go";
            } else if (i2 == 3) {
                str2 = "Search";
            } else if (i2 == 4) {
                str2 = "Send";
            } else if (i2 == 5) {
                str2 = "Previous";
            } else if (i2 == 6) {
                str2 = "Next";
            } else {
                str2 = i2 == 7 ? "Done" : "Invalid";
            }
        }
        sb.append((Object) str2);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
