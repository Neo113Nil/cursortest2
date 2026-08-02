package ru.yandex.taxi.web.calljsinterface;

import defpackage.di7;
import defpackage.v4a;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class CommonCallApiJsPlugin$apply$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) this.receiver;
        aVar.a.post(new v4a(15, aVar));
        return new di7("{}", null);
    }
}
