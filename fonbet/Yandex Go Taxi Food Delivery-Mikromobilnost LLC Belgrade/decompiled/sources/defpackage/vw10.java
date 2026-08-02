package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.ForwardedMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.Translation;
import com.yandex.messaging.core.net.entities.proto.message.TranslationMessage;
import com.yandex.messaging.core.net.entities.proto.message.TranslationWithRef;
import com.yandex.messaging.internal.entities.MessageTranslation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class vw10 {
    public final lqo a;

    public vw10(lqo lqoVar) {
        this.a = lqoVar;
    }

    public static MessageTranslation.Status c(Long l) {
        return (l != null && l.longValue() == 1) ? MessageTranslation.Status.DONE.a : MessageTranslation.Status.PENDING.a;
    }

    public static MessageTranslation.Forward d(Translation translation, long j) {
        if ((translation.getStatus() == 1 ? translation : null) == null) {
            return null;
        }
        String detectedLanguageCode = translation.getDetectedLanguageCode();
        if (detectedLanguageCode == null) {
            detectedLanguageCode = "";
        }
        String text = translation.getText();
        String str = text != null ? text : "";
        String[] suggests = translation.getSuggests();
        return new MessageTranslation.Forward(j, new MessageTranslation.Text(detectedLanguageCode, str, suggests != null ? j73.d0(suggests) : null));
    }

    public static MessageTranslation.Text e(Translation translation) {
        if (translation != null) {
            if ((translation.getStatus() == 1 ? translation : null) != null) {
                String detectedLanguageCode = translation.getDetectedLanguageCode();
                if (detectedLanguageCode == null) {
                    detectedLanguageCode = "";
                }
                String text = translation.getText();
                String str = text != null ? text : "";
                String[] suggests = translation.getSuggests();
                return new MessageTranslation.Text(detectedLanguageCode, str, suggests != null ? j73.d0(suggests) : null);
            }
        }
        return null;
    }

    public final MessageTranslation a(TranslationMessage translationMessage) {
        TranslationWithRef translationWithRef;
        Translation translation;
        String languageCode;
        Long l;
        ArrayList arrayList = null;
        if (this.a.a(tz10.s)) {
            TranslationWithRef translationWithRef2 = translationMessage.getTranslationWithRef();
            TranslationWithRef[] forwardedTranslations = translationMessage.getForwardedTranslations();
            Translation translation2 = translationWithRef2.getTranslation();
            if (translation2 == null || (languageCode = translation2.getLanguageCode()) == null) {
                if (forwardedTranslations != null && (translationWithRef = (TranslationWithRef) j73.G(0, forwardedTranslations)) != null && (translation = translationWithRef.getTranslation()) != null) {
                    languageCode = translation.getLanguageCode();
                }
            }
            String str = languageCode;
            Translation translation3 = translationWithRef2.getTranslation();
            if (translation3 != null) {
                l = Long.valueOf(translation3.getStatus());
            } else {
                if (forwardedTranslations != null) {
                    for (TranslationWithRef translationWithRef3 : forwardedTranslations) {
                        Translation translation4 = translationWithRef3.getTranslation();
                        Long valueOf = translation4 != null ? Long.valueOf(translation4.getStatus()) : null;
                        if (valueOf != null) {
                            l = valueOf;
                            break;
                        }
                    }
                }
                l = null;
            }
            MessageTranslation.Message message = new MessageTranslation.Message(translationWithRef2.getTimestamp(), translationWithRef2.getChatId(), translationWithRef2.getVersion(), str);
            MessageTranslation.Text e = e(translationWithRef2.getTranslation());
            if (forwardedTranslations != null) {
                ArrayList arrayList2 = new ArrayList();
                for (TranslationWithRef translationWithRef4 : forwardedTranslations) {
                    Translation translation5 = translationWithRef4.getTranslation();
                    Pair pair = translation5 != null ? new Pair(translationWithRef4, translation5) : null;
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                arrayList = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    TranslationWithRef translationWithRef5 = (TranslationWithRef) pair2.getFirst();
                    Translation translation6 = (Translation) pair2.getSecond();
                    translation6.getLanguageCode();
                    z83.i();
                    MessageTranslation.Forward d = d(translation6, translationWithRef5.getTimestamp());
                    if (d != null) {
                        arrayList.add(d);
                    }
                }
            }
            return new MessageTranslation(message, e, arrayList, c(l));
        }
        return null;
    }

    public final MessageTranslation b(ServerMessage serverMessage) {
        PlainMessage plainMessage;
        String chatId;
        ForwardedMessageInfo forwardedMessageInfo;
        ServerMessageInfo serverMessageInfo;
        Translation translation;
        String languageCode;
        Long l;
        ArrayList arrayList = null;
        if (this.a.a(tz10.s) && (plainMessage = serverMessage.clientMessage.plain) != null && (chatId = plainMessage.getChatId()) != null) {
            ServerMessageInfo serverMessageInfo2 = serverMessage.serverMessageInfo;
            ForwardedMessageInfo[] forwardedMessageInfoArr = serverMessage.forwardedMessages;
            List<ForwardedMessageInfo> A = forwardedMessageInfoArr != null ? j73.A(forwardedMessageInfoArr) : null;
            Translation translation2 = serverMessageInfo2.translation;
            if (translation2 == null || (languageCode = translation2.getLanguageCode()) == null) {
                if (A != null && (forwardedMessageInfo = (ForwardedMessageInfo) a.S(0, A)) != null && (serverMessageInfo = forwardedMessageInfo.serverMessageInfo) != null && (translation = serverMessageInfo.translation) != null) {
                    languageCode = translation.getLanguageCode();
                }
            }
            String str = languageCode;
            Translation translation3 = serverMessageInfo2.translation;
            if (translation3 != null) {
                l = Long.valueOf(translation3.getStatus());
            } else {
                if (A != null) {
                    Iterator it = A.iterator();
                    while (it.hasNext()) {
                        Translation translation4 = ((ForwardedMessageInfo) it.next()).serverMessageInfo.translation;
                        Long valueOf = translation4 != null ? Long.valueOf(translation4.getStatus()) : null;
                        if (valueOf != null) {
                            l = valueOf;
                            break;
                        }
                    }
                }
                l = null;
            }
            MessageTranslation.Message message = new MessageTranslation.Message(serverMessageInfo2.timestamp, chatId, serverMessageInfo2.version, str);
            MessageTranslation.Text e = e(serverMessageInfo2.translation);
            if (A != null) {
                ArrayList arrayList2 = new ArrayList();
                for (ForwardedMessageInfo forwardedMessageInfo2 : A) {
                    Translation translation5 = forwardedMessageInfo2.serverMessageInfo.translation;
                    Pair pair = translation5 != null ? new Pair(forwardedMessageInfo2, translation5) : null;
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                arrayList = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    ForwardedMessageInfo forwardedMessageInfo3 = (ForwardedMessageInfo) pair2.getFirst();
                    Translation translation6 = (Translation) pair2.getSecond();
                    translation6.getLanguageCode();
                    z83.i();
                    MessageTranslation.Forward d = d(translation6, forwardedMessageInfo3.serverMessageInfo.timestamp);
                    if (d != null) {
                        arrayList.add(d);
                    }
                }
            }
            return new MessageTranslation(message, e, arrayList, c(l));
        }
        return null;
    }
}
