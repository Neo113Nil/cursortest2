package defpackage;

import android.content.Context;
import android.content.Intent;
import com.ybsdk.feature.paymentsdk.api.PaymentSdkEnvironment;
import kotlin.Pair;

/* loaded from: classes8.dex */
public interface ria0 {
    bja0 a(Context context, PaymentSdkEnvironment paymentSdkEnvironment, boolean z, String str, String str2, u290 u290Var, String str3, String str4, String str5, int i);

    Pair b(Context context, boolean z);

    String c(Intent intent);
}
