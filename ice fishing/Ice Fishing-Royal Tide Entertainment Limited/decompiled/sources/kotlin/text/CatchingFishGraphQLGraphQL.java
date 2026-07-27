package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLGraphQL implements Iterator, CatchingFishCardViewFAB {
    public int CatchingFishDaggerWebsocket;
    public final CharSequence CatchingFishReduxKtor;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public CatchingFishGraphQLGraphQL(CharSequence charSequence) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(charSequence, "string");
        this.CatchingFishReduxKtor = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.CatchingFishDaggerWebsocket;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.CatchingFishViewModelFAB < 0) {
            this.CatchingFishDaggerWebsocket = 2;
            return false;
        }
        CharSequence charSequence = this.CatchingFishReduxKtor;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.CatchingFishWorkManager; i4 < length2; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.CatchingFishDaggerWebsocket = 1;
                this.CatchingFishViewModelFAB = i;
                this.CatchingFishViewModelScope = length;
                return true;
            }
        }
        i = -1;
        this.CatchingFishDaggerWebsocket = 1;
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishViewModelScope = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.CatchingFishDaggerWebsocket = 0;
        int i = this.CatchingFishViewModelScope;
        int i2 = this.CatchingFishWorkManager;
        this.CatchingFishWorkManager = this.CatchingFishViewModelFAB + i;
        return this.CatchingFishReduxKtor.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
