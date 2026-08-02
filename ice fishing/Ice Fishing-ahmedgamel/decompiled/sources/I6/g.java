package I6;

import c6.C0555a;
import c6.i;
import c6.o;
import i1.C4586c;

/* loaded from: classes2.dex */
public final class g extends i {
    public static h h(int i) {
        switch (i) {
            case 0:
                return h.SEVERITY_NUMBER_UNSPECIFIED;
            case 1:
                return h.SEVERITY_NUMBER_TRACE;
            case 2:
                return h.SEVERITY_NUMBER_TRACE2;
            case 3:
                return h.SEVERITY_NUMBER_TRACE3;
            case 4:
                return h.SEVERITY_NUMBER_TRACE4;
            case 5:
                return h.SEVERITY_NUMBER_DEBUG;
            case 6:
                return h.SEVERITY_NUMBER_DEBUG2;
            case 7:
                return h.SEVERITY_NUMBER_DEBUG3;
            case 8:
                return h.SEVERITY_NUMBER_DEBUG4;
            case 9:
                return h.SEVERITY_NUMBER_INFO;
            case 10:
                return h.SEVERITY_NUMBER_INFO2;
            case 11:
                return h.SEVERITY_NUMBER_INFO3;
            case 12:
                return h.SEVERITY_NUMBER_INFO4;
            case 13:
                return h.SEVERITY_NUMBER_WARN;
            case 14:
                return h.SEVERITY_NUMBER_WARN2;
            case 15:
                return h.SEVERITY_NUMBER_WARN3;
            case 16:
                return h.SEVERITY_NUMBER_WARN4;
            case 17:
                return h.SEVERITY_NUMBER_ERROR;
            case 18:
                return h.SEVERITY_NUMBER_ERROR2;
            case 19:
                return h.SEVERITY_NUMBER_ERROR3;
            case 20:
                return h.SEVERITY_NUMBER_ERROR4;
            case 21:
                return h.SEVERITY_NUMBER_FATAL;
            case 22:
                return h.SEVERITY_NUMBER_FATAL2;
            case 23:
                return h.SEVERITY_NUMBER_FATAL3;
            case 24:
                return h.SEVERITY_NUMBER_FATAL4;
            default:
                return null;
        }
    }

    @Override // c6.i
    public final Object b(C0555a c0555a) {
        int l9 = c0555a.l();
        h h3 = h(l9);
        if (h3 != null) {
            return h3;
        }
        throw new c6.h(l9, this.f5780b);
    }

    @Override // c6.i
    public final Object c(C4586c reader) {
        kotlin.jvm.internal.h.e(reader, "reader");
        int l9 = ((C0555a) reader.f38154u).l();
        h h3 = h(l9);
        if (h3 != null) {
            return h3;
        }
        throw new c6.h(l9, this.f5780b);
    }

    @Override // c6.i
    public final void d(n4.c writer, Object obj) {
        o value = (o) obj;
        kotlin.jvm.internal.h.e(writer, "writer");
        kotlin.jvm.internal.h.e(value, "value");
        writer.E(((h) value).f1390n);
    }

    @Override // c6.i
    public final int f(Object obj) {
        o value = (o) obj;
        kotlin.jvm.internal.h.e(value, "value");
        return 1;
    }
}
