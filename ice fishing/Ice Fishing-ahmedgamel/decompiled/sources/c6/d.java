package c6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: u, reason: collision with root package name */
    public static final d f5578u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f5579v;

    /* renamed from: w, reason: collision with root package name */
    public static final d f5580w;

    /* renamed from: x, reason: collision with root package name */
    public static final d f5581x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ d[] f5582y;

    /* renamed from: n, reason: collision with root package name */
    public final int f5583n;

    static {
        d dVar = new d("VARINT", 0, 0);
        f5578u = dVar;
        d dVar2 = new d("FIXED64", 1, 1);
        f5579v = dVar2;
        d dVar3 = new d("LENGTH_DELIMITED", 2, 2);
        f5580w = dVar3;
        d dVar4 = new d("FIXED32", 3, 5);
        f5581x = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f5582y = dVarArr;
        com.bumptech.glide.e.b(dVarArr);
    }

    public d(String str, int i, int i6) {
        this.f5583n = i6;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5582y.clone();
    }

    public final i a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return i.f5594k;
        }
        if (ordinal == 1) {
            return i.f5595l;
        }
        if (ordinal == 2) {
            return i.f5597n;
        }
        if (ordinal == 3) {
            return i.i;
        }
        throw new B0.c();
    }
}
