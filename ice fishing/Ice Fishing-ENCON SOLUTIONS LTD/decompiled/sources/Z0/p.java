package Z0;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f2023a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2024b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2025c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2026d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2027e;

    public p(String str, int i2, int i3, int i4, int i5) {
        if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i2 + ", " + i3 + ")");
        }
        if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i4 > i5)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i4 + ", " + i5 + ")");
        }
        if (i5 > str.length()) {
            throw new IndexOutOfBoundsException(C1.a.f(i4, "invalid composing start: "));
        }
        if (i2 > str.length()) {
            throw new IndexOutOfBoundsException(C1.a.f(i2, "invalid selection start: "));
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException(C1.a.f(i3, "invalid selection end: "));
        }
        this.f2023a = str;
        this.f2024b = i2;
        this.f2025c = i3;
        this.f2026d = i4;
        this.f2027e = i5;
    }

    public static p a(JSONObject jSONObject) {
        return new p(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
