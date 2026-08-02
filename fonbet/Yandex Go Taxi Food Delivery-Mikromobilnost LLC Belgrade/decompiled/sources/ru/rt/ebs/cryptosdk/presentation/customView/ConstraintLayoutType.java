package ru.rt.ebs.cryptosdk.presentation.customView;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/ConstraintLayoutType;", "", "BIOMETRY_INFO", "FAILED_VERIFICATION", "ACCESS_DENIED", "VERIFICATION_ERROR", "PROCESSING_WIDGET_DARKENING", "SUCCESSFUL_VERIFICATION_WIDGET_DARKENING", "VERIFICATION_ATTEMPTS_EXCEEDED", "NO_INTERNET_CONNECTION", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class ConstraintLayoutType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ConstraintLayoutType[] $VALUES;
    public static final ConstraintLayoutType ACCESS_DENIED;
    public static final ConstraintLayoutType BIOMETRY_INFO;
    public static final ConstraintLayoutType FAILED_VERIFICATION;
    public static final ConstraintLayoutType NO_INTERNET_CONNECTION;
    public static final ConstraintLayoutType PROCESSING_WIDGET_DARKENING;
    public static final ConstraintLayoutType SUCCESSFUL_VERIFICATION_WIDGET_DARKENING;
    public static final ConstraintLayoutType VERIFICATION_ATTEMPTS_EXCEEDED;
    public static final ConstraintLayoutType VERIFICATION_ERROR;

    static {
        ConstraintLayoutType constraintLayoutType = new ConstraintLayoutType("BIOMETRY_INFO", 0);
        BIOMETRY_INFO = constraintLayoutType;
        ConstraintLayoutType constraintLayoutType2 = new ConstraintLayoutType("FAILED_VERIFICATION", 1);
        FAILED_VERIFICATION = constraintLayoutType2;
        ConstraintLayoutType constraintLayoutType3 = new ConstraintLayoutType("ACCESS_DENIED", 2);
        ACCESS_DENIED = constraintLayoutType3;
        ConstraintLayoutType constraintLayoutType4 = new ConstraintLayoutType("VERIFICATION_ERROR", 3);
        VERIFICATION_ERROR = constraintLayoutType4;
        ConstraintLayoutType constraintLayoutType5 = new ConstraintLayoutType("PROCESSING_WIDGET_DARKENING", 4);
        PROCESSING_WIDGET_DARKENING = constraintLayoutType5;
        ConstraintLayoutType constraintLayoutType6 = new ConstraintLayoutType("SUCCESSFUL_VERIFICATION_WIDGET_DARKENING", 5);
        SUCCESSFUL_VERIFICATION_WIDGET_DARKENING = constraintLayoutType6;
        ConstraintLayoutType constraintLayoutType7 = new ConstraintLayoutType("VERIFICATION_ATTEMPTS_EXCEEDED", 6);
        VERIFICATION_ATTEMPTS_EXCEEDED = constraintLayoutType7;
        ConstraintLayoutType constraintLayoutType8 = new ConstraintLayoutType("NO_INTERNET_CONNECTION", 7);
        NO_INTERNET_CONNECTION = constraintLayoutType8;
        ConstraintLayoutType[] constraintLayoutTypeArr = {constraintLayoutType, constraintLayoutType2, constraintLayoutType3, constraintLayoutType4, constraintLayoutType5, constraintLayoutType6, constraintLayoutType7, constraintLayoutType8};
        $VALUES = constraintLayoutTypeArr;
        $ENTRIES = kotlin.enums.a.a(constraintLayoutTypeArr);
    }

    public static ConstraintLayoutType valueOf(String str) {
        return (ConstraintLayoutType) Enum.valueOf(ConstraintLayoutType.class, str);
    }

    public static ConstraintLayoutType[] values() {
        return (ConstraintLayoutType[]) $VALUES.clone();
    }
}
