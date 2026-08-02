package com.squareup.cash.arcade.components.list;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda25;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import kotlin.Function;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class ListUnorderedScope implements ColumnScope {
    public final float labelWeight;
    public final ListUnorderedProminence prominence;
    public final ListUnorderedState state;

    public ListUnorderedScope(ListUnorderedState listUnorderedState, ListUnorderedProminence listUnorderedProminence, float f) {
        listUnorderedState.getClass();
        listUnorderedProminence.getClass();
        this.state = listUnorderedState;
        this.prominence = listUnorderedProminence;
        this.labelWeight = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ListUnorderedItem(AnnotatedString annotatedString, Modifier modifier, Icons icons, AnnotatedString annotatedString2, AnnotatedString annotatedString3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        AnnotatedString annotatedString4;
        int i6;
        AnnotatedString annotatedString5;
        GapComposer gapComposer;
        Icons icons2;
        Modifier modifier3;
        AnnotatedString annotatedString6;
        AnnotatedString annotatedString7;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        Modifier modifier4;
        ComposableLambdaImpl rememberComposableLambda;
        ComposableLambdaImpl rememberComposableLambda2;
        annotatedString.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(335086585);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(annotatedString) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer2.changed(icons == null ? -1 : icons.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                annotatedString4 = annotatedString2;
                i3 |= gapComposer2.changed(annotatedString4) ? 2048 : 1024;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    annotatedString5 = annotatedString3;
                    i3 |= gapComposer2.changed(annotatedString5) ? 16384 : PKIFailureInfo.certRevoked;
                    if ((196608 & i) == 0) {
                        i3 |= gapComposer2.changed(this) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                    if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                        gapComposer = gapComposer2;
                        gapComposer.skipToGroupEnd();
                        icons2 = icons;
                        modifier3 = modifier2;
                        annotatedString6 = annotatedString4;
                        annotatedString7 = annotatedString5;
                    } else {
                        if (i8 != 0) {
                            modifier4 = Modifier.Companion.$$INSTANCE;
                            i7 = i6;
                        } else {
                            i7 = i6;
                            modifier4 = modifier2;
                        }
                        ComposableLambdaImpl composableLambdaImpl = null;
                        Icons icons3 = i4 != 0 ? null : icons;
                        AnnotatedString annotatedString8 = i5 != 0 ? null : annotatedString4;
                        AnnotatedString annotatedString9 = i7 != 0 ? null : annotatedString5;
                        ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(1257693363, new BenefitsLeafletViewKt$$ExternalSyntheticLambda25(annotatedString, 1), gapComposer2);
                        int i9 = 6;
                        if (icons3 == null) {
                            gapComposer2.startReplaceGroup(1060836466);
                            gapComposer2.end(false);
                            rememberComposableLambda = null;
                        } else {
                            gapComposer2.startReplaceGroup(1060836467);
                            rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1676446570, new InfoSectionKt$$ExternalSyntheticLambda6(icons3, i9), gapComposer2);
                            gapComposer2.end(false);
                        }
                        if (annotatedString8 == null) {
                            gapComposer2.startReplaceGroup(1060912943);
                            gapComposer2.end(false);
                            rememberComposableLambda2 = null;
                        } else {
                            gapComposer2.startReplaceGroup(1060912944);
                            rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1490603036, new BenefitsLeafletViewKt$$ExternalSyntheticLambda25(annotatedString8, 2), gapComposer2);
                            gapComposer2.end(false);
                        }
                        if (annotatedString9 == null) {
                            gapComposer2.startReplaceGroup(1060989389);
                        } else {
                            gapComposer2.startReplaceGroup(1060989390);
                            composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1917872765, new BenefitsLeafletViewKt$$ExternalSyntheticLambda25(annotatedString9, 3), gapComposer2);
                        }
                        gapComposer2.end(false);
                        gapComposer = gapComposer2;
                        ListUnorderedKt.ListUnorderedItem(this.state, this.prominence, this.labelWeight, modifier4, rememberComposableLambda3, rememberComposableLambda, rememberComposableLambda2, composableLambdaImpl, gapComposer, ((i3 << 6) & 7168) | 24576);
                        AnnotatedString annotatedString10 = annotatedString9;
                        annotatedString6 = annotatedString8;
                        icons2 = icons3;
                        annotatedString7 = annotatedString10;
                        modifier3 = modifier4;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(this, annotatedString, modifier3, icons2, annotatedString6, annotatedString7, i, i2, 15);
                        return;
                    }
                    return;
                }
                annotatedString5 = annotatedString3;
                if ((196608 & i) == 0) {
                }
                if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            annotatedString4 = annotatedString2;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            annotatedString5 = annotatedString3;
            if ((196608 & i) == 0) {
            }
            if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        annotatedString4 = annotatedString2;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        annotatedString5 = annotatedString3;
        if ((196608 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        modifier.getClass();
        horizontal.getClass();
        return modifier.then(new HorizontalAlignElement(horizontal));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier weight(float f, Modifier modifier, boolean z) {
        modifier.getClass();
        if (f <= 0.0d) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return modifier.then(new LayoutWeightElement(f, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ListUnorderedItem(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function2 function2, Function2 function22, Function2 function23, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function24;
        int i5;
        Function2 function25;
        int i6;
        GapComposer gapComposer;
        Modifier modifier3;
        Function2 function26;
        Function2 function27;
        Function2 function28;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(74550438);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                function24 = function2;
                i3 |= gapComposer2.changedInstance(function24) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function25 = function22;
                    i3 |= gapComposer2.changedInstance(function25) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= gapComposer2.changedInstance(function23) ? 16384 : PKIFailureInfo.certRevoked;
                        if ((196608 & i) == 0) {
                            i3 |= gapComposer2.changed(this) ? PKIFailureInfo.unsupportedVersion : 65536;
                        }
                        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                            Modifier modifier4 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                            Function2 function29 = i4 != 0 ? null : function24;
                            Function2 function210 = i5 != 0 ? null : function25;
                            Function2 function211 = i6 != 0 ? null : function23;
                            int i8 = ((i3 << 6) & 7168) | ((i3 << 12) & 57344);
                            int i9 = i3 << 9;
                            gapComposer = gapComposer2;
                            ListUnorderedKt.ListUnorderedItem(this.state, this.prominence, this.labelWeight, modifier4, composableLambdaImpl, function29, function210, function211, gapComposer, i8 | (458752 & i9) | (3670016 & i9) | (i9 & 29360128));
                            modifier3 = modifier4;
                            function26 = function29;
                            function27 = function210;
                            function28 = function211;
                        } else {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            modifier3 = modifier2;
                            function26 = function24;
                            function27 = function25;
                            function28 = function23;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1((Object) this, composableLambdaImpl, modifier3, (Function) function26, function27, (Function) function28, i, i2, 14);
                            return;
                        }
                        return;
                    }
                    if ((196608 & i) == 0) {
                    }
                    if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function25 = function22;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((196608 & i) == 0) {
                }
                if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function24 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function25 = function22;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function24 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function25 = function22;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
