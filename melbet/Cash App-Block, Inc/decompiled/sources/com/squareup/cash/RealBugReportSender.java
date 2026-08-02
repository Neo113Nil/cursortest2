package com.squareup.cash;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.fillr.e;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.bugreporting.viewmodels.BugReport;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticAttachments;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticContext;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.AddBugReportAttachmentRequest;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.Attachment;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.AttachmentIdentifier;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.BugReportService;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CreateBugReportResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.ByteStreamsKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class RealBugReportSender {
    public final e backStackDumper;
    public final BugReportService bugReportService;
    public final BugsnagClient bugsnagClient;
    public final CashAccountDatabaseImpl cashDatabase;
    public final String endpoint;
    public final Context endpointContext;
    public final BinaryBitmap featureEligibilityDumper;
    public final SharedPreferences preferences;
    public final KeyValue recentMoneybotSession;
    public final CoroutineScope scope;
    public final SessionManager sessionManager;
    public final TemporaryStorage tempStorage;

    public final class BugReportFiles {
        public final File backStackFile;
        public final File dbFile;
        public final File debugPreferencesFile;
        public final File dir;
        public final File logFile;
        public final File preferencesFile;
        public final File singleAccountHolderEligibilityFile;
        public final File viewHierarchyFile;

        public BugReportFiles(File file) {
            file.getClass();
            this.dir = file;
            this.logFile = new File(file, "log.txt");
            this.dbFile = new File(file, "database.db");
            this.preferencesFile = new File(file, "preferences.json");
            this.debugPreferencesFile = new File(file, "debug-preferences.json");
            this.viewHierarchyFile = new File(file, "view-hierarchy.txt");
            this.backStackFile = new File(file, "back-stack.txt");
            this.singleAccountHolderEligibilityFile = new File(file, "sam-feature-eligibility.txt");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BugReportFiles) && Intrinsics.areEqual(this.dir, ((BugReportFiles) obj).dir);
        }

        public final int hashCode() {
            return this.dir.hashCode();
        }

        public final String toString() {
            return "BugReportFiles(dir=" + this.dir + ")";
        }
    }

    public RealBugReportSender(BugReportService bugReportService, SessionManager sessionManager, TemporaryStorage temporaryStorage, SharedPreferences sharedPreferences, String str, e eVar, BinaryBitmap binaryBitmap, CashAccountDatabaseImpl cashAccountDatabaseImpl, Context context, CoroutineScope coroutineScope, BugsnagClient bugsnagClient, KeyValue keyValue) {
        this.bugReportService = bugReportService;
        this.sessionManager = sessionManager;
        this.tempStorage = temporaryStorage;
        this.preferences = sharedPreferences;
        this.endpoint = str;
        this.backStackDumper = eVar;
        this.featureEligibilityDumper = binaryBitmap;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.endpointContext = context;
        this.scope = coroutineScope;
        this.bugsnagClient = bugsnagClient;
        this.recentMoneybotSession = keyValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0145 -> B:14:0x014a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$uploadDiagnosticAttachments(RealBugReportSender realBugReportSender, CreateBugReportResponse createBugReportResponse, BugReport bugReport, DiagnosticContext diagnosticContext, List list, ContinuationImpl continuationImpl) {
        RealBugReportSender$uploadDiagnosticAttachments$1 realBugReportSender$uploadDiagnosticAttachments$1;
        int i;
        BugReport bugReport2;
        DiagnosticContext diagnosticContext2;
        CreateBugReportResponse createBugReportResponse2;
        List list2;
        File file;
        CreateBugReportResponse createBugReportResponse3;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        List list3;
        Iterator it;
        List list4;
        CreateBugReportResponse createBugReportResponse4;
        int i2;
        int i3;
        Object failure2;
        realBugReportSender.getClass();
        if (continuationImpl instanceof RealBugReportSender$uploadDiagnosticAttachments$1) {
            realBugReportSender$uploadDiagnosticAttachments$1 = (RealBugReportSender$uploadDiagnosticAttachments$1) continuationImpl;
            int i4 = realBugReportSender$uploadDiagnosticAttachments$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realBugReportSender$uploadDiagnosticAttachments$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = realBugReportSender$uploadDiagnosticAttachments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBugReportSender$uploadDiagnosticAttachments$1.label;
                int i5 = 0;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TemporaryStorage temporaryStorage = realBugReportSender.tempStorage;
                    realBugReportSender$uploadDiagnosticAttachments$1.L$0 = createBugReportResponse;
                    bugReport2 = bugReport;
                    realBugReportSender$uploadDiagnosticAttachments$1.L$1 = bugReport2;
                    realBugReportSender$uploadDiagnosticAttachments$1.L$2 = diagnosticContext;
                    realBugReportSender$uploadDiagnosticAttachments$1.L$3 = list;
                    realBugReportSender$uploadDiagnosticAttachments$1.label = 1;
                    obj = JobKt.withContext(temporaryStorage.ioDispatcher, new TemporaryStorage$getDir$2(temporaryStorage, continuation, i5), realBugReportSender$uploadDiagnosticAttachments$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    diagnosticContext2 = diagnosticContext;
                    createBugReportResponse2 = createBugReportResponse;
                    list2 = list;
                } else if (i == 1) {
                    list2 = realBugReportSender$uploadDiagnosticAttachments$1.L$3;
                    diagnosticContext2 = realBugReportSender$uploadDiagnosticAttachments$1.L$2;
                    bugReport2 = realBugReportSender$uploadDiagnosticAttachments$1.L$1;
                    createBugReportResponse2 = realBugReportSender$uploadDiagnosticAttachments$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i == 2) {
                    list2 = realBugReportSender$uploadDiagnosticAttachments$1.L$3;
                    createBugReportResponse3 = realBugReportSender$uploadDiagnosticAttachments$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        failure = (List) obj;
                        Result.Companion companion = Result.Companion;
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        if (failure instanceof Result.Failure) {
                        }
                        list3 = (List) failure;
                        if (list3 != null) {
                        }
                    }
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                    if (m4120exceptionOrNullimpl != null) {
                        Timber.Forest.e("Failed to create diagnostic files", new Object[0], m4120exceptionOrNullimpl);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    list3 = (List) failure;
                    if (list3 != null) {
                        return Unit.INSTANCE;
                    }
                    it = list3.iterator();
                    list4 = list2;
                    createBugReportResponse4 = createBugReportResponse3;
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = realBugReportSender$uploadDiagnosticAttachments$1.I$1;
                    i3 = realBugReportSender$uploadDiagnosticAttachments$1.I$0;
                    File file2 = realBugReportSender$uploadDiagnosticAttachments$1.L$9;
                    it = realBugReportSender$uploadDiagnosticAttachments$1.L$7;
                    list4 = realBugReportSender$uploadDiagnosticAttachments$1.L$3;
                    createBugReportResponse4 = realBugReportSender$uploadDiagnosticAttachments$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.Companion;
                        failure2 = new Result.Failure(th2);
                    }
                    failure2 = (ApiResult) obj;
                    Result.Companion companion4 = Result.Companion;
                    Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure2);
                    if (m4120exceptionOrNullimpl2 != null) {
                        Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Exception uploading diagnostic file: ", file2.getName()), new Object[0], m4120exceptionOrNullimpl2);
                    }
                    i2 = i6;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i7 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        File file3 = (File) next;
                        try {
                        } catch (Throwable th3) {
                            file2 = file3;
                            i6 = i7;
                            Result.Companion companion5 = Result.Companion;
                            failure2 = new Result.Failure(th3);
                        }
                        Result.Companion companion6 = Result.Companion;
                        AttachmentIdentifier attachmentIdentifier = (AttachmentIdentifier) list4.get(i2);
                        byte[] readBytes = FilesKt__FileReadWriteKt.readBytes(file3);
                        String name = file3.getName();
                        ByteString.Companion companion7 = ByteString.Companion;
                        AddBugReportAttachmentRequest addBugReportAttachmentRequest = new AddBugReportAttachmentRequest(createBugReportResponse4.bug_report_id, new Attachment(attachmentIdentifier, name, ByteString.Companion.of$default(readBytes)));
                        BugReportService bugReportService = realBugReportSender.bugReportService;
                        realBugReportSender$uploadDiagnosticAttachments$1.L$0 = createBugReportResponse4;
                        realBugReportSender$uploadDiagnosticAttachments$1.L$1 = null;
                        realBugReportSender$uploadDiagnosticAttachments$1.L$2 = null;
                        realBugReportSender$uploadDiagnosticAttachments$1.L$3 = list4;
                        realBugReportSender$uploadDiagnosticAttachments$1.L$7 = it;
                        realBugReportSender$uploadDiagnosticAttachments$1.L$9 = file3;
                        realBugReportSender$uploadDiagnosticAttachments$1.I$0 = i3;
                        realBugReportSender$uploadDiagnosticAttachments$1.I$1 = i7;
                        realBugReportSender$uploadDiagnosticAttachments$1.label = 3;
                        obj = bugReportService.addBugReportAttachment(addBugReportAttachmentRequest, realBugReportSender$uploadDiagnosticAttachments$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        file2 = file3;
                        i6 = i7;
                        failure2 = (ApiResult) obj;
                        Result.Companion companion42 = Result.Companion;
                        Throwable m4120exceptionOrNullimpl22 = Result.m4120exceptionOrNullimpl(failure2);
                        if (m4120exceptionOrNullimpl22 != null) {
                        }
                        i2 = i6;
                        if (it.hasNext()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
                file = (File) obj;
                if (file != null) {
                    Timber.Forest.e("Failed to get temp directory for bug report", new Object[0]);
                    return Unit.INSTANCE;
                }
                try {
                    Result.Companion companion8 = Result.Companion;
                    realBugReportSender$uploadDiagnosticAttachments$1.L$0 = createBugReportResponse2;
                    realBugReportSender$uploadDiagnosticAttachments$1.L$1 = null;
                    realBugReportSender$uploadDiagnosticAttachments$1.L$2 = null;
                    realBugReportSender$uploadDiagnosticAttachments$1.L$3 = list2;
                    realBugReportSender$uploadDiagnosticAttachments$1.I$0 = 0;
                    realBugReportSender$uploadDiagnosticAttachments$1.label = 2;
                    obj = realBugReportSender.writeData(file, bugReport2, diagnosticContext2, realBugReportSender$uploadDiagnosticAttachments$1);
                } catch (Throwable th4) {
                    th = th4;
                    createBugReportResponse3 = createBugReportResponse2;
                    Result.Companion companion22 = Result.Companion;
                    failure = new Result.Failure(th);
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                    if (m4120exceptionOrNullimpl != null) {
                    }
                    if (failure instanceof Result.Failure) {
                    }
                    list3 = (List) failure;
                    if (list3 != null) {
                    }
                }
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                createBugReportResponse3 = createBugReportResponse2;
                failure = (List) obj;
                Result.Companion companion9 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                }
                if (failure instanceof Result.Failure) {
                }
                list3 = (List) failure;
                if (list3 != null) {
                }
            }
        }
        realBugReportSender$uploadDiagnosticAttachments$1 = new RealBugReportSender$uploadDiagnosticAttachments$1(realBugReportSender, continuationImpl);
        Object obj2 = realBugReportSender$uploadDiagnosticAttachments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBugReportSender$uploadDiagnosticAttachments$1.label;
        int i52 = 0;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        file = (File) obj2;
        if (file != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$uploadNavigationBreadcrumbs(RealBugReportSender realBugReportSender, CreateBugReportResponse createBugReportResponse, Pair pair, ContinuationImpl continuationImpl) {
        RealBugReportSender$uploadNavigationBreadcrumbs$1 realBugReportSender$uploadNavigationBreadcrumbs$1;
        int i;
        File file;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        realBugReportSender.getClass();
        if (continuationImpl instanceof RealBugReportSender$uploadNavigationBreadcrumbs$1) {
            realBugReportSender$uploadNavigationBreadcrumbs$1 = (RealBugReportSender$uploadNavigationBreadcrumbs$1) continuationImpl;
            int i2 = realBugReportSender$uploadNavigationBreadcrumbs$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBugReportSender$uploadNavigationBreadcrumbs$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBugReportSender$uploadNavigationBreadcrumbs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBugReportSender$uploadNavigationBreadcrumbs$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    File file2 = (File) pair.first;
                    AttachmentIdentifier attachmentIdentifier = (AttachmentIdentifier) pair.second;
                    try {
                        Result.Companion companion = Result.Companion;
                        byte[] readBytes = FilesKt__FileReadWriteKt.readBytes(file2);
                        String name = file2.getName();
                        ByteString.Companion companion2 = ByteString.Companion;
                        AddBugReportAttachmentRequest addBugReportAttachmentRequest = new AddBugReportAttachmentRequest(createBugReportResponse.bug_report_id, new Attachment(attachmentIdentifier, name, ByteString.Companion.of$default(readBytes)));
                        BugReportService bugReportService = realBugReportSender.bugReportService;
                        realBugReportSender$uploadNavigationBreadcrumbs$1.L$2 = file2;
                        realBugReportSender$uploadNavigationBreadcrumbs$1.label = 1;
                        Object addBugReportAttachment = bugReportService.addBugReportAttachment(addBugReportAttachmentRequest, realBugReportSender$uploadNavigationBreadcrumbs$1);
                        if (addBugReportAttachment == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = addBugReportAttachment;
                        file = file2;
                    } catch (Throwable th) {
                        th = th;
                        file = file2;
                        Result.Companion companion3 = Result.Companion;
                        failure = new Result.Failure(th);
                        if (!(failure instanceof Result.Failure)) {
                        }
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    file = realBugReportSender$uploadNavigationBreadcrumbs$1.L$2;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion32 = Result.Companion;
                        failure = new Result.Failure(th);
                        if (!(failure instanceof Result.Failure)) {
                        }
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                failure = (ApiResult) obj;
                Result.Companion companion4 = Result.Companion;
                if (!(failure instanceof Result.Failure)) {
                    try {
                        file.delete();
                    } catch (Throwable unused) {
                        Result.Companion companion5 = Result.Companion;
                    }
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    Timber.Forest.e("Exception uploading navigation breadcrumbs file", new Object[0], m4120exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
        }
        realBugReportSender$uploadNavigationBreadcrumbs$1 = new RealBugReportSender$uploadNavigationBreadcrumbs$1(realBugReportSender, continuationImpl);
        Object obj2 = realBugReportSender$uploadNavigationBreadcrumbs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBugReportSender$uploadNavigationBreadcrumbs$1.label;
        if (i != 0) {
        }
        failure = (ApiResult) obj2;
        Result.Companion companion42 = Result.Companion;
        if (!(failure instanceof Result.Failure)) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable writeData(File file, BugReport bugReport, DiagnosticContext diagnosticContext, ContinuationImpl continuationImpl) {
        RealBugReportSender$writeData$1 realBugReportSender$writeData$1;
        int i;
        Object collection;
        BugReportFiles bugReportFiles;
        Iterator it;
        if (continuationImpl instanceof RealBugReportSender$writeData$1) {
            realBugReportSender$writeData$1 = (RealBugReportSender$writeData$1) continuationImpl;
            int i2 = realBugReportSender$writeData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBugReportSender$writeData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBugReportSender$writeData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBugReportSender$writeData$1.label;
                int i3 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BugReportFiles bugReportFiles2 = new BugReportFiles(file);
                    ArrayList arrayList = new ArrayList();
                    DiagnosticAttachments diagnosticAttachments = bugReport.diagnosticAttachments;
                    int i4 = 27;
                    int i5 = 21;
                    int i6 = 19;
                    int i7 = 3;
                    if (diagnosticAttachments.includeViewHierarchy) {
                        arrayList.add(new FinishSetupTileBadgeCounter(i5, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new AppLockMonitor$special$$inlined$map$2(bugReportFiles2.viewHierarchyFile, i6), new EventBridge$sendEvent$1(diagnosticContext, continuation, i4), 3), new RealBugReportSender$copyDatabase$3(i7, continuation, i7)));
                    }
                    if (diagnosticAttachments.includeBackStack) {
                        arrayList.add(new FinishSetupTileBadgeCounter(i5, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new AppLockMonitor$special$$inlined$map$2(bugReportFiles2.backStackFile, i6), new AnimatedImageDecoder$wrapDrawable$2(diagnosticContext, this, continuation, 26), 3), new RealBugReportSender$copyDatabase$3(i7, continuation, i3)));
                    }
                    DiagnosticAttachments diagnosticAttachments2 = bugReport.diagnosticAttachments;
                    if (diagnosticAttachments2.includeDatabase) {
                        int i8 = 0;
                        arrayList.add(new FinishSetupTileBadgeCounter(i5, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new AppLockMonitor$special$$inlined$map$2(bugReportFiles2.dbFile, i6), new DiskLruCache$launchCleanup$1(this, continuation, 28), 3), new RealBugReportSender$copyDatabase$2(this, continuation, i8), 3), new RealBugReportSender$copyDatabase$3(i7, continuation, i8)));
                    }
                    if (diagnosticAttachments2.includePreferences) {
                        arrayList.add(new FinishSetupTileBadgeCounter(i5, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new AppLockMonitor$special$$inlined$map$2(bugReportFiles2.preferencesFile, i6), new AnimatedImageDecoder$wrapDrawable$2(this, this.preferences, continuation, 27), 3), new RealBugReportSender$copyDatabase$3(i7, continuation, 4)));
                    }
                    if (diagnosticAttachments2.includeSamEligibility) {
                        int i9 = 1;
                        arrayList.add(new FinishSetupTileBadgeCounter(i5, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new AppLockMonitor$special$$inlined$map$2(bugReportFiles2.singleAccountHolderEligibilityFile, i6), new RealBugReportSender$copyDatabase$2(this, continuation, i9), 3), new RealBugReportSender$copyDatabase$3(i7, continuation, i9)));
                    }
                    int i10 = FlowKt__MergeKt.DEFAULT_CONCURRENCY;
                    ChannelFlowBuilder channelFlowBuilder = new ChannelFlowBuilder(arrayList, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND, 1);
                    realBugReportSender$writeData$1.L$3 = bugReportFiles2;
                    realBugReportSender$writeData$1.label = 2;
                    collection = FlowKt__CollectionKt.toCollection(channelFlowBuilder, new ArrayList(), realBugReportSender$writeData$1);
                    if (collection == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bugReportFiles = bugReportFiles2;
                } else {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        throw null;
                    }
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bugReportFiles = realBugReportSender$writeData$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                }
                ArrayList arrayList2 = new ArrayList();
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new File[]{bugReportFiles.viewHierarchyFile, bugReportFiles.backStackFile, bugReportFiles.logFile});
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listOf) {
                    if (((File) obj2).exists()) {
                        arrayList3.add(obj2);
                    }
                }
                it = arrayList3.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    File file3 = new File(file2.getParentFile(), Recorder$$ExternalSyntheticOutline2.m$1(file2.getName(), ".zip"));
                    ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file3), PKIFailureInfo.certRevoked));
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        try {
                            ByteStreamsKt.copyTo$default(fileInputStream, zipOutputStream);
                            fileInputStream.close();
                            zipOutputStream.closeEntry();
                            zipOutputStream.close();
                            arrayList2.add(file3);
                        } finally {
                        }
                    } finally {
                    }
                }
                List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new File[]{bugReportFiles.dbFile, bugReportFiles.preferencesFile, bugReportFiles.debugPreferencesFile, bugReportFiles.singleAccountHolderEligibilityFile});
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : listOf2) {
                    if (((File) obj3).exists()) {
                        arrayList4.add(obj3);
                    }
                }
                CollectionsKt.toCollection(arrayList4, arrayList2);
                return arrayList2;
            }
        }
        realBugReportSender$writeData$1 = new RealBugReportSender$writeData$1(this, continuationImpl);
        Object obj4 = realBugReportSender$writeData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBugReportSender$writeData$1.label;
        int i32 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ArrayList arrayList22 = new ArrayList();
        List listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new File[]{bugReportFiles.viewHierarchyFile, bugReportFiles.backStackFile, bugReportFiles.logFile});
        ArrayList arrayList32 = new ArrayList();
        while (r2.hasNext()) {
        }
        it = arrayList32.iterator();
        while (it.hasNext()) {
        }
        List listOf22 = CollectionsKt__CollectionsKt.listOf((Object[]) new File[]{bugReportFiles.dbFile, bugReportFiles.preferencesFile, bugReportFiles.debugPreferencesFile, bugReportFiles.singleAccountHolderEligibilityFile});
        ArrayList arrayList42 = new ArrayList();
        while (r0.hasNext()) {
        }
        CollectionsKt.toCollection(arrayList42, arrayList22);
        return arrayList22;
    }
}
