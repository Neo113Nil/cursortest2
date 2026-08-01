package a1;

import java.util.List;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f1724a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1725b;

    public o(String str, List list) {
        this.f1724a = str;
        this.f1725b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f1724a.equals(oVar.f1724a) && this.f1725b.equals(oVar.f1725b);
    }

    public final int hashCode() {
        return Integer.hashCode(2) + ((this.f1725b.hashCode() + (this.f1724a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "QuizQuestion(question=" + this.f1724a + ", options=" + this.f1725b + ", correctIndex=2)";
    }
}
