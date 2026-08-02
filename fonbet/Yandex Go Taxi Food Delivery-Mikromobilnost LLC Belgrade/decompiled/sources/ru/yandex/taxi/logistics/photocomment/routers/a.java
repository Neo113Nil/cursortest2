package ru.yandex.taxi.logistics.photocomment.routers;

import android.content.Context;
import defpackage.m230;
import defpackage.u45;
import defpackage.w030;
import ru.yandex.taxi.logistics.photocomment.max_photos_dialog.MaxPhotocommentsDialogView;

/* loaded from: classes5.dex */
public final class a extends m230 {
    public final w030 E;
    public final Context F;
    public final boolean G;

    public a(w030 w030Var, Context context) {
        super(null);
        this.E = w030Var;
        this.F = context;
        this.G = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.G;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        return new MaxPhotocommentsDialogView(this.F, new DeliveryMaxPhotosRouter$provideModalView$1(0, this, a.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0));
    }
}
