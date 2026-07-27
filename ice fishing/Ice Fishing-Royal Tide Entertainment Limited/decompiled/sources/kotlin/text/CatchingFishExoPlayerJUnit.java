package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishExoPlayerJUnit extends CatchingFishAccessibility {
    public static CatchingFishExoPlayerJUnit CatchingFishCoroutine;

    public final boolean CatchingFishLayout(int i) {
        if (i <= 0 || CatchingFishViewModelScope().charAt(i - 1) == '\n') {
            return false;
        }
        return i == CatchingFishViewModelScope().length() || CatchingFishViewModelScope().charAt(i) == '\n';
    }

    @Override // kotlin.text.CatchingFishAccessibility
    public final int[] CatchingFishReduxKtor(int i) {
        int length = CatchingFishViewModelScope().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && CatchingFishViewModelScope().charAt(i) == '\n' && (CatchingFishViewModelScope().charAt(i) == '\n' || (i != 0 && CatchingFishViewModelScope().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !CatchingFishLayout(i2)) {
            i2++;
        }
        return CatchingFishWorkManager(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // kotlin.text.CatchingFishAccessibility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] CatchingFishViewModelFAB(int i) {
        int length = CatchingFishViewModelScope().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && CatchingFishViewModelScope().charAt(i - 1) == '\n' && !CatchingFishLayout(i)) {
            i--;
        }
        int i2 = i - 1;
        while (i2 > 0 && (CatchingFishViewModelScope().charAt(i2) == '\n' || (i2 != 0 && CatchingFishViewModelScope().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return CatchingFishWorkManager(i2, i);
    }
}
