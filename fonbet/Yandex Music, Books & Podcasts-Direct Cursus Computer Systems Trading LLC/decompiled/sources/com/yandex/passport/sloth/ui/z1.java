package com.yandex.passport.sloth.ui;

import defpackage.aqi;
import defpackage.d1w;
import defpackage.h1w;
import defpackage.jfp;
import defpackage.wfp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;

    public /* synthetic */ z1(aqi aqiVar, int i) {
        this.a = i;
        this.b = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.b.setValue(bool);
                break;
            default:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                if (!(((h1w) this.b.getValue()) instanceof d1w)) {
                    wfp.g(jfpVar);
                }
                break;
        }
        return Unit.a;
    }
}
