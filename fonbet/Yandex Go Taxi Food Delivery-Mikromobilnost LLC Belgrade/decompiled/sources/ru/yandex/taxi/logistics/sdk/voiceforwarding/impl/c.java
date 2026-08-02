package ru.yandex.taxi.logistics.sdk.voiceforwarding.impl;

import com.yandex.delivery.mapper.model.ForwardingId;
import defpackage.bvf0;
import defpackage.h3y;
import defpackage.qoh;
import defpackage.st2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes9.dex */
public final class c {
    public final h3y a;
    public final st2 b;
    public final AppVisibilitySubscriptionImpl c;
    public qoh d;

    public c(h3y h3yVar, st2 st2Var, AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl) {
        this.a = h3yVar;
        this.b = st2Var;
        this.c = appVisibilitySubscriptionImpl;
    }

    public final Object a(String str, ForwardingId forwardingId, ContinuationImpl continuationImpl) {
        return bvf0.n(new VoiceForwardingImpl$receivePhoneForDelivery$2(this, str, forwardingId, null), continuationImpl);
    }
}
