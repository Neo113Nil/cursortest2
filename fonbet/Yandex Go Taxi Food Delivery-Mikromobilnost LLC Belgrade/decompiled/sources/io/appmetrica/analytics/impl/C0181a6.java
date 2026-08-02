package io.appmetrica.analytics.impl;

import defpackage.b64;
import defpackage.j73;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0181a6 implements IExecutionPolicy {
    public final IExecutionPolicy[] a;
    public final String b;

    public C0181a6(IExecutionPolicy... iExecutionPolicyArr) {
        this.a = iExecutionPolicyArr;
        this.b = b64.p(new StringBuilder("Composite of {"), j73.L(iExecutionPolicyArr, Extension.FIX_SPACE, null, Z5.a, 30), '}');
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy;
        IExecutionPolicy[] iExecutionPolicyArr = this.a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        int length = iExecutionPolicyArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                iExecutionPolicy = null;
                break;
            }
            iExecutionPolicy = iExecutionPolicyArr[i];
            if (!iExecutionPolicy.canBeExecuted()) {
                break;
            }
            i++;
        }
        return iExecutionPolicy == null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.b;
    }
}
