package io.appmetrica.analytics.impl;

import i1.AbstractC0251h;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398f5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final IExecutionPolicy[] f5963a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5964b;

    public C0398f5(IExecutionPolicy... iExecutionPolicyArr) {
        this.f5963a = iExecutionPolicyArr;
        this.f5964b = "Composite of {" + AbstractC0251h.R(iExecutionPolicyArr, ", ", "", "", -1, "...", C0372e5.f5864a) + '}';
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy;
        IExecutionPolicy[] iExecutionPolicyArr = this.f5963a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        int length = iExecutionPolicyArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                iExecutionPolicy = null;
                break;
            }
            iExecutionPolicy = iExecutionPolicyArr[i2];
            if (!iExecutionPolicy.canBeExecuted()) {
                break;
            }
            i2++;
        }
        return iExecutionPolicy == null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f5964b;
    }
}
