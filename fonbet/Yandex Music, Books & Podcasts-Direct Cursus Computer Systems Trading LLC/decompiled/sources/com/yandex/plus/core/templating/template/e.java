package com.yandex.plus.core.templating.template;

import defpackage.t75;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class e implements g {
    public final Class a;
    public final boolean b;
    public final Function1 c;
    public final String d;

    public e(Class cls, boolean z, Function1 function1, String str) {
        this.a = cls;
        this.b = z;
        this.c = function1;
        this.d = str;
    }

    @Override // com.yandex.plus.core.templating.template.g
    public final Object a(Map map) {
        Object obj;
        map.getClass();
        String str = this.d;
        Object obj2 = map.get(str);
        if (obj2 == null) {
            if (this.b) {
                return null;
            }
            throw new com.yandex.plus.core.templating.data.a(str);
        }
        Class<?> cls = obj2.getClass();
        Function1 function1 = this.c;
        Class cls2 = this.a;
        if (function1 == null || (obj = function1.invoke(obj2)) == null) {
            obj = cls2.isAssignableFrom(cls) ? obj2 : null;
        }
        if (obj != null) {
            return obj;
        }
        if (function1 == null) {
            throw new com.yandex.plus.core.templating.data.a("Value type " + com.yandex.plus.core.reflect.b.b(cls2) + " is incompatible with data type " + com.yandex.plus.core.reflect.b.b(cls) + '!', null);
        }
        throw new com.yandex.plus.core.templating.data.a("Data \"" + obj2 + "\" of type " + com.yandex.plus.core.reflect.b.b(cls) + " can not be converted to value type " + com.yandex.plus.core.reflect.b.b(cls2) + '!', null);
    }

    @Override // com.yandex.plus.core.templating.template.g
    public final List b() {
        return t75.c(new c(this.d));
    }

    @Override // com.yandex.plus.core.templating.template.g
    public final Class c() {
        return this.a;
    }
}
