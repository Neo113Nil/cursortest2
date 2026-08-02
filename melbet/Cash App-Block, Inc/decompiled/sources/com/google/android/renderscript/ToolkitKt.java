package com.google.android.renderscript;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.EditText;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.cash.R;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class ToolkitKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void SingleThreadMoleculeEffect(String str, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        String str2;
        Function1 function12;
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-581940328);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Unit unit = Unit.INSTANCE;
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                str2 = str;
                function12 = function1;
                composableLambdaImpl2 = composableLambdaImpl;
                AnimationsKt$takeUntil$1$1.AnonymousClass1 anonymousClass1 = new AnimationsKt$takeUntil$1$1.AnonymousClass1(function12, str2, composableLambdaImpl2, null, 23);
                gapComposer.updateRememberedValue(anonymousClass1);
                rememberedValue = anonymousClass1;
            } else {
                str2 = str;
                function12 = function1;
                composableLambdaImpl2 = composableLambdaImpl;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            str2 = str;
            function12 = function1;
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18((Object) str2, function12, (Object) composableLambdaImpl2, i, 2);
        }
    }

    public static String getConfirmationCode(View view) {
        view.getClass();
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.first);
        TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(R.id.second);
        TextInputLayout textInputLayout3 = (TextInputLayout) view.findViewById(R.id.third);
        TextInputLayout textInputLayout4 = (TextInputLayout) view.findViewById(R.id.fourth);
        EditText editText = textInputLayout.editText;
        String valueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = textInputLayout2.editText;
        String valueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
        EditText editText3 = textInputLayout3.editText;
        String valueOf3 = String.valueOf(editText3 != null ? editText3.getText() : null);
        EditText editText4 = textInputLayout4.editText;
        return CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{valueOf, valueOf2, valueOf3, String.valueOf(editText4 != null ? editText4.getText() : null)}), "", null, null, 0, null, null, 62);
    }

    public static final int vectorSize(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        int i = config == null ? -1 : WhenMappings.$EnumSwitchMapping$0[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        a$$ExternalSyntheticBUOutline0.m$3("RenderScript Toolkit. Only ARGB_8888 and ALPHA_8 Bitmap are supported.");
        return 0;
    }
}
