package com.datadog.trace.core.propagation;

import com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$ContextVisitor;
import com.datadog.trace.bootstrap.instrumentation.api.TagContext;
import com.datadog.trace.core.propagation.HttpCodec;

/* loaded from: classes4.dex */
public final class NoneCodec$2 implements HttpCodec.Extractor {
    public static final NoneCodec$2 INSTANCE = new NoneCodec$2(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ NoneCodec$2(int i) {
        this.$r8$classId = i;
    }

    @Override // com.datadog.trace.core.propagation.HttpCodec.Extractor
    public final TagContext extract(Object obj, AgentPropagation$ContextVisitor agentPropagation$ContextVisitor) {
        switch (this.$r8$classId) {
        }
        return null;
    }
}
