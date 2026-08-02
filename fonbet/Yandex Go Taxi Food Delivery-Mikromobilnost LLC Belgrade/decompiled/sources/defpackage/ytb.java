package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ytb implements sj01 {
    public final wtb a;

    public ytb(wtb wtbVar) {
        this.a = wtbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytb) && this.a.equals(((ytb) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "CircleButtonsListViewItem(buttonsList=" + this.a + Extension.C_BRAKE;
    }
}
