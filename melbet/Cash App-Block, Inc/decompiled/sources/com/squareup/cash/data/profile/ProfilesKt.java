package com.squareup.cash.data.profile;

import android.net.TrafficStats;
import android.util.Base64;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.paging.PageFetcher$flow$1;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.apiclient.FillrWidgetResponse;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.common.base.Joiner;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda10;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.exception.PartnerAuthError;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.error.ErrorScreenKt$$ExternalSyntheticLambda2;
import com.stripe.android.financialconnections.features.error.ErrorState;
import com.stripe.android.financialconnections.features.error.ErrorViewModel;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import net.oneformapp.PopEncryptorV2_;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class ProfilesKt {
    public static final void ErrorContent(Throwable th, boolean z, Function0 function0, Function0 function02, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        boolean z2 = z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1831008218);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(th) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function12 = function1;
            i2 |= gapComposer.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            function12 = function1;
        }
        int i3 = i2;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer.skipToGroupEnd();
        } else if (th instanceof InstitutionPlannedDowntimeError) {
            gapComposer.startReplaceGroup(1337702537);
            int i4 = i3 >> 3;
            ListItemKt.InstitutionPlannedDowntimeErrorContent((InstitutionPlannedDowntimeError) th, function0, function02, gapComposer, (i3 & 14) | (i4 & 112) | (i4 & 896));
            gapComposer.end(false);
        } else if (th instanceof InstitutionUnplannedDowntimeError) {
            gapComposer.startReplaceGroup(1337710379);
            int i5 = i3 >> 3;
            ListItemKt.InstitutionUnplannedDowntimeErrorContent((InstitutionUnplannedDowntimeError) th, function0, function02, gapComposer, (i3 & 14) | (i5 & 112) | (i5 & 896));
            gapComposer.end(false);
        } else if (th instanceof PartnerAuthError) {
            gapComposer.startReplaceGroup(1337717638);
            ListItemKt.InstitutionUnknownErrorContent(function0, gapComposer, (i3 >> 6) & 14);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1337721443);
            boolean changedInstance = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | gapComposer.changedInstance(th);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                ShiftListViewKt$$ExternalSyntheticLambda10 shiftListViewKt$$ExternalSyntheticLambda10 = new ShiftListViewKt$$ExternalSyntheticLambda10(z2, function02, function12, th, 7);
                z2 = z2;
                gapComposer.updateRememberedValue(shiftListViewKt$$ExternalSyntheticLambda10);
                rememberedValue = shiftListViewKt$$ExternalSyntheticLambda10;
            }
            ListItemKt.UnclassifiedErrorContent(z2, (Function0) rememberedValue, gapComposer, (i3 >> 3) & 14, 0);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(th, z2, function0, function02, function1, i, 22);
        }
    }

    public static final void ErrorScreen(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1804679152);
        int i2 = 0;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            FinancialConnectionsSessionManifest.Pane pane = ErrorViewModel.PANE;
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, i2);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(ErrorViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ErrorViewModel errorViewModel = (ErrorViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(ErrorViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            Object parentViewModel = TaskUtil.parentViewModel(gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new Luhn$$ExternalSyntheticLambda0(26);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(true, (Function0) rememberedValue, gapComposer, 54, 0);
            Async async = ((ErrorState) StateFlowsComposeKt.collectAsState(errorViewModel.stateFlow, gapComposer).getValue()).payload;
            boolean changedInstance = gapComposer.changedInstance(errorViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                Object anonymousClass1 = new ScannerView.AnonymousClass1(0, errorViewModel, ErrorViewModel.class, "onManualEntryClick", "onManualEntryClick()V", 0, 17);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue2 = anonymousClass1;
            }
            KFunction kFunction = (KFunction) rememberedValue2;
            boolean changedInstance2 = gapComposer.changedInstance(errorViewModel);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == obj) {
                rememberedValue3 = new PageFetcher$flow$1.AnonymousClass2.AnonymousClass1(0, errorViewModel, ErrorViewModel.class, "onSelectAnotherBank", "onSelectAnotherBank()Lkotlinx/coroutines/Job;", 8, 2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function0 function0 = (Function0) rememberedValue3;
            boolean changedInstance3 = gapComposer.changedInstance(parentViewModel);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue4 == obj) {
                Object textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, parentViewModel, FinancialConnectionsSheetNativeViewModel.class, "onCloseFromErrorClick", "onCloseFromErrorClick(Ljava/lang/Throwable;)V", 0, 3);
                gapComposer.updateRememberedValue(textFieldUIKt$TextField$4$1);
                rememberedValue4 = textFieldUIKt$TextField$4$1;
            }
            ErrorContent(async, function0, (Function0) kFunction, (Function1) ((KFunction) rememberedValue4), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ExitViewModel$$ExternalSyntheticLambda0(i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FillrWidgetResponse getWidgetResponse(String str, PopEncryptorV2_ popEncryptorV2_, String str2) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        FillrWidget.WidgetType widgetType;
        InputStream inputStream2 = null;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            URL url = new URL(str);
            Fillr fillr = Fillr.getInstance();
            httpURLConnection = fillr != null ? fillr.globalTlsProxyEnabled : false ? (HttpURLConnection) url.openConnection(Proxy.NO_PROXY) : (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("If-None-Match", str2);
                }
                if (popEncryptorV2_ != null && (widgetType = (FillrWidget.WidgetType) popEncryptorV2_.cryptor) != null && widgetType.reqAuth) {
                    if (!str.toLowerCase().startsWith("https")) {
                        throw new Exception("Please use a secure content URL");
                    }
                    Joiner joiner = (Joiner) popEncryptorV2_.authStore;
                    joiner.getClass();
                    httpURLConnection.setRequestProperty("Authorization", "Basic " + Base64.encodeToString("cashapp:".concat(joiner.separator).getBytes(), 0));
                }
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    if (responseCode == 304) {
                        FillrWidgetResponse fillrWidgetResponse = new FillrWidgetResponse(null, null, responseCode, httpURLConnection.getHeaderField("etag"));
                        httpURLConnection.disconnect();
                        return fillrWidgetResponse;
                    }
                    if (responseCode != 401) {
                        httpURLConnection.disconnect();
                        return null;
                    }
                    FillrWidgetResponse fillrWidgetResponse2 = new FillrWidgetResponse(null, null, responseCode, null);
                    httpURLConnection.disconnect();
                    return fillrWidgetResponse2;
                }
                inputStream = httpURLConnection.getInputStream();
                try {
                    try {
                        String headerField = httpURLConnection.getHeaderField("Content-Encoding");
                        if (headerField != null && "gzip".equalsIgnoreCase(headerField)) {
                            inputStream = new GZIPInputStream(inputStream);
                        }
                        FillrWidgetResponse fillrWidgetResponse3 = new FillrWidgetResponse(httpURLConnection.getHeaderField("x-amz-meta-checksum_source"), inputStream, responseCode, httpURLConnection.getHeaderField("etag"));
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        httpURLConnection.disconnect();
                        return fillrWidgetResponse3;
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    if (httpURLConnection != null) {
                        throw th;
                    }
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                if (httpURLConnection != null) {
                }
            }
        } catch (Exception e6) {
            e = e6;
            inputStream = null;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }

    public static final Badge profileBadge(PublicProfile publicProfile, boolean z) {
        if (Intrinsics.areEqual(publicProfile.isVerifiedAccount, Boolean.TRUE)) {
            return Badge.VERIFIED;
        }
        if (z) {
            return Badge.BUSINESS;
        }
        return null;
    }

    public static final void ErrorContent(Async async, Function0 function0, Function0 function02, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(700717446);
        int i2 = (gapComposer.changedInstance(async) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            if (!Intrinsics.areEqual(async, Async.Uninitialized.INSTANCE) && !(async instanceof Async.Loading)) {
                if (async instanceof Async.Success) {
                    gapComposer.startReplaceGroup(-920387939);
                    ErrorState.Payload payload = (ErrorState.Payload) ((Async.Success) async).value;
                    ErrorContent(payload.error, payload.allowManualEntry, function0, function02, function1, gapComposer, 65408 & (i2 << 3));
                    gapComposer.end(false);
                } else if (async instanceof Async.Fail) {
                    gapComposer.startReplaceGroup(-920375098);
                    int i3 = i2 << 3;
                    ErrorContent(((Async.Fail) async).error, false, function0, function02, function1, gapComposer, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344));
                    gapComposer.end(false);
                } else {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -920393134, false);
                }
            } else {
                gapComposer.startReplaceGroup(-920391968);
                ListItemKt.FullScreenGenericLoading(gapComposer, 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorScreenKt$$ExternalSyntheticLambda2(async, function0, function02, function1, i, 0);
        }
    }
}
