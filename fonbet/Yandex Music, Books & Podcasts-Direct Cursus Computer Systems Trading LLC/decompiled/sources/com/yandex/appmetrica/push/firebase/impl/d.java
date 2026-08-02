package com.yandex.appmetrica.push.firebase.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.aec;
import defpackage.nec;

/* loaded from: classes3.dex */
public class d extends a {
    public d(@NonNull Context context) {
        this(context, new c(context));
    }

    @Override // com.yandex.appmetrica.push.firebase.impl.a
    @NonNull
    public aec a(@NonNull nec necVar) {
        try {
            return aec.h(necVar, a(), "METRICA_PUSH");
        } catch (Throwable unused) {
            return aec.e("METRICA_PUSH");
        }
    }

    public d(@NonNull Context context, @NonNull i iVar) {
        super(context, iVar);
    }
}
