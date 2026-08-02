package com.squareup.cash.banking.observability;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Deprecated
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001Z\u001d\b\u0007\u0010\u0006\"\u00020\u00022\u00020\u0002B\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005ø\u0001\u0000Z\u001d\b\u0007\u0010\b\"\u00020\u00072\u00020\u0007B\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u001a¨\u0006\t"}, d2 = {"Lcom/squareup/cash/banking/observability/ProtoParsingError;", "Lcom/squareup/cash/observability/protovalidation/ProtoParsingError;", "Lcom/squareup/cash/observability/protovalidation/ProtoParsingError$ErrorType;", "Lkotlin/Deprecated;", "message", "Moved to com.squareup.cash.observability.protovalidation", "ErrorType", "Lcom/squareup/cash/observability/protovalidation/ProtoParsingError$Factory;", "Factory", "observability"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public class ProtoParsingError extends com.squareup.cash.observability.protovalidation.ProtoParsingError {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProtoParsingError(String str, ProtoParsingError.ErrorType errorType, String str2, Throwable th, Set set, String str3, String str4, int i) {
        super(str, r2, r3, r4, r1, r0);
        ProtoParsingError.ErrorType errorType2 = (i & 2) != 0 ? null : errorType;
        String str5 = (i & 4) != 0 ? null : str2;
        Throwable th2 = (i & 8) != 0 ? null : th;
        Set set2 = (i & 16) != 0 ? EmptySet.INSTANCE : set;
        String str6 = (i & 32) == 0 ? str3 : null;
        String reason = (i & 64) != 0 ? errorType2 != null ? errorType2.getReason() : th2 != null ? th2.toString() : "Unknown error" : str4;
        str.getClass();
        set2.getClass();
        reason.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoParsingError(String str, String str2, String str3, Set set, String str4) {
        this(str, null, str2, null, set, str4, str3, 10);
        set.getClass();
    }
}
