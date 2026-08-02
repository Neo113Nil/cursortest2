package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import android.graphics.Bitmap;
import defpackage.bvf0;
import defpackage.c9x0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jse;
import defpackage.qhw0;
import defpackage.so7;
import defpackage.tje;
import defpackage.uh60;
import defpackage.uys0;
import defpackage.x670;

/* loaded from: classes5.dex */
public final class h implements so7 {
    public final /* synthetic */ j a;
    public final /* synthetic */ c9x0 b;
    public final /* synthetic */ x670 c;
    public final /* synthetic */ uys0 d;

    public h(j jVar, c9x0 c9x0Var, x670 x670Var, uys0 uys0Var) {
        this.a = jVar;
        this.b = c9x0Var;
        this.c = x670Var;
        this.d = uys0Var;
    }

    public final void a(Bitmap bitmap) {
        uys0 uys0Var = this.d;
        String str = uys0Var.d;
        j jVar = this.a;
        jVar.l = str;
        m mVar = jVar.h;
        jse jseVar = jVar.a.a;
        qhw0 qhw0Var = jVar.j;
        if (qhw0Var == null) {
            qhw0Var = jl40.a();
        }
        ike a = bvf0.a(jseVar.plus(qhw0Var));
        String str2 = uys0Var.c;
        String str3 = uys0Var.d;
        Object obj = uys0Var.e;
        Object obj2 = uys0Var.f;
        uh60 uh60Var = new uh60(11, jVar);
        mVar.getClass();
        tje.N(a, null, null, new UploadSmartCameraPhotoInteractor$uploadPhotoAsync$1(mVar, bitmap, str2, str3, obj, obj2, uh60Var, null), 3);
    }
}
