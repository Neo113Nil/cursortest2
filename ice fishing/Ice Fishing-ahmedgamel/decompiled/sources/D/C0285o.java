package D;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: D.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285o {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f377a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f378b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f379c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f380d;

    /* renamed from: e, reason: collision with root package name */
    public final int f381e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f382f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f383g;

    public C0285o(int i, PendingIntent pendingIntent, String str) {
        IconCompat b9 = i == 0 ? null : IconCompat.b(i);
        Bundle bundle = new Bundle();
        this.f380d = true;
        this.f378b = b9;
        if (b9 != null && b9.d() == 2) {
            this.f381e = b9.c();
        }
        this.f382f = u.b(str);
        this.f383g = pendingIntent;
        this.f377a = bundle;
        this.f379c = true;
        this.f380d = true;
    }
}
