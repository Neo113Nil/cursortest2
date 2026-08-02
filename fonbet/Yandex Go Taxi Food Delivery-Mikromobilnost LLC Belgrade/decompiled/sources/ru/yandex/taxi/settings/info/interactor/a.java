package ru.yandex.taxi.settings.info.interactor;

import com.yandex.go.coroutines.b;
import defpackage.acz;
import defpackage.h3y;
import defpackage.qmp;
import defpackage.tpr;
import defpackage.wiu;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes6.dex */
public final class a {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final qmp d;

    public a(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, qmp qmpVar) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = qmpVar;
    }

    public final m0 a() {
        h3y h3yVar = this.a;
        tpr a = ((wiu) h3yVar.get()).a.a();
        Boolean bool = (Boolean) ((wiu) h3yVar.get()).a.b();
        bool.getClass();
        return new m0(e.t(b.d(a, new MenuInfoInteractor$state$$inlined$start$1(bool, null))), ((acz) this.c.get()).b, new MenuInfoInteractor$state$1(3, this, a.class, "toModel", "toModel(ZLandroid/location/Location;)Lru/yandex/taxi/settings/info/model/MenuInfoModel;", 4));
    }
}
