package com.squareup.cash.fidesmo.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material.TextKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.TextUnit;
import app.cash.redwood.Modifier$$ExternalSyntheticLambda0;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import com.squareup.cash.fidesmo.views.ScanningStarPulseKt;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import java.text.BreakIterator;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ScanningStarPulseKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ea  */
    /* renamed from: MiddleEllipsisText-oiE5lR0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3552MiddleEllipsisTextoiE5lR0(final String str, Modifier modifier, long j, long j2, long j3, TextDecoration textDecoration, long j4, boolean z, Function1 function1, TextStyle textStyle, char c, int i, Composer composer, final int i2, final int i3) {
        long j5;
        int i4;
        TextDecoration textDecoration2;
        int i5;
        TextStyle textStyle2;
        int i6;
        int i7;
        Modifier modifier2;
        final long j6;
        final boolean z2;
        final Function1 function12;
        char c2;
        final int i8;
        final TextStyle textStyle3;
        final TextDecoration textDecoration3;
        final long j7;
        final long j8;
        final long j9;
        RecomposeScopeImpl endRestartGroup;
        TextStyle textStyle4;
        Modifier modifier3;
        int i9;
        int i10;
        int i11;
        char c3;
        Function1 function13;
        long j10;
        final long j11;
        boolean z3;
        TextStyle textStyle5;
        long j12;
        final Ref$ObjectRef ref$ObjectRef;
        final TextDecoration textDecoration4;
        final long j13;
        final long j14;
        final long j15;
        TextStyle textStyle6;
        boolean z4;
        int i12;
        Function1 function14;
        char c4;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-444925138);
        int i13 = i2 | (gapComposer.changed(str) ? 4 : 2);
        int i14 = i13 | 48;
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 = i13 | 432;
            j5 = j;
        } else {
            j5 = j;
            i4 = (gapComposer.changed(j5) ? 256 : 128) | i14;
        }
        int i16 = 14380032 | i4;
        int i17 = i3 & 256;
        if (i17 != 0) {
            i5 = i4 | 115043328;
            textDecoration2 = textDecoration;
        } else {
            textDecoration2 = textDecoration;
            i5 = i16 | (gapComposer.changed(textDecoration2) ? 67108864 : 33554432);
        }
        int i18 = i5 | 805306368;
        if ((i3 & PKIFailureInfo.certRevoked) == 0) {
            textStyle2 = textStyle;
            if (gapComposer.changed(textStyle2)) {
                i6 = 2048;
                int i19 = 221622;
                i7 = i6 | 221622;
                if (gapComposer.shouldExecute(i18 & 1, (306783379 & i18) == 306783378 || (74899 & i7) != 74898)) {
                    gapComposer.skipToGroupEnd();
                    modifier2 = modifier;
                    j6 = j4;
                    z2 = z;
                    function12 = function1;
                    c2 = c;
                    i8 = i;
                    textStyle3 = textStyle2;
                    textDecoration3 = textDecoration2;
                    j7 = j5;
                    j8 = j2;
                    j9 = j3;
                } else {
                    gapComposer.startDefaults();
                    if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        long j16 = i15 != 0 ? Color.Unspecified : j5;
                        long j17 = TextUnit.Unspecified;
                        if (i17 != 0) {
                            textDecoration2 = null;
                        }
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new EncodeKt$$ExternalSyntheticLambda0(18);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Function1 function15 = (Function1) rememberedValue;
                        if ((i3 & PKIFailureInfo.certRevoked) != 0) {
                            textStyle4 = (TextStyle) gapComposer.consume(TextKt.LocalTextStyle);
                        } else {
                            textStyle4 = textStyle2;
                            i19 = i7;
                        }
                        modifier3 = Modifier.Companion.$$INSTANCE;
                        i9 = i18;
                        i10 = 3;
                        i11 = i19;
                        c3 = '.';
                        function13 = function15;
                        j5 = j16;
                        j10 = j17;
                        j11 = j10;
                        z3 = true;
                        textStyle5 = textStyle4;
                        j12 = j11;
                    } else {
                        gapComposer.skipToGroupEnd();
                        if ((i3 & PKIFailureInfo.certRevoked) != 0) {
                            modifier3 = modifier;
                            z3 = z;
                            function13 = function1;
                            c3 = c;
                            i10 = i;
                            i9 = i18;
                            textStyle5 = textStyle2;
                            i11 = 221622;
                            j10 = j2;
                            j12 = j3;
                            j11 = j4;
                        } else {
                            j11 = j4;
                            z3 = z;
                            function13 = function1;
                            c3 = c;
                            i10 = i;
                            i9 = i18;
                            textStyle5 = textStyle2;
                            i11 = i7;
                            modifier3 = modifier;
                            j10 = j2;
                            j12 = j3;
                        }
                    }
                    gapComposer.endDefaults();
                    if (str.length() == 0) {
                        gapComposer.startReplaceGroup(-495036977);
                        int i20 = i9 & 2147483534;
                        int i21 = 196998 | ((i11 << 9) & 3670016);
                        long j18 = j12;
                        TextDecoration textDecoration5 = textDecoration2;
                        long j19 = j5;
                        Modifier modifier4 = modifier3;
                        textStyle6 = textStyle5;
                        z4 = z3;
                        function14 = function13;
                        TextKt.m509Text4IGK_g(str, null, j19, j10, null, j18, textDecoration5, null, j11, 0, z4, 0, 0, function14, textStyle6, gapComposer, i20, i21, 26626);
                        gapComposer.end(false);
                        textDecoration4 = textDecoration5;
                        c4 = c3;
                        i12 = i10;
                        modifier2 = modifier4;
                        j13 = j18;
                        j14 = j10;
                        j15 = j19;
                        gapComposer = gapComposer;
                    } else {
                        Modifier modifier5 = modifier3;
                        final TextStyle textStyle7 = textStyle5;
                        final Function1 function16 = function13;
                        final boolean z5 = z3;
                        long j20 = j12;
                        TextDecoration textDecoration6 = textDecoration2;
                        long j21 = j5;
                        gapComposer.startReplaceGroup(-494332595);
                        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                        final int i22 = i10;
                        final String repeat = StringsKt__StringsJVMKt.repeat(i22, String.valueOf(c3));
                        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                        characterInstance.setText(str);
                        final ArrayList arrayList = new ArrayList();
                        while (true) {
                            ref$ObjectRef = ref$ObjectRef2;
                            if (characterInstance.next() == -1) {
                                break;
                            }
                            arrayList.add(Integer.valueOf(characterInstance.current()));
                            ref$ObjectRef2 = ref$ObjectRef;
                        }
                        textDecoration4 = textDecoration6;
                        j13 = j20;
                        j14 = j10;
                        j15 = j21;
                        final char c5 = c3;
                        Function2 function2 = new Function2() { // from class: com.stripe.android.uicore.text.MiddleEllipsisTextKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
                                final Constraints constraints = (Constraints) obj2;
                                subcomposeMeasureScope.getClass();
                                final String str2 = str;
                                final char c6 = c5;
                                final long j22 = j15;
                                final long j23 = j14;
                                final long j24 = j13;
                                final TextDecoration textDecoration7 = textDecoration4;
                                final long j25 = j11;
                                final boolean z6 = z5;
                                final TextStyle textStyle8 = textStyle7;
                                final Ref$ObjectRef ref$ObjectRef3 = Ref$ObjectRef.this;
                                ((Measurable) subcomposeMeasureScope.subcompose("MiddleEllipsisText_calculate", new ComposableLambdaImpl(new Function2() { // from class: com.stripe.android.uicore.text.MiddleEllipsisTextKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Composer composer2 = (Composer) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            TextKt.m509Text4IGK_g(str2 + c6, null, j22, j23, null, j24, textDecoration7, null, j25, 0, z6, 0, 0, new Modifier$$ExternalSyntheticLambda0(5, ref$ObjectRef3), textStyle8, gapComposer2, 0, 0, 26626);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, true, 566593623)).get(0)).mo833measureBRTryo0(ConstraintsKt.Constraints$default(0, 0, 0, 0, 15));
                                if (((TextLayoutResult) ref$ObjectRef3.element) == null) {
                                    return MeasureScope.layout$default(subcomposeMeasureScope, 0, 0, new EncodeKt$$ExternalSyntheticLambda0(19));
                                }
                                final String str3 = repeat;
                                final Function1 function17 = function16;
                                final int i23 = i22;
                                final ArrayList arrayList2 = arrayList;
                                Placeable mo833measureBRTryo0 = ((Measurable) subcomposeMeasureScope.subcompose("MiddleEllipsisText_apply", new ComposableLambdaImpl(new Function2() { // from class: com.stripe.android.uicore.text.MiddleEllipsisTextKt$$ExternalSyntheticLambda5
                                    /* JADX WARN: Removed duplicated region for block: B:35:0x0148 A[LOOP:1: B:27:0x010b->B:35:0x0148, LOOP_END] */
                                    /* JADX WARN: Removed duplicated region for block: B:36:0x01f8 A[EDGE_INSN: B:36:0x01f8->B:37:0x01f8 BREAK  A[LOOP:0: B:17:0x00a9->B:50:0x01f0, LOOP_LABEL: LOOP:0: B:17:0x00a9->B:50:0x01f0], SYNTHETIC] */
                                    /* JADX WARN: Removed duplicated region for block: B:66:0x01d6 A[LOOP:2: B:58:0x019a->B:66:0x01d6, LOOP_END] */
                                    /* JADX WARN: Removed duplicated region for block: B:67:0x01f8 A[EDGE_INSN: B:67:0x01f8->B:37:0x01f8 BREAK  A[LOOP:0: B:17:0x00a9->B:50:0x01f0, LOOP_LABEL: LOOP:0: B:17:0x00a9->B:50:0x01f0], SYNTHETIC] */
                                    @Override // kotlin.jvm.functions.Function2
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object invoke(Object obj3, Object obj4) {
                                        int i24;
                                        int i25;
                                        String str4;
                                        String str5;
                                        Object failure;
                                        int i26;
                                        Object failure2;
                                        Composer composer2 = (Composer) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            Ref$ObjectRef ref$ObjectRef4 = Ref$ObjectRef.this;
                                            TextLayoutResult textLayoutResult = (TextLayoutResult) ref$ObjectRef4.element;
                                            String str6 = str2;
                                            boolean changed = gapComposer2.changed(str6);
                                            String str7 = str3;
                                            boolean changed2 = gapComposer2.changed(textLayoutResult) | changed | gapComposer2.changed(str7);
                                            Object rememberedValue2 = gapComposer2.rememberedValue();
                                            if (changed2 || rememberedValue2 == Composer.Companion.Empty) {
                                                Object obj5 = ref$ObjectRef4.element;
                                                obj5.getClass();
                                                float f = ((TextLayoutResult) obj5).getBoundingBox(StringsKt.getLastIndex(str6)).right;
                                                Constraints constraints2 = constraints;
                                                if (f > Constraints.m1025getMaxWidthimpl(constraints2.value)) {
                                                    Object obj6 = ref$ObjectRef4.element;
                                                    obj6.getClass();
                                                    Rect boundingBox = ((TextLayoutResult) obj6).getBoundingBox(str6.length());
                                                    float m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(constraints2.value) - ((boundingBox.right - boundingBox.left) * i23);
                                                    int length = str6.length() - 1;
                                                    ArrayList arrayList3 = arrayList2;
                                                    int size = arrayList3.size() - 1;
                                                    ArrayList arrayList4 = new ArrayList();
                                                    ArrayList arrayList5 = new ArrayList();
                                                    int size2 = arrayList3.size();
                                                    float f2 = 0.0f;
                                                    float f3 = 0.0f;
                                                    int i27 = 0;
                                                    int i28 = 0;
                                                    int i29 = 0;
                                                    int i30 = size;
                                                    int i31 = length;
                                                    loop0: while (i27 < size2 && i28 < i31) {
                                                        Object obj7 = ref$ObjectRef4.element;
                                                        obj7.getClass();
                                                        Rect boundingBox2 = ((TextLayoutResult) obj7).getBoundingBox(i28);
                                                        int i32 = i27;
                                                        Object obj8 = ref$ObjectRef4.element;
                                                        obj8.getClass();
                                                        Rect boundingBox3 = ((TextLayoutResult) obj8).getBoundingBox(i31);
                                                        if (f3 <= f2) {
                                                            i24 = i28;
                                                            if ((boundingBox2.right - boundingBox2.left) + f3 + f2 <= m1025getMaxWidthimpl) {
                                                                ArrayList arrayList6 = new ArrayList();
                                                                int i33 = i31;
                                                                i25 = size2;
                                                                int i34 = i24;
                                                                int i35 = 0;
                                                                for (int intValue2 = i29 == 0 ? ((Number) arrayList3.get(i29)).intValue() : ((Number) arrayList3.get(i29)).intValue() - ((Number) arrayList3.get(i29 - 1)).intValue(); i35 < intValue2; intValue2 = i26) {
                                                                    try {
                                                                        Result.Companion companion = Result.Companion;
                                                                        arrayList6.add(Character.valueOf(str6.charAt(i34)));
                                                                        Object obj9 = ref$ObjectRef4.element;
                                                                        obj9.getClass();
                                                                        Rect boundingBox4 = ((TextLayoutResult) obj9).getBoundingBox(i34);
                                                                        i26 = intValue2;
                                                                        try {
                                                                            f3 = (boundingBox4.right - boundingBox4.left) + f3;
                                                                            i34++;
                                                                            failure2 = Unit.INSTANCE;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            Result.Companion companion2 = Result.Companion;
                                                                            failure2 = new Result.Failure(th);
                                                                            if (Result.m4120exceptionOrNullimpl(failure2) == null) {
                                                                            }
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        i26 = intValue2;
                                                                    }
                                                                    if (Result.m4120exceptionOrNullimpl(failure2) == null) {
                                                                        break loop0;
                                                                    }
                                                                    i35++;
                                                                }
                                                                if (f3 + f2 <= m1025getMaxWidthimpl) {
                                                                    arrayList4.addAll(arrayList6);
                                                                    i29++;
                                                                }
                                                                str4 = str6;
                                                                i28 = i34;
                                                                i31 = i33;
                                                                i27 = i32 + 1;
                                                                size2 = i25;
                                                                str6 = str4;
                                                            }
                                                        } else {
                                                            i24 = i28;
                                                        }
                                                        int i36 = i31;
                                                        i25 = size2;
                                                        if (f3 < f2) {
                                                            break;
                                                        }
                                                        if ((boundingBox3.right - boundingBox3.left) + f3 + f2 > m1025getMaxWidthimpl) {
                                                            break;
                                                        }
                                                        int i37 = i30 - 1;
                                                        int intValue3 = ((Number) arrayList3.get(i30)).intValue() - ((Number) arrayList3.get(i37)).intValue();
                                                        ArrayList arrayList7 = new ArrayList();
                                                        int i38 = i36;
                                                        int i39 = 0;
                                                        while (i39 < intValue3) {
                                                            try {
                                                                Result.Companion companion3 = Result.Companion;
                                                                str5 = str6;
                                                                try {
                                                                    arrayList7.add(0, Character.valueOf(str6.charAt(i38)));
                                                                    Object obj10 = ref$ObjectRef4.element;
                                                                    obj10.getClass();
                                                                    Rect boundingBox5 = ((TextLayoutResult) obj10).getBoundingBox(i38);
                                                                    f2 += boundingBox5.right - boundingBox5.left;
                                                                    i38--;
                                                                    failure = Unit.INSTANCE;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    Result.Companion companion4 = Result.Companion;
                                                                    failure = new Result.Failure(th);
                                                                    if (Result.m4120exceptionOrNullimpl(failure) == null) {
                                                                    }
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                str5 = str6;
                                                            }
                                                            if (Result.m4120exceptionOrNullimpl(failure) == null) {
                                                                break loop0;
                                                            }
                                                            i39++;
                                                            str6 = str5;
                                                        }
                                                        str4 = str6;
                                                        if (f3 + f2 <= m1025getMaxWidthimpl) {
                                                            arrayList5.addAll(0, arrayList7);
                                                            i31 = i38;
                                                            i28 = i24;
                                                            i30 = i37;
                                                        } else {
                                                            i31 = i38;
                                                            i28 = i24;
                                                        }
                                                        i27 = i32 + 1;
                                                        size2 = i25;
                                                        str6 = str4;
                                                    }
                                                    str6 = Recorder$$ExternalSyntheticOutline2.m(CollectionsKt.joinToString$default(arrayList4, "", null, null, 0, null, null, 62), str7, CollectionsKt.joinToString$default(arrayList5, "", null, null, 0, null, null, 62));
                                                }
                                                gapComposer2.updateRememberedValue(str6);
                                                rememberedValue2 = str6;
                                            }
                                            TextKt.m509Text4IGK_g((String) rememberedValue2, null, j22, j23, null, j24, textDecoration7, null, j25, 0, z6, 1, 0, function17, textStyle8, gapComposer2, 0, 3072, 18434);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, true, -1570169603)).get(0)).mo833measureBRTryo0(constraints.value);
                                return MeasureScope.layout$default(subcomposeMeasureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 23));
                            }
                        };
                        textStyle6 = textStyle7;
                        z4 = z5;
                        i12 = i22;
                        function14 = function16;
                        c4 = c5;
                        modifier2 = modifier5;
                        gapComposer = gapComposer;
                        RulerKt.SubcomposeLayout(modifier2, function2, gapComposer, 6, 0);
                        gapComposer.end(false);
                    }
                    c2 = c4;
                    j7 = j15;
                    j8 = j14;
                    j9 = j13;
                    textDecoration3 = textDecoration4;
                    j6 = j11;
                    i8 = i12;
                    z2 = z4;
                    function12 = function14;
                    textStyle3 = textStyle6;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    final Modifier modifier6 = modifier2;
                    final char c6 = c2;
                    endRestartGroup.block = new Function2(str, modifier6, j7, j8, j9, textDecoration3, j6, z2, function12, textStyle3, c6, i8, i2, i3) { // from class: com.stripe.android.uicore.text.MiddleEllipsisTextKt$$ExternalSyntheticLambda2
                        public final /* synthetic */ String f$0;
                        public final /* synthetic */ Modifier f$1;
                        public final /* synthetic */ long f$10;
                        public final /* synthetic */ boolean f$11;
                        public final /* synthetic */ Function1 f$12;
                        public final /* synthetic */ TextStyle f$13;
                        public final /* synthetic */ char f$14;
                        public final /* synthetic */ int f$15;
                        public final /* synthetic */ int f$18;
                        public final /* synthetic */ long f$2;
                        public final /* synthetic */ long f$3;
                        public final /* synthetic */ long f$7;
                        public final /* synthetic */ TextDecoration f$8;

                        {
                            this.f$18 = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(1);
                            ScanningStarPulseKt.m3552MiddleEllipsisTextoiE5lR0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$7, this.f$8, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, (Composer) obj, updateChangedFlags, this.f$18);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            textStyle2 = textStyle;
        }
        i6 = 1024;
        int i192 = 221622;
        i7 = i6 | 221622;
        if (gapComposer.shouldExecute(i18 & 1, (306783379 & i18) == 306783378 || (74899 & i7) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ScanningStarPulse(Modifier modifier, ScanningStarPulseParams scanningStarPulseParams, ScanningStepAnimationTrigger scanningStepAnimationTrigger, Integer num, float f, Function0 function0, Function0 function02, Function0 function03, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(32986546);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(scanningStarPulseParams) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(scanningStepAnimationTrigger) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(num) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(f) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function03) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer = gapComposer2;
            ScanningShapePulseKt.ScanningShapePulse(modifier, ScanningShapePulseParams.m3551copyXu8qxI8$default(ScanningShapePulseKt.defaultScanningShapePulseParams(FidesmoScanningPulseShape.STAR), scanningStarPulseParams.alignment, scanningStarPulseParams.offsetX, scanningStarPulseParams.offsetY, scanningStarPulseParams.starSize, scanningStarPulseParams.starScale, scanningStarPulseParams.primaryOpacity, scanningStarPulseParams.fillDurationSeconds, scanningStarPulseParams.beatDurationSeconds, scanningStarPulseParams.glowScale, scanningStarPulseParams.glowAlpha, scanningStarPulseParams.glowBlur, scanningStarPulseParams.glowPulseAmount, scanningStarPulseParams.glowPulseDurationSeconds, scanningStarPulseParams.cellSize, scanningStarPulseParams.gap, scanningStarPulseParams.cornerRadius, scanningStarPulseParams.spread, scanningStarPulseParams.twinkleSpeed, scanningStarPulseParams.targetFillDurationSeconds, scanningStarPulseParams.targetShapeScaleBoost, scanningStarPulseParams.targetHoldMillis, scanningStarPulseParams.targetSpringDamping, scanningStarPulseParams.targetSpringStiffness, scanningStarPulseParams.stepTurnRotationDegrees, scanningStarPulseParams.stepTurnMaxTurnsPerSpring, scanningStarPulseParams.stepTurnOrbPeakScale, scanningStarPulseParams.stepTurnHoldMillis, scanningStarPulseParams.orbTurnDamping, scanningStarPulseParams.orbTurnStiffness, scanningStarPulseParams.starTurnDamping, scanningStarPulseParams.starTurnStiffness, scanningStarPulseParams.orbReturnDamping, scanningStarPulseParams.orbReturnStiffness, scanningStarPulseParams.stabilityAnimationParams, 1, 0), scanningStepAnimationTrigger, num, f, function0, function02, function03, gapComposer, i2 & 33554318);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda3(modifier, scanningStarPulseParams, scanningStepAnimationTrigger, num, f, function0, function02, function03, i, 4);
        }
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
