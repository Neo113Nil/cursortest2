package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "<init>", "()V", "Key", "Empty", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CreationExtras {
    public final LinkedHashMap extras = new LinkedHashMap();

    public final class Empty extends CreationExtras {
        public static final Empty INSTANCE = new Empty();

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public final Object get(Key key) {
            return null;
        }
    }

    public interface Key {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CreationExtras) {
            return Intrinsics.areEqual(this.extras, ((CreationExtras) obj).extras);
        }
        return false;
    }

    public abstract Object get(Key key);

    public final int hashCode() {
        return this.extras.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.extras + ')';
    }
}
