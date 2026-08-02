package ru.yandex.video.m3.player.impl.utils;

import com.adjust.sdk.Constants;
import java.util.LinkedList;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/LimitedLinkedList;", "T", "Ljava/util/LinkedList;", "", "capacity", "<init>", "(I)V", "element", "", "add", "(Ljava/lang/Object;)Z", "Lzy11;", Constants.PUSH, "(Ljava/lang/Object;)V", "e", "addFirst", "addLast", "offer", CA20Status.STATUS_USER_I, "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LimitedLinkedList<T> extends LinkedList<T> {
    public static final int $stable = 0;
    private final int capacity;

    public LimitedLinkedList(int i) {
        this.capacity = i;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(T element) {
        if (size() >= this.capacity) {
            pop();
        }
        return super.add(element);
    }

    @Override // java.util.LinkedList, java.util.Deque
    public void addFirst(T e) {
        if (size() >= this.capacity) {
            removeLast();
        }
        super.addFirst(e);
    }

    @Override // java.util.LinkedList, java.util.Deque
    public void addLast(T e) {
        if (size() >= this.capacity) {
            removeFirst();
        }
        super.addLast(e);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    public boolean offer(T e) {
        if (size() >= this.capacity) {
            poll();
        }
        return super.offer(e);
    }

    @Override // java.util.LinkedList, java.util.Deque
    public void push(T element) {
        if (size() >= this.capacity) {
            removeLast();
        }
        super.push(element);
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }
}
