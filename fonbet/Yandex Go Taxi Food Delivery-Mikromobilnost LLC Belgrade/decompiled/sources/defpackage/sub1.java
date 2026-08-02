package defpackage;

import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes15.dex */
public abstract class sub1 {
    public static final void a(tls tlsVar, Object obj, fse fseVar) {
        UndeliveredElementException b = b(tlsVar, obj, null);
        if (b != null) {
            d6z.I(fseVar, b);
        }
    }

    public static final UndeliveredElementException b(tls tlsVar, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            tlsVar.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(qv10.o("Exception in undelivered element handler for ", obj), th);
            }
            ljo.a(undeliveredElementException, th);
            return undeliveredElementException;
        }
    }

    public static final void d(oll0 oll0Var) {
        ListBuilder a = rcc.a();
        ull0 T0 = oll0Var.T0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (T0.q()) {
            try {
                a.add(T0.Y1(0));
            } finally {
            }
        }
        gwk0.m(T0, null);
        ListIterator listIterator = a.j().listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                return;
            }
            String str = (String) qqyVar.next();
            if (cvu0.x(str, "room_fts_content_sync_", false)) {
                vez0.s(oll0Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final void e(y6f0 y6f0Var, Object obj) {
        ((x6f0) y6f0Var).d(obj);
    }
}
