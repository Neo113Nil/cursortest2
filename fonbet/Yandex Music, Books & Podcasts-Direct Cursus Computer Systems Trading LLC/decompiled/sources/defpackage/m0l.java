package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.AbrPreferences;

/* loaded from: classes6.dex */
public final class m0l extends n0l {
    public final VideoData a;
    public final String b;
    public final Long c;
    public final Integer d;
    public final boolean e;
    public final String f;
    public final String g;
    public final AbrPreferences h;
    public final Integer i;

    public m0l(Integer num, Integer num2, Long l, String str, String str2, String str3, VideoData videoData, AbrPreferences abrPreferences, boolean z) {
        this.a = videoData;
        this.b = str;
        this.c = l;
        this.d = num;
        this.e = z;
        this.f = str2;
        this.g = str3;
        this.h = abrPreferences;
        this.i = num2;
    }

    @Override // defpackage.n0l
    public final AbrPreferences a() {
        return this.h;
    }

    @Override // defpackage.n0l
    public final String b() {
        return this.f;
    }

    @Override // defpackage.n0l
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.n0l
    public final String d() {
        return this.b;
    }

    @Override // defpackage.n0l
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0l)) {
            return false;
        }
        m0l m0lVar = (m0l) obj;
        return this.a.equals(m0lVar.a) && Intrinsics.d(this.b, m0lVar.b) && Intrinsics.d(this.c, m0lVar.c) && Intrinsics.d(this.d, m0lVar.d) && this.e == m0lVar.e && Intrinsics.d(this.f, m0lVar.f) && Intrinsics.d(this.g, m0lVar.g) && Intrinsics.d(this.h, m0lVar.h) && Intrinsics.d(this.i, m0lVar.i);
    }

    @Override // defpackage.n0l
    public final Integer f() {
        return this.d;
    }

    @Override // defpackage.n0l
    public final Long g() {
        return this.c;
    }

    @Override // defpackage.n0l
    public final Integer h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.d;
        int e = k5r.e((hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int hashCode4 = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AbrPreferences abrPreferences = this.h;
        int hashCode6 = (hashCode5 + (abrPreferences == null ? 0 : abrPreferences.hashCode())) * 31;
        Integer num2 = this.i;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // defpackage.n0l
    public final VideoData i() {
        return this.a;
    }

    public final String toString() {
        return "DirectSourcePlaybackOptions(videoData=" + this.a + ", contentId=" + this.b + ", startPosition=" + this.c + ", prepareIndex=" + this.d + ", autoPlay=" + this.e + ", adContentId=" + this.f + ", expandedManifestUrl=" + this.g + ", abrPreferences=" + this.h + ", startQualityConstraint=" + this.i + ')';
    }
}
