package Y6;

import f6.C4522a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3909e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f3910a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3911b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3912c;

    /* renamed from: d, reason: collision with root package name */
    public final f6.c f3913d;

    static {
        a("", null, null, C4522a.f37475w);
    }

    public a(String str, String str2, String str3, f6.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f3910a = str;
        this.f3911b = str2;
        this.f3912c = str3;
        if (cVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f3913d = cVar;
    }

    public static a a(String str, String str2, String str3, f6.c cVar) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(cVar, "attributes");
        return new a(str, str2, str3, cVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3910a.equals(aVar.f3910a)) {
                String str = aVar.f3911b;
                String str2 = this.f3911b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = aVar.f3912c;
                    String str4 = this.f3912c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        if (this.f3913d.equals(aVar.f3913d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3910a.hashCode() ^ 1000003) * 1000003;
        String str = this.f3911b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f3912c;
        return ((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.f3913d.hashCode();
    }

    public final String toString() {
        return "InstrumentationScopeInfo{name=" + this.f3910a + ", version=" + this.f3911b + ", schemaUrl=" + this.f3912c + ", attributes=" + this.f3913d + "}";
    }
}
