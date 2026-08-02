package com.squareup.cash.observability.types;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FEATURE_FAILURE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class ErrorImpact {
    public static final /* synthetic */ ErrorImpact[] $VALUES;
    public static final ErrorImpact FEATURE_FAILURE;
    public static final ErrorImpact GRACEFUL_DEGRADATION;
    public final ErrorSeverity severity;

    static {
        ErrorImpact errorImpact = new ErrorImpact("GRACEFUL_DEGRADATION", 0, ErrorSeverity.HANDLED);
        GRACEFUL_DEGRADATION = errorImpact;
        ErrorSeverity errorSeverity = ErrorSeverity.UNHANDLED;
        ErrorImpact errorImpact2 = new ErrorImpact("FEATURE_FAILURE", 1, errorSeverity);
        FEATURE_FAILURE = errorImpact2;
        $VALUES = new ErrorImpact[]{errorImpact, errorImpact2, new ErrorImpact("FATAL", 2, errorSeverity)};
    }

    public ErrorImpact(String str, int i, ErrorSeverity errorSeverity) {
        this.severity = errorSeverity;
    }

    public static ErrorImpact valueOf(String str) {
        return (ErrorImpact) Enum.valueOf(ErrorImpact.class, str);
    }

    public static ErrorImpact[] values() {
        return (ErrorImpact[]) $VALUES.clone();
    }
}
