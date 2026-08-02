package com.yandex.plus.home.graphql.configuration;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.g4;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.msa;
import defpackage.nsa;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();
    public static final arf[] k;
    public final Integer a;
    public final Integer b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Integer g;
    public final Integer h;
    public final Boolean i;
    public final long j;

    static {
        bwf bwfVar = bwf.b;
        k = new arf[]{null, null, btf.a(bwfVar, new g4(29)), btf.a(bwfVar, new a(0)), btf.a(bwfVar, new a(1)), btf.a(bwfVar, new a(2)), null, null, null, null};
    }

    public /* synthetic */ d(int i, Integer num, Integer num2, Set set, Set set2, Set set3, Set set4, Integer num3, Integer num4, Boolean bool, nsa nsaVar) {
        if (1023 != (i & 1023)) {
            u7g.V(i, 1023, b.a.getDescriptor());
            throw null;
        }
        this.a = num;
        this.b = num2;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = set4;
        this.g = num3;
        this.h = num4;
        this.i = bool;
        this.j = nsaVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && Intrinsics.d(this.b, dVar.b) && Intrinsics.d(this.c, dVar.c) && Intrinsics.d(this.d, dVar.d) && Intrinsics.d(this.e, dVar.e) && Intrinsics.d(this.f, dVar.f) && Intrinsics.d(this.g, dVar.g) && Intrinsics.d(this.h, dVar.h) && Intrinsics.d(this.i, dVar.i) && nsa.e(this.j, dVar.j);
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
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        msa msaVar = nsa.b;
        return Long.hashCode(this.j) + hashCode9;
    }

    public final String toString() {
        return "LocalSdkConfigurationModel(readyMessageTimeoutMillis=" + this.a + ", animationDurationMillis=" + this.b + ", hostsForOpenInSystem=" + this.c + ", allowedHosts=" + this.d + ", jsBridgeAllowedHosts=" + this.e + ", forbiddenHosts=" + this.f + ", webViewHideThreshold=" + this.g + ", webViewDownwardScrollFriction=" + this.h + ", isPanelDiagnosticEnabled=" + this.i + ", createdAt=" + ((Object) nsa.t(this.j)) + ')';
    }

    public d(Integer num, Integer num2, Set set, Set set2, Set set3, Set set4, Integer num3, Integer num4, Boolean bool, long j) {
        this.a = num;
        this.b = num2;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = set4;
        this.g = num3;
        this.h = num4;
        this.i = bool;
        this.j = j;
    }
}
