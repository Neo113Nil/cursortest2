package defpackage;

import android.os.Build;
import android.util.Base64;
import android.widget.EdgeEffect;
import com.yandex.go.payments.common.PreferancesExtenstionsKt$listenKeyState$$inlined$simpleCallbackApiToFlow$1;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes11.dex */
public abstract class u3a1 {
    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(JCP.DIGEST_SHA_256);
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2, fwi fwiVar) {
        float f3 = kkn.a;
        double density = fwiVar.getDensity() * 386.0878f * 160.0f * 0.84f;
        double d = kkn.a * density;
        float exp = (float) (Math.exp((kkn.b / kkn.c) * Math.log((Math.abs(f) * 0.35f) / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (exp > (i >= 31 ? vm2.e(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int b = m810.b(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(b);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(b);
        }
        return f;
    }

    public static final b c(cne0 cne0Var, String str) {
        return e.g(new PreferancesExtenstionsKt$listenKeyState$$inlined$simpleCallbackApiToFlow$1(new ugd0(3, cne0Var, str), null));
    }

    public static final f530 d(f530 f530Var, String str) {
        return f530Var.k(new zhy0(str));
    }
}
