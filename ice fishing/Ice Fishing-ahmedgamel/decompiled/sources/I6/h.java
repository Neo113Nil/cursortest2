package I6;

import c6.n;
import c6.o;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public enum h implements o {
    SEVERITY_NUMBER_UNSPECIFIED(0),
    SEVERITY_NUMBER_TRACE(1),
    SEVERITY_NUMBER_TRACE2(2),
    SEVERITY_NUMBER_TRACE3(3),
    SEVERITY_NUMBER_TRACE4(4),
    SEVERITY_NUMBER_DEBUG(5),
    SEVERITY_NUMBER_DEBUG2(6),
    SEVERITY_NUMBER_DEBUG3(7),
    SEVERITY_NUMBER_DEBUG4(8),
    SEVERITY_NUMBER_INFO(9),
    SEVERITY_NUMBER_INFO2(10),
    SEVERITY_NUMBER_INFO3(11),
    SEVERITY_NUMBER_INFO4(12),
    SEVERITY_NUMBER_WARN(13),
    SEVERITY_NUMBER_WARN2(14),
    SEVERITY_NUMBER_WARN3(15),
    SEVERITY_NUMBER_WARN4(16),
    SEVERITY_NUMBER_ERROR(17),
    SEVERITY_NUMBER_ERROR2(18),
    SEVERITY_NUMBER_ERROR3(19),
    SEVERITY_NUMBER_ERROR4(20),
    SEVERITY_NUMBER_FATAL(21),
    SEVERITY_NUMBER_FATAL2(22),
    SEVERITY_NUMBER_FATAL3(23),
    SEVERITY_NUMBER_FATAL4(24);


    /* renamed from: T, reason: collision with root package name */
    public static final g f1382T;

    /* renamed from: n, reason: collision with root package name */
    public final int f1390n;

    static {
        h hVar = SEVERITY_NUMBER_UNSPECIFIED;
        f1382T = new g(c6.d.f5754u, s.a(h.class), n.f5795v, hVar);
    }

    h(int i) {
        this.f1390n = i;
    }
}
