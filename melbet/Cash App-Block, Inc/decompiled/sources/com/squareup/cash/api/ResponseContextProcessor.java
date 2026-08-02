package com.squareup.cash.api;

import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public interface ResponseContextProcessor {
    Object processResponseContext(RequestContext requestContext, ResponseContext responseContext, String str, ContinuationImpl continuationImpl);
}
