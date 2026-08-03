package y7;

import a4.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f8796a;

    /* renamed from: b, reason: collision with root package name */
    public int f8797b;

    /* renamed from: c, reason: collision with root package name */
    public String f8798c;

    /* renamed from: d, reason: collision with root package name */
    public String f8799d;

    /* renamed from: e, reason: collision with root package name */
    public Long f8800e;

    /* renamed from: f, reason: collision with root package name */
    public Long f8801f;

    /* renamed from: g, reason: collision with root package name */
    public String f8802g;

    public final b a() {
        String str = this.f8797b == 0 ? " registrationStatus" : "";
        if (this.f8800e == null) {
            str = str.concat(" expiresInSecs");
        }
        if (this.f8801f == null) {
            str = d.i(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b(this.f8796a, this.f8797b, this.f8798c, this.f8799d, this.f8800e.longValue(), this.f8801f.longValue(), this.f8802g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
