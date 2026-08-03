package ab;

import pc.f;
import xc.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public enum d {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;

    public static final a Companion = new a(null);

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d fromString(String str) {
            d dVar;
            if (str != null) {
                d[] values = d.values();
                int length = values.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i10 = length - 1;
                        dVar = values[length];
                        if (h.o(dVar.name(), str)) {
                            break;
                        }
                        if (i10 < 0) {
                            break;
                        }
                        length = i10;
                    }
                }
                dVar = null;
                if (dVar != null) {
                    return dVar;
                }
            }
            return d.UNATTRIBUTED;
        }

        private a() {
        }
    }

    public static final d fromString(String str) {
        return Companion.fromString(str);
    }

    public final boolean isAttributed() {
        return isDirect() || isIndirect();
    }

    public final boolean isDirect() {
        return this == DIRECT;
    }

    public final boolean isDisabled() {
        return this == DISABLED;
    }

    public final boolean isIndirect() {
        return this == INDIRECT;
    }

    public final boolean isUnattributed() {
        return this == UNATTRIBUTED;
    }
}
