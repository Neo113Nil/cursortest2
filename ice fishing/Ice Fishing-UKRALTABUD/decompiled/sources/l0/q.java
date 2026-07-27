package l0;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f2757a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2758b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2759c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2760d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2761e;

    public q(String str, int i2, int i3, int i4, int i5) {
        if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i2 + ", " + i3 + ")");
        }
        if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i4 > i5)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i4 + ", " + i5 + ")");
        }
        if (i5 > str.length()) {
            throw new IndexOutOfBoundsException(E0.h.e("invalid composing start: ", i4));
        }
        if (i2 > str.length()) {
            throw new IndexOutOfBoundsException(E0.h.e("invalid selection start: ", i2));
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException(E0.h.e("invalid selection end: ", i3));
        }
        this.f2757a = str;
        this.f2758b = i2;
        this.f2759c = i3;
        this.f2760d = i4;
        this.f2761e = i5;
    }

    public static q a(JSONObject jSONObject) {
        return new q(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
