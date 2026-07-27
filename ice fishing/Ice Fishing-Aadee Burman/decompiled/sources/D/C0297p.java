package D;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: D.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297p {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f482a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f483b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f484c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f485d;

    /* renamed from: e, reason: collision with root package name */
    public final int f486e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f487f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f488g;

    public C0297p(int i, PendingIntent pendingIntent, String str) {
        IconCompat b9 = i == 0 ? null : IconCompat.b(i);
        Bundle bundle = new Bundle();
        this.f485d = true;
        this.f483b = b9;
        if (b9 != null && b9.d() == 2) {
            this.f486e = b9.c();
        }
        this.f487f = v.b(str);
        this.f488g = pendingIntent;
        this.f482a = bundle;
        this.f484c = true;
        this.f485d = true;
    }
}
