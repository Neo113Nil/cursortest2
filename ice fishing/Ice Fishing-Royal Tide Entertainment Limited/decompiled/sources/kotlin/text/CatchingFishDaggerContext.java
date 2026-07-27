package kotlin.text;

import java.io.IOException;

/* loaded from: classes.dex */
public final class CatchingFishDaggerContext extends IOException {
    public final int CatchingFishReduxKtor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishDaggerContext(int i) {
        super("stream was reset: ".concat(r0));
        String str;
        switch (i) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "PROTOCOL_ERROR";
                break;
            case 3:
                str = "INTERNAL_ERROR";
                break;
            case 4:
                str = "FLOW_CONTROL_ERROR";
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                str = "REFUSED_STREAM";
                break;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "CANCEL";
                break;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "COMPRESSION_ERROR";
                break;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                str = "CONNECT_ERROR";
                break;
            case 9:
                str = "ENHANCE_YOUR_CALM";
                break;
            case 10:
                str = "INADEQUATE_SECURITY";
                break;
            case 11:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        this.CatchingFishReduxKtor = i;
    }
}
