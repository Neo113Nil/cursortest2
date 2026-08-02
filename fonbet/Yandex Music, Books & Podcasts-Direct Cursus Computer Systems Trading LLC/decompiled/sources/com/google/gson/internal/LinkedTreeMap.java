package com.google.gson.internal;

import defpackage.e7o;
import defpackage.jj4;
import defpackage.wvs;
import defpackage.xq0;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator i = new AnonymousClass1();
    public final boolean b;
    public Node c;
    public final Node f;
    public EntrySet g;
    public KeySet h;
    public int d = 0;
    public int e = 0;
    public final Comparator a = i;

    /* renamed from: com.google.gson.internal.LinkedTreeMap$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$EntrySet$1, reason: invalid class name */
        class AnonymousClass1 extends LinkedTreeMap<Object, Object>.LinkedTreeMapIterator<Map.Entry<Object, Object>> {
        }

        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean contains(Object obj) {
            Node a;
            if (obj instanceof Map.Entry) {
                LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Node node = null;
                if (key != null) {
                    try {
                        a = linkedTreeMap.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && Objects.equals(a.h, entry.getValue())) {
                        node = a;
                    }
                    if (node == null) {
                        return true;
                    }
                }
                a = null;
                if (a != null) {
                    node = a;
                }
                if (node == null) {
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new AnonymousClass1();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean remove(Object obj) {
            Node a;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                Node node = null;
                if (key != null) {
                    try {
                        a = linkedTreeMap.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && Objects.equals(a.h, entry.getValue())) {
                        node = a;
                    }
                    if (node != null) {
                        linkedTreeMap.c(node, true);
                        return true;
                    }
                }
                a = null;
                if (a != null) {
                    node = a;
                }
                if (node != null) {
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.d;
        }
    }

    public final class KeySet extends AbstractSet<K> {

        /* renamed from: com.google.gson.internal.LinkedTreeMap$KeySet$1, reason: invalid class name */
        class AnonymousClass1 extends LinkedTreeMap<Object, Object>.LinkedTreeMapIterator<Object> {
            @Override // com.google.gson.internal.LinkedTreeMap.LinkedTreeMapIterator, java.util.Iterator
            public final Object next() {
                return a().f;
            }
        }

        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new AnonymousClass1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            Node node = null;
            if (obj != null) {
                try {
                    node = linkedTreeMap.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (node != null) {
                linkedTreeMap.c(node, true);
            }
            return node != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.d;
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        public Node a;
        public Node b = null;
        public int c;

        public LinkedTreeMapIterator() {
            this.a = LinkedTreeMap.this.f.d;
            this.c = LinkedTreeMap.this.e;
        }

        public final Node a() {
            Node node = this.a;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (node == linkedTreeMap.f) {
                wvs.n();
                return null;
            }
            if (linkedTreeMap.e != this.c) {
                xq0.i();
                return null;
            }
            this.a = node.d;
            this.b = node;
            return node;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a != LinkedTreeMap.this.f;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node node = this.b;
            if (node == null) {
                e7o.n();
                return;
            }
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.c(node, true);
            this.b = null;
            this.c = linkedTreeMap.e;
        }
    }

    public LinkedTreeMap(boolean z) {
        this.b = z;
        this.f = new Node(z);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final Node a(Object obj, boolean z) {
        int i2;
        Node node;
        Node node2 = this.c;
        Comparator comparator = i;
        Comparator comparator2 = this.a;
        if (node2 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) obj : null;
            while (true) {
                Object obj2 = node2.f;
                i2 = comparable != null ? comparable.compareTo(obj2) : comparator2.compare(obj, obj2);
                if (i2 == 0) {
                    return node2;
                }
                Node node3 = i2 < 0 ? node2.b : node2.c;
                if (node3 == null) {
                    break;
                }
                node2 = node3;
            }
        } else {
            i2 = 0;
        }
        Node node4 = node2;
        if (!z) {
            return null;
        }
        Node node5 = this.f;
        if (node4 != null) {
            node = new Node(this.b, node4, obj, node5, node5.e);
            if (i2 < 0) {
                node4.b = node;
            } else {
                node4.c = node;
            }
            b(node4, true);
        } else {
            if (comparator2 == comparator && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            node = new Node(this.b, node4, obj, node5, node5.e);
            this.c = node;
        }
        this.d++;
        this.e++;
        return node;
    }

    public final void b(Node node, boolean z) {
        while (node != null) {
            Node node2 = node.b;
            Node node3 = node.c;
            int i2 = node2 != null ? node2.i : 0;
            int i3 = node3 != null ? node3.i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                Node node4 = node3.b;
                Node node5 = node3.c;
                int i5 = (node4 != null ? node4.i : 0) - (node5 != null ? node5.i : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    e(node);
                } else {
                    f(node3);
                    e(node);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                Node node6 = node2.b;
                Node node7 = node2.c;
                int i6 = (node6 != null ? node6.i : 0) - (node7 != null ? node7.i : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    f(node);
                } else {
                    e(node2);
                    f(node);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                node.i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                node.i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.a;
        }
    }

    public final void c(Node node, boolean z) {
        Node node2;
        Node node3;
        int i2;
        if (z) {
            Node node4 = node.e;
            node4.d = node.d;
            node.d.e = node4;
        }
        Node node5 = node.b;
        Node node6 = node.c;
        Node node7 = node.a;
        int i3 = 0;
        if (node5 == null || node6 == null) {
            if (node5 != null) {
                d(node, node5);
                node.b = null;
            } else if (node6 != null) {
                d(node, node6);
                node.c = null;
            } else {
                d(node, null);
            }
            b(node7, false);
            this.d--;
            this.e++;
            return;
        }
        if (node5.i > node6.i) {
            Node node8 = node5.c;
            while (true) {
                Node node9 = node8;
                node3 = node5;
                node5 = node9;
                if (node5 == null) {
                    break;
                } else {
                    node8 = node5.c;
                }
            }
        } else {
            Node node10 = node6.b;
            while (true) {
                node2 = node6;
                node6 = node10;
                if (node6 == null) {
                    break;
                } else {
                    node10 = node6.b;
                }
            }
            node3 = node2;
        }
        c(node3, false);
        Node node11 = node.b;
        if (node11 != null) {
            i2 = node11.i;
            node3.b = node11;
            node11.a = node3;
            node.b = null;
        } else {
            i2 = 0;
        }
        Node node12 = node.c;
        if (node12 != null) {
            i3 = node12.i;
            node3.c = node12;
            node12.a = node3;
            node.c = null;
        }
        node3.i = Math.max(i2, i3) + 1;
        d(node, node3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        Node node = this.f;
        node.e = node;
        node.d = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Node node = null;
        if (obj != null) {
            try {
                node = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return node != null;
    }

    public final void d(Node node, Node node2) {
        Node node3 = node.a;
        node.a = null;
        if (node2 != null) {
            node2.a = node3;
        }
        if (node3 == null) {
            this.c = node2;
        } else if (node3.b == node) {
            node3.b = node2;
        } else {
            node3.c = node2;
        }
    }

    public final void e(Node node) {
        Node node2 = node.b;
        Node node3 = node.c;
        Node node4 = node3.b;
        Node node5 = node3.c;
        node.c = node4;
        if (node4 != null) {
            node4.a = node;
        }
        d(node, node3);
        node3.b = node;
        node.a = node3;
        int max = Math.max(node2 != null ? node2.i : 0, node4 != null ? node4.i : 0) + 1;
        node.i = max;
        node3.i = Math.max(max, node5 != null ? node5.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        EntrySet entrySet = this.g;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.g = entrySet2;
        return entrySet2;
    }

    public final void f(Node node) {
        Node node2 = node.b;
        Node node3 = node.c;
        Node node4 = node2.b;
        Node node5 = node2.c;
        node.b = node5;
        if (node5 != null) {
            node5.a = node;
        }
        d(node, node2);
        node2.c = node;
        node.a = node2;
        int max = Math.max(node3 != null ? node3.i : 0, node5 != null ? node5.i : 0) + 1;
        node.i = max;
        node2.i = Math.max(max, node4 != null ? node4.i : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Node node;
        if (obj != null) {
            try {
                node = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (node == null) {
                return node.h;
            }
            return null;
        }
        node = null;
        if (node == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        KeySet keySet = this.h;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.h = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            jj4.j("key == null");
            return null;
        }
        if (obj2 == null && !this.b) {
            jj4.j("value == null");
            return null;
        }
        Node a = a(obj, true);
        Object obj3 = a.h;
        a.h = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        Node node;
        if (obj != null) {
            try {
                node = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (node != null) {
                c(node, true);
            }
            if (node == null) {
                return node.h;
            }
            return null;
        }
        node = null;
        if (node != null) {
        }
        if (node == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {
        public Node a;
        public Node b;
        public Node c;
        public Node d;
        public Node e;
        public final Object f;
        public final boolean g;
        public Object h;
        public int i;

        public Node(boolean z, Node node, Object obj, Node node2, Node node3) {
            this.a = node;
            this.f = obj;
            this.g = z;
            this.i = 1;
            this.d = node2;
            this.e = node3;
            node3.d = this;
            node2.e = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.h;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.h;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object obj = this.f;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.h;
            return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj == null && !this.g) {
                jj4.j("value == null");
                return null;
            }
            Object obj2 = this.h;
            this.h = obj;
            return obj2;
        }

        public final String toString() {
            return this.f + "=" + this.h;
        }

        public Node(boolean z) {
            this.f = null;
            this.g = z;
            this.e = this;
            this.d = this;
        }
    }
}
