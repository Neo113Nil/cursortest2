package com.squareup.cash.money.views;

import androidx.compose.animation.EnterExitState;
import com.squareup.protos.franklin.cards.CardTheme;

/* loaded from: classes6.dex */
public abstract class MoneyTabToolbarKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardTheme.Identifier.values().length];
            try {
                iArr[CardTheme.Identifier.BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTheme.Identifier.METAL_BLACK_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardTheme.Identifier.METAL_OIL_SLICK_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardTheme.Identifier.GLITTER_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardTheme.Identifier.GLOW_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardTheme.Identifier.HOLO_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CardTheme.Identifier.MOOD_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CardTheme.Identifier.PINK_ID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CardTheme.Identifier.TORTOISE_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CardTheme.Identifier.WHITE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CardTheme.Identifier.BRAT_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CardTheme.Identifier.HOOD_BY_AIR_ID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CardTheme.Identifier.HUNDRED_THIEVES_ID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CardTheme.Identifier.SHANTELL_MARTIN_ID.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CardTheme.Identifier.SLIMEGUY_ID.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CardTheme.Identifier.TAP_DEVICE_TRIAL_ID.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CardTheme.Identifier.DREAM_ID.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnterExitState.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                EnterExitState enterExitState = EnterExitState.PreEnter;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                EnterExitState enterExitState2 = EnterExitState.PreEnter;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v23 app.cash.broadway.ui.compose.ToolbarConfig, still in use, count: 2, list:
          (r2v23 app.cash.broadway.ui.compose.ToolbarConfig) from 0x0213: MOVE (r0v17 app.cash.broadway.ui.compose.ToolbarConfig) = (r2v23 app.cash.broadway.ui.compose.ToolbarConfig)
          (r2v23 app.cash.broadway.ui.compose.ToolbarConfig) from 0x020d: MOVE (r0v22 app.cash.broadway.ui.compose.ToolbarConfig) = (r2v23 app.cash.broadway.ui.compose.ToolbarConfig)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    public static final void MoneyTabToolbar(app.cash.broadway.ui.compose.UiScope r32, com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel r33, java.lang.String r34, com.squareup.protos.franklin.cards.CardTheme.Identifier r35, com.squareup.cash.money.views.ToolbarNestedScrollExpander r36, com.squareup.cash.money.views.CardNestedScrollExpander r37, com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry r38, kotlin.jvm.functions.Function1 r39, androidx.compose.ui.Modifier r40, boolean r41, boolean r42, androidx.compose.runtime.Composer r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.money.views.MoneyTabToolbarKt.MoneyTabToolbar(app.cash.broadway.ui.compose.UiScope, com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel, java.lang.String, com.squareup.protos.franklin.cards.CardTheme$Identifier, com.squareup.cash.money.views.ToolbarNestedScrollExpander, com.squareup.cash.money.views.CardNestedScrollExpander, com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
