package defpackage;

import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class t8i {
    public final r0 a;
    public final gci0 b;
    public String c;
    public final LinkedHashMap d;

    public t8i() {
        r0 c = bvf0.c(a.b);
        this.a = c;
        this.b = e.d(c);
        this.d = new LinkedHashMap();
    }

    public final void a(String str) {
        LinkedHashMap linkedHashMap = this.d;
        linkedHashMap.put(str, Integer.valueOf(((Number) linkedHashMap.getOrDefault(str, 0)).intValue() + 1));
    }

    public final int b(String str) {
        return ((Number) this.d.getOrDefault(str, 0)).intValue();
    }

    public static final class a {
        public static final a b = new a(null);
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jl40.l(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return oyr.p("DeliveryCommentCourierState(comment=", this.a, Extension.C_BRAKE);
        }

        public a() {
            this(null);
        }
    }
}
