package com.google.crypto.tink.shaded.protobuf;

import java.util.RandomAccess;

/* loaded from: classes4.dex */
public abstract class IntArrayList extends AbstractProtobufList implements RandomAccess {
    public abstract void addInt(int i);

    public abstract void ensureCapacity(int i);

    public abstract int getInt(int i);
}
