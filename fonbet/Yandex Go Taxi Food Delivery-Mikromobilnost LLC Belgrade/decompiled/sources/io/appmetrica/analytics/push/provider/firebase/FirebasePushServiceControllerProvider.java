package io.appmetrica.analytics.push.provider.firebase;

import android.content.Context;
import android.text.TextUtils;
import defpackage.ny61;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.push.provider.api.PushServiceController;
import io.appmetrica.analytics.push.provider.api.PushServiceControllerProvider;
import io.appmetrica.analytics.push.provider.firebase.impl.f;
import io.appmetrica.analytics.push.provider.firebase.impl.i;
import io.appmetrica.analytics.push.provider.firebase.impl.l;
import io.appmetrica.analytics.push.provider.firebase.impl.m;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public class FirebasePushServiceControllerProvider implements PushServiceControllerProvider {
    private final List a;

    public FirebasePushServiceControllerProvider(Context context) {
        this(Arrays.asList(new i(context), new l(context), new f(context)));
    }

    @Override // io.appmetrica.analytics.push.provider.api.PushServiceControllerProvider
    public PushServiceController getPushServiceController() {
        for (f fVar : this.a) {
            m mVar = (m) fVar.c.getValue();
            if (!TextUtils.isEmpty(mVar.b) || !TextUtils.isEmpty(mVar.c)) {
                if (!TextUtils.isEmpty(mVar.b) && !TextUtils.isEmpty(mVar.c)) {
                    return fVar;
                }
                ny61.r((String) fVar.d.getValue());
                return null;
            }
        }
        ny61.r(CoreConstants.EXCEPTION_MESSAGE_ERROR_ACTIVATE);
        return null;
    }

    public FirebasePushServiceControllerProvider(List list) {
        this.a = list;
    }
}
