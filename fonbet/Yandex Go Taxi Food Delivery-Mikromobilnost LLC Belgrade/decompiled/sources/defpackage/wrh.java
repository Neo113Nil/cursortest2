package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import com.yandex.go.delivery.rental_duration_selector.requirement.c;
import com.yandex.go.places.models.domain.entities.PlacesMapOwner;
import com.yandex.go.places.organization.card.impl.data.repositories.a;
import com.yandex.go.places.organization.card.impl.ui.card.flex.actions.delete_review.b;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.storage.folders.d;
import com.yandex.messaging.internal.view.chat.f;
import java.util.Set;
import ru.yandex.taxi.delivery.interactors.e;
import ru.yandex.taxi.preorder.summary.solid.interactors.v;

/* loaded from: classes12.dex */
public final class wrh implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ wrh(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new b((a) xvf0Var3.get(), (tse) xvf0Var2.get(), (g8c0) xvf0Var.get());
            case 1:
                return new e((g580) xvf0Var3.get(), (cpi) xvf0Var2.get(), (omi) xvf0Var.get());
            case 2:
                return new ybi((Activity) xvf0Var3.get(), (uq1) xvf0Var2.get(), (fvt) xvf0Var.get());
            case 3:
                return new wwf((Context) xvf0Var3.get(), (rqo) xvf0Var2.get(), (ru.yandex.taxi.logistics.payment.a) xvf0Var.get());
            case 4:
                return new c((bzi0) xvf0Var.get(), (czi0) xvf0Var3.get(), (wiq0) xvf0Var2.get());
            case 5:
                return new jdj(2, (jio) xvf0Var3.get(), (ry) xvf0Var2.get(), (c65) xvf0Var.get());
            case 6:
                return new yhm((tt2) xvf0Var3.get(), (pav) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 7:
                return new jdj(8, (yay0) xvf0Var3.get(), (dgi0) xvf0Var2.get(), (o2y0) xvf0Var.get());
            case 8:
                txm txmVar = (txm) xvf0Var3.get();
                return new uxm((i130) xvf0Var.get(), (iqj0) xvf0Var2.get(), (i6r) txmVar.a.a.get());
            case 9:
                return new nmn((SharedPreferences) xvf0Var3.get(), (ChatRequest) xvf0Var2.get(), (Moshi) xvf0Var.get());
            case 10:
                return new rtn((Activity) xvf0Var3.get(), (SharedPreferences) xvf0Var2.get(), (com.yandex.messaging.internal.view.input.emojipanel.a) xvf0Var.get());
            case 11:
                return new mbo((j3h) xvf0Var.get(), (tfl0) xvf0Var3.get(), (np41) xvf0Var2.get());
            case 12:
                return new jio((PlacesMapOwner) xvf0Var3.get(), (hsj) xvf0Var2.get(), (wbc0) xvf0Var.get());
            case 13:
                return new v((wiq0) xvf0Var3.get(), (arv0) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 14:
                return new v4p((yzf) xvf0Var3.get(), (w4p) xvf0Var2.get(), (i130) xvf0Var.get());
            case 15:
                return new com.yandex.go.navigator.favorites.repository.a((com.yandex.go.navigator.favorites.repository.c) xvf0Var3.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 16:
                return new com.yandex.fintechsdk.features.bdui.internal.presentation.action.fintechremote.a((ype) xvf0Var3.get(), (lfh) xvf0Var2.get(), (tse) xvf0Var.get());
            case 17:
                return new cvr((o0l0) xvf0Var3.get(), (biv0) xvf0Var2.get(), (fgv0) xvf0Var.get());
            case 18:
                return new y3s((Set) xvf0Var3.get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.section_promo.b) xvf0Var2.get(), (ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a) xvf0Var.get());
            case 19:
                return new o5s((b6s) xvf0Var3.get(), (ru.yandex.logistics.sdk.cargo_form.core.impl.repository.b) xvf0Var2.get(), (w4s) xvf0Var.get());
            case 20:
                return new ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.b((b6s) xvf0Var3.get(), (i4s) xvf0Var2.get(), (o5s) xvf0Var.get());
            case 21:
                return new ru.yandex.logistics.sdk.cargo_form.core.impl.repository.e((b6s) xvf0Var3.get(), (i4s) xvf0Var2.get(), (ru.yandex.logistics.sdk.cargo_form.core.impl.repository.c) xvf0Var.get());
            case 22:
                return new com.yandex.messaging.internal.backendconfig.b((com.yandex.messaging.internal.backendconfig.a) xvf0Var3.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var2.get(), (kse) xvf0Var.get());
            case 23:
                d dVar = (d) xvf0Var3.get();
                return new o4t((kse) xvf0Var.get(), (w5t) xvf0Var2.get(), dVar);
            case 24:
                d dVar2 = (d) xvf0Var3.get();
                return new t7t((kse) xvf0Var.get(), (w5t) xvf0Var2.get(), dVar2);
            case 25:
                return new com.yandex.messaging.isolated.b((k020) xvf0Var3.get(), (sb7) xvf0Var2.get(), (kse) xvf0Var.get());
            case 26:
                return new t8t((kse) xvf0Var.get(), (w5t) xvf0Var3.get(), (d) xvf0Var2.get());
            case 27:
                return new com.yandex.messaging.domain.unreadcount.b((k020) xvf0Var3.get(), (sb7) xvf0Var2.get(), (kse) xvf0Var.get());
            case 28:
                return new f((kse) xvf0Var3.get(), (k020) xvf0Var2.get(), (j) xvf0Var.get());
            default:
                return new pet((lqo) xvf0Var3.get(), (p4t) xvf0Var2.get(), (com.yandex.messaging.internal.backendconfig.a) xvf0Var.get());
        }
    }
}
