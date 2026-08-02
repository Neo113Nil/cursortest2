package defpackage;

import androidx.emoji2.emojipicker.ItemType;

/* loaded from: classes10.dex */
public final class y3c0 extends g3x {
    public final String c;

    public y3c0(String str) {
        super(ItemType.PLACEHOLDER_TEXT);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3c0) && jl40.l(this.c, ((y3c0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("PlaceholderText(text="), this.c, ')');
    }
}
