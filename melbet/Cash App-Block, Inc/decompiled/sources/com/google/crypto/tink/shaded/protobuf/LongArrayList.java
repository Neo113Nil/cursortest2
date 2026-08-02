package com.google.crypto.tink.shaded.protobuf;

import java.util.RandomAccess;

/* loaded from: classes4.dex */
public abstract class LongArrayList extends AbstractProtobufList implements RandomAccess {
    public abstract void addLong(long j);

    public abstract void ensureCapacity(int i);

    public abstract long getLong(int i);
}
