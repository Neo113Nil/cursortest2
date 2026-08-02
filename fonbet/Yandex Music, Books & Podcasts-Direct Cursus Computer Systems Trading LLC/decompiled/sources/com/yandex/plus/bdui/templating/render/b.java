package com.yandex.plus.bdui.templating.render;

import defpackage.b6e;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ b(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String obj2;
        switch (this.a) {
            case 0:
                g gVar = (g) obj;
                gVar.getClass();
                return gVar.a(this.b);
            case 1:
                com.yandex.plus.core.templating.template.d dVar = (com.yandex.plus.core.templating.template.d) obj;
                dVar.getClass();
                if (dVar instanceof com.yandex.plus.core.templating.template.b) {
                    return ((com.yandex.plus.core.templating.template.b) dVar).a;
                }
                if (!(dVar instanceof com.yandex.plus.core.templating.template.c)) {
                    b6e.s();
                    return null;
                }
                String str = ((com.yandex.plus.core.templating.template.c) dVar).a;
                Object obj3 = this.b.get(str);
                if (obj3 == null || (obj2 = obj3.toString()) == null) {
                    throw new com.yandex.plus.core.templating.data.a(str);
                }
                return obj2;
            default:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                String str2 = (String) this.b.get(matchResult.getValue());
                return str2 != null ? str2 : matchResult.getValue();
        }
    }
}
