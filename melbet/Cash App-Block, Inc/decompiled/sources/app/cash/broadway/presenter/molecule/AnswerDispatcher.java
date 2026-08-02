package app.cash.broadway.presenter.molecule;

import app.cash.broadway.screen.Answer;
import app.cash.broadway.screen.Question;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import kotlinx.coroutines.channels.BufferedChannel;
import papa.PapaEvent;

/* loaded from: classes.dex */
public final class AnswerDispatcher {
    public final Answer initialAnswer;
    public final String name;
    public final BufferedChannel answers = PapaEvent.Channel$default(10, null, null, 6);
    public final LinkedHashMap answerReceivers = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public final class AnswerReceiver {
        public final Function2 receiver;
        public final KClass tClass;

        public AnswerReceiver(KClass kClass, Function2 function2) {
            kClass.getClass();
            function2.getClass();
            this.tClass = kClass;
            this.receiver = function2;
        }

        public final void send(Question question, Object obj) {
            question.getClass();
            if (obj == null) {
                obj = null;
            } else {
                KClasses.cast(this.tClass, obj);
            }
            this.receiver.invoke(question, obj);
        }
    }

    public AnswerDispatcher(String str, Answer answer) {
        this.name = str;
        this.initialAnswer = answer;
    }

    public final void registerReceiver(KClass kClass, AnswerReceiver answerReceiver) {
        kClass.getClass();
        LinkedHashMap linkedHashMap = this.answerReceivers;
        if (linkedHashMap.containsKey(kClass)) {
            a$$ExternalSyntheticBUOutline0.m(this.name, " for question type '", kClass, "'.", "An AnswerHandler has already been registered in ");
        } else {
            linkedHashMap.put(kClass, answerReceiver);
        }
    }

    public final void send(Answer answer) {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(answer.question.getClass());
        Object obj = this.answerReceivers.get(orCreateKotlinClass);
        if (obj != null) {
            ((AnswerReceiver) obj).send(answer.question, answer.value);
        } else {
            a$$ExternalSyntheticBUOutline0.m(this.name, " to deliver a question of type '", orCreateKotlinClass, "'.", "An AnswerHandler was not found in ");
        }
    }

    public final void unregisterReceiver(KClass kClass, AnswerReceiver answerReceiver) {
        kClass.getClass();
        answerReceiver.getClass();
        if (this.answerReceivers.remove(kClass) == answerReceiver) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m(this.name, " for question type '", kClass, "'.", "An AnswerHandler was not found in ");
    }
}
