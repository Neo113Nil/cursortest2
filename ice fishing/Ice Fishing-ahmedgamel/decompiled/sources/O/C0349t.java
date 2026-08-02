package O;

import android.view.View;
import com.google.android.gms.internal.ads.D8;
import java.util.Objects;
import t0.AbstractC5000P;

/* renamed from: O.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349t {

    /* renamed from: a, reason: collision with root package name */
    public int f2221a;

    /* renamed from: b, reason: collision with root package name */
    public int f2222b;

    public C0349t(int i, int i4) {
        this.f2221a = i;
        this.f2222b = i4;
    }

    public void a(AbstractC5000P abstractC5000P) {
        View view = abstractC5000P.f40643a;
        this.f2221a = view.getLeft();
        this.f2222b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public C0349t(D8 d82, int i, int i4) {
        Objects.requireNonNull(d82);
        this.f2221a = i;
        this.f2222b = i4;
    }
}
