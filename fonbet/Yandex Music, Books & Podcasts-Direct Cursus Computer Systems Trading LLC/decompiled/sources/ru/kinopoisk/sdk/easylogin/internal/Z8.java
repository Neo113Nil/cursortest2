package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Z8 extends uif implements Function1<String, C1258v5> {
    public final /* synthetic */ Y8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z8(Y8 y8) {
        super(1);
        this.a = y8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        String str = (String) obj;
        Iterator<T> it = this.a.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.d(((C1258v5) obj2).a.getLanguage(), str)) {
                break;
            }
        }
        return (C1258v5) obj2;
    }
}
