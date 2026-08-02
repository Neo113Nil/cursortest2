package com.google.common.base;

/* loaded from: classes4.dex */
public abstract class CharMatcher$NamedFastMatcher extends CharMatcher$FastMatcher {
    public final String description;

    public CharMatcher$NamedFastMatcher(String str) {
        this.description = str;
    }

    public final String toString() {
        return this.description;
    }
}
