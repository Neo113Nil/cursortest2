package com.anythink.core.common.h;

import com.anythink.core.api.ATAdRequest;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bm {

    /* renamed from: a, reason: collision with root package name */
    private String f13698a;

    /* renamed from: b, reason: collision with root package name */
    private String f13699b;

    /* renamed from: c, reason: collision with root package name */
    private String f13700c;

    /* renamed from: d, reason: collision with root package name */
    private String f13701d;

    /* renamed from: e, reason: collision with root package name */
    private int f13702e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Object> f13703f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Object> f13704g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f13705h;
    private JSONObject i;

    /* renamed from: j, reason: collision with root package name */
    private String f13706j;

    /* renamed from: k, reason: collision with root package name */
    private JSONObject f13707k;

    /* renamed from: l, reason: collision with root package name */
    private ATAdRequest f13708l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13709m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13710n;

    public bm(String str, String str2, String str3, String str4, Map<String, Object> map, Map<String, Object> map2, JSONObject jSONObject, ATAdRequest aTAdRequest) {
        this.f13698a = str;
        this.f13699b = str2;
        this.f13700c = str3;
        this.f13701d = str4;
        this.f13703f = map;
        this.f13704g = map2;
        this.i = jSONObject;
        this.f13708l = aTAdRequest;
    }

    private void a(String str) {
        this.f13698a = str;
    }

    public final String b() {
        return this.f13698a;
    }

    public final String c() {
        return this.f13699b;
    }

    public final String d() {
        return this.f13700c;
    }

    public final String e() {
        return this.f13701d;
    }

    public final Map<String, Object> f() {
        return this.f13703f;
    }

    public final Map<String, Object> g() {
        return this.f13704g;
    }

    public final int h() {
        return this.f13702e;
    }

    public final Map<String, String> i() {
        return this.f13705h;
    }

    public final ATAdRequest j() {
        return this.f13708l;
    }

    public final JSONObject k() {
        return this.i;
    }

    public final String l() {
        return this.f13706j;
    }

    public final JSONObject m() {
        return this.f13707k;
    }

    public final boolean n() {
        return this.f13709m;
    }

    public final boolean o() {
        return this.f13710n;
    }

    public String toString() {
        return "PlaceStrategyLoaderParams{appId='" + this.f13698a + "', appKey='" + this.f13699b + "', placeId='" + this.f13700c + "', settingId='" + this.f13701d + "', fistReqPlaceStrategyFlag=" + this.f13702e + ", customMap=" + this.f13703f + ", tkExtraMap=" + this.f13704g + ", cachedMap=" + this.f13705h + '}';
    }

    private void b(String str) {
        this.f13699b = str;
    }

    private void c(String str) {
        this.f13700c = str;
    }

    private void d(String str) {
        this.f13701d = str;
    }

    public final void a(int i) {
        this.f13702e = i;
    }

    private void b(Map<String, Object> map) {
        this.f13703f = map;
    }

    private void c(Map<String, Object> map) {
        this.f13704g = map;
    }

    public final void a(Map<String, String> map) {
        this.f13705h = map;
    }

    public final void a(JSONObject jSONObject) {
        this.f13707k = jSONObject;
    }

    public final void b(boolean z3) {
        this.f13710n = z3;
    }

    public final void a(boolean z3) {
        this.f13709m = z3;
    }

    public bm(String str, String str2, String str3, String str4) {
        this.i = null;
        this.f13698a = str;
        this.f13699b = str2;
        this.f13700c = str3;
        this.f13706j = str4;
    }
}
