package i8;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final Q7.i f38167b = new Q7.i("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Q7.i f38168c = new Q7.i(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f38169a;

    public p(String mediaType, String str, String str2, String[] parameterNamesAndValues) {
        kotlin.jvm.internal.h.e(mediaType, "mediaType");
        kotlin.jvm.internal.h.e(parameterNamesAndValues, "parameterNamesAndValues");
        this.f38169a = mediaType;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && kotlin.jvm.internal.h.a(((p) obj).f38169a, this.f38169a);
    }

    public final int hashCode() {
        return this.f38169a.hashCode();
    }

    public final String toString() {
        return this.f38169a;
    }
}
