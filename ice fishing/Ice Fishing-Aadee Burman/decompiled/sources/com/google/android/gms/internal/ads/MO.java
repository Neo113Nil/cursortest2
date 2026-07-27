package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class MO extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f26293a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f26294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2501Ce f26295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MO(C2501Ce c2501Ce, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        Objects.requireNonNull(c2501Ce);
        this.f26295c = c2501Ce;
        this.f26293a = contentResolver;
        this.f26294b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        this.f26295c.l();
    }
}
