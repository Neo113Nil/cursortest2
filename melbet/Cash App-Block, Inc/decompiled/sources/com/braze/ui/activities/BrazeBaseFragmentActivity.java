package com.braze.ui.activities;

import androidx.fragment.app.FragmentActivity;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/braze/ui/activities/BrazeBaseFragmentActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "onStart", "", "onResume", "onPause", "onStop", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BrazeBaseFragmentActivity extends FragmentActivity {
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        BrazeInAppMessageManager.INSTANCE.getInstance().registerInAppMessageManager(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
            getWindow().setFlags(PKIFailureInfo.certRevoked, PKIFailureInfo.certRevoked);
        }
        Braze.INSTANCE.getInstance(this).openSession(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        Braze.INSTANCE.getInstance(this).closeSession(this);
    }
}
