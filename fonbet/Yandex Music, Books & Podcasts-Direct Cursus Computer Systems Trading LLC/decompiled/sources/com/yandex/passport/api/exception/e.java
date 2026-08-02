package com.yandex.passport.api.exception;

import android.content.Intent;

/* loaded from: classes4.dex */
public final class e extends j {
    public final Intent a;

    public e(Intent intent) {
        super("Opening Intent required");
        this.a = intent;
    }
}
