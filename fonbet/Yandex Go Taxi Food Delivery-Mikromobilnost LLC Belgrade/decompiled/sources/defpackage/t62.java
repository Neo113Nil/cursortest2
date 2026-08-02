package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class t62 implements y62 {
    public final agj a;

    public t62(agj agjVar) {
        this.a = agjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t62) && jl40.l(this.a, ((t62) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "DialogueAction(dialogueUiAction=" + this.a + Extension.C_BRAKE;
    }
}
