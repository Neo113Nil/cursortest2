package com.google.crypto.tink.config.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class TinkFipsUtil {
    public static final Logger logger = Logger.getLogger(TinkFipsUtil.class.getName());
    public static final AtomicBoolean isRestrictedToFips = new AtomicBoolean(false);

    public static boolean useOnlyFips() {
        return isRestrictedToFips.get();
    }
}
