package com.squareup.cash.shortcut;

import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import kotlin.reflect.KClass;

/* loaded from: classes7.dex */
public final class QrCodeShortcutBuilder {
    public final RealClientRouteFormatter clientRouteFormatter;
    public final KClass mainActivityClass;

    public QrCodeShortcutBuilder(RealClientRouteFormatter realClientRouteFormatter, KClass kClass) {
        kClass.getClass();
        this.clientRouteFormatter = realClientRouteFormatter;
        this.mainActivityClass = kClass;
    }
}
