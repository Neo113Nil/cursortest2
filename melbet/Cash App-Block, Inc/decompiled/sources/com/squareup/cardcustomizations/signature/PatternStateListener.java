package com.squareup.cardcustomizations.signature;

import com.squareup.cardcustomizations.stampview.PatternStampState;
import kotlin.Pair;

/* loaded from: classes6.dex */
public interface PatternStateListener {
    Pair onPatternCommitted(SignatureState signatureState, PatternStampState patternStampState);
}
