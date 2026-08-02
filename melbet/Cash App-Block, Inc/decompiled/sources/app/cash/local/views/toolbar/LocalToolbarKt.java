package app.cash.local.views.toolbar;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.local.viewmodels.ToolbarModel;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LocalToolbarKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* renamed from: LocalToolbar-flo8M7A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1333LocalToolbarflo8M7A(Modifier modifier, ToolbarModel toolbarModel, NavigationType navigationType, Function0 function0, float f, Function3 function3, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        int i4;
        NavigationType navigationType2;
        float f3;
        Function3 function32;
        RecomposeScopeImpl endRestartGroup;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1077373956);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(toolbarModel) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(navigationType == null ? -1 : navigationType.ordinal()) ? 256 : 128;
        }
        int i7 = i3 | 3072;
        if ((i & 24576) == 0) {
            i7 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i7 |= 196608;
        } else if ((196608 & i) == 0) {
            f2 = f;
            i7 |= gapComposer.changed(f2) ? PKIFailureInfo.unsupportedVersion : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i7 |= 1572864;
            } else if ((1572864 & i) == 0) {
                i7 |= gapComposer.changedInstance(function3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                if (gapComposer.shouldExecute(i7 & 1, (599187 & i7) != 599186)) {
                    Modifier modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    NavigationType navigationType3 = i6 != 0 ? NavigationType.BACK : navigationType;
                    float f4 = i8 != 0 ? 1.0f : f2;
                    Function3 function33 = i4 != 0 ? null : function3;
                    modifier2 = modifier3;
                    DBUtil.TitleBarSub(Expect_jvmKt.rememberComposableLambda(-223220918, new LocalToolbarKt$$ExternalSyntheticLambda0(f4, toolbarModel), gapComposer), navigationType3, SpacerKt.m302paddingqDBjuR0$default(modifier3, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (DynamicColorConfiguration) null, function0, (Modifier) null, function33, gapComposer, ((i7 >> 3) & 112) | 6 | (57344 & i7) | (i7 & 3670016), 40);
                    f3 = f4;
                    navigationType2 = navigationType3;
                    function32 = function33;
                } else {
                    gapComposer.skipToGroupEnd();
                    navigationType2 = navigationType;
                    f3 = f2;
                    function32 = function3;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new LocalToolbarKt$$ExternalSyntheticLambda1(modifier2, toolbarModel, navigationType2, function0, f3, function32, i, i2, 0);
                    return;
                }
                return;
            }
            if (gapComposer.shouldExecute(i7 & 1, (599187 & i7) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if (gapComposer.shouldExecute(i7 & 1, (599187 & i7) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentStock.deepLinkSpecs;
    }
}
