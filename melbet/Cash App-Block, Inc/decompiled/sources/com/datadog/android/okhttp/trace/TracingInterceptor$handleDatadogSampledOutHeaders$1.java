package com.datadog.android.okhttp.trace;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import okhttp3.Request;

/* loaded from: classes4.dex */
public final class TracingInterceptor$handleDatadogSampledOutHeaders$1 extends Lambda implements Function3 {
    public static final TracingInterceptor$handleDatadogSampledOutHeaders$1 INSTANCE = new TracingInterceptor$handleDatadogSampledOutHeaders$1(3);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r2.equals("x-datadog-origin") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r2.equals("x-datadog-trace-id") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0044, code lost:
    
        r1.addHeader(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r2.equals("x-datadog-tags") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r2.equals("x-datadog-parent-id") == false) goto L18;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Request.Builder builder = (Request.Builder) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        builder.getClass();
        str.getClass();
        str2.getClass();
        builder.headers.removeAll(str);
        switch (str.hashCode()) {
            case -1682961930:
                break;
            case 304080974:
                break;
            case 1316815593:
                break;
            case 1767467379:
                break;
        }
        return Unit.INSTANCE;
    }
}
