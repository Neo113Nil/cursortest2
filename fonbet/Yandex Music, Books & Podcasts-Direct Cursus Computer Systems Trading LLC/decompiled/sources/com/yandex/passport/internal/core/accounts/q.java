package com.yandex.passport.internal.core.accounts;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import defpackage.c5b;
import defpackage.jp0;
import defpackage.my1;
import defpackage.s9f;
import defpackage.tz0;
import defpackage.uz0;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class q {
    public static final Charset c = Charsets.UTF_8;
    public final Context a;
    public final com.yandex.passport.internal.storage.m b;

    public q(Context context, com.yandex.passport.internal.storage.m mVar) {
        context.getClass();
        mVar.getClass();
        this.a = context;
        this.b = mVar;
    }

    public static byte[] e(byte[] bArr) {
        Collection tz0Var;
        if (bArr.length == 0) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "validateCheckSum failed: input empty", 8);
            }
            throw new my1(16);
        }
        IntRange intRange = new IntRange(0, bArr.length - 2, 1);
        if (intRange.isEmpty()) {
            tz0Var = c5b.a;
        } else {
            byte[] j = uz0.j(bArr, 0, intRange.b + 1);
            j.getClass();
            tz0Var = new tz0(0, j);
        }
        Collection collection = tz0Var;
        collection.getClass();
        int size = collection.size();
        byte[] bArr2 = new byte[size];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr2[i] = ((Number) it.next()).byteValue();
            i++;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += bArr2[i3] & 255;
        }
        if (((byte) i2) == bArr[bArr.length - 1]) {
            return bArr2;
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "validateCheckSum failed: checksum mismatch", 8);
        }
        throw new my1(16);
    }

    public final com.yandex.passport.common.network.n a(String str) {
        Object obj = null;
        if (c()) {
            return new com.yandex.passport.common.network.n(4, str, obj);
        }
        if (str == null) {
            return new com.yandex.passport.common.network.n(4, str, obj);
        }
        try {
            byte[] decode = Base64.decode(str, 2);
            decode.getClass();
            try {
                com.yandex.passport.common.network.n d = d();
                Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
                cipher.init(2, (SecretKeySpec) d.b, (IvParameterSpec) d.c);
                byte[] doFinal = cipher.doFinal(decode);
                doFinal.getClass();
                return new com.yandex.passport.common.network.n(4, new String(e(doFinal), c), obj);
            } catch (Exception e) {
                return new com.yandex.passport.common.network.n(4, "-", e);
            }
        } catch (IllegalArgumentException e2) {
            return new com.yandex.passport.common.network.n(4, str, e2);
        }
    }

    public final String b(String str) {
        if (c() || str == null) {
            return str;
        }
        byte[] bytes = str.getBytes(c);
        bytes.getClass();
        int i = 0;
        for (byte b : bytes) {
            i += b & 255;
        }
        int length = bytes.length;
        byte[] copyOf = Arrays.copyOf(bytes, length + 1);
        copyOf[length] = (byte) i;
        com.yandex.passport.common.network.n d = d();
        Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
        cipher.init(1, (SecretKeySpec) d.b, (IvParameterSpec) d.c);
        byte[] doFinal = cipher.doFinal(copyOf);
        doFinal.getClass();
        String encodeToString = Base64.encodeToString(doFinal, 2);
        encodeToString.getClass();
        return encodeToString;
    }

    public final boolean c() {
        byte[] bArr = com.yandex.passport.internal.entities.s.c;
        Context context = this.a;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        String packageName = context.getPackageName();
        packageName.getClass();
        com.yandex.passport.internal.entities.s B = com.yandex.plus.core.network.api.utils.a.B(packageManager, packageName);
        PackageManager packageManager2 = context.getPackageManager();
        packageManager2.getClass();
        String packageName2 = context.getPackageName();
        packageName2.getClass();
        return B.e(com.yandex.plus.core.network.api.utils.a.B(packageManager2, packageName2));
    }

    public final com.yandex.passport.common.network.n d() {
        com.yandex.passport.internal.storage.m mVar = this.b;
        jp0 jp0Var = mVar.j;
        s9f[] s9fVarArr = com.yandex.passport.internal.storage.m.m;
        String str = (String) jp0Var.getValue(mVar, s9fVarArr[8]);
        if (str != null) {
            byte[] decode = Base64.decode(str, 2);
            decode.getClass();
            return new com.yandex.passport.common.network.n(decode);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128, SecureRandom.getInstance("SHA1PRNG"));
        byte[] encoded = keyGenerator.generateKey().getEncoded();
        encoded.getClass();
        byte[] bArr = new byte[16];
        SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        int length = encoded.length;
        byte[] copyOf = Arrays.copyOf(encoded, length + 16);
        System.arraycopy(bArr, 0, copyOf, length, 16);
        String encodeToString = Base64.encodeToString(copyOf, 2);
        encodeToString.getClass();
        mVar.j.setValue(mVar, s9fVarArr[8], encodeToString);
        return new com.yandex.passport.common.network.n(copyOf);
    }
}
