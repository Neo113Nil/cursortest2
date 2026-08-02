package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public enum x67 {
    CLASS_UNKNOWN(0),
    CLASS_IN(1),
    /* JADX INFO: Fake field, exist only in values array */
    CLASS_CS(2),
    /* JADX INFO: Fake field, exist only in values array */
    CLASS_CH(3),
    /* JADX INFO: Fake field, exist only in values array */
    CLASS_HS(4),
    /* JADX INFO: Fake field, exist only in values array */
    CLASS_NONE(254),
    CLASS_ANY(KotlinVersion.MAX_COMPONENT_VALUE);

    public static final Logger e = Logger.getLogger(x67.class.getName());
    public final int a;

    x67(int i) {
        this.a = i;
    }

    public static x67 a(int i) {
        int i2 = i & 32767;
        for (x67 x67Var : values()) {
            if (x67Var.a == i2) {
                return x67Var;
            }
        }
        e.log(Level.WARNING, "Could not find record class for index: " + i);
        return CLASS_UNKNOWN;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name() + " index " + this.a;
    }
}
