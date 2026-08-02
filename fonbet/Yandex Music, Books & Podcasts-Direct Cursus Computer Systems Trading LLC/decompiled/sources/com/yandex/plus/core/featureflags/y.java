package com.yandex.plus.core.featureflags;

import java.util.Set;

/* loaded from: classes4.dex */
public final class y implements t {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ y(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.plus.core.featureflags.t
    public final Object read() {
        switch (this.a) {
            case 0:
                return (Boolean) this.b;
            case 1:
                return (Float) this.b;
            case 2:
                return (Integer) this.b;
            case 3:
                return (String) this.b;
            default:
                return (Set) this.b;
        }
    }
}
