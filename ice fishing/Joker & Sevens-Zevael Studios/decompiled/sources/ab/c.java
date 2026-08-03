package ab;

import pc.f;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public enum c {
    IAM("iam"),
    NOTIFICATION("notification");

    public static final a Companion = new a(null);
    private final String nameValue;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c fromString(String str) {
            c cVar;
            if (str != null) {
                c[] values = c.values();
                int length = values.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i10 = length - 1;
                        cVar = values[length];
                        if (cVar.equalsName(str)) {
                            break;
                        }
                        if (i10 < 0) {
                            break;
                        }
                        length = i10;
                    }
                }
                cVar = null;
                if (cVar != null) {
                    return cVar;
                }
            }
            return c.NOTIFICATION;
        }

        private a() {
        }
    }

    c(String str) {
        this.nameValue = str;
    }

    public static final c fromString(String str) {
        return Companion.fromString(str);
    }

    public final boolean equalsName(String str) {
        j.e(str, "otherName");
        return j.a(this.nameValue, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.nameValue;
    }
}
