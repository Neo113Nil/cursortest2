package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.internal.entities.PollMessageData;
import java.util.List;
import java.util.UUID;

/* loaded from: classes15.dex */
public final class w7b {
    public final ChatRequest a;
    public final ax80 b;
    public final b00 c;
    public final h3y d;

    public w7b(ChatRequest chatRequest, ax80 ax80Var, b00 b00Var, h3y h3yVar) {
        this.a = chatRequest;
        this.b = ax80Var;
        this.c = b00Var;
        this.d = h3yVar;
    }

    public final void a(g720 g720Var, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, CustomPayload customPayload) {
        tje.e();
        PollMessageData.VoteResult voteResult = new PollMessageData.VoteResult();
        voteResult.version = 0L;
        voteResult.voteCount = 0;
        voteResult.answers = new int[0];
        voteResult.voters = new ReducedUserInfo[0];
        PollMessageData pollMessageData = new PollMessageData(str, (String[]) list.toArray(new String[0]), z, z2, voteResult, new int[0]);
        this.b.getClass();
        String uuid = UUID.randomUUID().toString();
        tje.e();
        this.c.c(this.a, new yw80(uuid, pollMessageData, customPayload, null, null, null, null, g720Var, z3, z4, null, null));
    }
}
