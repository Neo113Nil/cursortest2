package com.plaid.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.util.Base64;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.plaid.internal.C0095a6;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0161f {
    public ArrayList<String> a;

    /* renamed from: com.plaid.internal.f$a */
    public static final class a {
        public static String a(String str, String str2) {
            String m = Recorder$$ExternalSyntheticOutline2.m(str, " ", str2);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                byte[] bytes = m.getBytes(charset);
                bytes.getClass();
                messageDigest.update(bytes);
                String encodeToString = Base64.encodeToString(Arrays.copyOfRange(messageDigest.digest(), 0, 9), 3);
                encodeToString.getClass();
                return encodeToString.substring(0, 11);
            } catch (NoSuchAlgorithmException e) {
                C0095a6.a.b(C0095a6.a, "hash:NoSuchAlgorithm", new Object[]{e});
                return null;
            }
        }
    }

    public final String a(Application application) {
        application.getClass();
        if (this.a == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                String packageName = application.getPackageName();
                SigningInfo signingInfo = application.getPackageManager().getPackageInfo(packageName, 134217728).signingInfo;
                Signature[] apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
                if (apkContentsSigners != null) {
                    int i = 0;
                    while (true) {
                        if (!(i < apkContentsSigners.length)) {
                            break;
                        }
                        int i2 = i + 1;
                        try {
                            Signature signature = apkContentsSigners[i];
                            packageName.getClass();
                            String charsString = signature.toCharsString();
                            charsString.getClass();
                            String a2 = a.a(packageName, charsString);
                            if (a2 != null) {
                                arrayList.add(String.format("%s", Arrays.copyOf(new Object[]{a2}, 1)));
                            }
                            i = i2;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                }
                this.a = arrayList;
            } catch (PackageManager.NameNotFoundException e2) {
                C0095a6.a.getClass();
                C0095a6.b.a("Unable to find package to obtain hash.", new Object[]{new Object[]{e2}}, true);
            }
        }
        ArrayList<String> arrayList2 = this.a;
        if (arrayList2 != null) {
            return (String) CollectionsKt.firstOrNull((List) arrayList2);
        }
        Intrinsics.throwUninitializedPropertyAccessException("appSignatures");
        throw null;
    }
}
