package y4;

import f8.y;
import java.util.List;
import v7.C5135p;

/* loaded from: classes2.dex */
public final class g {
    public static final a Companion = new a(null);
    private static final g EMPTY = new g(C5135p.f41439n, null);
    private final List<String> enabledKeys;
    private final y metadata;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final g getEMPTY() {
            return g.EMPTY;
        }

        private a() {
        }
    }

    public g(List<String> enabledKeys, y yVar) {
        kotlin.jvm.internal.h.e(enabledKeys, "enabledKeys");
        this.enabledKeys = enabledKeys;
        this.metadata = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g copy$default(g gVar, List list, y yVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gVar.enabledKeys;
        }
        if ((i & 2) != 0) {
            yVar = gVar.metadata;
        }
        return gVar.copy(list, yVar);
    }

    public final List<String> component1() {
        return this.enabledKeys;
    }

    public final y component2() {
        return this.metadata;
    }

    public final g copy(List<String> enabledKeys, y yVar) {
        kotlin.jvm.internal.h.e(enabledKeys, "enabledKeys");
        return new g(enabledKeys, yVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.h.a(this.enabledKeys, gVar.enabledKeys) && kotlin.jvm.internal.h.a(this.metadata, gVar.metadata);
    }

    public final List<String> getEnabledKeys() {
        return this.enabledKeys;
    }

    public final y getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int hashCode = this.enabledKeys.hashCode() * 31;
        y yVar = this.metadata;
        return hashCode + (yVar == null ? 0 : yVar.f37583n.hashCode());
    }

    public String toString() {
        return "RemoteFeatureFlagsResult(enabledKeys=" + this.enabledKeys + ", metadata=" + this.metadata + ')';
    }
}
