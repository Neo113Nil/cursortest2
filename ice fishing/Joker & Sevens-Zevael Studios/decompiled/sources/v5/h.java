package v5;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f7262a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7263b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7264c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7265d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7266e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7267f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7268g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7269h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7270i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7271j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7272k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7273l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f7262a = num;
        this.f7263b = str;
        this.f7264c = str2;
        this.f7265d = str3;
        this.f7266e = str4;
        this.f7267f = str5;
        this.f7268g = str6;
        this.f7269h = str7;
        this.f7270i = str8;
        this.f7271j = str9;
        this.f7272k = str10;
        this.f7273l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f7262a;
            if (num != null ? num.equals(((h) aVar).f7262a) : ((h) aVar).f7262a == null) {
                String str = this.f7263b;
                if (str != null ? str.equals(((h) aVar).f7263b) : ((h) aVar).f7263b == null) {
                    String str2 = this.f7264c;
                    if (str2 != null ? str2.equals(((h) aVar).f7264c) : ((h) aVar).f7264c == null) {
                        String str3 = this.f7265d;
                        if (str3 != null ? str3.equals(((h) aVar).f7265d) : ((h) aVar).f7265d == null) {
                            String str4 = this.f7266e;
                            if (str4 != null ? str4.equals(((h) aVar).f7266e) : ((h) aVar).f7266e == null) {
                                String str5 = this.f7267f;
                                if (str5 != null ? str5.equals(((h) aVar).f7267f) : ((h) aVar).f7267f == null) {
                                    String str6 = this.f7268g;
                                    if (str6 != null ? str6.equals(((h) aVar).f7268g) : ((h) aVar).f7268g == null) {
                                        String str7 = this.f7269h;
                                        if (str7 != null ? str7.equals(((h) aVar).f7269h) : ((h) aVar).f7269h == null) {
                                            String str8 = this.f7270i;
                                            if (str8 != null ? str8.equals(((h) aVar).f7270i) : ((h) aVar).f7270i == null) {
                                                String str9 = this.f7271j;
                                                if (str9 != null ? str9.equals(((h) aVar).f7271j) : ((h) aVar).f7271j == null) {
                                                    String str10 = this.f7272k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f7272k) : ((h) aVar).f7272k == null) {
                                                        String str11 = this.f7273l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f7273l) : ((h) aVar).f7273l == null) {
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
        Integer num = this.f7262a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f7263b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f7264c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7265d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f7266e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f7267f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f7268g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f7269h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f7270i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f7271j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f7272k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f7273l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f7262a + ", model=" + this.f7263b + ", hardware=" + this.f7264c + ", device=" + this.f7265d + ", product=" + this.f7266e + ", osBuild=" + this.f7267f + ", manufacturer=" + this.f7268g + ", fingerprint=" + this.f7269h + ", locale=" + this.f7270i + ", country=" + this.f7271j + ", mccMnc=" + this.f7272k + ", applicationBuild=" + this.f7273l + "}";
    }
}
