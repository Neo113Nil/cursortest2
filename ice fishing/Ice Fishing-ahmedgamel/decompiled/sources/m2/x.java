package m2;

import s2.S;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: b, reason: collision with root package name */
    public static volatile S f39411b;

    /* renamed from: c, reason: collision with root package name */
    public static final O2.d f39412c;

    /* renamed from: d, reason: collision with root package name */
    public static final O2.d[] f39413d;

    static {
        O2.d dVar = new O2.d("additional_video_csi", true, -1, 1L);
        f39412c = dVar;
        f39413d = new O2.d[]{dVar};
    }

    public abstract void onAdFailedToLoad(n nVar);

    public abstract void onAdLoaded(Object obj);
}
