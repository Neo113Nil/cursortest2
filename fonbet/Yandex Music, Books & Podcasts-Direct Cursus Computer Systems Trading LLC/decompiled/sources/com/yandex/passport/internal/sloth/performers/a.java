package com.yandex.passport.internal.sloth.performers;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.yandex.passport.sloth.command.t;
import com.yandex.passport.sloth.command.w;
import defpackage.hrg;
import defpackage.l2b;
import defpackage.su4;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class a implements t {
    public final Context a;

    public a(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // com.yandex.passport.sloth.command.t
    public final Object q(com.yandex.passport.sloth.data.m mVar, Object obj, com.yandex.passport.sloth.command.f fVar) {
        String p;
        Context context = this.a;
        try {
            String packageName = context.getPackageName();
            packageName.getClass();
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, Build.VERSION.SDK_INT >= 28 ? 134217728 : 64);
            packageInfo.getClass();
            Signature[] c = com.yandex.passport.common.util.a.c(packageInfo);
            c.getClass();
            String charsString = c[0].toCharsString();
            charsString.getClass();
            String l = hrg.l(' ', packageName, charsString);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = l.getBytes(charset);
            bytes.getClass();
            messageDigest.update(bytes);
            String encodeToString = Base64.encodeToString(Arrays.copyOfRange(messageDigest.digest(), 0, 9), 3);
            encodeToString.getClass();
            p = encodeToString.substring(0, 11);
        } catch (Throwable th) {
            p = su4.p(th, new StringBuilder("Error: "));
        }
        return new l2b(new w(p));
    }
}
