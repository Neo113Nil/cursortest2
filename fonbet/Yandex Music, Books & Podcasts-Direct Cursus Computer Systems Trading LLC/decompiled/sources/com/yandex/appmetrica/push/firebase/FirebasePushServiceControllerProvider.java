package com.yandex.appmetrica.push.firebase;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.appmetrica.push.firebase.impl.a;
import com.yandex.appmetrica.push.firebase.impl.d;
import com.yandex.appmetrica.push.firebase.impl.g;
import com.yandex.appmetrica.push.firebase.impl.h;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.metrica.push.common.core.PushServiceController;
import com.yandex.metrica.push.common.core.PushServiceControllerProvider;
import defpackage.xq0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class FirebasePushServiceControllerProvider implements PushServiceControllerProvider {

    @NonNull
    private final List<? extends a> a;

    public FirebasePushServiceControllerProvider(@NonNull Context context) {
        this((List<a>) Arrays.asList(new d(context), new g(context), new a(context)));
    }

    @Override // com.yandex.metrica.push.common.core.PushServiceControllerProvider
    @NonNull
    public PushServiceController getPushServiceController() {
        for (a aVar : this.a) {
            h c = aVar.c();
            if (!c.a()) {
                if (c.b()) {
                    return aVar;
                }
                xq0.q(aVar.b());
                return null;
            }
        }
        xq0.q(CoreConstants.EXCEPTION_MESSAGE_ERROR_ACTIVATE);
        return null;
    }

    public FirebasePushServiceControllerProvider(@NonNull List<a> list) {
        this.a = list;
    }
}
