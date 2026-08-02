package com.nimbusds.jose.shaded.gson.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.moshi.LinkedHashTreeMap;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes5.dex */
public final class LinkedTreeMap extends AbstractMap implements Serializable {
    public static final b.C0008b NATURAL_ORDER = new b.C0008b(2);
    public final boolean allowNullValues;
    public KeySet entrySet;
    public final Node header;
    public KeySet keySet;
    public Node root;
    public int size = 0;
    public int modCount = 0;
    public final Comparator comparator = NATURAL_ORDER;

    public final class KeySet extends AbstractSet {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ LinkedTreeMap this$0;

        public /* synthetic */ KeySet(LinkedTreeMap linkedTreeMap, int i) {
            this.$r8$classId = i;
            this.this$0 = linkedTreeMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            int i = this.$r8$classId;
            LinkedTreeMap linkedTreeMap = this.this$0;
            switch (i) {
                case 0:
                    linkedTreeMap.clear();
                    break;
                default:
                    linkedTreeMap.clear();
                    break;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean contains(Object obj) {
            Node find;
            int i = this.$r8$classId;
            LinkedTreeMap linkedTreeMap = this.this$0;
            switch (i) {
                case 0:
                    return linkedTreeMap.containsKey(obj);
                default:
                    if (!(obj instanceof Map.Entry)) {
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Node node = null;
                    if (key != null) {
                        try {
                            find = linkedTreeMap.find(key, false);
                        } catch (ClassCastException unused) {
                        }
                        if (find != null && Objects.equals(find.value, entry.getValue())) {
                            node = find;
                        }
                        return node == null;
                    }
                    find = null;
                    if (find != null) {
                        node = find;
                    }
                    if (node == null) {
                    }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            int i = this.$r8$classId;
            LinkedTreeMap linkedTreeMap = this.this$0;
            switch (i) {
                case 0:
                    final int i2 = 0;
                    return new LinkedHashTreeMap.LinkedTreeMapIterator(linkedTreeMap) { // from class: com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap.KeySet.1
                        @Override // com.squareup.moshi.LinkedHashTreeMap.LinkedTreeMapIterator, java.util.Iterator
                        public Object next() {
                            switch (i2) {
                                case 0:
                                    return nextNode().key;
                                default:
                                    return super.next();
                            }
                        }
                    };
                default:
                    final int i3 = 1;
                    return new LinkedHashTreeMap.LinkedTreeMapIterator(linkedTreeMap) { // from class: com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap.KeySet.1
                        @Override // com.squareup.moshi.LinkedHashTreeMap.LinkedTreeMapIterator, java.util.Iterator
                        public Object next() {
                            switch (i3) {
                                case 0:
                                    return nextNode().key;
                                default:
                                    return super.next();
                            }
                        }
                    };
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean remove(Object obj) {
            Node find;
            int i = this.$r8$classId;
            Node node = null;
            LinkedTreeMap linkedTreeMap = this.this$0;
            switch (i) {
                case 0:
                    if (obj != null) {
                        try {
                            node = linkedTreeMap.find(obj, false);
                        } catch (ClassCastException unused) {
                        }
                    }
                    if (node != null) {
                        linkedTreeMap.removeInternal(node, true);
                    }
                    if (node != null) {
                        break;
                    }
                    break;
                default:
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        Object key = entry.getKey();
                        if (key != null) {
                            try {
                                find = linkedTreeMap.find(key, false);
                            } catch (ClassCastException unused2) {
                            }
                            if (find != null && Objects.equals(find.value, entry.getValue())) {
                                node = find;
                            }
                            if (node == null) {
                                linkedTreeMap.removeInternal(node, true);
                                break;
                            }
                        }
                        find = null;
                        if (find != null) {
                            node = find;
                        }
                        if (node == null) {
                        }
                    }
                    break;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            int i = this.$r8$classId;
            LinkedTreeMap linkedTreeMap = this.this$0;
            switch (i) {
            }
            return linkedTreeMap.size;
        }
    }

    public LinkedTreeMap(boolean z) {
        this.allowNullValues = z;
        this.header = new Node(z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        Node node = this.header;
        node.prev = node;
        node.next = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Node node = null;
        if (obj != null) {
            try {
                node = find(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return node != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        KeySet keySet = this.entrySet;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet(this, 1);
        this.entrySet = keySet2;
        return keySet2;
    }

    public final Node find(Object obj, boolean z) {
        int i;
        Node node;
        Node node2 = this.root;
        b.C0008b c0008b = NATURAL_ORDER;
        Comparator comparator = this.comparator;
        if (node2 != null) {
            Comparable comparable = comparator == c0008b ? (Comparable) obj : null;
            while (true) {
                Object obj2 = node2.key;
                i = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i == 0) {
                    return node2;
                }
                Node node3 = i < 0 ? node2.left : node2.right;
                if (node3 == null) {
                    break;
                }
                node2 = node3;
            }
        } else {
            i = 0;
        }
        Node node4 = node2;
        if (!z) {
            return null;
        }
        Node node5 = this.header;
        if (node4 != null) {
            node = new Node(this.allowNullValues, node4, obj, node5, node5.prev);
            if (i < 0) {
                node4.left = node;
            } else {
                node4.right = node;
            }
            rebalance(node4, true);
        } else {
            if (comparator == c0008b && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            node = new Node(this.allowNullValues, node4, obj, node5, node5.prev);
            this.root = node;
        }
        this.size++;
        this.modCount++;
        return node;
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
                node = find(obj, false);
            } catch (ClassCastException unused) {
            }
            if (node == null) {
                return node.value;
            }
            return null;
        }
        node = null;
        if (node == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        KeySet keySet = this.keySet;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet(this, 0);
        this.keySet = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            a$$ExternalSyntheticBUOutline0.m$2("key == null");
            return null;
        }
        if (obj2 == null && !this.allowNullValues) {
            a$$ExternalSyntheticBUOutline0.m$2("value == null");
            return null;
        }
        Node find = find(obj, true);
        Object obj3 = find.value;
        find.value = obj2;
        return obj3;
    }

    public final void rebalance(Node node, boolean z) {
        while (node != null) {
            Node node2 = node.left;
            Node node3 = node.right;
            int i = node2 != null ? node2.height : 0;
            int i2 = node3 != null ? node3.height : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                Node node4 = node3.left;
                Node node5 = node3.right;
                int i4 = (node4 != null ? node4.height : 0) - (node5 != null ? node5.height : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    rotateLeft(node);
                } else {
                    rotateRight(node3);
                    rotateLeft(node);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                Node node6 = node2.left;
                Node node7 = node2.right;
                int i5 = (node6 != null ? node6.height : 0) - (node7 != null ? node7.height : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    rotateRight(node);
                } else {
                    rotateLeft(node2);
                    rotateRight(node);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                node.height = i + 1;
                if (z) {
                    return;
                }
            } else {
                node.height = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.parent;
        }
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
                node = find(obj, false);
            } catch (ClassCastException unused) {
            }
            if (node != null) {
                removeInternal(node, true);
            }
            if (node == null) {
                return node.value;
            }
            return null;
        }
        node = null;
        if (node != null) {
        }
        if (node == null) {
        }
    }

    public final void removeInternal(Node node, boolean z) {
        Node node2;
        Node node3;
        int i;
        if (z) {
            Node node4 = node.prev;
            node4.next = node.next;
            node.next.prev = node4;
        }
        Node node5 = node.left;
        Node node6 = node.right;
        Node node7 = node.parent;
        int i2 = 0;
        if (node5 == null || node6 == null) {
            if (node5 != null) {
                replaceInParent(node, node5);
                node.left = null;
            } else if (node6 != null) {
                replaceInParent(node, node6);
                node.right = null;
            } else {
                replaceInParent(node, null);
            }
            rebalance(node7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (node5.height > node6.height) {
            Node node8 = node5.right;
            while (true) {
                Node node9 = node8;
                node3 = node5;
                node5 = node9;
                if (node5 == null) {
                    break;
                } else {
                    node8 = node5.right;
                }
            }
        } else {
            Node node10 = node6.left;
            while (true) {
                node2 = node6;
                node6 = node10;
                if (node6 == null) {
                    break;
                } else {
                    node10 = node6.left;
                }
            }
            node3 = node2;
        }
        removeInternal(node3, false);
        Node node11 = node.left;
        if (node11 != null) {
            i = node11.height;
            node3.left = node11;
            node11.parent = node3;
            node.left = null;
        } else {
            i = 0;
        }
        Node node12 = node.right;
        if (node12 != null) {
            i2 = node12.height;
            node3.right = node12;
            node12.parent = node3;
            node.right = null;
        }
        node3.height = Math.max(i, i2) + 1;
        replaceInParent(node, node3);
    }

    public final void replaceInParent(Node node, Node node2) {
        Node node3 = node.parent;
        node.parent = null;
        if (node2 != null) {
            node2.parent = node3;
        }
        if (node3 == null) {
            this.root = node2;
        } else if (node3.left == node) {
            node3.left = node2;
        } else {
            node3.right = node2;
        }
    }

    public final void rotateLeft(Node node) {
        Node node2 = node.left;
        Node node3 = node.right;
        Node node4 = node3.left;
        Node node5 = node3.right;
        node.right = node4;
        if (node4 != null) {
            node4.parent = node;
        }
        replaceInParent(node, node3);
        node3.left = node;
        node.parent = node3;
        int max = Math.max(node2 != null ? node2.height : 0, node4 != null ? node4.height : 0) + 1;
        node.height = max;
        node3.height = Math.max(max, node5 != null ? node5.height : 0) + 1;
    }

    public final void rotateRight(Node node) {
        Node node2 = node.left;
        Node node3 = node.right;
        Node node4 = node2.left;
        Node node5 = node2.right;
        node.left = node5;
        if (node5 != null) {
            node5.parent = node;
        }
        replaceInParent(node, node2);
        node2.right = node;
        node.parent = node2;
        int max = Math.max(node3 != null ? node3.height : 0, node5 != null ? node5.height : 0) + 1;
        node.height = max;
        node2.height = Math.max(max, node4 != null ? node4.height : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.size;
    }

    public final class Node implements Map.Entry {
        public final boolean allowNullValue;
        public int height;
        public final Object key;
        public Node left;
        public Node next;
        public Node parent;
        public Node prev;
        public Node right;
        public Object value;

        public Node(boolean z, Node node, Object obj, Node node2, Node node3) {
            this.parent = node;
            this.key = obj;
            this.allowNullValue = z;
            this.height = 1;
            this.next = node2;
            this.prev = node3;
            node3.next = this;
            node2.prev = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.key;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.value;
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
            return this.key;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object obj = this.key;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.value;
            return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj == null && !this.allowNullValue) {
                a$$ExternalSyntheticBUOutline0.m$2("value == null");
                return null;
            }
            Object obj2 = this.value;
            this.value = obj;
            return obj2;
        }

        public final String toString() {
            return this.key + "=" + this.value;
        }

        public Node(boolean z) {
            this.key = null;
            this.allowNullValue = z;
            this.prev = this;
            this.next = this;
        }
    }
}
