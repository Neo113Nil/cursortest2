package defpackage;

import com.yandex.messaging.auth.CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1$1$1;
import com.yandex.messaging.chat.attachments.YaDiskAttachmentsUploader$addFiles$$inlined$cancelableCoroutineWrapper$default$1$1$1;
import com.yandex.messaging.domain.actions.ChangePinOrderAction$doWorkgIAlus$$inlined$cancelableCoroutineWrapper$default$1$1$1;
import com.yandex.messaging.domain.botrequest.ChatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1$1$1;
import com.yandex.messaging.domain.personal.GetPersonalGuidUseCase$run$$inlined$cancelableCoroutineWrapper$1$1$1;
import com.yandex.messaging.internal.authorized.chat.MessageSearchController$makeRequest$$inlined$cancelableCoroutineWrapper$1$1$1;
import com.yandex.messaging.internal.authorized.sync.HistoryLoader$requestHistory$$inlined$cancelableCoroutineWrapper$1$1$1;
import com.yandex.messaging.internal.authorized.sync.WhoamiLoader$requestWhoami$$inlined$cancelableCoroutineWrapper$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$activateChat$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$addFiles$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$createInviteLinkToken$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getBuckets$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getChatSettings$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getChatsInfo$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getExperiments$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getRecommendedUsers$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getSuggest$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getUserGaps$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$resolveInviteLinkToken$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$resolveYaDiskFileUrl$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$shareFiles$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$updateFoldersBucket$$inlined$makeCall$1$1$1;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$updatePersonalInfo$$inlined$makeCall$1$1$1;
import com.yandex.messaging.network.ChatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1$1$1;

/* loaded from: classes15.dex */
public final class uo3 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ cn2 c;

    public /* synthetic */ uo3(tse tseVar, cn2 cn2Var, int i) {
        this.a = i;
        this.c = cn2Var;
        this.b = tseVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        cn2 cn2Var = this.c;
        tse tseVar = this.b;
        switch (i) {
            case 0:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$activateChat$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 1:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$addFiles$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 2:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$createInviteLinkToken$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 3:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$getBuckets$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 4:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$getChatSettings$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 5:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$getChatsInfo$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 6:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$getExperiments$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 7:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$getRecommendedUsers$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 8:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$getSuggest$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 9:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 10:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$getUserGaps$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 11:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$resolveInviteLinkToken$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 12:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$resolveYaDiskFileUrl$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 13:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$shareFiles$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 14:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$updateFoldersBucket$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 15:
                tje.N(tseVar, ie60.a, null, new AuthorizedApiCallsExtensionsKt$updatePersonalInfo$$inlined$makeCall$1$1$1(cn2Var, null), 2);
                break;
            case 16:
                tje.N(tseVar, ie60.a, null, new ChangePinOrderAction$doWorkgIAlus$$inlined$cancelableCoroutineWrapper$default$1$1$1(cn2Var, null), 2);
                break;
            case 17:
                tje.N(tseVar, ie60.a, null, new ChatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1$1$1(cn2Var, null), 2);
                break;
            case 18:
                tje.N(tseVar, ie60.a, null, new ChatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1$1$1(cn2Var, null), 2);
                break;
            case 19:
                tje.N(tseVar, ie60.a, null, new CurrentAuthUidProvider$getAuthUid$$inlined$cancelableCoroutineWrapper$default$1$1$1(cn2Var, null), 2);
                break;
            case 20:
                tje.N(tseVar, ie60.a, null, new GetPersonalGuidUseCase$run$$inlined$cancelableCoroutineWrapper$1$1$1(cn2Var, null), 2);
                break;
            case 21:
                tje.N(tseVar, ie60.a, null, new HistoryLoader$requestHistory$$inlined$cancelableCoroutineWrapper$1$1$1(cn2Var, null), 2);
                break;
            case 22:
                tje.N(tseVar, ie60.a, null, new MessageSearchController$makeRequest$$inlined$cancelableCoroutineWrapper$1$1$1(cn2Var, null), 2);
                break;
            case 23:
                tje.N(tseVar, ie60.a, null, new WhoamiLoader$requestWhoami$$inlined$cancelableCoroutineWrapper$1$1$1(cn2Var, null), 2);
                break;
            default:
                tje.N(tseVar, ie60.a, null, new YaDiskAttachmentsUploader$addFiles$$inlined$cancelableCoroutineWrapper$default$1$1$1(cn2Var, null), 2);
                break;
        }
        return zy11Var;
    }
}
