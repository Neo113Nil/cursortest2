package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class imh {
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public imh(String str, String str2, String str3, List list) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!imh.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        imh imhVar = (imh) obj;
        return Intrinsics.d(this.a, imhVar.a) && Intrinsics.d(this.b, imhVar.b) && Intrinsics.d(this.c, imhVar.c) && Intrinsics.d(this.d, imhVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return Boolean.hashCode(false) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaData(streams=");
        sb.append(this.a);
        sb.append(", firstFrameHash=");
        sb.append(this.b);
        sb.append(", firstFrameUrl=");
        sb.append(this.c);
        sb.append(", videoContentId=");
        return su4.o(sb, this.d, ", showFirstFrameUntilPlay=false)");
    }
}
