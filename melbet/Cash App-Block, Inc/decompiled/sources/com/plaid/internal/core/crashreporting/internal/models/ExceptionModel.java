package com.plaid.internal.core.crashreporting.internal.models;

import com.plaid.internal.C0322x;
import com.plaid.internal.core.crashreporting.internal.models.StackTraceElement;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel;", "Ljava/io/Serializable;", "throwable", "", "(Ljava/lang/Throwable;)V", "module", "", "stacktrace", "Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceInterface;", "type", "value", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExceptionModel implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DEFAULT_PACKAGE_NAME = "(default)";
    private final String module;
    private final StackTraceInterface stacktrace;
    private final String type;
    private final String value;

    public ExceptionModel(Throwable th) {
        java.lang.StackTraceElement[] stackTrace;
        th.getClass();
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        this.value = th.getMessage();
        if (r0 != null) {
            name = StringsKt__StringsJVMKt.replace$default(name, r0.getName() + ".", "");
        }
        this.type = name;
        String canonicalName = th.getClass().getCanonicalName();
        this.module = canonicalName != null ? StringsKt.removeSuffix(canonicalName, ".".concat(th.getClass().getSimpleName())) : null;
        try {
            stackTrace = th.getStackTrace();
            stackTrace.getClass();
            ArraysKt___ArraysKt.reverse(stackTrace);
        } catch (NullPointerException e) {
            stackTrace = e.getStackTrace();
        }
        StackTraceElement.Companion companion = StackTraceElement.INSTANCE;
        stackTrace.getClass();
        this.stacktrace = new StackTraceInterface(companion.fromStackTraceElements(stackTrace));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !ExceptionModel.class.equals(other.getClass())) {
            return false;
        }
        ExceptionModel exceptionModel = (ExceptionModel) other;
        if (!Intrinsics.areEqual(this.type, exceptionModel.type)) {
            return false;
        }
        String str = this.value;
        String str2 = exceptionModel.value;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        String str3 = this.module;
        String str4 = exceptionModel.module;
        if (str3 == null ? str4 == null : str3.equals(str4)) {
            return Intrinsics.areEqual(this.stacktrace, exceptionModel.stacktrace);
        }
        return false;
    }

    public int hashCode() {
        String str = this.value;
        int a = C0322x.a(this.type, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.module;
        return a + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.value;
        String str2 = this.type;
        String str3 = this.module;
        StackTraceInterface stackTraceInterface = this.stacktrace;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SentryException{value='", str, "', type='", str2, "', module='");
        m.append(str3);
        m.append("', stackTraceInterface=");
        m.append(stackTraceInterface);
        m.append("}");
        return m.toString();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel$Companion;", "", "()V", "DEFAULT_PACKAGE_NAME", "", "extractExceptionQueue", "Ljava/util/Queue;", "Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel;", "throwable", "", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Queue<ExceptionModel> extractExceptionQueue(Throwable throwable) {
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            Throwable th = throwable;
            while (th != null && hashSet.add(th)) {
                linkedList.add(new ExceptionModel(th));
                th = throwable != null ? throwable.getCause() : null;
            }
            return linkedList;
        }

        private Companion() {
        }
    }
}
