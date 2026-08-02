package androidx.datastore.preferences.core;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class Preferences {

    public final class Key {
        public final String name;

        public Key(String str) {
            str.getClass();
            this.name = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            return Intrinsics.areEqual(this.name, ((Key) obj).name);
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final String toString() {
            return this.name;
        }
    }

    public abstract class Pair {
    }

    public abstract Map asMap();

    public abstract Object get(Key key);

    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(new LinkedHashMap(asMap()), false);
    }

    public final MutablePreferences toPreferences() {
        return new MutablePreferences(new LinkedHashMap(asMap()), true);
    }
}
