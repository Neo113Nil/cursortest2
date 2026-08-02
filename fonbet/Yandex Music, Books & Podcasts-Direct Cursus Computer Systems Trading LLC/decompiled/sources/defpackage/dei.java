package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class dei {
    public static final ArrayList d;
    public final List a;
    public final ThreadLocal b = new ThreadLocal();
    public final LinkedHashMap c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        d = arrayList;
        arrayList.add(ksw.n);
        arrayList.add(ny4.c);
        arrayList.add(oy0.e);
        arrayList.add(oy0.d);
        arrayList.add(lnn.a);
        arrayList.add(jm4.d);
    }

    public dei(brh brhVar) {
        ArrayList arrayList = brhVar.a;
        int size = arrayList.size();
        ArrayList arrayList2 = d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.a = Collections.unmodifiableList(arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [z3f] */
    public final z3f a(Type type, Set set, String str) {
        bei beiVar;
        if (type == null) {
            jj4.j("type == null");
            return null;
        }
        if (set == null) {
            jj4.j("annotations == null");
            return null;
        }
        Type a = avt.a(type);
        if (a instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) a;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length != 1) {
                    e7o.e();
                    return null;
                }
                a = upperBounds[0];
            }
        }
        Object asList = set.isEmpty() ? a : Arrays.asList(a, set);
        synchronized (this.c) {
            try {
                z3f z3fVar = (z3f) this.c.get(asList);
                if (z3fVar != null) {
                    return z3fVar;
                }
                cei ceiVar = (cei) this.b.get();
                if (ceiVar == null) {
                    ceiVar = new cei(this);
                    this.b.set(ceiVar);
                }
                ArrayDeque arrayDeque = ceiVar.b;
                ArrayList arrayList = ceiVar.a;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        bei beiVar2 = new bei(a, str, asList);
                        arrayList.add(beiVar2);
                        arrayDeque.add(beiVar2);
                        beiVar = null;
                        break;
                    }
                    beiVar = (bei) arrayList.get(i);
                    if (beiVar.c.equals(asList)) {
                        arrayDeque.add(beiVar);
                        ?? r13 = beiVar.d;
                        if (r13 != 0) {
                            beiVar = r13;
                        }
                    } else {
                        i++;
                    }
                }
                try {
                    if (beiVar != null) {
                        return beiVar;
                    }
                    try {
                        int size2 = this.a.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            z3f a2 = ((ny0) this.a.get(i2)).a(a, set, this);
                            if (a2 != null) {
                                ((bei) ceiVar.b.getLast()).d = a2;
                                ceiVar.b(true);
                                return a2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + avt.g(a, set));
                    } catch (IllegalArgumentException e) {
                        throw ceiVar.a(e);
                    }
                } finally {
                    ceiVar.b(false);
                }
            } finally {
            }
        }
    }
}
