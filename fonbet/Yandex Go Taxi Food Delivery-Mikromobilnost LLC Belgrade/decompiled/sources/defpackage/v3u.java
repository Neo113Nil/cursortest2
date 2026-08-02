package defpackage;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.Strictness;
import com.google.gson.ToNumberPolicy;
import defpackage.g7x;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes11.dex */
public final class v3u {
    public static final n9s p = n9s.d;
    public static final FieldNamingPolicy q = FieldNamingPolicy.IDENTITY;
    public static final ToNumberPolicy r = ToNumberPolicy.DOUBLE;
    public static final ToNumberPolicy s = ToNumberPolicy.LAZILY_PARSED_NUMBER;
    public static final tis0 t;
    public static final ubx u;
    public static final v3u v;
    public static final List w;
    public final dko a = dko.c;
    public final LongSerializationPolicy b = LongSerializationPolicy.DEFAULT;
    public final FieldNamingPolicy c = q;
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final int g = 2;
    public final int h = 2;
    public boolean i = true;
    public final n9s j = p;
    public Strictness k = null;
    public final boolean l = true;
    public sjz0 m = r;
    public sjz0 n = s;
    public final ArrayDeque o = new ArrayDeque();

    static {
        tis0 tis0Var = new tis0((Object) Collections.EMPTY_MAP, true, (Object) Collections.EMPTY_LIST, 8);
        t = tis0Var;
        ubx ubxVar = new ubx(tis0Var);
        u = ubxVar;
        v3u v3uVar = new v3u();
        v = v3uVar;
        w = v3uVar.a(tis0Var, ubxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List b(AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (abstractCollection.size() == 1) {
            return Collections.singletonList(abstractCollection instanceof List ? ((List) abstractCollection).get(0) : abstractCollection.iterator().next());
        }
        return Collections.unmodifiableList(Arrays.asList(abstractCollection.toArray()));
    }

    public final List a(tis0 tis0Var, ubx ubxVar) {
        ln60 ln60Var;
        jm11 jm11Var;
        jm11 jm11Var2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(um11.C);
        sjz0 sjz0Var = this.m;
        int i = 1;
        if (sjz0Var == ToNumberPolicy.DOUBLE) {
            ln60Var = yp60.c;
        } else {
            ln60 ln60Var2 = yp60.c;
            ln60Var = new ln60(i, sjz0Var);
        }
        arrayList.add(ln60Var);
        arrayList.add(this.a);
        ArrayList arrayList2 = this.e;
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            Collections.reverse(arrayList3);
            arrayList.addAll(arrayList3);
        }
        ArrayList arrayList4 = this.f;
        if (!arrayList4.isEmpty()) {
            ArrayList arrayList5 = new ArrayList(arrayList4);
            Collections.reverse(arrayList5);
            arrayList.addAll(arrayList5);
        }
        boolean z = kxt0.a;
        int i2 = 0;
        g7x.b bVar = null;
        int i3 = this.g;
        int i4 = this.h;
        if (i3 != 2 || i4 != 2) {
            jm11 jm11Var3 = new jm11(Date.class, new r9h(q9h.b, i3, i4), i2);
            if (z) {
                jxt0 jxt0Var = kxt0.c;
                jxt0Var.getClass();
                jm11Var2 = new jm11(jxt0Var.a, new r9h(jxt0Var, i3, i4), i2);
                jxt0 jxt0Var2 = kxt0.b;
                jxt0Var2.getClass();
                jm11Var = new jm11(jxt0Var2.a, new r9h(jxt0Var2, i3, i4), i2);
            } else {
                jm11Var = null;
                jm11Var2 = null;
            }
            arrayList.add(jm11Var3);
            if (z) {
                arrayList.add(jm11Var2);
                arrayList.add(jm11Var);
            }
        }
        arrayList.add(um11.s);
        arrayList.add(um11.g);
        arrayList.add(um11.d);
        arrayList.add(um11.e);
        arrayList.add(um11.f);
        nl11 a = this.b.a();
        arrayList.add(new km11(Long.TYPE, Long.class, a));
        arrayList.add(new km11(Double.TYPE, Double.class, um11.n));
        arrayList.add(new km11(Float.TYPE, Float.class, um11.m));
        sjz0 sjz0Var2 = this.n;
        arrayList.add(sjz0Var2 == ToNumberPolicy.LAZILY_PARSED_NUMBER ? nn60.b : new ln60(i2, new nn60(sjz0Var2)));
        arrayList.add(um11.h);
        arrayList.add(um11.i);
        Objects.requireNonNull(a);
        arrayList.add(new jm11(AtomicLong.class, new rl11(a, 1).nullSafe(), i2));
        arrayList.add(new jm11(AtomicLongArray.class, new rl11(a, 0).nullSafe(), i2));
        arrayList.add(um11.j);
        arrayList.add(um11.o);
        arrayList.add(um11.t);
        arrayList.add(um11.u);
        arrayList.add(um11.p);
        arrayList.add(um11.q);
        arrayList.add(um11.r);
        arrayList.add(um11.v);
        arrayList.add(um11.w);
        arrayList.add(um11.y);
        arrayList.add(um11.z);
        arrayList.add(um11.B);
        arrayList.add(um11.x);
        arrayList.add(um11.b);
        arrayList.add(r9h.c);
        arrayList.add(um11.A);
        try {
            f7x f7xVar = g7x.a;
            ((g7x) ((tm11) g7x.class.getDeclaredConstructor(null).newInstance(null))).getClass();
            bVar = g7x.j;
        } catch (LinkageError | ReflectiveOperationException unused) {
        }
        if (bVar != null) {
            arrayList.add(bVar);
        }
        arrayList.addAll(kxt0.d);
        arrayList.add(n63.c);
        arrayList.add(um11.a);
        arrayList.add(new pcc(tis0Var, i2));
        arrayList.add(new pcc(tis0Var, i));
        arrayList.add(ubxVar);
        arrayList.add(um11.D);
        arrayList.add(new epi0(tis0Var, this.c, this.a, ubxVar, b(this.o)));
        arrayList.trimToSize();
        return Collections.unmodifiableList(arrayList);
    }
}
