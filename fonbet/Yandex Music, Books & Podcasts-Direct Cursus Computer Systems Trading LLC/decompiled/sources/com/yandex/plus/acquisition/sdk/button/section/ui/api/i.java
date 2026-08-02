package com.yandex.plus.acquisition.sdk.button.section.ui.api;

/* loaded from: classes4.dex */
public final class i {
    public final com.yandex.plus.acquisition.sdk.common.impl.di.b a;
    public final com.yandex.plus.acquisition.sdk.pay.impl.b b;
    public final com.yandex.plus.core.imageloader.b c;

    public i(com.yandex.plus.acquisition.sdk.common.impl.di.b bVar, com.yandex.plus.acquisition.sdk.pay.impl.b bVar2, com.yandex.plus.core.imageloader.b bVar3) {
        this.a = bVar;
        this.b = bVar2;
        this.c = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b) && this.c.equals(iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Dependencies(plusAcqCommon=" + this.a + ", plusAcqPay=" + this.b + ", imageLoader=" + this.c + ')';
    }
}
