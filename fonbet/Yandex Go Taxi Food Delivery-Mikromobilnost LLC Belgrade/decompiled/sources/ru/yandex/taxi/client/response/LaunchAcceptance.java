package ru.yandex.taxi.client.response;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kux;
import defpackage.vix;
import defpackage.yjd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/client/response/LaunchAcceptance;", "", "Companion", "IconStyle", "ru/yandex/taxi/client/response/a", "kux", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LaunchAcceptance {
    public static final kux Companion = new kux();
    public static final i3y[] m = {null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vix(15))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final IconStyle l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/client/response/LaunchAcceptance$IconStyle;", "", "Companion", "ru/yandex/taxi/client/response/b", "LEFT", "CENTER", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class IconStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ IconStyle[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final IconStyle CENTER;
        public static final b Companion;
        public static final IconStyle LEFT;

        static {
            IconStyle iconStyle = new IconStyle("LEFT", 0);
            LEFT = iconStyle;
            IconStyle iconStyle2 = new IconStyle("CENTER", 1);
            CENTER = iconStyle2;
            IconStyle[] iconStyleArr = {iconStyle, iconStyle2};
            $VALUES = iconStyleArr;
            $ENTRIES = kotlin.enums.a.a(iconStyleArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vix(16));
        }

        public static IconStyle valueOf(String str) {
            return (IconStyle) Enum.valueOf(IconStyle.class, str);
        }

        public static IconStyle[] values() {
            return (IconStyle[]) $VALUES.clone();
        }
    }

    public /* synthetic */ LaunchAcceptance(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, String str7, boolean z2, boolean z3, IconStyle iconStyle) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = 86400L;
        } else {
            this.g = j;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = true;
        } else {
            this.j = z2;
        }
        if ((i & 1024) == 0) {
            this.k = true;
        } else {
            this.k = z3;
        }
        if ((i & 2048) == 0) {
            this.l = IconStyle.CENTER;
        } else {
            this.l = iconStyle;
        }
    }

    public static final /* synthetic */ void n(LaunchAcceptance launchAcceptance, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(launchAcceptance.a, "")) {
            yjdVar.o(serialDescriptor, 0, launchAcceptance.a);
        }
        if (yjdVar.F() || launchAcceptance.b != null) {
            yjdVar.g(serialDescriptor, 1, auu0.a, launchAcceptance.b);
        }
        if (yjdVar.F() || launchAcceptance.c != null) {
            yjdVar.g(serialDescriptor, 2, auu0.a, launchAcceptance.c);
        }
        if (yjdVar.F() || launchAcceptance.d != null) {
            yjdVar.g(serialDescriptor, 3, auu0.a, launchAcceptance.d);
        }
        if (yjdVar.F() || launchAcceptance.e != null) {
            yjdVar.g(serialDescriptor, 4, auu0.a, launchAcceptance.e);
        }
        if (yjdVar.F() || launchAcceptance.f != null) {
            yjdVar.g(serialDescriptor, 5, auu0.a, launchAcceptance.f);
        }
        if (yjdVar.F() || launchAcceptance.g != 86400) {
            yjdVar.s(serialDescriptor, 6, launchAcceptance.g);
        }
        if (yjdVar.F() || launchAcceptance.h) {
            yjdVar.n(serialDescriptor, 7, launchAcceptance.h);
        }
        if (yjdVar.F() || launchAcceptance.i != null) {
            yjdVar.g(serialDescriptor, 8, auu0.a, launchAcceptance.i);
        }
        if (yjdVar.F() || !launchAcceptance.j) {
            yjdVar.n(serialDescriptor, 9, launchAcceptance.j);
        }
        if (yjdVar.F() || !launchAcceptance.k) {
            yjdVar.n(serialDescriptor, 10, launchAcceptance.k);
        }
        if (!yjdVar.F() && launchAcceptance.l == IconStyle.CENTER) {
            return;
        }
        yjdVar.e(serialDescriptor, 11, (KSerializer) m[11].getValue(), launchAcceptance.l);
    }

    /* renamed from: b, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: d, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: e, reason: from getter */
    public final IconStyle getL() {
        return this.l;
    }

    /* renamed from: f, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* renamed from: g, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: h, reason: from getter */
    public final long getG() {
        return this.g;
    }

    /* renamed from: i, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: j, reason: from getter */
    public final String getI() {
        return this.i;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getJ() {
        return this.j;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getK() {
        return this.k;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getH() {
        return this.h;
    }

    public LaunchAcceptance() {
        IconStyle iconStyle = IconStyle.CENTER;
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 86400L;
        this.h = false;
        this.i = null;
        this.j = true;
        this.k = true;
        this.l = iconStyle;
    }
}
