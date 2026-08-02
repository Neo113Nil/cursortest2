package com.squareup.cash.moneybot.backend.api.model.chat;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes6.dex */
public final class MessageList implements List, KMappedMarker {
    public final Long createdAt;
    public final String messageId;
    public final List messages;

    public MessageList(String str, Long l, List list) {
        list.getClass();
        this.messageId = str;
        this.createdAt = l;
        this.messages = list;
    }

    public static MessageList copy$default(MessageList messageList, List list) {
        String str = messageList.messageId;
        Long l = messageList.createdAt;
        messageList.getClass();
        list.getClass();
        return new MessageList(str, l, list);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Message)) {
            return false;
        }
        return this.messages.contains((Message) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.messages.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageList)) {
            return false;
        }
        MessageList messageList = (MessageList) obj;
        return Intrinsics.areEqual(this.messageId, messageList.messageId) && Intrinsics.areEqual(this.createdAt, messageList.createdAt) && Intrinsics.areEqual(this.messages, messageList.messages);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (Message) this.messages.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        String str = this.messageId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.createdAt;
        return this.messages.hashCode() + ((hashCode + (l != null ? l.hashCode() : 0)) * 31);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Message)) {
            return -1;
        }
        return this.messages.indexOf((Message) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.messages.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.messages.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Message)) {
            return -1;
        }
        return this.messages.lastIndexOf((Message) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.messages.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.messages.size();
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.messages.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ArrayIteratorKt.toArray(this, objArr);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(RumErrorSource$EnumUnboxingLocalUtility.m(this.createdAt, "MessageList(messageId=", this.messageId, ", createdAt=", ", messages="), this.messages, ")");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.messages.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ArrayIteratorKt.toArray(this);
    }
}
