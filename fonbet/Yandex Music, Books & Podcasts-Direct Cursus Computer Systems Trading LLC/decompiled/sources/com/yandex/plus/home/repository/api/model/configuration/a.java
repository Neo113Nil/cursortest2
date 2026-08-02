package com.yandex.plus.home.repository.api.model.configuration;

import com.appsflyer.internal.k;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final Integer a;
    public final Integer b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Integer g;
    public final Integer h;
    public final Boolean i;

    public a(Integer num, Integer num2, Set set, Set set2, Set set3, Set set4, Integer num3, Integer num4, Boolean bool) {
        this.a = num;
        this.b = num2;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = set4;
        this.g = num3;
        this.h = num4;
        this.i = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d) && Intrinsics.d(this.e, aVar.e) && Intrinsics.d(this.f, aVar.f) && Intrinsics.d(this.g, aVar.g) && Intrinsics.d(this.h, aVar.h) && Intrinsics.d(this.i, aVar.i);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Set set = this.c;
        int hashCode3 = (hashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.d;
        int hashCode4 = (hashCode3 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.e;
        int hashCode5 = (hashCode4 + (set3 == null ? 0 : set3.hashCode())) * 31;
        Set set4 = this.f;
        int hashCode6 = (hashCode5 + (set4 == null ? 0 : set4.hashCode())) * 31;
        Integer num3 = this.g;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.i;
        return hashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkConfiguration(readyMessageTimeoutMillis=");
        sb.append(this.a);
        sb.append(", animationDurationMillis=");
        sb.append(this.b);
        sb.append(", hostsForOpenInSystem=");
        sb.append(this.c);
        sb.append(", allowedHosts=");
        sb.append(this.d);
        sb.append(", jsBridgeAllowedHosts=");
        sb.append(this.e);
        sb.append(", forbiddenHosts=");
        sb.append(this.f);
        sb.append(", webViewHideThreshold=");
        sb.append(this.g);
        sb.append(", webViewDownwardScrollFriction=");
        sb.append(this.h);
        sb.append(", isPanelDiagnosticEnabled=");
        return k.p(sb, this.i, ')');
    }
}
