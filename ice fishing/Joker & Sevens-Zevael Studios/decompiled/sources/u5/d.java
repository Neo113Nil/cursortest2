package u5;

import bc.l;
import bc.v;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import pc.j;
import z.y;
import z4.g;
import z4.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class d {
    public static void a(StringBuilder sb, Object obj, oc.c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static String g(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }

    public static final long j(long j3, float f10) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j3 >> 32)) - f10);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j3 & 4294967295L)) - f10);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final y k(a3.b bVar) {
        return new y(bVar.f194a, bVar.f195b, bVar.f196c, bVar.f197d);
    }

    public static final boolean l(Throwable th, oc.a aVar) {
        Collection N;
        Object invoke;
        j.e(th, "<this>");
        Integer num = kc.a.f3636a;
        x0.d dVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            j.d(suppressed, "getSuppressed(...)");
            N = l.N(suppressed);
        } else {
            Method method = jc.a.f3549b;
            N = (method == null || (invoke = method.invoke(th, null)) == null) ? v.f1067g : l.N((Throwable[]) invoke);
        }
        boolean z10 = false;
        if (!N.isEmpty()) {
            Iterator it = N.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof x0.d) {
                    return false;
                }
            }
        }
        try {
            List list = (List) aVar.invoke();
            boolean isEmpty = list.isEmpty();
            z10 = !isEmpty;
            if (!isEmpty) {
                dVar = new x0.d(list);
            }
        } catch (Throwable th2) {
            dVar = th2;
        }
        if (dVar != null) {
            i7.b.k(th, dVar);
        }
        return z10;
    }

    public abstract boolean b(h hVar, z4.c cVar, z4.c cVar2);

    public abstract boolean c(h hVar, Object obj, Object obj2);

    public abstract boolean d(h hVar, g gVar, g gVar2);

    public abstract boolean e(w1.g gVar);

    public abstract Object f(w1.g gVar);

    public abstract void h(g gVar, g gVar2);

    public abstract void i(g gVar, Thread thread);
}
