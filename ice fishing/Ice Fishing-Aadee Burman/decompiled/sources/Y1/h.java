package Y1;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3908a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3909b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3910c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3911d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3912e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3913f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3914g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3915h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3916j;

    /* renamed from: k, reason: collision with root package name */
    public final String f3917k;

    /* renamed from: l, reason: collision with root package name */
    public final String f3918l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f3908a = num;
        this.f3909b = str;
        this.f3910c = str2;
        this.f3911d = str3;
        this.f3912e = str4;
        this.f3913f = str5;
        this.f3914g = str6;
        this.f3915h = str7;
        this.i = str8;
        this.f3916j = str9;
        this.f3917k = str10;
        this.f3918l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f3908a;
            if (num != null ? num.equals(((h) aVar).f3908a) : ((h) aVar).f3908a == null) {
                String str = this.f3909b;
                if (str != null ? str.equals(((h) aVar).f3909b) : ((h) aVar).f3909b == null) {
                    String str2 = this.f3910c;
                    if (str2 != null ? str2.equals(((h) aVar).f3910c) : ((h) aVar).f3910c == null) {
                        String str3 = this.f3911d;
                        if (str3 != null ? str3.equals(((h) aVar).f3911d) : ((h) aVar).f3911d == null) {
                            String str4 = this.f3912e;
                            if (str4 != null ? str4.equals(((h) aVar).f3912e) : ((h) aVar).f3912e == null) {
                                String str5 = this.f3913f;
                                if (str5 != null ? str5.equals(((h) aVar).f3913f) : ((h) aVar).f3913f == null) {
                                    String str6 = this.f3914g;
                                    if (str6 != null ? str6.equals(((h) aVar).f3914g) : ((h) aVar).f3914g == null) {
                                        String str7 = this.f3915h;
                                        if (str7 != null ? str7.equals(((h) aVar).f3915h) : ((h) aVar).f3915h == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(((h) aVar).i) : ((h) aVar).i == null) {
                                                String str9 = this.f3916j;
                                                if (str9 != null ? str9.equals(((h) aVar).f3916j) : ((h) aVar).f3916j == null) {
                                                    String str10 = this.f3917k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f3917k) : ((h) aVar).f3917k == null) {
                                                        String str11 = this.f3918l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f3918l) : ((h) aVar).f3918l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f3908a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f3909b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f3910c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3911d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3912e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f3913f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f3914g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f3915h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f3916j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f3917k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f3918l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f3908a);
        sb.append(", model=");
        sb.append(this.f3909b);
        sb.append(", hardware=");
        sb.append(this.f3910c);
        sb.append(", device=");
        sb.append(this.f3911d);
        sb.append(", product=");
        sb.append(this.f3912e);
        sb.append(", osBuild=");
        sb.append(this.f3913f);
        sb.append(", manufacturer=");
        sb.append(this.f3914g);
        sb.append(", fingerprint=");
        sb.append(this.f3915h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.f3916j);
        sb.append(", mccMnc=");
        sb.append(this.f3917k);
        sb.append(", applicationBuild=");
        return u1.h.g(sb, this.f3918l, "}");
    }
}
