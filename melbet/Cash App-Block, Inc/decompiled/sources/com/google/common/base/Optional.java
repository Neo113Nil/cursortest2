package com.google.common.base;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class Optional implements Serializable {
    public abstract Object get();

    public abstract boolean isPresent();

    public abstract Object orNull();
}
