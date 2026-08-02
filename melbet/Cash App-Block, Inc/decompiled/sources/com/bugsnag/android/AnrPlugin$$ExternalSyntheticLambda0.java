package com.bugsnag.android;

/* loaded from: classes.dex */
public final /* synthetic */ class AnrPlugin$$ExternalSyntheticLambda0 implements OnErrorCallback {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AnrPlugin$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.bugsnag.android.OnErrorCallback
    public final boolean onError(Event event) {
        boolean performOneTimeSetup$lambda$1;
        boolean performOneTimeSetup$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                performOneTimeSetup$lambda$1 = AnrPlugin.performOneTimeSetup$lambda$1(event);
                return performOneTimeSetup$lambda$1;
            default:
                performOneTimeSetup$lambda$0 = NdkPlugin.performOneTimeSetup$lambda$0(event);
                return performOneTimeSetup$lambda$0;
        }
    }
}
