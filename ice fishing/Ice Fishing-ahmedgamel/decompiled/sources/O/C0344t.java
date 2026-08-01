package O;

import android.view.View;
import com.google.android.gms.internal.ads.D8;
import java.util.Objects;
import t0.AbstractC5003S;

/* renamed from: O.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344t {

    /* renamed from: a, reason: collision with root package name */
    public int f2133a;

    /* renamed from: b, reason: collision with root package name */
    public int f2134b;

    public C0344t(int i, int i6) {
        this.f2133a = i;
        this.f2134b = i6;
    }

    public void a(AbstractC5003S abstractC5003S) {
        View view = abstractC5003S.f40593a;
        this.f2133a = view.getLeft();
        this.f2134b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public C0344t(D8 d82, int i, int i6) {
        Objects.requireNonNull(d82);
        this.f2133a = i;
        this.f2134b = i6;
    }
}
