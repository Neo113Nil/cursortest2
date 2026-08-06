package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410fh extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f5983a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5984b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5985c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5986d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5987e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5988f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5989g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5990h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, String> f5991i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5992j;

    public C0410fh(C0630o4 c0630o4) {
        this(c0630o4.f6644a, c0630o4.f6645b, c0630o4.f6647d, c0630o4.f6648e, c0630o4.f6649f, c0630o4.f6650g, c0630o4.f6651h, c0630o4.f6652i, c0630o4.f6653j, c0630o4.f6654k);
    }

    public static C0410fh a() {
        return new C0410fh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0410fh mergeFrom(C0630o4 c0630o4) {
        return new C0410fh((String) WrapUtils.getOrDefaultNullable(c0630o4.f6644a, this.f5983a), (Boolean) WrapUtils.getOrDefaultNullable(c0630o4.f6645b, Boolean.valueOf(this.f5984b)), (Boolean) WrapUtils.getOrDefaultNullable(c0630o4.f6647d, Boolean.valueOf(this.f5985c)), (Integer) WrapUtils.getOrDefaultNullable(c0630o4.f6648e, Integer.valueOf(this.f5986d)), (Integer) WrapUtils.getOrDefaultNullable(c0630o4.f6649f, Integer.valueOf(this.f5987e)), (Integer) WrapUtils.getOrDefaultNullable(c0630o4.f6650g, Integer.valueOf(this.f5988f)), (Boolean) WrapUtils.getOrDefaultNullable(c0630o4.f6651h, Boolean.valueOf(this.f5989g)), (Boolean) WrapUtils.getOrDefaultNullable(c0630o4.f6652i, Boolean.valueOf(this.f5990h)), (Map) WrapUtils.getOrDefaultNullable(c0630o4.f6653j, this.f5991i), (Integer) WrapUtils.getOrDefaultNullable(c0630o4.f6654k, Integer.valueOf(this.f5992j)));
    }

    public C0410fh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f5983a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f5984b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f5985c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f5986d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f5987e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f5988f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f5989g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f5990h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f5991i = map;
        this.f5992j = ((Integer) WrapUtils.getOrDefault(num4, Integer.valueOf(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT))).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(C0630o4 c0630o4) {
        Map<String, String> map;
        String str;
        Boolean bool = c0630o4.f6645b;
        if (bool != null && this.f5984b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c0630o4.f6647d;
        if (bool2 != null && this.f5985c != bool2.booleanValue()) {
            return false;
        }
        Integer num = c0630o4.f6648e;
        if (num != null && this.f5986d != num.intValue()) {
            return false;
        }
        Integer num2 = c0630o4.f6649f;
        if (num2 != null && this.f5987e != num2.intValue()) {
            return false;
        }
        Integer num3 = c0630o4.f6650g;
        if (num3 != null && this.f5988f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c0630o4.f6651h;
        if (bool3 != null && this.f5989g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c0630o4.f6652i;
        if (bool4 != null && this.f5990h != bool4.booleanValue()) {
            return false;
        }
        String str2 = c0630o4.f6644a;
        if (str2 != null && ((str = this.f5983a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c0630o4.f6653j;
        if (map2 != null && ((map = this.f5991i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c0630o4.f6654k;
        return num4 == null || this.f5992j == num4.intValue();
    }
}
