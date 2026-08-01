package y4;

/* loaded from: classes2.dex */
public abstract class f {

    public static final class a extends f {
        private final g result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g result) {
            super(null);
            kotlin.jvm.internal.h.e(result, "result");
            this.result = result;
        }

        public static /* synthetic */ a copy$default(a aVar, g gVar, int i, Object obj) {
            if ((i & 1) != 0) {
                gVar = aVar.result;
            }
            return aVar.copy(gVar);
        }

        public final g component1() {
            return this.result;
        }

        public final a copy(g result) {
            kotlin.jvm.internal.h.e(result, "result");
            return new a(result);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.h.a(this.result, ((a) obj).result);
        }

        public final g getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Success(result=" + this.result + ')';
        }
    }

    public static final class b extends f {
        public static final b INSTANCE = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 259983066;
        }

        public String toString() {
            return "Unavailable";
        }
    }

    public /* synthetic */ f(kotlin.jvm.internal.e eVar) {
        this();
    }

    private f() {
    }
}
