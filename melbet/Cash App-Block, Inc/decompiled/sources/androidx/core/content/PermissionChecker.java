package androidx.core.content;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda3;
import com.squareup.protos.franklin.api.Region;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class PermissionChecker {
    public static final void NoResults(Region region, String str, String str2, Composer composer, int i, int i2) {
        int i3;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-813224737);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(region == null ? -1 : region.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (gapComposer.changed(str) ? 32 : 16);
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changed(str2) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                str = null;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1031437590, new RetroUiFactory$$ExternalSyntheticLambda3(13, str, str2, region), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        String str3 = str;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9(region, str3, str2, i, i2, 20);
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, context.getOpPackageName()) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewLoyaltyProgram.deepLinkSpecs;
    }
}
