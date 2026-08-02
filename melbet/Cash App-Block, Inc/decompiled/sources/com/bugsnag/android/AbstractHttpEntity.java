package com.bugsnag.android;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public abstract class AbstractHttpEntity {
    public String body;
    public final LinkedHashMap headers = new LinkedHashMap();
    public long bodyLength = -1;
}
