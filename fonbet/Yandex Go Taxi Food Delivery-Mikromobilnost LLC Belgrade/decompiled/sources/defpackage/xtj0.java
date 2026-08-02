package defpackage;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public class xtj0 {
    public final ArrayList a = new ArrayList();

    public final synchronized vtj0 a(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            wtj0 wtj0Var = (wtj0) this.a.get(i);
            if (wtj0Var.a.isAssignableFrom(cls)) {
                return wtj0Var.b;
            }
        }
        return null;
    }
}
