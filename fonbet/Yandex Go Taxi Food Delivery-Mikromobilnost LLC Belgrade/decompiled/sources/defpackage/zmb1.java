package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes11.dex */
public final class zmb1 {
    public static final il0 c = new il0("SplitInstallInfoProvider", 1);
    public final Context a;
    public final String b;

    public zmb1(Context context) {
        this.a = context;
        this.b = context.getPackageName();
    }

    public static String b(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean d(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final HashSet e(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        Iterator it = f(packageInfo).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!d(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final HashSet f(PackageInfo packageInfo) {
        HashSet hashSet;
        il0 il0Var = c;
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet2 = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                il0Var.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet2, string.split(",", -1));
                hashSet2.remove("");
                hashSet2.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            il0Var.a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet2, strArr);
        } else {
            il0Var.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        vbb1 vbb1Var = (vbb1) ojb1.a.get();
        if (vbb1Var == null) {
            return hashSet2;
        }
        kst0 kst0Var = vbb1Var.a;
        synchronized (kst0Var.c) {
            hashSet = new HashSet(kst0Var.c);
        }
        hashSet2.addAll(hashSet);
        return hashSet2;
    }

    public final kn81 a(Bundle bundle) {
        kn81 kn81Var = null;
        il0 il0Var = c;
        if (bundle == null) {
            il0Var.e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = bundle.getInt("com.android.vending.splits");
        if (i == 0) {
            il0Var.e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            XmlResourceParser xml = this.a.getResources().getXml(i);
            caa1 caa1Var = new caa1();
            while (xml.next() != 1) {
                try {
                    if (xml.getEventType() == 2) {
                        if (xml.getName().equals("splits")) {
                            while (xml.next() != 3) {
                                if (xml.getEventType() == 2) {
                                    if (xml.getName().equals("module")) {
                                        String e = cra1.e("name", xml);
                                        if (e != null) {
                                            while (xml.next() != 3) {
                                                if (xml.getEventType() == 2) {
                                                    if (xml.getName().equals("language")) {
                                                        while (xml.next() != 3) {
                                                            if (xml.getEventType() == 2) {
                                                                if (xml.getName().equals("entry")) {
                                                                    String e2 = cra1.e("key", xml);
                                                                    String e3 = cra1.e("split", xml);
                                                                    cra1.f(xml);
                                                                    if (e2 != null && e3 != null) {
                                                                        caa1Var.a(e, e2, e3);
                                                                    }
                                                                } else {
                                                                    cra1.f(xml);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cra1.f(xml);
                                                    }
                                                }
                                            }
                                        } else {
                                            cra1.f(xml);
                                        }
                                    } else {
                                        cra1.f(xml);
                                    }
                                }
                            }
                        } else {
                            cra1.f(xml);
                        }
                    }
                } catch (IOException | IllegalStateException | XmlPullParserException e4) {
                    Log.e("SplitInstall", "Error while parsing splits.xml", e4);
                }
            }
            kn81Var = caa1Var.b();
            if (kn81Var == null) {
                il0Var.e("Can't parse languages metadata.", new Object[0]);
            }
            return kn81Var;
        } catch (Resources.NotFoundException unused) {
            il0Var.e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final HashSet c() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.a.getPackageManager().getPackageInfo(this.b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            c.b("App is not found in PackageManager", new Object[0]);
            packageInfo = null;
        }
        return (packageInfo == null || packageInfo.applicationInfo == null) ? new HashSet() : e(packageInfo);
    }
}
