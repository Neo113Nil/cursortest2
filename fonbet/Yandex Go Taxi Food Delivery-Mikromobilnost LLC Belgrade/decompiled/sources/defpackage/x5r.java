package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class x5r {
    public final a a;

    public /* synthetic */ x5r(int i) {
        this(new a(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x5r) && jl40.l(this.a, ((x5r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FiltersData(filtersList=" + this.a + Extension.C_BRAKE;
    }

    /* loaded from: classes11.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final List c;

        public a(String str, String str2, List list) {
            this.a = str;
            this.b = str2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return ly3.s(b64.v("FiltersList(title=", this.a, ", buttonText=", this.b, ", filtersSections="), this.c, Extension.C_BRAKE);
        }

        public static final class b {
            public final String a;
            public final List b;

            public b(String str, List list) {
                this.a = str;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return nnm.h("FiltersSection(sectionTitle=", this.a, ", filters=", Extension.C_BRAKE, this.b);
            }

            public b() {
                this("", EmptyList.a);
            }
        }

        /* renamed from: x5r$a$a, reason: collision with other inner class name */
        public static final class C0132a {
            public final String a;
            public final Map b;
            public final Map c;

            public C0132a() {
                this(null, "", kotlin.collections.b.f());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0132a)) {
                    return false;
                }
                C0132a c0132a = (C0132a) obj;
                return jl40.l(this.a, c0132a.a) && jl40.l(this.b, c0132a.b) && jl40.l(this.c, c0132a.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Map map = this.b;
                return this.c.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FilterObject(name=");
                sb.append(this.a);
                sb.append(", matchOptions=");
                sb.append(this.b);
                sb.append(", meta=");
                return b64.r(sb, this.c, Extension.C_BRAKE);
            }

            public C0132a(Map map, String str, Map map2) {
                this.a = str;
                this.b = map;
                this.c = map2;
            }
        }

        public /* synthetic */ a(int i) {
            this("", "", EmptyList.a);
        }

        public a() {
            this(0);
        }
    }

    public x5r(a aVar) {
        this.a = aVar;
    }

    public x5r() {
        this(0);
    }
}
