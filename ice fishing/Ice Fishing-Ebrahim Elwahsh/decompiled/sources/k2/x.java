package k2;

import q2.S;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: b, reason: collision with root package name */
    public static volatile S f38742b;

    /* renamed from: c, reason: collision with root package name */
    public static final L2.d f38743c;

    /* renamed from: d, reason: collision with root package name */
    public static final L2.d[] f38744d;

    static {
        L2.d dVar = new L2.d("additional_video_csi", true, -1, 1L);
        f38743c = dVar;
        f38744d = new L2.d[]{dVar};
    }

    public abstract void onAdFailedToLoad(C4643n c4643n);

    public abstract void onAdLoaded(Object obj);
}
