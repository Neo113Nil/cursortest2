package w1;

import java.security.MessageDigest;

/* renamed from: w1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5147e implements O1.b {

    /* renamed from: n, reason: collision with root package name */
    public final MessageDigest f41654n;

    /* renamed from: u, reason: collision with root package name */
    public final O1.e f41655u = new O1.e();

    public C5147e(MessageDigest messageDigest) {
        this.f41654n = messageDigest;
    }

    @Override // O1.b
    public final O1.e b() {
        return this.f41655u;
    }
}
