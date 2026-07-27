package androidx.versionedparcelable;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class QuantumStreamShimContextWo8a7MxMKN0IpLa3nY59701310981583 implements CharacterIterator {
    public final int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final CharSequence RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = 0;

    public QuantumStreamShimContextWo8a7MxMKN0IpLa3nY59701310981583(CharSequence charSequence, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = charSequence;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        if (i == this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
            return (char) 65535;
        }
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (i == 0) {
            this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i2;
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 + 1;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i;
        int i2 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (i < i2) {
            return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.charAt(i);
        }
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i2;
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 || i < 0) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("invalid position");
            return (char) 0;
        }
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i;
        return current();
    }
}
