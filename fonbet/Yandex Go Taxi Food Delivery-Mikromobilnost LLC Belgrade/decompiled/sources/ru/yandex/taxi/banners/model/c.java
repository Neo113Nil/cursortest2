package ru.yandex.taxi.banners.model;

import defpackage.cb8;
import defpackage.shs;
import defpackage.tg60;
import defpackage.xby;
import defpackage.zi20;
import kotlin.jvm.internal.PropertyReference0Impl;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public abstract class c {
    public static int a(final Promotion promotion) {
        if (promotion instanceof shs) {
            return 0;
        }
        if (promotion instanceof ru.yandex.taxi.communications.api.dto.ticket.a) {
            return 1;
        }
        if (promotion instanceof cb8) {
            return 2;
        }
        if (promotion instanceof Story) {
            return 3;
        }
        if (promotion instanceof zi20) {
            return 4;
        }
        if (promotion instanceof tg60) {
            return Integer.MAX_VALUE;
        }
        xby.d.c("unknown class " + new PropertyReference0Impl(promotion) { // from class: ru.yandex.taxi.banners.model.BannerPriorityUtils$getInternalPriorityByType$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
            public final Object get() {
                return this.receiver.getClass();
            }
        });
        return Integer.MAX_VALUE;
    }
}
