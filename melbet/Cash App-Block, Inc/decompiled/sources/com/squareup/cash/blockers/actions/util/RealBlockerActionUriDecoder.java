package com.squareup.cash.blockers.actions.util;

import com.squareup.cash.blockers.actions.util.BlockerActionDecodingError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.franklin.api.BlockerAction;
import java.io.IOException;
import java.net.URLDecoder;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import okio.ByteString;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public final class RealBlockerActionUriDecoder implements BlockerActionUriDecoder {
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[Catch: IOException -> 0x0031, TryCatch #0 {IOException -> 0x0031, blocks: (B:7:0x001e, B:10:0x002a, B:13:0x004b, B:15:0x005d, B:17:0x0066, B:19:0x006a, B:20:0x006f, B:21:0x0070, B:23:0x0033, B:25:0x003c, B:26:0x0079, B:27:0x007e), top: B:6:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[Catch: IOException -> 0x0031, TryCatch #0 {IOException -> 0x0031, blocks: (B:7:0x001e, B:10:0x002a, B:13:0x004b, B:15:0x005d, B:17:0x0066, B:19:0x006a, B:20:0x006f, B:21:0x0070, B:23:0x0033, B:25:0x003c, B:26:0x0079, B:27:0x007e), top: B:6:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BlockerAction decode(String str) {
        ByteString decodeBase64;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        str.getClass();
        if (!StringsKt__StringsJVMKt.startsWith(str, "blockeraction://", false)) {
            return null;
        }
        String concat = StringsKt___StringsKt.take(35, str).concat("REDACTED");
        try {
            String substringAfter = StringsKt.substringAfter(str, "blockeraction://", str);
            if (!StringsKt.contains((CharSequence) substringAfter, (CharSequence) Marker.ANY_NON_NULL_MARKER, false)) {
                if (StringsKt.contains((CharSequence) substringAfter, (CharSequence) "/", false)) {
                }
                String decode = URLDecoder.decode(substringAfter, "utf-8");
                ByteString.Companion companion = ByteString.Companion;
                decode.getClass();
                decodeBase64 = ByteString.Companion.decodeBase64(decode);
                if (decodeBase64 == null) {
                    return (BlockerAction) BlockerAction.ADAPTER.decode(decodeBase64);
                }
                BlockerActionDecodingError.BlockerActionBase64DecodingError blockerActionBase64DecodingError = new BlockerActionDecodingError.BlockerActionBase64DecodingError(concat);
                ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                if (errorReporter == null) {
                    throw new ErrorReporter.Companion.ErrorReporterInstanceNotSetError();
                }
                errorReporter.report(blockerActionBase64DecodingError, defaultSamplingStrategy);
                return null;
            }
            BlockerActionDecodingError.UnexpectedCharactersInBlockerAction unexpectedCharactersInBlockerAction = new BlockerActionDecodingError.UnexpectedCharactersInBlockerAction(concat);
            ErrorReporter errorReporter2 = ErrorReporter.Companion.INSTANCE;
            if (errorReporter2 == null) {
                throw new ErrorReporter.Companion.ErrorReporterInstanceNotSetError();
            }
            errorReporter2.report(unexpectedCharactersInBlockerAction, defaultSamplingStrategy);
            substringAfter = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(substringAfter, Marker.ANY_NON_NULL_MARKER, "-"), "/", "_");
            String decode2 = URLDecoder.decode(substringAfter, "utf-8");
            ByteString.Companion companion2 = ByteString.Companion;
            decode2.getClass();
            decodeBase64 = ByteString.Companion.decodeBase64(decode2);
            if (decodeBase64 == null) {
            }
        } catch (IOException e) {
            BlockerActionDecodingError.BlockerActionProtoDecodingError blockerActionProtoDecodingError = new BlockerActionDecodingError.BlockerActionProtoDecodingError(concat, e);
            ErrorReporter errorReporter3 = ErrorReporter.Companion.INSTANCE;
            if (errorReporter3 == null) {
                throw new ErrorReporter.Companion.ErrorReporterInstanceNotSetError();
            }
            errorReporter3.report(blockerActionProtoDecodingError, defaultSamplingStrategy);
            return null;
        }
    }
}
