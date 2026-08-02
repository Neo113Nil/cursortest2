package com.squareup.cash;

import android.content.Context;
import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bugreporting.viewmodels.Screenshot;
import com.squareup.cash.fileupload.api.UriString;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.AddBugReportAttachmentRequest;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.Attachment;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.AttachmentIdentifier;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.BugReportService;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CreateBugReportResponse;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import okio.Utf8;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class BugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CreateBugReportResponse $createResponse;
    public final /* synthetic */ Context $endpointContext;
    public final /* synthetic */ List $screenshotAttachmentIds;
    public final /* synthetic */ List $screenshots;
    public final /* synthetic */ BugReportService $this_uploadScreenshotsAsAttachments;
    public int I$0;
    public int I$1;
    public int I$2;
    public /* synthetic */ Object L$0;
    public InputStream L$12;
    public List L$2;
    public CreateBugReportResponse L$3;
    public Context L$4;
    public List L$5;
    public BugReportService L$6;
    public Iterator L$7;
    public Screenshot L$9;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2(List list, CreateBugReportResponse createBugReportResponse, Context context, List list2, BugReportService bugReportService, Continuation continuation) {
        super(2, continuation);
        this.$screenshots = list;
        this.$createResponse = createBugReportResponse;
        this.$endpointContext = context;
        this.$screenshotAttachmentIds = list2;
        this.$this_uploadScreenshotsAsAttachments = bugReportService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2 bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2 = new BugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2(this.$screenshots, this.$createResponse, this.$endpointContext, this.$screenshotAttachmentIds, this.$this_uploadScreenshotsAsAttachments, continuation);
        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$0 = obj;
        return bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:8|9|10|11|12|13|(4:15|(1:17)|18|(1:20)(6:113|22|(1:24)|25|26|(2:28|(16:30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|(12:55|56|(2:85|86)|58|59|60|61|62|63|64|65|(1:67)(8:68|8|9|10|11|12|13|(1:114)(0)))(4:46|47|48|49))(2:109|110))(2:111|112)))(0)|21|22|(0)|25|26|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:30|(1:31)|32|33|34|35|36|37|38|39|40|41|42|43|44|(12:55|56|(2:85|86)|58|59|60|61|62|63|64|65|(1:67)(8:68|8|9|10|11|12|13|(1:114)(0)))(4:46|47|48|49)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|(12:55|56|(2:85|86)|58|59|60|61|62|63|64|65|(1:67)(8:68|8|9|10|11|12|13|(1:114)(0)))(4:46|47|48|49)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01cb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cc, code lost:
    
        r3 = r12;
        r12 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d2, code lost:
    
        r6 = r12;
        r12 = r3;
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0171, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0172, code lost:
    
        r13 = r11;
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bd, code lost:
    
        r6 = r13;
        r12 = r19;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c5, code lost:
    
        r6 = r13;
        r3 = r12;
        r12 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01e0 -> B:13:0x01ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0161 -> B:8:0x0166). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Iterator it;
        List list;
        Context context;
        List list2;
        BugReportService bugReportService;
        int i;
        int i2;
        CreateBugReportResponse createBugReportResponse;
        CreateBugReportResponse createBugReportResponse2;
        CoroutineSingletons coroutineSingletons;
        List list3;
        int i3;
        Throwable th2;
        Throwable th3;
        List list4;
        int i4;
        Object addBugReportAttachment;
        Object obj2;
        CoroutineScope coroutineScope;
        int i5;
        Throwable m4120exceptionOrNullimpl;
        BugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2 bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2 = this;
        CoroutineScope coroutineScope2 = (CoroutineScope) bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$0;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.label;
        CreateBugReportResponse createBugReportResponse3 = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.$createResponse;
        if (i6 == 0) {
            th = null;
            SafeTrace.throwOnFailure(obj);
            Timber.Forest forest = Timber.Forest;
            List list5 = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.$screenshots;
            forest.d("uploadScreenshotsAsAttachments started with " + list5.size() + " screenshots for bug report: " + createBugReportResponse3.bug_report_id, new Object[0]);
            Iterator it2 = list5.iterator();
            it = it2;
            list = list5;
            context = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.$endpointContext;
            list2 = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.$screenshotAttachmentIds;
            bugReportService = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.$this_uploadScreenshotsAsAttachments;
            i = 0;
            i2 = 0;
            createBugReportResponse = createBugReportResponse3;
            if (it.hasNext()) {
            }
        } else {
            if (i6 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.I$2;
            int i7 = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.I$1;
            int i8 = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.I$0;
            InputStream inputStream = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$12;
            Screenshot screenshot = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$9;
            it = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$7;
            th = null;
            bugReportService = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$6;
            List list6 = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$5;
            context = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$4;
            createBugReportResponse = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$3;
            list = bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$2;
            try {
                SafeTrace.throwOnFailure(obj);
                coroutineSingletons = coroutineSingletons2;
                i3 = i8;
                createBugReportResponse2 = createBugReportResponse3;
                list3 = list6;
                addBugReportAttachment = obj;
            } catch (Throwable th4) {
                th3 = th4;
                coroutineSingletons = coroutineSingletons2;
                i3 = i8;
                list4 = list6;
                createBugReportResponse2 = createBugReportResponse3;
                list3 = list4;
                th2 = th3;
                try {
                    throw th2;
                } finally {
                }
            }
            try {
                Object failure = (ApiResult) addBugReportAttachment;
                Utf8.closeFinally(inputStream, th);
                Result.Companion companion = Result.Companion;
                if (!(failure instanceof Result.Failure)) {
                    ApiResult apiResult = (ApiResult) failure;
                    String str = screenshot.fileName;
                    if (str == null) {
                        str = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "screenshot_", ".png");
                    }
                    if (apiResult instanceof ApiResult.Success) {
                        obj2 = failure;
                        Timber.Forest.d("Successfully uploaded screenshot: ".concat(str), new Object[0]);
                    } else {
                        obj2 = failure;
                        coroutineScope = coroutineScope2;
                        i5 = 0;
                        Timber.Forest.e("Failed to upload screenshot: " + str + ", error: " + apiResult, new Object[0]);
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj2);
                        if (m4120exceptionOrNullimpl != null) {
                            Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Exception uploading screenshot "), new Object[i5], m4120exceptionOrNullimpl);
                        }
                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                        i2 = i3;
                        coroutineSingletons2 = coroutineSingletons3;
                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2 = this;
                        i = i7;
                        coroutineScope2 = coroutineScope;
                        th = null;
                        list2 = list3;
                        createBugReportResponse3 = createBugReportResponse2;
                        if (it.hasNext()) {
                            Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("uploadScreenshotsAsAttachments completed for bug report: ", createBugReportResponse3.bug_report_id), new Object[0]);
                            return Unit.INSTANCE;
                        }
                        Object next = it.next();
                        int i9 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        screenshot = (Screenshot) next;
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                            int i10 = i2;
                            coroutineSingletons = coroutineSingletons2;
                            i3 = i10;
                            createBugReportResponse2 = createBugReportResponse3;
                        }
                        Result.Companion companion2 = Result.Companion;
                        Timber.Forest forest2 = Timber.Forest;
                        createBugReportResponse2 = createBugReportResponse3;
                        int size = list.size();
                        CoroutineSingletons coroutineSingletons4 = coroutineSingletons2;
                        String str2 = createBugReportResponse.bug_report_id;
                        StringBuilder sb = new StringBuilder();
                        int i11 = i2;
                        sb.append("Processing screenshot ");
                        sb.append(i);
                        sb.append("/");
                        sb.append(size);
                        sb.append(" for bug report: ");
                        sb.append(str2);
                        forest2.d(sb.toString(), new Object[0]);
                        inputStream = context.getContentResolver().openInputStream(Uri.parse(screenshot.uri));
                        if (inputStream != null) {
                            try {
                                try {
                                    try {
                                        byte[] readBytes = ByteStreamsKt.readBytes(inputStream);
                                        String str3 = screenshot.fileName;
                                        if (str3 == null) {
                                            try {
                                                str3 = "screenshot_" + i + ".png";
                                            } catch (Throwable th6) {
                                                th2 = th6;
                                                list3 = list2;
                                                coroutineSingletons = coroutineSingletons4;
                                                i3 = i11;
                                                i7 = i9;
                                                throw th2;
                                            }
                                        }
                                        AttachmentIdentifier attachmentIdentifier = (AttachmentIdentifier) list2.get(i);
                                        ByteString.Companion companion3 = ByteString.Companion;
                                        AddBugReportAttachmentRequest addBugReportAttachmentRequest = new AddBugReportAttachmentRequest(createBugReportResponse.bug_report_id, new Attachment(attachmentIdentifier, str3, ByteString.Companion.of$default(readBytes)));
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$0 = coroutineScope2;
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$2 = list;
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$3 = createBugReportResponse;
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$4 = context;
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$5 = list2;
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$6 = bugReportService;
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$7 = it;
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$9 = screenshot;
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.L$12 = inputStream;
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.I$0 = i3;
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.I$1 = i4;
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.I$2 = i;
                                        bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2.label = 1;
                                        addBugReportAttachment = bugReportService.addBugReportAttachment(addBugReportAttachmentRequest, bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2);
                                        coroutineSingletons = coroutineSingletons4;
                                        if (addBugReportAttachment == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        List list7 = list2;
                                        i7 = i4;
                                        list3 = list7;
                                        Object failure2 = (ApiResult) addBugReportAttachment;
                                        Utf8.closeFinally(inputStream, th);
                                        Result.Companion companion4 = Result.Companion;
                                        if (!(failure2 instanceof Result.Failure)) {
                                            obj2 = failure2;
                                        }
                                    } catch (Throwable th7) {
                                        th3 = th7;
                                        i4 = i9;
                                    }
                                    i3 = i11;
                                } catch (Throwable th8) {
                                    th3 = th8;
                                    i4 = i9;
                                    coroutineSingletons = coroutineSingletons4;
                                    i3 = i11;
                                }
                            } catch (Throwable th9) {
                                th3 = th9;
                                coroutineSingletons = coroutineSingletons4;
                                list4 = list2;
                                i7 = i4;
                                list3 = list4;
                                th2 = th3;
                                throw th2;
                            }
                            i4 = i9;
                        } else {
                            int i12 = i9;
                            coroutineSingletons = coroutineSingletons4;
                            i3 = i11;
                            try {
                            } catch (Throwable th10) {
                                th = th10;
                                i9 = i12;
                                Result.Companion companion5 = Result.Companion;
                                failure2 = new Result.Failure(th);
                                list3 = list2;
                                i7 = i9;
                                if (!(failure2 instanceof Result.Failure)) {
                                }
                                coroutineScope = coroutineScope2;
                                i5 = 0;
                                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj2);
                                if (m4120exceptionOrNullimpl != null) {
                                }
                                CoroutineSingletons coroutineSingletons32 = coroutineSingletons;
                                i2 = i3;
                                coroutineSingletons2 = coroutineSingletons32;
                                bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2 = this;
                                i = i7;
                                coroutineScope2 = coroutineScope;
                                th = null;
                                list2 = list3;
                                createBugReportResponse3 = createBugReportResponse2;
                                if (it.hasNext()) {
                                }
                            }
                            throw new IllegalArgumentException(("Failed to open screenshot URI: " + UriString.m3554toStringimpl(screenshot.uri)).toString());
                        }
                    }
                }
                coroutineScope = coroutineScope2;
                i5 = 0;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj2);
                if (m4120exceptionOrNullimpl != null) {
                }
                CoroutineSingletons coroutineSingletons322 = coroutineSingletons;
                i2 = i3;
                coroutineSingletons2 = coroutineSingletons322;
                bugReportSenderExtensionsKt$uploadScreenshotsAsAttachments$2 = this;
                i = i7;
                coroutineScope2 = coroutineScope;
                th = null;
                list2 = list3;
                createBugReportResponse3 = createBugReportResponse2;
                if (it.hasNext()) {
                }
            } catch (Throwable th11) {
                th3 = th11;
                th2 = th3;
                throw th2;
            }
        }
    }
}
