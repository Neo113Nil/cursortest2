package com.yandex.plus.core.theme;

import android.content.Context;
import defpackage.b6e;

/* loaded from: classes4.dex */
public final class d {
    public final int a;
    public final int b;

    public d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a(Context context, com.yandex.plus.ui.core.theme.a aVar) {
        context.getClass();
        aVar.getClass();
        int ordinal = aVar.ordinal();
        int i = this.b;
        if (ordinal == 0) {
            return i;
        }
        int i2 = this.a;
        if (ordinal == 1) {
            return i2;
        }
        if (ordinal == 2) {
            return com.yandex.plus.home.common.utils.a.i(context) ? i : i2;
        }
        b6e.s();
        return 0;
    }
}
