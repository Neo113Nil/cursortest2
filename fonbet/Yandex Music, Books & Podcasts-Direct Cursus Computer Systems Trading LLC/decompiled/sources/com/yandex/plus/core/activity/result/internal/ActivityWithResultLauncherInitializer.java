package com.yandex.plus.core.activity.result.internal;

import android.app.Application;
import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.c5b;
import defpackage.lme;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/core/activity/result/internal/ActivityWithResultLauncherInitializer;", "Llme;", "Lcom/yandex/plus/core/activity/result/internal/h;", "<init>", "()V", "plus-core-activity-result-helper_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class ActivityWithResultLauncherInitializer implements lme {
    @Override // defpackage.lme
    public final List a() {
        return c5b.a;
    }

    @Override // defpackage.lme
    public final Object create(Context context) {
        context.getClass();
        h hVar = h.d;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Application application = (Application) applicationContext;
        hVar.getClass();
        hVar.a = application;
        application.registerActivityLifecycleCallbacks(new b(hVar));
        return hVar;
    }
}
