package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.account.components.AccountToDoKt$$ExternalSyntheticLambda11;
import com.squareup.cash.account.components.AccountToDoKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class PendingIntentCompat {
    /* renamed from: PromotionItem-nBX6wN0, reason: not valid java name */
    public static final void m1088PromotionItemnBX6wN0(int i, int i2, long j, long j2, Composer composer, Modifier modifier, Icons icons, String str, String str2, Function0 function0) {
        Modifier modifier2;
        int i3;
        String str3;
        int i4;
        GapComposer gapComposer;
        Modifier modifier3;
        String str4;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1943572097);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i | (gapComposer2.changed(modifier2) ? 4 : 2);
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(icons.ordinal()) ? 32 : 16;
        }
        int i6 = i3 | (gapComposer2.changed(str) ? 256 : 128);
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
            str3 = str2;
        } else {
            str3 = str2;
            i4 = i6 | (gapComposer2.changed(str3) ? 2048 : 1024);
        }
        int i8 = i4 | (gapComposer2.changed(j) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(j2) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer2.shouldExecute(i8 & 1, (599187 & i8) != 599186)) {
            modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            ComposableLambdaImpl composableLambdaImpl = null;
            String str5 = i7 != 0 ? null : str3;
            if (str5 == null) {
                gapComposer2.startReplaceGroup(-501655872);
            } else {
                gapComposer2.startReplaceGroup(-501655871);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(49643139, new InfoSectionKt$$ExternalSyntheticLambda7(str5, 11), gapComposer2);
            }
            gapComposer2.end(false);
            gapComposer = gapComposer2;
            Modifier modifier4 = modifier3;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1423203233, new AccountToDoKt$$ExternalSyntheticLambda8(1, j2, j, icons), gapComposer2), Expect_jvmKt.rememberComposableLambda(-1864841374, new InfoSectionKt$$ExternalSyntheticLambda7(str, 12), gapComposer2), modifier4, function0, null, false, true, composableLambdaImpl, null, CellDefaultAccessory.Push.INSTANCE, 0L, null, gapComposer, ((i8 << 6) & 896) | 806879286 | ((i8 >> 9) & 7168), 0, 3376);
            str4 = str5;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
            str4 = str3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AccountToDoKt$$ExternalSyntheticLambda11(modifier3, icons, str, str4, j, j2, function0, i, i2);
        }
    }

    public static PendingIntent getActivity(Context context, Intent intent) {
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewGroupExpense.deepLinkSpecs;
    }
}
