package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;

/* loaded from: classes5.dex */
public final class lm7 {
    public final /* synthetic */ int a = 1;
    public String b;
    public String c;

    public lm7(String str, String str2, String str3) {
        this.b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 1:
                if (!(obj instanceof z4k)) {
                    return false;
                }
                z4k z4kVar = (z4k) obj;
                Object obj2 = z4kVar.a;
                String str = this.b;
                if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
                    return false;
                }
                Object obj3 = z4kVar.b;
                String str2 = this.c;
                return obj3 == str2 || (obj3 != null && obj3.equals(str2));
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 1:
                String str = this.b;
                int hashCode = str == null ? 0 : str.hashCode();
                String str2 = this.c;
                return hashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Pair{" + ((Object) this.b) + StringUtil.SPACE + ((Object) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ lm7() {
    }
}
