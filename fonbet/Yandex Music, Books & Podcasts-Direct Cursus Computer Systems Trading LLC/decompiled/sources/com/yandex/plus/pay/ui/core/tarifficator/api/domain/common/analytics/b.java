package com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics;

import com.yandex.plus.core.data.pay.k;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.adk;
import defpackage.b6e;
import defpackage.pxm;
import defpackage.zck;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes5.dex */
public abstract class b {
    public static final zck a(PlusPayCompositeOffers.Offer offer) {
        offer.getClass();
        int i = a.a[com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.b(offer).ordinal()];
        if (i == 1) {
            return zck.InApp;
        }
        if (i == 2) {
            return zck.Native;
        }
        if (i == 3) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static final pxm b(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.d dVar, com.yandex.plus.pay.api.analytics.d dVar2) {
        dVar.getClass();
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            return dVar2 != null ? new e(dVar2.a, dVar2.b) : new e(null, null);
        }
        if (ordinal == 1) {
            return f.c;
        }
        if (ordinal == 2) {
            return c.c;
        }
        if (ordinal == 3) {
            return d.c;
        }
        if (ordinal == 4) {
            return g.c;
        }
        b6e.s();
        return null;
    }

    public static final String c(com.yandex.plus.pay.ui.api.feature.payment.g gVar) {
        if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.d) {
            k kVar = ((com.yandex.plus.pay.ui.api.feature.payment.d) gVar).a;
            return "card_selection_error: kind: " + kVar.d + ", trigger: " + kVar.e + ", code: " + kVar.b + ", status: " + kVar.c + ", message: " + kVar.a;
        }
        if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.b) {
            return "connection_error";
        }
        if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.a) {
            String lowerCase = ((com.yandex.plus.pay.ui.api.feature.payment.a) gVar).a.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return "backend_error: ".concat(lowerCase);
        }
        if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.c) {
            String lowerCase2 = ((com.yandex.plus.pay.ui.api.feature.payment.c) gVar).a.name().toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            return "google_error: ".concat(lowerCase2);
        }
        if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.f) {
            return "unexpected_error";
        }
        if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.e) {
            return "unauthorized";
        }
        b6e.s();
        return null;
    }

    public static final String d(UUID uuid) {
        uuid.getClass();
        String uuid2 = uuid.toString();
        uuid2.getClass();
        String upperCase = uuid2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public static final adk e(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.d dVar) {
        dVar.getClass();
        return a.b[dVar.ordinal()] == 1 ? adk.External : adk.Internal;
    }
}
