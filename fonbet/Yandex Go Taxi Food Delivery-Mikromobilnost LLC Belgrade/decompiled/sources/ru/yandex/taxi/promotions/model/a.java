package ru.yandex.taxi.promotions.model;

import defpackage.cb8;
import defpackage.f9;
import defpackage.knt;
import defpackage.qoi0;
import defpackage.shs;
import defpackage.tg60;
import defpackage.zi20;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public final class a extends knt {
    public static final a f = new a();

    @Override // defpackage.h9
    public final List f() {
        Promotion.Type type = Promotion.Type.FULLSCREEN;
        f9 f9Var = new f9((String) h().invoke(type), shs.Companion.serializer(), qoi0.a(shs.class));
        Promotion.Type type2 = Promotion.Type.CARD;
        f9 f9Var2 = new f9((String) h().invoke(type2), cb8.Companion.serializer(), qoi0.a(cb8.class));
        Promotion.Type type3 = Promotion.Type.NOTIFICATION;
        f9 f9Var3 = new f9((String) h().invoke(type3), tg60.Companion.serializer(), qoi0.a(tg60.class));
        Promotion.Type type4 = Promotion.Type.STORY;
        f9 f9Var4 = new f9((String) h().invoke(type4), Story.Companion.serializer(), qoi0.a(Story.class));
        Promotion.Type type5 = Promotion.Type.TICKET;
        f9 f9Var5 = new f9((String) h().invoke(type5), ru.yandex.taxi.communications.api.dto.ticket.a.Companion.serializer(), qoi0.a(ru.yandex.taxi.communications.api.dto.ticket.a.class));
        Promotion.Type type6 = Promotion.Type.MISSED_SEEN;
        return Arrays.asList(f9Var, f9Var2, f9Var3, f9Var4, f9Var5, new f9((String) h().invoke(type6), zi20.Companion.serializer(), qoi0.a(zi20.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return Promotion.Type.Companion.serializer();
    }
}
