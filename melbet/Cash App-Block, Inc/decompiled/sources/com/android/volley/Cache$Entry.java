package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Cache$Entry {
    public List allResponseHeaders;
    public byte[] data;
    public String etag;
    public long lastModified;
    public Map responseHeaders = Collections.EMPTY_MAP;
    public long serverDate;
    public long softTtl;
    public long ttl;
}
