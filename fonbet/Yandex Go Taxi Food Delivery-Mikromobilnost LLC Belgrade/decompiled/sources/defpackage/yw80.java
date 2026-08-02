package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.entities.MessageData;

/* loaded from: classes15.dex */
public final class yw80 {
    public final String a;
    public final MessageData b;
    public final CustomPayload c;
    public final uw80[] d;
    public final String e;
    public final String[] f;
    public final ForwardMessageRef[] g;
    public final g720 h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final String l;

    public yw80(String str, MessageData messageData, CustomPayload customPayload, uw80[] uw80VarArr, String str2, String[] strArr, ForwardMessageRef[] forwardMessageRefArr, g720 g720Var, boolean z, boolean z2, String str3, String str4) {
        this.a = str;
        this.b = messageData;
        this.c = customPayload;
        this.d = uw80VarArr;
        this.e = str2;
        this.f = strArr;
        this.g = forwardMessageRefArr;
        this.h = g720Var;
        this.i = z;
        this.j = z2;
        this.k = str3;
        this.l = str4;
        messageData.payloadId = str;
    }
}
