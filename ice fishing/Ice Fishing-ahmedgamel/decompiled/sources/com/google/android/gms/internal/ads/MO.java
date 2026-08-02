package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class MO extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f27084a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f27085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2521Ce f27086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MO(C2521Ce c2521Ce, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        Objects.requireNonNull(c2521Ce);
        this.f27086c = c2521Ce;
        this.f27084a = contentResolver;
        this.f27085b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        this.f27086c.l();
    }
}
