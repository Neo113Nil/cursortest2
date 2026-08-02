package com.squareup.cash.clientroutes;

import android.util.Log;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.moneybot.backend.api.MoneybotProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public final class PatternRedaction implements ProtoParsingError.Factory {
    public final String pattern;
    public final String template;

    public PatternRedaction(String str, String str2) {
        zzae.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.pattern = str;
        this.template = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new MoneybotProtoParsingError(str, errorType, str2, exc, this.pattern, this.template);
    }

    public void i(String str) {
        if (Log.isLoggable(this.pattern, 4)) {
            Log.i("AutoZoom", zza(str));
        }
    }

    public String redact(String str) {
        String replace = new Regex(this.pattern).replace(str, this.template);
        return Intrinsics.areEqual(replace, str) ? "REDACTED" : replace;
    }

    public String zza(String str) {
        String str2 = this.template;
        return str2 == null ? str : str2.concat(str);
    }

    public /* synthetic */ PatternRedaction(String str, String str2, boolean z) {
        this.pattern = str;
        this.template = str2;
    }

    public /* synthetic */ PatternRedaction(String str, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, false);
    }
}
