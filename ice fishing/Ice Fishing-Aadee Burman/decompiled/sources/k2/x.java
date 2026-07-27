package k2;

import q2.S;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: b, reason: collision with root package name */
    public static volatile S f38622b;

    /* renamed from: c, reason: collision with root package name */
    public static final M2.d f38623c;

    /* renamed from: d, reason: collision with root package name */
    public static final M2.d[] f38624d;

    static {
        M2.d dVar = new M2.d("additional_video_csi", true, -1, 1L);
        f38623c = dVar;
        f38624d = new M2.d[]{dVar};
    }

    public abstract void onAdFailedToLoad(n nVar);

    public abstract void onAdLoaded(Object obj);
}
