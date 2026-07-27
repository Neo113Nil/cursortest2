package q0;

import android.os.Build;
import android.view.View;
import c0.AbstractActivityC0104f;
import l0.C0200c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0104f f2819a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2820b;

    /* renamed from: c, reason: collision with root package name */
    public final C0200c f2821c;

    public a(int i2, AbstractActivityC0104f abstractActivityC0104f, C0200c c0200c) {
        this.f2819a = abstractActivityC0104f;
        this.f2820b = i2;
        this.f2821c = c0200c;
        c0200c.f2689g = this;
    }

    public final int a() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        AbstractActivityC0104f abstractActivityC0104f = this.f2819a;
        int i2 = this.f2820b;
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
        AbstractActivityC0104f abstractActivityC0104f = this.f2819a;
        int i3 = this.f2820b;
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
