package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dfi;
import defpackage.j66;
import defpackage.qdb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPaySubmitResult;", "", "invoiceId", "", "status", "Lcom/yandex/plus/pay/internal/model/PlusPaySubmitResult$Status;", "statusCode", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPaySubmitResult$Status;Ljava/lang/String;)V", "getInvoiceId", "()Ljava/lang/String;", "getStatus", "()Lcom/yandex/plus/pay/internal/model/PlusPaySubmitResult$Status;", "getStatusCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final /* data */ class PlusPaySubmitResult {

    @NotNull
    private final String invoiceId;

    @NotNull
    private final Status status;
    private final String statusCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPaySubmitResult$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAIL", "UNKNOWN", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Status {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status FAIL = new Status("FAIL", 1);
        public static final Status UNKNOWN = new Status("UNKNOWN", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, FAIL, UNKNOWN};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
        }

        private Status(String str, int i) {
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public PlusPaySubmitResult(@NotNull String str, @NotNull Status status, String str2) {
        str.getClass();
        status.getClass();
        this.invoiceId = str;
        this.status = status;
        this.statusCode = str2;
    }

    public static /* synthetic */ PlusPaySubmitResult copy$default(PlusPaySubmitResult plusPaySubmitResult, String str, Status status, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPaySubmitResult.invoiceId;
        }
        if ((i & 2) != 0) {
            status = plusPaySubmitResult.status;
        }
        if ((i & 4) != 0) {
            str2 = plusPaySubmitResult.statusCode;
        }
        return plusPaySubmitResult.copy(str, status, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final PlusPaySubmitResult copy(@NotNull String invoiceId, @NotNull Status status, String statusCode) {
        invoiceId.getClass();
        status.getClass();
        return new PlusPaySubmitResult(invoiceId, status, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPaySubmitResult)) {
            return false;
        }
        PlusPaySubmitResult plusPaySubmitResult = (PlusPaySubmitResult) other;
        return Intrinsics.d(this.invoiceId, plusPaySubmitResult.invoiceId) && this.status == plusPaySubmitResult.status && Intrinsics.d(this.statusCode, plusPaySubmitResult.statusCode);
    }

    @NotNull
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + (this.invoiceId.hashCode() * 31)) * 31;
        String str = this.statusCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlusPaySubmitResult(invoiceId=");
        sb.append(this.invoiceId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", statusCode=");
        return dfi.i(sb, this.statusCode, ')');
    }
}
