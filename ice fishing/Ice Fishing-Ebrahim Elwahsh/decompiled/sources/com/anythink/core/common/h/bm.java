package com.anythink.core.common.h;

import com.anythink.core.api.ATAdRequest;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bm {

    /* renamed from: a, reason: collision with root package name */
    private String f13855a;

    /* renamed from: b, reason: collision with root package name */
    private String f13856b;

    /* renamed from: c, reason: collision with root package name */
    private String f13857c;

    /* renamed from: d, reason: collision with root package name */
    private String f13858d;

    /* renamed from: e, reason: collision with root package name */
    private int f13859e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Object> f13860f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Object> f13861g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f13862h;
    private JSONObject i;

    /* renamed from: j, reason: collision with root package name */
    private String f13863j;

    /* renamed from: k, reason: collision with root package name */
    private JSONObject f13864k;

    /* renamed from: l, reason: collision with root package name */
    private ATAdRequest f13865l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13866m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13867n;

    public bm(String str, String str2, String str3, String str4, Map<String, Object> map, Map<String, Object> map2, JSONObject jSONObject, ATAdRequest aTAdRequest) {
        this.f13855a = str;
        this.f13856b = str2;
        this.f13857c = str3;
        this.f13858d = str4;
        this.f13860f = map;
        this.f13861g = map2;
        this.i = jSONObject;
        this.f13865l = aTAdRequest;
    }

    private void a(String str) {
        this.f13855a = str;
    }

    public final String b() {
        return this.f13855a;
    }

    public final String c() {
        return this.f13856b;
    }

    public final String d() {
        return this.f13857c;
    }

    public final String e() {
        return this.f13858d;
    }

    public final Map<String, Object> f() {
        return this.f13860f;
    }

    public final Map<String, Object> g() {
        return this.f13861g;
    }

    public final int h() {
        return this.f13859e;
    }

    public final Map<String, String> i() {
        return this.f13862h;
    }

    public final ATAdRequest j() {
        return this.f13865l;
    }

    public final JSONObject k() {
        return this.i;
    }

    public final String l() {
        return this.f13863j;
    }

    public final JSONObject m() {
        return this.f13864k;
    }

    public final boolean n() {
        return this.f13866m;
    }

    public final boolean o() {
        return this.f13867n;
    }

    public String toString() {
        return "PlaceStrategyLoaderParams{appId='" + this.f13855a + "', appKey='" + this.f13856b + "', placeId='" + this.f13857c + "', settingId='" + this.f13858d + "', fistReqPlaceStrategyFlag=" + this.f13859e + ", customMap=" + this.f13860f + ", tkExtraMap=" + this.f13861g + ", cachedMap=" + this.f13862h + '}';
    }

    private void b(String str) {
        this.f13856b = str;
    }

    private void c(String str) {
        this.f13857c = str;
    }

    private void d(String str) {
        this.f13858d = str;
    }

    public final void a(int i) {
        this.f13859e = i;
    }

    private void b(Map<String, Object> map) {
        this.f13860f = map;
    }

    private void c(Map<String, Object> map) {
        this.f13861g = map;
    }

    public final void a(Map<String, String> map) {
        this.f13862h = map;
    }

    public final void a(JSONObject jSONObject) {
        this.f13864k = jSONObject;
    }

    public final void b(boolean z8) {
        this.f13867n = z8;
    }

    public final void a(boolean z8) {
        this.f13866m = z8;
    }

    public bm(String str, String str2, String str3, String str4) {
        this.i = null;
        this.f13855a = str;
        this.f13856b = str2;
        this.f13857c = str3;
        this.f13863j = str4;
    }
}
