package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import androidx.exifinterface.media.a;
import androidx.media3.common.ParserException;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentKitEnvironment;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public abstract class s8b1 {
    public static Bitmap a(int i, byte[] bArr) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, null);
        if (decodeByteArray == null) {
            throw ParserException.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            a aVar = new a(byteArrayInputStream);
            byteArrayInputStream.close();
            int n = aVar.n();
            if (n == 0) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(n);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static final List b(khq0 khq0Var) {
        boolean z;
        List list = khq0Var.i;
        List list2 = khq0Var.k;
        if (!list.isEmpty()) {
            return list;
        }
        HubOfferType hubOfferType = khq0Var.c;
        if (hubOfferType == HubOfferType.MULTIMODAL || hubOfferType == HubOfferType.SCOOTER_MULTIMODAL) {
            List<z6l0> list3 = list2;
            boolean z2 = list3 instanceof Collection;
            boolean z3 = true;
            if (!z2 || !list3.isEmpty()) {
                for (z6l0 z6l0Var : list3) {
                    if ((z6l0Var instanceof w6l0) || (z6l0Var instanceof t6l0) || (z6l0Var instanceof u6l0)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z2 || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    if (((z6l0) it.next()) instanceof y6l0) {
                        break;
                    }
                }
            }
            z3 = false;
            if (z && z3) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    ycc.r(((z6l0) it2.next()).a(), arrayList);
                }
                return arrayList;
            }
        }
        return EmptyList.a;
    }

    public static t7w c(Intent intent) {
        Bundle extras = intent.getExtras();
        AdditionalSettings additionalSettings = (AdditionalSettings) vng.u(extras, AdditionalSettings.class, "PAYMENT_KIT.ADDITIONAL_SETTINGS");
        String string = extras.getString("PAYMENT_KIT.API_INSTANCE_ID");
        if (string == null) {
            ny61.g("EXTRA_API_INSTANCE_ID must be present in Intent");
            return null;
        }
        v2a0 v2a0Var = new v2a0(string);
        PaymentKitEnvironment paymentKitEnvironment = (PaymentKitEnvironment) vng.u(extras, PaymentKitEnvironment.class, "PAYMENT_KIT.ENVIRONMENT");
        boolean z = extras.getBoolean("PAYMENT_KIT.IS_BOTTOM_SHEET", false);
        Merchant merchant = (Merchant) vng.u(extras, Merchant.class, "PAYMENT_KIT.MERCHANT_DATA");
        Payer payer = (Payer) vng.u(extras, Payer.class, "PAYMENT_KIT.PAYER_DATA");
        Scenario scenario = (Scenario) vng.u(extras, Scenario.class, "PAYMENT_KIT.SCENARIO");
        String string2 = extras.getString("PAYMENT_KIT.SESSION_ID");
        if (string2 != null) {
            return new t7w(additionalSettings, v2a0Var, paymentKitEnvironment, merchant, payer, scenario, new s3a0(string2), z);
        }
        ny61.g("EXTRA_SESSION_ID must be present in Intent");
        return null;
    }
}
