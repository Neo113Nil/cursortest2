package com.yandex.plus.core.debug.panel.internal.utils.resource;

import android.content.Context;

/* loaded from: classes4.dex */
public final class a {
    public final Context a;

    public a(Context context, int i) {
        switch (i) {
            case 1:
                context.getClass();
                this.a = context;
                break;
            default:
                context.getClass();
                this.a = context.getApplicationContext();
                break;
        }
    }
}
