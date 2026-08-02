package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.util.Arrays;
import org.json.JSONObject;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

/* loaded from: classes4.dex */
public abstract class z2a1 {
    public static final oxv0 a = new oxv0(18);

    public static int a(int i, String str) {
        return unr0.b(i, 31, str);
    }

    public static String b(int i) {
        String format = String.format("%08X", Arrays.copyOf(new Object[]{Long.valueOf(i & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)}, 1));
        return ShimmerDivHandler.NUMBER_SING + format.substring(2) + format.substring(0, 2);
    }

    public static void c(String str, boolean z) {
        if (z) {
            return;
        }
        ny61.g(str);
    }

    public static void d(Object obj) {
        e(obj, "Argument must not be null");
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ny61.t(str);
    }

    public static JSONObject f(Context context, CryptoSdkDesign cryptoSdkDesign) {
        float complexToFloat;
        JSONObject jSONObject = new JSONObject();
        if (cryptoSdkDesign != null) {
            int dimenRes = cryptoSdkDesign.getFrameThickness().getDimenRes();
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(dimenRes, typedValue, true);
            complexToFloat = TypedValue.complexToFloat(typedValue.data);
        } else {
            int i = wng0.ebssdkFrameThickness;
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(i, typedValue2, true);
            complexToFloat = TypedValue.complexToFloat(typedValue2.data);
        }
        int i2 = (int) complexToFloat;
        String b = b(cryptoSdkDesign != null ? context.getColor(cryptoSdkDesign.getFrameColor()) : uqb1.d(wng0.ebssdkFrameColor, context));
        return jSONObject.put("oval_thick", i2).put("oval_col", b).put("text_col", b(cryptoSdkDesign != null ? context.getColor(cryptoSdkDesign.getBiometryCapturingInstructionsTextColor()) : uqb1.d(wng0.ebssdkBiometryCapturingInstructionsTextColor, context))).put("substrate_col", b(cryptoSdkDesign != null ? context.getColor(cryptoSdkDesign.getBiometryCapturingInstructionsBackgroundColor()) : uqb1.d(wng0.ebssdkBiometryCapturingInstructionsBackgroundColor, context))).put("os", "Android");
    }
}
