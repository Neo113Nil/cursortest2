package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* loaded from: classes2.dex */
public final class H3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25204a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25205b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f25206c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f25207d;

    /* renamed from: e, reason: collision with root package name */
    public final float f25208e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25209f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f25210g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f25211h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f25212j;

    public H3(String str, int i, Integer num, Integer num2, float f3, boolean z3, boolean z6, boolean z9, boolean z10, int i6) {
        this.f25204a = str;
        this.f25205b = i;
        this.f25206c = num;
        this.f25207d = num2;
        this.f25208e = f3;
        this.f25209f = z3;
        this.f25210g = z6;
        this.f25211h = z9;
        this.i = z10;
        this.f25212j = i6;
    }

    public static Integer a(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC2772Sd.i(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(UC.a(((parseLong >> 24) & 255) ^ 255), UC.a(parseLong & 255), UC.a((parseLong >> 8) & 255), UC.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e9) {
            AbstractC2968bG.C("SsaStyle", D.y.s(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e9);
            return null;
        }
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e9) {
            AbstractC2968bG.C("SsaStyle", D.y.s(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e9);
            return false;
        }
    }
}
