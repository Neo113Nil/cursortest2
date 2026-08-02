package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.AbrPreferences;

/* loaded from: classes6.dex */
public final class l0l extends n0l {
    public final String a;
    public final Long b;
    public final Integer c;
    public final boolean d;
    public final String e;
    public final VideoData f;
    public final String g;
    public final AbrPreferences h;
    public final Integer i;

    public l0l(Integer num, Integer num2, Long l, String str, String str2, String str3, VideoData videoData, AbrPreferences abrPreferences, boolean z) {
        this.a = str;
        this.b = l;
        this.c = num;
        this.d = z;
        this.e = str2;
        this.f = videoData;
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
        return this.e;
    }

    @Override // defpackage.n0l
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.n0l
    public final String d() {
        return this.a;
    }

    @Override // defpackage.n0l
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0l)) {
            return false;
        }
        l0l l0lVar = (l0l) obj;
        return this.a.equals(l0lVar.a) && Intrinsics.d(this.b, l0lVar.b) && Intrinsics.d(this.c, l0lVar.c) && this.d == l0lVar.d && Intrinsics.d(this.e, l0lVar.e) && Intrinsics.d(this.f, l0lVar.f) && Intrinsics.d(this.g, l0lVar.g) && Intrinsics.d(this.h, l0lVar.h) && Intrinsics.d(this.i, l0lVar.i);
    }

    @Override // defpackage.n0l
    public final Integer f() {
        return this.c;
    }

    @Override // defpackage.n0l
    public final Long g() {
        return this.b;
    }

    @Override // defpackage.n0l
    public final Integer h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.c;
        int e = k5r.e((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode3 = (e + (str == null ? 0 : str.hashCode())) * 31;
        VideoData videoData = this.f;
        int hashCode4 = (hashCode3 + (videoData == null ? 0 : videoData.hashCode())) * 31;
        String str2 = this.g;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AbrPreferences abrPreferences = this.h;
        int hashCode6 = (hashCode5 + (abrPreferences == null ? 0 : abrPreferences.hashCode())) * 31;
        Integer num2 = this.i;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // defpackage.n0l
    public final VideoData i() {
        return this.f;
    }

    public final String toString() {
        return "ContentIdPlaybackOptions(contentId=" + this.a + ", startPosition=" + this.b + ", prepareIndex=" + this.c + ", autoPlay=" + this.d + ", adContentId=" + this.e + ", videoData=" + this.f + ", expandedManifestUrl=" + this.g + ", abrPreferences=" + this.h + ", startQualityConstraint=" + this.i + ')';
    }
}
