package com.yandex.plus.core.graphql.daily.progress;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.yandex.plus.bdui.flex.document.FlexSlice;
import com.yandex.plus.home.datasource.openapi.models.v7;
import defpackage.bz9;
import defpackage.cqe;
import defpackage.ern;
import defpackage.f9f;
import defpackage.mvg;
import defpackage.qy0;
import defpackage.t75;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tyo;
import defpackage.u75;
import defpackage.udb;
import defpackage.up6;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new qy0(o.a, 0);
            case 1:
                return new qy0(o.a, 0);
            case 2:
                return g0.Companion.serializer();
            case 3:
                return up6.q("com.yandex.plus.core.graphql.daily.progress.ProgressReplacer.Type", g0.values(), new String[]{"TextIconProperties", "StyledTextProperties"}, new Annotation[][]{null, null});
            case 4:
                return new tyo("com.yandex.plus.core.graphql.gradient.GradientResponse", ern.a(com.yandex.plus.core.graphql.gradient.k.class), new f9f[]{ern.a(com.yandex.plus.core.graphql.gradient.g.class), ern.a(com.yandex.plus.core.graphql.gradient.j.class)}, new t9f[]{com.yandex.plus.core.graphql.gradient.e.a, com.yandex.plus.core.graphql.gradient.h.a}, new Annotation[0]);
            case 5:
                return new qy0(com.yandex.plus.core.graphql.gradient.a.a, 0);
            case 6:
                return new qy0(com.yandex.plus.core.graphql.gradient.a.a, 0);
            case 7:
                return "Android";
            case 8:
                return new LinkedHashMap();
            case 9:
                return com.yandex.plus.core.reflect.b.b(FlexSlice.class);
            case 10:
                ClassLoader classLoader = FlexSlice.class.getClassLoader();
                classLoader.getClass();
                return classLoader;
            case 11:
                return null;
            case 12:
                return com.yandex.plus.core.templating.render.v.a;
            case 13:
                return new com.yandex.plus.divkit.utils.a(new com.yandex.plus.core.version.d(new com.yandex.plus.core.version.c(), new com.yandex.plus.core.version.b()), u75.h("com.yandex.div.video.ExoDivPlayerFactory", "com.yandex.div.video.m3.ExoDivPlayerFactory"), t75.c("com.yandex.div.lottie.DivLottieExtensionHandler"));
            case 14:
                return new bz9();
            case 15:
                return new qy0(mvg.a, 0);
            case 16:
                return new qy0(tkr.a, 2);
            case 17:
                return new com.yandex.plus.experiments.impl.mappers.a();
            case 18:
                return null;
            case 19:
                int i = com.yandex.plus.home.animation.d.r;
                Paint paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                return paint;
            case 20:
                return new ConcurrentHashMap();
            case 21:
                return new com.yandex.plus.home.common.utils.m();
            case 22:
                return com.yandex.plus.home.dailyquests.repository.rest.prefs.k.Companion.serializer();
            case 23:
                return new qy0(cqe.a, 0);
            case 24:
                return new qy0(cqe.a, 0);
            case 25:
                com.yandex.plus.home.datasource.openapi.models.w[] values = com.yandex.plus.home.datasource.openapi.models.w.values();
                values.getClass();
                return new udb("com.yandex.plus.home.datasource.openapi.models.NetworkBalanceModel.Currency", values);
            case 26:
                return new qy0(tkr.a, 0);
            case 27:
                return new qy0(tkr.a, 0);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new qy0(v7.Companion.serializer(), 0);
            default:
                return new qy0(tkr.a, 0);
        }
    }

    public /* synthetic */ s(int i, Object obj) {
        this.a = i;
    }
}
