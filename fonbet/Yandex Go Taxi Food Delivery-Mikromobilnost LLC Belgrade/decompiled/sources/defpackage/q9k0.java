package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class q9k0 implements ibk0 {
    public final String a;
    public final String b;

    public q9k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return "feedback_question";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9k0)) {
            return false;
        }
        q9k0 q9k0Var = (q9k0) obj;
        return jl40.l(this.a, q9k0Var.a) && jl40.l(this.b, q9k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("FeedbackQuestion(questionId=", this.a, ", answerId=", this.b, Extension.C_BRAKE);
    }
}
