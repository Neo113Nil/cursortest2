package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.qe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3812qe {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f34029a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34030b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34031c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34032d;

    /* renamed from: e, reason: collision with root package name */
    public final String f34033e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34034f;

    /* renamed from: g, reason: collision with root package name */
    public final String f34035g;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f34036h;

    public C3812qe(boolean z6, String str, boolean z9, boolean z10, String str2, int i, String str3, String str4) {
        this.f34029a = z6;
        this.f34030b = str;
        this.f34031c = z9;
        this.f34032d = z10;
        this.f34033e = str2;
        this.f34034f = i;
        this.f34035g = str3;
        Bundle bundle = null;
        if (!TextUtils.isEmpty(str4)) {
            try {
                bundle = d6.c.w(new JSONObject(str4));
            } catch (JSONException e9) {
                C4906k.f40186C.f40196h.d("PlayPrewarmOptions.parseHsdpExtraQueryParams", e9);
            }
        }
        this.f34036h = bundle;
    }
}
