package d3;

import L3.v;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final v f37038a = new v();

    public static boolean a(Context context) {
        Signature[] signatureArr;
        String str;
        v vVar = f37038a;
        try {
        } catch (PackageManager.NameNotFoundException unused) {
            vVar.a("Play Store package is not found.");
        }
        if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
            vVar.a("Play Store package is disabled.");
            return false;
        }
        try {
            signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
        } catch (PackageManager.NameNotFoundException unused2) {
            vVar.a("Play Store package is not found.");
        }
        if (signatureArr == null || (signatureArr.length) == 0) {
            vVar.a("Play Store package is not signed -- possibly self-built package. Could not verify.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            byte[] byteArray = signature.toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(byteArray);
                str = Base64.encodeToString(messageDigest.digest(), 11);
            } catch (NoSuchAlgorithmException unused3) {
                str = "";
            }
            arrayList.add(str);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                return true;
            }
            String str2 = Build.TAGS;
            if ((str2.contains("dev-keys") || str2.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ", ");
            }
        }
        vVar.a("Play Store package certs are not valid. Found these sha256 certs: [" + sb.toString() + "].");
        return false;
    }
}
