package Y6;

import f6.C4512a;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3965e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f3966a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3967b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3968c;

    /* renamed from: d, reason: collision with root package name */
    public final f6.c f3969d;

    static {
        a("", null, null, C4512a.f37513w);
    }

    public a(String str, String str2, String str3, f6.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f3966a = str;
        this.f3967b = str2;
        this.f3968c = str3;
        if (cVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f3969d = cVar;
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
            if (this.f3966a.equals(aVar.f3966a)) {
                String str = aVar.f3967b;
                String str2 = this.f3967b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = aVar.f3968c;
                    String str4 = this.f3968c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        if (this.f3969d.equals(aVar.f3969d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3966a.hashCode() ^ 1000003) * 1000003;
        String str = this.f3967b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f3968c;
        return ((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.f3969d.hashCode();
    }

    public final String toString() {
        return "InstrumentationScopeInfo{name=" + this.f3966a + ", version=" + this.f3967b + ", schemaUrl=" + this.f3968c + ", attributes=" + this.f3969d + "}";
    }
}
