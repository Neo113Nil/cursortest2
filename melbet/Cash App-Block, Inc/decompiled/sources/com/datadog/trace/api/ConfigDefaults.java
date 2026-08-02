package com.datadog.trace.api;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes4.dex */
public abstract class ConfigDefaults {
    public static final BitSet DEFAULT_GRPC_CLIENT_ERROR_STATUSES;
    public static final BitSet DEFAULT_GRPC_SERVER_ERROR_STATUSES;
    public static final BitSet DEFAULT_HTTP_CLIENT_ERROR_STATUSES;
    public static final BitSet DEFAULT_HTTP_SERVER_ERROR_STATUSES;
    public static final LinkedHashSet DEFAULT_TRACE_PROPAGATION_STYLE;

    static {
        BitSet bitSet = new BitSet();
        DEFAULT_HTTP_SERVER_ERROR_STATUSES = bitSet;
        bitSet.set(500, 600);
        BitSet bitSet2 = new BitSet();
        DEFAULT_HTTP_CLIENT_ERROR_STATUSES = bitSet2;
        bitSet2.set(400, 500);
        BitSet bitSet3 = new BitSet();
        DEFAULT_GRPC_SERVER_ERROR_STATUSES = bitSet3;
        bitSet3.set(2, 17);
        BitSet bitSet4 = new BitSet();
        DEFAULT_GRPC_CLIENT_ERROR_STATUSES = bitSet4;
        bitSet4.set(1, 17);
        new BitSet().set(0, 1);
        DEFAULT_TRACE_PROPAGATION_STYLE = new LinkedHashSet(Arrays.asList(TracePropagationStyle.DATADOG, TracePropagationStyle.TRACECONTEXT));
        new HashSet(Arrays.asList("SHA1", McElieceCCA2KeyGenParameterSpec.SHA1, "MD2", "MD5", "RIPEMD128", "MD4"));
    }
}
