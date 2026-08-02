package com.squareup.cash.blockers.flow.api;

import androidx.glance.session.SessionWorker$doWork$2$2;
import com.squareup.protos.franklin.app.EndFlowRequest;
import com.squareup.protos.franklin.app.SetDateRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.UploadFileRequest;
import com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerRequest;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public interface MultiBlockerFacilitator$Resolver {
    boolean getResolvesSynchronously();

    Object resolve(EndFlowRequest endFlowRequest, Continuation continuation);

    Object resolve(SetDateRequest setDateRequest, SessionWorker$doWork$2$2 sessionWorker$doWork$2$2);

    Object resolve(SubmitFormRequest submitFormRequest, ContinuationImpl continuationImpl);

    Object resolve(UploadFileRequest uploadFileRequest, Continuation continuation);

    Object resolve(ResolvePersonaDidvBlockerRequest resolvePersonaDidvBlockerRequest, Continuation continuation);
}
