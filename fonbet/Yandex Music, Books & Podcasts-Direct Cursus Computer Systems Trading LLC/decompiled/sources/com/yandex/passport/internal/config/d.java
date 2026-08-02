package com.yandex.passport.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.btf;
import defpackage.jyr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class d {
    public final Context a;
    public final jyr b;
    public final jyr c;
    public final jyr d;

    public d(Context context) {
        context.getClass();
        this.a = context;
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.config.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                d dVar = this.b;
                switch (i2) {
                    case 0:
                        Context context2 = dVar.a;
                        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                        return context2.getSharedPreferences("config_1", 0);
                    case 1:
                        Context context3 = dVar.a;
                        com.yandex.passport.common.core.a aVar2 = com.yandex.passport.common.core.b.b;
                        return context3.getSharedPreferences("config_3", 0);
                    default:
                        Context context4 = dVar.a;
                        com.yandex.passport.common.core.a aVar3 = com.yandex.passport.common.core.b.b;
                        return context4.getSharedPreferences("config_5", 0);
                }
            }
        });
        final int i2 = 1;
        this.c = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.config.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context2 = dVar.a;
                        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                        return context2.getSharedPreferences("config_1", 0);
                    case 1:
                        Context context3 = dVar.a;
                        com.yandex.passport.common.core.a aVar2 = com.yandex.passport.common.core.b.b;
                        return context3.getSharedPreferences("config_3", 0);
                    default:
                        Context context4 = dVar.a;
                        com.yandex.passport.common.core.a aVar3 = com.yandex.passport.common.core.b.b;
                        return context4.getSharedPreferences("config_5", 0);
                }
            }
        });
        final int i3 = 2;
        this.d = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.config.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        Context context2 = dVar.a;
                        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                        return context2.getSharedPreferences("config_1", 0);
                    case 1:
                        Context context3 = dVar.a;
                        com.yandex.passport.common.core.a aVar2 = com.yandex.passport.common.core.b.b;
                        return context3.getSharedPreferences("config_3", 0);
                    default:
                        Context context4 = dVar.a;
                        com.yandex.passport.common.core.a aVar3 = com.yandex.passport.common.core.b.b;
                        return context4.getSharedPreferences("config_5", 0);
                }
            }
        });
    }

    public final SharedPreferences a(com.yandex.passport.common.core.b bVar) {
        bVar.getClass();
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return (SharedPreferences) this.b.getValue();
        }
        if (ordinal == 2) {
            return (SharedPreferences) this.c.getValue();
        }
        if (ordinal != 4) {
            return null;
        }
        return (SharedPreferences) this.d.getValue();
    }
}
