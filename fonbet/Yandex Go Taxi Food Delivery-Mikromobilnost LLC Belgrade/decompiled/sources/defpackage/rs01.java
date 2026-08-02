package defpackage;

import android.content.Context;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.feature.autotopup.internal.domain.a;
import com.ybsdk.feature.transfer.api.TransferResultScreenParams;
import com.ybsdk.feature.transfer.internal.screens.result.presentation.b;

/* loaded from: classes3.dex */
public final class rs01 implements ps01 {
    public final m a;

    public rs01(m mVar) {
        this.a = mVar;
    }

    public final b a(TransferResultScreenParams transferResultScreenParams) {
        m mVar = this.a;
        return new b((Context) ((hag) mVar.a).get(), (us01) ((y501) mVar.b).get(), transferResultScreenParams, (it01) ((n3w) mVar.c).a, (a201) ((flx0) mVar.d).get(), (fyp0) ((hag) mVar.e).get(), (wpy0) ((hag) mVar.f).get(), (ji01) ((hag) mVar.g).get(), (a) ((hag) mVar.h).get(), (tfl0) ((hag) mVar.i).get(), (eg01) ((hag) mVar.j).get());
    }
}
