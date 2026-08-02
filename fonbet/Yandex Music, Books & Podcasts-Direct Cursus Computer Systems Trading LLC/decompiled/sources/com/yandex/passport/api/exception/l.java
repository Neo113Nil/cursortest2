package com.yandex.passport.api.exception;

import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.network.d5;
import com.yandex.passport.data.network.e3;
import com.yandex.passport.data.network.h2;
import com.yandex.passport.data.network.q3;
import com.yandex.passport.data.network.t2;
import com.yandex.passport.data.network.w2;
import defpackage.cqe;
import defpackage.qy0;
import defpackage.szf;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.wsd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        t9f _init_$_anonymous_;
        switch (this.a) {
            case 0:
                return new qy0(tkr.a, 0);
            case 1:
                _init_$_anonymous_ = BackendError._init_$_anonymous_();
                return _init_$_anonymous_;
            case 2:
                return new qy0(BackendError.Companion.serializer(), 0);
            case 3:
                return BackendError.Companion.serializer();
            case 4:
                return new qy0(BackendError.Companion.serializer(), 0);
            case 5:
                return BackendError.Companion.serializer();
            case 6:
                return new qy0(tkr.a, 0);
            case 7:
                throw new IllegalStateException("No DarkMode provided");
            case 8:
                throw new IllegalStateException("No isWhiteLabel provided");
            case 9:
                return szf.g0(Boolean.FALSE);
            case 10:
                return Unit.a;
            case 11:
                return new qy0(tkr.a, 0);
            case 12:
                tkr tkrVar = tkr.a;
                return new wsd(tkrVar, new qy0(tkrVar, 2), 1);
            case 13:
                return new qy0(BackendError.Companion.serializer(), 0);
            case 14:
                return new com.yandex.passport.data.network.a();
            case 15:
                return new qy0(cqe.a, 0);
            case 16:
                return new qy0(tkr.a, 0);
            case 17:
                return new qy0(tkr.a, 0);
            case 18:
                return new qy0(h2.a, 0);
            case 19:
                return new qy0(tkr.a, 0);
            case 20:
                tkr tkrVar2 = tkr.a;
                return new wsd(tkrVar2, tkrVar2, 0);
            case 21:
                return new wsd(tkr.a, e3.a, 0);
            case 22:
                return new qy0(w2.a, 0);
            case 23:
                return new qy0(t2.a, 0);
            case 24:
                return com.yandex.passport.common.url.b.Companion.serializer();
            case 25:
                return new qy0(q3.a, 0);
            case 26:
                return com.yandex.passport.common.url.b.Companion.serializer();
            case 27:
                return new qy0(tkr.a, 0);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new qy0(d5.a, 0);
            default:
                return new qy0(tkr.a, 0);
        }
    }
}
