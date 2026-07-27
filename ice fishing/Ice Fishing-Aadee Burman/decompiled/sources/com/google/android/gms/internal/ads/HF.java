package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class HF {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f25248a = Logger.getLogger(HF.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f25249b = new AtomicBoolean(false);

    public static boolean a() {
        return f25249b.get();
    }
}
