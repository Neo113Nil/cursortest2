package androidx.work.impl.utils;

import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class WakeLocksHolder {
    public static final WakeLocksHolder INSTANCE = new WakeLocksHolder();
    public static final WeakHashMap wakeLocks = new WeakHashMap();
}
