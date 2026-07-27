package q0;

import android.os.Build;
import android.view.View;
import c0.AbstractActivityC0104f;
import l0.C0200c;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228a {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0104f f2827a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2828b;

    /* renamed from: c, reason: collision with root package name */
    public final C0200c f2829c;

    public C0228a(int i2, AbstractActivityC0104f abstractActivityC0104f, C0200c c0200c) {
        this.f2827a = abstractActivityC0104f;
        this.f2828b = i2;
        this.f2829c = c0200c;
        c0200c.f2697f = this;
    }

    public final int a() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        AbstractActivityC0104f abstractActivityC0104f = this.f2827a;
        int i2 = this.f2828b;
        View findViewById = abstractActivityC0104f.findViewById(i2);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i2 + "not found");
    }

    public final void b(int i2) {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        AbstractActivityC0104f abstractActivityC0104f = this.f2827a;
        int i3 = this.f2828b;
        View findViewById = abstractActivityC0104f.findViewById(i3);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i3 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i2) {
            return;
        }
        findViewById.setContentSensitivity(i2);
        findViewById.invalidate();
    }
}
