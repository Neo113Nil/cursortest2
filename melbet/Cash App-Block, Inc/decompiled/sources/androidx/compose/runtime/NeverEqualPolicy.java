package androidx.compose.runtime;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class NeverEqualPolicy implements CoroutineContext.Key, SnapshotMutationPolicy {
    public static final /* synthetic */ NeverEqualPolicy $$INSTANCE = new NeverEqualPolicy(1);
    public static final NeverEqualPolicy INSTANCE = new NeverEqualPolicy(0);
    public static final NeverEqualPolicy INSTANCE$1 = new NeverEqualPolicy(2);
    public static final NeverEqualPolicy INSTANCE$2 = new NeverEqualPolicy(3);
    public static final NeverEqualPolicy INSTANCE$3 = new NeverEqualPolicy(4);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ NeverEqualPolicy(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return false;
            case 1:
            default:
                return Intrinsics.areEqual(obj, obj2);
            case 2:
                return obj == obj2;
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "NeverEqualPolicy";
            case 1:
            case 3:
            case 5:
            default:
                return super.toString();
            case 2:
                return "ReferentialEqualityPolicy";
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
