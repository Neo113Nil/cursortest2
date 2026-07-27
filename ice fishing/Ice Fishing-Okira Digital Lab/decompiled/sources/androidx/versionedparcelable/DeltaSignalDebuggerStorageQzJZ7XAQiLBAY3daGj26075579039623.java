package androidx.versionedparcelable;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class DeltaSignalDebuggerStorageQzJZ7XAQiLBAY3daGj26075579039623 extends YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310 {
    @Override // androidx.versionedparcelable.YellowLoopObserverMacroJFTEe2n8YRXorwgZDZ47084730441310
    public final Signature[] TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
