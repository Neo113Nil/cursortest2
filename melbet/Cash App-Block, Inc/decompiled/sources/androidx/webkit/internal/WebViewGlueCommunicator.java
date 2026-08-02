package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.camera.video.Recorder;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.m1;
import com.nimbusds.jose.util.X509CertUtils;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.util.money.RealCurrencyConverter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes3.dex */
public abstract class WebViewGlueCommunicator {

    public abstract class LAZY_COMPAT_CONVERTER_HOLDER {
        public static final m1 INSTANCE = new m1(LAZY_FACTORY_HOLDER.INSTANCE.getWebkitToCompatConverter(), 2);
    }

    public abstract class LAZY_FACTORY_HOLDER {
        public static final WebViewProviderFactory INSTANCE;

        static {
            WebViewProviderFactory incompatibleApkWebViewProviderFactory;
            try {
                incompatibleApkWebViewProviderFactory = new Recorder.AnonymousClass6((WebViewProviderFactoryBoundaryInterface) X509CertUtils.castToSuppLibClass(WebViewProviderFactoryBoundaryInterface.class, WebViewGlueCommunicator.fetchGlueProviderFactoryImpl()), 27);
            } catch (ClassNotFoundException unused) {
                incompatibleApkWebViewProviderFactory = new IncompatibleApkWebViewProviderFactory();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                a$$ExternalSyntheticBUOutline0.m(e);
                return;
            }
            INSTANCE = incompatibleApkWebViewProviderFactory;
        }
    }

    public static final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 convert(Flow flow, RealCurrencyConverter realCurrencyConverter) {
        realCurrencyConverter.getClass();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flow, realCurrencyConverter.exchangeData, new CardModelView.AnonymousClass1.AnonymousClass4(3, (Continuation) null, 18), 0);
    }

    public static InvocationHandler fetchGlueProviderFactoryImpl() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebView.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowAmountPicker.deepLinkSpecs;
    }
}
