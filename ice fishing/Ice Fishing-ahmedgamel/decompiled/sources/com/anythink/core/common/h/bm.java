package com.anythink.core.common.h;

import com.anythink.core.api.ATAdRequest;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bm {

    /* renamed from: a, reason: collision with root package name */
    private String f14484a;

    /* renamed from: b, reason: collision with root package name */
    private String f14485b;

    /* renamed from: c, reason: collision with root package name */
    private String f14486c;

    /* renamed from: d, reason: collision with root package name */
    private String f14487d;

    /* renamed from: e, reason: collision with root package name */
    private int f14488e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Object> f14489f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Object> f14490g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f14491h;
    private JSONObject i;

    /* renamed from: j, reason: collision with root package name */
    private String f14492j;

    /* renamed from: k, reason: collision with root package name */
    private JSONObject f14493k;

    /* renamed from: l, reason: collision with root package name */
    private ATAdRequest f14494l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14495m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14496n;

    public bm(String str, String str2, String str3, String str4, Map<String, Object> map, Map<String, Object> map2, JSONObject jSONObject, ATAdRequest aTAdRequest) {
        this.f14484a = str;
        this.f14485b = str2;
        this.f14486c = str3;
        this.f14487d = str4;
        this.f14489f = map;
        this.f14490g = map2;
        this.i = jSONObject;
        this.f14494l = aTAdRequest;
    }

    private void a(String str) {
        this.f14484a = str;
    }

    public final String b() {
        return this.f14484a;
    }

    public final String c() {
        return this.f14485b;
    }

    public final String d() {
        return this.f14486c;
    }

    public final String e() {
        return this.f14487d;
    }

    public final Map<String, Object> f() {
        return this.f14489f;
    }

    public final Map<String, Object> g() {
        return this.f14490g;
    }

    public final int h() {
        return this.f14488e;
    }

    public final Map<String, String> i() {
        return this.f14491h;
    }

    public final ATAdRequest j() {
        return this.f14494l;
    }

    public final JSONObject k() {
        return this.i;
    }

    public final String l() {
        return this.f14492j;
    }

    public final JSONObject m() {
        return this.f14493k;
    }

    public final boolean n() {
        return this.f14495m;
    }

    public final boolean o() {
        return this.f14496n;
    }

    public String toString() {
        return "PlaceStrategyLoaderParams{appId='" + this.f14484a + "', appKey='" + this.f14485b + "', placeId='" + this.f14486c + "', settingId='" + this.f14487d + "', fistReqPlaceStrategyFlag=" + this.f14488e + ", customMap=" + this.f14489f + ", tkExtraMap=" + this.f14490g + ", cachedMap=" + this.f14491h + '}';
    }

    private void b(String str) {
        this.f14485b = str;
    }

    private void c(String str) {
        this.f14486c = str;
    }

    private void d(String str) {
        this.f14487d = str;
    }

    public final void a(int i) {
        this.f14488e = i;
    }

    private void b(Map<String, Object> map) {
        this.f14489f = map;
    }

    private void c(Map<String, Object> map) {
        this.f14490g = map;
    }

    public final void a(Map<String, String> map) {
        this.f14491h = map;
    }

    public final void a(JSONObject jSONObject) {
        this.f14493k = jSONObject;
    }

    public final void b(boolean z6) {
        this.f14496n = z6;
    }

    public final void a(boolean z6) {
        this.f14495m = z6;
    }

    public bm(String str, String str2, String str3, String str4) {
        this.i = null;
        this.f14484a = str;
        this.f14485b = str2;
        this.f14486c = str3;
        this.f14492j = str4;
    }
}
