package com.squareup.cash.attribution.wrappers;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public interface AppsFlyerClient {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes5.dex */
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final List HOSTS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"click.cash.app", "clicks.cash.app", "cashapp.onelink.me"});

        public static List getHOSTS() {
            return HOSTS;
        }
    }
}
