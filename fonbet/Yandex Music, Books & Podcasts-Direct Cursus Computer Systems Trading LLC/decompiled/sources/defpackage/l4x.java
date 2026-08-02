package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* loaded from: classes.dex */
public abstract class l4x {
    public static final Collector a;

    static {
        final int i = 0;
        final int i2 = 0;
        final int i3 = 1;
        final int i4 = 1;
        a = Collector.of(new Supplier() { // from class: u3x
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i) {
                    case 0:
                        return new d6x(1);
                    case 1:
                        return new s6x(1);
                    default:
                        return new n6x();
                }
            }
        }, new BiConsumer() { // from class: a4x
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((d6x) obj).c(obj2);
                        break;
                    case 1:
                        s6x s6xVar = (s6x) obj;
                        s6xVar.getClass();
                        obj2.getClass();
                        s6xVar.c(obj2);
                        break;
                    default:
                        n6x n6xVar = (n6x) obj;
                        o7x o7xVar = (o7x) obj2;
                        n6xVar.getClass();
                        if (!o7xVar.a.equals(o7xVar.b)) {
                            n6xVar.a.add(o7xVar);
                            break;
                        } else {
                            xq0.x(ocg.I("range must not be empty, but was %s", o7xVar));
                            break;
                        }
                }
            }
        }, new BinaryOperator() { // from class: w3x
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        n6x n6xVar = (n6x) obj;
                        n6xVar.getClass();
                        Iterator it = ((n6x) obj2).a.iterator();
                        while (it.hasNext()) {
                            o7x o7xVar = (o7x) it.next();
                            if (o7xVar.a.equals(o7xVar.b)) {
                                xq0.x(ocg.I("range must not be empty, but was %s", o7xVar));
                                return null;
                            }
                            n6xVar.a.add(o7xVar);
                        }
                        return n6xVar;
                    case 1:
                        d6x d6xVar = (d6x) obj;
                        d6x d6xVar2 = (d6x) obj2;
                        Object[] objArr = d6xVar2.c;
                        int i5 = d6xVar2.a;
                        for (int i6 = 0; i6 < i5; i6++) {
                            d6xVar.getClass();
                            if (objArr[i6] == null) {
                                jj4.j(k5r.i(i6, "at index "));
                                return null;
                            }
                        }
                        d6xVar.e(i5);
                        System.arraycopy(objArr, 0, d6xVar.c, d6xVar.a, i5);
                        d6xVar.a += i5;
                        return d6xVar;
                    default:
                        s6x s6xVar = (s6x) obj;
                        s6x s6xVar2 = (s6x) obj2;
                        Object[] objArr2 = s6xVar2.c;
                        int i7 = s6xVar2.a;
                        for (int i8 = 0; i8 < i7; i8++) {
                            s6xVar.getClass();
                            if (objArr2[i8] == null) {
                                jj4.j(k5r.i(i8, "at index "));
                                return null;
                            }
                        }
                        s6xVar.e(i7);
                        System.arraycopy(objArr2, 0, s6xVar.c, s6xVar.a, i7);
                        s6xVar.a += i7;
                        return s6xVar;
                }
            }
        }, new Function() { // from class: y3x
            /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0130 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int length;
                int d;
                o7x o7xVar;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = ((n6x) obj).a;
                        int size = arrayList.size();
                        wdg.a0(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, m7x.c);
                        Iterator it = arrayList.iterator();
                        w6x w6xVar = it instanceof w6x ? (w6x) it : new w6x(it);
                        int i5 = 0;
                        while (w6xVar.hasNext()) {
                            o7x o7xVar2 = (o7x) w6xVar.next();
                            while (w6xVar.hasNext()) {
                                if (!w6xVar.b) {
                                    w6xVar.c = w6xVar.a.next();
                                    w6xVar.b = true;
                                }
                                o7x o7xVar3 = (o7x) w6xVar.c;
                                p5x p5xVar = o7xVar2.a;
                                p5x p5xVar2 = o7xVar2.b;
                                p5x p5xVar3 = o7xVar3.b;
                                p5x p5xVar4 = o7xVar3.a;
                                if (p5xVar.a(p5xVar3) <= 0 && p5xVar4.a(p5xVar2) <= 0) {
                                    int a2 = p5xVar.a(p5xVar4);
                                    p5x p5xVar5 = o7xVar3.b;
                                    int a3 = p5xVar2.a(p5xVar5);
                                    if (a2 >= 0 && a3 <= 0) {
                                        o7xVar = o7xVar2;
                                    } else if (a2 > 0 || a3 < 0) {
                                        if (a2 >= 0) {
                                            p5xVar4 = p5xVar;
                                        }
                                        if (a3 <= 0) {
                                            p5xVar5 = p5xVar2;
                                        }
                                        if (!(p5xVar4.a(p5xVar5) <= 0)) {
                                            xq0.x(ocg.I("intersection is undefined for disconnected ranges %s and %s", o7xVar2, o7xVar3));
                                            return null;
                                        }
                                        o7xVar = new o7x(p5xVar4, p5xVar5);
                                    } else {
                                        o7xVar = o7xVar3;
                                    }
                                    if (!o7xVar.a.equals(o7xVar.b)) {
                                        xq0.x(ocg.I("Overlapping ranges not permitted but found %s overlapping %s", o7xVar2, o7xVar3));
                                        return null;
                                    }
                                    o7x o7xVar4 = (o7x) w6xVar.next();
                                    int a4 = p5xVar.a(o7xVar4.a);
                                    int a5 = p5xVar2.a(o7xVar4.b);
                                    if (a4 > 0 || a5 < 0) {
                                        if (a4 < 0 || a5 > 0) {
                                            if (a4 > 0) {
                                                p5xVar = o7xVar4.a;
                                            }
                                            if (a5 < 0) {
                                                o7xVar2 = o7xVar4;
                                            }
                                            o7xVar4 = new o7x(p5xVar, o7xVar2.b);
                                        }
                                        o7xVar2 = o7xVar4;
                                    }
                                }
                                o7xVar2.getClass();
                                length = objArr.length;
                                int i6 = i5 + 1;
                                d = h8s.d(length, i6);
                                if (d <= length) {
                                    objArr = Arrays.copyOf(objArr, d);
                                }
                                objArr[i5] = o7xVar2;
                                i5 = i6;
                            }
                            o7xVar2.getClass();
                            length = objArr.length;
                            int i62 = i5 + 1;
                            d = h8s.d(length, i62);
                            if (d <= length) {
                            }
                            objArr[i5] = o7xVar2;
                            i5 = i62;
                        }
                        p7x u = i6x.u(i5, objArr);
                        if (u.isEmpty()) {
                            return p6x.b;
                        }
                        if (u.d == 1) {
                            e6x w = u.w(0);
                            Object next = w.next();
                            if (w.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i7 = 0; i7 < 4 && w.hasNext(); i7++) {
                                    sb.append(", ");
                                    sb.append(w.next());
                                }
                                if (w.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((o7x) next).equals(o7x.c)) {
                                return p6x.c;
                            }
                        }
                        return new p6x(u);
                    case 1:
                        d6x d6xVar = (d6x) obj;
                        d6xVar.b = true;
                        return i6x.u(d6xVar.a, d6xVar.c);
                    default:
                        s6x s6xVar = (s6x) obj;
                        int i8 = s6xVar.a;
                        if (i8 == 0) {
                            return v7x.i;
                        }
                        Object[] objArr2 = s6xVar.c;
                        if (i8 == 1) {
                            Object obj2 = objArr2[0];
                            Objects.requireNonNull(obj2);
                            return new x7x(obj2);
                        }
                        u6x u2 = u6x.u(i8, objArr2);
                        s6xVar.a = u2.size();
                        s6xVar.b = true;
                        return u2;
                }
            }
        }, new Collector.Characteristics[0]);
        final int i5 = 1;
        final int i6 = 1;
        final int i7 = 2;
        final int i8 = 2;
        Collector.of(new Supplier() { // from class: u3x
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i5) {
                    case 0:
                        return new d6x(1);
                    case 1:
                        return new s6x(1);
                    default:
                        return new n6x();
                }
            }
        }, new BiConsumer() { // from class: a4x
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i6) {
                    case 0:
                        ((d6x) obj).c(obj2);
                        break;
                    case 1:
                        s6x s6xVar = (s6x) obj;
                        s6xVar.getClass();
                        obj2.getClass();
                        s6xVar.c(obj2);
                        break;
                    default:
                        n6x n6xVar = (n6x) obj;
                        o7x o7xVar = (o7x) obj2;
                        n6xVar.getClass();
                        if (!o7xVar.a.equals(o7xVar.b)) {
                            n6xVar.a.add(o7xVar);
                            break;
                        } else {
                            xq0.x(ocg.I("range must not be empty, but was %s", o7xVar));
                            break;
                        }
                }
            }
        }, new BinaryOperator() { // from class: w3x
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        n6x n6xVar = (n6x) obj;
                        n6xVar.getClass();
                        Iterator it = ((n6x) obj2).a.iterator();
                        while (it.hasNext()) {
                            o7x o7xVar = (o7x) it.next();
                            if (o7xVar.a.equals(o7xVar.b)) {
                                xq0.x(ocg.I("range must not be empty, but was %s", o7xVar));
                                return null;
                            }
                            n6xVar.a.add(o7xVar);
                        }
                        return n6xVar;
                    case 1:
                        d6x d6xVar = (d6x) obj;
                        d6x d6xVar2 = (d6x) obj2;
                        Object[] objArr = d6xVar2.c;
                        int i52 = d6xVar2.a;
                        for (int i62 = 0; i62 < i52; i62++) {
                            d6xVar.getClass();
                            if (objArr[i62] == null) {
                                jj4.j(k5r.i(i62, "at index "));
                                return null;
                            }
                        }
                        d6xVar.e(i52);
                        System.arraycopy(objArr, 0, d6xVar.c, d6xVar.a, i52);
                        d6xVar.a += i52;
                        return d6xVar;
                    default:
                        s6x s6xVar = (s6x) obj;
                        s6x s6xVar2 = (s6x) obj2;
                        Object[] objArr2 = s6xVar2.c;
                        int i72 = s6xVar2.a;
                        for (int i82 = 0; i82 < i72; i82++) {
                            s6xVar.getClass();
                            if (objArr2[i82] == null) {
                                jj4.j(k5r.i(i82, "at index "));
                                return null;
                            }
                        }
                        s6xVar.e(i72);
                        System.arraycopy(objArr2, 0, s6xVar.c, s6xVar.a, i72);
                        s6xVar.a += i72;
                        return s6xVar;
                }
            }
        }, new Function() { // from class: y3x
            /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0130 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int length;
                int d;
                o7x o7xVar;
                switch (i8) {
                    case 0:
                        ArrayList arrayList = ((n6x) obj).a;
                        int size = arrayList.size();
                        wdg.a0(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, m7x.c);
                        Iterator it = arrayList.iterator();
                        w6x w6xVar = it instanceof w6x ? (w6x) it : new w6x(it);
                        int i52 = 0;
                        while (w6xVar.hasNext()) {
                            o7x o7xVar2 = (o7x) w6xVar.next();
                            while (w6xVar.hasNext()) {
                                if (!w6xVar.b) {
                                    w6xVar.c = w6xVar.a.next();
                                    w6xVar.b = true;
                                }
                                o7x o7xVar3 = (o7x) w6xVar.c;
                                p5x p5xVar = o7xVar2.a;
                                p5x p5xVar2 = o7xVar2.b;
                                p5x p5xVar3 = o7xVar3.b;
                                p5x p5xVar4 = o7xVar3.a;
                                if (p5xVar.a(p5xVar3) <= 0 && p5xVar4.a(p5xVar2) <= 0) {
                                    int a2 = p5xVar.a(p5xVar4);
                                    p5x p5xVar5 = o7xVar3.b;
                                    int a3 = p5xVar2.a(p5xVar5);
                                    if (a2 >= 0 && a3 <= 0) {
                                        o7xVar = o7xVar2;
                                    } else if (a2 > 0 || a3 < 0) {
                                        if (a2 >= 0) {
                                            p5xVar4 = p5xVar;
                                        }
                                        if (a3 <= 0) {
                                            p5xVar5 = p5xVar2;
                                        }
                                        if (!(p5xVar4.a(p5xVar5) <= 0)) {
                                            xq0.x(ocg.I("intersection is undefined for disconnected ranges %s and %s", o7xVar2, o7xVar3));
                                            return null;
                                        }
                                        o7xVar = new o7x(p5xVar4, p5xVar5);
                                    } else {
                                        o7xVar = o7xVar3;
                                    }
                                    if (!o7xVar.a.equals(o7xVar.b)) {
                                        xq0.x(ocg.I("Overlapping ranges not permitted but found %s overlapping %s", o7xVar2, o7xVar3));
                                        return null;
                                    }
                                    o7x o7xVar4 = (o7x) w6xVar.next();
                                    int a4 = p5xVar.a(o7xVar4.a);
                                    int a5 = p5xVar2.a(o7xVar4.b);
                                    if (a4 > 0 || a5 < 0) {
                                        if (a4 < 0 || a5 > 0) {
                                            if (a4 > 0) {
                                                p5xVar = o7xVar4.a;
                                            }
                                            if (a5 < 0) {
                                                o7xVar2 = o7xVar4;
                                            }
                                            o7xVar4 = new o7x(p5xVar, o7xVar2.b);
                                        }
                                        o7xVar2 = o7xVar4;
                                    }
                                }
                                o7xVar2.getClass();
                                length = objArr.length;
                                int i62 = i52 + 1;
                                d = h8s.d(length, i62);
                                if (d <= length) {
                                    objArr = Arrays.copyOf(objArr, d);
                                }
                                objArr[i52] = o7xVar2;
                                i52 = i62;
                            }
                            o7xVar2.getClass();
                            length = objArr.length;
                            int i622 = i52 + 1;
                            d = h8s.d(length, i622);
                            if (d <= length) {
                            }
                            objArr[i52] = o7xVar2;
                            i52 = i622;
                        }
                        p7x u = i6x.u(i52, objArr);
                        if (u.isEmpty()) {
                            return p6x.b;
                        }
                        if (u.d == 1) {
                            e6x w = u.w(0);
                            Object next = w.next();
                            if (w.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i72 = 0; i72 < 4 && w.hasNext(); i72++) {
                                    sb.append(", ");
                                    sb.append(w.next());
                                }
                                if (w.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((o7x) next).equals(o7x.c)) {
                                return p6x.c;
                            }
                        }
                        return new p6x(u);
                    case 1:
                        d6x d6xVar = (d6x) obj;
                        d6xVar.b = true;
                        return i6x.u(d6xVar.a, d6xVar.c);
                    default:
                        s6x s6xVar = (s6x) obj;
                        int i82 = s6xVar.a;
                        if (i82 == 0) {
                            return v7x.i;
                        }
                        Object[] objArr2 = s6xVar.c;
                        if (i82 == 1) {
                            Object obj2 = objArr2[0];
                            Objects.requireNonNull(obj2);
                            return new x7x(obj2);
                        }
                        u6x u2 = u6x.u(i82, objArr2);
                        s6xVar.a = u2.size();
                        s6xVar.b = true;
                        return u2;
                }
            }
        }, new Collector.Characteristics[0]);
        final int i9 = 2;
        final int i10 = 2;
        final int i11 = 0;
        final int i12 = 0;
        Collector.of(new Supplier() { // from class: u3x
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i9) {
                    case 0:
                        return new d6x(1);
                    case 1:
                        return new s6x(1);
                    default:
                        return new n6x();
                }
            }
        }, new BiConsumer() { // from class: a4x
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((d6x) obj).c(obj2);
                        break;
                    case 1:
                        s6x s6xVar = (s6x) obj;
                        s6xVar.getClass();
                        obj2.getClass();
                        s6xVar.c(obj2);
                        break;
                    default:
                        n6x n6xVar = (n6x) obj;
                        o7x o7xVar = (o7x) obj2;
                        n6xVar.getClass();
                        if (!o7xVar.a.equals(o7xVar.b)) {
                            n6xVar.a.add(o7xVar);
                            break;
                        } else {
                            xq0.x(ocg.I("range must not be empty, but was %s", o7xVar));
                            break;
                        }
                }
            }
        }, new BinaryOperator() { // from class: w3x
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        n6x n6xVar = (n6x) obj;
                        n6xVar.getClass();
                        Iterator it = ((n6x) obj2).a.iterator();
                        while (it.hasNext()) {
                            o7x o7xVar = (o7x) it.next();
                            if (o7xVar.a.equals(o7xVar.b)) {
                                xq0.x(ocg.I("range must not be empty, but was %s", o7xVar));
                                return null;
                            }
                            n6xVar.a.add(o7xVar);
                        }
                        return n6xVar;
                    case 1:
                        d6x d6xVar = (d6x) obj;
                        d6x d6xVar2 = (d6x) obj2;
                        Object[] objArr = d6xVar2.c;
                        int i52 = d6xVar2.a;
                        for (int i62 = 0; i62 < i52; i62++) {
                            d6xVar.getClass();
                            if (objArr[i62] == null) {
                                jj4.j(k5r.i(i62, "at index "));
                                return null;
                            }
                        }
                        d6xVar.e(i52);
                        System.arraycopy(objArr, 0, d6xVar.c, d6xVar.a, i52);
                        d6xVar.a += i52;
                        return d6xVar;
                    default:
                        s6x s6xVar = (s6x) obj;
                        s6x s6xVar2 = (s6x) obj2;
                        Object[] objArr2 = s6xVar2.c;
                        int i72 = s6xVar2.a;
                        for (int i82 = 0; i82 < i72; i82++) {
                            s6xVar.getClass();
                            if (objArr2[i82] == null) {
                                jj4.j(k5r.i(i82, "at index "));
                                return null;
                            }
                        }
                        s6xVar.e(i72);
                        System.arraycopy(objArr2, 0, s6xVar.c, s6xVar.a, i72);
                        s6xVar.a += i72;
                        return s6xVar;
                }
            }
        }, new Function() { // from class: y3x
            /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0130 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int length;
                int d;
                o7x o7xVar;
                switch (i12) {
                    case 0:
                        ArrayList arrayList = ((n6x) obj).a;
                        int size = arrayList.size();
                        wdg.a0(size, "initialCapacity");
                        Object[] objArr = new Object[size];
                        Collections.sort(arrayList, m7x.c);
                        Iterator it = arrayList.iterator();
                        w6x w6xVar = it instanceof w6x ? (w6x) it : new w6x(it);
                        int i52 = 0;
                        while (w6xVar.hasNext()) {
                            o7x o7xVar2 = (o7x) w6xVar.next();
                            while (w6xVar.hasNext()) {
                                if (!w6xVar.b) {
                                    w6xVar.c = w6xVar.a.next();
                                    w6xVar.b = true;
                                }
                                o7x o7xVar3 = (o7x) w6xVar.c;
                                p5x p5xVar = o7xVar2.a;
                                p5x p5xVar2 = o7xVar2.b;
                                p5x p5xVar3 = o7xVar3.b;
                                p5x p5xVar4 = o7xVar3.a;
                                if (p5xVar.a(p5xVar3) <= 0 && p5xVar4.a(p5xVar2) <= 0) {
                                    int a2 = p5xVar.a(p5xVar4);
                                    p5x p5xVar5 = o7xVar3.b;
                                    int a3 = p5xVar2.a(p5xVar5);
                                    if (a2 >= 0 && a3 <= 0) {
                                        o7xVar = o7xVar2;
                                    } else if (a2 > 0 || a3 < 0) {
                                        if (a2 >= 0) {
                                            p5xVar4 = p5xVar;
                                        }
                                        if (a3 <= 0) {
                                            p5xVar5 = p5xVar2;
                                        }
                                        if (!(p5xVar4.a(p5xVar5) <= 0)) {
                                            xq0.x(ocg.I("intersection is undefined for disconnected ranges %s and %s", o7xVar2, o7xVar3));
                                            return null;
                                        }
                                        o7xVar = new o7x(p5xVar4, p5xVar5);
                                    } else {
                                        o7xVar = o7xVar3;
                                    }
                                    if (!o7xVar.a.equals(o7xVar.b)) {
                                        xq0.x(ocg.I("Overlapping ranges not permitted but found %s overlapping %s", o7xVar2, o7xVar3));
                                        return null;
                                    }
                                    o7x o7xVar4 = (o7x) w6xVar.next();
                                    int a4 = p5xVar.a(o7xVar4.a);
                                    int a5 = p5xVar2.a(o7xVar4.b);
                                    if (a4 > 0 || a5 < 0) {
                                        if (a4 < 0 || a5 > 0) {
                                            if (a4 > 0) {
                                                p5xVar = o7xVar4.a;
                                            }
                                            if (a5 < 0) {
                                                o7xVar2 = o7xVar4;
                                            }
                                            o7xVar4 = new o7x(p5xVar, o7xVar2.b);
                                        }
                                        o7xVar2 = o7xVar4;
                                    }
                                }
                                o7xVar2.getClass();
                                length = objArr.length;
                                int i622 = i52 + 1;
                                d = h8s.d(length, i622);
                                if (d <= length) {
                                    objArr = Arrays.copyOf(objArr, d);
                                }
                                objArr[i52] = o7xVar2;
                                i52 = i622;
                            }
                            o7xVar2.getClass();
                            length = objArr.length;
                            int i6222 = i52 + 1;
                            d = h8s.d(length, i6222);
                            if (d <= length) {
                            }
                            objArr[i52] = o7xVar2;
                            i52 = i6222;
                        }
                        p7x u = i6x.u(i52, objArr);
                        if (u.isEmpty()) {
                            return p6x.b;
                        }
                        if (u.d == 1) {
                            e6x w = u.w(0);
                            Object next = w.next();
                            if (w.hasNext()) {
                                StringBuilder sb = new StringBuilder("expected one element but was: <");
                                sb.append(next);
                                for (int i72 = 0; i72 < 4 && w.hasNext(); i72++) {
                                    sb.append(", ");
                                    sb.append(w.next());
                                }
                                if (w.hasNext()) {
                                    sb.append(", ...");
                                }
                                sb.append('>');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            if (((o7x) next).equals(o7x.c)) {
                                return p6x.c;
                            }
                        }
                        return new p6x(u);
                    case 1:
                        d6x d6xVar = (d6x) obj;
                        d6xVar.b = true;
                        return i6x.u(d6xVar.a, d6xVar.c);
                    default:
                        s6x s6xVar = (s6x) obj;
                        int i82 = s6xVar.a;
                        if (i82 == 0) {
                            return v7x.i;
                        }
                        Object[] objArr2 = s6xVar.c;
                        if (i82 == 1) {
                            Object obj2 = objArr2[0];
                            Objects.requireNonNull(obj2);
                            return new x7x(obj2);
                        }
                        u6x u2 = u6x.u(i82, objArr2);
                        s6xVar.a = u2.size();
                        s6xVar.b = true;
                        return u2;
                }
            }
        }, new Collector.Characteristics[0]);
    }
}
