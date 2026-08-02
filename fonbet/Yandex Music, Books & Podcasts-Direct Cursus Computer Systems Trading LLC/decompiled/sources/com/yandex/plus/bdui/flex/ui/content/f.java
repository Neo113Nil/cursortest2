package com.yandex.plus.bdui.flex.ui.content;

import android.net.Uri;
import com.yandex.plus.bdui.x;
import com.yandex.plus.bdui.y;
import defpackage.tah;
import defpackage.uop;
import defpackage.xz0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ f(com.yandex.plus.bdui.scaffold.a aVar, Map map) {
        this.a = 6;
        this.b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CharSequence charSequence;
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                return new com.yandex.plus.core.reflect.c(map);
            case 1:
                return new com.yandex.plus.core.reflect.c(map);
            case 2:
                return new com.yandex.plus.core.reflect.c(map);
            case 3:
                Set keySet = map.keySet();
                keySet.getClass();
                return tah.b(new Pair(x.a, keySet));
            case 4:
                LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    char[] cArr = {'#'};
                    str.getClass();
                    int length = str.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            charSequence = "";
                        } else if (xz0.s(cArr, str.charAt(i2))) {
                            i2++;
                        } else {
                            charSequence = str.subSequence(i2, str.length());
                        }
                    }
                    linkedHashMap.put(charSequence.toString(), entry.getValue());
                }
                return linkedHashMap;
            case 5:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(map.size()));
                for (Map.Entry entry2 : map.entrySet()) {
                    Uri parse = Uri.parse((String) entry2.getKey());
                    parse.getClass();
                    String uri = parse.buildUpon().query(null).fragment(null).build().toString();
                    uri.getClass();
                    String u0 = StringsKt.u0(uri, '/');
                    u0.getClass();
                    linkedHashMap2.put(StringsKt.u0(u0, '/'), entry2.getValue());
                }
                return linkedHashMap2;
            default:
                Set b = uop.b("TopBottomScaffold");
                b.getClass();
                return com.yandex.plus.core.network.api.utils.a.y(tah.b(new Pair(y.a, b)), map);
        }
    }

    public /* synthetic */ f(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    public /* synthetic */ f(Map map, com.yandex.plus.bdui.plus.webview.validator.b bVar) {
        this.a = 5;
        this.b = map;
    }
}
