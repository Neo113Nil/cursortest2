package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.content.Context;
import defpackage.an00;
import defpackage.kjz;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uqx;
import defpackage.wa60;
import defpackage.zm00;
import defpackage.zuj0;

/* loaded from: classes9.dex */
public final class x implements zm00 {
    public static final wa60 g = new wa60(0.5f, 0.5f, 0.13f, 0.81f);
    public static final wa60 h = new wa60(0.4f, 0.6f, 0.4f, 0.6f);
    public static final wa60 i = new wa60(0.17f, 0.83f, 0.36f, 0.9f);
    public static final wa60 j = new wa60(0.11f, 0.89f, 0.36f, 0.47f);
    public static final wa60 k = new wa60(0.43f, 0.85f, 0.13f, 0.78f);
    public static final wa60 l = new wa60(0.49f, 0.55f, 0.48f, 0.55f);
    public final Context a;
    public final tt2 b;
    public final ru.yandex.taxi.map_common.map.utils.a c;
    public final zuj0 d;
    public final kjz e;
    public final uqx f;

    public x(Context context, tt2 tt2Var, ru.yandex.taxi.map_common.map.utils.a aVar, zuj0 zuj0Var, kjz kjzVar, uqx uqxVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = aVar;
        this.d = zuj0Var;
        this.e = kjzVar;
        this.f = uqxVar;
    }

    @Override // defpackage.zm00
    public final tpr a(an00 an00Var) {
        return new rol0(new LabelComponentFactory$createComponents$1(this, an00Var, null));
    }
}
