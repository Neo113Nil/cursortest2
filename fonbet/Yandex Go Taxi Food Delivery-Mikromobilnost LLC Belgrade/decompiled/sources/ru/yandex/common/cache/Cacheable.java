package ru.yandex.common.cache;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* loaded from: classes4.dex */
public interface Cacheable {

    public static abstract class Reader<T> {
        public abstract T readExternal(ObjectInput objectInput) throws IOException;
    }

    void writeExternal(ObjectOutput objectOutput) throws IOException;
}
