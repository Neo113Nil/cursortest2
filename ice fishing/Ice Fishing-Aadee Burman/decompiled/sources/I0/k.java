package I0;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f1265d;

    public k() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f1265d = Pattern.compile("\\A\\d+");
    }

    @Override // I0.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // I0.c
    public final boolean b() {
        int i;
        PackageInfo packageInfo;
        boolean b9 = super.b();
        if (!b9 || (i = Build.VERSION.SDK_INT) >= 29) {
            return b9;
        }
        int i6 = H0.e.f1084a;
        if (i >= 26) {
            packageInfo = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfo = H0.e.b();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo == null) {
            return false;
        }
        Matcher matcher = this.f1265d.matcher(packageInfo.versionName);
        return matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
