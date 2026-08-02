package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class wdg {
    public final ArrayList a;

    public wdg(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdg) && this.a.equals(((wdg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("DarkConfigurationFragment(sectionGroups="), this.a, ')');
    }
}
