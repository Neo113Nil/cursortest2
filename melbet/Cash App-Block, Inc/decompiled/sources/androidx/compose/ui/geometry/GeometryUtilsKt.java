package androidx.compose.ui.geometry;

import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider;
import com.squareup.cash.bitcoin.presenters.limits.util.NonCustodialBitcoinLimitsProvider;
import com.squareup.cash.bitcoin.presenters.limits.util.RealBitcoinLimitsProvider;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class GeometryUtilsKt {
    public static final Object handleOffersResponse(ApiResult apiResult, Function2 function2, ContinuationImpl continuationImpl) {
        if (apiResult instanceof ApiResult.Success) {
            Object invoke = function2.invoke(((ApiResult.Success) apiResult).response, continuationImpl);
            return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : (ApiResult) invoke;
        }
        if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
            return new ApiResult.Failure.NetworkFailure(((ApiResult.Failure.NetworkFailure) apiResult).error);
        }
        if (apiResult instanceof ApiResult.Failure.HttpFailure) {
            return new ApiResult.Failure.HttpFailure(((ApiResult.Failure.HttpFailure) apiResult).code, null, null);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static BitcoinLimitsProvider provideBitcoinLimitsProvider(RealBitcoinLimitsProvider realBitcoinLimitsProvider, NonCustodialBitcoinLimitsProvider nonCustodialBitcoinLimitsProvider, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0) {
        return cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? nonCustodialBitcoinLimitsProvider : realBitcoinLimitsProvider;
    }

    public static final String toStringAsFixed(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < RecyclerView.DECELERATION_RATE ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }
}
