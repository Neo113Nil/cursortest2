package com.yandex.plus.metrica;

import android.content.Context;
import com.yandex.plus.bdui.content.b;
import com.yandex.plus.metrica.utils.l;
import com.yandex.plus.metrica.utils.z;
import defpackage.btf;
import defpackage.hgh;
import defpackage.jyr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a {
    public final Context a;
    public final jyr b;
    public final jyr c;

    public a(Context context, l lVar, String str, String str2, String str3, String str4, com.yandex.plus.core.config.a aVar, Function0 function0, Function0 function02) {
        context.getClass();
        lVar.getClass();
        aVar.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = btf.b(new b(28, lVar, this));
        this.c = btf.b(new hgh(this, lVar, str, str2, str3, str4, aVar, function0, function02));
    }

    public final z a() {
        return (z) this.c.getValue();
    }
}
