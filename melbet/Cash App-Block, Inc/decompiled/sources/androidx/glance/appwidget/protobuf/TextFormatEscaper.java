package androidx.glance.appwidget.protobuf;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeBalanceWidgetViewModel;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class TextFormatEscaper {
    public static final void StablecoinBalanceWidget(StablecoinHomeBalanceWidgetViewModel stablecoinHomeBalanceWidgetViewModel, Modifier modifier, Composer composer, int i) {
        stablecoinHomeBalanceWidgetViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1887458759);
        int i2 = (gapComposer.changedInstance(stablecoinHomeBalanceWidgetViewModel) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1755619524, new SheetKt$$ExternalSyntheticLambda6(stablecoinHomeBalanceWidgetViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActionPillKt$$ExternalSyntheticLambda1(stablecoinHomeBalanceWidgetViewModel, modifier, i, 8);
        }
    }

    public static String escapeBytes(ByteString$LiteralByteString byteString$LiteralByteString) {
        StringBuilder sb = new StringBuilder(byteString$LiteralByteString.size());
        for (int i = 0; i < byteString$LiteralByteString.size(); i++) {
            byte byteAt = byteString$LiteralByteString.byteAt(i);
            if (byteAt == 34) {
                sb.append("\\\"");
            } else if (byteAt == 39) {
                sb.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (byteAt < 32 || byteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb.append((char) ((byteAt & 7) + 48));
                            break;
                        } else {
                            sb.append((char) byteAt);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.SwitchToPrincipalAccount.deepLinkSpecs;
    }
}
