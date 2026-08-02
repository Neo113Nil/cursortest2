package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.datastore.preferences.protobuf.ByteString$LiteralByteString;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzfl {
    public static String authResponse$presenters(String str, String str2, String str3) {
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\n        window.CashApp.pay._native.dispatchEvent(\n          new CustomEvent('AUTHORIZE_RESPONSE', {\n            detail: {\n              statusCode: \"", str, "\",\n              errorTitle: \"", str2, "\",\n              errorMessage: \""), str3, "\"\n            }\n          })\n        )\n      ");
    }

    public static String escapeBytes(ByteString$LiteralByteString byteString$LiteralByteString) {
        StringBuilder sb = new StringBuilder(byteString$LiteralByteString.size());
        for (int i = 0; i < byteString$LiteralByteString.size(); i++) {
            byte byteAt = byteString$LiteralByteString.byteAt(i);
            if (byteAt == 34) {
                sb.append("\\\"");
            } else if (byteAt == 39) {
                sb.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (byteAt < 32 || byteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb.append((char) ((byteAt & 7) + 48));
                            break;
                        } else {
                            sb.append((char) byteAt);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.PayLightningInvoice.deepLinkSpecs;
    }
}
