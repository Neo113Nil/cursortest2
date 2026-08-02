package com.squareup.cash.bitcoin.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ProcessAddressResult {
    public static final /* synthetic */ ProcessAddressResult[] $VALUES;
    public static final ProcessAddressResult SHOW_ERROR_DIALOG;
    public static final ProcessAddressResult SUCCESS;

    static {
        ProcessAddressResult processAddressResult = new ProcessAddressResult("SUCCESS", 0);
        SUCCESS = processAddressResult;
        ProcessAddressResult processAddressResult2 = new ProcessAddressResult("SHOW_ERROR_DIALOG", 1);
        SHOW_ERROR_DIALOG = processAddressResult2;
        $VALUES = new ProcessAddressResult[]{processAddressResult, processAddressResult2};
    }

    public static ProcessAddressResult valueOf(String str) {
        return (ProcessAddressResult) Enum.valueOf(ProcessAddressResult.class, str);
    }

    public static ProcessAddressResult[] values() {
        return (ProcessAddressResult[]) $VALUES.clone();
    }
}
