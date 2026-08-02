package com.google.crypto.tink.shaded.protobuf;

import java.util.RandomAccess;

/* loaded from: classes4.dex */
public abstract class FloatArrayList extends AbstractProtobufList implements RandomAccess {
    public abstract void addFloat(float f);

    public abstract void ensureCapacity(int i);

    public abstract float getFloat(int i);
}
