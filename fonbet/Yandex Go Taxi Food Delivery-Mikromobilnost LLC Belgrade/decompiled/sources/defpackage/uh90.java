package defpackage;

import com.ybsdk.di.modules.features.j;
import com.ybsdk.di.modules.features.k;
import com.ybsdk.feature.partnerpayments.api.PartnerSaveScreenParams;
import com.ybsdk.feature.partnerpayments.internal.screens.save.presentation.a;

/* loaded from: classes3.dex */
public final class uh90 implements th90 {
    public final w040 a;

    public uh90(w040 w040Var) {
        this.a = w040Var;
    }

    public final a a(PartnerSaveScreenParams partnerSaveScreenParams) {
        w040 w040Var = this.a;
        return new a((com.ybsdk.feature.partnerpayments.internal.domain.a) ((g680) w040Var.b).get(), (j) ((j3g) w040Var.c).get(), (qh90) ((xvf0) w040Var.a).get(), partnerSaveScreenParams, (j3h) ((j3g) w040Var.d).get(), (ai90) ((j3g) w040Var.e).get(), (k) ((j3g) w040Var.f).get(), (tfl0) ((j3g) w040Var.g).get(), (f42) ((f380) w040Var.h).get());
    }
}
