package O;

import android.view.View;
import com.google.android.gms.internal.ads.C4264z8;
import java.util.Objects;
import t0.AbstractC5032P;

/* renamed from: O.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357t {

    /* renamed from: a, reason: collision with root package name */
    public int f2319a;

    /* renamed from: b, reason: collision with root package name */
    public int f2320b;

    public C0357t(int i, int i4) {
        this.f2319a = i;
        this.f2320b = i4;
    }

    public void a(AbstractC5032P abstractC5032P) {
        View view = abstractC5032P.f40615a;
        this.f2319a = view.getLeft();
        this.f2320b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public C0357t(C4264z8 c4264z8, int i, int i4) {
        Objects.requireNonNull(c4264z8);
        this.f2319a = i;
        this.f2320b = i4;
    }
}
