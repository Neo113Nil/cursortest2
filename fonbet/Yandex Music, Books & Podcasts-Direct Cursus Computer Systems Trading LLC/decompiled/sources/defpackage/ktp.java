package defpackage;

/* loaded from: classes4.dex */
public final class ktp {
    public volatile float a;
    public volatile float b;
    public volatile float c;

    public ktp(int i) {
        float f = (i & 4) != 0 ? 0.0f : 0.75f;
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = f;
    }
}
