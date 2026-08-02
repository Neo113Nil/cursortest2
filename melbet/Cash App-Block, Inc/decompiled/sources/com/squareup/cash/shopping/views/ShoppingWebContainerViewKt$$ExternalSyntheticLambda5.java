package com.squareup.cash.shopping.views;

import android.net.Uri;
import android.webkit.WebView;
import androidx.compose.material.SliderKt$Slider$2$2$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.glance.appwidget.IgnoreResultKt;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.ComponentRegistry;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.autofillweb.real.CashFillWebManager$$ExternalSyntheticLambda0;
import com.squareup.cash.common.web.WebAppBridge;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.shopping.viewmodels.InjectJavascriptViewModel$InjectJsViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingViewModel;
import com.squareup.cash.util.BackHandlerKt;
import com.squareup.protos.cash.ui.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppUpdateData;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShoppingWebContainerViewKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$10;
    public final /* synthetic */ Object f$11;
    public final /* synthetic */ Object f$12;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ Serializable f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ ShoppingWebContainerViewKt$$ExternalSyntheticLambda5(String str, String str2, String str3, Color color, TextFormat textFormat, List list, Integer num, LocalTabContentQueries localTabContentQueries, ReleaseState releaseState, List list2, boolean z, String str4) {
        this.f$3 = str;
        this.f$4 = str2;
        this.f$1 = str3;
        this.f$2 = color;
        this.f$6 = textFormat;
        this.f$7 = list;
        this.f$8 = num;
        this.f$9 = localTabContentQueries;
        this.f$11 = releaseState;
        this.f$10 = list2;
        this.f$5 = z;
        this.f$12 = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        WebView webView;
        MutableState mutableState;
        String str;
        InputStream inputStream;
        IgnoreResultKt injectJavascriptViewModel;
        InjectJavascriptViewModel$InjectJsViewModel injectJavascriptViewModel$InjectJsViewModel;
        int i;
        InputStream openInputStream;
        InputStream inputStream2;
        WebAppBridge webAppBridge;
        Long l;
        int i2 = this.$r8$classId;
        Object obj2 = this.f$12;
        boolean z = this.f$5;
        Object obj3 = this.f$10;
        Object obj4 = this.f$11;
        Object obj5 = this.f$9;
        Object obj6 = this.f$8;
        Object obj7 = this.f$7;
        Serializable serializable = this.f$6;
        Object obj8 = this.f$2;
        Object obj9 = this.f$1;
        switch (i2) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) obj9;
                ShoppingViewModel shoppingViewModel = (ShoppingViewModel) obj8;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj7;
                Function1 function1 = (Function1) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                MutableState mutableState3 = (MutableState) obj4;
                Function7 function7 = (Function7) obj2;
                WebView webView2 = (WebView) obj;
                webView2.getClass();
                BackHandlerKt.setBackHandler(webView2, new RedwoodLayoutKt$toAndroid$1(new ShareSheetViewKt$$ExternalSyntheticLambda5(23, (Object) webView2, function1), 7));
                if (((WebAppBridge) mutableState2.getValue()) == null) {
                    boolean fillrEnabled = shoppingViewModel.getFillrEnabled();
                    boolean shouldSyncCookies = shoppingViewModel.getShouldSyncCookies();
                    SliderKt$Slider$2$2$1 sliderKt$Slider$2$2$1 = new SliderKt$Slider$2$2$1(coroutineScope, parcelableSnapshotMutableIntState, mutableState3);
                    Boolean valueOf = Boolean.valueOf(fillrEnabled);
                    Boolean valueOf2 = Boolean.valueOf(shouldSyncCookies);
                    Boolean valueOf3 = Boolean.valueOf(z);
                    mutableState = mutableState2;
                    webView = webView2;
                    str = "monitoringScript.js";
                    mutableState.setValue((WebAppBridge) function7.invoke(coroutineScope, webView, valueOf, valueOf2, this.f$3, this.f$4, valueOf3));
                    WebAppBridge webAppBridge2 = (WebAppBridge) mutableState.getValue();
                    if (webAppBridge2 != null) {
                        inputStream = null;
                        JobKt.launch$default(coroutineScope, null, null, new ShoppingWebContainerViewKt$Content$initializeShoppingWebBridge$1$1(webAppBridge2, sliderKt$Slider$2$2$1, function1, null), 3);
                        if (shoppingViewModel instanceof ShoppingViewModel.ValidUrl) {
                            if (webView.getUrl() == null && (webAppBridge = (WebAppBridge) mutableState.getValue()) != null) {
                                String str2 = ((ShoppingViewModel.ValidUrl) shoppingViewModel).headerModel.urlText;
                                str2.getClass();
                                webAppBridge.loadUrl(str2);
                            }
                            ShoppingViewModel.ValidUrl validUrl = (ShoppingViewModel.ValidUrl) shoppingViewModel;
                            Uri uri = validUrl.monitoringScriptUri;
                            if (validUrl.shouldMonitorWeb && !Intrinsics.areEqual(ref$ObjectRef.element, webView.getUrl())) {
                                String url = webView.getUrl();
                                url.getClass();
                                ref$ObjectRef.element = url;
                                if (uri != null) {
                                    try {
                                        openInputStream = webView.getContext().getContentResolver().openInputStream(uri);
                                    } catch (FileNotFoundException e) {
                                        Timber.Forest.e("Failure at opening the monitoring script from cache with uri: %s", new Object[]{uri}, e);
                                    }
                                    if (openInputStream == null) {
                                        try {
                                            inputStream2 = webView.getContext().getAssets().open(str);
                                        } catch (IOException e2) {
                                            Timber.Forest.e("Failure at opening the monitoring script from assets with file name: %s", new Object[]{str}, e2);
                                            inputStream2 = inputStream;
                                        }
                                        openInputStream = inputStream2;
                                    }
                                    if (openInputStream != null) {
                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openInputStream, Charsets.UTF_8), PKIFailureInfo.certRevoked);
                                        try {
                                            String readText = AppUpdateData.readText(bufferedReader);
                                            bufferedReader.close();
                                            webView.evaluateJavascript(readText, new CashFillWebManager$$ExternalSyntheticLambda0(1));
                                        } finally {
                                        }
                                    }
                                }
                                openInputStream = inputStream;
                                if (openInputStream == null) {
                                }
                                if (openInputStream != null) {
                                }
                            }
                        }
                        injectJavascriptViewModel = shoppingViewModel.getInjectJavascriptViewModel();
                        if ((injectJavascriptViewModel instanceof InjectJavascriptViewModel$InjectJsViewModel) && (i = (injectJavascriptViewModel$InjectJsViewModel = (InjectJavascriptViewModel$InjectJsViewModel) injectJavascriptViewModel).version) > ref$IntRef.element) {
                            webView.evaluateJavascript(injectJavascriptViewModel$InjectJsViewModel.javascript, new CashFillWebManager$$ExternalSyntheticLambda0(1));
                            ref$IntRef.element = i;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    webView = webView2;
                    mutableState = mutableState2;
                    str = "monitoringScript.js";
                }
                inputStream = null;
                if (shoppingViewModel instanceof ShoppingViewModel.ValidUrl) {
                }
                injectJavascriptViewModel = shoppingViewModel.getInjectJavascriptViewModel();
                if (injectJavascriptViewModel instanceof InjectJavascriptViewModel$InjectJsViewModel) {
                    webView.evaluateJavascript(injectJavascriptViewModel$InjectJsViewModel.javascript, new CashFillWebManager$$ExternalSyntheticLambda0(1));
                    ref$IntRef.element = i;
                }
                return Unit.INSTANCE;
            default:
                Color color = (Color) obj8;
                TextFormat textFormat = (TextFormat) serializable;
                List list = (List) obj7;
                Integer num = (Integer) obj6;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj5;
                ReleaseState releaseState = (ReleaseState) obj4;
                List list2 = (List) obj3;
                String str3 = (String) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, this.f$3, 1, this.f$4);
                androidStatement.bindString(2, (String) obj9);
                androidStatement.bindBytes(3, color != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).interceptors).encode(color) : null);
                androidStatement.bindBytes(4, textFormat != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).mappers).encode(textFormat) : null);
                androidStatement.bindBytes(5, list != null ? (byte[]) ((WireRepeatedAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).keyers).encode(list) : null);
                if (num != null) {
                    int intValue = num.intValue();
                    ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).getClass();
                    l = Long.valueOf(intValue);
                } else {
                    l = null;
                }
                androidStatement.bindLong(6, l);
                androidStatement.bindString(7, (String) ((EnumColumnAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).lazyFetcherFactories).encode(releaseState));
                androidStatement.bindBytes(8, list2 != null ? (byte[]) ((WireRepeatedAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).lazyDecoderFactories).encode(list2) : null);
                androidStatement.bindBoolean(9, Boolean.valueOf(z));
                androidStatement.bindString(10, str3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ShoppingWebContainerViewKt$$ExternalSyntheticLambda5(CoroutineScope coroutineScope, ShoppingViewModel shoppingViewModel, String str, String str2, boolean z, Ref$ObjectRef ref$ObjectRef, Ref$IntRef ref$IntRef, Function1 function1, MutableState mutableState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState2, Function7 function7) {
        this.f$1 = coroutineScope;
        this.f$2 = shoppingViewModel;
        this.f$3 = str;
        this.f$4 = str2;
        this.f$5 = z;
        this.f$6 = ref$ObjectRef;
        this.f$7 = ref$IntRef;
        this.f$8 = function1;
        this.f$9 = mutableState;
        this.f$10 = parcelableSnapshotMutableIntState;
        this.f$11 = mutableState2;
        this.f$12 = function7;
    }
}
