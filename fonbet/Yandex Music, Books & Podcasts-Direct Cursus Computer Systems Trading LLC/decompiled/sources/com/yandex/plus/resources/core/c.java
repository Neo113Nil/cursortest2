package com.yandex.plus.resources.core;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import defpackage.btf;
import defpackage.jyr;
import java.util.Map;

/* loaded from: classes5.dex */
public final class c implements a {
    public final com.yandex.plus.core.strings.a a;
    public final Resources b;
    public final jyr c;

    public c(Context context, com.yandex.plus.core.strings.a aVar) {
        context.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = context.getApplicationContext().getResources();
        this.c = btf.b(b.a);
    }

    public final int a(int i) {
        String resourceEntryName = this.b.getResourceEntryName(i);
        resourceEntryName.getClass();
        boolean v = kotlin.text.c.v(resourceEntryName, "international.", false);
        com.yandex.plus.core.strings.a aVar = com.yandex.plus.core.strings.a.a;
        com.yandex.plus.core.strings.a aVar2 = this.a;
        return (aVar2 == aVar && v) ? b(i, resourceEntryName.substring(14)) : (aVar2 != com.yandex.plus.core.strings.a.b || v) ? i : b(i, "international.".concat(resourceEntryName));
    }

    public final int b(int i, String str) {
        Resources resources = this.b;
        String resourcePackageName = resources.getResourcePackageName(i);
        String resourceTypeName = resources.getResourceTypeName(i);
        resourcePackageName.getClass();
        resourceTypeName.getClass();
        String str2 = resourcePackageName + ':' + resourceTypeName + '/' + str;
        Map map = (Map) this.c.getValue();
        Object obj = map.get(str2);
        if (obj == null) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(str2, typedValue, true);
            obj = Integer.valueOf(typedValue.resourceId);
            map.put(str2, obj);
        }
        return ((Number) obj).intValue();
    }
}
