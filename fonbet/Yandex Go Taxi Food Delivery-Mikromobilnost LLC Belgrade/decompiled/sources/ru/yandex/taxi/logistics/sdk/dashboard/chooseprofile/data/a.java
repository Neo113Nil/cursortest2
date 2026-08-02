package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.data;

import defpackage.bsb;
import defpackage.h3y;
import defpackage.mw7;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes5.dex */
public final class a extends c {
    public final h3y i;

    public a(h3y h3yVar, bsb bsbVar, long j) {
        super(new mw7(1, bsbVar), j, 6);
        this.i = h3yVar;
    }

    public final Object b(Continuation continuation) {
        return a(new ChooseProfileDataSourceImpl$fetchDashboardContent$2(this, null), continuation);
    }
}
