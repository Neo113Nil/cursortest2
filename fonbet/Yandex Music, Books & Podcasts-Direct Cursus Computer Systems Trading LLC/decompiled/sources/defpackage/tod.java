package defpackage;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class tod extends zc4 {
    public final BreakIterator n;

    public tod(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.n = characterInstance;
    }

    @Override // defpackage.zc4
    public final int M(int i) {
        return this.n.following(i);
    }

    @Override // defpackage.zc4
    public final int V(int i) {
        return this.n.preceding(i);
    }
}
