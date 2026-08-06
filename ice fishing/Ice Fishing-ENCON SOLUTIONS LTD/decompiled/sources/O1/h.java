package O1;

import J1.t;
import P0.AbstractActivityC0072e;
import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1247a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f1248b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1249c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1250d;

    public h(t tVar, int i2, String str) {
        this.f1249c = tVar;
        this.f1248b = i2;
        this.f1250d = str;
    }

    public int a() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        AbstractActivityC0072e abstractActivityC0072e = (AbstractActivityC0072e) this.f1249c;
        int i2 = this.f1248b;
        View findViewById = abstractActivityC0072e.findViewById(i2);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i2 + "not found");
    }

    public void b(int i2) {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        AbstractActivityC0072e abstractActivityC0072e = (AbstractActivityC0072e) this.f1249c;
        int i3 = this.f1248b;
        View findViewById = abstractActivityC0072e.findViewById(i3);
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

    public String toString() {
        switch (this.f1247a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                if (((t) this.f1249c) == t.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f1248b);
                sb.append(' ');
                sb.append((String) this.f1250d);
                String sb2 = sb.toString();
                i.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public h(int i2, AbstractActivityC0072e abstractActivityC0072e, Z0.i iVar) {
        this.f1249c = abstractActivityC0072e;
        this.f1248b = i2;
        this.f1250d = iVar;
        iVar.f1992b = this;
    }
}
