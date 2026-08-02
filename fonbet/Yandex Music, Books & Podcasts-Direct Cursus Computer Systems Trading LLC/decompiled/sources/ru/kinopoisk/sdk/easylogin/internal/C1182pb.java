package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aqi;
import defpackage.uif;
import defpackage.vuf;
import defpackage.wn5;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.pb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1182pb extends uif implements Function1<vuf, Unit> {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ Function1<H3, Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182pb(ArrayList arrayList, aqi aqiVar, Function1 function1) {
        super(1);
        this.a = arrayList;
        this.b = aqiVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vuf vufVar = (vuf) obj;
        vufVar.getClass();
        ArrayList arrayList = this.a;
        aqi aqiVar = this.b;
        Function1<H3, Unit> function1 = this.c;
        vufVar.Z(arrayList.size(), null, new C1154nb(C1140mb.a, arrayList), new wn5(new C1168ob(arrayList, aqiVar, function1), -632812321, true));
        return Unit.a;
    }
}
