package com.fillr.analytics.util;

import android.net.TrafficStats;
import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.squareup.cash.integration.contacts.ContactBook$Contact$DetailedContact;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.contacts.app.AddressBookContact;
import com.squareup.protos.cash.contacts.app.ImageExifData;
import com.squareup.protos.cash.contacts.app.ImageResolution;
import com.squareup.protos.cash.contacts.app.LabeledString;
import com.squareup.protos.cash.contacts.app.PostalAddress;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.exception.AccountNumberRetrievalError;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$$ExternalSyntheticLambda4;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentState;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.error.ErrorScreenKt$$ExternalSyntheticLambda2;
import com.stripe.android.financialconnections.features.error.ErrorViewModel$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class HttpService {
    public static boolean sIsMixpanelBlocked;

    public static final void AttachPaymentContent(Async async, Function0 function0, Function0 function02, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-55472851);
        int i2 = i | (gapComposer.changed(async) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if ((async instanceof Async.Loading) || (async instanceof Async.Uninitialized) || (async instanceof Async.Success)) {
                gapComposer.startReplaceGroup(1177484769);
                ListItemKt.FullScreenGenericLoading(gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (!(async instanceof Async.Fail)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1177481869, false);
                }
                gapComposer.startReplaceGroup(1177486633);
                ErrorContent(((Async.Fail) async).error, function0, function02, function1, gapComposer, i2 & 8176);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorScreenKt$$ExternalSyntheticLambda2(async, function0, function02, function1, i, 1);
        }
    }

    public static final void AttachPaymentScreen(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1538621207);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl = Identity.parentActivity(gapComposer).getViewModel().activityRetainedComponent;
            FinancialConnectionsSessionManifest.Pane pane = AttachPaymentViewModel.PANE;
            daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl.getClass();
            ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
            ErrorViewModel$Companion$$ExternalSyntheticLambda0 errorViewModel$Companion$$ExternalSyntheticLambda0 = new ErrorViewModel$Companion$$ExternalSyntheticLambda0(daggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl, 2);
            ReflectionFactory reflectionFactory = Reflection.factory;
            chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(AttachPaymentViewModel.class), errorViewModel$Companion$$ExternalSyntheticLambda0);
            InitializerViewModelFactory build = chunkIndexMerger.build();
            ViewModelStoreOwner current = LocalViewModelStoreOwner.getCurrent(gapComposer);
            if (current == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            AttachPaymentViewModel attachPaymentViewModel = (AttachPaymentViewModel) ((FinancialConnectionsViewModel) ViewModelKt.viewModel(reflectionFactory.getOrCreateKotlinClass(AttachPaymentViewModel.class), current, build, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, gapComposer));
            FinancialConnectionsSheetNativeViewModel parentViewModel = TaskUtil.parentViewModel(gapComposer);
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(attachPaymentViewModel.stateFlow, gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new Luhn$$ExternalSyntheticLambda0(18);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(true, (Function0) rememberedValue, gapComposer, 54, 0);
            Async async = ((AttachPaymentState) collectAsState.getValue()).linkPaymentAccount;
            boolean changedInstance = gapComposer.changedInstance(attachPaymentViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                ScannerView.AnonymousClass1 anonymousClass1 = new ScannerView.AnonymousClass1(0, attachPaymentViewModel, AttachPaymentViewModel.class, "onSelectAnotherBank", "onSelectAnotherBank()V", 0, 13);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue2 = anonymousClass1;
            }
            Function0 function0 = (Function0) ((KFunction) rememberedValue2);
            boolean changedInstance2 = gapComposer.changedInstance(attachPaymentViewModel);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ScannerView.AnonymousClass1(0, attachPaymentViewModel, AttachPaymentViewModel.class, "onEnterDetailsManually", "onEnterDetailsManually()V", 0, 14);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function0 function02 = (Function0) ((KFunction) rememberedValue3);
            boolean changedInstance3 = gapComposer.changedInstance(parentViewModel);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue4 == neverEqualPolicy) {
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, parentViewModel, FinancialConnectionsSheetNativeViewModel.class, "onCloseFromErrorClick", "onCloseFromErrorClick(Ljava/lang/Throwable;)V", 0, 1);
                gapComposer.updateRememberedValue(textFieldUIKt$TextField$4$1);
                rememberedValue4 = textFieldUIKt$TextField$4$1;
            }
            AttachPaymentContent(async, function0, function02, (Function1) ((KFunction) rememberedValue4), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda0(i, 27);
        }
    }

    public static final void ErrorContent(Throwable th, Function0 function0, Function0 function02, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1107918986);
        int i2 = (gapComposer.changedInstance(th) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.skipToGroupEnd();
        } else if (th instanceof AccountNumberRetrievalError) {
            gapComposer.startReplaceGroup(-441736343);
            ListItemKt.AccountNumberRetrievalErrorContent((AccountNumberRetrievalError) th, function0, function02, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-441729789);
            boolean changedInstance = ((i2 & 7168) == 2048) | gapComposer.changedInstance(th);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AccountPickerScreenKt$$ExternalSyntheticLambda4(function1, th, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ListItemKt.UnclassifiedErrorContent(false, (Function0) rememberedValue, gapComposer, 0, 1);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(th, i, function0, function02, function1, 21);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee A[Catch: all -> 0x0102, TryCatch #1 {all -> 0x0102, blocks: (B:56:0x00e6, B:58:0x00ee, B:60:0x00f6, B:61:0x0101, B:63:0x0105), top: B:55:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] performRequest(String str, HashMap hashMap, SSLSocketFactory sSLSocketFactory) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        OutputStream outputStream;
        OutputStream outputStream2;
        OutputStream outputStream3;
        OutputStream outputStream4;
        OutputStream outputStream5;
        String encodedQuery;
        BufferedOutputStream bufferedOutputStream;
        HttpURLConnection httpURLConnection2 = null;
        r0 = null;
        r0 = null;
        OutputStream outputStream6 = null;
        int i = 0;
        byte[] bArr = null;
        boolean z = false;
        while (i < 3 && !z) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                if (sSLSocketFactory != null) {
                    try {
                        if (httpURLConnection instanceof HttpsURLConnection) {
                            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                        }
                    } catch (EOFException unused) {
                        inputStream = null;
                        outputStream = inputStream;
                        outputStream4 = outputStream;
                        i++;
                        if (outputStream4 != null) {
                            try {
                                outputStream4.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (IOException e) {
                        e = e;
                        inputStream = null;
                        outputStream = null;
                        outputStream5 = outputStream;
                        httpURLConnection2 = httpURLConnection;
                        outputStream2 = outputStream5;
                        try {
                            if (httpURLConnection2.getResponseCode() >= 500 || httpURLConnection2.getResponseCode() > 599) {
                                throw e;
                            }
                            throw new RemoteService$ServiceUnavailableException(httpURLConnection2.getHeaderField("Retry-After"));
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection = httpURLConnection2;
                            outputStream3 = outputStream2;
                            outputStream6 = outputStream3;
                            if (outputStream6 != null) {
                                try {
                                    outputStream6.close();
                                } catch (IOException unused5) {
                                }
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException unused6) {
                                }
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused7) {
                                }
                            }
                            if (httpURLConnection != null) {
                                throw th;
                            }
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = null;
                        outputStream = inputStream;
                        if (outputStream6 != null) {
                        }
                        if (outputStream != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                    }
                }
                httpURLConnection.setConnectTimeout(2000);
                httpURLConnection.setReadTimeout(10000);
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry entry : hashMap.entrySet()) {
                    builder.appendQueryParameter((String) entry.getKey(), entry.getValue().toString());
                }
                encodedQuery = builder.build().getEncodedQuery();
                TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
                httpURLConnection.setFixedLengthStreamingMode(encodedQuery.getBytes().length);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                outputStream = httpURLConnection.getOutputStream();
                try {
                    bufferedOutputStream = new BufferedOutputStream(outputStream);
                } catch (EOFException unused8) {
                    inputStream = null;
                    outputStream4 = null;
                } catch (IOException e2) {
                    e = e2;
                    inputStream = null;
                    outputStream5 = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                }
            } catch (EOFException unused9) {
                httpURLConnection = null;
                inputStream = null;
            } catch (IOException e3) {
                e = e3;
                inputStream = null;
                outputStream = null;
                outputStream2 = null;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
                inputStream = null;
            }
            try {
                bufferedOutputStream.write(encodedQuery.getBytes("UTF-8"));
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                outputStream.close();
                inputStream = httpURLConnection.getInputStream();
                try {
                    bArr = slurp(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    z = true;
                } catch (EOFException unused10) {
                    outputStream = null;
                    outputStream4 = outputStream;
                    i++;
                    if (outputStream4 != null) {
                    }
                    if (outputStream != null) {
                    }
                    if (inputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                } catch (IOException e4) {
                    e = e4;
                    outputStream = null;
                    outputStream5 = outputStream;
                    httpURLConnection2 = httpURLConnection;
                    outputStream2 = outputStream5;
                    if (httpURLConnection2.getResponseCode() >= 500) {
                    }
                    throw e;
                } catch (Throwable th5) {
                    th = th5;
                    outputStream = null;
                    if (outputStream6 != null) {
                    }
                    if (outputStream != null) {
                    }
                    if (inputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                }
            } catch (EOFException unused11) {
                inputStream = null;
                outputStream4 = bufferedOutputStream;
                i++;
                if (outputStream4 != null) {
                }
                if (outputStream != null) {
                }
                if (inputStream != null) {
                }
                if (httpURLConnection != null) {
                }
            } catch (IOException e5) {
                e = e5;
                inputStream = null;
                outputStream5 = bufferedOutputStream;
                httpURLConnection2 = httpURLConnection;
                outputStream2 = outputStream5;
                if (httpURLConnection2.getResponseCode() >= 500) {
                }
                throw e;
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
                outputStream3 = bufferedOutputStream;
                outputStream6 = outputStream3;
                if (outputStream6 != null) {
                }
                if (outputStream != null) {
                }
                if (inputStream != null) {
                }
                if (httpURLConnection != null) {
                }
            }
        }
        return bArr;
    }

    public static byte[] slurp(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        while (true) {
            int read = inputStream.read(bArr, 0, PKIFailureInfo.certRevoked);
            if (read == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static final ArrayList toLabeledDataProto(List list) {
        list.getClass();
        List<ContactBook$Contact$DetailedContact.LabeledData> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (ContactBook$Contact$DetailedContact.LabeledData labeledData : list2) {
            arrayList.add(new LabeledString(labeledData.label, labeledData.value, ByteString.EMPTY));
        }
        return arrayList;
    }

    public static final AddressBookContact toProto(ContactBook$Contact$DetailedContact contactBook$Contact$DetailedContact) {
        boolean z;
        String str;
        ImageResolution imageResolution;
        contactBook$Contact$DetailedContact.getClass();
        String str2 = contactBook$Contact$DetailedContact.lookupKey;
        Long l = contactBook$Contact$DetailedContact.imageWidth;
        Long l2 = contactBook$Contact$DetailedContact.imageHeight;
        String str3 = contactBook$Contact$DetailedContact.namePrefix;
        String str4 = contactBook$Contact$DetailedContact.givenName;
        String str5 = contactBook$Contact$DetailedContact.middleName;
        String str6 = contactBook$Contact$DetailedContact.familyName;
        String str7 = contactBook$Contact$DetailedContact.nameSuffix;
        String str8 = contactBook$Contact$DetailedContact.nickname;
        String str9 = contactBook$Contact$DetailedContact.phoneticGivenName;
        String str10 = contactBook$Contact$DetailedContact.phoneticMiddleName;
        String str11 = contactBook$Contact$DetailedContact.phoneticFamilyName;
        String str12 = contactBook$Contact$DetailedContact.jobTitle;
        String str13 = contactBook$Contact$DetailedContact.departmentName;
        String str14 = contactBook$Contact$DetailedContact.organizationName;
        String str15 = contactBook$Contact$DetailedContact.phoneticOrganizationName;
        List list = contactBook$Contact$DetailedContact.postalAddresses;
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
            ContactBook$Contact$DetailedContact.PostalAddress postalAddress = (ContactBook$Contact$DetailedContact.PostalAddress) it.next();
            arrayList.add(new PostalAddress(postalAddress.street, postalAddress.poBox, postalAddress.neighborhood, postalAddress.city, null, postalAddress.postalCode, postalAddress.country, postalAddress.region, null, null, null, postalAddress.label, ByteString.EMPTY));
        }
        ArrayList labeledDataProto = toLabeledDataProto(contactBook$Contact$DetailedContact.emailAddresses);
        ArrayList labeledDataProto2 = toLabeledDataProto(contactBook$Contact$DetailedContact.canonicalEmailAddresses);
        ArrayList labeledDataProto3 = toLabeledDataProto(contactBook$Contact$DetailedContact.websiteAddresses);
        EmptyList emptyList = EmptyList.INSTANCE;
        ArrayList labeledDataProto4 = toLabeledDataProto(contactBook$Contact$DetailedContact.phoneNumbers);
        ArrayList labeledDataProto5 = toLabeledDataProto(contactBook$Contact$DetailedContact.canonicalPhoneNumbers);
        String str16 = contactBook$Contact$DetailedContact.birthday;
        ArrayList labeledDataProto6 = toLabeledDataProto(contactBook$Contact$DetailedContact.events);
        ArrayList labeledDataProto7 = toLabeledDataProto(contactBook$Contact$DetailedContact.relations);
        boolean z2 = contactBook$Contact$DetailedContact.hasNote;
        boolean z3 = contactBook$Contact$DetailedContact.imagePath != null;
        if (l2 == null || l == null) {
            z = z3;
            str = str6;
            imageResolution = null;
        } else {
            z = z3;
            str = str6;
            imageResolution = new ImageResolution(l, l2, ByteString.EMPTY);
        }
        Long l3 = contactBook$Contact$DetailedContact.imageSizeBytes;
        String str17 = contactBook$Contact$DetailedContact.exifData;
        return new AddressBookContact(str3, str4, str5, str, null, str7, str8, str9, str10, str11, str12, str13, str14, str15, arrayList, labeledDataProto, labeledDataProto3, emptyList, labeledDataProto4, emptyList, str16, null, labeledDataProto6, Boolean.valueOf(z2), labeledDataProto7, Boolean.valueOf(z), imageResolution, l3, str17 != null ? new ImageExifData(str17, ByteString.EMPTY) : null, str2, null, labeledDataProto5, labeledDataProto2, ByteString.EMPTY);
    }
}
