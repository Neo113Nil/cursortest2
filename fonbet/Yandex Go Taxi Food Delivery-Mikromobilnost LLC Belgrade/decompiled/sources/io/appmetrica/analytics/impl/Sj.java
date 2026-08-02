package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Sj extends BaseRequestConfig.BaseRequestArguments {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final Map<String, String> i;
    public final int j;

    public Sj(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.a = str;
        Boolean bool5 = Boolean.TRUE;
        this.b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        Boolean bool6 = Boolean.FALSE;
        this.c = ((Boolean) WrapUtils.getOrDefault(bool2, bool6)).booleanValue();
        this.d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.g = ((Boolean) WrapUtils.getOrDefault(bool3, bool6)).booleanValue();
        this.h = ((Boolean) WrapUtils.getOrDefault(bool4, bool5)).booleanValue();
        this.i = map;
        this.j = ((Integer) WrapUtils.getOrDefault(num4, 1000)).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(C0439j5 c0439j5) {
        Map<String, String> map;
        String str;
        Boolean bool = c0439j5.b;
        if (bool != null && this.b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c0439j5.d;
        if (bool2 != null && this.c != bool2.booleanValue()) {
            return false;
        }
        Integer num = c0439j5.e;
        if (num != null && this.d != num.intValue()) {
            return false;
        }
        Integer num2 = c0439j5.f;
        if (num2 != null && this.e != num2.intValue()) {
            return false;
        }
        Integer num3 = c0439j5.g;
        if (num3 != null && this.f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c0439j5.h;
        if (bool3 != null && this.g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c0439j5.i;
        if (bool4 != null && this.h != bool4.booleanValue()) {
            return false;
        }
        String str2 = c0439j5.a;
        if (str2 != null && ((str = this.a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c0439j5.j;
        if (map2 != null && ((map = this.i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c0439j5.k;
        return num4 == null || this.j == num4.intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Sj mergeFrom(C0439j5 c0439j5) {
        return new Sj((String) WrapUtils.getOrDefaultNullable(c0439j5.a, this.a), (Boolean) WrapUtils.getOrDefaultNullable(c0439j5.b, Boolean.valueOf(this.b)), (Boolean) WrapUtils.getOrDefaultNullable(c0439j5.d, Boolean.valueOf(this.c)), (Integer) WrapUtils.getOrDefaultNullable(c0439j5.e, Integer.valueOf(this.d)), (Integer) WrapUtils.getOrDefaultNullable(c0439j5.f, Integer.valueOf(this.e)), (Integer) WrapUtils.getOrDefaultNullable(c0439j5.g, Integer.valueOf(this.f)), (Boolean) WrapUtils.getOrDefaultNullable(c0439j5.h, Boolean.valueOf(this.g)), (Boolean) WrapUtils.getOrDefaultNullable(c0439j5.i, Boolean.valueOf(this.h)), (Map) WrapUtils.getOrDefaultNullable(c0439j5.j, this.i), (Integer) WrapUtils.getOrDefaultNullable(c0439j5.k, Integer.valueOf(this.j)));
    }

    public Sj(C0439j5 c0439j5) {
        this(c0439j5.a, c0439j5.b, c0439j5.d, c0439j5.e, c0439j5.f, c0439j5.g, c0439j5.h, c0439j5.i, c0439j5.j, c0439j5.k);
    }

    public static Sj a() {
        return new Sj(null, null, null, null, null, null, null, null, null, null);
    }
}
