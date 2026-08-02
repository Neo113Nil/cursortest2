package com.yandex.plus.bdui.plus.content.serializer;

import com.connectsdk.service.airplay.PListParser;
import com.yandex.plus.bdui.plus.checkout.content.serializer.y5;
import defpackage.btf;
import defpackage.jyr;
import defpackage.uah;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class q {
    public final com.yandex.plus.core.templating.parser.b a;
    public final com.yandex.plus.log.api.b b;
    public final Object c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;

    public q(com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.log.api.b bVar) {
        fVar.getClass();
        bVar.getClass();
        this.a = fVar;
        this.b = bVar;
        this.c = uah.e(new Pair("boolean", new com.yandex.plus.bdui.q(2, this, q.class, "getBoolean", "getBoolean(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/yandex/plus/bdui/plus/content/PlusDivContent$LayoutParam$Boolean;", 0, 4)), new Pair(PListParser.TAG_INTEGER, new com.yandex.plus.bdui.q(2, this, q.class, "getLong", "getLong(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/yandex/plus/bdui/plus/content/PlusDivContent$LayoutParam$Long;", 0, 5)), new Pair("number", new com.yandex.plus.bdui.q(2, this, q.class, "getDouble", "getDouble(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/yandex/plus/bdui/plus/content/PlusDivContent$LayoutParam$Double;", 0, 6)), new Pair(PListParser.TAG_STRING, new com.yandex.plus.bdui.q(2, this, q.class, "getString", "getString(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/yandex/plus/bdui/plus/content/PlusDivContent$LayoutParam$String;", 0, 7)), new Pair(PListParser.TAG_ARRAY, new com.yandex.plus.bdui.q(2, this, q.class, "getArray", "getArray(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/yandex/plus/bdui/plus/content/PlusDivContent$LayoutParam$Array;", 0, 8)), new Pair(PListParser.TAG_DICT, new com.yandex.plus.bdui.q(2, this, q.class, "getDict", "getDict(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/yandex/plus/bdui/plus/content/PlusDivContent$LayoutParam$Dict;", 0, 9)), new Pair("color", new com.yandex.plus.bdui.q(2, this, q.class, "getColor", "getColor(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/yandex/plus/bdui/plus/content/PlusDivContent$LayoutParam$Color;", 0, 10)), new Pair("url", new com.yandex.plus.bdui.q(2, this, q.class, "getUrl", "getUrl(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/yandex/plus/bdui/plus/content/PlusDivContent$LayoutParam$Uri;", 0, 11)));
        final int i = 0;
        this.d = btf.b(new Function0(this) { // from class: com.yandex.plus.bdui.plus.content.serializer.a
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new com.yandex.plus.core.templating.render.n(this.b.a);
                    default:
                        return new com.yandex.plus.core.templating.render.b0(this.b.a);
                }
            }
        });
        this.e = btf.b(new y5(28));
        this.f = btf.b(new y5(29));
        final int i2 = 1;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.plus.bdui.plus.content.serializer.a
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new com.yandex.plus.core.templating.render.n(this.b.a);
                    default:
                        return new com.yandex.plus.core.templating.render.b0(this.b.a);
                }
            }
        });
        this.h = btf.b(new b(0));
    }
}
