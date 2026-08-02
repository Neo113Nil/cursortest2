package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.qy0;
import defpackage.tkr;
import defpackage.udb;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class w4 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ w4(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new udb("HalfHeight", x4.INSTANCE, new Annotation[0]);
            case 1:
                return i.Companion.serializer();
            case 2:
                return new qy0(tkr.a, 0);
            case 3:
                return i.Companion.serializer();
            case 4:
                return new qy0(tkr.a, 0);
            case 5:
                h5[] values = h5.values();
                values.getClass();
                return new udb("com.yandex.plus.home.plaque.repository.graphql.cache.dto.WidgetDto.Group.Line.Orientation", values);
            case 6:
                return i.Companion.serializer();
            case 7:
                return new qy0(k1.Companion.serializer(), 0);
            case 8:
                return new qy0(k1.Companion.serializer(), 0);
            case 9:
                return new qy0(k1.Companion.serializer(), 0);
            case 10:
                return new qy0(tkr.a, 0);
            case 11:
                return i.Companion.serializer();
            case 12:
                return new qy0(k1.Companion.serializer(), 0);
            case 13:
                return new qy0(tkr.a, 0);
            case 14:
                return i.Companion.serializer();
            case 15:
                return i.Companion.serializer();
            case 16:
                return i.Companion.serializer();
            case 17:
                return new qy0(k1.Companion.serializer(), 0);
            case 18:
                return new qy0(tkr.a, 0);
            case 19:
                return i.Companion.serializer();
            case 20:
                return new qy0(k1.Companion.serializer(), 0);
            case 21:
                return new qy0(tkr.a, 0);
            case 22:
                return new com.yandex.plus.home.plaque.repository.graphql.formatter.d(com.yandex.plus.core.strings.a.a);
            case 23:
                return new com.yandex.plus.home.plaque.repository.graphql.formatter.c();
            case 24:
                return new com.yandex.plus.home.plaque.repository.graphql.formatter.b();
            case 25:
                return new com.yandex.plus.core.theme.d(R.style.PlaqueSdk_Component_Light, R.style.PlaqueSdk_Component_Dark);
            case 26:
                return com.yandex.plus.core.data.common.v.Companion.serializer(com.yandex.plus.core.data.common.k.Companion.serializer());
            case 27:
                return com.yandex.plus.core.data.common.v.Companion.serializer(com.yandex.plus.core.data.common.k.Companion.serializer());
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return com.yandex.plus.core.data.common.v.Companion.serializer(com.yandex.plus.core.data.common.k.Companion.serializer());
            default:
                return new qy0(tkr.a, 0);
        }
    }
}
