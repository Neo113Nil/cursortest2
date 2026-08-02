package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.u;
import defpackage.awf;
import defpackage.dlt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class x {
    public static final a a = new a();
    public static final b b = new b();

    public static final class a extends x {
        public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public static List d(long j, Object obj, int i) {
            List list = (List) b1.d.i(j, obj);
            if (list.isEmpty()) {
                List wVar = list instanceof awf ? new w(i) : ((list instanceof m0) && (list instanceof u.a)) ? ((u.a) list).b(i) : new ArrayList(i);
                b1.o(j, obj, wVar);
                return wVar;
            }
            if (c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                b1.o(j, obj, arrayList);
                return arrayList;
            }
            if (list instanceof dlt) {
                w wVar2 = new w(list.size() + i);
                wVar2.addAll((dlt) list);
                b1.o(j, obj, wVar2);
                return wVar2;
            }
            if ((list instanceof m0) && (list instanceof u.a)) {
                u.a aVar = (u.a) list;
                if (!aVar.p()) {
                    u.a b = aVar.b(list.size() + i);
                    b1.o(j, obj, b);
                    return b;
                }
            }
            return list;
        }

        @Override // androidx.datastore.preferences.protobuf.x
        public final void a(long j, Object obj) {
            Object unmodifiableList;
            List list = (List) b1.d.i(j, obj);
            if (list instanceof awf) {
                unmodifiableList = ((awf) list).j();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof m0) && (list instanceof u.a)) {
                    u.a aVar = (u.a) list;
                    if (aVar.p()) {
                        ((c) aVar).a = false;
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            b1.o(j, obj, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.x
        public final void b(long j, Object obj, Object obj2) {
            List list = (List) b1.d.i(j, obj2);
            List d = d(j, obj, list.size());
            int size = d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d.addAll(list);
            }
            if (size > 0) {
                list = d;
            }
            b1.o(j, obj, list);
        }

        @Override // androidx.datastore.preferences.protobuf.x
        public final List c(long j, Object obj) {
            return d(j, obj, 10);
        }
    }

    public static final class b extends x {
        @Override // androidx.datastore.preferences.protobuf.x
        public final void a(long j, Object obj) {
            ((c) ((u.a) b1.d.i(j, obj))).a = false;
        }

        @Override // androidx.datastore.preferences.protobuf.x
        public final void b(long j, Object obj, Object obj2) {
            b1.d dVar = b1.d;
            u.a aVar = (u.a) dVar.i(j, obj);
            u.a aVar2 = (u.a) dVar.i(j, obj2);
            int size = aVar.size();
            int size2 = aVar2.size();
            if (size > 0 && size2 > 0) {
                if (!aVar.p()) {
                    aVar = aVar.b(size2 + size);
                }
                aVar.addAll(aVar2);
            }
            if (size > 0) {
                aVar2 = aVar;
            }
            b1.o(j, obj, aVar2);
        }

        @Override // androidx.datastore.preferences.protobuf.x
        public final List c(long j, Object obj) {
            u.a aVar = (u.a) b1.d.i(j, obj);
            if (aVar.p()) {
                return aVar;
            }
            int size = aVar.size();
            u.a b = aVar.b(size == 0 ? 10 : size * 2);
            b1.o(j, obj, b);
            return b;
        }
    }

    public abstract void a(long j, Object obj);

    public abstract void b(long j, Object obj, Object obj2);

    public abstract List c(long j, Object obj);
}
