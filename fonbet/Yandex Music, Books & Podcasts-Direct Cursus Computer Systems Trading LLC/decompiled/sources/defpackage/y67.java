package defpackage;

import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public enum y67 {
    TYPE_IGNORE(0),
    TYPE_A(1),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_NS(2),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MD(3),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MF(4),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_CNAME(5),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_SOA(6),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MB(7),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MG(8),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MR(9),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_NULL(10),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_WKS(11),
    TYPE_PTR(12),
    TYPE_HINFO(13),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MINFO(14),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(15),
    TYPE_TXT(16),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(17),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(18),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(19),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(20),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(21),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(22),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(23),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(24),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(25),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(26),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(27),
    TYPE_AAAA(28),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(29),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(30),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(31),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(32),
    TYPE_SRV(33),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(34),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(35),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(36),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(37),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(38),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(39),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(40),
    TYPE_OPT(41),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(42),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(43),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(44),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(46),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(47),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(48),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(100),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(101),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(102),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(103),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(249),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(250),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(251),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(252),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILA(253),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_MAILB(254),
    TYPE_ANY(KotlinVersion.MAX_COMPONENT_VALUE);

    public static final Logger k = Logger.getLogger(y67.class.getName());
    public final int a;

    y67(int i) {
        this.a = i;
    }

    public static y67 a(int i) {
        for (y67 y67Var : values()) {
            if (y67Var.a == i) {
                return y67Var;
            }
        }
        k.severe("Could not find record type for index: " + i);
        return TYPE_IGNORE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name() + " index " + this.a;
    }
}
