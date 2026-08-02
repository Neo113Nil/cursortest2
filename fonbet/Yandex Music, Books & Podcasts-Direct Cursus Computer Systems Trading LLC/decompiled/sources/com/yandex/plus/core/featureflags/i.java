package com.yandex.plus.core.featureflags;

import defpackage.yhn;

/* loaded from: classes4.dex */
public final class i extends k implements g {
    public final /* synthetic */ int a = 0;
    public final t b;
    public final t c;
    public final t d;
    public final t e;
    public final r f;
    public final Number g;

    public i(y yVar, m mVar, m mVar2, Float f, r rVar, int i) {
        yVar = (i & 1) != 0 ? null : yVar;
        mVar = (i & 4) != 0 ? null : mVar;
        mVar2 = (i & 8) != 0 ? null : mVar2;
        f = (i & 16) != 0 ? null : f;
        rVar = (i & 32) != 0 ? null : rVar;
        this.b = yVar;
        this.c = null;
        this.d = mVar;
        this.e = mVar2;
        this.g = f;
        this.f = rVar;
    }

    @Override // com.yandex.plus.core.featureflags.k
    public final t a() {
        switch (this.a) {
        }
        return this.e;
    }

    @Override // com.yandex.plus.core.featureflags.k
    public final Object b() {
        switch (this.a) {
            case 0:
                return (Float) this.g;
            default:
                return (Integer) this.g;
        }
    }

    @Override // com.yandex.plus.core.featureflags.k
    public final t c() {
        switch (this.a) {
        }
        return this.d;
    }

    @Override // com.yandex.plus.core.featureflags.k
    public final t d() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // com.yandex.plus.core.featureflags.k
    public final t f() {
        switch (this.a) {
        }
        return this.c;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // com.yandex.plus.core.featureflags.k, com.yandex.plus.core.featureflags.g
    public final Object getValue() {
        Object e = e();
        switch (this.a) {
        }
        r rVar = this.f;
        if (e == null) {
            return null;
        }
        return rVar != null ? Integer.valueOf(yhn.d(((Number) e).intValue(), rVar.a, rVar.b)) : e;
    }

    public i(y yVar, n nVar, n nVar2, Integer num, r rVar, int i) {
        yVar = (i & 1) != 0 ? null : yVar;
        nVar = (i & 4) != 0 ? null : nVar;
        nVar2 = (i & 8) != 0 ? null : nVar2;
        num = (i & 16) != 0 ? null : num;
        rVar = (i & 32) != 0 ? null : rVar;
        this.b = yVar;
        this.c = null;
        this.d = nVar;
        this.e = nVar2;
        this.g = num;
        this.f = rVar;
    }
}
