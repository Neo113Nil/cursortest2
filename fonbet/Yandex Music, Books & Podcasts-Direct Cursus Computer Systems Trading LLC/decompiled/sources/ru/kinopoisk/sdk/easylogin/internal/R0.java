package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.r0n;
import defpackage.uif;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

/* loaded from: classes5.dex */
public final class R0 extends uif implements Function1<List<? extends InterfaceC1305z0.a>, Unit> {
    public final /* synthetic */ P0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(P0 p0) {
        super(1);
        this.a = p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        List<InterfaceC1305z0.a> list = (List) obj;
        P0 p0 = this.a;
        list.getClass();
        p0.e = list;
        this.a.d.onDevicesFound(list);
        r0n r0nVar = this.a.f;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((InterfaceC1305z0.a) it.next()).e == InterfaceC1305z0.d.Connected) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        r0nVar.onNext(Boolean.valueOf(z));
        return Unit.a;
    }
}
