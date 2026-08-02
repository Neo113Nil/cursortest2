package com.yandex.appmetrica.push.firebase.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.aec;
import defpackage.nec;

/* loaded from: classes3.dex */
public class g extends a {
    public g(@NonNull Context context) {
        this(context, new e(context));
    }

    @Override // com.yandex.appmetrica.push.firebase.impl.a
    @NonNull
    public aec a(@NonNull nec necVar) {
        try {
            return aec.h(necVar, a(), "[DEFAULT]");
        } catch (Throwable unused) {
            return aec.d();
        }
    }

    public g(@NonNull Context context, @NonNull i iVar) {
        super(context, iVar);
    }
}
