package com.yandex.passport.internal.ui.sloth.authsdk;

import android.app.Activity;

/* loaded from: classes4.dex */
public interface n {
    o build();

    n setActivity(Activity activity);

    n setProgressProperties(com.yandex.passport.common.ui.progress.g gVar);

    n setSlothParams(com.yandex.passport.sloth.data.m mVar);
}
