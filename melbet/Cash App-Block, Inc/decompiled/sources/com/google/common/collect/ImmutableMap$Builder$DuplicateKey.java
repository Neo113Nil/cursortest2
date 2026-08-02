package com.google.common.collect;

/* loaded from: classes4.dex */
public final class ImmutableMap$Builder$DuplicateKey {
    public final Object key;
    public final Object value1;
    public final Object value2;

    public ImmutableMap$Builder$DuplicateKey(Object obj, Object obj2, Object obj3) {
        this.key = obj;
        this.value1 = obj2;
        this.value2 = obj3;
    }

    public final IllegalArgumentException exception() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.key;
        sb.append(obj);
        sb.append("=");
        sb.append(this.value1);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.value2);
        return new IllegalArgumentException(sb.toString());
    }
}
