package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.CustomFromUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.ForwardedMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.LocalizationDescriptor;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.UserReaction;
import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes15.dex */
public final class v5z {
    public final z5z a;
    public final x22 b;

    public v5z(z5z z5zVar, x22 x22Var) {
        this.a = z5zVar;
        this.b = x22Var;
    }

    public final void a(ReducedUserInfo reducedUserInfo, LinkedHashSet linkedHashSet) {
        if (d(reducedUserInfo.userId, reducedUserInfo.getLocalizationDescriptor())) {
            linkedHashSet.add(reducedUserInfo.userId);
            ((cv21) this.a.b.getValue()).d(reducedUserInfo.userId);
        }
    }

    public final void b(ServerMessage serverMessage, LinkedHashSet linkedHashSet) {
        ReducedUserInfo[] reducedUserInfoArr = serverMessage.users;
        if (reducedUserInfoArr != null) {
            for (ReducedUserInfo reducedUserInfo : reducedUserInfoArr) {
                a(reducedUserInfo, linkedHashSet);
            }
        }
        ReducedUserInfo[] reducedUserInfoArr2 = serverMessage.mentionedUsers;
        if (reducedUserInfoArr2 != null) {
            for (ReducedUserInfo reducedUserInfo2 : reducedUserInfoArr2) {
                a(reducedUserInfo2, linkedHashSet);
            }
        }
        UserReaction[] userReactionArr = serverMessage.recentUserReactions;
        if (userReactionArr != null) {
            for (UserReaction userReaction : userReactionArr) {
                a(userReaction.getUserInfo(), linkedHashSet);
            }
        }
        ForwardedMessageInfo[] forwardedMessageInfoArr = serverMessage.forwardedMessages;
        if (forwardedMessageInfoArr != null) {
            for (ForwardedMessageInfo forwardedMessageInfo : forwardedMessageInfoArr) {
                c(forwardedMessageInfo.serverMessageInfo, linkedHashSet);
            }
        }
        c(serverMessage.serverMessageInfo, linkedHashSet);
    }

    public final void c(ServerMessageInfo serverMessageInfo, LinkedHashSet linkedHashSet) {
        a(serverMessageInfo.from, linkedHashSet);
        CustomFromUserInfo customFromUserInfo = serverMessageInfo.customFrom;
        String str = customFromUserInfo != null ? customFromUserInfo.userId : null;
        if (str != null) {
            if (d(str, customFromUserInfo != null ? customFromUserInfo.localizationDescriptor : null)) {
                linkedHashSet.add(str);
                ((cv21) this.a.b.getValue()).d(str);
            }
        }
    }

    public final boolean d(String str, LocalizationDescriptor localizationDescriptor) {
        if (localizationDescriptor == null) {
            return false;
        }
        hv21 a = ((cv21) this.a.b.getValue()).a(str);
        LocalizationDescriptor localizationDescriptor2 = a != null ? a.c : null;
        return (localizationDescriptor2 == null || localizationDescriptor2.getVersion() < localizationDescriptor.getVersion()) && j73.y(localizationDescriptor.getLangs(), Locale.getDefault().getLanguage()) && !jl40.l(localizationDescriptor.getDefault(), Locale.getDefault().getLanguage());
    }
}
