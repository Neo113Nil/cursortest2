package com.squareup.cash.moneybot.backend.api;

import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.MapBuilder;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/moneybot/backend/api/MoneybotProtoParsingError;", "Lcom/squareup/cash/banking/observability/ProtoParsingError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MoneybotProtoParsingError extends ProtoParsingError {
    public final String sessionId;
    public final String toolRequestId;

    public /* synthetic */ MoneybotProtoParsingError(String str, ProtoParsingError.ErrorType errorType, String str2, Throwable th, String str3, String str4, int i) {
        this(str, (i & 2) != 0 ? null : errorType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : th, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        MapBuilder mapBuilder = new MapBuilder();
        String str = this.toolRequestId;
        if (str != null) {
            mapBuilder.put("toolRequestId", str);
        }
        String str2 = this.sessionId;
        if (str2 != null) {
            mapBuilder.put("sessionId", str2);
        }
        return MapsKt__MapsJVMKt.mapOf(new Pair("Moneybot", mapBuilder.build()));
    }

    public MoneybotProtoParsingError(String str, String str2, String str3, String str4, String str5) {
        super(str, str3, str2, MoneybotFeatureError.features, "Moneybot");
        this.toolRequestId = str4;
        this.sessionId = str5;
    }

    public MoneybotProtoParsingError(String str, ProtoParsingError.ErrorType errorType, String str2, Throwable th, String str3, String str4) {
        super(str, errorType, str2, th, MoneybotFeatureError.features, "Moneybot", null, 64);
        this.toolRequestId = str3;
        this.sessionId = str4;
    }
}
