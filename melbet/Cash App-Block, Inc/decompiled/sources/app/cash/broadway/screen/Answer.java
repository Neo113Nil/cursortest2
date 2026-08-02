package app.cash.broadway.screen;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Answer {
    public final Question question;
    public final Object value;

    public Answer(Question question, Object obj) {
        question.getClass();
        this.question = question;
        this.value = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Answer)) {
            return false;
        }
        Answer answer = (Answer) obj;
        return Intrinsics.areEqual(this.question, answer.question) && Intrinsics.areEqual(this.value, answer.value);
    }

    public final int hashCode() {
        int hashCode = this.question.hashCode() * 31;
        Object obj = this.value;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Answer(question=" + this.question + ", value=" + this.value + ")";
    }
}
