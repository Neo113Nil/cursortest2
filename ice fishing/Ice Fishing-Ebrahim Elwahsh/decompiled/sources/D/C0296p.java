package D;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: D.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296p {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f537a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f538b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f539c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f540d;

    /* renamed from: e, reason: collision with root package name */
    public final int f541e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f542f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f543g;

    public C0296p(int i, PendingIntent pendingIntent, String str) {
        IconCompat b9 = i == 0 ? null : IconCompat.b(i);
        Bundle bundle = new Bundle();
        this.f540d = true;
        this.f538b = b9;
        if (b9 != null && b9.d() == 2) {
            this.f541e = b9.c();
        }
        this.f542f = v.b(str);
        this.f543g = pendingIntent;
        this.f537a = bundle;
        this.f539c = true;
        this.f540d = true;
    }
}
