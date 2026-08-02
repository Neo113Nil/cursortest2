package com.fillr.browsersdk.model;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Client;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.model.AutofillPrompt;
import com.google.android.gms.common.api.internal.zabr;
import com.google.mlkit.vision.text.zzd;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda12;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.common.IconSize;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.generic.GenericScreenKt$WhenMappings;
import com.stripe.android.financialconnections.features.generic.GenericScreenState;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.ImageResource$Network;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Primary;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Secondary;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.sdui.BulletUI;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import com.stripe.android.uicore.image.DefaultStripeImageLoader;
import com.stripe.android.uicore.image.StripeImageKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.FinancialConnectionsGenericInfoScreen;
import defpackage.Size;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.Function;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import net.oneformapp.PopEncryptorV2_;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public final class FillrWidget implements FillrJNIBinding {
    public final PopEncryptorV2_ fillrWidgetParams;
    public String mWidgetJavaScript = null;
    public WidgetSource mWidgetSource = null;

    public final class WidgetInjectionInterface {
        public final FillrWebView injectedWebView;

        public WidgetInjectionInterface(FillrWebView fillrWebView) {
            new Handler(Looper.getMainLooper());
            this.injectedWebView = fillrWebView;
        }

        @JavascriptInterface
        public void injectFillrAndroidCartScraper(Boolean bool) {
            FillrWidget.m1936$$Nest$mloadJSIntoWebView(FillrWidget.this, this.injectedWebView, bool == null ? false : bool.booleanValue(), WidgetType.CART_SCRAPER);
        }

        @JavascriptInterface
        public void injectFillrAndroidWidget(Boolean bool) {
            FillrWidget.m1936$$Nest$mloadJSIntoWebView(FillrWidget.this, this.injectedWebView, bool != null && bool.booleanValue(), WidgetType.MOBILE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class WidgetSource {
        public static final /* synthetic */ WidgetSource[] $VALUES;
        public static final WidgetSource LOCAL;
        public static final WidgetSource REMOTE;

        static {
            WidgetSource widgetSource = new WidgetSource("REMOTE", 0);
            REMOTE = widgetSource;
            WidgetSource widgetSource2 = new WidgetSource("LOCAL", 1);
            LOCAL = widgetSource2;
            $VALUES = new WidgetSource[]{widgetSource, widgetSource2};
        }

        public static WidgetSource valueOf(String str) {
            return (WidgetSource) Enum.valueOf(WidgetSource.class, str);
        }

        public static WidgetSource[] values() {
            return (WidgetSource[]) $VALUES.clone();
        }
    }

    /* renamed from: -$$Nest$mloadJSIntoWebView, reason: not valid java name */
    public static void m1936$$Nest$mloadJSIntoWebView(FillrWidget fillrWidget, FillrWebView fillrWebView, boolean z, WidgetType widgetType) {
        if (fillrWebView != null) {
            widgetType.preInjectionComplete = true;
            Handler handler = new Handler(Looper.getMainLooper());
            JWECryptoParts widgetManager = Fillr.getInstance().getWidgetManager();
            if (z) {
                HashMap hashMap = WidgetType.POST_INJECTION_LISTENERS;
                if (hashMap.containsKey(widgetType)) {
                    handler.postDelayed(((FillrWidget$WidgetType$$ExternalSyntheticLambda0) hashMap.get(widgetType)).taskForWebview(fillrWebView, widgetType), 200L);
                }
                widgetType.notifyInjectionListeners(fillrWebView);
                return;
            }
            widgetManager.getClass();
            URL url = fillrWebView.getUrl();
            ArrayList enabledWidgetsForUrl = widgetManager.enabledWidgetsForUrl(url == null ? null : url.toString());
            Iterator it = enabledWidgetsForUrl.iterator();
            while (it.hasNext()) {
                WidgetType widgetType2 = (WidgetType) it.next();
                widgetType2.getClass();
                if (WidgetType.PRE_INJECTION_LISTENERS.containsKey(widgetType2) && !widgetType2.preInjectionComplete) {
                    return;
                }
            }
            widgetManager.injectAndRunTasks(enabledWidgetsForUrl, fillrWebView, new Handler(Looper.getMainLooper()));
        }
    }

    /* renamed from: -$$Nest$mnotifyDownloadListeners, reason: not valid java name */
    public static void m1937$$Nest$mnotifyDownloadListeners(FillrWidget fillrWidget) {
        fillrWidget.getClass();
        try {
            Iterator it = ((WidgetType) fillrWidget.fillrWidgetParams.cryptor).widgetLifeCycleListener.iterator();
            while (it.hasNext()) {
                ((AutofillPrompt.AnonymousClass1) it.next()).getClass();
            }
        } catch (ConcurrentModificationException unused) {
            SVG svg = Fillr.getInstance().fillrConfig;
        }
    }

    public FillrWidget(PopEncryptorV2_ popEncryptorV2_) {
        this.fillrWidgetParams = popEncryptorV2_;
        getWidgetFromLocalDirectory();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r0 != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean canDownload() {
        boolean z;
        PopEncryptorV2_ popEncryptorV2_ = this.fillrWidgetParams;
        WidgetType.AnonymousClass1 anonymousClass1 = ((WidgetType) popEncryptorV2_.cryptor).predicate;
        if (anonymousClass1 != null) {
            Fillr fillr = Fillr.getInstance();
            if (fillr != null && !TextUtils.isEmpty(fillr.getDeveloperKey())) {
                SVG svg = fillr.fillrConfig;
                if (!TextUtils.isEmpty(svg == null ? null : (String) svg.cssRules) && zzd.getInstance() != null) {
                    switch (anonymousClass1.$r8$classId) {
                        case 0:
                            z = !zzd.isFeatureEnabledForUrl("DisableCartProductExtraction", null);
                            break;
                        case 1:
                            if (!zzd.isFeatureEnabledForUrl("PageClassifier", null) && !zzd.isFeatureEnabledForUrl("GlobalEnableOrderScraper", null)) {
                                z = false;
                                break;
                            } else {
                                z = true;
                                break;
                            }
                        case 2:
                            z = zzd.isFeatureEnabledForUrl("GlobalEnableOrderScraper", null);
                            break;
                        default:
                            z = zzd.isFeatureEnabledForUrl("GlobalEnableProductPageScraper", null);
                            break;
                    }
                }
            }
            Objects.toString((WidgetType) popEncryptorV2_.cryptor);
            SVG svg2 = Fillr.getInstance().fillrConfig;
            return false;
        }
        return true;
    }

    public final void getWidgetFromLocalDirectory() {
        Activity activity = Fillr.getInstance().parentActivity;
        if (activity != null) {
            Executors.newSingleThreadExecutor().execute(new Client.AnonymousClass4(this, activity, false, 13));
        }
    }

    @Override // com.fillr.browsersdk.model.FillrJNIBinding
    public final String getWidgetInjectionJNI() {
        return ((WidgetType) this.fillrWidgetParams.cryptor).jni;
    }

    @Override // com.fillr.browsersdk.model.FillrJNIBinding
    public final Object newJNIInstance(FillrWebView fillrWebView) {
        return new WidgetInjectionInterface(fillrWebView);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CART_SCRAPER' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public final class WidgetType {
        public static final /* synthetic */ WidgetType[] $VALUES;
        public static final WidgetType CART_SCRAPER;
        public static final HashMap FAILED_DOWNLOAD_LISTENERS_BUILTIN;
        public static final WidgetType LEGACY_MOBILE;
        public static final WidgetType MOBILE;
        public static final WidgetType ORDER_SCRAPER;
        public static final WidgetType PAGE_CLASSIFIER;
        public static final HashMap POST_INJECTION_LISTENERS;
        public static final HashMap PRE_INJECTION_LISTENERS;
        public static final WidgetType PRODUCT_PAGE_SCRAPER;
        public final String jni;
        public final AnonymousClass1 predicate;
        public final boolean reqAuth;
        public final String validator;
        public final ArrayList widgetLifeCycleListener = new ArrayList();
        public final ArrayList storageListeners = new ArrayList();
        public boolean preInjectionComplete = false;
        public boolean isWidgetForceDisabled = false;

        static {
            WidgetType widgetType = new WidgetType("MOBILE", 0, "FillrAndroidWidget", true, "PopWidgetInterface.getFields()", null);
            MOBILE = widgetType;
            int i = 0;
            WidgetType widgetType2 = new WidgetType("CART_SCRAPER", 1, "FillrAndroidWidgetCS", true, "fillrCartInformationExtractionJNI", new AnonymousClass1(i));
            CART_SCRAPER = widgetType2;
            int i2 = 1;
            WidgetType widgetType3 = new WidgetType("PAGE_CLASSIFIER", 2, "fillrClassifierJNI", true, ".send(\"fillr:classifier:classificationChanged\"", new AnonymousClass1(i2));
            PAGE_CLASSIFIER = widgetType3;
            int i3 = 2;
            WidgetType widgetType4 = new WidgetType("ORDER_SCRAPER", 3, "fillrOrdersJNI", true, ".send(\"fillr:orders:orderFound\"", new AnonymousClass1(i3));
            ORDER_SCRAPER = widgetType4;
            int i4 = 3;
            WidgetType widgetType5 = new WidgetType("PRODUCT_PAGE_SCRAPER", 4, "fillrProductPageScraperJNI", true, "fillr:product:data:scraped", new AnonymousClass1(i4));
            PRODUCT_PAGE_SCRAPER = widgetType5;
            WidgetType widgetType6 = new WidgetType("LEGACY_MOBILE", 5, "FillrAndroidWidget", false, "PopWidgetInterface.getFields()", null);
            LEGACY_MOBILE = widgetType6;
            $VALUES = new WidgetType[]{widgetType, widgetType2, widgetType3, widgetType4, widgetType5, widgetType6};
            FAILED_DOWNLOAD_LISTENERS_BUILTIN = new HashMap();
            PRE_INJECTION_LISTENERS = new HashMap();
            POST_INJECTION_LISTENERS = new HashMap();
            for (WidgetType widgetType7 : values()) {
                FAILED_DOWNLOAD_LISTENERS_BUILTIN.put(widgetType7, new FillrWidget$WidgetType$$ExternalSyntheticLambda0(i));
            }
            FillrWidget$WidgetType$$ExternalSyntheticLambda0 fillrWidget$WidgetType$$ExternalSyntheticLambda0 = new FillrWidget$WidgetType$$ExternalSyntheticLambda0(i2);
            HashMap hashMap = PRE_INJECTION_LISTENERS;
            WidgetType widgetType8 = MOBILE;
            hashMap.put(widgetType8, fillrWidget$WidgetType$$ExternalSyntheticLambda0);
            WidgetType widgetType9 = CART_SCRAPER;
            hashMap.put(widgetType9, fillrWidget$WidgetType$$ExternalSyntheticLambda0);
            HashMap hashMap2 = POST_INJECTION_LISTENERS;
            hashMap2.put(PRODUCT_PAGE_SCRAPER, new FillrWidget$WidgetType$$ExternalSyntheticLambda0(i3));
            hashMap2.put(widgetType9, new FillrWidget$WidgetType$$ExternalSyntheticLambda0(i4));
            hashMap2.put(widgetType8, new FillrWidget$WidgetType$$ExternalSyntheticLambda0(4));
        }

        public WidgetType(String str, int i, String str2, boolean z, String str3, AnonymousClass1 anonymousClass1) {
            this.jni = str2;
            this.reqAuth = z;
            this.validator = str3;
            this.predicate = anonymousClass1;
        }

        public static WidgetType valueOf(String str) {
            return (WidgetType) Enum.valueOf(WidgetType.class, str);
        }

        public static WidgetType[] values() {
            return (WidgetType[]) $VALUES.clone();
        }

        public final void notifyInjectionListeners(FillrWebView fillrWebView) {
            Iterator it = this.widgetLifeCycleListener.iterator();
            while (it.hasNext()) {
                AutofillPrompt autofillPrompt = AutofillPrompt.this;
                String webviewReference = autofillPrompt.mWebViewMapper.getWebviewReference(fillrWebView);
                fillrWebView.viewId = webviewReference;
                Map map = autofillPrompt.lastNotifiedMapping;
                if (map != null && webviewReference != null) {
                    map.remove(webviewReference);
                }
            }
        }

        /* renamed from: com.fillr.browsersdk.model.FillrWidget$WidgetType$1, reason: invalid class name */
        /* loaded from: classes8.dex */
        public final class AnonymousClass1 {
            public final /* synthetic */ int $r8$classId;

            public /* synthetic */ AnonymousClass1(int i) {
                this.$r8$classId = i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:60:0x0260, code lost:
            
                if (r6 == androidx.compose.runtime.Composer.Companion.Empty) goto L62;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final void GenericBody(FinancialConnectionsGenericInfoScreen.Body body, Modifier modifier, Function1 function1, Composer composer, int i) {
                Modifier modifier2;
                int i2;
                boolean z;
                float f;
                Modifier.Companion companion;
                BiasAlignment.Horizontal horizontal;
                boolean z2;
                String str;
                Object obj;
                TextStyle textStyle;
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                body.getClass();
                function1.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-328976321);
                Applier applier = gapComposer.applier;
                int i3 = i | (gapComposer.changedInstance(body) ? 4 : 2) | 48 | (gapComposer.changedInstance(function1) ? 256 : 128);
                boolean z3 = true;
                boolean z4 = false;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(24.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    float f2 = 1.0f;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal2, gapComposer, 6);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer.startReplaceGroup(50039595);
                    for (FinancialConnectionsGenericInfoScreen.Body.Entry entry : body.entries) {
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z4);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion2);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                        if (entry instanceof FinancialConnectionsGenericInfoScreen.Body.Entry.Image) {
                            gapComposer.startReplaceGroup(-1936814299);
                            FinancialConnectionsGenericInfoScreen.Body.Entry.Image image = (FinancialConnectionsGenericInfoScreen.Body.Entry.Image) entry;
                            String str2 = image.image.f809default;
                            if (str2 == null) {
                                str2 = "";
                            }
                            Modifier.Companion companion3 = companion2;
                            f = f2;
                            i2 = i3;
                            z = z4;
                            StripeImageKt.StripeImage(str2, (DefaultStripeImageLoader) gapComposer.consume(FinancialConnectionsSheetNativeActivityKt.LocalImageLoader), image.alt, SizeKt.fillMaxWidth(companion3, f2), null, null, null, null, null, null, gapComposer, 3072, 0, 2032);
                            gapComposer.end(z);
                            companion = companion3;
                            horizontal = horizontal2;
                            z2 = true;
                        } else {
                            BiasAlignment.Horizontal horizontal3 = horizontal2;
                            i2 = i3;
                            z = z4;
                            f = f2;
                            companion = companion2;
                            if (entry instanceof FinancialConnectionsGenericInfoScreen.Body.Entry.Text) {
                                gapComposer.startReplaceGroup(-1936447600);
                                FinancialConnectionsGenericInfoScreen.Body.Entry.Text text = (FinancialConnectionsGenericInfoScreen.Body.Entry.Text) entry;
                                Size size = text.size;
                                int i4 = size == null ? -1 : GenericScreenKt$WhenMappings.$EnumSwitchMapping$1[size.ordinal()];
                                if (i4 == -1) {
                                    gapComposer.startReplaceGroup(-616112293);
                                    textStyle = ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).bodyMedium;
                                    gapComposer.end(z);
                                } else if (i4 == 1) {
                                    gapComposer.startReplaceGroup(-616115941);
                                    textStyle = ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelSmall;
                                    gapComposer.end(z);
                                } else if (i4 == 2) {
                                    gapComposer.startReplaceGroup(-616114662);
                                    textStyle = ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).bodySmall;
                                    gapComposer.end(z);
                                } else {
                                    if (i4 != 3) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -616117189, z);
                                    }
                                    gapComposer.startReplaceGroup(-616113381);
                                    textStyle = ((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).bodyMedium;
                                    gapComposer.end(z);
                                }
                                TextKt.m4020AnnotatedTextrm0N8CA(new TextResource.Text(zabr.fromHtml(text.text)), function1, TextStyle.m994copyp1EtxEg$default(textStyle, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, toComposeTextAlign(text.alignment), 0L, null, null, 0, 16744446), SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2), null, 0, 0, gapComposer, ((i2 >> 3) & 112) | 3072, 112);
                                gapComposer.end(z);
                                horizontal = horizontal3;
                                z2 = true;
                            } else if (entry instanceof FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets) {
                                gapComposer.startReplaceGroup(-1935799638);
                                List list = ((FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets) entry).bullets;
                                boolean changed = gapComposer.changed(list);
                                Object rememberedValue = gapComposer.rememberedValue();
                                if (!changed) {
                                    obj = rememberedValue;
                                }
                                List<FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint> list2 = list;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                for (FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint genericBulletPoint : list2) {
                                    genericBulletPoint.getClass();
                                    Image image2 = genericBulletPoint.icon;
                                    ImageResource$Network imageResource$Network = (image2 == null || (str = image2.f809default) == null) ? null : new ImageResource$Network(str);
                                    String str3 = genericBulletPoint.title;
                                    TextResource.Text text2 = str3 != null ? new TextResource.Text(zabr.fromHtml(str3)) : null;
                                    String str4 = genericBulletPoint.content;
                                    arrayList.add(new BulletUI(text2, str4 != null ? new TextResource.Text(zabr.fromHtml(str4)) : null, imageResource$Network));
                                }
                                gapComposer.updateRememberedValue(arrayList);
                                obj = arrayList;
                                List list3 = (List) obj;
                                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                                horizontal = horizontal3;
                                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, z ? 1 : 0);
                                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                                gapComposer.startReusableNode();
                                if (gapComposer.inserting) {
                                    gapComposer.createNode(layoutNode$Companion$Constructor$13);
                                } else {
                                    gapComposer.useNode();
                                }
                                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                                gapComposer.startReplaceGroup(-2015451306);
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    ListItemKt.ListItem((BulletUI) it.next(), function1, gapComposer, (i2 >> 3) & 112);
                                    SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
                                }
                                z2 = true;
                                Boxes$$ExternalSyntheticOutline1.m(gapComposer, z, true, z);
                            } else {
                                horizontal = horizontal3;
                                gapComposer.startReplaceGroup(-1935089242);
                                gapComposer.end(z);
                                Log.e("GenericBody", "Unsupported entry type: " + entry);
                                z2 = true;
                            }
                        }
                        gapComposer.end(z2);
                        z4 = z;
                        z3 = z2;
                        horizontal2 = horizontal;
                        companion2 = companion;
                        i3 = i2;
                        f2 = f;
                    }
                    gapComposer.end(z4);
                    gapComposer.end(z3);
                    modifier2 = companion2;
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier2 = modifier;
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0((Object) body, (Object) modifier2, (Function) function1, i, 18);
                }
            }

            public static final void GenericButton(Function0 function0, TextKt textKt, FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction, Composer composer, int i) {
                int i2;
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(947913752);
                if ((i & 6) == 0) {
                    i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= gapComposer.changed(textKt) ? 32 : 16;
                }
                if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                    i2 |= (i & 512) == 0 ? gapComposer.changed(genericInfoAction) : gapComposer.changedInstance(genericInfoAction) ? 256 : 128;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    TextKt.FinancialConnectionsButton(function0, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), textKt, null, false, false, Expect_jvmKt.rememberComposableLambda(1060370143, new CardAppletTile$$ExternalSyntheticLambda1(genericInfoAction, 18), gapComposer), gapComposer, (i2 & 14) | 1769520 | ((i2 << 3) & 896), 24);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(function0, textKt, genericInfoAction, i, 14);
                }
            }

            public static final void GenericFooter(FinancialConnectionsGenericInfoScreen.Footer footer, Modifier modifier, Function0 function0, Function0 function02, Function1 function1, Composer composer, int i) {
                Modifier modifier2;
                boolean z;
                float f;
                int i2;
                Modifier.Companion companion;
                footer.getClass();
                function0.getClass();
                function02.getClass();
                function1.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(713895287);
                int i3 = i | (gapComposer.changed(footer) ? 4 : 2) | 48 | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(function02) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String str = footer.disclaimer;
                    if (str == null) {
                        gapComposer.startReplaceGroup(-1552758803);
                        gapComposer.end(false);
                        i2 = i3;
                        f = 1.0f;
                        z = false;
                        companion = companion2;
                    } else {
                        gapComposer.startReplaceGroup(-1552758802);
                        int i4 = ((i3 >> 9) & 112) | 3072;
                        z = false;
                        f = 1.0f;
                        i2 = i3;
                        companion = companion2;
                        TextKt.m4020AnnotatedTextrm0N8CA(new TextResource.Text(zabr.fromHtml(str)), function1, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelSmall, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), SizeKt.fillMaxWidth(companion2, 1.0f), null, 0, 0, gapComposer, i4, 112);
                        gapComposer.end(false);
                    }
                    FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction = footer.primaryCta;
                    if (genericInfoAction == null) {
                        gapComposer.startReplaceGroup(-1552315999);
                    } else {
                        gapComposer.startReplaceGroup(-1552315998);
                        GenericButton(function0, FinancialConnectionsButton$Type$Primary.INSTANCE, genericInfoAction, gapComposer, ((i2 >> 6) & 14) | 48);
                    }
                    gapComposer.end(z);
                    FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction2 = footer.secondaryCta;
                    if (genericInfoAction2 == null) {
                        gapComposer.startReplaceGroup(-1552074447);
                    } else {
                        gapComposer.startReplaceGroup(-1552074446);
                        GenericButton(function02, FinancialConnectionsButton$Type$Secondary.INSTANCE, genericInfoAction2, gapComposer, ((i2 >> 9) & 14) | 48);
                    }
                    gapComposer.end(z);
                    String str2 = footer.belowCta;
                    if (str2 == null) {
                        gapComposer.startReplaceGroup(-1551815535);
                    } else {
                        gapComposer.startReplaceGroup(-1551815534);
                        TextKt.m4020AnnotatedTextrm0N8CA(new TextResource.Text(zabr.fromHtml(str2)), function1, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).labelSmall, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), SizeKt.fillMaxWidth(companion, f), null, 0, 0, gapComposer, ((i2 >> 9) & 112) | 3072, 112);
                    }
                    gapComposer.end(z);
                    gapComposer.end(true);
                    modifier2 = companion;
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier2 = modifier;
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new WalletHomeViewKt$$ExternalSyntheticLambda4(footer, modifier2, function0, function02, function1, i);
                }
            }

            public static final void GenericHeader(FinancialConnectionsGenericInfoScreen.Header header, Function1 function1, Modifier modifier, Composer composer, int i) {
                GapComposer gapComposer;
                String str;
                BiasAlignment.Horizontal horizontal;
                boolean z;
                Modifier modifier2;
                defpackage.Alignment alignment;
                float f;
                BiasAlignment.Horizontal horizontal2;
                boolean z2;
                boolean z3;
                header.getClass();
                function1.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(-363842843);
                int i2 = i | (gapComposer2.changed(header) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    Image image = header.icon;
                    String str2 = header.subtitle;
                    String str3 = header.title;
                    defpackage.Alignment alignment2 = header.alignment;
                    boolean changed = gapComposer2.changed(image != null ? image.f809default : null);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = Boolean.valueOf((image == null || (str = image.f809default) == null || !StringsKt.contains((CharSequence) str, (CharSequence) "BrandIcon", false)) ? false : true);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    boolean booleanValue = ((Boolean) rememberedValue).booleanValue();
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(20.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    BiasAlignment.Horizontal horizontal3 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal3, gapComposer2, 6);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    RoundedCornerShape m340RoundedCornerShape0680j_4 = booleanValue ? RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f) : RoundedCornerShapeKt.CircleShape;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (booleanValue) {
                        gapComposer2.startReplaceGroup(1491933130);
                        z = false;
                        horizontal = horizontal3;
                        modifier2 = ImageKt.m177backgroundbw27NRU(ClipKt.clip(ShadowKt.m591shadows4CzXII$default(companion, 8.0f, m340RoundedCornerShape0680j_4, false, 28), m340RoundedCornerShape0680j_4), ((FinancialConnectionsColors) gapComposer2.consume(ThemeKt.LocalColors)).backgroundSecondary, m340RoundedCornerShape0680j_4);
                        gapComposer2.end(false);
                    } else {
                        horizontal = horizontal3;
                        z = false;
                        gapComposer2.startReplaceGroup(1492121703);
                        gapComposer2.end(false);
                        modifier2 = companion;
                    }
                    String str4 = image != null ? image.f809default : null;
                    if (str4 == null) {
                        gapComposer2.startReplaceGroup(1492198086);
                        gapComposer2.end(z);
                        alignment = alignment2;
                        gapComposer = gapComposer2;
                        f = 1.0f;
                    } else {
                        gapComposer2.startReplaceGroup(1492198087);
                        int i3 = alignment2 == null ? -1 : GenericScreenKt$WhenMappings.$EnumSwitchMapping$0[alignment2.ordinal()];
                        if (i3 != -1 && i3 != 1) {
                            if (i3 == 2) {
                                horizontal2 = Alignment.Companion.CenterHorizontally;
                            } else {
                                if (i3 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                horizontal2 = Alignment.Companion.End;
                            }
                            horizontal = horizontal2;
                        }
                        Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(horizontal, modifier2);
                        gapComposer = gapComposer2;
                        alignment = alignment2;
                        f = 1.0f;
                        ListItemKt.ShapedIcon(str4, m, alignment2 == defpackage.Alignment.Center ? IconSize.Large : IconSize.Medium, m340RoundedCornerShape0680j_4, null, booleanValue, gapComposer, 24576, 32);
                        gapComposer.end(false);
                    }
                    if (str3 != null) {
                        gapComposer.startReplaceGroup(1492647680);
                        GapComposer gapComposer3 = gapComposer;
                        TextKt.m4020AnnotatedTextrm0N8CA(new TextResource.Text(str3), function1, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).headingXLarge, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, toComposeTextAlign(alignment), 0L, null, null, 0, 16744446), SizeKt.fillMaxWidth(companion, f), null, 0, 0, gapComposer3, (i2 & 112) | 3072, 112);
                        gapComposer = gapComposer3;
                        z2 = false;
                    } else {
                        z2 = false;
                        gapComposer.startReplaceGroup(1484992199);
                    }
                    gapComposer.end(z2);
                    if (str2 != null) {
                        gapComposer.startReplaceGroup(1493107286);
                        GapComposer gapComposer4 = gapComposer;
                        TextKt.m4020AnnotatedTextrm0N8CA(new TextResource.Text(zabr.fromHtml(str2)), function1, TextStyle.m994copyp1EtxEg$default(((FinancialConnectionsTypography) gapComposer.consume(ThemeKt.LocalTypography)).bodyMedium, ((FinancialConnectionsColors) gapComposer.consume(ThemeKt.LocalColors)).textDefault, 0L, null, null, 0L, null, 0L, null, null, null, toComposeTextAlign(alignment), 0L, null, null, 0, 16744446), SizeKt.fillMaxWidth(companion, f), null, 0, 0, gapComposer4, (i2 & 112) | 3072, 112);
                        gapComposer = gapComposer4;
                        z3 = false;
                    } else {
                        z3 = false;
                        gapComposer.startReplaceGroup(1484992199);
                    }
                    gapComposer.end(z3);
                    gapComposer.end(true);
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0(header, function1, modifier, i, 17);
                }
            }

            public static final void GenericScreen(GenericScreenState genericScreenState, Function0 function0, Function0 function02, Function1 function1, Composer composer, int i) {
                int i2;
                Function0 function03;
                Function1 function12;
                ComposableLambdaImpl rememberComposableLambda;
                function0.getClass();
                function02.getClass();
                function1.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(879041748);
                if ((i & 6) == 0) {
                    i2 = (gapComposer.changedInstance(genericScreenState) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
                }
                if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                    function03 = function02;
                    i2 |= gapComposer.changedInstance(function03) ? 256 : 128;
                } else {
                    function03 = function02;
                }
                if ((i & 3072) == 0) {
                    i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
                    PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    boolean z = genericScreenState.inModal;
                    FinancialConnectionsGenericInfoScreen.Footer footer = genericScreenState.screen.footer;
                    if (footer == null) {
                        gapComposer.startReplaceGroup(1117432520);
                        gapComposer.end(false);
                        rememberComposableLambda = null;
                        function12 = function1;
                    } else {
                        gapComposer.startReplaceGroup(1117432521);
                        function12 = function1;
                        rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1315710570, new LifecycleKt$$ExternalSyntheticLambda0(footer, function0, function03, function1, 25), gapComposer);
                        gapComposer.end(false);
                    }
                    LayoutKt.Layout(null, m295PaddingValuesYgX7TsA$default, z, null, false, null, rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(1723222788, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(17, (Object) genericScreenState, function12), gapComposer), gapComposer, 805306416, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
                } else {
                    function12 = function1;
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda1(genericScreenState, function0, function02, function12, i, 8);
                }
            }

            public static final String cashtagWithCurrencySymbol(FullCashtag fullCashtag) {
                fullCashtag.getClass();
                String str = fullCashtag.cashtag_display_name;
                if (str != null) {
                    return Cashtags.symbol(fullCashtag.currency).concat(str);
                }
                return null;
            }

            public static final Character getMonogram(PublicProfile publicProfile) {
                publicProfile.getClass();
                String str = publicProfile.fullName;
                char charAt = (str == null || StringsKt.isBlank(str)) ? (char) 0 : publicProfile.fullName.charAt(0);
                if (!Character.isLetter(charAt)) {
                    if (Character.isDigit(charAt)) {
                        return Character.valueOf(charAt);
                    }
                    return null;
                }
                String valueOf = String.valueOf(charAt);
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = valueOf.toUpperCase(locale);
                upperCase.getClass();
                return Character.valueOf(upperCase.charAt(0));
            }

            public static final int toComposeTextAlign(defpackage.Alignment alignment) {
                int i = alignment == null ? -1 : GenericScreenKt$WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
                int i2 = 5;
                if (i != -1 && i != 1) {
                    i2 = 3;
                    if (i != 2) {
                        if (i == 3) {
                            return 6;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                }
                return i2;
            }

            public static final PublicProfile toPublicProfile(Profile profile) {
                URL url;
                profile.getClass();
                String str = profile.full_name;
                String str2 = profile.photo_url;
                boolean z = profile.cashtag_url_enabled;
                boolean z2 = profile.is_verified_account;
                String str3 = profile.cashtag_url;
                String str4 = null;
                if (str3 != null) {
                    try {
                        url = URI.create(str3).toURL();
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    if (url != null) {
                        str4 = Boxes$$ExternalSyntheticOutline1.m(url.getProtocol(), "://", url.getAuthority(), "/");
                    }
                }
                String str5 = str4;
                String str6 = profile.cashtag;
                Set set = Cashtags.SUPPORTED_SYMBOLS;
                return new PublicProfile(str, str2, new FullCashtag(str5, str6, Cashtags.guessCashtagCurrency(profile.region), null, profile.cashtag_url, profile.cashtag_url_display_text, profile.cashtag_qr_image_url, profile.printable_cashtag_qr_image_url, ByteString.EMPTY), Boolean.valueOf(z), Boolean.valueOf(z2), ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, profile.profile_id, profile.full_name, null, null)));
            }

            public static final PublicProfile toPublicProfile(UiPublicProfile uiPublicProfile, Profile profile) {
                uiPublicProfile.getClass();
                String str = uiPublicProfile.full_name;
                return new PublicProfile(str, uiPublicProfile.photo_url, uiPublicProfile.full_cashtag, uiPublicProfile.cashtag_url_enabled, uiPublicProfile.is_verified_account, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, profile != null ? profile.profile_id : null, str, null, null)));
            }
        }
    }
}
