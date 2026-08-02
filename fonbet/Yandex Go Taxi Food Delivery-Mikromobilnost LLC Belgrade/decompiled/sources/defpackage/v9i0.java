package defpackage;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.ProtoSyntax;

/* loaded from: classes.dex */
public final class v9i0 {
    public final xt10 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public v9i0(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        this.a = generatedMessageLite;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final ProtoSyntax a() {
        int i = this.d;
        return (i & 1) != 0 ? ProtoSyntax.PROTO2 : (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }
}
