package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import defpackage.z75;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

/* loaded from: classes5.dex */
public final class Q0 extends uif implements Function1<Object[], List<? extends InterfaceC1305z0.a>> {
    public static final Q0 a = new Q0();

    public Q0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : objArr) {
            obj2.getClass();
            z75.t(arrayList, (List) obj2);
        }
        return arrayList;
    }
}
