package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class z30 extends defpackage.h0 {
    public final java.text.BreakIterator ZVVdXbWmyCSK;

    public z30(java.lang.CharSequence charSequence) {
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.ZVVdXbWmyCSK = characterInstance;
    }

    @Override // defpackage.h0
    public final int OVwOqzUGHcCU(int i) {
        return this.ZVVdXbWmyCSK.preceding(i);
    }

    @Override // defpackage.h0
    public final int w6IV1lieBIux(int i) {
        return this.ZVVdXbWmyCSK.following(i);
    }
}
