package com.appsflyer.internal;

/* loaded from: classes4.dex */
public abstract class AFh1kSDK extends AFa1oSDK {
    private final boolean copy;
    private final boolean copydefault;

    AFh1kSDK() {
        this(null, null, null);
    }

    protected AFh1kSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.copy = bool != null ? bool.booleanValue() : true;
        this.copydefault = true;
    }
}
