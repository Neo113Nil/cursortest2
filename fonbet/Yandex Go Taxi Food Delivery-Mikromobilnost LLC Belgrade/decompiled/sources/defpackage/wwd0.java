package defpackage;

import android.os.Bundle;

/* loaded from: classes15.dex */
public final class wwd0 extends s120 {
    public final g720 a;
    public final String b;
    public final long c;
    public final String d;
    public final Long e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wwd0(Bundle bundle) {
        this(glb1.b(r0), dlb1.d(bundle, "message_chat_id"), dlb1.c(bundle, "message_timestamp"), bundle.getString("original_message_chat_id"), Long.valueOf(bundle.getLong("original_message_timestamp")));
        String d = dlb1.d(bundle, "Messaging.Arguments.Source");
        int i = g720.c;
    }

    @Override // defpackage.s120
    public final String a() {
        return "Messaging.Arguments.Key.PollInfo";
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public wwd0(g720 g720Var, String str, long j, String str2, Long l) {
        this.a = g720Var;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = l;
    }
}
