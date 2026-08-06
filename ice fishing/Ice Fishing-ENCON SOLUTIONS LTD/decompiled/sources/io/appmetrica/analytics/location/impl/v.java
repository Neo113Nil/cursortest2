package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;

/* loaded from: classes.dex */
public final class v implements LastKnownLocationExtractorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f7347a;

    /* renamed from: b, reason: collision with root package name */
    public final s f7348b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7349c;

    public v(String str, s sVar, String str2) {
        this.f7347a = str;
        this.f7348b = sVar;
        this.f7349c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return new u(context, this.f7348b.a(permissionExtractor), locationListener, this.f7347a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final String getIdentifier() {
        return this.f7349c;
    }
}
