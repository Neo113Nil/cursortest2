package com.anythink.core.activity;

import android.app.Activity;
import android.os.Bundle;
import com.anythink.core.activity.component.PrivacyPolicyView;
import com.anythink.core.api.ATGDPRAuthCallback;
import com.anythink.core.common.i;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class AnyThinkGdprAuthActivity extends Activity {
    public static ATGDPRAuthCallback mCallback;

    /* renamed from: a, reason: collision with root package name */
    String f12374a;

    /* renamed from: b, reason: collision with root package name */
    PrivacyPolicyView f12375b;

    /* renamed from: c, reason: collision with root package name */
    boolean f12376c = false;

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f12376c) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i.a();
        this.f12374a = i.j();
        if (getResources().getConfiguration().orientation == 2) {
            q.a((Activity) this, 6);
        } else {
            q.a((Activity) this, 7);
        }
        try {
            PrivacyPolicyView privacyPolicyView = new PrivacyPolicyView(this);
            this.f12375b = privacyPolicyView;
            privacyPolicyView.setResultCallbackListener(new PrivacyPolicyView.a() { // from class: com.anythink.core.activity.AnyThinkGdprAuthActivity.1
                @Override // com.anythink.core.activity.component.PrivacyPolicyView.a
                public final void onLevelSelect(int i) {
                    ATGDPRAuthCallback aTGDPRAuthCallback = AnyThinkGdprAuthActivity.mCallback;
                    if (aTGDPRAuthCallback != null) {
                        aTGDPRAuthCallback.onAuthResult(i);
                        AnyThinkGdprAuthActivity.mCallback = null;
                    }
                    AnyThinkGdprAuthActivity.this.finish();
                }

                @Override // com.anythink.core.activity.component.PrivacyPolicyView.a
                public final void onPageLoadFail() {
                    AnyThinkGdprAuthActivity.this.f12376c = true;
                    ATGDPRAuthCallback aTGDPRAuthCallback = AnyThinkGdprAuthActivity.mCallback;
                    if (aTGDPRAuthCallback != null) {
                        aTGDPRAuthCallback.onPageLoadFail();
                    }
                }

                @Override // com.anythink.core.activity.component.PrivacyPolicyView.a
                public final void onPageLoadSuccess() {
                    AnyThinkGdprAuthActivity.this.f12376c = false;
                }
            });
            setContentView(this.f12375b);
            this.f12375b.loadPolicyUrl(this.f12374a);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        PrivacyPolicyView privacyPolicyView = this.f12375b;
        if (privacyPolicyView != null) {
            privacyPolicyView.destory();
        }
        mCallback = null;
        super.onDestroy();
    }
}
