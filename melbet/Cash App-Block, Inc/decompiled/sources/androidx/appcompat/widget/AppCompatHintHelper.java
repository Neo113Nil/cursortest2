package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.limits.viewmodels.LimitsViewModel;
import com.squareup.cash.limits.views.arcade.FlatLimitsViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.limits.views.arcade.FlatLimitsViewKt$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class AppCompatHintHelper {
    public static final void GroupedLimitsContent(LimitsViewModel limitsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        limitsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-117415090);
        int i2 = (gapComposer.changedInstance(limitsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1464361373, new FlatLimitsViewKt$$ExternalSyntheticLambda0(function1, limitsViewModel, i3), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FlatLimitsViewKt$$ExternalSyntheticLambda1(limitsViewModel, function1, modifier2, i, 1);
        }
    }

    public static boolean isHorizontalRule(int i, CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length();
        Character ch = null;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (ch == null) {
                    if (charAt != '*' && charAt != '-' && charAt != '_') {
                        if (i2 >= 3 || charAt != ' ') {
                            break;
                        }
                        i2++;
                    } else {
                        ch = Character.valueOf(charAt);
                    }
                    i++;
                } else {
                    if (charAt != ch.charValue()) {
                        if (charAt != ' ' && charAt != '\t') {
                            break;
                        }
                    } else {
                        i3++;
                    }
                    i++;
                }
            } else if (i3 >= 3) {
                return true;
            }
        }
        return false;
    }

    public static void onCreateInputConnection(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }
}
