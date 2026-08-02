package com.google.crypto.tink.shaded.protobuf;

import java.util.RandomAccess;

/* loaded from: classes4.dex */
public abstract class DoubleArrayList extends AbstractProtobufList implements RandomAccess {
    public abstract void addDouble(double d);

    public abstract void ensureCapacity(int i);

    public abstract double getDouble(int i);
}
