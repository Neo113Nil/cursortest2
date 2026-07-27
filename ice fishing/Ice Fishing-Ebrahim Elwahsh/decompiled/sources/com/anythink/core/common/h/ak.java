package com.anythink.core.common.h;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private int f13651a;

    /* renamed from: b, reason: collision with root package name */
    private long f13652b = 1800000;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f13653c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f13654d;

    private int d() {
        return this.f13651a;
    }

    public final void a(int i) {
        this.f13651a = i;
    }

    public final long b() {
        return this.f13652b;
    }

    public final Map<String, List<String>> c() {
        return this.f13654d;
    }

    public final void a(long j9) {
        this.f13652b = j9;
    }

    public final void a(List<String> list) {
        this.f13653c = list;
    }

    public final List<String> a() {
        return this.f13653c;
    }

    public final void a(Map<String, List<String>> map) {
        this.f13654d = map;
    }
}
