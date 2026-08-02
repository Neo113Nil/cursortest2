package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.nb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1154nb extends uif implements Function1<Integer, Object> {
    public final /* synthetic */ C1140mb a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154nb(C1140mb c1140mb, ArrayList arrayList) {
        super(1);
        this.a = c1140mb;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C1140mb c1140mb = this.a;
        this.b.get(intValue);
        c1140mb.getClass();
        return null;
    }
}
