package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.internal.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes11.dex */
public final class x891 {
    public static final il0 c = new il0("SplitInstallService", 1);
    public static final Intent d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    public final String a;
    public final c b;

    public x891(Context context, String str) {
        String str2;
        this.a = str;
        il0 il0Var = db91.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    db91.a.e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance(JCP.DIGEST_SHA_256);
                        messageDigest.update(byteArray);
                        str2 = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        str2 = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str2)) {
                        String str3 = Build.TAGS;
                        if ((!str3.contains("dev-keys") && !str3.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str2)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.b = new c(applicationContext != null ? applicationContext : context, c, d);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Bundle a(c3b1 c3b1Var) {
        Bundle c2 = c();
        ArrayList arrayList = new ArrayList();
        Iterator it = c3b1Var.a.iterator();
        while (it.hasNext()) {
            wbb1 wbb1Var = (wbb1) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", wbb1Var.a());
            bundle.putLong("event_timestamp", wbb1Var.b());
            arrayList.add(bundle);
        }
        c2.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList));
        return c2;
    }

    public static /* bridge */ /* synthetic */ ArrayList b(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        return bundle;
    }

    public static zzw d() {
        c.b("onError(%d)", -14);
        return udq0.o(new SplitInstallException(-14));
    }
}
