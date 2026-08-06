package io.appmetrica.analytics.impl;

import A1.C0015p;

/* renamed from: io.appmetrica.analytics.impl.me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0588me {

    /* renamed from: a, reason: collision with root package name */
    public final int f6512a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final int f6513b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f6514c = 1;

    public final int a(Boolean bool) {
        if (bool == null) {
            return this.f6512a;
        }
        if (bool.equals(Boolean.FALSE)) {
            return this.f6513b;
        }
        if (bool.equals(Boolean.TRUE)) {
            return this.f6514c;
        }
        throw new C0015p();
    }

    public final Boolean a(int i2) {
        if (i2 == this.f6513b) {
            return Boolean.FALSE;
        }
        if (i2 == this.f6514c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
