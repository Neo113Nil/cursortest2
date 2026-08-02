package androidx.camera.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.jakewharton.disklrucache.DiskLruCache;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.DreamLightsDrawable;
import com.squareup.cash.card.onboarding.StyledCardPerspectiveView;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotRenderContextProvider$DisplayDp;
import com.squareup.cash.mooncake.components.MooncakeEditText;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetKt;
import com.squareup.util.android.ToastKt;
import com.stripe.android.PaymentConfiguration;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import net.idrnd.face.iad.capture.internal.o0;

/* loaded from: classes3.dex */
public final /* synthetic */ class CameraX$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;

    public /* synthetic */ CameraX$$ExternalSyntheticLambda0(o0 o0Var, Context context) {
        this.$r8$classId = 16;
        this.f$0 = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Context context = this.f$0;
        switch (i) {
            case 0:
                return new RotationProvider(context);
            case 1:
                return CashQrWidgetKt.createNavController$NavHostControllerKt__NavHostController_androidKt(context);
            case 2:
                Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.merchant_placeholder_light, null);
                drawableCompat.getClass();
                return drawableCompat;
            case 3:
                Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context, R.drawable.merchant_placeholder_dark, null);
                drawableCompat2.getClass();
                return drawableCompat2;
            case 4:
                Drawable drawableCompat3 = PlatformKt.getDrawableCompat(context, R.drawable.merchant_placeholder_dark, null);
                drawableCompat3.getClass();
                return drawableCompat3;
            case 5:
                Drawable drawableCompat4 = PlatformKt.getDrawableCompat(context, R.drawable.merchant_placeholder_light, null);
                drawableCompat4.getClass();
                return drawableCompat4;
            case 6:
                int i2 = StyledCardPerspectiveView.$r8$clinit;
                return new DreamLightsDrawable(context);
            case 7:
                int i3 = StyledCardPerspectiveView.$r8$clinit;
                Drawable drawableCompat5 = PlatformKt.getDrawableCompat(context, R.drawable.styled_card_background, null);
                drawableCompat5.getClass();
                Drawable mutate = drawableCompat5.mutate();
                mutate.setTint(-16777216);
                mutate.setAlpha(0);
                return mutate;
            case 8:
                return View.inflate(context, R.layout.avatar_view, null);
            case 9:
                Configuration configuration = context.getResources().getConfiguration();
                return new RealMoneybotRenderContextProvider$DisplayDp(configuration.screenWidthDp, configuration.screenHeightDp);
            case 10:
                int i4 = MooncakeEditText.$r8$clinit;
                Object systemService = context.getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 11:
                return context.getContentResolver();
            case 12:
                ToastKt.toast(context, R.string.no_intent_handler, 1);
                return Unit.INSTANCE;
            case 13:
                return context.getSharedPreferences("FraudDetectionDataStore", 0);
            case 14:
                PaymentConfiguration paymentConfiguration = PaymentConfiguration.instance;
                if (paymentConfiguration == null) {
                    SharedPreferences sharedPreferences = new PaymentConfiguration.Store(context).prefs;
                    String string2 = sharedPreferences.getString("key_publishable_key", null);
                    paymentConfiguration = string2 != null ? new PaymentConfiguration(string2, sharedPreferences.getString("key_account_id", null)) : null;
                    if (paymentConfiguration == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                        return null;
                    }
                    PaymentConfiguration.instance = paymentConfiguration;
                }
                return paymentConfiguration.publishableKey;
            case 15:
                return context.getSharedPreferences("app_info", 0);
            case 16:
                try {
                    String path = context.getCacheDir().getPath();
                    path.getClass();
                    return DiskLruCache.open(new File(path + File.separator + "stripe_image_cache"));
                } catch (IOException e) {
                    Log.e("stripe_image_disk_cache", "error opening cache", e);
                    return null;
                }
            case 17:
                int i5 = OldSelfieOverlayView.$r8$clinit;
                Integer resourceIdFromAttr$default = ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaSelfieLookLeftDrawable);
                return resourceIdFromAttr$default != null ? context.getDrawable(resourceIdFromAttr$default.intValue()) : context.getDrawable(R.drawable.pi2_ic_selfie_left);
            default:
                int i6 = OldSelfieOverlayView.$r8$clinit;
                Integer resourceIdFromAttr$default2 = ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaSelfieLookRightDrawable);
                return resourceIdFromAttr$default2 != null ? context.getDrawable(resourceIdFromAttr$default2.intValue()) : context.getDrawable(R.drawable.pi2_ic_selfie_right);
        }
    }

    public /* synthetic */ CameraX$$ExternalSyntheticLambda0(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }
}
