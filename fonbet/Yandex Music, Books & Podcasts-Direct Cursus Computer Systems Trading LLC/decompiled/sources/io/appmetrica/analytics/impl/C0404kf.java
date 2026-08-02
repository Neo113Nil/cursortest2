package io.appmetrica.analytics.impl;

import android.view.KeyEvent;
import defpackage.uif;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0404kf extends uif implements Function1 {
    public final /* synthetic */ MviScreen a;
    public final /* synthetic */ KeyEvent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0404kf(MviScreen mviScreen, KeyEvent keyEvent) {
        super(1);
        this.a = mviScreen;
        this.b = keyEvent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((MviEventsReporter) obj).onKeyEvent(this.a, this.b);
        return Unit.a;
    }
}
