package com.squareup.cash.blockers.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.text.TextUtilsCompat;
import androidx.glance.session.SessionWorkerKt$runSession$4$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafb;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$MetroFactory;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.braze.BrazeInitializer;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cameralauncher.RealCameraLauncher;
import com.squareup.cash.cameralauncher.RealCameraLauncher$Factory$Impl;
import com.squareup.cash.cdf.document.DocumentUploadComplete;
import com.squareup.cash.cdf.document.DocumentUploadReceiveError;
import com.squareup.cash.cdf.document.DocumentUploadStart;
import com.squareup.cash.cdf.document.Trigger;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.contacts.RealContactDetailsSyncState;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalancesStore;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fileupload.api.FileError;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.api.FileUploadService$Result;
import com.squareup.cash.fileupload.api.FileValidator$Result;
import com.squareup.cash.fileupload.api.ImageFormatConverter$ConversionResult;
import com.squareup.cash.fileupload.real.AndroidFileTypeDescriber;
import com.squareup.cash.fileupload.real.RealFileUploadService;
import com.squareup.cash.fileupload.real.RealFileValidator$Factory$Impl;
import com.squareup.cash.fileupload.real.RealImageFormatConverter$Factory$Impl;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.screens.Back;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.protos.cash.cashfileuploads.app.FileUploadsClientService;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitFilesetRequest;
import com.squareup.protos.franklin.app.SubmitFilesetResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class FilesetUploadPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BlockersScreens.FilesetUploadScreen args;
    public final RealBlockersHelper blockersHelper;
    public final BlockersDataNavigator blockersNavigator;
    public final RealCameraLauncher cameraCapturer;
    public final AndroidPermissionManager$create$1 cameraPermission;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final AndroidFileProvider fileProvider;
    public final AndroidFileTypeDescriber fileTypeDescriber;
    public final RealFileUploadService fileUploadService;
    public final RealStrongMemoryCache fileValidator;
    public final AppService franklinAppService;
    public final EglCore imageFormatConverter;
    public final int maxFileCount;
    public final BetterNavigator.ScreenNavigator navigator;
    public final FileUploadsClientService service;
    public final Lazy shouldConvertImages$delegate;
    public final Storage storage;
    public final AndroidStringManager stringManager;
    public final FilesetUploadPresenter$Companion$StringResources stringRes;

    public final class UriToUpload {
        public final Trigger trigger;
        public final String uri;

        public UriToUpload(String str, Trigger trigger) {
            this.uri = str;
            this.trigger = trigger;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UriToUpload)) {
                return false;
            }
            UriToUpload uriToUpload = (UriToUpload) obj;
            return this.uri.equals(uriToUpload.uri) && this.trigger == uriToUpload.trigger;
        }

        public final int hashCode() {
            return this.trigger.hashCode() + (this.uri.hashCode() * 31);
        }

        public final String toString() {
            return "UriToUpload(uri=" + this.uri + ", trigger=" + this.trigger + ")";
        }
    }

    public FilesetUploadPresenter(BlockersScreens.FilesetUploadScreen filesetUploadScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, RealFileUploadService realFileUploadService, FileUploadsClientService fileUploadsClientService, AppService appService, BlockersDataNavigator blockersDataNavigator, AndroidFileTypeDescriber androidFileTypeDescriber, RealFileValidator$Factory$Impl realFileValidator$Factory$Impl, RealImageFormatConverter$Factory$Impl realImageFormatConverter$Factory$Impl, AndroidStringManager androidStringManager, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, ErrorReporter errorReporter, AndroidPermissionManager androidPermissionManager, AndroidFileProvider androidFileProvider, Storage storage, RealCameraLauncher$Factory$Impl realCameraLauncher$Factory$Impl, FeatureFlagManager featureFlagManager) {
        this.args = filesetUploadScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        this.fileUploadService = realFileUploadService;
        this.service = fileUploadsClientService;
        this.franklinAppService = appService;
        this.blockersNavigator = blockersDataNavigator;
        this.fileTypeDescriber = androidFileTypeDescriber;
        this.stringManager = androidStringManager;
        this.errorReporter = errorReporter;
        this.fileProvider = androidFileProvider;
        this.storage = storage;
        this.featureFlagManager = featureFlagManager;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.cameraPermission = androidPermissionManager.create("android.permission.CAMERA");
        ComponentActivity componentActivity = (ComponentActivity) realCameraLauncher$Factory$Impl.delegateFactory.activity.value;
        componentActivity.getClass();
        this.cameraCapturer = new RealCameraLauncher(componentActivity, "FilesetUploadPresenter");
        long j = filesetUploadScreen.fileSizeLimitBytes;
        Long valueOf = j <= 0 ? null : Long.valueOf(j);
        this.fileValidator = RealFileValidator$Factory$Impl.create$default(realFileValidator$Factory$Impl, valueOf != null ? valueOf.longValue() : Long.MAX_VALUE);
        this.imageFormatConverter = realImageFormatConverter$Factory$Impl.create$1();
        this.shouldConvertImages$delegate = LazyKt.lazy(new FilesetUploadPresenter$$ExternalSyntheticLambda1(this, 1));
        int i = filesetUploadScreen.fileCountLimit;
        Integer valueOf2 = i > 0 ? Integer.valueOf(i) : null;
        this.maxFileCount = valueOf2 != null ? valueOf2.intValue() : Integer.MAX_VALUE;
        this.stringRes = new FilesetUploadPresenter$Companion$StringResources();
    }

    public static final Object access$handleBlockerAction(FilesetUploadPresenter filesetUploadPresenter, BlockerAction blockerAction, List list, MutableState mutableState, SuspendLambda suspendLambda) {
        Object handleBlockerAction$default;
        return (blockerAction != null && (handleBlockerAction$default = BlockersHelper.handleBlockerAction$default(filesetUploadPresenter.blockersHelper, blockerAction, filesetUploadPresenter.args, null, null, false, null, new FilesetUploadPresenter$handleBlockerAction$2(mutableState, filesetUploadPresenter, list, null), suspendLambda, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? handleBlockerAction$default : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitFileset(FilesetUploadPresenter filesetUploadPresenter, String str, ArrayList arrayList, ContinuationImpl continuationImpl) {
        FilesetUploadPresenter$submitFileset$1 filesetUploadPresenter$submitFileset$1;
        int i;
        ApiResult apiResult;
        BetterNavigator.ScreenNavigator screenNavigator = filesetUploadPresenter.navigator;
        BlockersScreens.FilesetUploadScreen filesetUploadScreen = filesetUploadPresenter.args;
        BlockersData blockersData = filesetUploadScreen.blockersData;
        if (continuationImpl instanceof FilesetUploadPresenter$submitFileset$1) {
            filesetUploadPresenter$submitFileset$1 = (FilesetUploadPresenter$submitFileset$1) continuationImpl;
            int i2 = filesetUploadPresenter$submitFileset$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                filesetUploadPresenter$submitFileset$1.label = i2 - PKIFailureInfo.systemUnavail;
                FilesetUploadPresenter$submitFileset$1 filesetUploadPresenter$submitFileset$12 = filesetUploadPresenter$submitFileset$1;
                Object obj = filesetUploadPresenter$submitFileset$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = filesetUploadPresenter$submitFileset$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SubmitFilesetRequest submitFilesetRequest = new SubmitFilesetRequest(blockersData.requestContext, str, arrayList, ByteString.EMPTY);
                    Analytics analytics = filesetUploadPresenter.analytics;
                    BlockersData blockersData2 = filesetUploadScreen.blockersData;
                    PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(filesetUploadPresenter, submitFilesetRequest, continuation, 19);
                    filesetUploadPresenter$submitFileset$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData2, analytics, null, filesetUploadPresenter$submitFileset$12, null, pagingDataPresenter$collectFrom$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    screenNavigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(filesetUploadPresenter.stringManager, (ApiResult.Failure) apiResult, null).message, null, 14));
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ResponseContext responseContext = ((SubmitFilesetResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(filesetUploadPresenter.blockersNavigator.getNext(filesetUploadScreen, blockersData.updateFromResponseContext(responseContext, false)));
                }
                return Unit.INSTANCE;
            }
        }
        filesetUploadPresenter$submitFileset$1 = new FilesetUploadPresenter$submitFileset$1(filesetUploadPresenter, continuationImpl);
        FilesetUploadPresenter$submitFileset$1 filesetUploadPresenter$submitFileset$122 = filesetUploadPresenter$submitFileset$1;
        Object obj2 = filesetUploadPresenter$submitFileset$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = filesetUploadPresenter$submitFileset$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
    
        if (r2 == r9) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0077, code lost:
    
        if (r10 == r9) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$uploadFile(FilesetUploadPresenter filesetUploadPresenter, UriToUpload uriToUpload, ContinuationImpl continuationImpl) {
        FilesetUploadPresenter$uploadFile$1 filesetUploadPresenter$uploadFile$1;
        int i;
        String str;
        Object m1457validate8YU3vEA;
        FileValidator$Result fileValidator$Result;
        UriToUpload uriToUpload2;
        ImageFormatConverter$ConversionResult imageFormatConverter$ConversionResult;
        Object m3558uploadkVGMmk0;
        UriToUpload uriToUpload3;
        FileUploadService$Result fileUploadService$Result;
        UriToUpload uriToUpload4 = uriToUpload;
        RealFileUploadService realFileUploadService = filesetUploadPresenter.fileUploadService;
        BetterNavigator.ScreenNavigator screenNavigator = filesetUploadPresenter.navigator;
        Analytics analytics = filesetUploadPresenter.analytics;
        BlockersScreens.FilesetUploadScreen filesetUploadScreen = filesetUploadPresenter.args;
        BlockersData blockersData = filesetUploadScreen.blockersData;
        if (continuationImpl instanceof FilesetUploadPresenter$uploadFile$1) {
            filesetUploadPresenter$uploadFile$1 = (FilesetUploadPresenter$uploadFile$1) continuationImpl;
            int i2 = filesetUploadPresenter$uploadFile$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                filesetUploadPresenter$uploadFile$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = filesetUploadPresenter$uploadFile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = filesetUploadPresenter$uploadFile$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    str = uriToUpload4.uri;
                    screenNavigator.goTo(new BlockersScreens.FilesetUploadLoadingDialog(blockersData));
                    RealStrongMemoryCache realStrongMemoryCache = filesetUploadPresenter.fileValidator;
                    filesetUploadPresenter$uploadFile$1.L$0 = uriToUpload4;
                    filesetUploadPresenter$uploadFile$1.L$1 = str;
                    filesetUploadPresenter$uploadFile$1.label = 1;
                    m1457validate8YU3vEA = realStrongMemoryCache.m1457validate8YU3vEA(str, filesetUploadPresenter$uploadFile$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            uriToUpload4 = filesetUploadPresenter$uploadFile$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            ImageFormatConverter$ConversionResult imageFormatConverter$ConversionResult2 = (ImageFormatConverter$ConversionResult) obj;
                            uriToUpload2 = uriToUpload4;
                            imageFormatConverter$ConversionResult = imageFormatConverter$ConversionResult2;
                            String str2 = imageFormatConverter$ConversionResult.uri;
                            FileMetadata fileMetadata = imageFormatConverter$ConversionResult.metadata;
                            String str3 = filesetUploadScreen.uploadContext;
                            filesetUploadPresenter$uploadFile$1.L$0 = uriToUpload2;
                            filesetUploadPresenter$uploadFile$1.L$1 = null;
                            filesetUploadPresenter$uploadFile$1.L$4 = imageFormatConverter$ConversionResult;
                            filesetUploadPresenter$uploadFile$1.label = 3;
                            m3558uploadkVGMmk0 = realFileUploadService.m3558uploadkVGMmk0(str2, fileMetadata, str3, filesetUploadPresenter$uploadFile$1);
                            if (m3558uploadkVGMmk0 != coroutineSingletons) {
                                uriToUpload3 = uriToUpload2;
                                obj = m3558uploadkVGMmk0;
                                fileUploadService$Result = (FileUploadService$Result) obj;
                                if (!(fileUploadService$Result instanceof FileUploadService$Result.Failure.File)) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        imageFormatConverter$ConversionResult = filesetUploadPresenter$uploadFile$1.L$4;
                        uriToUpload3 = filesetUploadPresenter$uploadFile$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        fileUploadService$Result = (FileUploadService$Result) obj;
                        if (!(fileUploadService$Result instanceof FileUploadService$Result.Failure.File)) {
                            zzafb.logDocumentUploadError(analytics, String.valueOf(blockersData.clientScenario), ((FileUploadService$Result.Failure.File) fileUploadService$Result).fileError, blockersData.flowToken, imageFormatConverter$ConversionResult.metadata.mimeType, uriToUpload3.trigger);
                            filesetUploadPresenter.showUploadError((FileUploadService$Result.Failure) fileUploadService$Result);
                            return null;
                        }
                        if (fileUploadService$Result instanceof FileUploadService$Result.Failure.Delivery) {
                            String valueOf = String.valueOf(blockersData.clientScenario);
                            String str4 = blockersData.flowToken;
                            String str5 = imageFormatConverter$ConversionResult.metadata.mimeType;
                            Integer num = ((FileUploadService$Result.Failure.Delivery) fileUploadService$Result).statusCode;
                            Trigger trigger = uriToUpload3.trigger;
                            str4.getClass();
                            str5.getClass();
                            analytics.track(new DocumentUploadReceiveError(valueOf, null, "Delivery Error", str4, str5, Boolean.TRUE, num, trigger, 2), null);
                            filesetUploadPresenter.showUploadError((FileUploadService$Result.Failure) fileUploadService$Result);
                            return null;
                        }
                        if (!(fileUploadService$Result instanceof FileUploadService$Result.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String valueOf2 = String.valueOf(blockersData.clientScenario);
                        String str6 = blockersData.flowToken;
                        String str7 = imageFormatConverter$ConversionResult.metadata.mimeType;
                        Trigger trigger2 = uriToUpload3.trigger;
                        str6.getClass();
                        str7.getClass();
                        analytics.track(new DocumentUploadComplete(valueOf2, null, str6, str7, null, "FilesetUpload", trigger2, 18), null);
                        screenNavigator.goTo(Back.INSTANCE);
                        String str8 = ((FileUploadService$Result.Success) fileUploadService$Result).fileToken;
                        FileMetadata fileMetadata2 = imageFormatConverter$ConversionResult.metadata;
                        return new FilesetUploadViewModel.FileViewModel(str8, fileMetadata2.displayName, filesetUploadPresenter.fileTypeDescriber.getDescriptionForMimeType(fileMetadata2.mimeType), realFileUploadService.m3557getUriLgIXbgg(str8));
                    }
                    String str9 = filesetUploadPresenter$uploadFile$1.L$1;
                    UriToUpload uriToUpload5 = filesetUploadPresenter$uploadFile$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str = str9;
                    uriToUpload4 = uriToUpload5;
                    m1457validate8YU3vEA = obj;
                }
                fileValidator$Result = (FileValidator$Result) m1457validate8YU3vEA;
                String valueOf3 = String.valueOf(blockersData.clientScenario);
                String str10 = blockersData.flowToken;
                String str11 = fileValidator$Result.getMetadata().mimeType;
                Trigger trigger3 = uriToUpload4.trigger;
                str10.getClass();
                str11.getClass();
                analytics.track(new DocumentUploadStart(valueOf3, str10, str11, null, "FilesetUpload", trigger3, 18), null);
                if (!(fileValidator$Result instanceof FileValidator$Result.Failure)) {
                    String valueOf4 = String.valueOf(blockersData.clientScenario);
                    FileValidator$Result.Failure failure = (FileValidator$Result.Failure) fileValidator$Result;
                    FileError fileError = failure.error;
                    zzafb.logDocumentUploadError(analytics, valueOf4, fileError, blockersData.flowToken, failure.metadata.mimeType, uriToUpload4.trigger);
                    filesetUploadPresenter.showValidationError(fileError);
                    return null;
                }
                FileMetadata metadata = fileValidator$Result.getMetadata();
                if (!((Boolean) filesetUploadPresenter.shouldConvertImages$delegate.getValue()).booleanValue()) {
                    ImageFormatConverter$ConversionResult imageFormatConverter$ConversionResult3 = new ImageFormatConverter$ConversionResult(str, metadata);
                    uriToUpload2 = uriToUpload4;
                    imageFormatConverter$ConversionResult = imageFormatConverter$ConversionResult3;
                    String str22 = imageFormatConverter$ConversionResult.uri;
                    FileMetadata fileMetadata3 = imageFormatConverter$ConversionResult.metadata;
                    String str32 = filesetUploadScreen.uploadContext;
                    filesetUploadPresenter$uploadFile$1.L$0 = uriToUpload2;
                    filesetUploadPresenter$uploadFile$1.L$1 = null;
                    filesetUploadPresenter$uploadFile$1.L$4 = imageFormatConverter$ConversionResult;
                    filesetUploadPresenter$uploadFile$1.label = 3;
                    m3558uploadkVGMmk0 = realFileUploadService.m3558uploadkVGMmk0(str22, fileMetadata3, str32, filesetUploadPresenter$uploadFile$1);
                    if (m3558uploadkVGMmk0 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                EglCore eglCore = filesetUploadPresenter.imageFormatConverter;
                filesetUploadPresenter$uploadFile$1.L$0 = uriToUpload4;
                filesetUploadPresenter$uploadFile$1.L$1 = null;
                filesetUploadPresenter$uploadFile$1.label = 2;
                obj = eglCore.m3562convertIfNeeded5y75sic(str, metadata, filesetUploadPresenter$uploadFile$1);
            }
        }
        filesetUploadPresenter$uploadFile$1 = new FilesetUploadPresenter$uploadFile$1(filesetUploadPresenter, continuationImpl);
        Object obj2 = filesetUploadPresenter$uploadFile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = filesetUploadPresenter$uploadFile$1.label;
        if (i != 0) {
        }
        fileValidator$Result = (FileValidator$Result) m1457validate8YU3vEA;
        String valueOf32 = String.valueOf(blockersData.clientScenario);
        String str102 = blockersData.flowToken;
        String str112 = fileValidator$Result.getMetadata().mimeType;
        Trigger trigger32 = uriToUpload4.trigger;
        str102.getClass();
        str112.getClass();
        analytics.track(new DocumentUploadStart(valueOf32, str102, str112, null, "FilesetUpload", trigger32, 18), null);
        if (!(fileValidator$Result instanceof FileValidator$Result.Failure)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Continuation continuation;
        String str;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1416973639);
        int i2 = 0;
        Object[] objArr = new Object[0];
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = new SsnViewKt$$ExternalSyntheticLambda0(14);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
        Object[] objArr2 = new Object[0];
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == obj) {
            rememberedValue2 = new FilesetUploadPresenter$$ExternalSyntheticLambda1(this, i2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer, 0);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = Updater.mutableStateOf$default(0);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState4 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState5 = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj) {
            rememberedValue6 = Updater.mutableStateOf$default(FilesetUploadViewModel.SubmittingState.IDLE);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState6 = (MutableState) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj) {
            rememberedValue7 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue7;
        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
        boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changed(mutableState);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue8 == obj) {
            Object setNamePresenter$models$1$1$1 = new SetNamePresenter$models$1$1$1(this, mutableState, mutableState4, mutableState3, null, 16);
            gapComposer.updateRememberedValue(setNamePresenter$models$1$1$1);
            rememberedValue8 = setNamePresenter$models$1$1$1;
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue8);
        Updater.LaunchedEffect(gapComposer, flow, new SessionWorkerKt$runSession$4$1(flow, (Continuation) null, this, mutableState4, mutableState3, mutableState2, mutableState6, mutableState5, parcelableSnapshotMutableIntState, mutableState, 4));
        UriToUpload uriToUpload = (UriToUpload) mutableState3.getValue();
        Integer valueOf2 = Integer.valueOf(((Number) mutableState4.getValue()).intValue());
        boolean changedInstance3 = gapComposer.changedInstance(this) | gapComposer.changed(mutableState2);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue9 == obj) {
            continuation = null;
            Object filesetUploadPresenter$models$2$3 = new FilesetUploadPresenter$models$2$3(this, mutableState3, mutableState2, continuation, 3);
            gapComposer.updateRememberedValue(filesetUploadPresenter$models$2$3);
            rememberedValue9 = filesetUploadPresenter$models$2$3;
        } else {
            continuation = null;
        }
        Updater.LaunchedEffect(uriToUpload, valueOf2, (Function2) rememberedValue9, gapComposer);
        BlockersScreens.FilesetUploadScreen filesetUploadScreen = this.args;
        String str2 = filesetUploadScreen.title;
        String str3 = filesetUploadScreen.detailText;
        boolean isEmpty = ((List) mutableState2.getValue()).isEmpty();
        int i3 = this.maxFileCount;
        AndroidStringManager androidStringManager = this.stringManager;
        FilesetUploadPresenter$Companion$StringResources filesetUploadPresenter$Companion$StringResources = this.stringRes;
        if (isEmpty) {
            filesetUploadPresenter$Companion$StringResources.getClass();
            str = androidStringManager.get(R.string.blockers_fileset_upload_attach_button);
        } else if (((List) mutableState2.getValue()).size() >= i3) {
            filesetUploadPresenter$Companion$StringResources.getClass();
            str = androidStringManager.get(R.string.blockers_fileset_upload_attach_button_limit_reached);
        } else {
            filesetUploadPresenter$Companion$StringResources.getClass();
            str = androidStringManager.get(R.string.blockers_fileset_upload_subsequent_files_attach_button);
        }
        String str4 = str;
        boolean z = ((List) mutableState2.getValue()).size() < i3;
        FilesetUploadViewModel.SubmittingState submittingState = (FilesetUploadViewModel.SubmittingState) mutableState6.getValue();
        BlockerAction blockerAction = filesetUploadScreen.primaryAction;
        String str5 = blockerAction != null ? blockerAction.text : continuation;
        boolean z2 = ((List) mutableState2.getValue()).size() >= filesetUploadScreen.minimumFileCount;
        BlockerAction blockerAction2 = filesetUploadScreen.secondaryAction;
        FilesetUploadViewModel filesetUploadViewModel = new FilesetUploadViewModel(str2, str3, str4, z, submittingState, str5, z2, blockerAction2 != null ? blockerAction2.text : continuation, (List) mutableState2.getValue());
        gapComposer.end(false);
        return filesetUploadViewModel;
    }

    public final void showUploadError(FileUploadService$Result.Failure failure) {
        if (failure instanceof FileUploadService$Result.Failure.File) {
            showValidationError(((FileUploadService$Result.Failure.File) failure).fileError);
            return;
        }
        if (!(failure instanceof FileUploadService$Result.Failure.Delivery)) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        this.stringRes.getClass();
        AndroidStringManager androidStringManager = this.stringManager;
        this.navigator.goTo(new BlockersScreens.FilesetUploadErrorDialog(this.args.blockersData, androidStringManager.get(R.string.blockers_fileset_upload_failure_title_arcade), androidStringManager.get(R.string.blockers_fileset_upload_failure_message_arcade), androidStringManager.get(R.string.cancel), ((FileUploadService$Result.Failure.Delivery) failure).retryable));
    }

    public final void showValidationError(FileError fileError) {
        Pair pair;
        AndroidStringManager androidStringManager = this.stringManager;
        String str = androidStringManager.get(R.string.blockers_fileset_upload_invalid_button);
        int ordinal = fileError.ordinal();
        BlockersScreens.FilesetUploadScreen filesetUploadScreen = this.args;
        if (ordinal == 0) {
            pair = new Pair(androidStringManager.get(R.string.blockers_fileset_upload_invalid_title), androidStringManager.get(R.string.blockers_fileset_upload_invalid_message));
        } else if (ordinal == 1) {
            long j = filesetUploadScreen.fileSizeLimitBytes / 1000000;
            this.stringRes.getClass();
            String str2 = androidStringManager.get(R.string.blockers_fileset_upload_invalid_large_title);
            Object[] objArr = {Long.valueOf(j)};
            Resources resources = androidStringManager.resources;
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.blockers_fileset_upload_invalid_large)).format(objArr);
            format2.getClass();
            pair = new Pair(str2, format2);
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            pair = new Pair(androidStringManager.get(R.string.blockers_fileset_upload_invalid_title), androidStringManager.get(R.string.blockers_fileset_upload_invalid_type));
        }
        this.navigator.goTo(new BlockersScreens.FilesetUploadErrorDialog(filesetUploadScreen.blockersData, (String) pair.first, (String) pair.second, str, false));
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final Provider blockersHelperFactory;
        public final Provider blockersNavigator;
        public final Provider cameraLauncherFactory;
        public final LambdaProvider errorReporter;
        public final Provider featureFlagManager;
        public final LambdaProvider fileProvider;
        public final Provider fileTypeDescriber;
        public final DoubleCheck fileUploadService;
        public final Provider fileValidatorFactory;
        public final Provider franklinAppService;
        public final Provider imageFormatConverterFactory;
        public final Provider permissionManager;
        public final DoubleCheck service;
        public final Provider storage;
        public final LambdaProvider stringManager;

        public MetroFactory(RealBrazeManager.MetroFactory metroFactory, RealBrazeManager.MetroFactory metroFactory2, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, RealFileDownloader.MetroFactory metroFactory3, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck4, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory2, LambdaProvider lambdaProvider3, BrazeInitializer.MetroFactory metroFactory4, LambdaProvider lambdaProvider4, LambdaProvider lambdaProvider5, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory3) {
            this.blockersNavigator = metroFactory;
            this.fileTypeDescriber = metroFactory2;
            this.analytics = doubleCheck;
            this.stringManager = lambdaProvider;
            this.fileUploadService = doubleCheck2;
            this.service = doubleCheck3;
            this.fileValidatorFactory = metroFactory3;
            this.imageFormatConverterFactory = musicViewFactory$MetroFactory;
            this.errorReporter = lambdaProvider2;
            this.franklinAppService = doubleCheck4;
            this.blockersHelperFactory = musicViewFactory$MetroFactory2;
            this.fileProvider = lambdaProvider3;
            this.permissionManager = metroFactory4;
            this.storage = lambdaProvider4;
            this.featureFlagManager = lambdaProvider5;
            this.cameraLauncherFactory = musicViewFactory$MetroFactory3;
        }

        public MetroFactory(MoneyUiFactory.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, TemporaryStorage.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider3, DelegateFactory delegateFactory, DoubleCheck doubleCheck4, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory) {
            this.blockersNavigator = metroFactory;
            this.stringManager = lambdaProvider;
            this.analytics = doubleCheck;
            this.fileUploadService = doubleCheck2;
            this.fileTypeDescriber = metroFactory2;
            this.errorReporter = lambdaProvider2;
            this.cameraLauncherFactory = instanceFactory;
            this.service = doubleCheck3;
            this.fileProvider = lambdaProvider3;
            this.storage = delegateFactory;
            this.franklinAppService = doubleCheck4;
            this.featureFlagManager = instanceFactory2;
            this.blockersHelperFactory = instanceFactory3;
            this.fileValidatorFactory = instanceFactory4;
            this.permissionManager = instanceFactory5;
            this.imageFormatConverterFactory = arcadeModule$ProvideHapticVibratorMetroFactory;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, TemporaryStorage.MetroFactory metroFactory, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, RealCurrentUserSetter.MetroFactory metroFactory2, DelegateFactory delegateFactory, DoubleCheck doubleCheck5, RealContactDetailsSyncState.MetroFactory metroFactory3, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, DoubleCheck doubleCheck6) {
            this.stringManager = lambdaProvider;
            this.analytics = doubleCheck;
            this.blockersNavigator = metroFactory;
            this.errorReporter = lambdaProvider2;
            this.fileUploadService = doubleCheck2;
            this.fileProvider = lambdaProvider3;
            this.service = doubleCheck3;
            this.franklinAppService = doubleCheck4;
            this.blockersHelperFactory = metroFactory2;
            this.permissionManager = delegateFactory;
            this.storage = doubleCheck5;
            this.fileTypeDescriber = metroFactory3;
            this.fileValidatorFactory = instanceFactory;
            this.cameraLauncherFactory = instanceFactory2;
            this.imageFormatConverterFactory = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.featureFlagManager = doubleCheck6;
        }

        public MetroFactory(DoubleCheck doubleCheck, RetroUiFactory.MetroFactory metroFactory, RealKeyStoreProvider.MetroFactory metroFactory2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, MLKitTitleGenerator$MetroFactory mLKitTitleGenerator$MetroFactory, InstanceFactory instanceFactory, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider2, RealMessageSigner.MetroFactory metroFactory3, RealDependentBalancesStore.MetroFactory metroFactory4, LambdaProvider lambdaProvider3, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5) {
            this.analytics = doubleCheck;
            this.blockersNavigator = metroFactory;
            this.fileTypeDescriber = metroFactory2;
            this.stringManager = lambdaProvider;
            this.fileUploadService = doubleCheck2;
            this.fileValidatorFactory = mLKitTitleGenerator$MetroFactory;
            this.imageFormatConverterFactory = instanceFactory;
            this.service = doubleCheck3;
            this.errorReporter = lambdaProvider2;
            this.blockersHelperFactory = metroFactory3;
            this.permissionManager = metroFactory4;
            this.fileProvider = lambdaProvider3;
            this.cameraLauncherFactory = instanceFactory2;
            this.franklinAppService = instanceFactory3;
            this.storage = instanceFactory4;
            this.featureFlagManager = instanceFactory5;
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, RealPasscodeFlowStarter.MetroFactory metroFactory, DoubleCheck doubleCheck2, RealSessionFlags.MetroFactory metroFactory2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, BorrowUiFactory.MetroFactory metroFactory3, BorrowUiFactory.MetroFactory metroFactory4, RealSessionFlags.MetroFactory metroFactory5, IntentLauncher.MetroFactory metroFactory6, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck6) {
            this.analytics = doubleCheck;
            this.stringManager = lambdaProvider;
            this.errorReporter = lambdaProvider2;
            this.blockersNavigator = metroFactory;
            this.fileTypeDescriber = doubleCheck2;
            this.fileValidatorFactory = metroFactory2;
            this.fileUploadService = doubleCheck3;
            this.imageFormatConverterFactory = instanceFactory;
            this.service = doubleCheck4;
            this.franklinAppService = doubleCheck5;
            this.blockersHelperFactory = metroFactory3;
            this.permissionManager = metroFactory4;
            this.featureFlagManager = metroFactory5;
            this.cameraLauncherFactory = metroFactory6;
            this.fileProvider = lambdaProvider3;
            this.storage = doubleCheck6;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, RealBrazeManager.MetroFactory metroFactory, FillrInitializer.MetroFactory metroFactory2, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, LambdaProvider lambdaProvider, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck6, InstanceFactory instanceFactory4, DoubleCheck doubleCheck7) {
            this.analytics = doubleCheck;
            this.fileUploadService = doubleCheck2;
            this.service = doubleCheck3;
            this.franklinAppService = doubleCheck4;
            this.blockersNavigator = metroFactory;
            this.fileTypeDescriber = metroFactory2;
            this.fileValidatorFactory = instanceFactory;
            this.imageFormatConverterFactory = instanceFactory2;
            this.stringManager = lambdaProvider;
            this.blockersHelperFactory = instanceFactory3;
            this.errorReporter = lambdaProvider2;
            this.permissionManager = doubleCheck5;
            this.fileProvider = lambdaProvider3;
            this.storage = doubleCheck6;
            this.cameraLauncherFactory = instanceFactory4;
            this.featureFlagManager = doubleCheck7;
        }
    }
}
