package com.yandex.plus.core.featureflags;

import java.util.Set;

/* loaded from: classes4.dex */
public final class j extends k implements g {
    public final /* synthetic */ int a = 0;
    public final t b;
    public final t c;
    public final t d;
    public final t e;
    public final Object f;

    public j(y yVar, o oVar, o oVar2, String str, int i) {
        yVar = (i & 1) != 0 ? null : yVar;
        oVar = (i & 4) != 0 ? null : oVar;
        oVar2 = (i & 8) != 0 ? null : oVar2;
        str = (i & 16) != 0 ? null : str;
        this.b = yVar;
        this.c = null;
        this.d = oVar;
        this.e = oVar2;
        this.f = str;
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
                return (String) this.f;
            default:
                return (Set) this.f;
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

    public j(y yVar, p pVar, p pVar2, Set set, int i) {
        yVar = (i & 1) != 0 ? null : yVar;
        pVar = (i & 4) != 0 ? null : pVar;
        pVar2 = (i & 8) != 0 ? null : pVar2;
        set = (i & 16) != 0 ? null : set;
        this.b = yVar;
        this.c = null;
        this.d = pVar;
        this.e = pVar2;
        this.f = set;
    }
}
