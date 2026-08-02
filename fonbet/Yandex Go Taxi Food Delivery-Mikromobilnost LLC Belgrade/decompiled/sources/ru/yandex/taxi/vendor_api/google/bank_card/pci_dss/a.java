package ru.yandex.taxi.vendor_api.google.bank_card.pci_dss;

import android.app.Activity;
import android.content.Intent;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.r40;
import defpackage.w9f;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.vendor_api.google.bank_card.GmsBankCardRecognitionActivity;

/* loaded from: classes6.dex */
public final class a {
    public final Activity a;
    public final g b;

    public a(Activity activity, g gVar) {
        this.a = activity;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GmsBankCardRecognitionRouter$startCapture$1 gmsBankCardRecognitionRouter$startCapture$1;
        int i;
        int i2;
        w9f w9fVar;
        if (continuationImpl instanceof GmsBankCardRecognitionRouter$startCapture$1) {
            gmsBankCardRecognitionRouter$startCapture$1 = (GmsBankCardRecognitionRouter$startCapture$1) continuationImpl;
            int i3 = gmsBankCardRecognitionRouter$startCapture$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gmsBankCardRecognitionRouter$startCapture$1.label = i3 - Integer.MIN_VALUE;
                Object obj = gmsBankCardRecognitionRouter$startCapture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gmsBankCardRecognitionRouter$startCapture$1.label;
                if (i != 0) {
                    b.b(obj);
                    Activity activity = this.a;
                    activity.startActivityForResult(new Intent(activity, (Class<?>) GmsBankCardRecognitionActivity.class), 111);
                    gmsBankCardRecognitionRouter$startCapture$1.I$0 = 111;
                    gmsBankCardRecognitionRouter$startCapture$1.label = 1;
                    obj = this.b.d(111, gmsBankCardRecognitionRouter$startCapture$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                r40 r40Var = (r40) obj;
                i2 = r40Var.a;
                if (i2 == -1) {
                    if (i2 == 0) {
                        throw new CancellationException("Capture cancelled");
                    }
                    if (i2 == 19773) {
                        throw new GmsBankCardRecognitionInsufficientPermissions();
                    }
                    ny61.r(oyr.j(i2, "Unexpected result code: [", "]"));
                    return null;
                }
                Intent intent = r40Var.c;
                if (intent != null) {
                    String stringExtra = intent.getStringExtra(GmsBankCardRecognitionActivity.EXTRA_PAN);
                    int intExtra = intent.getIntExtra(GmsBankCardRecognitionActivity.EXTRA_EXPIRY_MONTH, -1);
                    int intExtra2 = intent.getIntExtra(GmsBankCardRecognitionActivity.EXTRA_EXPIRY_YEAR, -1);
                    if (stringExtra != null && !evu0.J(stringExtra)) {
                        w9fVar = new w9f(stringExtra, intExtra, intExtra2);
                        if (w9fVar == null) {
                            return w9fVar;
                        }
                        ny61.r("No intent or extra in gms scan activity result");
                        return null;
                    }
                }
                w9fVar = null;
                if (w9fVar == null) {
                }
            }
        }
        gmsBankCardRecognitionRouter$startCapture$1 = new GmsBankCardRecognitionRouter$startCapture$1(this, continuationImpl);
        Object obj2 = gmsBankCardRecognitionRouter$startCapture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gmsBankCardRecognitionRouter$startCapture$1.label;
        if (i != 0) {
        }
        r40 r40Var2 = (r40) obj2;
        i2 = r40Var2.a;
        if (i2 == -1) {
        }
    }
}
