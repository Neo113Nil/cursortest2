package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* loaded from: classes2.dex */
public final class H3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25976a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25977b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f25978c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f25979d;

    /* renamed from: e, reason: collision with root package name */
    public final float f25980e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25981f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f25982g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f25983h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f25984j;

    public H3(String str, int i, Integer num, Integer num2, float f2, boolean z6, boolean z9, boolean z10, boolean z11, int i4) {
        this.f25976a = str;
        this.f25977b = i;
        this.f25978c = num;
        this.f25979d = num2;
        this.f25980e = f2;
        this.f25981f = z6;
        this.f25982g = z9;
        this.f25983h = z10;
        this.i = z11;
        this.f25984j = i4;
    }

    public static Integer a(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC2792Sd.i(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(UC.a(((parseLong >> 24) & 255) ^ 255), UC.a(parseLong & 255), UC.a((parseLong >> 8) & 255), UC.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e9) {
            AbstractC2991bG.C("SsaStyle", D.x.p(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e9);
            return null;
        }
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e9) {
            AbstractC2991bG.C("SsaStyle", D.x.p(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e9);
            return false;
        }
    }
}
