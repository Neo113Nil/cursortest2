package app.cash.broadway.navigation;

import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.Screen;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface Navigator {
    default void askQuestion(Question question, Function1 function1) {
        question.getClass();
        function1.getClass();
        throw new UnsupportedOperationException();
    }

    default void giveAnswer(AskedQuestion askedQuestion, Object obj) {
        askedQuestion.getClass();
        obj.getClass();
        throw new UnsupportedOperationException();
    }

    void goTo(Screen screen);
}
