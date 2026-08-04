package com.gamericefishpro.space.r3;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public c(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat iconCompatA = i == 0 ? null : IconCompat.a(i);
        Bundle bundle = new Bundle();
        this.d = true;
        this.b = iconCompatA;
        if (iconCompatA != null && iconCompatA.c() == 2) {
            this.e = iconCompatA.b();
        }
        this.f = i.b(charSequence);
        this.g = pendingIntent;
        this.a = bundle;
        this.c = true;
        this.d = true;
    }
}
