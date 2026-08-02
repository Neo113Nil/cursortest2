package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aqi;
import defpackage.hq5;
import defpackage.oq5;
import defpackage.ryc;
import defpackage.uif;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.ob, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1168ob extends uif implements ryc {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ Function1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1168ob(ArrayList arrayList, aqi aqiVar, Function1 function1) {
        super(4);
        this.a = arrayList;
        this.b = aqiVar;
        this.c = function1;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        androidx.compose.foundation.lazy.a aVar = (androidx.compose.foundation.lazy.a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 14) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        if ((i & 731) == 146) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        H3 h3 = (H3) this.a.get(intValue);
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.a0(1881658963);
        Ib.a(h3, this.b, this.c, oq5Var2, 48);
        oq5Var2.p(false);
        return Unit.a;
    }
}
