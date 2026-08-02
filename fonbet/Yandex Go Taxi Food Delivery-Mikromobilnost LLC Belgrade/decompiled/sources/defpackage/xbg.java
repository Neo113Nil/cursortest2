package defpackage;

import com.yandex.messaging.activity.MessengerActivityBase;
import com.yandex.messaging.activity.calls.MessengerCallFeedbackArguments;

/* loaded from: classes15.dex */
public final class xbg implements q020 {
    public final o020 a;
    public final MessengerCallFeedbackArguments b;
    public final ccg c;
    public final xbg d = this;
    public final xvf0 e;
    public final xvf0 f;

    public xbg(ccg ccgVar, MessengerCallFeedbackArguments messengerCallFeedbackArguments, MessengerActivityBase messengerActivityBase, o020 o020Var) {
        this.c = ccgVar;
        this.a = o020Var;
        this.b = messengerCallFeedbackArguments;
        this.e = i5m.b(new aos(n3w.a(messengerActivityBase), 9));
        this.f = i5m.b(new aos(n3w.a(messengerCallFeedbackArguments), 10));
    }
}
