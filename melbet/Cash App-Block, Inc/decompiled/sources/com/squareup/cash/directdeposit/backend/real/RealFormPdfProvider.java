package com.squareup.cash.directdeposit.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.storage.FileDownloader$Category;
import com.squareup.cash.storage.FileDownloader$DownloadStatus;
import com.squareup.cash.storage.RealFileDownloader;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealFormPdfProvider {
    public final RealFileDownloader fileDownloader;
    public final CoroutineContext ioDispatcher;

    public RealFormPdfProvider(RealFileDownloader realFileDownloader, CoroutineContext coroutineContext) {
        this.fileDownloader = realFileDownloader;
        this.ioDispatcher = coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Comparable downloadPdf(String str, String str2, ContinuationImpl continuationImpl) {
        RealFormPdfProvider$downloadPdf$1 realFormPdfProvider$downloadPdf$1;
        Object obj;
        int i;
        RealFormPdfProvider realFormPdfProvider;
        String str3;
        if (continuationImpl instanceof RealFormPdfProvider$downloadPdf$1) {
            realFormPdfProvider$downloadPdf$1 = (RealFormPdfProvider$downloadPdf$1) continuationImpl;
            int i2 = realFormPdfProvider$downloadPdf$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFormPdfProvider$downloadPdf$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realFormPdfProvider$downloadPdf$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFormPdfProvider$downloadPdf$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realFormPdfProvider = this;
                    GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1(realFormPdfProvider, str, str2, continuation, 4);
                    realFormPdfProvider$downloadPdf$1.L$0 = str;
                    realFormPdfProvider$downloadPdf$1.label = 1;
                    obj = JobKt.withContext(realFormPdfProvider.ioDispatcher, gLSceneScopeProvider$SceneScope$2$1$1, realFormPdfProvider$downloadPdf$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = realFormPdfProvider$downloadPdf$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    realFormPdfProvider = this;
                }
                if (((FileDownloader$DownloadStatus) obj) != FileDownloader$DownloadStatus.SUCCESS) {
                    return realFormPdfProvider.fileDownloader.localUri(FileDownloader$Category.DDA_FORM, str3);
                }
                return null;
            }
        }
        realFormPdfProvider$downloadPdf$1 = new RealFormPdfProvider$downloadPdf$1(this, continuationImpl);
        obj = realFormPdfProvider$downloadPdf$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFormPdfProvider$downloadPdf$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((FileDownloader$DownloadStatus) obj) != FileDownloader$DownloadStatus.SUCCESS) {
        }
    }
}
