package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389em {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f5953a;

    /* renamed from: b, reason: collision with root package name */
    public final C0857wo f5954b;

    public C0389em(ProtobufStateStorage protobufStateStorage, C0857wo c0857wo) {
        this.f5953a = protobufStateStorage;
        this.f5954b = c0857wo;
    }

    public C0389em(Context context) {
        this(((Rm) Pm.a(C0518jm.class)).create(context), C0610na.k().D().a());
    }
}
