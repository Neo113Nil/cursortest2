package defpackage;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class my7 {
    public static final my7 b = new my7(null);
    public final v8n a;

    public my7(v8n v8nVar) {
        this.a = v8nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof my7) {
            return Objects.equals(this.a, ((my7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "DescriptorEvent{queueDescriptor=" + this.a + '}';
    }
}
