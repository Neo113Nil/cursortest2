package com.yandex.plus.pay.ui.core.internal.di;

import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.internal.di.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {
    public final String a;
    public final com.yandex.plus.pay.log.impl.b b;
    public final com.yandex.plus.core.imageloader.b c;
    public final com.yandex.plus.pay.a d;
    public final com.yandex.plus.pay.internal.g e;
    public final r f;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a g;
    public final y h;
    public final com.yandex.plus.home.dailyquests.feature.api.c i;

    public d(String str, com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.core.imageloader.b bVar2, com.yandex.plus.pay.a aVar, com.yandex.plus.pay.internal.g gVar, r rVar, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar2, y yVar, com.yandex.plus.home.dailyquests.feature.api.c cVar) {
        bVar.getClass();
        bVar2.getClass();
        aVar.getClass();
        this.a = str;
        this.b = bVar;
        this.c = bVar2;
        this.d = aVar;
        this.e = gVar;
        this.f = rVar;
        this.g = aVar2;
        this.h = yVar;
        this.i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && Intrinsics.d(this.b, dVar.b) && Intrinsics.d(this.c, dVar.c) && Intrinsics.d(this.d, dVar.d) && this.e.equals(dVar.e) && this.f.equals(dVar.f) && this.g.equals(dVar.g) && this.h.equals(dVar.h) && Intrinsics.d(this.i, dVar.i);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31;
        com.yandex.plus.home.dailyquests.feature.api.c cVar = this.i;
        return (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
    }

    public final String toString() {
        return "ExternalModule(instanceId=" + this.a + ", logger=" + this.b + ", imageLoader=" + this.c + ", plusPay=" + this.d + ", plusPayInternal=" + this.e + ", internalDependencies=" + this.f + ", stringsProvider=" + this.g + ", userAvatarProvider=null, urlLauncher=" + this.h + ", tarifficatorFactory=" + this.i + ", transactionUIFactory=null)";
    }
}
