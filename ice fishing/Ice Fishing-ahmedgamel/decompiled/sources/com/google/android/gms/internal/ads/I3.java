package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class I3 implements InterfaceC3891s3 {

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f26179w = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f26180x = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: n, reason: collision with root package name */
    public final StringBuilder f26181n = new StringBuilder();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f26182u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final Cr f26183v = new Cr();

    public static long a(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * com.anythink.core.common.g.c.f14051b : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.InterfaceC3891s3
    public final void x(byte[] bArr, int i, int i4, Z1.b bVar) {
        String str;
        char c9;
        char c10;
        float f2;
        C4302zj c4302zj;
        I3 i32 = this;
        Cr cr = i32.f26183v;
        cr.z(i + i4, bArr);
        cr.E(i);
        Charset q8 = cr.q();
        if (q8 == null) {
            q8 = StandardCharsets.UTF_8;
        }
        while (true) {
            String n9 = cr.n(q8);
            if (n9 == null) {
                return;
            }
            if (!n9.isEmpty()) {
                try {
                    Integer.parseInt(n9);
                    String n10 = cr.n(q8);
                    if (n10 == null) {
                        AbstractC2991bG.y("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = f26179w.matcher(n10);
                    if (matcher.matches()) {
                        long a9 = a(matcher, 1);
                        long a10 = a(matcher, 6);
                        StringBuilder sb = i32.f26181n;
                        int i6 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = i32.f26182u;
                        arrayList.clear();
                        String n11 = cr.n(q8);
                        while (!TextUtils.isEmpty(n11)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String trim = n11.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = f26180x.matcher(trim);
                            int i9 = i6;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i9;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i9 += length;
                            }
                            sb.append(sb2.toString());
                            n11 = cr.n(q8);
                            i6 = 0;
                        }
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        int i10 = 0;
                        while (true) {
                            if (i10 < arrayList.size()) {
                                str = (String) arrayList.get(i10);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i10++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        if (str == null) {
                            c4302zj = new C4302zj(fromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, 0);
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c9 = 0;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c9 = 3;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -685620617:
                                    if (str.equals("{\\an4}")) {
                                        c9 = 1;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -685620555:
                                    if (str.equals("{\\an6}")) {
                                        c9 = 4;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c9 = 2;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c9 = 5;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                default:
                                    c9 = 65535;
                                    break;
                            }
                            int i11 = (c9 == 0 || c9 == 1 || c9 == 2) ? 0 : (c9 == 3 || c9 == 4 || c9 == 5) ? 2 : 1;
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -685620679:
                                    if (str.equals("{\\an2}")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -685620493:
                                    if (str.equals("{\\an8}")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c10 = 5;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            int i12 = (c10 == 0 || c10 == 1 || c10 == 2) ? 2 : (c10 == 3 || c10 == 4 || c10 == 5) ? 0 : 1;
                            float f9 = 0.08f;
                            if (i11 == 0) {
                                f2 = 0.08f;
                            } else if (i11 == 1) {
                                f2 = 0.5f;
                            } else {
                                if (i11 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                f2 = 0.92f;
                            }
                            if (i12 != 0) {
                                if (i12 == 1) {
                                    f9 = 0.5f;
                                } else {
                                    if (i12 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    f9 = 0.92f;
                                }
                            }
                            c4302zj = new C4302zj(fromHtml, null, null, null, f9, 0, i12, f2, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, 0);
                        }
                        bVar.mo9a(new C3676o3(RB.j(c4302zj), a9, a10 - a9));
                    } else {
                        AbstractC2991bG.y("SubripParser", "Skipping invalid timing: ".concat(n10));
                    }
                } catch (NumberFormatException unused) {
                    AbstractC2991bG.y("SubripParser", "Skipping invalid index: ".concat(n9));
                }
            }
            i32 = this;
        }
    }
}
