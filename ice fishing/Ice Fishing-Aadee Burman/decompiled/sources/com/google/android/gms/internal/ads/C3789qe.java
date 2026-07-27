package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.qe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3789qe {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33247a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33248b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33249c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33250d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33251e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33252f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33253g;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f33254h;

    public C3789qe(boolean z3, String str, boolean z6, boolean z9, String str2, int i, String str3, String str4) {
        this.f33247a = z3;
        this.f33248b = str;
        this.f33249c = z6;
        this.f33250d = z9;
        this.f33251e = str2;
        this.f33252f = i;
        this.f33253g = str3;
        Bundle bundle = null;
        if (!TextUtils.isEmpty(str4)) {
            try {
                bundle = A8.b.O(new JSONObject(str4));
            } catch (JSONException e9) {
                C4835j.f39730C.f39740h.d("PlayPrewarmOptions.parseHsdpExtraQueryParams", e9);
            }
        }
        this.f33254h = bundle;
    }
}
