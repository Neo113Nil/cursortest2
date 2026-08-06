package o;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996a {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f8218a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f8219b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8220c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8221d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8222e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f8223f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f8224g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0996a(String str, PendingIntent pendingIntent) {
        IconCompat b2 = IconCompat.b(2131165278);
        Bundle bundle = new Bundle();
        this.f8221d = true;
        this.f8219b = b2;
        int i2 = b2.f2260a;
        if (i2 == -1) {
            int i3 = Build.VERSION.SDK_INT;
            Object obj = b2.f2261b;
            if (i3 >= 28) {
                i2 = s.d.c(obj);
            } else {
                try {
                    i2 = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                } catch (IllegalAccessException e2) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                    i2 = -1;
                    if (i2 == 2) {
                    }
                    this.f8223f = c.a(str);
                    this.f8224g = pendingIntent;
                    this.f8218a = bundle;
                    this.f8220c = true;
                    this.f8221d = true;
                } catch (NoSuchMethodException e3) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                    i2 = -1;
                    if (i2 == 2) {
                    }
                    this.f8223f = c.a(str);
                    this.f8224g = pendingIntent;
                    this.f8218a = bundle;
                    this.f8220c = true;
                    this.f8221d = true;
                } catch (InvocationTargetException e4) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                    i2 = -1;
                    if (i2 == 2) {
                    }
                    this.f8223f = c.a(str);
                    this.f8224g = pendingIntent;
                    this.f8218a = bundle;
                    this.f8220c = true;
                    this.f8221d = true;
                }
            }
        }
        if (i2 == 2) {
            this.f8222e = b2.c();
        }
        this.f8223f = c.a(str);
        this.f8224g = pendingIntent;
        this.f8218a = bundle;
        this.f8220c = true;
        this.f8221d = true;
    }
}
