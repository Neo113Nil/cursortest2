package a2;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class h extends AbstractC0429a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f4261a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4262b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4263c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4264d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4265e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4266f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4267g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4268h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4269j;

    /* renamed from: k, reason: collision with root package name */
    public final String f4270k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4271l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f4261a = num;
        this.f4262b = str;
        this.f4263c = str2;
        this.f4264d = str3;
        this.f4265e = str4;
        this.f4266f = str5;
        this.f4267g = str6;
        this.f4268h = str7;
        this.i = str8;
        this.f4269j = str9;
        this.f4270k = str10;
        this.f4271l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0429a) {
            AbstractC0429a abstractC0429a = (AbstractC0429a) obj;
            Integer num = this.f4261a;
            if (num != null ? num.equals(((h) abstractC0429a).f4261a) : ((h) abstractC0429a).f4261a == null) {
                String str = this.f4262b;
                if (str != null ? str.equals(((h) abstractC0429a).f4262b) : ((h) abstractC0429a).f4262b == null) {
                    String str2 = this.f4263c;
                    if (str2 != null ? str2.equals(((h) abstractC0429a).f4263c) : ((h) abstractC0429a).f4263c == null) {
                        String str3 = this.f4264d;
                        if (str3 != null ? str3.equals(((h) abstractC0429a).f4264d) : ((h) abstractC0429a).f4264d == null) {
                            String str4 = this.f4265e;
                            if (str4 != null ? str4.equals(((h) abstractC0429a).f4265e) : ((h) abstractC0429a).f4265e == null) {
                                String str5 = this.f4266f;
                                if (str5 != null ? str5.equals(((h) abstractC0429a).f4266f) : ((h) abstractC0429a).f4266f == null) {
                                    String str6 = this.f4267g;
                                    if (str6 != null ? str6.equals(((h) abstractC0429a).f4267g) : ((h) abstractC0429a).f4267g == null) {
                                        String str7 = this.f4268h;
                                        if (str7 != null ? str7.equals(((h) abstractC0429a).f4268h) : ((h) abstractC0429a).f4268h == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(((h) abstractC0429a).i) : ((h) abstractC0429a).i == null) {
                                                String str9 = this.f4269j;
                                                if (str9 != null ? str9.equals(((h) abstractC0429a).f4269j) : ((h) abstractC0429a).f4269j == null) {
                                                    String str10 = this.f4270k;
                                                    if (str10 != null ? str10.equals(((h) abstractC0429a).f4270k) : ((h) abstractC0429a).f4270k == null) {
                                                        String str11 = this.f4271l;
                                                        if (str11 != null ? str11.equals(((h) abstractC0429a).f4271l) : ((h) abstractC0429a).f4271l == null) {
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
        Integer num = this.f4261a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f4262b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f4263c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4264d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f4265e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f4266f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f4267g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f4268h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f4269j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f4270k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f4271l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f4261a);
        sb.append(", model=");
        sb.append(this.f4262b);
        sb.append(", hardware=");
        sb.append(this.f4263c);
        sb.append(", device=");
        sb.append(this.f4264d);
        sb.append(", product=");
        sb.append(this.f4265e);
        sb.append(", osBuild=");
        sb.append(this.f4266f);
        sb.append(", manufacturer=");
        sb.append(this.f4267g);
        sb.append(", fingerprint=");
        sb.append(this.f4268h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.f4269j);
        sb.append(", mccMnc=");
        sb.append(this.f4270k);
        sb.append(", applicationBuild=");
        return Wv.i(sb, this.f4271l, "}");
    }
}
