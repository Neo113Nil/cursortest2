package x2;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f8224a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f8225b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8226c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8227d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8228e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f8229f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f8230g;

    public c(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat a6 = i10 == 0 ? null : IconCompat.a(i10);
        Bundle bundle = new Bundle();
        this.f8227d = true;
        this.f8225b = a6;
        if (a6 != null && a6.c() == 2) {
            this.f8228e = a6.b();
        }
        this.f8229f = i.b(charSequence);
        this.f8230g = pendingIntent;
        this.f8224a = bundle;
        this.f8226c = true;
        this.f8227d = true;
    }
}
